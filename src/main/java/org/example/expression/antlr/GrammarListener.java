// Generated from Grammar.g4 by ANTLR 4.5.2

package org.example.expression.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 *
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 *
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#single_expr}.
	 *
	 * @param ctx the parse tree
	 */
	void enterSingle_expr(GrammarParser.Single_exprContext ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#single_expr}.
	 *
	 * @param ctx the parse tree
	 */
	void exitSingle_expr(GrammarParser.Single_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr2}.
	 *
	 * @param ctx the parse tree
	 */
	void enterExpr2(GrammarParser.Expr2Context ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr2}.
	 *
	 * @param ctx the parse tree
	 */
	void exitExpr2(GrammarParser.Expr2Context ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr3}.
	 *
	 * @param ctx the parse tree
	 */
	void enterExpr3(GrammarParser.Expr3Context ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr3}.
	 *
	 * @param ctx the parse tree
	 */
	void exitExpr3(GrammarParser.Expr3Context ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr4}.
	 *
	 * @param ctx the parse tree
	 */
	void enterExpr4(GrammarParser.Expr4Context ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr4}.
	 *
	 * @param ctx the parse tree
	 */
	void exitExpr4(GrammarParser.Expr4Context ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#pexpr}.
	 *
	 * @param ctx the parse tree
	 */
	void enterPexpr(GrammarParser.PexprContext ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#pexpr}.
	 *
	 * @param ctx the parse tree
	 */
	void exitPexpr(GrammarParser.PexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#entity}.
	 *
	 * @param ctx the parse tree
	 */
	void enterEntity(GrammarParser.EntityContext ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#entity}.
	 *
	 * @param ctx the parse tree
	 */
	void exitEntity(GrammarParser.EntityContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#nolist}.
	 *
	 * @param ctx the parse tree
	 */
	void enterNolist(GrammarParser.NolistContext ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#nolist}.
	 *
	 * @param ctx the parse tree
	 */
	void exitNolist(GrammarParser.NolistContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#singlelist}.
	 *
	 * @param ctx the parse tree
	 */
	void enterSinglelist(GrammarParser.SinglelistContext ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#singlelist}.
	 *
	 * @param ctx the parse tree
	 */
	void exitSinglelist(GrammarParser.SinglelistContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#list}.
	 *
	 * @param ctx the parse tree
	 */
	void enterList(GrammarParser.ListContext ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#list}.
	 *
	 * @param ctx the parse tree
	 */
	void exitList(GrammarParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#list_op}.
	 *
	 * @param ctx the parse tree
	 */
	void enterList_op(GrammarParser.List_opContext ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#list_op}.
	 *
	 * @param ctx the parse tree
	 */
	void exitList_op(GrammarParser.List_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#unary_op}.
	 *
	 * @param ctx the parse tree
	 */
	void enterUnary_op(GrammarParser.Unary_opContext ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#unary_op}.
	 *
	 * @param ctx the parse tree
	 */
	void exitUnary_op(GrammarParser.Unary_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#binary_op}.
	 *
	 * @param ctx the parse tree
	 */
	void enterBinary_op(GrammarParser.Binary_opContext ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#binary_op}.
	 *
	 * @param ctx the parse tree
	 */
	void exitBinary_op(GrammarParser.Binary_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#exists_op}.
	 *
	 * @param ctx the parse tree
	 */
	void enterExists_op(GrammarParser.Exists_opContext ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#exists_op}.
	 *
	 * @param ctx the parse tree
	 */
	void exitExists_op(GrammarParser.Exists_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#comp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterComp(GrammarParser.CompContext ctx);

	/**
	 * Exit a parse tree produced by {@link GrammarParser#comp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitComp(GrammarParser.CompContext ctx);
}