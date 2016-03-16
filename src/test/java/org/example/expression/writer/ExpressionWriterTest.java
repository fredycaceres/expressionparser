package org.example.expression.writer;

import org.example.expression.model.enums.DayOfWeek;
import org.example.expression.model.DayPart;
import org.example.expression.model.TargetingExpression;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by fREDY on 15/03/2016.
 */
public class ExpressionWriterTest {

    private TargetingExpression targetingExpression;
    private ExpressionWriter expressionWriter;
    private String expression;

    @Before
    public void setUp() throws Exception {
        DayOfWeek[] days = {DayOfWeek.Mon, DayOfWeek.Wed, DayOfWeek.Fri, DayOfWeek.Sun};
        Integer[] hours = {4, 5, 6, 7, 8, 16, 17, 18, 19, 20};
        DayPart dayPart = new DayPart(days, hours);
        targetingExpression = new TargetingExpression(dayPart);
    }

    @Test
    public void testWrite() throws Exception {
        String expected = "[Day of Week] IN (\"Mon\", \"Wed\", \"Fri\", \"Sun\") AND [View Hour] IN (\"4\", \"5\", \"6\", \"7\", \"8\", \"16\", \"17\", \"18\", \"19\", \"20\")";
        expressionWriter = new ExpressionWriter(targetingExpression);
        expression = expressionWriter.write(targetingExpression);
        assertThat(expression, is(expected));
    }
}