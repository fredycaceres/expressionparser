package org.example.expression;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.expression.antlr.GrammarLexer;
import org.example.expression.antlr.GrammarParser;
import org.example.expression.parser.ExpressionListener;

/**
 * Created by fREDY on 17/03/2016.
 */
public class Main {

    public static void main(String[] args) {
        String expression = "[Day of Week] IN (\"Mon\", \"Wed\", \"Fri\", \"Sun\") AND [View Hour] IN (\"4\", \"5\", \"6\", \"7\", \"8\", \"16\", \"17\", \"18\", \"19\", \"20\")";
        ANTLRInputStream input = new ANTLRInputStream(expression);
        GrammarLexer grammarLexer = new GrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(grammarLexer);
        GrammarParser grammarParser = new GrammarParser(tokens);
        ParseTree tree = grammarParser.expression();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ExpressionListener(), tree);
        System.out.println();
    }
}
