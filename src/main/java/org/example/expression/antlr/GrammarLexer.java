// Generated from Grammar.g4 by ANTLR 4.0

package org.example.expression.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
    public static final int
            T__2 = 1, T__1 = 2, T__0 = 3, NOT = 4, AND = 5, OR = 6, EQ = 7, NEQ = 8, GT = 9, GTE = 10,
            LET = 11, LETE = 12, IN = 13, NOT_IN = 14, BETWEEN = 15, NOT_BETWEEN = 16, CONTAINS = 17,
            NOT_CONTAINS = 18, EXISTS = 19, NOT_EXISTS = 20, LIST = 21, ENTITY = 22, LBRACK = 23,
            RBRACK = 24, VALUE = 25, KEY = 26, WS = 27;
    public static final String[] tokenNames = {
            "<INVALID>",
            "'('", "')'", "','", "'NOT'", "'AND'", "'OR'", "'='", "'!='", "'>'", "'>='",
            "'<'", "'<='", "'IN'", "'NOT_IN'", "'BETWEEN'", "'NOT_BETWEEN'", "'CONTAINS'",
            "'NOT_CONTAINS'", "'EXISTS'", "'NOT_EXISTS'", "'LIST'", "'ENTITY'", "'['",
            "']'", "VALUE", "KEY", "WS"
    };
    public static final String[] ruleNames = {
            "T__2", "T__1", "T__0", "NOT", "AND", "OR", "EQ", "NEQ", "GT", "GTE",
            "LET", "LETE", "IN", "NOT_IN", "BETWEEN", "NOT_BETWEEN", "CONTAINS", "NOT_CONTAINS",
            "EXISTS", "NOT_EXISTS", "LIST", "ENTITY", "LBRACK", "RBRACK", "VALUE",
            "KEY", "WS"
    };
    public static final String _serializedATN =
            "\2\4\35\u00c6\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b" +
                    "\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20" +
                    "\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27" +
                    "\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3" +
                    "\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t" +
                    "\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3" +
                    "\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3" +
                    "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3" +
                    "\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3" +
                    "\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3" +
                    "\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3" +
                    "\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\6" +
                    "\32\u00b2\n\32\r\32\16\32\u00b3\3\32\3\32\3\33\3\33\6\33\u00ba\n\33\r" +
                    "\33\16\33\u00bb\3\33\3\33\3\34\6\34\u00c1\n\34\r\34\16\34\u00c2\3\34\3" +
                    "\34\2\35\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25" +
                    "\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)" +
                    "\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\2\3\2\5\5\"\"C\\" +
                    "c|\5\"\"C\\c|\5\13\f\16\17\"\"\u00c8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2" +
                    "\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23" +
                    "\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2" +
                    "\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2" +
                    "\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3" +
                    "\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13C\3" +
                    "\2\2\2\rG\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27T" +
                    "\3\2\2\2\31V\3\2\2\2\33Y\3\2\2\2\35\\\3\2\2\2\37c\3\2\2\2!k\3\2\2\2#w" +
                    "\3\2\2\2%\u0080\3\2\2\2\'\u008d\3\2\2\2)\u0094\3\2\2\2+\u009f\3\2\2\2" +
                    "-\u00a4\3\2\2\2/\u00ab\3\2\2\2\61\u00ad\3\2\2\2\63\u00af\3\2\2\2\65\u00b7" +
                    "\3\2\2\2\67\u00c0\3\2\2\29:\7*\2\2:\4\3\2\2\2;<\7+\2\2<\6\3\2\2\2=>\7" +
                    ".\2\2>\b\3\2\2\2?@\7P\2\2@A\7Q\2\2AB\7V\2\2B\n\3\2\2\2CD\7C\2\2DE\7P\2" +
                    "\2EF\7F\2\2F\f\3\2\2\2GH\7Q\2\2HI\7T\2\2I\16\3\2\2\2JK\7?\2\2K\20\3\2" +
                    "\2\2LM\7#\2\2MN\7?\2\2N\22\3\2\2\2OP\7@\2\2P\24\3\2\2\2QR\7@\2\2RS\7?" +
                    "\2\2S\26\3\2\2\2TU\7>\2\2U\30\3\2\2\2VW\7>\2\2WX\7?\2\2X\32\3\2\2\2YZ" +
                    "\7K\2\2Z[\7P\2\2[\34\3\2\2\2\\]\7P\2\2]^\7Q\2\2^_\7V\2\2_`\7a\2\2`a\7" +
                    "K\2\2ab\7P\2\2b\36\3\2\2\2cd\7D\2\2de\7G\2\2ef\7V\2\2fg\7Y\2\2gh\7G\2" +
                    "\2hi\7G\2\2ij\7P\2\2j \3\2\2\2kl\7P\2\2lm\7Q\2\2mn\7V\2\2no\7a\2\2op\7" +
                    "D\2\2pq\7G\2\2qr\7V\2\2rs\7Y\2\2st\7G\2\2tu\7G\2\2uv\7P\2\2v\"\3\2\2\2" +
                    "wx\7E\2\2xy\7Q\2\2yz\7P\2\2z{\7V\2\2{|\7C\2\2|}\7K\2\2}~\7P\2\2~\177\7" +
                    "U\2\2\177$\3\2\2\2\u0080\u0081\7P\2\2\u0081\u0082\7Q\2\2\u0082\u0083\7" +
                    "V\2\2\u0083\u0084\7a\2\2\u0084\u0085\7E\2\2\u0085\u0086\7Q\2\2\u0086\u0087" +
                    "\7P\2\2\u0087\u0088\7V\2\2\u0088\u0089\7C\2\2\u0089\u008a\7K\2\2\u008a" +
                    "\u008b\7P\2\2\u008b\u008c\7U\2\2\u008c&\3\2\2\2\u008d\u008e\7G\2\2\u008e" +
                    "\u008f\7Z\2\2\u008f\u0090\7K\2\2\u0090\u0091\7U\2\2\u0091\u0092\7V\2\2" +
                    "\u0092\u0093\7U\2\2\u0093(\3\2\2\2\u0094\u0095\7P\2\2\u0095\u0096\7Q\2" +
                    "\2\u0096\u0097\7V\2\2\u0097\u0098\7a\2\2\u0098\u0099\7G\2\2\u0099\u009a" +
                    "\7Z\2\2\u009a\u009b\7K\2\2\u009b\u009c\7U\2\2\u009c\u009d\7V\2\2\u009d" +
                    "\u009e\7U\2\2\u009e*\3\2\2\2\u009f\u00a0\7N\2\2\u00a0\u00a1\7K\2\2\u00a1" +
                    "\u00a2\7U\2\2\u00a2\u00a3\7V\2\2\u00a3,\3\2\2\2\u00a4\u00a5\7G\2\2\u00a5" +
                    "\u00a6\7P\2\2\u00a6\u00a7\7V\2\2\u00a7\u00a8\7K\2\2\u00a8\u00a9\7V\2\2" +
                    "\u00a9\u00aa\7[\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7]\2\2\u00ac\60\3\2\2\2" +
                    "\u00ad\u00ae\7_\2\2\u00ae\62\3\2\2\2\u00af\u00b1\7$\2\2\u00b0\u00b2\t" +
                    "\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3" +
                    "\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6\64\3\2\2\2" +
                    "\u00b7\u00b9\7]\2\2\u00b8\u00ba\t\3\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb" +
                    "\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd" +
                    "\u00be\7_\2\2\u00be\66\3\2\2\2\u00bf\u00c1\t\4\2\2\u00c0\u00bf\3\2\2\2" +
                    "\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4" +
                    "\3\2\2\2\u00c4\u00c5\b\34\2\2\u00c58\3\2\2\2\6\2\u00b3\u00bb\u00c2";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    }

    public GrammarLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "Grammar.g4";
    }

    @Override
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    @Override
    public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
        switch (ruleIndex) {
            case 26:
                WS_action((RuleContext) _localctx, actionIndex);
                break;
        }
    }

    private void WS_action(RuleContext _localctx, int actionIndex) {
        switch (actionIndex) {
            case 0:
                skip();
                break;
        }
    }
}