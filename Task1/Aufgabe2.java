// Generated from Aufgabe2.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Aufgabe2 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Clock=1, WORD=2, TIME=3, HOUR=4, MINUTE=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Clock", "WORD", "TIME", "HOUR", "MINUTE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Clock", "WORD", "TIME", "HOUR", "MINUTE", "WS"
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


	public Aufgabe2(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Aufgabe2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0006T\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u0010\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00012\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002?\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003G\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"L\b\u0004\u0001\u0005\u0004\u0005O\b\u0005\u000b\u0005\f\u0005P\u0001"+
		"\u0005\u0001\u0005\u0000\u0000\u0006\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\u0001\u0000\u0005\u0001\u000019\u0001"+
		"\u000009\u0001\u000003\u0001\u000005\u0003\u0000\t\n\r\r  \\\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0001\u000f\u0001"+
		"\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000"+
		"\u0000\u0007F\u0001\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000b"+
		"N\u0001\u0000\u0000\u0000\r\u0010\u0003\u0003\u0001\u0000\u000e\u0010"+
		"\u0003\u0005\u0002\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u000e\u0001"+
		"\u0000\u0000\u0000\u0010\u0002\u0001\u0000\u0000\u0000\u0011\u0012\u0005"+
		"M\u0000\u0000\u0012\u0013\u0005i\u0000\u0000\u0013\u0014\u0005d\u0000"+
		"\u0000\u0014\u0015\u0005n\u0000\u0000\u0015\u0016\u0005i\u0000\u0000\u0016"+
		"\u0017\u0005g\u0000\u0000\u0017\u0018\u0005h\u0000\u0000\u00182\u0005"+
		"t\u0000\u0000\u0019\u001a\u0005N\u0000\u0000\u001a\u001b\u0005o\u0000"+
		"\u0000\u001b\u001c\u0005o\u0000\u0000\u001c2\u0005n\u0000\u0000\u001d"+
		"\u001e\u00051\u0000\u0000\u001e\u001f\u00052\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 !\u0005 \u0000\u0000!\"\u0005m\u0000\u0000\"#\u0005"+
		"i\u0000\u0000#$\u0005d\u0000\u0000$%\u0005n\u0000\u0000%&\u0005i\u0000"+
		"\u0000&\'\u0005g\u0000\u0000\'(\u0005h\u0000\u0000(2\u0005t\u0000\u0000"+
		")*\u00051\u0000\u0000*+\u00052\u0000\u0000+,\u0001\u0000\u0000\u0000,"+
		"-\u0005 \u0000\u0000-.\u0005n\u0000\u0000./\u0005o\u0000\u0000/0\u0005"+
		"o\u0000\u000002\u0005n\u0000\u00001\u0011\u0001\u0000\u0000\u00001\u0019"+
		"\u0001\u0000\u0000\u00001\u001d\u0001\u0000\u0000\u00001)\u0001\u0000"+
		"\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0003\u0007\u0003\u0000"+
		"45\u0005:\u0000\u00005>\u0003\t\u0004\u000067\u0005a\u0000\u000078\u0005"+
		".\u0000\u000089\u0005m\u0000\u00009?\u0005.\u0000\u0000:;\u0005p\u0000"+
		"\u0000;<\u0005.\u0000\u0000<=\u0005m\u0000\u0000=?\u0005.\u0000\u0000"+
		">6\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000\u0000?\u0006\u0001\u0000"+
		"\u0000\u0000@B\u0007\u0000\u0000\u0000AC\u0007\u0001\u0000\u0000BA\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CG\u0001\u0000\u0000\u0000"+
		"DE\u00052\u0000\u0000EG\u0007\u0002\u0000\u0000F@\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000G\b\u0001\u0000\u0000\u0000HL\u0007\u0001\u0000"+
		"\u0000IJ\u0007\u0003\u0000\u0000JL\u0007\u0001\u0000\u0000KH\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000L\n\u0001\u0000\u0000\u0000MO\u0007"+
		"\u0004\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RS\u0006\u0005\u0000\u0000S\f\u0001\u0000\u0000\u0000\b\u0000\u000f"+
		"1>BFKP\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}