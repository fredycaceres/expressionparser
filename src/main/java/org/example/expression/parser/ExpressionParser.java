package org.example.expression.parser;

import org.example.expression.model.DayPart;
import org.example.expression.model.TargetingExpression;
import org.example.expression.model.enums.DayOfWeek;

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
        Integer[] adHours;
        DayOfWeek[] daysOfWeek;
        String[] parts = expression.split("AND");
        String days = parts[0];
        String hours = parts[1];
        String daysString = days.split("IN")[1].replace("(","").replace(")","");
        String[] dayValues = daysString.split(",");
        String hoursString = hours.split("IN")[1].replace("(","").replace(")","");
        String[] hourValues = hoursString.split(",");
        adHours = new Integer[hourValues.length];
        daysOfWeek = new DayOfWeek[dayValues.length];
        for (int index = 0; index < dayValues.length; index++) {
            daysOfWeek[index] = DayOfWeek.valueOf(dayValues[index].replace(" ","").replace("\"",""));
        }
        for (int index  = 0; index < hourValues.length; index++) {
            adHours[index] = Integer.parseInt(hourValues[index].replace(" ","").replace("\"",""));
        }
        DayPart dayPart = new DayPart(daysOfWeek, adHours);
        return new TargetingExpression(dayPart);
    }
}
