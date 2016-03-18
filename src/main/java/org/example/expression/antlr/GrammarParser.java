// Generated from Grammar.g4 by ANTLR 4.5.1

package org.example.expression.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	public static final int
			T__0 = 1, T__1 = 2, T__2 = 3, NOT = 4, AND = 5, OR = 6, EQ = 7, NEQ = 8, GT = 9, GTE = 10,
			LET = 11, LETE = 12, IN = 13, NOT_IN = 14, BETWEEN = 15, NOT_BETWEEN = 16, CONTAINS = 17,
			NOT_CONTAINS = 18, EXISTS = 19, NOT_EXISTS = 20, LIST = 21, ENTITY = 22, LBRACK = 23,
			RBRACK = 24, VALUE = 25, KEY = 26, WS = 27;
	public static final int
			RULE_expression = 0, RULE_single_expr = 1, RULE_expr2 = 2, RULE_expr3 = 3,
			RULE_expr4 = 4, RULE_pexpr = 5, RULE_entity = 6, RULE_nolist = 7, RULE_singlelist = 8,
			RULE_list = 9, RULE_list_op = 10, RULE_unary_op = 11, RULE_binary_op = 12,
			RULE_exists_op = 13, RULE_comp = 14;
	public static final String[] ruleNames = {
			"expression", "single_expr", "expr2", "expr3", "expr4", "pexpr", "entity",
			"nolist", "singlelist", "list", "list_op", "unary_op", "binary_op", "exists_op",
			"comp"
	};
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35n\4\2\t\2\4\3\t" +
					"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4" +
					"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16\2%\13" +
					"\2\3\2\3\2\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\4\3\4\3\4\7\4\64\n\4" +
					"\f\4\16\4\67\13\4\3\5\5\5:\n\5\3\5\3\5\3\6\3\6\5\6@\n\6\3\7\3\7\3\7\3" +
					"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bR\n\b\3\t\5\tU\n" +
					"\t\3\n\3\n\3\13\3\13\3\13\3\13\7\13]\n\13\f\13\16\13`\13\13\3\13\3\13" +
					"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f" +
					"\16\20\22\24\26\30\32\34\36\2\6\3\2\17\24\3\2\7\b\3\2\25\26\3\2\t\16g" +
					"\2#\3\2\2\2\4(\3\2\2\2\6\60\3\2\2\2\b9\3\2\2\2\n?\3\2\2\2\fA\3\2\2\2\16" +
					"Q\3\2\2\2\20T\3\2\2\2\22V\3\2\2\2\24X\3\2\2\2\26c\3\2\2\2\30e\3\2\2\2" +
					"\32g\3\2\2\2\34i\3\2\2\2\36k\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#" +
					"!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\2\2\3\'\3\3\2\2\2(-\5\6\4" +
					"\2)*\7\b\2\2*,\5\6\4\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\5\3\2" +
					"\2\2/-\3\2\2\2\60\65\5\b\5\2\61\62\7\7\2\2\62\64\5\b\5\2\63\61\3\2\2\2" +
					"\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\67\65\3\2\2\2" +
					"8:\5\30\r\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\5\n\6\2<\t\3\2\2\2=@\5\16" +
					"\b\2>@\5\f\7\2?=\3\2\2\2?>\3\2\2\2@\13\3\2\2\2AB\7\3\2\2BC\5\4\3\2CD\7" +
					"\4\2\2D\r\3\2\2\2EF\7\34\2\2FG\5\36\20\2GH\5\22\n\2HR\3\2\2\2IJ\7\34\2" +
					"\2JK\5\26\f\2KL\5\24\13\2LR\3\2\2\2MN\7\34\2\2NO\5\34\17\2OP\5\20\t\2" +
					"PR\3\2\2\2QE\3\2\2\2QI\3\2\2\2QM\3\2\2\2R\17\3\2\2\2SU\7\35\2\2TS\3\2" +
					"\2\2TU\3\2\2\2U\21\3\2\2\2VW\7\33\2\2W\23\3\2\2\2XY\7\3\2\2Y^\7\33\2\2" +
					"Z[\7\5\2\2[]\7\33\2\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2" +
					"\2\2`^\3\2\2\2ab\7\4\2\2b\25\3\2\2\2cd\t\2\2\2d\27\3\2\2\2ef\7\6\2\2f" +
					"\31\3\2\2\2gh\t\3\2\2h\33\3\2\2\2ij\t\4\2\2j\35\3\2\2\2kl\t\5\2\2l\37" +
					"\3\2\2\2\n#-\659?QT^";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = {
			null, "'('", "')'", "','", "'NOT'", "'AND'", "'OR'", "'='", "'!='", "'>'",
			"'>='", "'<'", "'<='", "'IN'", "'NOT_IN'", "'BETWEEN'", "'NOT_BETWEEN'",
			"'CONTAINS'", "'NOT_CONTAINS'", "'EXISTS'", "'NOT_EXISTS'", "'LIST'",
			"'ENTITY'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
			null, null, null, null, "NOT", "AND", "OR", "EQ", "NEQ", "GT", "GTE",
			"LET", "LETE", "IN", "NOT_IN", "BETWEEN", "NOT_BETWEEN", "CONTAINS", "NOT_CONTAINS",
			"EXISTS", "NOT_EXISTS", "LIST", "ENTITY", "LBRACK", "RBRACK", "VALUE",
			"KEY", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	static {
		RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
	}

	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() {
		return "Grammar.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << KEY))) != 0)) {
					{
						{
				setState(30);
				single_expr();
						}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
			}
				setState(36);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Single_exprContext single_expr() throws RecognitionException {
		Single_exprContext _localctx = new Single_exprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_single_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(38);
				expr2();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == OR) {
					{
						{
							setState(39);
							match(OR);
							setState(40);
				expr2();
						}
					}
					setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(46);
				expr3();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AND) {
					{
						{
							setState(47);
							match(AND);
							setState(48);
				expr3();
						}
					}
					setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(55);
				_la = _input.LA(1);
				if (_la == NOT) {
					{
						setState(54);
						unary_op();
				}
				}

				setState(57);
				expr4();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Expr4Context expr4() throws RecognitionException {
		Expr4Context _localctx = new Expr4Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr4);
		try {
			setState(61);
			switch (_input.LA(1)) {
				case KEY:
					enterOuterAlt(_localctx, 1);
				{
					setState(59);
					entity();
				}
				break;
				case T__0:
					enterOuterAlt(_localctx, 2);
				{
					setState(60);
					pexpr();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PexprContext pexpr() throws RecognitionException {
		PexprContext _localctx = new PexprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(63);
				match(T__0);
				setState(64);
				single_expr();
				setState(65);
				match(T__1);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_entity);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(67);
					match(KEY);
					setState(68);
					comp();
					setState(69);
					singlelist();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(71);
					match(KEY);
					setState(72);
					list_op();
					setState(73);
					list();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(75);
					match(KEY);
					setState(76);
					exists_op();
					setState(77);
					nolist();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final NolistContext nolist() throws RecognitionException {
		NolistContext _localctx = new NolistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nolist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(82);
				_la = _input.LA(1);
				if (_la == WS) {
					{
						setState(81);
						match(WS);
					}
			}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final SinglelistContext singlelist() throws RecognitionException {
		SinglelistContext _localctx = new SinglelistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singlelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(84);
				match(VALUE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(86);
				match(T__0);
				setState(87);
				match(VALUE);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__2) {
					{
						{
							setState(88);
							match(T__2);
							setState(89);
				match(VALUE);
						}
					}
					setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
				setState(95);
				match(T__1);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final List_opContext list_op() throws RecognitionException {
		List_opContext _localctx = new List_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_list_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(97);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NOT_IN) | (1L << BETWEEN) | (1L << NOT_BETWEEN) | (1L << CONTAINS) | (1L << NOT_CONTAINS))) != 0))) {
					_errHandler.recoverInline(this);
				} else {
				consume();
			}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unary_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(99);
				match(NOT);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Binary_opContext binary_op() throws RecognitionException {
		Binary_opContext _localctx = new Binary_opContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_binary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(101);
				_la = _input.LA(1);
				if (!(_la == AND || _la == OR)) {
					_errHandler.recoverInline(this);
				} else {
				consume();
			}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Exists_opContext exists_op() throws RecognitionException {
		Exists_opContext _localctx = new Exists_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exists_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(103);
				_la = _input.LA(1);
				if (!(_la == EXISTS || _la == NOT_EXISTS)) {
					_errHandler.recoverInline(this);
				} else {
				consume();
			}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(105);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << GTE) | (1L << LET) | (1L << LETE))) != 0))) {
					_errHandler.recoverInline(this);
				} else {
				consume();
			}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode EOF() {
			return getToken(GrammarParser.EOF, 0);
		}

		public List<Single_exprContext> single_expr() {
			return getRuleContexts(Single_exprContext.class);
		}

		public Single_exprContext single_expr(int i) {
			return getRuleContext(Single_exprContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitExpression(this);
		}
	}

	public static class Single_exprContext extends ParserRuleContext {
		public Single_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}

		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}

		public List<TerminalNode> OR() {
			return getTokens(GrammarParser.OR);
		}

		public TerminalNode OR(int i) {
			return getToken(GrammarParser.OR, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_single_expr;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterSingle_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitSingle_expr(this);
		}
	}

	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}

		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}

		public List<TerminalNode> AND() {
			return getTokens(GrammarParser.AND);
		}

		public TerminalNode AND(int i) {
			return getToken(GrammarParser.AND, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr2;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitExpr2(this);
		}
	}

	public static class Expr3Context extends ParserRuleContext {
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}

		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr3;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitExpr3(this);
		}
	}

	public static class Expr4Context extends ParserRuleContext {
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}

		public PexprContext pexpr() {
			return getRuleContext(PexprContext.class,0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr4;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterExpr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitExpr4(this);
		}
	}

	public static class PexprContext extends ParserRuleContext {
		public PexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Single_exprContext single_expr() {
			return getRuleContext(Single_exprContext.class,0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_pexpr;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterPexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitPexpr(this);
		}
	}

	public static class EntityContext extends ParserRuleContext {
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode KEY() {
			return getToken(GrammarParser.KEY, 0);
		}

		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}

		public SinglelistContext singlelist() {
			return getRuleContext(SinglelistContext.class,0);
		}

		public List_opContext list_op() {
			return getRuleContext(List_opContext.class,0);
		}

		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}

		public Exists_opContext exists_op() {
			return getRuleContext(Exists_opContext.class,0);
		}

		public NolistContext nolist() {
			return getRuleContext(NolistContext.class,0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_entity;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitEntity(this);
		}
	}

	public static class NolistContext extends ParserRuleContext {
		public NolistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode WS() {
			return getToken(GrammarParser.WS, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_nolist;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterNolist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitNolist(this);
		}
	}

	public static class SinglelistContext extends ParserRuleContext {
		public SinglelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode VALUE() {
			return getToken(GrammarParser.VALUE, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_singlelist;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterSinglelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitSinglelist(this);
		}
	}

	public static class ListContext extends ParserRuleContext {
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TerminalNode> VALUE() {
			return getTokens(GrammarParser.VALUE);
		}

		public TerminalNode VALUE(int i) {
			return getToken(GrammarParser.VALUE, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_list;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitList(this);
		}
	}

	public static class List_opContext extends ParserRuleContext {
		public List_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode BETWEEN() {
			return getToken(GrammarParser.BETWEEN, 0);
		}

		public TerminalNode NOT_BETWEEN() {
			return getToken(GrammarParser.NOT_BETWEEN, 0);
		}

		public TerminalNode IN() {
			return getToken(GrammarParser.IN, 0);
		}

		public TerminalNode NOT_IN() {
			return getToken(GrammarParser.NOT_IN, 0);
		}

		public TerminalNode CONTAINS() {
			return getToken(GrammarParser.CONTAINS, 0);
		}

		public TerminalNode NOT_CONTAINS() {
			return getToken(GrammarParser.NOT_CONTAINS, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_list_op;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterList_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitList_op(this);
		}
	}

	public static class Unary_opContext extends ParserRuleContext {
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode NOT() {
			return getToken(GrammarParser.NOT, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unary_op;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitUnary_op(this);
		}
	}

	public static class Binary_opContext extends ParserRuleContext {
		public Binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode AND() {
			return getToken(GrammarParser.AND, 0);
		}

		public TerminalNode OR() {
			return getToken(GrammarParser.OR, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_binary_op;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterBinary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitBinary_op(this);
		}
	}

	public static class Exists_opContext extends ParserRuleContext {
		public Exists_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode EXISTS() {
			return getToken(GrammarParser.EXISTS, 0);
		}

		public TerminalNode NOT_EXISTS() {
			return getToken(GrammarParser.NOT_EXISTS, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_exists_op;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterExists_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitExists_op(this);
		}
	}

	public static class CompContext extends ParserRuleContext {
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode EQ() {
			return getToken(GrammarParser.EQ, 0);
		}

		public TerminalNode NEQ() {
			return getToken(GrammarParser.NEQ, 0);
		}

		public TerminalNode GT() {
			return getToken(GrammarParser.GT, 0);
		}

		public TerminalNode LET() {
			return getToken(GrammarParser.LET, 0);
		}

		public TerminalNode GTE() {
			return getToken(GrammarParser.GTE, 0);
		}

		public TerminalNode LETE() {
			return getToken(GrammarParser.LETE, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_comp;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GrammarListener) ((GrammarListener) listener).exitComp(this);
		}
	}
}