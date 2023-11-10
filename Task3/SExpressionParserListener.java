// Generated from SExpressionParser.g4 by ANTLR 4.13.1

    package Task3;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SExpressionParser}.
 */
public interface SExpressionParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SExpressionParser#sexpression}.
	 * @param ctx the parse tree
	 */
	void enterSexpression(SExpressionParser.SexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SExpressionParser#sexpression}.
	 * @param ctx the parse tree
	 */
	void exitSexpression(SExpressionParser.SexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SExpressionParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(SExpressionParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SExpressionParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(SExpressionParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SExpressionParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(SExpressionParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SExpressionParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(SExpressionParser.ArgContext ctx);
}