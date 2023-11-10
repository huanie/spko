// Generated from SExpressionParser.g4 by ANTLR 4.13.1

    package Task3;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Float=1, Double=2, Integer=3, Long=4, LEFT_PAREN=5, RIGHT_PAREN=6, LEFT_CURLY=7, 
		RIGHT_CURLY=8, LEFT_BRACKET=9, RIGHT_BRACKET=10, PLUS=11, MINUS=12, DIVIDE=13, 
		TIMES=14, WS=15;
	public static final int
		RULE_sexpression = 0, RULE_head = 1, RULE_arg = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"sexpression", "head", "arg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'+'", "'-'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Float", "Double", "Integer", "Long", "LEFT_PAREN", "RIGHT_PAREN", 
			"LEFT_CURLY", "RIGHT_CURLY", "LEFT_BRACKET", "RIGHT_BRACKET", "PLUS", 
			"MINUS", "DIVIDE", "TIMES", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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
	public String getGrammarFileName() { return "SExpressionParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SexpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SExpressionParser.LEFT_PAREN, 0); }
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SExpressionParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(SExpressionParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(SExpressionParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_CURLY() { return getToken(SExpressionParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(SExpressionParser.RIGHT_CURLY, 0); }
		public SexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionParserListener ) ((SExpressionParserListener)listener).enterSexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionParserListener ) ((SExpressionParserListener)listener).exitSexpression(this);
		}
	}

	public final SexpressionContext sexpression() throws RecognitionException {
		SexpressionContext _localctx = new SexpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sexpression);
		int _la;
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(LEFT_PAREN);
				setState(7);
				head();
				setState(8);
				arg();
				setState(10); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(9);
					arg();
					}
					}
					setState(12); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 702L) != 0) );
				setState(14);
				match(RIGHT_PAREN);
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(LEFT_BRACKET);
				setState(17);
				head();
				setState(18);
				arg();
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(19);
					arg();
					}
					}
					setState(22); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 702L) != 0) );
				setState(24);
				match(RIGHT_BRACKET);
				}
				break;
			case LEFT_CURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				match(LEFT_CURLY);
				setState(27);
				head();
				setState(28);
				arg();
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(29);
					arg();
					}
					}
					setState(32); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 702L) != 0) );
				setState(34);
				match(RIGHT_CURLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeadContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SExpressionParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SExpressionParser.MINUS, 0); }
		public TerminalNode DIVIDE() { return getToken(SExpressionParser.DIVIDE, 0); }
		public TerminalNode TIMES() { return getToken(SExpressionParser.TIMES, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionParserListener ) ((SExpressionParserListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionParserListener ) ((SExpressionParserListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public TerminalNode Float() { return getToken(SExpressionParser.Float, 0); }
		public TerminalNode Integer() { return getToken(SExpressionParser.Integer, 0); }
		public TerminalNode Long() { return getToken(SExpressionParser.Long, 0); }
		public TerminalNode Double() { return getToken(SExpressionParser.Double, 0); }
		public SexpressionContext sexpression() {
			return getRuleContext(SexpressionContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionParserListener ) ((SExpressionParserListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionParserListener ) ((SExpressionParserListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arg);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(Float);
				}
				break;
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(Integer);
				}
				break;
			case Long:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(Long);
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				match(Double);
				}
				break;
			case LEFT_PAREN:
			case LEFT_CURLY:
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				sexpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004"+
		"\u0000\u000b\b\u0000\u000b\u0000\f\u0000\f\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0015\b\u0000\u000b"+
		"\u0000\f\u0000\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0004\u0000\u001f\b\u0000\u000b\u0000\f\u0000 \u0001"+
		"\u0000\u0001\u0000\u0003\u0000%\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002.\b"+
		"\u0002\u0001\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u0001\u0001"+
		"\u0000\u000b\u000e5\u0000$\u0001\u0000\u0000\u0000\u0002&\u0001\u0000"+
		"\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u0006\u0007\u0005\u0005\u0000"+
		"\u0000\u0007\b\u0003\u0002\u0001\u0000\b\n\u0003\u0004\u0002\u0000\t\u000b"+
		"\u0003\u0004\u0002\u0000\n\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000"+
		"\u0000\u0000\f\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r"+
		"\u000e\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0006\u0000\u0000\u000f"+
		"%\u0001\u0000\u0000\u0000\u0010\u0011\u0005\t\u0000\u0000\u0011\u0012"+
		"\u0003\u0002\u0001\u0000\u0012\u0014\u0003\u0004\u0002\u0000\u0013\u0015"+
		"\u0003\u0004\u0002\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0005\n\u0000\u0000\u0019%\u0001\u0000\u0000\u0000\u001a\u001b\u0005"+
		"\u0007\u0000\u0000\u001b\u001c\u0003\u0002\u0001\u0000\u001c\u001e\u0003"+
		"\u0004\u0002\u0000\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001d\u0001"+
		"\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0005\b"+
		"\u0000\u0000#%\u0001\u0000\u0000\u0000$\u0006\u0001\u0000\u0000\u0000"+
		"$\u0010\u0001\u0000\u0000\u0000$\u001a\u0001\u0000\u0000\u0000%\u0001"+
		"\u0001\u0000\u0000\u0000&\'\u0007\u0000\u0000\u0000\'\u0003\u0001\u0000"+
		"\u0000\u0000(.\u0005\u0001\u0000\u0000).\u0005\u0003\u0000\u0000*.\u0005"+
		"\u0004\u0000\u0000+.\u0005\u0002\u0000\u0000,.\u0003\u0000\u0000\u0000"+
		"-(\u0001\u0000\u0000\u0000-)\u0001\u0000\u0000\u0000-*\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\u0005\u0001"+
		"\u0000\u0000\u0000\u0005\f\u0016 $-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}