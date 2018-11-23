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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, BasicOperator=9, 
		AssignmentOperator=10, OtherOperator=11, Kind=12, Name=13, Class=14, Dosen=15, 
		Capacity=16, Facility=17, Sks=18, Tingkat=19, Day=20, Time=21, WhiteSpace=22;
	public static final int
		RULE_model = 0, RULE_assign = 1, RULE_end = 2;
	public static final String[] ruleNames = {
		"model", "assign", "end"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'kapasitas'", "':'", "','", "'fasilitas'", "'sks'", "'tingkat'", 
		"')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "BasicOperator", 
		"AssignmentOperator", "OtherOperator", "Kind", "Name", "Class", "Dosen", 
		"Capacity", "Facility", "Sks", "Tingkat", "Day", "Time", "WhiteSpace"
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
		public List<TerminalNode> Name() { return getTokens(ScheduleParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(ScheduleParser.Name, i);
		}
		public List<TerminalNode> Capacity() { return getTokens(ScheduleParser.Capacity); }
		public TerminalNode Capacity(int i) {
			return getToken(ScheduleParser.Capacity, i);
		}
		public List<TerminalNode> Facility() { return getTokens(ScheduleParser.Facility); }
		public TerminalNode Facility(int i) {
			return getToken(ScheduleParser.Facility, i);
		}
		public List<TerminalNode> Sks() { return getTokens(ScheduleParser.Sks); }
		public TerminalNode Sks(int i) {
			return getToken(ScheduleParser.Sks, i);
		}
		public List<TerminalNode> Tingkat() { return getTokens(ScheduleParser.Tingkat); }
		public TerminalNode Tingkat(int i) {
			return getToken(ScheduleParser.Tingkat, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(BasicOperator);
			setState(7);
			match(Kind);
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(8);
				match(Name);
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(14);
				match(T__0);
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(15);
					match(T__1);
					setState(16);
					match(T__2);
					setState(17);
					match(Capacity);
					}
					}
					setState(22);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(23);
						match(T__3);
						setState(24);
						match(T__4);
						setState(25);
						match(T__2);
						setState(26);
						match(Facility);
						}
						} 
					}
					setState(31);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(32);
						match(T__3);
						setState(33);
						match(T__5);
						setState(34);
						match(T__2);
						setState(35);
						match(Sks);
						}
						} 
					}
					setState(40);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(41);
					match(T__3);
					setState(42);
					match(T__6);
					setState(43);
					match(T__2);
					setState(44);
					match(Tingkat);
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(50);
				match(T__7);
				}
				}
				setState(55);
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
		public TerminalNode Class() { return getToken(ScheduleParser.Class, 0); }
		public TerminalNode Dosen() { return getToken(ScheduleParser.Dosen, 0); }
		public List<TerminalNode> Name() { return getTokens(ScheduleParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(ScheduleParser.Name, i);
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
			setState(56);
			match(AssignmentOperator);
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				match(Name);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Name );
			{
			setState(62);
			match(T__0);
			setState(63);
			match(Class);
			setState(64);
			match(T__3);
			setState(65);
			match(Dosen);
			setState(66);
			match(T__7);
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
			setState(68);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\3\2\3\2\7\2"+
		"\25\n\2\f\2\16\2\30\13\2\3\2\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2"+
		"\3\2\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\3\3\3\6\3=\n\3\r\3\16\3>\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2L\2\b\3\2\2\2\4:\3"+
		"\2\2\2\6F\3\2\2\2\b\t\7\13\2\2\t\r\7\16\2\2\n\f\7\17\2\2\13\n\3\2\2\2"+
		"\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\67\3\2\2\2\17\r\3\2\2\2\20"+
		"\26\7\3\2\2\21\22\7\4\2\2\22\23\7\5\2\2\23\25\7\22\2\2\24\21\3\2\2\2\25"+
		"\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\37\3\2\2\2\30\26\3\2\2\2\31"+
		"\32\7\6\2\2\32\33\7\7\2\2\33\34\7\5\2\2\34\36\7\23\2\2\35\31\3\2\2\2\36"+
		"!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 (\3\2\2\2!\37\3\2\2\2\"#\7\6\2\2#"+
		"$\7\b\2\2$%\7\5\2\2%\'\7\24\2\2&\"\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2"+
		"\2\2)\61\3\2\2\2*(\3\2\2\2+,\7\6\2\2,-\7\t\2\2-.\7\5\2\2.\60\7\25\2\2"+
		"/+\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61"+
		"\3\2\2\2\64\66\7\n\2\2\65\20\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2"+
		"\2\28\3\3\2\2\29\67\3\2\2\2:<\7\f\2\2;=\7\17\2\2<;\3\2\2\2=>\3\2\2\2>"+
		"<\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\3\2\2AB\7\20\2\2BC\7\6\2\2CD\7\21\2"+
		"\2DE\7\n\2\2E\5\3\2\2\2FG\7\r\2\2G\7\3\2\2\2\t\r\26\37(\61\67>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}