// Generated from /home/diki/kuliah/rplsd/tugas dsl/dsl-lecture-scheduling/antlrfiles/Schedule.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScheduleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BasicOperator=15, AssignmentOperator=16, 
		OtherOperator=17, Kind=18, String=19, Integer=20, ArrayOfString=21, WhiteSpace=22;
	public static final int
		RULE_model = 0, RULE_assign = 1, RULE_end = 2;
	public static final String[] ruleNames = {
		"model", "assign", "end"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'nama'", "':'", "','", "'kapasitas'", "'fasilitas'", "'sks'", 
		"'tingkat'", "')'", "'ruang'", "'dosen'", "'hari'", "'jam'", "'durasi'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BasicOperator", "AssignmentOperator", "OtherOperator", 
		"Kind", "String", "Integer", "ArrayOfString", "WhiteSpace"
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

	@Override
	public String getGrammarFileName() { return "Schedule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScheduleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelContext extends ParserRuleContext {
		public TerminalNode BasicOperator() { return getToken(ScheduleParser.BasicOperator, 0); }
		public TerminalNode Kind() { return getToken(ScheduleParser.Kind, 0); }
		public List<TerminalNode> String() { return getTokens(ScheduleParser.String); }
		public TerminalNode String(int i) {
			return getToken(ScheduleParser.String, i);
		}
		public List<TerminalNode> Integer() { return getTokens(ScheduleParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(ScheduleParser.Integer, i);
		}
		public List<TerminalNode> ArrayOfString() { return getTokens(ScheduleParser.ArrayOfString); }
		public TerminalNode ArrayOfString(int i) {
			return getToken(ScheduleParser.ArrayOfString, i);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(BasicOperator);
			setState(7);
			match(Kind);
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==String) {
				{
				setState(8);
				match(String);
				}
			}

			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(11);
				match(T__0);
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(12);
					match(T__1);
					setState(13);
					match(T__2);
					setState(14);
					match(String);
					}
				}

				setState(18);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(17);
					match(T__3);
					}
					break;
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(20);
					match(T__4);
					setState(21);
					match(T__2);
					setState(22);
					match(Integer);
					}
				}

				setState(26);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(25);
					match(T__3);
					}
					break;
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(28);
					match(T__5);
					setState(29);
					match(T__2);
					setState(30);
					match(ArrayOfString);
					}
				}

				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(33);
					match(T__3);
					}
					break;
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(36);
					match(T__6);
					setState(37);
					match(T__2);
					setState(38);
					match(Integer);
					}
				}

				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(41);
					match(T__3);
					}
				}

				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(44);
					match(T__7);
					setState(45);
					match(T__2);
					setState(46);
					match(Integer);
					}
				}

				setState(49);
				match(T__8);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode AssignmentOperator() { return getToken(ScheduleParser.AssignmentOperator, 0); }
		public List<TerminalNode> String() { return getTokens(ScheduleParser.String); }
		public TerminalNode String(int i) {
			return getToken(ScheduleParser.String, i);
		}
		public List<TerminalNode> Integer() { return getTokens(ScheduleParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(ScheduleParser.Integer, i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(AssignmentOperator);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==String) {
				{
				setState(56);
				match(String);
				}
			}

			{
			setState(59);
			match(T__0);
			setState(60);
			match(T__9);
			setState(61);
			match(T__2);
			setState(62);
			match(String);
			setState(63);
			match(T__3);
			setState(64);
			match(T__10);
			setState(65);
			match(T__2);
			setState(66);
			match(String);
			setState(67);
			match(T__3);
			setState(68);
			match(T__11);
			setState(69);
			match(T__2);
			setState(70);
			match(Integer);
			setState(71);
			match(T__3);
			setState(72);
			match(T__12);
			setState(73);
			match(T__2);
			setState(74);
			match(Integer);
			setState(75);
			match(T__3);
			setState(76);
			match(T__13);
			setState(77);
			match(T__2);
			setState(78);
			match(Integer);
			setState(79);
			match(T__8);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode OtherOperator() { return getToken(ScheduleParser.OtherOperator, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(OtherOperator);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\5\2\f\n\2\3\2\3\2\3\2\3\2\5\2\22\n\2\3\2\5\2\25"+
		"\n\2\3\2\3\2\3\2\5\2\32\n\2\3\2\5\2\35\n\2\3\2\3\2\3\2\5\2\"\n\2\3\2\5"+
		"\2%\n\2\3\2\3\2\3\2\5\2*\n\2\3\2\5\2-\n\2\3\2\3\2\3\2\5\2\62\n\2\3\2\7"+
		"\2\65\n\2\f\2\16\28\13\2\3\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\2\2\5\2\4\6\2\2\2^\2\b\3\2\2\2\49\3\2\2\2\6S\3\2\2\2\b\t\7\21\2\2\t"+
		"\13\7\24\2\2\n\f\7\25\2\2\13\n\3\2\2\2\13\f\3\2\2\2\f\66\3\2\2\2\r\21"+
		"\7\3\2\2\16\17\7\4\2\2\17\20\7\5\2\2\20\22\7\25\2\2\21\16\3\2\2\2\21\22"+
		"\3\2\2\2\22\24\3\2\2\2\23\25\7\6\2\2\24\23\3\2\2\2\24\25\3\2\2\2\25\31"+
		"\3\2\2\2\26\27\7\7\2\2\27\30\7\5\2\2\30\32\7\26\2\2\31\26\3\2\2\2\31\32"+
		"\3\2\2\2\32\34\3\2\2\2\33\35\7\6\2\2\34\33\3\2\2\2\34\35\3\2\2\2\35!\3"+
		"\2\2\2\36\37\7\b\2\2\37 \7\5\2\2 \"\7\27\2\2!\36\3\2\2\2!\"\3\2\2\2\""+
		"$\3\2\2\2#%\7\6\2\2$#\3\2\2\2$%\3\2\2\2%)\3\2\2\2&\'\7\t\2\2\'(\7\5\2"+
		"\2(*\7\26\2\2)&\3\2\2\2)*\3\2\2\2*,\3\2\2\2+-\7\6\2\2,+\3\2\2\2,-\3\2"+
		"\2\2-\61\3\2\2\2./\7\n\2\2/\60\7\5\2\2\60\62\7\26\2\2\61.\3\2\2\2\61\62"+
		"\3\2\2\2\62\63\3\2\2\2\63\65\7\13\2\2\64\r\3\2\2\2\658\3\2\2\2\66\64\3"+
		"\2\2\2\66\67\3\2\2\2\67\3\3\2\2\28\66\3\2\2\29;\7\22\2\2:<\7\25\2\2;:"+
		"\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\3\2\2>?\7\f\2\2?@\7\5\2\2@A\7\25\2\2"+
		"AB\7\6\2\2BC\7\r\2\2CD\7\5\2\2DE\7\25\2\2EF\7\6\2\2FG\7\16\2\2GH\7\5\2"+
		"\2HI\7\26\2\2IJ\7\6\2\2JK\7\17\2\2KL\7\5\2\2LM\7\26\2\2MN\7\6\2\2NO\7"+
		"\20\2\2OP\7\5\2\2PQ\7\26\2\2QR\7\13\2\2R\5\3\2\2\2ST\7\23\2\2T\7\3\2\2"+
		"\2\16\13\21\24\31\34!$),\61\66;";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}