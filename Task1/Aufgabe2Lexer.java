// Generated from Aufgabe2Lexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Aufgabe2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Clock=1, WS=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Clock", "WORD", "TIME", "FORMAT", "SEPARATOR", "HOUR", "MINUTE", "WS"
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
			null, "Clock", "WS"
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


	public Aufgabe2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Aufgabe2Lexer.g4"; }

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
		"\u0004\u0000\u0002W\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0003\u0000\u0014\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"4\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005J\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006O\b\u0006\u0001\u0007\u0004\u0007"+
		"R\b\u0007\u000b\u0007\f\u0007S\u0001\u0007\u0001\u0007\u0000\u0000\b\u0001"+
		"\u0001\u0003\u0000\u0005\u0000\u0007\u0000\t\u0000\u000b\u0000\r\u0000"+
		"\u000f\u0002\u0001\u0000\u0005\u0001\u000019\u0001\u000002\u0001\u0000"+
		"09\u0001\u000005\u0003\u0000\t\n\r\r  X\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000\u0000"+
		"\u0000\u00033\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000\u0007"+
		"B\u0001\u0000\u0000\u0000\tD\u0001\u0000\u0000\u0000\u000bI\u0001\u0000"+
		"\u0000\u0000\rN\u0001\u0000\u0000\u0000\u000fQ\u0001\u0000\u0000\u0000"+
		"\u0011\u0014\u0003\u0003\u0001\u0000\u0012\u0014\u0003\u0005\u0002\u0000"+
		"\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0012\u0001\u0000\u0000\u0000"+
		"\u0014\u0002\u0001\u0000\u0000\u0000\u0015\u0016\u0005M\u0000\u0000\u0016"+
		"\u0017\u0005i\u0000\u0000\u0017\u0018\u0005d\u0000\u0000\u0018\u0019\u0005"+
		"n\u0000\u0000\u0019\u001a\u0005i\u0000\u0000\u001a\u001b\u0005g\u0000"+
		"\u0000\u001b\u001c\u0005h\u0000\u0000\u001c4\u0005t\u0000\u0000\u001d"+
		"\u001e\u0005N\u0000\u0000\u001e\u001f\u0005o\u0000\u0000\u001f \u0005"+
		"o\u0000\u0000 4\u0005n\u0000\u0000!\"\u00051\u0000\u0000\"#\u00052\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$%\u0005m\u0000\u0000%&\u0005i\u0000\u0000"+
		"&\'\u0005d\u0000\u0000\'(\u0005n\u0000\u0000()\u0005i\u0000\u0000)*\u0005"+
		"g\u0000\u0000*+\u0005h\u0000\u0000+4\u0005t\u0000\u0000,-\u00051\u0000"+
		"\u0000-.\u00052\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0005n\u0000\u0000"+
		"01\u0005o\u0000\u000012\u0005o\u0000\u000024\u0005n\u0000\u00003\u0015"+
		"\u0001\u0000\u0000\u00003\u001d\u0001\u0000\u0000\u00003!\u0001\u0000"+
		"\u0000\u00003,\u0001\u0000\u0000\u00004\u0004\u0001\u0000\u0000\u0000"+
		"56\u0003\u000b\u0005\u000067\u0003\t\u0004\u000078\u0003\r\u0006\u0000"+
		"89\u0003\u0007\u0003\u00009\u0006\u0001\u0000\u0000\u0000:;\u0005a\u0000"+
		"\u0000;<\u0005.\u0000\u0000<=\u0005m\u0000\u0000=C\u0005.\u0000\u0000"+
		">?\u0005p\u0000\u0000?@\u0005.\u0000\u0000@A\u0005m\u0000\u0000AC\u0005"+
		".\u0000\u0000B:\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000C\b\u0001"+
		"\u0000\u0000\u0000DE\u0005:\u0000\u0000E\n\u0001\u0000\u0000\u0000FJ\u0007"+
		"\u0000\u0000\u0000GH\u00051\u0000\u0000HJ\u0007\u0001\u0000\u0000IF\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000J\f\u0001\u0000\u0000\u0000"+
		"KO\u0007\u0002\u0000\u0000LM\u0007\u0003\u0000\u0000MO\u0007\u0002\u0000"+
		"\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000O\u000e\u0001"+
		"\u0000\u0000\u0000PR\u0007\u0004\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UV\u0006\u0007\u0000\u0000V\u0010\u0001"+
		"\u0000\u0000\u0000\u0007\u0000\u00133BINS\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}