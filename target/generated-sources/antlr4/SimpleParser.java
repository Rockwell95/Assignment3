// Generated from Simple.g4 by ANTLR 4.4

	import java.util.TreeMap;
	import java.io.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, NUM=14, ID=15, WS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'{'", "'='", "'}'", "'let'", "'print'", "'('", "')'", 
		"'*'", "'+'", "','", "'repeat'", "'-'", "NUM", "ID", "WS"
	};
	public static final int
		RULE_start = 0, RULE_prog = 1, RULE_expr = 2, RULE_repeatStmt = 3, RULE_block = 4, 
		RULE_stmt = 5, RULE_printStmt = 6, RULE_exprList = 7, RULE_assignStmt = 8, 
		RULE_term = 9, RULE_factor = 10;
	public static final String[] ruleNames = {
		"start", "prog", "expr", "repeatStmt", "block", "stmt", "printStmt", "exprList", 
		"assignStmt", "term", "factor"
	};

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private String projectName;

	 	public SimpleParser(String fileName) throws java.io.IOException {
		    super(new CommonTokenStream(new SimpleLexer(new ANTLRFileStream(fileName))));
		    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
		    projectName = fileName;
		}
	  
	  	public String getProjectName() {
	    return projectName;
	  	}
		
		public static int varNumber = 0;
		public static int loop_counter = 0;
		public static TreeMap<String, Integer> varID = new TreeMap<String, Integer>();

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgContext prog;
		public TerminalNode EOF(int i) {
			return getToken(SimpleParser.EOF, i);
		}
		public List<TerminalNode> EOF() { return getTokens(SimpleParser.EOF); }
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
		}
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println(".class public " + this.getProjectName() + "\n.super java/lang/Object"
				+ "\n\n.method public <init>()V\n\taload_0\n\tinvokenonvirtual java/lang/Object/<init>()V\n\treturn\n.end method"
				+ "\n.method public static main([Ljava/lang/String;)V\n\t.limit stack 50\n\t.limit locals 10\n\n");
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23); ((StartContext)_localctx).prog = prog();
				System.out.println(((StartContext)_localctx).prog.sProg);
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__1))) != 0) );
			setState(30); match(EOF);
			System.out.println("\n\treturn\n\n.end method");
			setState(32); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgContext extends ParserRuleContext {
		public String sProg;
		public BlockContext block;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); ((ProgContext)_localctx).block = block();

						((ProgContext)_localctx).sProg =  ((ProgContext)_localctx).block.sBlock;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public String sExpr;
		public TermContext term;
		public Token NUM;
		public TermContext t1;
		public TermContext t2;
		public ExprContext m2;
		public ExprContext m4;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); ((ExprContext)_localctx).term = term();
				setState(38); match(T__3);
				setState(39); ((ExprContext)_localctx).NUM = match(NUM);

				  		((ExprContext)_localctx).sExpr =  "iload " + ((ExprContext)_localctx).term.sTerm + "\n\tldc " + ((ExprContext)_localctx).NUM.getText() + "\n\tiadd\n";
				  	
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); ((ExprContext)_localctx).t1 = term();
				setState(43); match(T__3);
				setState(44); ((ExprContext)_localctx).t2 = term();

						((ExprContext)_localctx).sExpr =  "iload " + ((ExprContext)_localctx).t1.sTerm + "\n\tiload " + ((ExprContext)_localctx).t2.sTerm + "\n\tiadd\n";
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47); ((ExprContext)_localctx).term = term();
				setState(48); match(T__3);
				setState(49); ((ExprContext)_localctx).m2 = expr();

						((ExprContext)_localctx).sExpr =  "iload " + ((ExprContext)_localctx).term.sTerm + "\n\tiload " + varID.get(((ExprContext)_localctx).m2.sExpr) + "\n\tiadd\n";
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52); ((ExprContext)_localctx).term = term();
				setState(53); match(T__0);
				setState(54); ((ExprContext)_localctx).NUM = match(NUM);

						((ExprContext)_localctx).sExpr =  "iload " + ((ExprContext)_localctx).term.sTerm + "\n\tldc " + ((ExprContext)_localctx).NUM.getText() + "\n\tisub\n";
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57); ((ExprContext)_localctx).t1 = term();
				setState(58); match(T__0);
				setState(59); ((ExprContext)_localctx).t2 = term();

						((ExprContext)_localctx).sExpr =  "iload " + ((ExprContext)_localctx).t1.sTerm + "\n\tiload " + ((ExprContext)_localctx).t2.sTerm + "\n\tisub\n";
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62); ((ExprContext)_localctx).term = term();
				setState(63); match(T__0);
				setState(64); ((ExprContext)_localctx).m4 = expr();

						((ExprContext)_localctx).sExpr =  "iload " + ((ExprContext)_localctx).term.sTerm + "\n\tiload " + varID.get(((ExprContext)_localctx).m4.sExpr) + "\n\tisub\n";
					
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67); ((ExprContext)_localctx).NUM = match(NUM);

						((ExprContext)_localctx).sExpr =  "ldc " + ((ExprContext)_localctx).NUM.getText();
					
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69); ((ExprContext)_localctx).term = term();

						((ExprContext)_localctx).sExpr =  "iload " + ((ExprContext)_localctx).term.sTerm;
					
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatStmtContext extends ParserRuleContext {
		public String sRpt;
		public ExprContext expr;
		public BlockContext block;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RepeatStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterRepeatStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitRepeatStmt(this);
		}
	}

	public final RepeatStmtContext repeatStmt() throws RecognitionException {
		RepeatStmtContext _localctx = new RepeatStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_repeatStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(T__1);
			setState(75); ((RepeatStmtContext)_localctx).expr = expr();
			setState(76); match(T__11);
			setState(77); ((RepeatStmtContext)_localctx).block = block();
			setState(78); match(T__9);

			    	((RepeatStmtContext)_localctx).sRpt =  "\n\n\tiload 0\n\tistore " + varNumber + "\n\t "+ ((RepeatStmtContext)_localctx).expr.sExpr + "\n\tistore " + (varNumber+1) + "\n\n\tloop_" + loop_counter + ":\n" + 
			    	((RepeatStmtContext)_localctx).block.sBlock + "\n\tiinc " + varNumber + " 1\n\tiload " + varNumber + "\n\tiload " + (varNumber+1) + "\n\tif_icmplt loop_" + loop_counter;
			    	loop_counter++;
			    	varNumber += 2;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public String sBlock;
		public StmtContext stmt;
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).sBlock =  "";
			setState(85); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(82); ((BlockContext)_localctx).stmt = stmt();
					_localctx.sBlock += ((BlockContext)_localctx).stmt.sStmt + "\n";
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(87); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public String sStmt;
		public PrintStmtContext printStmt;
		public AssignStmtContext assignStmt;
		public RepeatStmtContext repeatStmt;
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public RepeatStmtContext repeatStmt() {
			return getRuleContext(RepeatStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(98);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(89); ((StmtContext)_localctx).printStmt = printStmt();

							((StmtContext)_localctx).sStmt =  ((StmtContext)_localctx).printStmt.sPrintStmt;
						
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(92); ((StmtContext)_localctx).assignStmt = assignStmt();

							((StmtContext)_localctx).sStmt =  ((StmtContext)_localctx).assignStmt.sAssign;
						
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(95); ((StmtContext)_localctx).repeatStmt = repeatStmt();

							((StmtContext)_localctx).sStmt =  ((StmtContext)_localctx).repeatStmt.sRpt;
						
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public String sPrintStmt;
		public ExprListContext exprList;
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPrintStmt(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(T__7);
			setState(101); match(T__6);
			setState(102); ((PrintStmtContext)_localctx).exprList = exprList();
			setState(103); match(T__5);

						String[] sExprs = ((PrintStmtContext)_localctx).exprList.sExprList.split(",");
						((PrintStmtContext)_localctx).sPrintStmt =  "";
						for(String ex : sExprs){
							_localctx.sPrintStmt += "\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n\n\t " + ex + "\n\tinvokevirtual java/io/PrintStream/print(I)V\n\t"
							+ "getstatic java/lang/System/out Ljava/io/PrintStream;\n\tldc " + "\" \"" + "\n\tinvokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n\n";
						}
						_localctx.sPrintStmt += "\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n\tldc " + "\"\"" + "\n\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n\n";

					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public String sExprList;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ExprListContext)_localctx).sExprList =  "";
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107); ((ExprListContext)_localctx).expr = expr();
					setState(108); match(T__2);
					 _localctx.sExprList += ((ExprListContext)_localctx).expr.sExpr + ","; 
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(116); ((ExprListContext)_localctx).expr = expr();
			 _localctx.sExprList += ((ExprListContext)_localctx).expr.sExpr + ","; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStmtContext extends ParserRuleContext {
		public String sAssign;
		public Token ID;
		public Token NUM;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitAssignStmt(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignStmt);
		try {
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); match(T__8);
				setState(120); ((AssignStmtContext)_localctx).ID = match(ID);
				setState(121); match(T__10);
				setState(122); ((AssignStmtContext)_localctx).NUM = match(NUM);

				    	int v = varNumber;
				    	
				    	if(varID.get(((AssignStmtContext)_localctx).ID.getText())!= null){
				    		v = varID.get(((AssignStmtContext)_localctx).ID.getText());
				    	}
				    	else{
				    		varID.put(((AssignStmtContext)_localctx).ID.getText(), varNumber);
				    		varNumber++;
				    	}
				    	((AssignStmtContext)_localctx).sAssign =  "\tldc " + ((AssignStmtContext)_localctx).NUM.getText() + "\n\tistore " + v + "\n";
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); match(T__8);
				setState(125); ((AssignStmtContext)_localctx).ID = match(ID);
				setState(126); match(T__10);
				setState(127); ((AssignStmtContext)_localctx).expr = expr();

				    	int v = varNumber;
				    	
				    	if(varID.get(((AssignStmtContext)_localctx).ID.getText())!= null){
				    		v = varID.get(((AssignStmtContext)_localctx).ID.getText());
				    	}
				    	else{
				    		varID.put(((AssignStmtContext)_localctx).ID.getText(), varNumber);
				    		varNumber++;
				    	}
				    	((AssignStmtContext)_localctx).sAssign =  "\t" + ((AssignStmtContext)_localctx).expr.sExpr + "\n\tistore " + v + "\n";
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public String sTerm;
		public FactorContext factor;
		public Token NUM;
		public TermContext t1;
		public TermContext t2;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); ((TermContext)_localctx).factor = factor();
				setState(133); match(T__4);
				setState(134); ((TermContext)_localctx).NUM = match(NUM);

						((TermContext)_localctx).sTerm =  varID.get(((TermContext)_localctx).factor.sFactor) + "\n\tldc " + ((TermContext)_localctx).NUM.getText() + "\n\timul\n";
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); ((TermContext)_localctx).factor = factor();
				setState(138); match(T__4);
				setState(139); ((TermContext)_localctx).t1 = term();

						((TermContext)_localctx).sTerm =  varID.get(((TermContext)_localctx).factor.sFactor) + "\n\tiload " + varID.get(((TermContext)_localctx).t1.sTerm) + "\n\timul\n";
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142); ((TermContext)_localctx).factor = factor();
				setState(143); match(T__12);
				setState(144); ((TermContext)_localctx).NUM = match(NUM);

						((TermContext)_localctx).sTerm =  varID.get(((TermContext)_localctx).factor.sFactor) + "\n\tldc " + ((TermContext)_localctx).NUM.getText() + "\n\tidiv\n";
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147); ((TermContext)_localctx).factor = factor();
				setState(148); match(T__12);
				setState(149); ((TermContext)_localctx).t2 = term();

						((TermContext)_localctx).sTerm =  varID.get(((TermContext)_localctx).factor.sFactor) + "\n\tiload " + varID.get(((TermContext)_localctx).t2.sTerm) + "\n\tidiv\n";
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152); ((TermContext)_localctx).factor = factor();

						((TermContext)_localctx).sTerm =  varID.get(((TermContext)_localctx).factor.sFactor) + "";
					
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public String sFactor;
		public Token ID;
		public Token NUM;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		try {
			setState(161);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); ((FactorContext)_localctx).ID = match(ID);

						((FactorContext)_localctx).sFactor =  ((FactorContext)_localctx).ID.getText();
					
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(159); ((FactorContext)_localctx).NUM = match(NUM);

						((FactorContext)_localctx).sFactor =  "" + ((FactorContext)_localctx).NUM.getText();
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22\u00a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\6\6X\n"+
		"\6\r\6\16\6Y\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7e\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tr\n\t\f\t\16\tu\13\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0085\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009e\n\13\3\f\3\f\3\f\3\f\5\f\u00a4"+
		"\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\u00ac\2\30\3\2\2\2\4$\3"+
		"\2\2\2\6J\3\2\2\2\bL\3\2\2\2\nS\3\2\2\2\fd\3\2\2\2\16f\3\2\2\2\20l\3\2"+
		"\2\2\22\u0084\3\2\2\2\24\u009d\3\2\2\2\26\u00a3\3\2\2\2\30\34\b\2\1\2"+
		"\31\32\5\4\3\2\32\33\b\2\1\2\33\35\3\2\2\2\34\31\3\2\2\2\35\36\3\2\2\2"+
		"\36\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\7\2\2\3!\"\b\2\1\2\"#\7\2\2"+
		"\3#\3\3\2\2\2$%\5\n\6\2%&\b\3\1\2&\5\3\2\2\2\'(\5\24\13\2()\7\f\2\2)*"+
		"\7\20\2\2*+\b\4\1\2+K\3\2\2\2,-\5\24\13\2-.\7\f\2\2./\5\24\13\2/\60\b"+
		"\4\1\2\60K\3\2\2\2\61\62\5\24\13\2\62\63\7\f\2\2\63\64\5\6\4\2\64\65\b"+
		"\4\1\2\65K\3\2\2\2\66\67\5\24\13\2\678\7\17\2\289\7\20\2\29:\b\4\1\2:"+
		"K\3\2\2\2;<\5\24\13\2<=\7\17\2\2=>\5\24\13\2>?\b\4\1\2?K\3\2\2\2@A\5\24"+
		"\13\2AB\7\17\2\2BC\5\6\4\2CD\b\4\1\2DK\3\2\2\2EF\7\20\2\2FK\b\4\1\2GH"+
		"\5\24\13\2HI\b\4\1\2IK\3\2\2\2J\'\3\2\2\2J,\3\2\2\2J\61\3\2\2\2J\66\3"+
		"\2\2\2J;\3\2\2\2J@\3\2\2\2JE\3\2\2\2JG\3\2\2\2K\7\3\2\2\2LM\7\16\2\2M"+
		"N\5\6\4\2NO\7\4\2\2OP\5\n\6\2PQ\7\6\2\2QR\b\5\1\2R\t\3\2\2\2SW\b\6\1\2"+
		"TU\5\f\7\2UV\b\6\1\2VX\3\2\2\2WT\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2"+
		"Z\13\3\2\2\2[\\\5\16\b\2\\]\b\7\1\2]e\3\2\2\2^_\5\22\n\2_`\b\7\1\2`e\3"+
		"\2\2\2ab\5\b\5\2bc\b\7\1\2ce\3\2\2\2d[\3\2\2\2d^\3\2\2\2da\3\2\2\2e\r"+
		"\3\2\2\2fg\7\b\2\2gh\7\t\2\2hi\5\20\t\2ij\7\n\2\2jk\b\b\1\2k\17\3\2\2"+
		"\2ls\b\t\1\2mn\5\6\4\2no\7\r\2\2op\b\t\1\2pr\3\2\2\2qm\3\2\2\2ru\3\2\2"+
		"\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\5\6\4\2wx\b\t\1\2x\21\3\2"+
		"\2\2yz\7\7\2\2z{\7\21\2\2{|\7\5\2\2|}\7\20\2\2}\u0085\b\n\1\2~\177\7\7"+
		"\2\2\177\u0080\7\21\2\2\u0080\u0081\7\5\2\2\u0081\u0082\5\6\4\2\u0082"+
		"\u0083\b\n\1\2\u0083\u0085\3\2\2\2\u0084y\3\2\2\2\u0084~\3\2\2\2\u0085"+
		"\23\3\2\2\2\u0086\u0087\5\26\f\2\u0087\u0088\7\13\2\2\u0088\u0089\7\20"+
		"\2\2\u0089\u008a\b\13\1\2\u008a\u009e\3\2\2\2\u008b\u008c\5\26\f\2\u008c"+
		"\u008d\7\13\2\2\u008d\u008e\5\24\13\2\u008e\u008f\b\13\1\2\u008f\u009e"+
		"\3\2\2\2\u0090\u0091\5\26\f\2\u0091\u0092\7\3\2\2\u0092\u0093\7\20\2\2"+
		"\u0093\u0094\b\13\1\2\u0094\u009e\3\2\2\2\u0095\u0096\5\26\f\2\u0096\u0097"+
		"\7\3\2\2\u0097\u0098\5\24\13\2\u0098\u0099\b\13\1\2\u0099\u009e\3\2\2"+
		"\2\u009a\u009b\5\26\f\2\u009b\u009c\b\13\1\2\u009c\u009e\3\2\2\2\u009d"+
		"\u0086\3\2\2\2\u009d\u008b\3\2\2\2\u009d\u0090\3\2\2\2\u009d\u0095\3\2"+
		"\2\2\u009d\u009a\3\2\2\2\u009e\25\3\2\2\2\u009f\u00a0\7\21\2\2\u00a0\u00a4"+
		"\b\f\1\2\u00a1\u00a2\7\20\2\2\u00a2\u00a4\b\f\1\2\u00a3\u009f\3\2\2\2"+
		"\u00a3\u00a1\3\2\2\2\u00a4\27\3\2\2\2\n\36JYds\u0084\u009d\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}