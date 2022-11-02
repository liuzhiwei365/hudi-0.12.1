// Generated from org/apache/hudi/spark/sql/parser/HoodieSqlCommon.g4 by ANTLR 4.7
package org.apache.hudi.spark.sql.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HoodieSqlCommonParser extends Parser {
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
	public static final int
		RULE_singleStatement = 0, RULE_statement = 1, RULE_compactionStatement = 2, 
		RULE_tableIdentifier = 3, RULE_callArgument = 4, RULE_expression = 5, 
		RULE_constant = 6, RULE_stringMap = 7, RULE_booleanValue = 8, RULE_number = 9, 
		RULE_multipartIdentifierPropertyList = 10, RULE_multipartIdentifierProperty = 11, 
		RULE_multipartIdentifier = 12, RULE_identifier = 13, RULE_quotedIdentifier = 14, 
		RULE_nonReserved = 15, RULE_propertyList = 16, RULE_property = 17, RULE_propertyKey = 18, 
		RULE_propertyValue = 19;
	public static final String[] ruleNames = {
		"singleStatement", "statement", "compactionStatement", "tableIdentifier", 
		"callArgument", "expression", "constant", "stringMap", "booleanValue", 
		"number", "multipartIdentifierPropertyList", "multipartIdentifierProperty", 
		"multipartIdentifier", "identifier", "quotedIdentifier", "nonReserved", 
		"propertyList", "property", "propertyKey", "propertyValue"
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

	@Override
	public String getGrammarFileName() { return "HoodieSqlCommon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HoodieSqlCommonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HoodieSqlCommonParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			statement();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(41);
				match(T__0);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends StatementContext {
		public TerminalNode CALL() { return getToken(HoodieSqlCommonParser.CALL, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public List<CallArgumentContext> callArgument() {
			return getRuleContexts(CallArgumentContext.class);
		}
		public CallArgumentContext callArgument(int i) {
			return getRuleContext(CallArgumentContext.class,i);
		}
		public CallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshIndexContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(HoodieSqlCommonParser.REFRESH, 0); }
		public TerminalNode INDEX() { return getToken(HoodieSqlCommonParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(HoodieSqlCommonParser.TABLE, 0); }
		public RefreshIndexContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterRefreshIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitRefreshIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitRefreshIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PassThroughContext extends StatementContext {
		public PassThroughContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterPassThrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitPassThrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitPassThrough(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowIndexesContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(HoodieSqlCommonParser.SHOW, 0); }
		public TerminalNode INDEXES() { return getToken(HoodieSqlCommonParser.INDEXES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(HoodieSqlCommonParser.FROM, 0); }
		public TerminalNode IN() { return getToken(HoodieSqlCommonParser.IN, 0); }
		public TerminalNode TABLE() { return getToken(HoodieSqlCommonParser.TABLE, 0); }
		public ShowIndexesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterShowIndexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitShowIndexes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitShowIndexes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateIndexContext extends StatementContext {
		public IdentifierContext indexType;
		public MultipartIdentifierPropertyListContext columns;
		public PropertyListContext indexOptions;
		public TerminalNode CREATE() { return getToken(HoodieSqlCommonParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(HoodieSqlCommonParser.INDEX, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(HoodieSqlCommonParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(HoodieSqlCommonParser.RIGHT_PAREN, 0); }
		public MultipartIdentifierPropertyListContext multipartIdentifierPropertyList() {
			return getRuleContext(MultipartIdentifierPropertyListContext.class,0);
		}
		public TerminalNode IF() { return getToken(HoodieSqlCommonParser.IF, 0); }
		public TerminalNode NOT() { return getToken(HoodieSqlCommonParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(HoodieSqlCommonParser.EXISTS, 0); }
		public TerminalNode TABLE() { return getToken(HoodieSqlCommonParser.TABLE, 0); }
		public TerminalNode USING() { return getToken(HoodieSqlCommonParser.USING, 0); }
		public TerminalNode OPTIONS() { return getToken(HoodieSqlCommonParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public CreateIndexContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterCreateIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitCreateIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompactionCommandContext extends StatementContext {
		public CompactionStatementContext compactionStatement() {
			return getRuleContext(CompactionStatementContext.class,0);
		}
		public CompactionCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterCompactionCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitCompactionCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitCompactionCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropIndexContext extends StatementContext {
		public TerminalNode DROP() { return getToken(HoodieSqlCommonParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(HoodieSqlCommonParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(HoodieSqlCommonParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(HoodieSqlCommonParser.EXISTS, 0); }
		public TerminalNode TABLE() { return getToken(HoodieSqlCommonParser.TABLE, 0); }
		public DropIndexContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterDropIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitDropIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new CompactionCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				compactionStatement();
				}
				break;
			case 2:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(CALL);
				setState(51);
				multipartIdentifier();
				setState(52);
				match(LEFT_PAREN);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << COMPACTION) | (1L << RUN) | (1L << SCHEDULE) | (1L << ON) | (1L << SHOW) | (1L << LIMIT) | (1L << MAP) | (1L << TRUE) | (1L << FALSE) | (1L << CREATE) | (1L << INDEX) | (1L << INDEXES) | (1L << IF) | (1L << NOT) | (1L << EXISTS) | (1L << TABLE) | (1L << USING) | (1L << OPTIONS) | (1L << DROP) | (1L << FROM) | (1L << IN) | (1L << REFRESH) | (1L << MINUS) | (1L << STRING) | (1L << BIGINT_LITERAL) | (1L << SMALLINT_LITERAL) | (1L << TINYINT_LITERAL) | (1L << INTEGER_VALUE) | (1L << EXPONENT_VALUE) | (1L << DECIMAL_VALUE) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BIGDECIMAL_LITERAL) | (1L << IDENTIFIER) | (1L << BACKQUOTED_IDENTIFIER))) != 0)) {
					{
					setState(53);
					callArgument();
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(54);
						match(COMMA);
						setState(55);
						callArgument();
						}
						}
						setState(60);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(63);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				_localctx = new CreateIndexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(CREATE);
				setState(66);
				match(INDEX);
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(67);
					match(IF);
					setState(68);
					match(NOT);
					setState(69);
					match(EXISTS);
					}
					break;
				}
				setState(72);
				identifier();
				setState(73);
				match(ON);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(74);
					match(TABLE);
					}
				}

				setState(77);
				tableIdentifier();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(78);
					match(USING);
					setState(79);
					((CreateIndexContext)_localctx).indexType = identifier();
					}
				}

				setState(82);
				match(LEFT_PAREN);
				setState(83);
				((CreateIndexContext)_localctx).columns = multipartIdentifierPropertyList();
				setState(84);
				match(RIGHT_PAREN);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(85);
					match(OPTIONS);
					setState(86);
					((CreateIndexContext)_localctx).indexOptions = propertyList();
					}
				}

				}
				break;
			case 4:
				_localctx = new DropIndexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(DROP);
				setState(90);
				match(INDEX);
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(91);
					match(IF);
					setState(92);
					match(EXISTS);
					}
					break;
				}
				setState(95);
				identifier();
				setState(96);
				match(ON);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(97);
					match(TABLE);
					}
				}

				setState(100);
				tableIdentifier();
				}
				break;
			case 5:
				_localctx = new ShowIndexesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				match(SHOW);
				setState(103);
				match(INDEXES);
				setState(104);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(105);
					match(TABLE);
					}
				}

				setState(108);
				tableIdentifier();
				}
				break;
			case 6:
				_localctx = new RefreshIndexContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				match(REFRESH);
				setState(110);
				match(INDEX);
				setState(111);
				identifier();
				setState(112);
				match(ON);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(113);
					match(TABLE);
					}
				}

				setState(116);
				tableIdentifier();
				}
				break;
			case 7:
				_localctx = new PassThroughContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(118);
						matchWildcard();
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
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

	public static class CompactionStatementContext extends ParserRuleContext {
		public CompactionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compactionStatement; }
	 
		public CompactionStatementContext() { }
		public void copyFrom(CompactionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompactionOnPathContext extends CompactionStatementContext {
		public Token operation;
		public Token path;
		public Token instantTimestamp;
		public TerminalNode COMPACTION() { return getToken(HoodieSqlCommonParser.COMPACTION, 0); }
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TerminalNode STRING() { return getToken(HoodieSqlCommonParser.STRING, 0); }
		public TerminalNode RUN() { return getToken(HoodieSqlCommonParser.RUN, 0); }
		public TerminalNode SCHEDULE() { return getToken(HoodieSqlCommonParser.SCHEDULE, 0); }
		public TerminalNode AT() { return getToken(HoodieSqlCommonParser.AT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlCommonParser.INTEGER_VALUE, 0); }
		public CompactionOnPathContext(CompactionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterCompactionOnPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitCompactionOnPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitCompactionOnPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompactionOnTableContext extends CompactionStatementContext {
		public Token operation;
		public Token instantTimestamp;
		public TerminalNode COMPACTION() { return getToken(HoodieSqlCommonParser.COMPACTION, 0); }
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RUN() { return getToken(HoodieSqlCommonParser.RUN, 0); }
		public TerminalNode SCHEDULE() { return getToken(HoodieSqlCommonParser.SCHEDULE, 0); }
		public TerminalNode AT() { return getToken(HoodieSqlCommonParser.AT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlCommonParser.INTEGER_VALUE, 0); }
		public CompactionOnTableContext(CompactionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterCompactionOnTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitCompactionOnTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitCompactionOnTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCompactionOnPathContext extends CompactionStatementContext {
		public Token path;
		public Token limit;
		public TerminalNode SHOW() { return getToken(HoodieSqlCommonParser.SHOW, 0); }
		public TerminalNode COMPACTION() { return getToken(HoodieSqlCommonParser.COMPACTION, 0); }
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TerminalNode STRING() { return getToken(HoodieSqlCommonParser.STRING, 0); }
		public TerminalNode LIMIT() { return getToken(HoodieSqlCommonParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlCommonParser.INTEGER_VALUE, 0); }
		public ShowCompactionOnPathContext(CompactionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterShowCompactionOnPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitShowCompactionOnPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitShowCompactionOnPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCompactionOnTableContext extends CompactionStatementContext {
		public Token limit;
		public TerminalNode SHOW() { return getToken(HoodieSqlCommonParser.SHOW, 0); }
		public TerminalNode COMPACTION() { return getToken(HoodieSqlCommonParser.COMPACTION, 0); }
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(HoodieSqlCommonParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlCommonParser.INTEGER_VALUE, 0); }
		public ShowCompactionOnTableContext(CompactionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterShowCompactionOnTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitShowCompactionOnTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitShowCompactionOnTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompactionStatementContext compactionStatement() throws RecognitionException {
		CompactionStatementContext _localctx = new CompactionStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compactionStatement);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new CompactionOnTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				((CompactionOnTableContext)_localctx).operation = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RUN || _la==SCHEDULE) ) {
					((CompactionOnTableContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				match(COMPACTION);
				setState(128);
				match(ON);
				setState(129);
				tableIdentifier();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(130);
					match(AT);
					setState(131);
					((CompactionOnTableContext)_localctx).instantTimestamp = match(INTEGER_VALUE);
					}
				}

				}
				break;
			case 2:
				_localctx = new CompactionOnPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				((CompactionOnPathContext)_localctx).operation = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RUN || _la==SCHEDULE) ) {
					((CompactionOnPathContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(135);
				match(COMPACTION);
				setState(136);
				match(ON);
				setState(137);
				((CompactionOnPathContext)_localctx).path = match(STRING);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(138);
					match(AT);
					setState(139);
					((CompactionOnPathContext)_localctx).instantTimestamp = match(INTEGER_VALUE);
					}
				}

				}
				break;
			case 3:
				_localctx = new ShowCompactionOnTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(SHOW);
				setState(143);
				match(COMPACTION);
				setState(144);
				match(ON);
				setState(145);
				tableIdentifier();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(146);
					match(LIMIT);
					setState(147);
					((ShowCompactionOnTableContext)_localctx).limit = match(INTEGER_VALUE);
					}
				}

				}
				break;
			case 4:
				_localctx = new ShowCompactionOnPathContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(SHOW);
				setState(151);
				match(COMPACTION);
				setState(152);
				match(ON);
				setState(153);
				((ShowCompactionOnPathContext)_localctx).path = match(STRING);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(154);
					match(LIMIT);
					setState(155);
					((ShowCompactionOnPathContext)_localctx).limit = match(INTEGER_VALUE);
					}
				}

				}
				break;
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public Token db;
		public Token table;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HoodieSqlCommonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HoodieSqlCommonParser.IDENTIFIER, i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(160);
				((TableIdentifierContext)_localctx).db = match(IDENTIFIER);
				setState(161);
				match(DOT);
				}
				break;
			}
			setState(164);
			((TableIdentifierContext)_localctx).table = match(IDENTIFIER);
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

	public static class CallArgumentContext extends ParserRuleContext {
		public CallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgument; }
	 
		public CallArgumentContext() { }
		public void copyFrom(CallArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PositionalArgumentContext extends CallArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositionalArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentContext extends CallArgumentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentContext callArgument() throws RecognitionException {
		CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_callArgument);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				expression();
				}
				break;
			case 2:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				identifier();
				setState(168);
				match(T__1);
				setState(169);
				expression();
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringMapContext stringMap() {
			return getRuleContext(StringMapContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case COMPACTION:
			case RUN:
			case SCHEDULE:
			case ON:
			case SHOW:
			case LIMIT:
			case TRUE:
			case FALSE:
			case CREATE:
			case INDEX:
			case INDEXES:
			case IF:
			case NOT:
			case EXISTS:
			case TABLE:
			case USING:
			case OPTIONS:
			case DROP:
			case FROM:
			case IN:
			case REFRESH:
			case MINUS:
			case STRING:
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case INTEGER_VALUE:
			case EXPONENT_VALUE:
			case DECIMAL_VALUE:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case BIGDECIMAL_LITERAL:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				constant();
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				stringMap();
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(HoodieSqlCommonParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HoodieSqlCommonParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(HoodieSqlCommonParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constant);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case INTEGER_VALUE:
			case EXPONENT_VALUE:
			case DECIMAL_VALUE:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case BIGDECIMAL_LITERAL:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				booleanValue();
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(179);
					match(STRING);
					}
					}
					setState(182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				break;
			case CALL:
			case COMPACTION:
			case RUN:
			case SCHEDULE:
			case ON:
			case SHOW:
			case LIMIT:
			case CREATE:
			case INDEX:
			case INDEXES:
			case IF:
			case NOT:
			case EXISTS:
			case TABLE:
			case USING:
			case OPTIONS:
			case DROP:
			case FROM:
			case IN:
			case REFRESH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				identifier();
				setState(185);
				match(STRING);
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

	public static class StringMapContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(HoodieSqlCommonParser.MAP, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public StringMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterStringMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitStringMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitStringMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringMapContext stringMap() throws RecognitionException {
		StringMapContext _localctx = new StringMapContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stringMap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(MAP);
			setState(190);
			match(LEFT_PAREN);
			setState(191);
			constant();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192);
				match(COMMA);
				setState(193);
				constant();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(RIGHT_PAREN);
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(HoodieSqlCommonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HoodieSqlCommonParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(HoodieSqlCommonParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(HoodieSqlCommonParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(HoodieSqlCommonParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(HoodieSqlCommonParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(HoodieSqlCommonParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitExponentLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitExponentLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(HoodieSqlCommonParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlCommonParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(HoodieSqlCommonParser.FLOAT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(HoodieSqlCommonParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(203);
					match(MINUS);
					}
				}

				setState(206);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(207);
					match(MINUS);
					}
				}

				setState(210);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(211);
					match(MINUS);
					}
				}

				setState(214);
				match(INTEGER_VALUE);
				}
				break;
			case 4:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(215);
					match(MINUS);
					}
				}

				setState(218);
				match(BIGINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(219);
					match(MINUS);
					}
				}

				setState(222);
				match(SMALLINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(223);
					match(MINUS);
					}
				}

				setState(226);
				match(TINYINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(227);
					match(MINUS);
					}
				}

				setState(230);
				match(DOUBLE_LITERAL);
				}
				break;
			case 8:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(231);
					match(MINUS);
					}
				}

				setState(234);
				match(FLOAT_LITERAL);
				}
				break;
			case 9:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(235);
					match(MINUS);
					}
				}

				setState(238);
				match(BIGDECIMAL_LITERAL);
				}
				break;
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

	public static class MultipartIdentifierPropertyListContext extends ParserRuleContext {
		public List<MultipartIdentifierPropertyContext> multipartIdentifierProperty() {
			return getRuleContexts(MultipartIdentifierPropertyContext.class);
		}
		public MultipartIdentifierPropertyContext multipartIdentifierProperty(int i) {
			return getRuleContext(MultipartIdentifierPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HoodieSqlCommonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HoodieSqlCommonParser.COMMA, i);
		}
		public MultipartIdentifierPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierPropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterMultipartIdentifierPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitMultipartIdentifierPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitMultipartIdentifierPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierPropertyListContext multipartIdentifierPropertyList() throws RecognitionException {
		MultipartIdentifierPropertyListContext _localctx = new MultipartIdentifierPropertyListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multipartIdentifierPropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			multipartIdentifierProperty();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				multipartIdentifierProperty();
				}
				}
				setState(248);
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

	public static class MultipartIdentifierPropertyContext extends ParserRuleContext {
		public PropertyListContext options;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(HoodieSqlCommonParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public MultipartIdentifierPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterMultipartIdentifierProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitMultipartIdentifierProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitMultipartIdentifierProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierPropertyContext multipartIdentifierProperty() throws RecognitionException {
		MultipartIdentifierPropertyContext _localctx = new MultipartIdentifierPropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multipartIdentifierProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			multipartIdentifier();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(250);
				match(OPTIONS);
				setState(251);
				((MultipartIdentifierPropertyContext)_localctx).options = propertyList();
				}
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

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> parts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multipartIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			((MultipartIdentifierContext)_localctx).identifier = identifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).identifier);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(255);
				match(DOT);
				setState(256);
				((MultipartIdentifierContext)_localctx).identifier = identifier();
				((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).identifier);
				}
				}
				setState(261);
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends IdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(HoodieSqlCommonParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifier);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				quotedIdentifier();
				}
				break;
			case CALL:
			case COMPACTION:
			case RUN:
			case SCHEDULE:
			case ON:
			case SHOW:
			case LIMIT:
			case CREATE:
			case INDEX:
			case INDEXES:
			case IF:
			case NOT:
			case EXISTS:
			case TABLE:
			case USING:
			case OPTIONS:
			case DROP:
			case FROM:
			case IN:
			case REFRESH:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				nonReserved();
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(HoodieSqlCommonParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(BACKQUOTED_IDENTIFIER);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(HoodieSqlCommonParser.CALL, 0); }
		public TerminalNode COMPACTION() { return getToken(HoodieSqlCommonParser.COMPACTION, 0); }
		public TerminalNode CREATE() { return getToken(HoodieSqlCommonParser.CREATE, 0); }
		public TerminalNode DROP() { return getToken(HoodieSqlCommonParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(HoodieSqlCommonParser.EXISTS, 0); }
		public TerminalNode FROM() { return getToken(HoodieSqlCommonParser.FROM, 0); }
		public TerminalNode IN() { return getToken(HoodieSqlCommonParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(HoodieSqlCommonParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(HoodieSqlCommonParser.INDEXES, 0); }
		public TerminalNode IF() { return getToken(HoodieSqlCommonParser.IF, 0); }
		public TerminalNode LIMIT() { return getToken(HoodieSqlCommonParser.LIMIT, 0); }
		public TerminalNode NOT() { return getToken(HoodieSqlCommonParser.NOT, 0); }
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TerminalNode OPTIONS() { return getToken(HoodieSqlCommonParser.OPTIONS, 0); }
		public TerminalNode REFRESH() { return getToken(HoodieSqlCommonParser.REFRESH, 0); }
		public TerminalNode RUN() { return getToken(HoodieSqlCommonParser.RUN, 0); }
		public TerminalNode SCHEDULE() { return getToken(HoodieSqlCommonParser.SCHEDULE, 0); }
		public TerminalNode SHOW() { return getToken(HoodieSqlCommonParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(HoodieSqlCommonParser.TABLE, 0); }
		public TerminalNode USING() { return getToken(HoodieSqlCommonParser.USING, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << COMPACTION) | (1L << RUN) | (1L << SCHEDULE) | (1L << ON) | (1L << SHOW) | (1L << LIMIT) | (1L << CREATE) | (1L << INDEX) | (1L << INDEXES) | (1L << IF) | (1L << NOT) | (1L << EXISTS) | (1L << TABLE) | (1L << USING) | (1L << OPTIONS) | (1L << DROP) | (1L << FROM) | (1L << IN) | (1L << REFRESH))) != 0)) ) {
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

	public static class PropertyListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(HoodieSqlCommonParser.LEFT_PAREN, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HoodieSqlCommonParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HoodieSqlCommonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HoodieSqlCommonParser.COMMA, i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(LEFT_PAREN);
			setState(272);
			property();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(273);
				match(COMMA);
				setState(274);
				property();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(RIGHT_PAREN);
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

	public static class PropertyContext extends ParserRuleContext {
		public PropertyKeyContext key;
		public PropertyValueContext value;
		public PropertyKeyContext propertyKey() {
			return getRuleContext(PropertyKeyContext.class,0);
		}
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(HoodieSqlCommonParser.EQ, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			((PropertyContext)_localctx).key = propertyKey();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << EQ) | (1L << STRING) | (1L << INTEGER_VALUE) | (1L << DECIMAL_VALUE))) != 0)) {
				{
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(283);
					match(EQ);
					}
				}

				setState(286);
				((PropertyContext)_localctx).value = propertyValue();
				}
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

	public static class PropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(HoodieSqlCommonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HoodieSqlCommonParser.DOT, i);
		}
		public TerminalNode STRING() { return getToken(HoodieSqlCommonParser.STRING, 0); }
		public PropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterPropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitPropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitPropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyKeyContext propertyKey() throws RecognitionException {
		PropertyKeyContext _localctx = new PropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_propertyKey);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case COMPACTION:
			case RUN:
			case SCHEDULE:
			case ON:
			case SHOW:
			case LIMIT:
			case CREATE:
			case INDEX:
			case INDEXES:
			case IF:
			case NOT:
			case EXISTS:
			case TABLE:
			case USING:
			case OPTIONS:
			case DROP:
			case FROM:
			case IN:
			case REFRESH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				identifier();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(290);
					match(DOT);
					setState(291);
					identifier();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(STRING);
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

	public static class PropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlCommonParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(HoodieSqlCommonParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(HoodieSqlCommonParser.STRING, 0); }
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitPropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitPropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_propertyValue);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				match(STRING);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0135\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\5\3@\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\3\3\3\3\5\3N\n\3\3\3\3\3\3\3\5\3S"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\5\3Z\n\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\3\3\3\3\3"+
		"\5\3e\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3m\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"u\n\3\3\3\3\3\3\3\7\3z\n\3\f\3\16\3}\13\3\5\3\177\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u0087\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u008f\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u0097\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u009f\n\4\5\4"+
		"\u00a1\n\4\3\5\3\5\5\5\u00a5\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\u00ae"+
		"\n\6\3\7\3\7\5\7\u00b2\n\7\3\b\3\b\3\b\6\b\u00b7\n\b\r\b\16\b\u00b8\3"+
		"\b\3\b\3\b\5\b\u00be\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u00c5\n\t\f\t\16\t\u00c8"+
		"\13\t\3\t\3\t\3\n\3\n\3\13\5\13\u00cf\n\13\3\13\3\13\5\13\u00d3\n\13\3"+
		"\13\3\13\5\13\u00d7\n\13\3\13\3\13\5\13\u00db\n\13\3\13\3\13\5\13\u00df"+
		"\n\13\3\13\3\13\5\13\u00e3\n\13\3\13\3\13\5\13\u00e7\n\13\3\13\3\13\5"+
		"\13\u00eb\n\13\3\13\3\13\5\13\u00ef\n\13\3\13\5\13\u00f2\n\13\3\f\3\f"+
		"\3\f\7\f\u00f7\n\f\f\f\16\f\u00fa\13\f\3\r\3\r\3\r\5\r\u00ff\n\r\3\16"+
		"\3\16\3\16\7\16\u0104\n\16\f\16\16\16\u0107\13\16\3\17\3\17\3\17\5\17"+
		"\u010c\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0116\n\22\f"+
		"\22\16\22\u0119\13\22\3\22\3\22\3\23\3\23\5\23\u011f\n\23\3\23\5\23\u0122"+
		"\n\23\3\24\3\24\3\24\7\24\u0127\n\24\f\24\16\24\u012a\13\24\3\24\5\24"+
		"\u012d\n\24\3\25\3\25\3\25\3\25\5\25\u0133\n\25\3\25\3{\2\26\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2\"#\3\2\r\16\3\2\24\25\4\2"+
		"\13\21\30$\2\u015f\2*\3\2\2\2\4~\3\2\2\2\6\u00a0\3\2\2\2\b\u00a4\3\2\2"+
		"\2\n\u00ad\3\2\2\2\f\u00b1\3\2\2\2\16\u00bd\3\2\2\2\20\u00bf\3\2\2\2\22"+
		"\u00cb\3\2\2\2\24\u00f1\3\2\2\2\26\u00f3\3\2\2\2\30\u00fb\3\2\2\2\32\u0100"+
		"\3\2\2\2\34\u010b\3\2\2\2\36\u010d\3\2\2\2 \u010f\3\2\2\2\"\u0111\3\2"+
		"\2\2$\u011c\3\2\2\2&\u012c\3\2\2\2(\u0132\3\2\2\2*.\5\4\3\2+-\7\3\2\2"+
		",+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61"+
		"\62\7\2\2\3\62\3\3\2\2\2\63\177\5\6\4\2\64\65\7\13\2\2\65\66\5\32\16\2"+
		"\66?\7\5\2\2\67<\5\n\6\289\7\7\2\29;\5\n\6\2:8\3\2\2\2;>\3\2\2\2<:\3\2"+
		"\2\2<=\3\2\2\2=@\3\2\2\2><\3\2\2\2?\67\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7"+
		"\6\2\2B\177\3\2\2\2CD\7\30\2\2DH\7\31\2\2EF\7\33\2\2FG\7\34\2\2GI\7\35"+
		"\2\2HE\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\5\34\17\2KM\7\17\2\2LN\7\36\2\2M"+
		"L\3\2\2\2MN\3\2\2\2NO\3\2\2\2OR\5\b\5\2PQ\7\37\2\2QS\5\34\17\2RP\3\2\2"+
		"\2RS\3\2\2\2ST\3\2\2\2TU\7\5\2\2UV\5\26\f\2VY\7\6\2\2WX\7 \2\2XZ\5\"\22"+
		"\2YW\3\2\2\2YZ\3\2\2\2Z\177\3\2\2\2[\\\7!\2\2\\_\7\31\2\2]^\7\33\2\2^"+
		"`\7\35\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\5\34\17\2bd\7\17\2\2ce\7\36"+
		"\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\5\b\5\2g\177\3\2\2\2hi\7\20\2\2i"+
		"j\7\32\2\2jl\t\2\2\2km\7\36\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2n\177\5\b"+
		"\5\2op\7$\2\2pq\7\31\2\2qr\5\34\17\2rt\7\17\2\2su\7\36\2\2ts\3\2\2\2t"+
		"u\3\2\2\2uv\3\2\2\2vw\5\b\5\2w\177\3\2\2\2xz\13\2\2\2yx\3\2\2\2z}\3\2"+
		"\2\2{|\3\2\2\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~\63\3\2\2\2~\64\3\2\2"+
		"\2~C\3\2\2\2~[\3\2\2\2~h\3\2\2\2~o\3\2\2\2~{\3\2\2\2\177\5\3\2\2\2\u0080"+
		"\u0081\t\3\2\2\u0081\u0082\7\f\2\2\u0082\u0083\7\17\2\2\u0083\u0086\5"+
		"\b\5\2\u0084\u0085\7\n\2\2\u0085\u0087\7,\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u00a1\3\2\2\2\u0088\u0089\t\3\2\2\u0089\u008a\7\f"+
		"\2\2\u008a\u008b\7\17\2\2\u008b\u008e\7(\2\2\u008c\u008d\7\n\2\2\u008d"+
		"\u008f\7,\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u00a1\3\2"+
		"\2\2\u0090\u0091\7\20\2\2\u0091\u0092\7\f\2\2\u0092\u0093\7\17\2\2\u0093"+
		"\u0096\5\b\5\2\u0094\u0095\7\21\2\2\u0095\u0097\7,\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u00a1\3\2\2\2\u0098\u0099\7\20\2\2\u0099"+
		"\u009a\7\f\2\2\u009a\u009b\7\17\2\2\u009b\u009e\7(\2\2\u009c\u009d\7\21"+
		"\2\2\u009d\u009f\7,\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u0080\3\2\2\2\u00a0\u0088\3\2\2\2\u00a0\u0090\3\2"+
		"\2\2\u00a0\u0098\3\2\2\2\u00a1\7\3\2\2\2\u00a2\u00a3\7\62\2\2\u00a3\u00a5"+
		"\7\b\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\7\62\2\2\u00a7\t\3\2\2\2\u00a8\u00ae\5\f\7\2\u00a9\u00aa\5\34\17"+
		"\2\u00aa\u00ab\7\4\2\2\u00ab\u00ac\5\f\7\2\u00ac\u00ae\3\2\2\2\u00ad\u00a8"+
		"\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\13\3\2\2\2\u00af\u00b2\5\16\b\2\u00b0"+
		"\u00b2\5\20\t\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\r\3\2\2"+
		"\2\u00b3\u00be\5\24\13\2\u00b4\u00be\5\22\n\2\u00b5\u00b7\7(\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00be\3\2\2\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc\7(\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00b3\3\2\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00b6\3\2"+
		"\2\2\u00bd\u00ba\3\2\2\2\u00be\17\3\2\2\2\u00bf\u00c0\7\22\2\2\u00c0\u00c1"+
		"\7\5\2\2\u00c1\u00c6\5\16\b\2\u00c2\u00c3\7\7\2\2\u00c3\u00c5\5\16\b\2"+
		"\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\6\2\2\u00ca"+
		"\21\3\2\2\2\u00cb\u00cc\t\4\2\2\u00cc\23\3\2\2\2\u00cd\u00cf\7\'\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00f2\7-"+
		"\2\2\u00d1\u00d3\7\'\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00f2\7.\2\2\u00d5\u00d7\7\'\2\2\u00d6\u00d5\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00f2\7,\2\2\u00d9"+
		"\u00db\7\'\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00f2\7)\2\2\u00dd\u00df\7\'\2\2\u00de\u00dd\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00f2\7*\2\2\u00e1\u00e3\7\'"+
		"\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00f2\7+\2\2\u00e5\u00e7\7\'\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00f2\7\60\2\2\u00e9\u00eb\7\'\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f2\7/"+
		"\2\2\u00ed\u00ef\7\'\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f2\7\61\2\2\u00f1\u00ce\3\2\2\2\u00f1\u00d2\3"+
		"\2\2\2\u00f1\u00d6\3\2\2\2\u00f1\u00da\3\2\2\2\u00f1\u00de\3\2\2\2\u00f1"+
		"\u00e2\3\2\2\2\u00f1\u00e6\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1\u00ee\3\2"+
		"\2\2\u00f2\25\3\2\2\2\u00f3\u00f8\5\30\r\2\u00f4\u00f5\7\7\2\2\u00f5\u00f7"+
		"\5\30\r\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2"+
		"\u00f8\u00f9\3\2\2\2\u00f9\27\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe"+
		"\5\32\16\2\u00fc\u00fd\7 \2\2\u00fd\u00ff\5\"\22\2\u00fe\u00fc\3\2\2\2"+
		"\u00fe\u00ff\3\2\2\2\u00ff\31\3\2\2\2\u0100\u0105\5\34\17\2\u0101\u0102"+
		"\7\b\2\2\u0102\u0104\5\34\17\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2"+
		"\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\33\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0108\u010c\7\62\2\2\u0109\u010c\5\36\20\2\u010a\u010c\5 \21"+
		"\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\35"+
		"\3\2\2\2\u010d\u010e\7\63\2\2\u010e\37\3\2\2\2\u010f\u0110\t\5\2\2\u0110"+
		"!\3\2\2\2\u0111\u0112\7\5\2\2\u0112\u0117\5$\23\2\u0113\u0114\7\7\2\2"+
		"\u0114\u0116\5$\23\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011b\7\6\2\2\u011b#\3\2\2\2\u011c\u0121\5&\24\2\u011d\u011f\7%\2\2\u011e"+
		"\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\5("+
		"\25\2\u0121\u011e\3\2\2\2\u0121\u0122\3\2\2\2\u0122%\3\2\2\2\u0123\u0128"+
		"\5\34\17\2\u0124\u0125\7\b\2\2\u0125\u0127\5\34\17\2\u0126\u0124\3\2\2"+
		"\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012d"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d\7(\2\2\u012c\u0123\3\2\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\'\3\2\2\2\u012e\u0133\7,\2\2\u012f\u0133\7.\2\2\u0130"+
		"\u0133\5\22\n\2\u0131\u0133\7(\2\2\u0132\u012e\3\2\2\2\u0132\u012f\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133)\3\2\2\2..<?HMRY_d"+
		"lt{~\u0086\u008e\u0096\u009e\u00a0\u00a4\u00ad\u00b1\u00b8\u00bd\u00c6"+
		"\u00ce\u00d2\u00d6\u00da\u00de\u00e2\u00e6\u00ea\u00ee\u00f1\u00f8\u00fe"+
		"\u0105\u010b\u0117\u011e\u0121\u0128\u012c\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}