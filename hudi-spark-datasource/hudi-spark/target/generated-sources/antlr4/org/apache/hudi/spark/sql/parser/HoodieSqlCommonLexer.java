// Generated from org/apache/hudi/spark/sql/parser/HoodieSqlCommon.g4 by ANTLR 4.7
package org.apache.hudi.spark.sql.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HoodieSqlCommonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LEFT_PAREN=3, RIGHT_PAREN=4, COMMA=5, DOT=6, ALL=7, AT=8, 
		CALL=9, COMPACTION=10, RUN=11, SCHEDULE=12, ON=13, SHOW=14, LIMIT=15, 
		MAP=16, NULL=17, TRUE=18, FALSE=19, INTERVAL=20, TO=21, CREATE=22, INDEX=23, 
		INDEXES=24, IF=25, NOT=26, EXISTS=27, TABLE=28, USING=29, OPTIONS=30, 
		DROP=31, FROM=32, IN=33, REFRESH=34, EQ=35, PLUS=36, MINUS=37, STRING=38, 
		BIGINT_LITERAL=39, SMALLINT_LITERAL=40, TINYINT_LITERAL=41, INTEGER_VALUE=42, 
		EXPONENT_VALUE=43, DECIMAL_VALUE=44, FLOAT_LITERAL=45, DOUBLE_LITERAL=46, 
		BIGDECIMAL_LITERAL=47, IDENTIFIER=48, BACKQUOTED_IDENTIFIER=49, SIMPLE_COMMENT=50, 
		BRACKETED_COMMENT=51, WS=52, UNRECOGNIZED=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "LEFT_PAREN", "RIGHT_PAREN", "COMMA", "DOT", "ALL", "AT", 
		"CALL", "COMPACTION", "RUN", "SCHEDULE", "ON", "SHOW", "LIMIT", "MAP", 
		"NULL", "TRUE", "FALSE", "INTERVAL", "TO", "CREATE", "INDEX", "INDEXES", 
		"IF", "NOT", "EXISTS", "TABLE", "USING", "OPTIONS", "DROP", "FROM", "IN", 
		"REFRESH", "EQ", "PLUS", "MINUS", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
		"TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", "DECIMAL_VALUE", 
		"FLOAT_LITERAL", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
		"BACKQUOTED_IDENTIFIER", "DECIMAL_DIGITS", "EXPONENT", "DIGIT", "LETTER", 
		"SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'=>'", "'('", "')'", "','", "'.'", "'ALL'", "'AT'", "'CALL'", 
		"'COMPACTION'", "'RUN'", "'SCHEDULE'", "'ON'", "'SHOW'", "'LIMIT'", "'MAP'", 
		"'NULL'", "'TRUE'", "'FALSE'", "'INTERVAL'", "'TO'", "'CREATE'", "'INDEX'", 
		"'INDEXES'", "'IF'", "'NOT'", "'EXISTS'", "'TABLE'", "'USING'", "'OPTIONS'", 
		"'DROP'", "'FROM'", "'IN'", "'REFRESH'", null, "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "LEFT_PAREN", "RIGHT_PAREN", "COMMA", "DOT", "ALL", 
		"AT", "CALL", "COMPACTION", "RUN", "SCHEDULE", "ON", "SHOW", "LIMIT", 
		"MAP", "NULL", "TRUE", "FALSE", "INTERVAL", "TO", "CREATE", "INDEX", "INDEXES", 
		"IF", "NOT", "EXISTS", "TABLE", "USING", "OPTIONS", "DROP", "FROM", "IN", 
		"REFRESH", "EQ", "PLUS", "MINUS", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
		"TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", "DECIMAL_VALUE", 
		"FLOAT_LITERAL", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
		"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
		"UNRECOGNIZED"
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


	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }


	public HoodieSqlCommonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HoodieSqlCommon.g4"; }

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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42:
			return EXPONENT_VALUE_sempred((RuleContext)_localctx, predIndex);
		case 43:
			return DECIMAL_VALUE_sempred((RuleContext)_localctx, predIndex);
		case 44:
			return FLOAT_LITERAL_sempred((RuleContext)_localctx, predIndex);
		case 45:
			return DOUBLE_LITERAL_sempred((RuleContext)_localctx, predIndex);
		case 46:
			return BIGDECIMAL_LITERAL_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean EXPONENT_VALUE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return isValidDecimal();
		}
		return true;
	}
	private boolean DECIMAL_VALUE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return isValidDecimal();
		}
		return true;
	}
	private boolean FLOAT_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return isValidDecimal();
		}
		return true;
	}
	private boolean DOUBLE_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return isValidDecimal();
		}
		return true;
	}
	private boolean BIGDECIMAL_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return isValidDecimal();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0200\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\5$\u0124\n$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\7\'\u012e\n\'\f\'\16\'\u0131"+
		"\13\'\3\'\3\'\3\'\3\'\3\'\7\'\u0138\n\'\f\'\16\'\u013b\13\'\3\'\5\'\u013e"+
		"\n\'\3(\6(\u0141\n(\r(\16(\u0142\3(\3(\3)\6)\u0148\n)\r)\16)\u0149\3)"+
		"\3)\3*\6*\u014f\n*\r*\16*\u0150\3*\3*\3+\6+\u0156\n+\r+\16+\u0157\3,\6"+
		",\u015b\n,\r,\16,\u015c\3,\3,\3,\3,\3,\3,\5,\u0165\n,\3-\3-\3-\3.\6.\u016b"+
		"\n.\r.\16.\u016c\3.\5.\u0170\n.\3.\3.\3.\3.\5.\u0176\n.\3.\3.\3.\5.\u017b"+
		"\n.\3/\6/\u017e\n/\r/\16/\u017f\3/\5/\u0183\n/\3/\3/\3/\3/\5/\u0189\n"+
		"/\3/\3/\3/\5/\u018e\n/\3\60\6\60\u0191\n\60\r\60\16\60\u0192\3\60\5\60"+
		"\u0196\n\60\3\60\3\60\3\60\3\60\3\60\5\60\u019d\n\60\3\60\3\60\3\60\3"+
		"\60\3\60\5\60\u01a4\n\60\3\61\3\61\3\61\6\61\u01a9\n\61\r\61\16\61\u01aa"+
		"\3\62\3\62\3\62\3\62\7\62\u01b1\n\62\f\62\16\62\u01b4\13\62\3\62\3\62"+
		"\3\63\6\63\u01b9\n\63\r\63\16\63\u01ba\3\63\3\63\7\63\u01bf\n\63\f\63"+
		"\16\63\u01c2\13\63\3\63\3\63\6\63\u01c6\n\63\r\63\16\63\u01c7\5\63\u01ca"+
		"\n\63\3\64\3\64\5\64\u01ce\n\64\3\64\6\64\u01d1\n\64\r\64\16\64\u01d2"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u01dd\n\67\f\67\16\67\u01e0"+
		"\13\67\3\67\5\67\u01e3\n\67\3\67\5\67\u01e6\n\67\3\67\3\67\38\38\38\3"+
		"8\78\u01ee\n8\f8\168\u01f1\138\38\38\38\38\38\39\69\u01f9\n9\r9\169\u01fa"+
		"\39\39\3:\3:\3\u01ef\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\2g\2i\2k\2m\64o\65q\66s\67\3\2\n\4\2))^^\4\2$$^^\3\2bb\4\2--//\3"+
		"\2\62;\3\2C\\\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0223\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7z"+
		"\3\2\2\2\t|\3\2\2\2\13~\3\2\2\2\r\u0080\3\2\2\2\17\u0082\3\2\2\2\21\u0086"+
		"\3\2\2\2\23\u0089\3\2\2\2\25\u008e\3\2\2\2\27\u0099\3\2\2\2\31\u009d\3"+
		"\2\2\2\33\u00a6\3\2\2\2\35\u00a9\3\2\2\2\37\u00ae\3\2\2\2!\u00b4\3\2\2"+
		"\2#\u00b8\3\2\2\2%\u00bd\3\2\2\2\'\u00c2\3\2\2\2)\u00c8\3\2\2\2+\u00d1"+
		"\3\2\2\2-\u00d4\3\2\2\2/\u00db\3\2\2\2\61\u00e1\3\2\2\2\63\u00e9\3\2\2"+
		"\2\65\u00ec\3\2\2\2\67\u00f0\3\2\2\29\u00f7\3\2\2\2;\u00fd\3\2\2\2=\u0103"+
		"\3\2\2\2?\u010b\3\2\2\2A\u0110\3\2\2\2C\u0115\3\2\2\2E\u0118\3\2\2\2G"+
		"\u0123\3\2\2\2I\u0125\3\2\2\2K\u0127\3\2\2\2M\u013d\3\2\2\2O\u0140\3\2"+
		"\2\2Q\u0147\3\2\2\2S\u014e\3\2\2\2U\u0155\3\2\2\2W\u0164\3\2\2\2Y\u0166"+
		"\3\2\2\2[\u017a\3\2\2\2]\u018d\3\2\2\2_\u01a3\3\2\2\2a\u01a8\3\2\2\2c"+
		"\u01ac\3\2\2\2e\u01c9\3\2\2\2g\u01cb\3\2\2\2i\u01d4\3\2\2\2k\u01d6\3\2"+
		"\2\2m\u01d8\3\2\2\2o\u01e9\3\2\2\2q\u01f8\3\2\2\2s\u01fe\3\2\2\2uv\7="+
		"\2\2v\4\3\2\2\2wx\7?\2\2xy\7@\2\2y\6\3\2\2\2z{\7*\2\2{\b\3\2\2\2|}\7+"+
		"\2\2}\n\3\2\2\2~\177\7.\2\2\177\f\3\2\2\2\u0080\u0081\7\60\2\2\u0081\16"+
		"\3\2\2\2\u0082\u0083\7C\2\2\u0083\u0084\7N\2\2\u0084\u0085\7N\2\2\u0085"+
		"\20\3\2\2\2\u0086\u0087\7C\2\2\u0087\u0088\7V\2\2\u0088\22\3\2\2\2\u0089"+
		"\u008a\7E\2\2\u008a\u008b\7C\2\2\u008b\u008c\7N\2\2\u008c\u008d\7N\2\2"+
		"\u008d\24\3\2\2\2\u008e\u008f\7E\2\2\u008f\u0090\7Q\2\2\u0090\u0091\7"+
		"O\2\2\u0091\u0092\7R\2\2\u0092\u0093\7C\2\2\u0093\u0094\7E\2\2\u0094\u0095"+
		"\7V\2\2\u0095\u0096\7K\2\2\u0096\u0097\7Q\2\2\u0097\u0098\7P\2\2\u0098"+
		"\26\3\2\2\2\u0099\u009a\7T\2\2\u009a\u009b\7W\2\2\u009b\u009c\7P\2\2\u009c"+
		"\30\3\2\2\2\u009d\u009e\7U\2\2\u009e\u009f\7E\2\2\u009f\u00a0\7J\2\2\u00a0"+
		"\u00a1\7G\2\2\u00a1\u00a2\7F\2\2\u00a2\u00a3\7W\2\2\u00a3\u00a4\7N\2\2"+
		"\u00a4\u00a5\7G\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a8\7"+
		"P\2\2\u00a8\34\3\2\2\2\u00a9\u00aa\7U\2\2\u00aa\u00ab\7J\2\2\u00ab\u00ac"+
		"\7Q\2\2\u00ac\u00ad\7Y\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7N\2\2\u00af\u00b0"+
		"\7K\2\2\u00b0\u00b1\7O\2\2\u00b1\u00b2\7K\2\2\u00b2\u00b3\7V\2\2\u00b3"+
		" \3\2\2\2\u00b4\u00b5\7O\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7\7R\2\2\u00b7"+
		"\"\3\2\2\2\u00b8\u00b9\7P\2\2\u00b9\u00ba\7W\2\2\u00ba\u00bb\7N\2\2\u00bb"+
		"\u00bc\7N\2\2\u00bc$\3\2\2\2\u00bd\u00be\7V\2\2\u00be\u00bf\7T\2\2\u00bf"+
		"\u00c0\7W\2\2\u00c0\u00c1\7G\2\2\u00c1&\3\2\2\2\u00c2\u00c3\7H\2\2\u00c3"+
		"\u00c4\7C\2\2\u00c4\u00c5\7N\2\2\u00c5\u00c6\7U\2\2\u00c6\u00c7\7G\2\2"+
		"\u00c7(\3\2\2\2\u00c8\u00c9\7K\2\2\u00c9\u00ca\7P\2\2\u00ca\u00cb\7V\2"+
		"\2\u00cb\u00cc\7G\2\2\u00cc\u00cd\7T\2\2\u00cd\u00ce\7X\2\2\u00ce\u00cf"+
		"\7C\2\2\u00cf\u00d0\7N\2\2\u00d0*\3\2\2\2\u00d1\u00d2\7V\2\2\u00d2\u00d3"+
		"\7Q\2\2\u00d3,\3\2\2\2\u00d4\u00d5\7E\2\2\u00d5\u00d6\7T\2\2\u00d6\u00d7"+
		"\7G\2\2\u00d7\u00d8\7C\2\2\u00d8\u00d9\7V\2\2\u00d9\u00da\7G\2\2\u00da"+
		".\3\2\2\2\u00db\u00dc\7K\2\2\u00dc\u00dd\7P\2\2\u00dd\u00de\7F\2\2\u00de"+
		"\u00df\7G\2\2\u00df\u00e0\7Z\2\2\u00e0\60\3\2\2\2\u00e1\u00e2\7K\2\2\u00e2"+
		"\u00e3\7P\2\2\u00e3\u00e4\7F\2\2\u00e4\u00e5\7G\2\2\u00e5\u00e6\7Z\2\2"+
		"\u00e6\u00e7\7G\2\2\u00e7\u00e8\7U\2\2\u00e8\62\3\2\2\2\u00e9\u00ea\7"+
		"K\2\2\u00ea\u00eb\7H\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7P\2\2\u00ed\u00ee"+
		"\7Q\2\2\u00ee\u00ef\7V\2\2\u00ef\66\3\2\2\2\u00f0\u00f1\7G\2\2\u00f1\u00f2"+
		"\7Z\2\2\u00f2\u00f3\7K\2\2\u00f3\u00f4\7U\2\2\u00f4\u00f5\7V\2\2\u00f5"+
		"\u00f6\7U\2\2\u00f68\3\2\2\2\u00f7\u00f8\7V\2\2\u00f8\u00f9\7C\2\2\u00f9"+
		"\u00fa\7D\2\2\u00fa\u00fb\7N\2\2\u00fb\u00fc\7G\2\2\u00fc:\3\2\2\2\u00fd"+
		"\u00fe\7W\2\2\u00fe\u00ff\7U\2\2\u00ff\u0100\7K\2\2\u0100\u0101\7P\2\2"+
		"\u0101\u0102\7I\2\2\u0102<\3\2\2\2\u0103\u0104\7Q\2\2\u0104\u0105\7R\2"+
		"\2\u0105\u0106\7V\2\2\u0106\u0107\7K\2\2\u0107\u0108\7Q\2\2\u0108\u0109"+
		"\7P\2\2\u0109\u010a\7U\2\2\u010a>\3\2\2\2\u010b\u010c\7F\2\2\u010c\u010d"+
		"\7T\2\2\u010d\u010e\7Q\2\2\u010e\u010f\7R\2\2\u010f@\3\2\2\2\u0110\u0111"+
		"\7H\2\2\u0111\u0112\7T\2\2\u0112\u0113\7Q\2\2\u0113\u0114\7O\2\2\u0114"+
		"B\3\2\2\2\u0115\u0116\7K\2\2\u0116\u0117\7P\2\2\u0117D\3\2\2\2\u0118\u0119"+
		"\7T\2\2\u0119\u011a\7G\2\2\u011a\u011b\7H\2\2\u011b\u011c\7T\2\2\u011c"+
		"\u011d\7G\2\2\u011d\u011e\7U\2\2\u011e\u011f\7J\2\2\u011fF\3\2\2\2\u0120"+
		"\u0124\7?\2\2\u0121\u0122\7?\2\2\u0122\u0124\7?\2\2\u0123\u0120\3\2\2"+
		"\2\u0123\u0121\3\2\2\2\u0124H\3\2\2\2\u0125\u0126\7-\2\2\u0126J\3\2\2"+
		"\2\u0127\u0128\7/\2\2\u0128L\3\2\2\2\u0129\u012f\7)\2\2\u012a\u012e\n"+
		"\2\2\2\u012b\u012c\7^\2\2\u012c\u012e\13\2\2\2\u012d\u012a\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u013e\7)\2\2\u0133"+
		"\u0139\7$\2\2\u0134\u0138\n\3\2\2\u0135\u0136\7^\2\2\u0136\u0138\13\2"+
		"\2\2\u0137\u0134\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013c\u013e\7$\2\2\u013d\u0129\3\2\2\2\u013d\u0133\3\2\2\2\u013e"+
		"N\3\2\2\2\u013f\u0141\5i\65\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2"+
		"\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145"+
		"\7N\2\2\u0145P\3\2\2\2\u0146\u0148\5i\65\2\u0147\u0146\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014c\7U\2\2\u014cR\3\2\2\2\u014d\u014f\5i\65\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\7[\2\2\u0153T\3\2\2\2\u0154\u0156\5i\65\2\u0155\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"V\3\2\2\2\u0159\u015b\5i\65\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2"+
		"\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f"+
		"\5g\64\2\u015f\u0165\3\2\2\2\u0160\u0161\5e\63\2\u0161\u0162\5g\64\2\u0162"+
		"\u0163\6,\2\2\u0163\u0165\3\2\2\2\u0164\u015a\3\2\2\2\u0164\u0160\3\2"+
		"\2\2\u0165X\3\2\2\2\u0166\u0167\5e\63\2\u0167\u0168\6-\3\2\u0168Z\3\2"+
		"\2\2\u0169\u016b\5i\65\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0170\5g"+
		"\64\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0172\7H\2\2\u0172\u017b\3\2\2\2\u0173\u0175\5e\63\2\u0174\u0176\5g\64"+
		"\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178"+
		"\7H\2\2\u0178\u0179\6.\4\2\u0179\u017b\3\2\2\2\u017a\u016a\3\2\2\2\u017a"+
		"\u0173\3\2\2\2\u017b\\\3\2\2\2\u017c\u017e\5i\65\2\u017d\u017c\3\2\2\2"+
		"\u017e\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182"+
		"\3\2\2\2\u0181\u0183\5g\64\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\7F\2\2\u0185\u018e\3\2\2\2\u0186\u0188\5e\63"+
		"\2\u0187\u0189\5g\64\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018b\7F\2\2\u018b\u018c\6/\5\2\u018c\u018e\3\2\2\2\u018d"+
		"\u017d\3\2\2\2\u018d\u0186\3\2\2\2\u018e^\3\2\2\2\u018f\u0191\5i\65\2"+
		"\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0196\5g\64\2\u0195\u0194\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7D\2\2\u0198\u0199\7F\2"+
		"\2\u0199\u01a4\3\2\2\2\u019a\u019c\5e\63\2\u019b\u019d\5g\64\2\u019c\u019b"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\7D\2\2\u019f"+
		"\u01a0\7F\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\6\60\6\2\u01a2\u01a4\3\2"+
		"\2\2\u01a3\u0190\3\2\2\2\u01a3\u019a\3\2\2\2\u01a4`\3\2\2\2\u01a5\u01a9"+
		"\5k\66\2\u01a6\u01a9\5i\65\2\u01a7\u01a9\7a\2\2\u01a8\u01a5\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3\2"+
		"\2\2\u01aa\u01ab\3\2\2\2\u01abb\3\2\2\2\u01ac\u01b2\7b\2\2\u01ad\u01b1"+
		"\n\4\2\2\u01ae\u01af\7b\2\2\u01af\u01b1\7b\2\2\u01b0\u01ad\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7b\2\2\u01b6"+
		"d\3\2\2\2\u01b7\u01b9\5i\65\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2"+
		"\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c0"+
		"\7\60\2\2\u01bd\u01bf\5i\65\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2"+
		"\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01ca\3\2\2\2\u01c2\u01c0"+
		"\3\2\2\2\u01c3\u01c5\7\60\2\2\u01c4\u01c6\5i\65\2\u01c5\u01c4\3\2\2\2"+
		"\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca"+
		"\3\2\2\2\u01c9\u01b8\3\2\2\2\u01c9\u01c3\3\2\2\2\u01caf\3\2\2\2\u01cb"+
		"\u01cd\7G\2\2\u01cc\u01ce\t\5\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2"+
		"\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01d1\5i\65\2\u01d0\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3h\3\2\2\2"+
		"\u01d4\u01d5\t\6\2\2\u01d5j\3\2\2\2\u01d6\u01d7\t\7\2\2\u01d7l\3\2\2\2"+
		"\u01d8\u01d9\7/\2\2\u01d9\u01da\7/\2\2\u01da\u01de\3\2\2\2\u01db\u01dd"+
		"\n\b\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e3\7\17"+
		"\2\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4"+
		"\u01e6\7\f\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2"+
		"\2\2\u01e7\u01e8\b\67\2\2\u01e8n\3\2\2\2\u01e9\u01ea\7\61\2\2\u01ea\u01eb"+
		"\7,\2\2\u01eb\u01ef\3\2\2\2\u01ec\u01ee\13\2\2\2\u01ed\u01ec\3\2\2\2\u01ee"+
		"\u01f1\3\2\2\2\u01ef\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f2\3\2"+
		"\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\7,\2\2\u01f3\u01f4\7\61\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f6\b8\2\2\u01f6p\3\2\2\2\u01f7\u01f9\t\t\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\b9\2\2\u01fdr\3\2\2\2\u01fe\u01ff"+
		"\13\2\2\2\u01fft\3\2\2\2*\2\u0123\u012d\u012f\u0137\u0139\u013d\u0142"+
		"\u0149\u0150\u0157\u015c\u0164\u016c\u016f\u0175\u017a\u017f\u0182\u0188"+
		"\u018d\u0192\u0195\u019c\u01a3\u01a8\u01aa\u01b0\u01b2\u01ba\u01c0\u01c7"+
		"\u01c9\u01cd\u01d2\u01de\u01e2\u01e5\u01ef\u01fa\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}