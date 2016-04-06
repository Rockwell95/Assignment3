// Generated from Simple.g4 by ANTLR 4.5.2

	import java.util.TreeMap;
	import java.io.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SimpleParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SimpleParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#repeatStmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStmt(SimpleParser.RepeatStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#repeatStmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStmt(SimpleParser.RepeatStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SimpleParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SimpleParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(SimpleParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(SimpleParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(SimpleParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(SimpleParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(SimpleParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(SimpleParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SimpleParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SimpleParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SimpleParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SimpleParser.FactorContext ctx);
}