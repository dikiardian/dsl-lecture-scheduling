// Generated from antlrfiles/Schedule.g4 by ANTLR 4.7.1
package antlrfiles;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScheduleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BasicOperator=15, AssignmentOperator=16, 
		OtherOperator=17, Kind=18, Name=19, Class=20, Dosen=21, Capacity=22, Facility=23, 
		Sks=24, Tingkat=25, Day=26, Time=27, Duration=28, WhiteSpace=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "BasicOperator", "AssignmentOperator", 
		"OtherOperator", "Kind", "Name", "Class", "Dosen", "Capacity", "Facility", 
		"Sks", "Tingkat", "Day", "Time", "Duration", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'nama'", "':'", "'kapasitas'", "','", "'fasilitas'", "'sks'", 
		"'tingkat'", "')'", "'ruang'", "'dosen'", "'hari'", "'jam'", "'durasi'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BasicOperator", "AssignmentOperator", "OtherOperator", 
		"Kind", "Name", "Class", "Dosen", "Capacity", "Facility", "Sks", "Tingkat", 
		"Day", "Time", "Duration", "WhiteSpace"
	};
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


	public ScheduleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Schedule.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u014e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009a\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a8\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b2\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00d9\n\23\3\24\3\24\6\24\u00dd\n\24\r\24\16"+
		"\24\u00de\3\24\3\24\3\25\3\25\6\25\u00e5\n\25\r\25\16\25\u00e6\3\25\3"+
		"\25\3\26\3\26\6\26\u00ed\n\26\r\26\16\26\u00ee\3\26\3\26\3\27\6\27\u00f4"+
		"\n\27\r\27\16\27\u00f5\3\30\3\30\7\30\u00fa\n\30\f\30\16\30\u00fd\13\30"+
		"\3\30\3\30\6\30\u0101\n\30\r\30\16\30\u0102\3\30\6\30\u0106\n\30\r\30"+
		"\16\30\u0107\3\30\7\30\u010b\n\30\f\30\16\30\u010e\13\30\3\30\3\30\7\30"+
		"\u0112\n\30\f\30\16\30\u0115\13\30\3\30\3\30\6\30\u0119\n\30\r\30\16\30"+
		"\u011a\3\30\6\30\u011e\n\30\r\30\16\30\u011f\7\30\u0122\n\30\f\30\16\30"+
		"\u0125\13\30\3\30\7\30\u0128\n\30\f\30\16\30\u012b\13\30\3\30\3\30\3\31"+
		"\6\31\u0130\n\31\r\31\16\31\u0131\3\32\6\32\u0135\n\32\r\32\16\32\u0136"+
		"\3\33\6\33\u013a\n\33\r\33\16\33\u013b\3\34\6\34\u013f\n\34\r\34\16\34"+
		"\u0140\3\35\6\35\u0144\n\35\r\35\16\35\u0145\3\36\6\36\u0149\n\36\r\36"+
		"\16\36\u014a\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37\3\2\5\3\2$$\3\2\62;\5\2\13\f\17\17\"\"\2"+
		"\u0169\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7D\3\2\2\2\tF\3\2\2\2\13P\3\2\2\2"+
		"\rR\3\2\2\2\17\\\3\2\2\2\21`\3\2\2\2\23h\3\2\2\2\25j\3\2\2\2\27p\3\2\2"+
		"\2\31v\3\2\2\2\33{\3\2\2\2\35\177\3\2\2\2\37\u0099\3\2\2\2!\u00a7\3\2"+
		"\2\2#\u00b1\3\2\2\2%\u00d8\3\2\2\2\'\u00da\3\2\2\2)\u00e2\3\2\2\2+\u00ea"+
		"\3\2\2\2-\u00f3\3\2\2\2/\u00f7\3\2\2\2\61\u012f\3\2\2\2\63\u0134\3\2\2"+
		"\2\65\u0139\3\2\2\2\67\u013e\3\2\2\29\u0143\3\2\2\2;\u0148\3\2\2\2=>\7"+
		"*\2\2>\4\3\2\2\2?@\7p\2\2@A\7c\2\2AB\7o\2\2BC\7c\2\2C\6\3\2\2\2DE\7<\2"+
		"\2E\b\3\2\2\2FG\7m\2\2GH\7c\2\2HI\7r\2\2IJ\7c\2\2JK\7u\2\2KL\7k\2\2LM"+
		"\7v\2\2MN\7c\2\2NO\7u\2\2O\n\3\2\2\2PQ\7.\2\2Q\f\3\2\2\2RS\7h\2\2ST\7"+
		"c\2\2TU\7u\2\2UV\7k\2\2VW\7n\2\2WX\7k\2\2XY\7v\2\2YZ\7c\2\2Z[\7u\2\2["+
		"\16\3\2\2\2\\]\7u\2\2]^\7m\2\2^_\7u\2\2_\20\3\2\2\2`a\7v\2\2ab\7k\2\2"+
		"bc\7p\2\2cd\7i\2\2de\7m\2\2ef\7c\2\2fg\7v\2\2g\22\3\2\2\2hi\7+\2\2i\24"+
		"\3\2\2\2jk\7t\2\2kl\7w\2\2lm\7c\2\2mn\7p\2\2no\7i\2\2o\26\3\2\2\2pq\7"+
		"f\2\2qr\7q\2\2rs\7u\2\2st\7g\2\2tu\7p\2\2u\30\3\2\2\2vw\7j\2\2wx\7c\2"+
		"\2xy\7t\2\2yz\7k\2\2z\32\3\2\2\2{|\7l\2\2|}\7c\2\2}~\7o\2\2~\34\3\2\2"+
		"\2\177\u0080\7f\2\2\u0080\u0081\7w\2\2\u0081\u0082\7t\2\2\u0082\u0083"+
		"\7c\2\2\u0083\u0084\7u\2\2\u0084\u0085\7k\2\2\u0085\36\3\2\2\2\u0086\u0087"+
		"\7C\2\2\u0087\u0088\7F\2\2\u0088\u009a\7F\2\2\u0089\u008a\7F\2\2\u008a"+
		"\u008b\7G\2\2\u008b\u008c\7N\2\2\u008c\u008d\7G\2\2\u008d\u008e\7V\2\2"+
		"\u008e\u009a\7G\2\2\u008f\u0090\7W\2\2\u0090\u0091\7R\2\2\u0091\u0092"+
		"\7F\2\2\u0092\u0093\7C\2\2\u0093\u0094\7V\2\2\u0094\u009a\7G\2\2\u0095"+
		"\u0096\7U\2\2\u0096\u0097\7J\2\2\u0097\u0098\7Q\2\2\u0098\u009a\7Y\2\2"+
		"\u0099\u0086\3\2\2\2\u0099\u0089\3\2\2\2\u0099\u008f\3\2\2\2\u0099\u0095"+
		"\3\2\2\2\u009a \3\2\2\2\u009b\u009c\7C\2\2\u009c\u009d\7U\2\2\u009d\u009e"+
		"\7U\2\2\u009e\u009f\7K\2\2\u009f\u00a0\7I\2\2\u00a0\u00a8\7P\2\2\u00a1"+
		"\u00a2\7T\2\2\u00a2\u00a3\7G\2\2\u00a3\u00a4\7O\2\2\u00a4\u00a5\7Q\2\2"+
		"\u00a5\u00a6\7X\2\2\u00a6\u00a8\7G\2\2\u00a7\u009b\3\2\2\2\u00a7\u00a1"+
		"\3\2\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7G\2\2\u00aa\u00ab\7Z\2\2\u00ab\u00ac"+
		"\7K\2\2\u00ac\u00b2\7V\2\2\u00ad\u00ae\7J\2\2\u00ae\u00af\7G\2\2\u00af"+
		"\u00b0\7N\2\2\u00b0\u00b2\7R\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ad\3\2\2"+
		"\2\u00b2$\3\2\2\2\u00b3\u00b4\7F\2\2\u00b4\u00b5\7Q\2\2\u00b5\u00b6\7"+
		"U\2\2\u00b6\u00b7\7G\2\2\u00b7\u00d9\7P\2\2\u00b8\u00b9\7T\2\2\u00b9\u00ba"+
		"\7W\2\2\u00ba\u00bb\7C\2\2\u00bb\u00bc\7P\2\2\u00bc\u00bd\7I\2\2\u00bd"+
		"\u00be\7C\2\2\u00be\u00d9\7P\2\2\u00bf\u00c0\7H\2\2\u00c0\u00c1\7C\2\2"+
		"\u00c1\u00c2\7U\2\2\u00c2\u00c3\7K\2\2\u00c3\u00c4\7N\2\2\u00c4\u00c5"+
		"\7K\2\2\u00c5\u00c6\7V\2\2\u00c6\u00c7\7C\2\2\u00c7\u00d9\7U\2\2\u00c8"+
		"\u00c9\7O\2\2\u00c9\u00ca\7C\2\2\u00ca\u00cb\7V\2\2\u00cb\u00cc\7C\2\2"+
		"\u00cc\u00cd\7M\2\2\u00cd\u00ce\7W\2\2\u00ce\u00cf\7N\2\2\u00cf\u00d0"+
		"\7K\2\2\u00d0\u00d1\7C\2\2\u00d1\u00d9\7J\2\2\u00d2\u00d3\7L\2\2\u00d3"+
		"\u00d4\7C\2\2\u00d4\u00d5\7F\2\2\u00d5\u00d6\7Y\2\2\u00d6\u00d7\7C\2\2"+
		"\u00d7\u00d9\7N\2\2\u00d8\u00b3\3\2\2\2\u00d8\u00b8\3\2\2\2\u00d8\u00bf"+
		"\3\2\2\2\u00d8\u00c8\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d9&\3\2\2\2\u00da"+
		"\u00dc\7$\2\2\u00db\u00dd\n\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\7$\2\2\u00e1(\3\2\2\2\u00e2\u00e4\7$\2\2\u00e3\u00e5\n\2\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7$\2\2\u00e9*\3\2\2\2\u00ea\u00ec"+
		"\7$\2\2\u00eb\u00ed\n\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7$"+
		"\2\2\u00f1,\3\2\2\2\u00f2\u00f4\t\3\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6.\3\2\2\2\u00f7"+
		"\u00fb\7]\2\2\u00f8\u00fa\5;\36\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0105\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u0100\7$\2\2\u00ff\u0101\n\2\2\2\u0100\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0106\7$\2\2\u0105\u00fe\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0123\3\2\2\2\u0109"+
		"\u010b\5;\36\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0113\7.\2\2\u0110\u0112\5;\36\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u011d\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0118\7$\2\2\u0117\u0119\n\2\2\2\u0118\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011e\7$\2\2\u011d\u0116\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u010c\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0129\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0128\5;\36\2\u0127"+
		"\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7_\2\2\u012d"+
		"\60\3\2\2\2\u012e\u0130\t\3\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2"+
		"\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\62\3\2\2\2\u0133\u0135"+
		"\t\3\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\64\3\2\2\2\u0138\u013a\t\3\2\2\u0139\u0138\3\2\2"+
		"\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\66"+
		"\3\2\2\2\u013d\u013f\t\3\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u01418\3\2\2\2\u0142\u0144\t\3\2\2"+
		"\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146:\3\2\2\2\u0147\u0149\t\4\2\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014d\b\36\2\2\u014d<\3\2\2\2\32\2\u0099\u00a7\u00b1\u00d8"+
		"\u00de\u00e6\u00ee\u00f5\u00fb\u0102\u0107\u010c\u0113\u011a\u011f\u0123"+
		"\u0129\u0131\u0136\u013b\u0140\u0145\u014a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}