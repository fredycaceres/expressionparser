package org.example.expression.writer;

import org.example.expression.model.TargetingExpression;
import org.example.expression.model.enums.DayOfWeek;
import org.example.expression.model.enums.ExpressionOperator;
import org.example.expression.model.enums.ExpressionToken;

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
        StringBuilder expression = new StringBuilder();
        if (targetingExpression.getDayPart().getDays() != null) {
            expression.append(ExpressionToken.DayOfWeek.getToken());
            expression.append(" ");
            expression.append(ExpressionOperator.IN);
            expression.append(" (");
            for (int index = 0; index < targetingExpression.getDayPart().getDays().length; index++) {
                DayOfWeek dayOfWeek = targetingExpression.getDayPart().getDays()[index];
                expression.append("\"");
                expression.append(dayOfWeek);
                if (index < targetingExpression.getDayPart().getDays().length - 1)
                    expression.append("\", ");
                else if (index == targetingExpression.getDayPart().getDays().length - 1)
                    expression.append("\"");
            }
            expression.append(")");
        }
        if (targetingExpression.getDayPart().getHours() != null) {
            expression.append(" ");
            expression.append(ExpressionOperator.AND);
            expression.append(" ");
            expression.append(ExpressionToken.ViewHour.getToken());
            expression.append(" ");
            expression.append(ExpressionOperator.IN);
            expression.append(" (");
            for (int index = 0; index < targetingExpression.getDayPart().getHours().length; index++) {
                Integer hour = targetingExpression.getDayPart().getHours()[index];
                expression.append("\"");
                expression.append(hour);
                if (index < targetingExpression.getDayPart().getHours().length - 1)
                    expression.append("\", ");
                else if (index == targetingExpression.getDayPart().getHours().length - 1)
                    expression.append("\"");
            }
            expression.append(")");
        }
        return expression.toString();
    }
}
