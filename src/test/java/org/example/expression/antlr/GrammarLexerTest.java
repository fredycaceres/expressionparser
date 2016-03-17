package org.example.expression.antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.fail;

/**
 * Created by fREDY on 16/03/2016.
 */
@RunWith(Parameterized.class)
public class GrammarLexerTest {

    private final boolean testValid;
    private final String testString;

    public GrammarLexerTest(boolean testValid, String testString) {
        this.testValid = testValid;
        this.testString = testString;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
           /*Valid expressions*/
                {true, "[Day of Week] IN (\"Mon\", \"Wed\", \"Fri\", \"Sun\") AND [View Hour] IN (\"4\", \"5\", \"6\", \"7\", \"8\", \"16\", \"17\", \"18\", \"19\", \"20\") "},
           /*Invalid expressions*/
                {false, "[Day of Week] IN (\"Mon\", \"Wed\", \"Fri\", \"Sun\") AND [View Hour] IN [\"4\", \"5\", \"6\", \"7\", \"8\", \"16\", \"17\", \"18\", \"19\", \"20\") "}
        });
    }

    @Test
    public void testExpression() {
        ANTLRInputStream input = new ANTLRInputStream(testString);
        GrammarLexer grammarLexer = new GrammarLexer(input);
        TokenStream tokens = new CommonTokenStream(grammarLexer);

        GrammarParser parser = new GrammarParser(tokens);

        parser.removeErrorListeners();
        parser.setErrorHandler(new ExceptionThrowingErrorHandler());

        if (testValid) {
            ParserRuleContext ruleContext = parser.getRuleContext();
//            assertNull(ruleContext.exception);
        } else {
            try {
                ParserRuleContext ruleContext = parser.getRuleContext();
                fail("Failed on \"" + this.testString + "\"");
            } catch (RuntimeException e) {
                // deliberately do nothing
            }
        }
    }
}