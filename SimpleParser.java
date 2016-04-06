// Generated from Simple.g4 by ANTLR 4.5.2

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
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, NUM=14, ID=15, WS=16;
	public static final int
		RULE_start = 0, RULE_prog = 1, RULE_expr = 2, RULE_repeatStmt = 3, RULE_block = 4, 
		RULE_stmt = 5, RULE_printStmt = 6, RULE_exprList = 7, RULE_assignStmt = 8, 
		RULE_term = 9, RULE_factor = 10;
	public static final String[] ruleNames = {
		"start", "prog", "expr", "repeatStmt", "block", "stmt", "printStmt", "exprList", 
		"assignStmt", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'+'", "'-'", "'repeat'", "'{'", "'}'", "'print'", 
		"','", "'let'", "'='", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "NUM", "ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

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
		    if(fileName.lastIndexOf("/") == -1 && fileName.lastIndexOf('.') == -1){
	                projectName = fileName;
		    }
		    else if(fileName.lastIndexOf("/") == -1 && fileName.lastIndexOf('.') != -1){
	                projectName = fileName.substring(0, fileName.lastIndexOf('.'));
	            }
	      else if(fileName.lastIndexOf("/") != -1 && fileName.lastIndexOf('.') != -1){
	                projectName = fileName.substring(fileName.lastIndexOf("/") + 1);
	            }
		    else{
	                projectName = fileName.substring(fileName.lastIndexOf("/") + 1, fileName.lastIndexOf('.'));
	            }
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
		public List<TerminalNode> EOF() { return getTokens(SimpleParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(SimpleParser.EOF, i);
		}
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
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
				setState(23);
				((StartContext)_localctx).prog = prog();
				System.out.println(((StartContext)_localctx).prog.sProg);
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9))) != 0) );
			setState(30);
			match(EOF);
			System.out.println("\n\treturn\n\n.end method");
			setState(32);
			match(EOF);
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
			setState(34);
			((ProgContext)_localctx).block = block();

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
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(37);
					match(T__0);
					}
				}

				setState(40);
				((ExprContext)_localctx).term = term();
				setState(42);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(41);
					match(T__1);
					}
				}

				setState(44);
				match(T__2);
				setState(45);
				((ExprContext)_localctx).NUM = match(NUM);

				  		((ExprContext)_localctx).sExpr =  ((ExprContext)_localctx).term.sTerm + "\n\tldc " + ((ExprContext)_localctx).NUM.getText() + "\n\tiadd\n";
				  	
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(48);
					match(T__0);
					}
				}

				setState(51);
				((ExprContext)_localctx).t1 = term();
				setState(53);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(52);
					match(T__1);
					}
				}

				setState(55);
				match(T__2);
				setState(56);
				((ExprContext)_localctx).t2 = term();

						((ExprContext)_localctx).sExpr =  ((ExprContext)_localctx).t1.sTerm + "\n\t" + ((ExprContext)_localctx).t2.sTerm + "\n\tiadd\n";
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(59);
					match(T__0);
					}
				}

				setState(62);
				((ExprContext)_localctx).term = term();
				setState(64);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(63);
					match(T__1);
					}
				}

				setState(66);
				match(T__2);
				setState(67);
				((ExprContext)_localctx).m2 = expr();

						((ExprContext)_localctx).sExpr =  ((ExprContext)_localctx).term.sTerm + "\n\t" + varID.get(((ExprContext)_localctx).m2.sExpr) + "\n\tiadd\n";
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(70);
					match(T__0);
					}
				}

				setState(73);
				((ExprContext)_localctx).term = term();
				setState(75);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(74);
					match(T__1);
					}
				}

				setState(77);
				match(T__3);
				setState(78);
				((ExprContext)_localctx).NUM = match(NUM);

						((ExprContext)_localctx).sExpr =  ((ExprContext)_localctx).term.sTerm + "\n\t" + ((ExprContext)_localctx).NUM.getText() + "\n\tisub\n";
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(81);
					match(T__0);
					}
				}

				setState(84);
				((ExprContext)_localctx).t1 = term();
				setState(86);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(85);
					match(T__1);
					}
				}

				setState(88);
				match(T__3);
				setState(89);
				((ExprContext)_localctx).t2 = term();

						((ExprContext)_localctx).sExpr =  ((ExprContext)_localctx).t1.sTerm + "\n\t" + ((ExprContext)_localctx).t2.sTerm + "\n\tisub\n";
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(92);
					match(T__0);
					}
				}

				setState(95);
				((ExprContext)_localctx).term = term();
				setState(97);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(96);
					match(T__1);
					}
				}

				setState(99);
				match(T__3);
				setState(100);
				((ExprContext)_localctx).m4 = expr();

						((ExprContext)_localctx).sExpr =  ((ExprContext)_localctx).term.sTerm + "\n\t" + varID.get(((ExprContext)_localctx).m4.sExpr) + "\n\tisub\n";
					
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(103);
					match(T__0);
					}
				}

				setState(106);
				((ExprContext)_localctx).NUM = match(NUM);
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(107);
					match(T__1);
					}
					break;
				}

						((ExprContext)_localctx).sExpr =  "ldc " + ((ExprContext)_localctx).NUM.getText();
					
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(112);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(111);
					match(T__0);
					}
				}

				setState(114);
				((ExprContext)_localctx).term = term();
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(115);
					match(T__1);
					}
					break;
				}

						((ExprContext)_localctx).sExpr =  ((ExprContext)_localctx).term.sTerm;
					
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
			setState(122);
			match(T__4);
			setState(123);
			((RepeatStmtContext)_localctx).expr = expr();
			setState(124);
			match(T__5);
			setState(125);
			((RepeatStmtContext)_localctx).block = block();
			setState(126);
			match(T__6);

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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
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
			setState(133); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(130);
					((BlockContext)_localctx).stmt = stmt();
					_localctx.sBlock += ((BlockContext)_localctx).stmt.sStmt + "\n";
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public RepeatStmtContext repeatStmt() {
			return getRuleContext(RepeatStmtContext.class,0);
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
			setState(146);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((StmtContext)_localctx).printStmt = printStmt();

							((StmtContext)_localctx).sStmt =  ((StmtContext)_localctx).printStmt.sPrintStmt;
						
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				((StmtContext)_localctx).assignStmt = assignStmt();

							((StmtContext)_localctx).sStmt =  ((StmtContext)_localctx).assignStmt.sAssign;
						
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				((StmtContext)_localctx).repeatStmt = repeatStmt();

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
			setState(148);
			match(T__7);
			setState(149);
			match(T__0);
			setState(150);
			((PrintStmtContext)_localctx).exprList = exprList();
			setState(151);
			match(T__1);

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
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					((ExprListContext)_localctx).expr = expr();
					setState(156);
					match(T__8);
					 _localctx.sExprList += ((ExprListContext)_localctx).expr.sExpr + ","; 
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(164);
			((ExprListContext)_localctx).expr = expr();
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
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(T__9);
				setState(168);
				((AssignStmtContext)_localctx).ID = match(ID);
				setState(169);
				match(T__10);
				setState(170);
				((AssignStmtContext)_localctx).NUM = match(NUM);

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
				setState(172);
				match(T__9);
				setState(173);
				((AssignStmtContext)_localctx).ID = match(ID);
				setState(174);
				match(T__10);
				setState(175);
				((AssignStmtContext)_localctx).expr = expr();

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
		public Token NUM;
		public FactorContext factor;
		public FactorContext f1;
		public FactorContext f2;
		public TermContext t1;
		public FactorContext f3;
		public FactorContext f4;
		public TermContext t2;
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
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
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				((TermContext)_localctx).NUM = match(NUM);
				setState(181);
				match(T__11);
				setState(182);
				((TermContext)_localctx).factor = factor();

					 ((TermContext)_localctx).sTerm =  "ldc " + ((TermContext)_localctx).NUM.getText() + "\n\tiload " + varID.get(((TermContext)_localctx).factor.sFactor) + "\n\timul\n";
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				((TermContext)_localctx).factor = factor();
				setState(186);
				match(T__11);
				setState(187);
				((TermContext)_localctx).NUM = match(NUM);

						((TermContext)_localctx).sTerm =  "iload " + varID.get(((TermContext)_localctx).factor.sFactor) + "\n\tldc " + ((TermContext)_localctx).NUM.getText() + "\n\timul\n";
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				((TermContext)_localctx).f1 = factor();
				setState(191);
				match(T__11);
				setState(192);
				((TermContext)_localctx).f2 = factor();

						((TermContext)_localctx).sTerm =  "iload " + varID.get(((TermContext)_localctx).f1.sFactor) + "\n\tiload " + varID.get(((TermContext)_localctx).f2.sFactor) + "\n\timul\n";
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				((TermContext)_localctx).factor = factor();
				setState(196);
				match(T__11);
				setState(197);
				((TermContext)_localctx).t1 = term();

						((TermContext)_localctx).sTerm =  "iload " + varID.get(((TermContext)_localctx).factor.sFactor) + "\n\tiload " + varID.get(((TermContext)_localctx).t1.sTerm) + "\n\timul\n";
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				((TermContext)_localctx).NUM = match(NUM);
				setState(201);
				match(T__12);
				setState(202);
				((TermContext)_localctx).factor = factor();

						((TermContext)_localctx).sTerm =  "ldc " + ((TermContext)_localctx).NUM.getText() + "\n\tiload " + varID.get(((TermContext)_localctx).factor.sFactor) + "\n\tidiv\n";
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				((TermContext)_localctx).factor = factor();
				setState(206);
				match(T__12);
				setState(207);
				((TermContext)_localctx).NUM = match(NUM);

						((TermContext)_localctx).sTerm =  "iload " + varID.get(((TermContext)_localctx).factor.sFactor) + "\n\tldc " + ((TermContext)_localctx).NUM.getText() + "\n\tidiv\n";
					
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(210);
				((TermContext)_localctx).f3 = factor();
				setState(211);
				match(T__12);
				setState(212);
				((TermContext)_localctx).f4 = factor();

						((TermContext)_localctx).sTerm =  "iload " + varID.get(((TermContext)_localctx).f3.sFactor) + "\n\tiload " + varID.get(((TermContext)_localctx).f4.sFactor) + "\n\tidiv\n";
					
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(215);
				((TermContext)_localctx).factor = factor();
				setState(216);
				match(T__12);
				setState(217);
				((TermContext)_localctx).t2 = term();

						((TermContext)_localctx).sTerm =  "iload " + varID.get(((TermContext)_localctx).factor.sFactor) + "\n\tiload " + varID.get(((TermContext)_localctx).t2.sTerm) + "\n\tidiv\n";
					
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(220);
				((TermContext)_localctx).factor = factor();

						((TermContext)_localctx).sTerm =  "iload " + varID.get(((TermContext)_localctx).factor.sFactor) + "";
					
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
			setState(229);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				((FactorContext)_localctx).ID = match(ID);

						((FactorContext)_localctx).sFactor =  ((FactorContext)_localctx).ID.getText();
					
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				((FactorContext)_localctx).NUM = match(NUM);

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22\u00ea\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\5\4)\n\4\3\4\3\4\5\4-\n\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n"+
		"\4\3\4\3\4\5\48\n\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\5\4C\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\5\4N\n\4\3\4\3\4\3\4\3\4\3\4\5\4U\n"+
		"\4\3\4\3\4\5\4Y\n\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\4\3\4\5\4d\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4k\n\4\3\4\3\4\5\4o\n\4\3\4\3\4\5\4s\n\4\3\4\3\4\5"+
		"\4w\n\4\3\4\3\4\5\4{\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\6"+
		"\6\u0088\n\6\r\6\16\6\u0089\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0095"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u00a2\n\t\f\t\16"+
		"\t\u00a5\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00b5\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00e2\n\13\3\f\3\f\3\f\3\f\5\f\u00e8\n\f\3\f"+
		"\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\u0104\2\30\3\2\2\2\4$\3\2\2\2\6"+
		"z\3\2\2\2\b|\3\2\2\2\n\u0083\3\2\2\2\f\u0094\3\2\2\2\16\u0096\3\2\2\2"+
		"\20\u009c\3\2\2\2\22\u00b4\3\2\2\2\24\u00e1\3\2\2\2\26\u00e7\3\2\2\2\30"+
		"\34\b\2\1\2\31\32\5\4\3\2\32\33\b\2\1\2\33\35\3\2\2\2\34\31\3\2\2\2\35"+
		"\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\7\2\2\3!\"\b\2\1"+
		"\2\"#\7\2\2\3#\3\3\2\2\2$%\5\n\6\2%&\b\3\1\2&\5\3\2\2\2\')\7\3\2\2(\'"+
		"\3\2\2\2()\3\2\2\2)*\3\2\2\2*,\5\24\13\2+-\7\4\2\2,+\3\2\2\2,-\3\2\2\2"+
		"-.\3\2\2\2./\7\5\2\2/\60\7\20\2\2\60\61\b\4\1\2\61{\3\2\2\2\62\64\7\3"+
		"\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\67\5\24\13\2\668\7\4"+
		"\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\5\2\2:;\5\24\13\2;<\b\4\1"+
		"\2<{\3\2\2\2=?\7\3\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@B\5\24\13\2AC\7\4"+
		"\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\5\2\2EF\5\6\4\2FG\b\4\1\2G{\3\2"+
		"\2\2HJ\7\3\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KM\5\24\13\2LN\7\4\2\2ML\3"+
		"\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\6\2\2PQ\7\20\2\2QR\b\4\1\2R{\3\2\2\2SU"+
		"\7\3\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VX\5\24\13\2WY\7\4\2\2XW\3\2\2\2"+
		"XY\3\2\2\2YZ\3\2\2\2Z[\7\6\2\2[\\\5\24\13\2\\]\b\4\1\2]{\3\2\2\2^`\7\3"+
		"\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\5\24\13\2bd\7\4\2\2cb\3\2\2\2cd\3"+
		"\2\2\2de\3\2\2\2ef\7\6\2\2fg\5\6\4\2gh\b\4\1\2h{\3\2\2\2ik\7\3\2\2ji\3"+
		"\2\2\2jk\3\2\2\2kl\3\2\2\2ln\7\20\2\2mo\7\4\2\2nm\3\2\2\2no\3\2\2\2op"+
		"\3\2\2\2p{\b\4\1\2qs\7\3\2\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tv\5\24\13\2"+
		"uw\7\4\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\4\1\2y{\3\2\2\2z(\3\2\2\2"+
		"z\63\3\2\2\2z>\3\2\2\2zI\3\2\2\2zT\3\2\2\2z_\3\2\2\2zj\3\2\2\2zr\3\2\2"+
		"\2{\7\3\2\2\2|}\7\7\2\2}~\5\6\4\2~\177\7\b\2\2\177\u0080\5\n\6\2\u0080"+
		"\u0081\7\t\2\2\u0081\u0082\b\5\1\2\u0082\t\3\2\2\2\u0083\u0087\b\6\1\2"+
		"\u0084\u0085\5\f\7\2\u0085\u0086\b\6\1\2\u0086\u0088\3\2\2\2\u0087\u0084"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\13\3\2\2\2\u008b\u008c\5\16\b\2\u008c\u008d\b\7\1\2\u008d\u0095\3\2\2"+
		"\2\u008e\u008f\5\22\n\2\u008f\u0090\b\7\1\2\u0090\u0095\3\2\2\2\u0091"+
		"\u0092\5\b\5\2\u0092\u0093\b\7\1\2\u0093\u0095\3\2\2\2\u0094\u008b\3\2"+
		"\2\2\u0094\u008e\3\2\2\2\u0094\u0091\3\2\2\2\u0095\r\3\2\2\2\u0096\u0097"+
		"\7\n\2\2\u0097\u0098\7\3\2\2\u0098\u0099\5\20\t\2\u0099\u009a\7\4\2\2"+
		"\u009a\u009b\b\b\1\2\u009b\17\3\2\2\2\u009c\u00a3\b\t\1\2\u009d\u009e"+
		"\5\6\4\2\u009e\u009f\7\13\2\2\u009f\u00a0\b\t\1\2\u00a0\u00a2\3\2\2\2"+
		"\u00a1\u009d\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\5\6\4\2\u00a7"+
		"\u00a8\b\t\1\2\u00a8\21\3\2\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\7\21\2"+
		"\2\u00ab\u00ac\7\r\2\2\u00ac\u00ad\7\20\2\2\u00ad\u00b5\b\n\1\2\u00ae"+
		"\u00af\7\f\2\2\u00af\u00b0\7\21\2\2\u00b0\u00b1\7\r\2\2\u00b1\u00b2\5"+
		"\6\4\2\u00b2\u00b3\b\n\1\2\u00b3\u00b5\3\2\2\2\u00b4\u00a9\3\2\2\2\u00b4"+
		"\u00ae\3\2\2\2\u00b5\23\3\2\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00b8\7\16"+
		"\2\2\u00b8\u00b9\5\26\f\2\u00b9\u00ba\b\13\1\2\u00ba\u00e2\3\2\2\2\u00bb"+
		"\u00bc\5\26\f\2\u00bc\u00bd\7\16\2\2\u00bd\u00be\7\20\2\2\u00be\u00bf"+
		"\b\13\1\2\u00bf\u00e2\3\2\2\2\u00c0\u00c1\5\26\f\2\u00c1\u00c2\7\16\2"+
		"\2\u00c2\u00c3\5\26\f\2\u00c3\u00c4\b\13\1\2\u00c4\u00e2\3\2\2\2\u00c5"+
		"\u00c6\5\26\f\2\u00c6\u00c7\7\16\2\2\u00c7\u00c8\5\24\13\2\u00c8\u00c9"+
		"\b\13\1\2\u00c9\u00e2\3\2\2\2\u00ca\u00cb\7\20\2\2\u00cb\u00cc\7\17\2"+
		"\2\u00cc\u00cd\5\26\f\2\u00cd\u00ce\b\13\1\2\u00ce\u00e2\3\2\2\2\u00cf"+
		"\u00d0\5\26\f\2\u00d0\u00d1\7\17\2\2\u00d1\u00d2\7\20\2\2\u00d2\u00d3"+
		"\b\13\1\2\u00d3\u00e2\3\2\2\2\u00d4\u00d5\5\26\f\2\u00d5\u00d6\7\17\2"+
		"\2\u00d6\u00d7\5\26\f\2\u00d7\u00d8\b\13\1\2\u00d8\u00e2\3\2\2\2\u00d9"+
		"\u00da\5\26\f\2\u00da\u00db\7\17\2\2\u00db\u00dc\5\24\13\2\u00dc\u00dd"+
		"\b\13\1\2\u00dd\u00e2\3\2\2\2\u00de\u00df\5\26\f\2\u00df\u00e0\b\13\1"+
		"\2\u00e0\u00e2\3\2\2\2\u00e1\u00b6\3\2\2\2\u00e1\u00bb\3\2\2\2\u00e1\u00c0"+
		"\3\2\2\2\u00e1\u00c5\3\2\2\2\u00e1\u00ca\3\2\2\2\u00e1\u00cf\3\2\2\2\u00e1"+
		"\u00d4\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\25\3\2\2"+
		"\2\u00e3\u00e4\7\21\2\2\u00e4\u00e8\b\f\1\2\u00e5\u00e6\7\20\2\2\u00e6"+
		"\u00e8\b\f\1\2\u00e7\u00e3\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\27\3\2\2"+
		"\2\32\36(,\63\67>BIMTX_cjnrvz\u0089\u0094\u00a3\u00b4\u00e1\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}