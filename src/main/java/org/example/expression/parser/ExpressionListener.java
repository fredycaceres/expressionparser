package org.example.expression.parser;

import org.example.expression.antlr.GrammarBaseListener;
import org.example.expression.antlr.GrammarParser;

/**
 * Created by fREDY on 17/03/2016.
 */
public class ExpressionListener extends GrammarBaseListener {
    @Override
    public void enterEntity(GrammarParser.EntityContext ctx) {
        String text = ctx.KEY().getText();
        System.out.printf("%s", text);
    }

    @Override
    public void enterList(GrammarParser.ListContext ctx) {
        System.out.printf("List tree: %s", ctx.VALUE());
    }

    @Override
    public void enterExpr2(GrammarParser.Expr2Context ctx) {
        System.out.printf("Expr2: %s", ctx.AND());
    }

    @Override
    public void enterList_op(GrammarParser.List_opContext ctx) {
        System.out.printf("List_op IN: %s", ctx.IN());
    }
}
