package org.example.expression.parser;

import org.example.expression.model.TargetingExpression;

/**
 * Created by fREDY on 15/03/2016.
 */
public class ExpressionParser {

    private String expression;

    public ExpressionParser() {
    }

    public ExpressionParser(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }


    public TargetingExpression parse(String expression) {
        return null;
    }
}
