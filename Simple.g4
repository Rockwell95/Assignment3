grammar Simple;

@header{
	import java.util.TreeMap;
	import java.io.*;
}

@parser::members{
	private String projectName;

 	public SimpleParser(String fileName) throws java.io.IOException {
	    super(new CommonTokenStream(new SimpleLexer(new ANTLRFileStream(fileName))));
	    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	    projectName = fileName.substring(fileName.lastIndexOf("/") + 1, fileName.lastIndexOf('.'));
	}

  	public String getProjectName() {
    return projectName;
  	}

	public static int varNumber = 0;
	public static int loop_counter = 0;
	public static TreeMap<String, Integer> varID = new TreeMap<String, Integer>();
}

start : {System.out.println(".class public " + this.getProjectName() + "\n.super java/lang/Object"
	+ "\n\n.method public <init>()V\n\taload_0\n\tinvokenonvirtual java/lang/Object/<init>()V\n\treturn\n.end method"
	+ "\n.method public static main([Ljava/lang/String;)V\n\t.limit stack 50\n\t.limit locals 10\n\n");}
	( prog {System.out.println($prog.sProg);} )+ EOF {System.out.println("\n\treturn\n\n.end method");} EOF;

prog returns [String sProg]
	: block
	{
			$sProg = $block.sBlock;
	}
	;

expr returns [String sExpr]
  	: '('? term ')'? '+' NUM
  	{
  		$sExpr = $term.sTerm + "\n\tldc " + $NUM.getText() + "\n\tiadd\n";
  	}
	| '('? t1 = term ')'? '+' t2=term
	{
		$sExpr = $t1.sTerm + "\n\t" + $t2.sTerm + "\n\tiadd\n";
	}
	| '('? term ')'? '+' m2=expr
	{
		$sExpr = $term.sTerm + "\n\t" + varID.get($m2.sExpr) + "\n\tiadd\n";
	}
	| '('? term ')'? '-' NUM
	{
		$sExpr = $term.sTerm + "\n\t" + $NUM.getText() + "\n\tisub\n";
	}
	| '('? t1 = term ')'? '-' t2=term
	{
		$sExpr = $t1.sTerm + "\n\t" + $t2.sTerm + "\n\tisub\n";
	}
	| '('? term ')'? '-' m4=expr
	{
		$sExpr = $term.sTerm + "\n\t" + varID.get($m4.sExpr) + "\n\tisub\n";
	}
	| '('? NUM ')'?
	{
		$sExpr = "ldc " + $NUM.getText();
	}
	| '('? term ')'?
	{
		$sExpr = $term.sTerm;
	}
	;

repeatStmt returns [String sRpt]
    : 'repeat' expr '{' block '}'
    {
    	$sRpt = "\n\n\tiload 0\n\tistore " + varNumber + "\n\t "+ $expr.sExpr + "\n\tistore " + (varNumber+1) + "\n\n\tloop_" + loop_counter + ":\n" +
    	$block.sBlock + "\n\tiinc " + varNumber + " 1\n\tiload " + varNumber + "\n\tiload " + (varNumber+1) + "\n\tif_icmplt loop_" + loop_counter;
    	loop_counter++;
    	varNumber += 2;
    }
    ;

block returns [String sBlock]
    : {$sBlock = "";}(stmt {$sBlock += $stmt.sStmt + "\n";})+
    ;

stmt returns [String sStmt]
    : printStmt
		{
			$sStmt = $printStmt.sPrintStmt;
		}
    | assignStmt
		{
			$sStmt = $assignStmt.sAssign;
		}
    | repeatStmt
		{
			$sStmt = $repeatStmt.sRpt;
		}
    ;

printStmt returns [String sPrintStmt]
    : 'print' '(' exprList ')'
		{
			String[] sExprs = $exprList.sExprList.split(",");
			$sPrintStmt = "";
			for(String ex : sExprs){
				$sPrintStmt += "\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n\n\t " + ex + "\n\tinvokevirtual java/io/PrintStream/print(I)V\n\t"
				+ "getstatic java/lang/System/out Ljava/io/PrintStream;\n\tldc " + "\" \"" + "\n\tinvokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n\n";
			}
			$sPrintStmt += "\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n\tldc " + "\"\"" + "\n\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n\n";

		}
    ;

exprList returns [String sExprList]
    : {$sExprList = "";} (expr ',' { $sExprList += $expr.sExpr + ","; })* expr { $sExprList += $expr.sExpr + ","; }
    ;

assignStmt returns [String sAssign]
    : 'let' ID '=' NUM
    {
    	int v = varNumber;

    	if(varID.get($ID.getText())!= null){
    		v = varID.get($ID.getText());
    	}
    	else{
    		varID.put($ID.getText(), varNumber);
    		varNumber++;
    	}
    	$sAssign = "\tldc " + $NUM.getText() + "\n\tistore " + v + "\n";
    }
    | 'let' ID '=' expr
    {
    	int v = varNumber;

    	if(varID.get($ID.getText())!= null){
    		v = varID.get($ID.getText());
    	}
    	else{
    		varID.put($ID.getText(), varNumber);
    		varNumber++;
    	}
    	$sAssign = "\t" + $expr.sExpr + "\n\tistore " + v + "\n";
    }
    ;

 term returns [String sTerm]
	: NUM '*' factor
	{
	 $sTerm = "ldc " + $NUM.getText() + "\n\tiload " + varID.get($factor.sFactor) + "\n\timul\n";
	}
	| factor '*' NUM
	{
		$sTerm = "iload " + varID.get($factor.sFactor) + "\n\tldc " + $NUM.getText() + "\n\timul\n";
	}
	| f1 = factor '*' f2=factor
	{
		$sTerm = "iload " + varID.get($f1.sFactor) + "\n\tiload " + varID.get($f2.sFactor) + "\n\timul\n";
	}
	| factor '*' t1=term
	{
		$sTerm = "iload " + varID.get($factor.sFactor) + "\n\tiload " + varID.get($t1.sTerm) + "\n\timul\n";
	}
	| NUM '/' factor
	{
		$sTerm = "ldc " + $NUM.getText() + "\n\tiload " + varID.get($factor.sFactor) + "\n\tidiv\n";
	}
	| factor '/' NUM
	{
		$sTerm = "iload " + varID.get($factor.sFactor) + "\n\tldc " + $NUM.getText() + "\n\tidiv\n";
	}
	| f3 = factor '/' f4 = factor
	{
		$sTerm = "iload " + varID.get($f3.sFactor) + "\n\tiload " + varID.get($f4.sFactor) + "\n\tidiv\n";
	}
	| factor '/' t2=term
	{
		$sTerm = "iload " + varID.get($factor.sFactor) + "\n\tiload " + varID.get($t2.sTerm) + "\n\tidiv\n";
	}
	| factor
	{
		$sTerm = "iload " + varID.get($factor.sFactor) + "";
	}
	;

factor returns [String sFactor]
	: ID
	{
		$sFactor = $ID.getText();
	}
	| NUM
	{
		$sFactor = "" + $NUM.getText();
	}
	;

/* Terminals */
NUM : ('0' .. '9')+ ;
ID : ('a' .. 'z' | 'A' .. 'Z')+ ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-')* ;
WS : (' ' | '\t' | '\r' | '\n') {skip();} ;
