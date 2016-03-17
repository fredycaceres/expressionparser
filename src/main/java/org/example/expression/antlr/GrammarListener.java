// Generated from Grammar.g4 by ANTLR 4.0

package org.example.expression.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

public interface GrammarListener extends ParseTreeListener {
    void enterComp(GrammarParser.CompContext ctx);

    void exitComp(GrammarParser.CompContext ctx);

    void enterExpression(GrammarParser.ExpressionContext ctx);

    void exitExpression(GrammarParser.ExpressionContext ctx);

    void enterUnary_op(GrammarParser.Unary_opContext ctx);

    void exitUnary_op(GrammarParser.Unary_opContext ctx);

    void enterList(GrammarParser.ListContext ctx);

    void exitList(GrammarParser.ListContext ctx);

    void enterSingle_expr(GrammarParser.Single_exprContext ctx);

    void exitSingle_expr(GrammarParser.Single_exprContext ctx);

    void enterExists_op(GrammarParser.Exists_opContext ctx);

    void exitExists_op(GrammarParser.Exists_opContext ctx);

    void enterExpr4(GrammarParser.Expr4Context ctx);

    void exitExpr4(GrammarParser.Expr4Context ctx);

    void enterExpr3(GrammarParser.Expr3Context ctx);

    void exitExpr3(GrammarParser.Expr3Context ctx);

    void enterSinglelist(GrammarParser.SinglelistContext ctx);

    void exitSinglelist(GrammarParser.SinglelistContext ctx);

    void enterExpr2(GrammarParser.Expr2Context ctx);

    void exitExpr2(GrammarParser.Expr2Context ctx);

    void enterList_op(GrammarParser.List_opContext ctx);

    void exitList_op(GrammarParser.List_opContext ctx);

    void enterNolist(GrammarParser.NolistContext ctx);

    void exitNolist(GrammarParser.NolistContext ctx);

    void enterEntity(GrammarParser.EntityContext ctx);

    void exitEntity(GrammarParser.EntityContext ctx);

    void enterPexpr(GrammarParser.PexprContext ctx);

    void exitPexpr(GrammarParser.PexprContext ctx);

    void enterBinary_op(GrammarParser.Binary_opContext ctx);

    void exitBinary_op(GrammarParser.Binary_opContext ctx);
}