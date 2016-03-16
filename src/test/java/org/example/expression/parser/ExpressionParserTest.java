package org.example.expression.parser;

import org.example.expression.model.TargetingExpression;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by fREDY on 15/03/2016.
 */

public class ExpressionParserTest {

    private String expression = "[Day of Week] IN (\"Mon\", \"Wed\", \"Fri\", \"Sun\") AND [View Hour] IN (\"4\", \"5\", \"6\", \"7\", \"8\", \"16\", \"17\", \"18\", \"19\", \"20\")";
    private TargetingExpression targetingExpression;
    private TargetingExpression expected;
    @Before
    public void setUp() {

    }

    @Test
    public void testParse() throws Exception {
        ExpressionParser expressionParser = new ExpressionParser(expression);
        expected = expressionParser.parse(expression);
        assertThat(targetingExpression, is(expected));

    }

    @Test
    public void testWrite() throws Exception {

    }
}
