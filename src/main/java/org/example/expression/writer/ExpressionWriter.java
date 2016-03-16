package org.example.expression.writer;

import org.example.expression.model.TargetingExpression;

/**
 * Created by fREDY on 15/03/2016.
 */
public class ExpressionWriter {
    private TargetingExpression targetingExpression;

    public ExpressionWriter() {
    }

    public ExpressionWriter(TargetingExpression targetingExpression) {
        this.targetingExpression = targetingExpression;
    }

    public TargetingExpression getTargetingExpression() {
        return targetingExpression;
    }

    public void setTargetingExpression(TargetingExpression targetingExpression) {
        this.targetingExpression = targetingExpression;
    }


    public String write(TargetingExpression targetingExpression) {
        return null;
    }
}
