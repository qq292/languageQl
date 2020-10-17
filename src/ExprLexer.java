// Generated from Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ADDADD=11, SUBSUB=12, MUL=13, DIV=14, ADD=15, SUB=16, MOULD=17, 
		DEF=18, RETURN=19, IF=20, EQUAL=21, LESS=22, GREATER=23, UNEQUAL=24, GREATER_EQUAL=25, 
		LESS_EQUAL=26, WHILE=27, FOR=28, BREAK=29, NULL=30, TRUE=31, FALSE=32, 
		ID=33, INT=34, STRING=35, NOTES=36, LINE_NOTES=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "ADDADD", "SUBSUB", "MUL", "DIV", "ADD", "SUB", "MOULD", "DEF", 
			"RETURN", "IF", "EQUAL", "LESS", "GREATER", "UNEQUAL", "GREATER_EQUAL", 
			"LESS_EQUAL", "WHILE", "FOR", "BREAK", "NULL", "TRUE", "FALSE", "ID", 
			"INT", "DECINT", "STRING", "ESC", "NOTES", "LINE_NOTES", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "','", "'{'", "'}'", "'elseif'", "'else'", 
			"';'", "'**'", "'++'", "'--'", "'*'", "'/'", "'+'", "'-'", "'%'", "'def'", 
			"'return'", "'if'", "'=='", "'<'", "'>'", "'!='", "'>='", "'<='", "'while'", 
			"'for'", "'break'", "'null'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ADDADD", 
			"SUBSUB", "MUL", "DIV", "ADD", "SUB", "MOULD", "DEF", "RETURN", "IF", 
			"EQUAL", "LESS", "GREATER", "UNEQUAL", "GREATER_EQUAL", "LESS_EQUAL", 
			"WHILE", "FOR", "BREAK", "NULL", "TRUE", "FALSE", "ID", "INT", "STRING", 
			"NOTES", "LINE_NOTES", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0113\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\6\"\u00c0\n\"\r\""+
		"\16\"\u00c1\3\"\7\"\u00c5\n\"\f\"\16\"\u00c8\13\"\3#\6#\u00cb\n#\r#\16"+
		"#\u00cc\3#\6#\u00d0\n#\r#\16#\u00d1\3$\6$\u00d5\n$\r$\16$\u00d6\3$\3$"+
		"\6$\u00db\n$\r$\16$\u00dc\3%\3%\3%\7%\u00e2\n%\f%\16%\u00e5\13%\3%\3%"+
		"\3&\3&\3&\3&\5&\u00ed\n&\3\'\3\'\3\'\3\'\7\'\u00f3\n\'\f\'\16\'\u00f6"+
		"\13\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\7(\u0101\n(\f(\16(\u0104\13(\3("+
		"\5(\u0107\n(\3(\3(\3(\3(\3)\6)\u010e\n)\r)\16)\u010f\3)\3)\5\u00e3\u00f4"+
		"\u0102\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G\2I%K\2M&O\'Q(\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f"+
		"\17\17\"\"\2\u011e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2I\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2"+
		"\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21f\3\2"+
		"\2\2\23k\3\2\2\2\25m\3\2\2\2\27p\3\2\2\2\31s\3\2\2\2\33v\3\2\2\2\35x\3"+
		"\2\2\2\37z\3\2\2\2!|\3\2\2\2#~\3\2\2\2%\u0080\3\2\2\2\'\u0084\3\2\2\2"+
		")\u008b\3\2\2\2+\u008e\3\2\2\2-\u0091\3\2\2\2/\u0093\3\2\2\2\61\u0095"+
		"\3\2\2\2\63\u0098\3\2\2\2\65\u009b\3\2\2\2\67\u009e\3\2\2\29\u00a4\3\2"+
		"\2\2;\u00a8\3\2\2\2=\u00ae\3\2\2\2?\u00b3\3\2\2\2A\u00b8\3\2\2\2C\u00bf"+
		"\3\2\2\2E\u00cf\3\2\2\2G\u00d4\3\2\2\2I\u00de\3\2\2\2K\u00ec\3\2\2\2M"+
		"\u00ee\3\2\2\2O\u00fc\3\2\2\2Q\u010d\3\2\2\2ST\7*\2\2T\4\3\2\2\2UV\7+"+
		"\2\2V\6\3\2\2\2WX\7?\2\2X\b\3\2\2\2YZ\7.\2\2Z\n\3\2\2\2[\\\7}\2\2\\\f"+
		"\3\2\2\2]^\7\177\2\2^\16\3\2\2\2_`\7g\2\2`a\7n\2\2ab\7u\2\2bc\7g\2\2c"+
		"d\7k\2\2de\7h\2\2e\20\3\2\2\2fg\7g\2\2gh\7n\2\2hi\7u\2\2ij\7g\2\2j\22"+
		"\3\2\2\2kl\7=\2\2l\24\3\2\2\2mn\7,\2\2no\7,\2\2o\26\3\2\2\2pq\7-\2\2q"+
		"r\7-\2\2r\30\3\2\2\2st\7/\2\2tu\7/\2\2u\32\3\2\2\2vw\7,\2\2w\34\3\2\2"+
		"\2xy\7\61\2\2y\36\3\2\2\2z{\7-\2\2{ \3\2\2\2|}\7/\2\2}\"\3\2\2\2~\177"+
		"\7\'\2\2\177$\3\2\2\2\u0080\u0081\7f\2\2\u0081\u0082\7g\2\2\u0082\u0083"+
		"\7h\2\2\u0083&\3\2\2\2\u0084\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7v\2\2\u0087\u0088\7w\2\2\u0088\u0089\7t\2\2\u0089\u008a\7p\2\2\u008a"+
		"(\3\2\2\2\u008b\u008c\7k\2\2\u008c\u008d\7h\2\2\u008d*\3\2\2\2\u008e\u008f"+
		"\7?\2\2\u008f\u0090\7?\2\2\u0090,\3\2\2\2\u0091\u0092\7>\2\2\u0092.\3"+
		"\2\2\2\u0093\u0094\7@\2\2\u0094\60\3\2\2\2\u0095\u0096\7#\2\2\u0096\u0097"+
		"\7?\2\2\u0097\62\3\2\2\2\u0098\u0099\7@\2\2\u0099\u009a\7?\2\2\u009a\64"+
		"\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7?\2\2\u009d\66\3\2\2\2\u009e"+
		"\u009f\7y\2\2\u009f\u00a0\7j\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7n\2\2"+
		"\u00a2\u00a3\7g\2\2\u00a38\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7q\2"+
		"\2\u00a6\u00a7\7t\2\2\u00a7:\3\2\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7"+
		"t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7m\2\2\u00ad<"+
		"\3\2\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7n\2\2\u00b1"+
		"\u00b2\7n\2\2\u00b2>\3\2\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7t\2\2\u00b5"+
		"\u00b6\7w\2\2\u00b6\u00b7\7g\2\2\u00b7@\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9"+
		"\u00ba\7c\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7g\2\2"+
		"\u00bdB\3\2\2\2\u00be\u00c0\t\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c6\3\2\2\2\u00c3"+
		"\u00c5\t\3\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7D\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb"+
		"\t\3\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00d0\5G$\2\u00cf\u00ca\3\2\2"+
		"\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2F\3\2\2\2\u00d3\u00d5\t\3\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00da\7\60\2\2\u00d9\u00db\t\3\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00ddH\3\2\2\2"+
		"\u00de\u00e3\7$\2\2\u00df\u00e2\5K&\2\u00e0\u00e2\13\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7$"+
		"\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7^\2\2\u00e9\u00ed\7$\2\2\u00ea\u00eb"+
		"\7^\2\2\u00eb\u00ed\7^\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"L\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0\7,\2\2\u00f0\u00f4\3\2\2\2"+
		"\u00f1\u00f3\13\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f8\7,\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\b\'"+
		"\2\2\u00fbN\3\2\2\2\u00fc\u00fd\7\61\2\2\u00fd\u00fe\7\61\2\2\u00fe\u0102"+
		"\3\2\2\2\u00ff\u0101\13\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0105\u0107\7\17\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\u0108\3\2\2\2\u0108\u0109\7\f\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\b(\2\2\u010bP\3\2\2\2\u010c\u010e\t\4\2\2\u010d\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\b)\2\2\u0112R\3\2\2\2\21\2\u00c1\u00c6\u00cc\u00cf\u00d1\u00d6"+
		"\u00dc\u00e1\u00e3\u00ec\u00f4\u0102\u0106\u010f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}