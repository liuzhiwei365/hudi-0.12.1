// Generated from org/apache/hudi/spark/sql/parser/HoodieSqlBase.g4 by ANTLR 4.7
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
public class HoodieSqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PRIMARY=11, KEY=12, MERGE=13, MATCHED=14, UPDATE=15, SELECT=16, 
		FROM=17, ADD=18, AS=19, ALL=20, ANY=21, DISTINCT=22, WHERE=23, GROUP=24, 
		BY=25, GROUPING=26, SETS=27, CUBE=28, ROLLUP=29, ORDER=30, HAVING=31, 
		LIMIT=32, AT=33, OR=34, AND=35, IN=36, NOT=37, NO=38, EXISTS=39, BETWEEN=40, 
		LIKE=41, RLIKE=42, IS=43, NULL=44, TRUE=45, FALSE=46, NULLS=47, ASC=48, 
		DESC=49, FOR=50, INTERVAL=51, CASE=52, WHEN=53, THEN=54, ELSE=55, END=56, 
		JOIN=57, CROSS=58, OUTER=59, INNER=60, LEFT=61, SEMI=62, RIGHT=63, FULL=64, 
		NATURAL=65, ON=66, PIVOT=67, LATERAL=68, WINDOW=69, OVER=70, PARTITION=71, 
		RANGE=72, ROWS=73, UNBOUNDED=74, PRECEDING=75, FOLLOWING=76, CURRENT=77, 
		FIRST=78, AFTER=79, LAST=80, ROW=81, WITH=82, VALUES=83, CREATE=84, TABLE=85, 
		DIRECTORY=86, VIEW=87, REPLACE=88, INSERT=89, DELETE=90, INTO=91, DESCRIBE=92, 
		EXPLAIN=93, FORMAT=94, LOGICAL=95, CODEGEN=96, COST=97, CAST=98, SHOW=99, 
		TABLES=100, COLUMNS=101, COLUMN=102, USE=103, PARTITIONS=104, FUNCTIONS=105, 
		DROP=106, UNION=107, EXCEPT=108, SETMINUS=109, INTERSECT=110, TO=111, 
		TABLESAMPLE=112, STRATIFY=113, ALTER=114, RENAME=115, ARRAY=116, MAP=117, 
		STRUCT=118, COMMENT=119, SET=120, RESET=121, DATA=122, START=123, TRANSACTION=124, 
		COMMIT=125, ROLLBACK=126, MACRO=127, IGNORE=128, BOTH=129, LEADING=130, 
		TRAILING=131, IF=132, POSITION=133, EXTRACT=134, EQ=135, NSEQ=136, NEQ=137, 
		NEQJ=138, LT=139, LTE=140, GT=141, GTE=142, PLUS=143, MINUS=144, ASTERISK=145, 
		SLASH=146, PERCENT=147, DIV=148, TILDE=149, AMPERSAND=150, PIPE=151, CONCAT_PIPE=152, 
		HAT=153, PERCENTLIT=154, BUCKET=155, OUT=156, OF=157, SORT=158, CLUSTER=159, 
		DISTRIBUTE=160, OVERWRITE=161, TRANSFORM=162, REDUCE=163, USING=164, SERDE=165, 
		SERDEPROPERTIES=166, RECORDREADER=167, RECORDWRITER=168, DELIMITED=169, 
		FIELDS=170, TERMINATED=171, COLLECTION=172, ITEMS=173, KEYS=174, ESCAPED=175, 
		LINES=176, SEPARATED=177, FUNCTION=178, EXTENDED=179, REFRESH=180, CLEAR=181, 
		CACHE=182, UNCACHE=183, LAZY=184, FORMATTED=185, GLOBAL=186, TEMPORARY=187, 
		OPTIONS=188, UNSET=189, TBLPROPERTIES=190, DBPROPERTIES=191, BUCKETS=192, 
		SKEWED=193, STORED=194, DIRECTORIES=195, LOCATION=196, EXCHANGE=197, ARCHIVE=198, 
		UNARCHIVE=199, FILEFORMAT=200, TOUCH=201, COMPACT=202, CONCATENATE=203, 
		CHANGE=204, CASCADE=205, RESTRICT=206, CLUSTERED=207, SORTED=208, PURGE=209, 
		INPUTFORMAT=210, OUTPUTFORMAT=211, DATABASE=212, DATABASES=213, DFS=214, 
		TRUNCATE=215, ANALYZE=216, COMPUTE=217, LIST=218, STATISTICS=219, PARTITIONED=220, 
		EXTERNAL=221, DEFINED=222, REVOKE=223, GRANT=224, LOCK=225, UNLOCK=226, 
		MSCK=227, REPAIR=228, RECOVER=229, EXPORT=230, IMPORT=231, LOAD=232, ROLE=233, 
		ROLES=234, COMPACTIONS=235, PRINCIPALS=236, TRANSACTIONS=237, INDEX=238, 
		INDEXES=239, LOCKS=240, OPTION=241, ANTI=242, LOCAL=243, INPATH=244, STRING=245, 
		BIGINT_LITERAL=246, SMALLINT_LITERAL=247, TINYINT_LITERAL=248, INTEGER_VALUE=249, 
		DECIMAL_VALUE=250, DOUBLE_LITERAL=251, BIGDECIMAL_LITERAL=252, IDENTIFIER=253, 
		BACKQUOTED_IDENTIFIER=254, SIMPLE_COMMENT=255, BRACKETED_EMPTY_COMMENT=256, 
		BRACKETED_COMMENT=257, WS=258, UNRECOGNIZED=259;
	public static final int
		RULE_singleStatement = 0, RULE_statement = 1, RULE_mergeInto = 2, RULE_mergeCondition = 3, 
		RULE_matchedClauses = 4, RULE_notMatchedClause = 5, RULE_deleteClause = 6, 
		RULE_updateClause = 7, RULE_insertClause = 8, RULE_deleteAction = 9, RULE_updateAction = 10, 
		RULE_insertAction = 11, RULE_assignmentList = 12, RULE_assignment = 13, 
		RULE_qualifiedNameList = 14, RULE_updateTableStmt = 15, RULE_deleteTableStmt = 16, 
		RULE_singleExpression = 17, RULE_singleTableIdentifier = 18, RULE_singleFunctionIdentifier = 19, 
		RULE_singleDataType = 20, RULE_singleTableSchema = 21, RULE_unsupportedHiveNativeCommands = 22, 
		RULE_createTableHeader = 23, RULE_bucketSpec = 24, RULE_skewSpec = 25, 
		RULE_locationSpec = 26, RULE_query = 27, RULE_insertInto = 28, RULE_partitionSpecLocation = 29, 
		RULE_partitionSpec = 30, RULE_partitionVal = 31, RULE_describeFuncName = 32, 
		RULE_describeColName = 33, RULE_ctes = 34, RULE_namedQuery = 35, RULE_tableProvider = 36, 
		RULE_tablePropertyList = 37, RULE_tableProperty = 38, RULE_tablePropertyKey = 39, 
		RULE_tablePropertyValue = 40, RULE_constantList = 41, RULE_nestedConstantList = 42, 
		RULE_createFileFormat = 43, RULE_fileFormat = 44, RULE_storageHandler = 45, 
		RULE_resource = 46, RULE_queryNoWith = 47, RULE_queryOrganization = 48, 
		RULE_multiInsertQueryBody = 49, RULE_queryTerm = 50, RULE_queryPrimary = 51, 
		RULE_sortItem = 52, RULE_querySpecification = 53, RULE_hint = 54, RULE_hintStatement = 55, 
		RULE_fromClause = 56, RULE_aggregation = 57, RULE_groupingSet = 58, RULE_pivotClause = 59, 
		RULE_pivotColumn = 60, RULE_pivotValue = 61, RULE_lateralView = 62, RULE_setQuantifier = 63, 
		RULE_relation = 64, RULE_joinRelation = 65, RULE_joinType = 66, RULE_joinCriteria = 67, 
		RULE_sample = 68, RULE_sampleMethod = 69, RULE_identifierList = 70, RULE_identifierSeq = 71, 
		RULE_orderedIdentifierList = 72, RULE_orderedIdentifier = 73, RULE_identifierCommentList = 74, 
		RULE_identifierComment = 75, RULE_relationPrimary = 76, RULE_inlineTable = 77, 
		RULE_functionTable = 78, RULE_tableAlias = 79, RULE_rowFormat = 80, RULE_tableIdentifier = 81, 
		RULE_functionIdentifier = 82, RULE_namedExpression = 83, RULE_namedExpressionSeq = 84, 
		RULE_expression = 85, RULE_booleanExpression = 86, RULE_predicate = 87, 
		RULE_valueExpression = 88, RULE_primaryExpression = 89, RULE_constant = 90, 
		RULE_comparisonOperator = 91, RULE_arithmeticOperator = 92, RULE_predicateOperator = 93, 
		RULE_booleanValue = 94, RULE_interval = 95, RULE_intervalField = 96, RULE_intervalValue = 97, 
		RULE_colPosition = 98, RULE_dataType = 99, RULE_colTypeList = 100, RULE_colType = 101, 
		RULE_complexColTypeList = 102, RULE_complexColType = 103, RULE_whenClause = 104, 
		RULE_windows = 105, RULE_namedWindow = 106, RULE_windowSpec = 107, RULE_windowFrame = 108, 
		RULE_frameBound = 109, RULE_qualifiedName = 110, RULE_identifier = 111, 
		RULE_strictIdentifier = 112, RULE_quotedIdentifier = 113, RULE_number = 114, 
		RULE_nonReserved = 115;
	public static final String[] ruleNames = {
		"singleStatement", "statement", "mergeInto", "mergeCondition", "matchedClauses", 
		"notMatchedClause", "deleteClause", "updateClause", "insertClause", "deleteAction", 
		"updateAction", "insertAction", "assignmentList", "assignment", "qualifiedNameList", 
		"updateTableStmt", "deleteTableStmt", "singleExpression", "singleTableIdentifier", 
		"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "unsupportedHiveNativeCommands", 
		"createTableHeader", "bucketSpec", "skewSpec", "locationSpec", "query", 
		"insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
		"describeFuncName", "describeColName", "ctes", "namedQuery", "tableProvider", 
		"tablePropertyList", "tableProperty", "tablePropertyKey", "tablePropertyValue", 
		"constantList", "nestedConstantList", "createFileFormat", "fileFormat", 
		"storageHandler", "resource", "queryNoWith", "queryOrganization", "multiInsertQueryBody", 
		"queryTerm", "queryPrimary", "sortItem", "querySpecification", "hint", 
		"hintStatement", "fromClause", "aggregation", "groupingSet", "pivotClause", 
		"pivotColumn", "pivotValue", "lateralView", "setQuantifier", "relation", 
		"joinRelation", "joinType", "joinCriteria", "sample", "sampleMethod", 
		"identifierList", "identifierSeq", "orderedIdentifierList", "orderedIdentifier", 
		"identifierCommentList", "identifierComment", "relationPrimary", "inlineTable", 
		"functionTable", "tableAlias", "rowFormat", "tableIdentifier", "functionIdentifier", 
		"namedExpression", "namedExpressionSeq", "expression", "booleanExpression", 
		"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
		"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
		"intervalField", "intervalValue", "colPosition", "dataType", "colTypeList", 
		"colType", "complexColTypeList", "complexColType", "whenClause", "windows", 
		"namedWindow", "windowSpec", "windowFrame", "frameBound", "qualifiedName", 
		"identifier", "strictIdentifier", "quotedIdentifier", "number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", "']'", 
		"':'", "'PRIMARY'", "'KEY'", "'MERGE'", "'MATCHED'", "'UPDATE'", "'SELECT'", 
		"'FROM'", "'ADD'", "'AS'", "'ALL'", "'ANY'", "'DISTINCT'", "'WHERE'", 
		"'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", 
		"'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, "'NO'", 
		"'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", "'FALSE'", 
		"'NULLS'", "'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", "'WHEN'", 
		"'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'", "'INNER'", 
		"'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", "'PIVOT'", 
		"'LATERAL'", "'WINDOW'", "'OVER'", "'PARTITION'", "'RANGE'", "'ROWS'", 
		"'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'FIRST'", "'AFTER'", 
		"'LAST'", "'ROW'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", "'DIRECTORY'", 
		"'VIEW'", "'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", "'DESCRIBE'", 
		"'EXPLAIN'", "'FORMAT'", "'LOGICAL'", "'CODEGEN'", "'COST'", "'CAST'", 
		"'SHOW'", "'TABLES'", "'COLUMNS'", "'COLUMN'", "'USE'", "'PARTITIONS'", 
		"'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", "'MINUS'", "'INTERSECT'", 
		"'TO'", "'TABLESAMPLE'", "'STRATIFY'", "'ALTER'", "'RENAME'", "'ARRAY'", 
		"'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", "'DATA'", "'START'", 
		"'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'MACRO'", "'IGNORE'", "'BOTH'", 
		"'LEADING'", "'TRAILING'", "'IF'", "'POSITION'", "'EXTRACT'", null, "'<=>'", 
		"'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", "'PERCENT'", "'BUCKET'", 
		"'OUT'", "'OF'", "'SORT'", "'CLUSTER'", "'DISTRIBUTE'", "'OVERWRITE'", 
		"'TRANSFORM'", "'REDUCE'", "'USING'", "'SERDE'", "'SERDEPROPERTIES'", 
		"'RECORDREADER'", "'RECORDWRITER'", "'DELIMITED'", "'FIELDS'", "'TERMINATED'", 
		"'COLLECTION'", "'ITEMS'", "'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'", 
		"'FUNCTION'", "'EXTENDED'", "'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'", 
		"'LAZY'", "'FORMATTED'", "'GLOBAL'", null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'", 
		"'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", "'STORED'", "'DIRECTORIES'", 
		"'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", "'UNARCHIVE'", "'FILEFORMAT'", 
		"'TOUCH'", "'COMPACT'", "'CONCATENATE'", "'CHANGE'", "'CASCADE'", "'RESTRICT'", 
		"'CLUSTERED'", "'SORTED'", "'PURGE'", "'INPUTFORMAT'", "'OUTPUTFORMAT'", 
		null, null, "'DFS'", "'TRUNCATE'", "'ANALYZE'", "'COMPUTE'", "'LIST'", 
		"'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", "'DEFINED'", "'REVOKE'", 
		"'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", "'RECOVER'", "'EXPORT'", 
		"'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", "'PRINCIPALS'", 
		"'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", "'ANTI'", 
		"'LOCAL'", "'INPATH'", null, null, null, null, null, null, null, null, 
		null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "PRIMARY", 
		"KEY", "MERGE", "MATCHED", "UPDATE", "SELECT", "FROM", "ADD", "AS", "ALL", 
		"ANY", "DISTINCT", "WHERE", "GROUP", "BY", "GROUPING", "SETS", "CUBE", 
		"ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", "OR", "AND", "IN", "NOT", 
		"NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", "IS", "NULL", "TRUE", "FALSE", 
		"NULLS", "ASC", "DESC", "FOR", "INTERVAL", "CASE", "WHEN", "THEN", "ELSE", 
		"END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", "SEMI", "RIGHT", "FULL", 
		"NATURAL", "ON", "PIVOT", "LATERAL", "WINDOW", "OVER", "PARTITION", "RANGE", 
		"ROWS", "UNBOUNDED", "PRECEDING", "FOLLOWING", "CURRENT", "FIRST", "AFTER", 
		"LAST", "ROW", "WITH", "VALUES", "CREATE", "TABLE", "DIRECTORY", "VIEW", 
		"REPLACE", "INSERT", "DELETE", "INTO", "DESCRIBE", "EXPLAIN", "FORMAT", 
		"LOGICAL", "CODEGEN", "COST", "CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", 
		"USE", "PARTITIONS", "FUNCTIONS", "DROP", "UNION", "EXCEPT", "SETMINUS", 
		"INTERSECT", "TO", "TABLESAMPLE", "STRATIFY", "ALTER", "RENAME", "ARRAY", 
		"MAP", "STRUCT", "COMMENT", "SET", "RESET", "DATA", "START", "TRANSACTION", 
		"COMMIT", "ROLLBACK", "MACRO", "IGNORE", "BOTH", "LEADING", "TRAILING", 
		"IF", "POSITION", "EXTRACT", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", 
		"GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", 
		"AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "PERCENTLIT", "BUCKET", "OUT", 
		"OF", "SORT", "CLUSTER", "DISTRIBUTE", "OVERWRITE", "TRANSFORM", "REDUCE", 
		"USING", "SERDE", "SERDEPROPERTIES", "RECORDREADER", "RECORDWRITER", "DELIMITED", 
		"FIELDS", "TERMINATED", "COLLECTION", "ITEMS", "KEYS", "ESCAPED", "LINES", 
		"SEPARATED", "FUNCTION", "EXTENDED", "REFRESH", "CLEAR", "CACHE", "UNCACHE", 
		"LAZY", "FORMATTED", "GLOBAL", "TEMPORARY", "OPTIONS", "UNSET", "TBLPROPERTIES", 
		"DBPROPERTIES", "BUCKETS", "SKEWED", "STORED", "DIRECTORIES", "LOCATION", 
		"EXCHANGE", "ARCHIVE", "UNARCHIVE", "FILEFORMAT", "TOUCH", "COMPACT", 
		"CONCATENATE", "CHANGE", "CASCADE", "RESTRICT", "CLUSTERED", "SORTED", 
		"PURGE", "INPUTFORMAT", "OUTPUTFORMAT", "DATABASE", "DATABASES", "DFS", 
		"TRUNCATE", "ANALYZE", "COMPUTE", "LIST", "STATISTICS", "PARTITIONED", 
		"EXTERNAL", "DEFINED", "REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", 
		"RECOVER", "EXPORT", "IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", 
		"PRINCIPALS", "TRANSACTIONS", "INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", 
		"LOCAL", "INPATH", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", 
		"INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", 
		"IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
		"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
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
	public String getGrammarFileName() { return "HoodieSqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enbled = false;

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

	public HoodieSqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HoodieSqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			statement();
			setState(233);
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
	public static class PassThroughContext extends StatementContext {
		public PassThroughContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterPassThrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitPassThrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitPassThrough(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateTableContext extends StatementContext {
		public UpdateTableStmtContext updateTableStmt() {
			return getRuleContext(UpdateTableStmtContext.class,0);
		}
		public UpdateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteTableContext extends StatementContext {
		public DeleteTableStmtContext deleteTableStmt() {
			return getRuleContext(DeleteTableStmtContext.class,0);
		}
		public DeleteTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterDeleteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitDeleteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitDeleteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeIntoTableContext extends StatementContext {
		public MergeIntoContext mergeInto() {
			return getRuleContext(MergeIntoContext.class,0);
		}
		public MergeIntoTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterMergeIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitMergeIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitMergeIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			int _alt;
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				mergeInto();
				}
				break;
			case 2:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				updateTableStmt();
				}
				break;
			case 3:
				_localctx = new DeleteTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				deleteTableStmt();
				}
				break;
			case 4:
				_localctx = new PassThroughContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(238);
						matchWildcard();
						}
						} 
					}
					setState(243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class MergeIntoContext extends ParserRuleContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public QueryContext subquery;
		public TerminalNode MERGE() { return getToken(HoodieSqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(HoodieSqlBaseParser.INTO, 0); }
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public TerminalNode USING() { return getToken(HoodieSqlBaseParser.USING, 0); }
		public MergeConditionContext mergeCondition() {
			return getRuleContext(MergeConditionContext.class,0);
		}
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClausesContext> matchedClauses() {
			return getRuleContexts(MatchedClausesContext.class);
		}
		public MatchedClausesContext matchedClauses(int i) {
			return getRuleContext(MatchedClausesContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public MergeIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeInto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterMergeInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitMergeInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitMergeInto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeIntoContext mergeInto() throws RecognitionException {
		MergeIntoContext _localctx = new MergeIntoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mergeInto);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(MERGE);
			setState(247);
			match(INTO);
			setState(248);
			((MergeIntoContext)_localctx).target = tableIdentifier();
			setState(249);
			tableAlias();
			setState(250);
			match(USING);
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				setState(251);
				((MergeIntoContext)_localctx).source = tableIdentifier();
				}
				break;
			case T__0:
				{
				setState(252);
				match(T__0);
				setState(253);
				((MergeIntoContext)_localctx).subquery = query();
				setState(254);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(258);
			tableAlias();
			setState(259);
			mergeCondition();
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					matchedClauses();
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(266);
				notMatchedClause();
				}
				}
				setState(271);
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

	public static class MergeConditionContext extends ParserRuleContext {
		public BooleanExpressionContext condition;
		public TerminalNode ON() { return getToken(HoodieSqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MergeConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterMergeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitMergeCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitMergeCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeConditionContext mergeCondition() throws RecognitionException {
		MergeConditionContext _localctx = new MergeConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mergeCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(ON);
			setState(273);
			((MergeConditionContext)_localctx).condition = booleanExpression(0);
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

	public static class MatchedClausesContext extends ParserRuleContext {
		public DeleteClauseContext deleteClause() {
			return getRuleContext(DeleteClauseContext.class,0);
		}
		public UpdateClauseContext updateClause() {
			return getRuleContext(UpdateClauseContext.class,0);
		}
		public MatchedClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterMatchedClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitMatchedClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitMatchedClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedClausesContext matchedClauses() throws RecognitionException {
		MatchedClausesContext _localctx = new MatchedClausesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matchedClauses);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				deleteClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				updateClause();
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

	public static class NotMatchedClauseContext extends ParserRuleContext {
		public InsertClauseContext insertClause() {
			return getRuleContext(InsertClauseContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterNotMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitNotMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitNotMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_notMatchedClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			insertClause();
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

	public static class DeleteClauseContext extends ParserRuleContext {
		public BooleanExpressionContext deleteCond;
		public TerminalNode WHEN() { return getToken(HoodieSqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(HoodieSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(HoodieSqlBaseParser.THEN, 0); }
		public DeleteActionContext deleteAction() {
			return getRuleContext(DeleteActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(HoodieSqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterDeleteClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitDeleteClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitDeleteClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteClauseContext deleteClause() throws RecognitionException {
		DeleteClauseContext _localctx = new DeleteClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_deleteClause);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(WHEN);
				setState(282);
				match(MATCHED);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(283);
					match(AND);
					setState(284);
					((DeleteClauseContext)_localctx).deleteCond = booleanExpression(0);
					}
				}

				setState(287);
				match(THEN);
				setState(288);
				deleteAction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(WHEN);
				setState(290);
				((DeleteClauseContext)_localctx).deleteCond = booleanExpression(0);
				setState(291);
				match(THEN);
				setState(292);
				deleteAction();
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

	public static class UpdateClauseContext extends ParserRuleContext {
		public BooleanExpressionContext updateCond;
		public TerminalNode WHEN() { return getToken(HoodieSqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(HoodieSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(HoodieSqlBaseParser.THEN, 0); }
		public UpdateActionContext updateAction() {
			return getRuleContext(UpdateActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(HoodieSqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public UpdateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterUpdateClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitUpdateClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitUpdateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateClauseContext updateClause() throws RecognitionException {
		UpdateClauseContext _localctx = new UpdateClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_updateClause);
		int _la;
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(WHEN);
				setState(297);
				match(MATCHED);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(298);
					match(AND);
					setState(299);
					((UpdateClauseContext)_localctx).updateCond = booleanExpression(0);
					}
				}

				setState(302);
				match(THEN);
				setState(303);
				updateAction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(WHEN);
				setState(305);
				((UpdateClauseContext)_localctx).updateCond = booleanExpression(0);
				setState(306);
				match(THEN);
				setState(307);
				updateAction();
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

	public static class InsertClauseContext extends ParserRuleContext {
		public BooleanExpressionContext insertCond;
		public TerminalNode WHEN() { return getToken(HoodieSqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(HoodieSqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(HoodieSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(HoodieSqlBaseParser.THEN, 0); }
		public InsertActionContext insertAction() {
			return getRuleContext(InsertActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(HoodieSqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public InsertClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterInsertClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitInsertClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitInsertClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertClauseContext insertClause() throws RecognitionException {
		InsertClauseContext _localctx = new InsertClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insertClause);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(WHEN);
				setState(312);
				match(NOT);
				setState(313);
				match(MATCHED);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(314);
					match(AND);
					setState(315);
					((InsertClauseContext)_localctx).insertCond = booleanExpression(0);
					}
				}

				setState(318);
				match(THEN);
				setState(319);
				insertAction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(WHEN);
				setState(321);
				((InsertClauseContext)_localctx).insertCond = booleanExpression(0);
				setState(322);
				match(THEN);
				setState(323);
				insertAction();
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

	public static class DeleteActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(HoodieSqlBaseParser.DELETE, 0); }
		public DeleteActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterDeleteAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitDeleteAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitDeleteAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteActionContext deleteAction() throws RecognitionException {
		DeleteActionContext _localctx = new DeleteActionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_deleteAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(DELETE);
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

	public static class UpdateActionContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(HoodieSqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(HoodieSqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(HoodieSqlBaseParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public UpdateActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterUpdateAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitUpdateAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitUpdateAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateActionContext updateAction() throws RecognitionException {
		UpdateActionContext _localctx = new UpdateActionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_updateAction);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(UPDATE);
				setState(330);
				match(SET);
				setState(331);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(UPDATE);
				setState(333);
				match(SET);
				setState(334);
				assignmentList();
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

	public static class InsertActionContext extends ParserRuleContext {
		public QualifiedNameListContext columns;
		public TerminalNode INSERT() { return getToken(HoodieSqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(HoodieSqlBaseParser.ASTERISK, 0); }
		public TerminalNode VALUES() { return getToken(HoodieSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InsertActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterInsertAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitInsertAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitInsertAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertActionContext insertAction() throws RecognitionException {
		InsertActionContext _localctx = new InsertActionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insertAction);
		int _la;
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(INSERT);
				setState(338);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(INSERT);
				setState(340);
				match(T__0);
				setState(341);
				((InsertActionContext)_localctx).columns = qualifiedNameList();
				setState(342);
				match(T__1);
				setState(343);
				match(VALUES);
				setState(344);
				match(T__0);
				setState(345);
				expression();
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(346);
					match(T__2);
					setState(347);
					expression();
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(353);
				match(T__1);
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

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			assignment();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(358);
				match(T__2);
				setState(359);
				assignment();
				}
				}
				setState(364);
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

	public static class AssignmentContext extends ParserRuleContext {
		public QualifiedNameContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(HoodieSqlBaseParser.EQ, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			((AssignmentContext)_localctx).key = qualifiedName();
			setState(366);
			match(EQ);
			setState(367);
			((AssignmentContext)_localctx).value = expression();
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			qualifiedName();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(370);
				match(T__2);
				setState(371);
				qualifiedName();
				}
				}
				setState(376);
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

	public static class UpdateTableStmtContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public TerminalNode UPDATE() { return getToken(HoodieSqlBaseParser.UPDATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(HoodieSqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(HoodieSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public UpdateTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateTableStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterUpdateTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitUpdateTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitUpdateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateTableStmtContext updateTableStmt() throws RecognitionException {
		UpdateTableStmtContext _localctx = new UpdateTableStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_updateTableStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(UPDATE);
			setState(378);
			tableIdentifier();
			setState(379);
			match(SET);
			setState(380);
			assignmentList();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(381);
				match(WHERE);
				setState(382);
				((UpdateTableStmtContext)_localctx).where = booleanExpression(0);
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

	public static class DeleteTableStmtContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public TerminalNode DELETE() { return getToken(HoodieSqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(HoodieSqlBaseParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(HoodieSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteTableStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterDeleteTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitDeleteTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitDeleteTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteTableStmtContext deleteTableStmt() throws RecognitionException {
		DeleteTableStmtContext _localctx = new DeleteTableStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_deleteTableStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(DELETE);
			setState(386);
			match(FROM);
			setState(387);
			tableIdentifier();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(388);
				match(WHERE);
				setState(389);
				((DeleteTableStmtContext)_localctx).where = booleanExpression(0);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HoodieSqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			namedExpression();
			setState(393);
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

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HoodieSqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			tableIdentifier();
			setState(396);
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

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HoodieSqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			functionIdentifier();
			setState(399);
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

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HoodieSqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			dataType();
			setState(402);
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

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HoodieSqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			colTypeList();
			setState(405);
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

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(HoodieSqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(HoodieSqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(HoodieSqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(HoodieSqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(HoodieSqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(HoodieSqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(HoodieSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(HoodieSqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(HoodieSqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(HoodieSqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(HoodieSqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(HoodieSqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(HoodieSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(HoodieSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(HoodieSqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(HoodieSqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(HoodieSqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(HoodieSqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(HoodieSqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(HoodieSqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(HoodieSqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(HoodieSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(HoodieSqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(HoodieSqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(HoodieSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(HoodieSqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(HoodieSqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(HoodieSqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(HoodieSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(HoodieSqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(HoodieSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(HoodieSqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(HoodieSqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(HoodieSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(HoodieSqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(HoodieSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(HoodieSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(HoodieSqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(HoodieSqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(HoodieSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(HoodieSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(HoodieSqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(HoodieSqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(HoodieSqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(HoodieSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(HoodieSqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(HoodieSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(HoodieSqlBaseParser.DFS, 0); }
		public TerminalNode DELETE() { return getToken(HoodieSqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(HoodieSqlBaseParser.FROM, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(408);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(410);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROLE) {
					{
					setState(412);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROLE) {
					{
					setState(416);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(419);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(420);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(421);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(422);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANT) {
					{
					setState(423);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(426);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(427);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(428);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(429);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(430);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(431);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(432);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(433);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(434);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(435);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(436);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(437);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(438);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(439);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(440);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(441);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(442);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(443);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(444);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(445);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(446);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(447);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(448);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(449);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(450);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(451);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(452);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(453);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(454);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(455);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(456);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(457);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(458);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(459);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(460);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(461);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(462);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(463);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(464);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(465);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(466);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(467);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(468);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(469);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(470);
				tableIdentifier();
				setState(471);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(472);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(474);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(475);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(476);
				tableIdentifier();
				setState(477);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(478);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(480);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(481);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(482);
				tableIdentifier();
				setState(483);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(484);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(486);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(487);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(488);
				tableIdentifier();
				setState(489);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(490);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(492);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(493);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(494);
				tableIdentifier();
				setState(495);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(496);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(498);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(499);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(500);
				tableIdentifier();
				setState(501);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(502);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(503);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(504);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(506);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(507);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(508);
				tableIdentifier();
				setState(509);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(510);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(511);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(513);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(514);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(515);
				tableIdentifier();
				setState(516);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(517);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(519);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(520);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(521);
				tableIdentifier();
				setState(522);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(523);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(525);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(526);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(527);
				tableIdentifier();
				setState(528);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(529);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(531);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(532);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(533);
				tableIdentifier();
				setState(534);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(536);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(537);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(538);
				tableIdentifier();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(539);
					partitionSpec();
					}
				}

				setState(542);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(544);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(545);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(546);
				tableIdentifier();
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(547);
					partitionSpec();
					}
				}

				setState(550);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(552);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(553);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(554);
				tableIdentifier();
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(555);
					partitionSpec();
					}
				}

				setState(558);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(559);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(561);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(562);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(563);
				tableIdentifier();
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(564);
					partitionSpec();
					}
				}

				setState(567);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(568);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(570);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(571);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(572);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(573);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(574);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(575);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(576);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
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

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(HoodieSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(HoodieSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(HoodieSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(HoodieSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(HoodieSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(HoodieSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(HoodieSqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(CREATE);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(580);
				match(TEMPORARY);
				}
			}

			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(583);
				match(EXTERNAL);
				}
			}

			setState(586);
			match(TABLE);
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(587);
				match(IF);
				setState(588);
				match(NOT);
				setState(589);
				match(EXISTS);
				}
				break;
			}
			setState(592);
			tableIdentifier();
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

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(HoodieSqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(HoodieSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(HoodieSqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(HoodieSqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(HoodieSqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(HoodieSqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(CLUSTERED);
			setState(595);
			match(BY);
			setState(596);
			identifierList();
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(597);
				match(SORTED);
				setState(598);
				match(BY);
				setState(599);
				orderedIdentifierList();
				}
			}

			setState(602);
			match(INTO);
			setState(603);
			match(INTEGER_VALUE);
			setState(604);
			match(BUCKETS);
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

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(HoodieSqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(HoodieSqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(HoodieSqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(HoodieSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(HoodieSqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(HoodieSqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_skewSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(SKEWED);
			setState(607);
			match(BY);
			setState(608);
			identifierList();
			setState(609);
			match(ON);
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(610);
				constantList();
				}
				break;
			case 2:
				{
				setState(611);
				nestedConstantList();
				}
				break;
			}
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORED) {
				{
				setState(614);
				match(STORED);
				setState(615);
				match(AS);
				setState(616);
				match(DIRECTORIES);
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

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(HoodieSqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(HoodieSqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(LOCATION);
			setState(620);
			match(STRING);
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

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(622);
				ctes();
				}
			}

			setState(625);
			queryNoWith();
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

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(HoodieSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(HoodieSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(HoodieSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(HoodieSqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(HoodieSqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(HoodieSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(HoodieSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(HoodieSqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(HoodieSqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(HoodieSqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(HoodieSqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(HoodieSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(HoodieSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(HoodieSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(HoodieSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(HoodieSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(HoodieSqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(HoodieSqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(HoodieSqlBaseParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(HoodieSqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_insertInto);
		int _la;
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				match(INSERT);
				setState(628);
				match(OVERWRITE);
				setState(629);
				match(TABLE);
				setState(630);
				tableIdentifier();
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(631);
					partitionSpec();
					setState(635);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(632);
						match(IF);
						setState(633);
						match(NOT);
						setState(634);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				match(INSERT);
				setState(640);
				match(INTO);
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(641);
					match(TABLE);
					}
					break;
				}
				setState(644);
				tableIdentifier();
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(645);
					partitionSpec();
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(648);
				match(INSERT);
				setState(649);
				match(OVERWRITE);
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(650);
					match(LOCAL);
					}
				}

				setState(653);
				match(DIRECTORY);
				setState(654);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(655);
					rowFormat();
					}
				}

				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(658);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(661);
				match(INSERT);
				setState(662);
				match(OVERWRITE);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(663);
					match(LOCAL);
					}
				}

				setState(666);
				match(DIRECTORY);
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(667);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(670);
				tableProvider();
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(671);
					match(OPTIONS);
					setState(672);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
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

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			partitionSpec();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(678);
				locationSpec();
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

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(HoodieSqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(PARTITION);
			setState(682);
			match(T__0);
			setState(683);
			partitionVal();
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(684);
				match(T__2);
				setState(685);
				partitionVal();
				}
				}
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(691);
			match(T__1);
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

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(HoodieSqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			identifier();
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(694);
				match(EQ);
				setState(695);
				constant();
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

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(HoodieSqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_describeFuncName);
		try {
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(701);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(702);
				predicateOperator();
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

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(706);
				match(T__3);
				setState(707);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(712);
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

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(HoodieSqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(WITH);
			setState(714);
			namedQuery();
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(715);
				match(T__2);
				setState(716);
				namedQuery();
				}
				}
				setState(721);
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

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(HoodieSqlBaseParser.AS, 0); }
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			((NamedQueryContext)_localctx).name = identifier();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(723);
				match(AS);
				}
			}

			setState(726);
			match(T__0);
			setState(727);
			query();
			setState(728);
			match(T__1);
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

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(HoodieSqlBaseParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(USING);
			setState(731);
			qualifiedName();
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

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(T__0);
			setState(734);
			tableProperty();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(735);
				match(T__2);
				setState(736);
				tableProperty();
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(742);
			match(T__1);
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

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(HoodieSqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 245)) & ~0x3f) == 0 && ((1L << (_la - 245)) & ((1L << (STRING - 245)) | (1L << (INTEGER_VALUE - 245)) | (1L << (DECIMAL_VALUE - 245)))) != 0)) {
				{
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(745);
					match(EQ);
					}
				}

				setState(748);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
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

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(HoodieSqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tablePropertyKey);
		int _la;
		try {
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				identifier();
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(752);
					match(T__3);
					setState(753);
					identifier();
					}
					}
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
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

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(HoodieSqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(HoodieSqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tablePropertyValue);
		try {
			setState(766);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(765);
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

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(T__0);
			setState(769);
			constant();
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(770);
				match(T__2);
				setState(771);
				constant();
				}
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(777);
			match(T__1);
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

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(T__0);
			setState(780);
			constantList();
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(781);
				match(T__2);
				setState(782);
				constantList();
				}
				}
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(788);
			match(T__1);
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

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(HoodieSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(HoodieSqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(HoodieSqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_createFileFormat);
		try {
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				match(STORED);
				setState(791);
				match(AS);
				setState(792);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				match(STORED);
				setState(794);
				match(BY);
				setState(795);
				storageHandler();
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

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(HoodieSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(HoodieSqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(HoodieSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HoodieSqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fileFormat);
		try {
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				match(INPUTFORMAT);
				setState(799);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(800);
				match(OUTPUTFORMAT);
				setState(801);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				identifier();
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

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(HoodieSqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(HoodieSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(HoodieSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_storageHandler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(STRING);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(806);
				match(WITH);
				setState(807);
				match(SERDEPROPERTIES);
				setState(808);
				tablePropertyList();
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

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(HoodieSqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			identifier();
			setState(812);
			match(STRING);
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

	public static class QueryNoWithContext extends ParserRuleContext {
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInsertQueryContext extends QueryNoWithContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends QueryNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_queryNoWith);
		int _la;
		try {
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(814);
					insertInto();
					}
				}

				setState(817);
				queryTerm(0);
				setState(818);
				queryOrganization();
				}
				break;
			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				fromClause();
				setState(822); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(821);
					multiInsertQueryBody();
					}
					}
					setState(824); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SELECT || _la==FROM || _la==INSERT || _la==MAP || _la==REDUCE );
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

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(HoodieSqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(HoodieSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(HoodieSqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(HoodieSqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(HoodieSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(HoodieSqlBaseParser.SORT, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(HoodieSqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(HoodieSqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(828);
				match(ORDER);
				setState(829);
				match(BY);
				setState(830);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(831);
					match(T__2);
					setState(832);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(837);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(840);
				match(CLUSTER);
				setState(841);
				match(BY);
				setState(842);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(843);
					match(T__2);
					setState(844);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(849);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(852);
				match(DISTRIBUTE);
				setState(853);
				match(BY);
				setState(854);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(855);
					match(T__2);
					setState(856);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(861);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(864);
				match(SORT);
				setState(865);
				match(BY);
				setState(866);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(867);
					match(T__2);
					setState(868);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(873);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(876);
				windows();
				}
			}

			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(879);
				match(LIMIT);
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(880);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(881);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
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

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(886);
				insertInto();
				}
			}

			setState(889);
			querySpecification();
			setState(890);
			queryOrganization();
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(HoodieSqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(HoodieSqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(HoodieSqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(HoodieSqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(893);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(918);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(916);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(895);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(896);
						if (!(legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enbled");
						setState(897);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (UNION - 107)) | (1L << (EXCEPT - 107)) | (1L << (SETMINUS - 107)) | (1L << (INTERSECT - 107)))) != 0)) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(899);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(898);
							setQuantifier();
							}
						}

						setState(901);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(902);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(903);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(904);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(906);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(905);
							setQuantifier();
							}
						}

						setState(908);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(909);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(910);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(911);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (UNION - 107)) | (1L << (EXCEPT - 107)) | (1L << (SETMINUS - 107)))) != 0)) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(913);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(912);
							setQuantifier();
							}
						}

						setState(915);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(920);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(HoodieSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_queryPrimary);
		try {
			setState(929);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(921);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				match(TABLE);
				setState(923);
				tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(924);
				inlineTable();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(925);
				match(T__0);
				setState(926);
				queryNoWith();
				setState(927);
				match(T__1);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(HoodieSqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(HoodieSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(HoodieSqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(HoodieSqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(HoodieSqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			expression();
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(932);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(935);
				match(NULLS);
				setState(936);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public BooleanExpressionContext where;
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public BooleanExpressionContext having;
		public TerminalNode USING() { return getToken(HoodieSqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(HoodieSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HoodieSqlBaseParser.STRING, i);
		}
		public TerminalNode RECORDWRITER() { return getToken(HoodieSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(HoodieSqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(HoodieSqlBaseParser.RECORDREADER, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(HoodieSqlBaseParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(HoodieSqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode TRANSFORM() { return getToken(HoodieSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(HoodieSqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(HoodieSqlBaseParser.REDUCE, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(HoodieSqlBaseParser.HAVING, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(949);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(939);
					match(SELECT);
					setState(940);
					((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(941);
					match(T__0);
					setState(942);
					namedExpressionSeq();
					setState(943);
					match(T__1);
					}
					break;
				case MAP:
					{
					setState(945);
					((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(946);
					namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(947);
					((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(948);
					namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(951);
					((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(954);
					match(RECORDWRITER);
					setState(955);
					((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(958);
				match(USING);
				setState(959);
				((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(972);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(960);
					match(AS);
					setState(970);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(961);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(962);
						colTypeList();
						}
						break;
					case 3:
						{
						{
						setState(963);
						match(T__0);
						setState(966);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
						case 1:
							{
							setState(964);
							identifierSeq();
							}
							break;
						case 2:
							{
							setState(965);
							colTypeList();
							}
							break;
						}
						setState(968);
						match(T__1);
						}
						}
						break;
					}
					}
					break;
				}
				setState(975);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(974);
					((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(979);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(977);
					match(RECORDREADER);
					setState(978);
					((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(982);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(981);
					fromClause();
					}
					break;
				}
				setState(986);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(984);
					match(WHERE);
					setState(985);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1010);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(988);
					((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(992);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(989);
						((QuerySpecificationContext)_localctx).hint = hint();
						((QuerySpecificationContext)_localctx).hints.add(((QuerySpecificationContext)_localctx).hint);
						}
						}
						setState(994);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(996);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						setState(995);
						setQuantifier();
						}
						break;
					}
					setState(998);
					namedExpressionSeq();
					setState(1000);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						setState(999);
						fromClause();
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(1002);
					fromClause();
					setState(1008);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						setState(1003);
						((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1005);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
						case 1:
							{
							setState(1004);
							setQuantifier();
							}
							break;
						}
						setState(1007);
						namedExpressionSeq();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1015);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1012);
						lateralView();
						}
						} 
					}
					setState(1017);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				setState(1020);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(1018);
					match(WHERE);
					setState(1019);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				setState(1023);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1022);
					aggregation();
					}
					break;
				}
				setState(1027);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1025);
					match(HAVING);
					setState(1026);
					((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					}
					break;
				}
				setState(1030);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1029);
					windows();
					}
					break;
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

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			match(T__4);
			setState(1035);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (PIVOT - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IGNORE - 128)) | (1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				{
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1036);
					match(T__2);
					}
				}

				setState(1039);
				((HintContext)_localctx).hintStatement = hintStatement();
				((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
				}
				}
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1045);
			match(T__5);
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

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_hintStatement);
		int _la;
		try {
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1049);
				match(T__0);
				setState(1050);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1051);
					match(T__2);
					setState(1052);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1057);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1058);
				match(T__1);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(HoodieSqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(FROM);
			setState(1063);
			relation();
			setState(1068);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1064);
					match(T__2);
					setState(1065);
					relation();
					}
					} 
				}
				setState(1070);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(1074);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1071);
					lateralView();
					}
					} 
				}
				setState(1076);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			setState(1078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1077);
				pivotClause();
				}
				break;
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

	public static class AggregationContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(HoodieSqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(HoodieSqlBaseParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(HoodieSqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(HoodieSqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(HoodieSqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(HoodieSqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(HoodieSqlBaseParser.GROUPING, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_aggregation);
		int _la;
		try {
			int _alt;
			setState(1124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				match(GROUP);
				setState(1081);
				match(BY);
				setState(1082);
				((AggregationContext)_localctx).expression = expression();
				((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
				setState(1087);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1083);
						match(T__2);
						setState(1084);
						((AggregationContext)_localctx).expression = expression();
						((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
						}
						} 
					}
					setState(1089);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
				setState(1107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1090);
					match(WITH);
					setState(1091);
					((AggregationContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1092);
					match(WITH);
					setState(1093);
					((AggregationContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1094);
					((AggregationContext)_localctx).kind = match(GROUPING);
					setState(1095);
					match(SETS);
					setState(1096);
					match(T__0);
					setState(1097);
					groupingSet();
					setState(1102);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1098);
						match(T__2);
						setState(1099);
						groupingSet();
						}
						}
						setState(1104);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1105);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				match(GROUP);
				setState(1110);
				match(BY);
				setState(1111);
				((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1112);
				match(SETS);
				setState(1113);
				match(T__0);
				setState(1114);
				groupingSet();
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1115);
					match(T__2);
					setState(1116);
					groupingSet();
					}
					}
					setState(1121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1122);
				match(T__1);
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

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_groupingSet);
		int _la;
		try {
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				match(T__0);
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (PIVOT - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IGNORE - 128)) | (1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1127);
					expression();
					setState(1132);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1128);
						match(T__2);
						setState(1129);
						expression();
						}
						}
						setState(1134);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1137);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
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

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(HoodieSqlBaseParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(HoodieSqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(HoodieSqlBaseParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			match(PIVOT);
			setState(1142);
			match(T__0);
			setState(1143);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1144);
			match(FOR);
			setState(1145);
			pivotColumn();
			setState(1146);
			match(IN);
			setState(1147);
			match(T__0);
			setState(1148);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1149);
				match(T__2);
				setState(1150);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1156);
			match(T__1);
			setState(1157);
			match(T__1);
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

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_pivotColumn);
		int _la;
		try {
			setState(1171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1159);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1160);
				match(T__0);
				setState(1161);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1162);
					match(T__2);
					setState(1163);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(1168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1169);
				match(T__1);
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

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(HoodieSqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pivotValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			expression();
			setState(1178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (PIVOT - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IGNORE - 128)) | (1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1174);
					match(AS);
					}
					break;
				}
				setState(1177);
				identifier();
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

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(HoodieSqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(HoodieSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(HoodieSqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(HoodieSqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			match(LATERAL);
			setState(1181);
			match(VIEW);
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1182);
				match(OUTER);
				}
				break;
			}
			setState(1185);
			qualifiedName();
			setState(1186);
			match(T__0);
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (PIVOT - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IGNORE - 128)) | (1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1187);
				expression();
				setState(1192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1188);
					match(T__2);
					setState(1189);
					expression();
					}
					}
					setState(1194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1197);
			match(T__1);
			setState(1198);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1199);
					match(AS);
					}
					break;
				}
				setState(1202);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1203);
						match(T__2);
						setState(1204);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1209);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				}
				}
				break;
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(HoodieSqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(HoodieSqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
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

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			relationPrimary();
			setState(1218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1215);
					joinRelation();
					}
					} 
				}
				setState(1220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
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

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(HoodieSqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(HoodieSqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_joinRelation);
		try {
			setState(1232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case CROSS:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case ANTI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1221);
				joinType();
				}
				setState(1222);
				match(JOIN);
				setState(1223);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1224);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1227);
				match(NATURAL);
				setState(1228);
				joinType();
				setState(1229);
				match(JOIN);
				setState(1230);
				((JoinRelationContext)_localctx).right = relationPrimary();
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(HoodieSqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(HoodieSqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(HoodieSqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(HoodieSqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(HoodieSqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(HoodieSqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(HoodieSqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(HoodieSqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_joinType);
		int _la;
		try {
			setState(1256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1234);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1237);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1238);
				match(LEFT);
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1239);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1242);
				match(LEFT);
				setState(1243);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1244);
				match(RIGHT);
				setState(1246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1245);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1248);
				match(FULL);
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1249);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1252);
					match(LEFT);
					}
				}

				setState(1255);
				match(ANTI);
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(HoodieSqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(HoodieSqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_joinCriteria);
		int _la;
		try {
			setState(1272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1258);
				match(ON);
				setState(1259);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				match(USING);
				setState(1261);
				match(T__0);
				setState(1262);
				identifier();
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1263);
					match(T__2);
					setState(1264);
					identifier();
					}
					}
					setState(1269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1270);
				match(T__1);
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

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(HoodieSqlBaseParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			match(TABLESAMPLE);
			setState(1275);
			match(T__0);
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (PIVOT - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IGNORE - 128)) | (1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1276);
				sampleMethod();
				}
			}

			setState(1279);
			match(T__1);
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

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(HoodieSqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(HoodieSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(HoodieSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(HoodieSqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(HoodieSqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(HoodieSqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(HoodieSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(HoodieSqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(HoodieSqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_sampleMethod);
		int _la;
		try {
			setState(1305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1281);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(1284);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1285);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1286);
				expression();
				setState(1287);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1289);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(1290);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1291);
				match(OUT);
				setState(1292);
				match(OF);
				setState(1293);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1294);
					match(ON);
					setState(1300);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
					case 1:
						{
						setState(1295);
						identifier();
						}
						break;
					case 2:
						{
						setState(1296);
						qualifiedName();
						setState(1297);
						match(T__0);
						setState(1298);
						match(T__1);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1304);
				((SampleByBytesContext)_localctx).bytes = expression();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			match(T__0);
			setState(1308);
			identifierSeq();
			setState(1309);
			match(T__1);
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

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			identifier();
			setState(1316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1312);
					match(T__2);
					setState(1313);
					identifier();
					}
					} 
				}
				setState(1318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			match(T__0);
			setState(1320);
			orderedIdentifier();
			setState(1325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1321);
				match(T__2);
				setState(1322);
				orderedIdentifier();
				}
				}
				setState(1327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1328);
			match(T__1);
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

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public Token ordering;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(HoodieSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(HoodieSqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			identifier();
			setState(1332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1331);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			match(T__0);
			setState(1335);
			identifierComment();
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1336);
				match(T__2);
				setState(1337);
				identifierComment();
				}
				}
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1343);
			match(T__1);
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

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(HoodieSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(HoodieSqlBaseParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			identifier();
			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1346);
				match(COMMENT);
				setState(1347);
				match(STRING);
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_relationPrimary);
		try {
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1350);
				tableIdentifier();
				setState(1352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1351);
					sample();
					}
					break;
				}
				setState(1354);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1356);
				match(T__0);
				setState(1357);
				queryNoWith();
				setState(1358);
				match(T__1);
				setState(1360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1359);
					sample();
					}
					break;
				}
				setState(1362);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1364);
				match(T__0);
				setState(1365);
				relation();
				setState(1366);
				match(T__1);
				setState(1368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1367);
					sample();
					}
					break;
				}
				setState(1370);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1372);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1373);
				functionTable();
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(HoodieSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			match(VALUES);
			setState(1377);
			expression();
			setState(1382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1378);
					match(T__2);
					setState(1379);
					expression();
					}
					} 
				}
				setState(1384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			setState(1385);
			tableAlias();
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

	public static class FunctionTableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			identifier();
			setState(1388);
			match(T__0);
			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (PIVOT - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IGNORE - 128)) | (1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1389);
				expression();
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1390);
					match(T__2);
					setState(1391);
					expression();
					}
					}
					setState(1396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1399);
			match(T__1);
			setState(1400);
			tableAlias();
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

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(HoodieSqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1402);
					match(AS);
					}
					break;
				}
				setState(1405);
				strictIdentifier();
				setState(1407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1406);
					identifierList();
					}
					break;
				}
				}
				break;
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

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(HoodieSqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(HoodieSqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(HoodieSqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(HoodieSqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(HoodieSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(HoodieSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(HoodieSqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(HoodieSqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(HoodieSqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(HoodieSqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(HoodieSqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(HoodieSqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(HoodieSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(HoodieSqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(HoodieSqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(HoodieSqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(HoodieSqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(HoodieSqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(HoodieSqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(HoodieSqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(HoodieSqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(HoodieSqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(HoodieSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HoodieSqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(HoodieSqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_rowFormat);
		try {
			setState(1460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1411);
				match(ROW);
				setState(1412);
				match(FORMAT);
				setState(1413);
				match(SERDE);
				setState(1414);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1415);
					match(WITH);
					setState(1416);
					match(SERDEPROPERTIES);
					setState(1417);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1420);
				match(ROW);
				setState(1421);
				match(FORMAT);
				setState(1422);
				match(DELIMITED);
				setState(1432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1423);
					match(FIELDS);
					setState(1424);
					match(TERMINATED);
					setState(1425);
					match(BY);
					setState(1426);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1430);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
					case 1:
						{
						setState(1427);
						match(ESCAPED);
						setState(1428);
						match(BY);
						setState(1429);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1434);
					match(COLLECTION);
					setState(1435);
					match(ITEMS);
					setState(1436);
					match(TERMINATED);
					setState(1437);
					match(BY);
					setState(1438);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1441);
					match(MAP);
					setState(1442);
					match(KEYS);
					setState(1443);
					match(TERMINATED);
					setState(1444);
					match(BY);
					setState(1445);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1448);
					match(LINES);
					setState(1449);
					match(TERMINATED);
					setState(1450);
					match(BY);
					setState(1451);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(1458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1454);
					match(NULL);
					setState(1455);
					match(DEFINED);
					setState(1456);
					match(AS);
					setState(1457);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
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
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1462);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(1463);
				match(T__3);
				}
				break;
			}
			setState(1467);
			((TableIdentifierContext)_localctx).table = identifier();
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

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext function;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1469);
				((FunctionIdentifierContext)_localctx).db = identifier();
				setState(1470);
				match(T__3);
				}
				break;
			}
			setState(1474);
			((FunctionIdentifierContext)_localctx).function = identifier();
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

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(HoodieSqlBaseParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			expression();
			setState(1484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1478);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1477);
					match(AS);
					}
					break;
				}
				setState(1482);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case ANY:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case PIVOT:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case DIRECTORY:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case BOTH:
				case LEADING:
				case TRAILING:
				case IF:
				case POSITION:
				case EXTRACT:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1480);
					identifier();
					}
					break;
				case T__0:
					{
					setState(1481);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			namedExpression();
			setState(1491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1487);
					match(T__2);
					setState(1488);
					namedExpression();
					}
					} 
				}
				setState(1493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(HoodieSqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(HoodieSqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(HoodieSqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(HoodieSqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 172;
		enterRecursionRule(_localctx, 172, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1497);
				match(NOT);
				setState(1498);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1499);
				match(EXISTS);
				setState(1500);
				match(T__0);
				setState(1501);
				query();
				setState(1502);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1504);
				valueExpression(0);
				setState(1506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1505);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1516);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1510);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1511);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1512);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1513);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1514);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1515);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(HoodieSqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(HoodieSqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(HoodieSqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(HoodieSqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(HoodieSqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(HoodieSqlBaseParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(HoodieSqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(HoodieSqlBaseParser.NULL, 0); }
		public TerminalNode FROM() { return getToken(HoodieSqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(HoodieSqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_predicate);
		int _la;
		try {
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1521);
					match(NOT);
					}
				}

				setState(1524);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1525);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1526);
				match(AND);
				setState(1527);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1529);
					match(NOT);
					}
				}

				setState(1532);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1533);
				match(T__0);
				setState(1534);
				expression();
				setState(1539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1535);
					match(T__2);
					setState(1536);
					expression();
					}
					}
					setState(1541);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1542);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1544);
					match(NOT);
					}
				}

				setState(1547);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1548);
				match(T__0);
				setState(1549);
				query();
				setState(1550);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1552);
					match(NOT);
					}
				}

				setState(1555);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1556);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1557);
				match(IS);
				setState(1559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1558);
					match(NOT);
					}
				}

				setState(1561);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1562);
				match(IS);
				setState(1564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1563);
					match(NOT);
					}
				}

				setState(1566);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(1567);
				match(FROM);
				setState(1568);
				((PredicateContext)_localctx).right = valueExpression(0);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(HoodieSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(HoodieSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(HoodieSqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(HoodieSqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(HoodieSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(HoodieSqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(HoodieSqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(HoodieSqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(HoodieSqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(HoodieSqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(HoodieSqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(HoodieSqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1572);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1573);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (PLUS - 143)) | (1L << (MINUS - 143)) | (1L << (TILDE - 143)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1574);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1596);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1577);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1578);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (ASTERISK - 145)) | (1L << (SLASH - 145)) | (1L << (PERCENT - 145)) | (1L << (DIV - 145)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1579);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1580);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1581);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (PLUS - 143)) | (1L << (MINUS - 143)) | (1L << (CONCAT_PIPE - 143)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1582);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1583);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1584);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(1585);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1586);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1587);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(1588);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1589);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1590);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(1591);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1592);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1593);
						comparisonOperator();
						setState(1594);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(1600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(HoodieSqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(HoodieSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(HoodieSqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(HoodieSqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(HoodieSqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(HoodieSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(HoodieSqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(HoodieSqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(HoodieSqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(HoodieSqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HoodieSqlBaseParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HoodieSqlBaseParser.IDENTIFIER, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(HoodieSqlBaseParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(HoodieSqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public Token trimOption;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(HoodieSqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(HoodieSqlBaseParser.FROM, 0); }
		public TerminalNode BOTH() { return getToken(HoodieSqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(HoodieSqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(HoodieSqlBaseParser.TRAILING, 0); }
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(HoodieSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(HoodieSqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(HoodieSqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(HoodieSqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(HoodieSqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(HoodieSqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(HoodieSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(HoodieSqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1602);
				match(CASE);
				setState(1604); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1603);
					whenClause();
					}
					}
					setState(1606); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1608);
					match(ELSE);
					setState(1609);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1612);
				match(END);
				}
				break;
			case 2:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1614);
				match(CASE);
				setState(1615);
				((SimpleCaseContext)_localctx).value = expression();
				setState(1617); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1616);
					whenClause();
					}
					}
					setState(1619); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1621);
					match(ELSE);
					setState(1622);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1625);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1627);
				match(CAST);
				setState(1628);
				match(T__0);
				setState(1629);
				expression();
				setState(1630);
				match(AS);
				setState(1631);
				dataType();
				setState(1632);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1634);
				match(STRUCT);
				setState(1635);
				match(T__0);
				setState(1644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (PIVOT - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IGNORE - 128)) | (1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1636);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(1641);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1637);
						match(T__2);
						setState(1638);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(1643);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1646);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1647);
				match(FIRST);
				setState(1648);
				match(T__0);
				setState(1649);
				expression();
				setState(1652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(1650);
					match(IGNORE);
					setState(1651);
					match(NULLS);
					}
				}

				setState(1654);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1656);
				match(LAST);
				setState(1657);
				match(T__0);
				setState(1658);
				expression();
				setState(1661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(1659);
					match(IGNORE);
					setState(1660);
					match(NULLS);
					}
				}

				setState(1663);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1665);
				match(POSITION);
				setState(1666);
				match(T__0);
				setState(1667);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(1668);
				match(IN);
				setState(1669);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(1670);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1672);
				constant();
				}
				break;
			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1673);
				match(ASTERISK);
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1674);
				qualifiedName();
				setState(1675);
				match(T__3);
				setState(1676);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1678);
				match(T__0);
				setState(1679);
				namedExpression();
				setState(1682); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1680);
					match(T__2);
					setState(1681);
					namedExpression();
					}
					}
					setState(1684); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(1686);
				match(T__1);
				}
				break;
			case 12:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1688);
				match(T__0);
				setState(1689);
				query();
				setState(1690);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1692);
				qualifiedName();
				setState(1693);
				match(T__0);
				setState(1705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (PIVOT - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IGNORE - 128)) | (1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1695);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
					case 1:
						{
						setState(1694);
						setQuantifier();
						}
						break;
					}
					setState(1697);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(1702);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1698);
						match(T__2);
						setState(1699);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(1704);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1707);
				match(T__1);
				setState(1710);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1708);
					match(OVER);
					setState(1709);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1712);
				qualifiedName();
				setState(1713);
				match(T__0);
				setState(1714);
				((FunctionCallContext)_localctx).trimOption = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (BOTH - 129)) | (1L << (LEADING - 129)) | (1L << (TRAILING - 129)))) != 0)) ) {
					((FunctionCallContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1715);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(1716);
				match(FROM);
				setState(1717);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(1718);
				match(T__1);
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1720);
				match(IDENTIFIER);
				setState(1721);
				match(T__6);
				setState(1722);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1723);
				match(T__0);
				setState(1724);
				match(IDENTIFIER);
				setState(1727); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1725);
					match(T__2);
					setState(1726);
					match(IDENTIFIER);
					}
					}
					setState(1729); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(1731);
				match(T__1);
				setState(1732);
				match(T__6);
				setState(1733);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1734);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1735);
				match(T__0);
				setState(1736);
				expression();
				setState(1737);
				match(T__1);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1739);
				match(EXTRACT);
				setState(1740);
				match(T__0);
				setState(1741);
				((ExtractContext)_localctx).field = identifier();
				setState(1742);
				match(FROM);
				setState(1743);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(1744);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1756);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1748);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1749);
						match(T__7);
						setState(1750);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1751);
						match(T__8);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1753);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1754);
						match(T__3);
						setState(1755);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(HoodieSqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(HoodieSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HoodieSqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(HoodieSqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
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
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
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
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_constant);
		try {
			int _alt;
			setState(1773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1761);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1762);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1763);
				identifier();
				setState(1764);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1766);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1767);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1769); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1768);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1771); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(HoodieSqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(HoodieSqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(HoodieSqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(HoodieSqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(HoodieSqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(HoodieSqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(HoodieSqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(HoodieSqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
			_la = _input.LA(1);
			if ( !(((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (EQ - 135)) | (1L << (NSEQ - 135)) | (1L << (NEQ - 135)) | (1L << (NEQJ - 135)) | (1L << (LT - 135)) | (1L << (LTE - 135)) | (1L << (GT - 135)) | (1L << (GTE - 135)))) != 0)) ) {
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(HoodieSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(HoodieSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(HoodieSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(HoodieSqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(HoodieSqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(HoodieSqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(HoodieSqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(HoodieSqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(HoodieSqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(HoodieSqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			_la = _input.LA(1);
			if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (PLUS - 143)) | (1L << (MINUS - 143)) | (1L << (ASTERISK - 143)) | (1L << (SLASH - 143)) | (1L << (PERCENT - 143)) | (1L << (DIV - 143)) | (1L << (TILDE - 143)) | (1L << (AMPERSAND - 143)) | (1L << (PIPE - 143)) | (1L << (CONCAT_PIPE - 143)) | (1L << (HAT - 143)))) != 0)) ) {
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

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(HoodieSqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(HoodieSqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(HoodieSqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(HoodieSqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(HoodieSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HoodieSqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(HoodieSqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			match(INTERVAL);
			setState(1787);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1784);
					intervalField();
					}
					} 
				}
				setState(1789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(HoodieSqlBaseParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(1791);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(1794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1792);
				match(TO);
				setState(1793);
				((IntervalFieldContext)_localctx).to = identifier();
				}
				break;
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

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(HoodieSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(HoodieSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(HoodieSqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_intervalValue);
		int _la;
		try {
			setState(1801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1796);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1799);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1800);
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

	public static class ColPositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(HoodieSqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(HoodieSqlBaseParser.AFTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_colPosition);
		try {
			setState(1806);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1803);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1804);
				match(AFTER);
				setState(1805);
				identifier();
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(HoodieSqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(HoodieSqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(HoodieSqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(HoodieSqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(HoodieSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(HoodieSqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_dataType);
		int _la;
		try {
			setState(1842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1808);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(1809);
				match(LT);
				setState(1810);
				dataType();
				setState(1811);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1813);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(1814);
				match(LT);
				setState(1815);
				dataType();
				setState(1816);
				match(T__2);
				setState(1817);
				dataType();
				setState(1818);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1820);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(1827);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(1821);
					match(LT);
					setState(1823);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (PIVOT - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IGNORE - 128)) | (1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
						{
						setState(1822);
						complexColTypeList();
						}
					}

					setState(1825);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(1826);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1829);
				identifier();
				setState(1840);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1830);
					match(T__0);
					setState(1831);
					match(INTEGER_VALUE);
					setState(1836);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1832);
						match(T__2);
						setState(1833);
						match(INTEGER_VALUE);
						}
						}
						setState(1838);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1839);
					match(T__1);
					}
					break;
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

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			colType();
			setState(1849);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1845);
					match(T__2);
					setState(1846);
					colType();
					}
					} 
				}
				setState(1851);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
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

	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(HoodieSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(HoodieSqlBaseParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			identifier();
			setState(1853);
			dataType();
			setState(1856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1854);
				match(COMMENT);
				setState(1855);
				match(STRING);
				}
				break;
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

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			complexColType();
			setState(1863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1859);
				match(T__2);
				setState(1860);
				complexColType();
				}
				}
				setState(1865);
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

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(HoodieSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(HoodieSqlBaseParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			identifier();
			setState(1867);
			match(T__9);
			setState(1868);
			dataType();
			setState(1871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1869);
				match(COMMENT);
				setState(1870);
				match(STRING);
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(HoodieSqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(HoodieSqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			match(WHEN);
			setState(1874);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1875);
			match(THEN);
			setState(1876);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class WindowsContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(HoodieSqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterWindows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitWindows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitWindows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
			match(WINDOW);
			setState(1879);
			namedWindow();
			setState(1884);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1880);
					match(T__2);
					setState(1881);
					namedWindow();
					}
					} 
				}
				setState(1886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
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

	public static class NamedWindowContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(HoodieSqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
			identifier();
			setState(1888);
			match(AS);
			setState(1889);
			windowSpec();
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

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(HoodieSqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(HoodieSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(HoodieSqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(HoodieSqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(HoodieSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(HoodieSqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(HoodieSqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_windowSpec);
		int _la;
		try {
			setState(1937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1891);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1892);
				match(T__0);
				setState(1893);
				((WindowRefContext)_localctx).name = identifier();
				setState(1894);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1896);
				match(T__0);
				setState(1931);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(1897);
					match(CLUSTER);
					setState(1898);
					match(BY);
					setState(1899);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(1904);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1900);
						match(T__2);
						setState(1901);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(1906);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__1:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
				case DISTRIBUTE:
					{
					setState(1917);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(1907);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1908);
						match(BY);
						setState(1909);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(1914);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(1910);
							match(T__2);
							setState(1911);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(1916);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(1929);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(1919);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1920);
						match(BY);
						setState(1921);
						sortItem();
						setState(1926);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(1922);
							match(T__2);
							setState(1923);
							sortItem();
							}
							}
							setState(1928);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(1933);
					windowFrame();
					}
				}

				setState(1936);
				match(T__1);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(HoodieSqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(HoodieSqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(HoodieSqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(HoodieSqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_windowFrame);
		try {
			setState(1955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1939);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1940);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1941);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1942);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1943);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1944);
				match(BETWEEN);
				setState(1945);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1946);
				match(AND);
				setState(1947);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1949);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1950);
				match(BETWEEN);
				setState(1951);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1952);
				match(AND);
				setState(1953);
				((WindowFrameContext)_localctx).end = frameBound();
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

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(HoodieSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(HoodieSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(HoodieSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(HoodieSqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(HoodieSqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_frameBound);
		int _la;
		try {
			setState(1964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1957);
				match(UNBOUNDED);
				setState(1958);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1959);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(1960);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1961);
				expression();
				setState(1962);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			identifier();
			setState(1971);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1967);
					match(T__3);
					setState(1968);
					identifier();
					}
					} 
				}
				setState(1973);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
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
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode ANTI() { return getToken(HoodieSqlBaseParser.ANTI, 0); }
		public TerminalNode FULL() { return getToken(HoodieSqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(HoodieSqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(HoodieSqlBaseParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(HoodieSqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(HoodieSqlBaseParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(HoodieSqlBaseParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(HoodieSqlBaseParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(HoodieSqlBaseParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(HoodieSqlBaseParser.ON, 0); }
		public TerminalNode UNION() { return getToken(HoodieSqlBaseParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(HoodieSqlBaseParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(HoodieSqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(HoodieSqlBaseParser.SETMINUS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_identifier);
		try {
			setState(1989);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1974);
				strictIdentifier();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1975);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1976);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1977);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1978);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(1979);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1980);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1981);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1982);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 10);
				{
				setState(1983);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 11);
				{
				setState(1984);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 12);
				{
				setState(1985);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(1986);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 14);
				{
				setState(1987);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(1988);
				match(SETMINUS);
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

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(HoodieSqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_strictIdentifier);
		try {
			setState(1994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1991);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1992);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1993);
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
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(HoodieSqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
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
		public TerminalNode DECIMAL_VALUE() { return getToken(HoodieSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(HoodieSqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(HoodieSqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(HoodieSqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(HoodieSqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(HoodieSqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_number);
		int _la;
		try {
			setState(2026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1998);
					match(MINUS);
					}
				}

				setState(2001);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2002);
					match(MINUS);
					}
				}

				setState(2005);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2006);
					match(MINUS);
					}
				}

				setState(2009);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2010);
					match(MINUS);
					}
				}

				setState(2013);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2014);
					match(MINUS);
					}
				}

				setState(2017);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2018);
					match(MINUS);
					}
				}

				setState(2021);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2022);
					match(MINUS);
					}
				}

				setState(2025);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(HoodieSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(HoodieSqlBaseParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(HoodieSqlBaseParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(HoodieSqlBaseParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(HoodieSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(HoodieSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(HoodieSqlBaseParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(HoodieSqlBaseParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(HoodieSqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(HoodieSqlBaseParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(HoodieSqlBaseParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(HoodieSqlBaseParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(HoodieSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(HoodieSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(HoodieSqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(HoodieSqlBaseParser.ROW, 0); }
		public TerminalNode LAST() { return getToken(HoodieSqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(HoodieSqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(HoodieSqlBaseParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(HoodieSqlBaseParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(HoodieSqlBaseParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(HoodieSqlBaseParser.STRUCT, 0); }
		public TerminalNode PIVOT() { return getToken(HoodieSqlBaseParser.PIVOT, 0); }
		public TerminalNode LATERAL() { return getToken(HoodieSqlBaseParser.LATERAL, 0); }
		public TerminalNode WINDOW() { return getToken(HoodieSqlBaseParser.WINDOW, 0); }
		public TerminalNode REDUCE() { return getToken(HoodieSqlBaseParser.REDUCE, 0); }
		public TerminalNode TRANSFORM() { return getToken(HoodieSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode SERDE() { return getToken(HoodieSqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(HoodieSqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECORDREADER() { return getToken(HoodieSqlBaseParser.RECORDREADER, 0); }
		public TerminalNode DELIMITED() { return getToken(HoodieSqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(HoodieSqlBaseParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(HoodieSqlBaseParser.TERMINATED, 0); }
		public TerminalNode COLLECTION() { return getToken(HoodieSqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(HoodieSqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(HoodieSqlBaseParser.KEYS, 0); }
		public TerminalNode ESCAPED() { return getToken(HoodieSqlBaseParser.ESCAPED, 0); }
		public TerminalNode LINES() { return getToken(HoodieSqlBaseParser.LINES, 0); }
		public TerminalNode SEPARATED() { return getToken(HoodieSqlBaseParser.SEPARATED, 0); }
		public TerminalNode EXTENDED() { return getToken(HoodieSqlBaseParser.EXTENDED, 0); }
		public TerminalNode REFRESH() { return getToken(HoodieSqlBaseParser.REFRESH, 0); }
		public TerminalNode CLEAR() { return getToken(HoodieSqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(HoodieSqlBaseParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(HoodieSqlBaseParser.UNCACHE, 0); }
		public TerminalNode LAZY() { return getToken(HoodieSqlBaseParser.LAZY, 0); }
		public TerminalNode GLOBAL() { return getToken(HoodieSqlBaseParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(HoodieSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode OPTIONS() { return getToken(HoodieSqlBaseParser.OPTIONS, 0); }
		public TerminalNode GROUPING() { return getToken(HoodieSqlBaseParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(HoodieSqlBaseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(HoodieSqlBaseParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(HoodieSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FORMAT() { return getToken(HoodieSqlBaseParser.FORMAT, 0); }
		public TerminalNode LOGICAL() { return getToken(HoodieSqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(HoodieSqlBaseParser.FORMATTED, 0); }
		public TerminalNode CODEGEN() { return getToken(HoodieSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(HoodieSqlBaseParser.COST, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(HoodieSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode USE() { return getToken(HoodieSqlBaseParser.USE, 0); }
		public TerminalNode TO() { return getToken(HoodieSqlBaseParser.TO, 0); }
		public TerminalNode BUCKET() { return getToken(HoodieSqlBaseParser.BUCKET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(HoodieSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(HoodieSqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(HoodieSqlBaseParser.OF, 0); }
		public TerminalNode SET() { return getToken(HoodieSqlBaseParser.SET, 0); }
		public TerminalNode RESET() { return getToken(HoodieSqlBaseParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(HoodieSqlBaseParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(HoodieSqlBaseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(HoodieSqlBaseParser.IF, 0); }
		public TerminalNode POSITION() { return getToken(HoodieSqlBaseParser.POSITION, 0); }
		public TerminalNode EXTRACT() { return getToken(HoodieSqlBaseParser.EXTRACT, 0); }
		public TerminalNode NO() { return getToken(HoodieSqlBaseParser.NO, 0); }
		public TerminalNode DATA() { return getToken(HoodieSqlBaseParser.DATA, 0); }
		public TerminalNode START() { return getToken(HoodieSqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(HoodieSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(HoodieSqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(HoodieSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(HoodieSqlBaseParser.IGNORE, 0); }
		public TerminalNode SORT() { return getToken(HoodieSqlBaseParser.SORT, 0); }
		public TerminalNode CLUSTER() { return getToken(HoodieSqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(HoodieSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode UNSET() { return getToken(HoodieSqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(HoodieSqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode SKEWED() { return getToken(HoodieSqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(HoodieSqlBaseParser.STORED, 0); }
		public TerminalNode DIRECTORIES() { return getToken(HoodieSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode LOCATION() { return getToken(HoodieSqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(HoodieSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode ARCHIVE() { return getToken(HoodieSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(HoodieSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(HoodieSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode TOUCH() { return getToken(HoodieSqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(HoodieSqlBaseParser.COMPACT, 0); }
		public TerminalNode CONCATENATE() { return getToken(HoodieSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CHANGE() { return getToken(HoodieSqlBaseParser.CHANGE, 0); }
		public TerminalNode CASCADE() { return getToken(HoodieSqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(HoodieSqlBaseParser.RESTRICT, 0); }
		public TerminalNode BUCKETS() { return getToken(HoodieSqlBaseParser.BUCKETS, 0); }
		public TerminalNode CLUSTERED() { return getToken(HoodieSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(HoodieSqlBaseParser.SORTED, 0); }
		public TerminalNode PURGE() { return getToken(HoodieSqlBaseParser.PURGE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(HoodieSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(HoodieSqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(HoodieSqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DFS() { return getToken(HoodieSqlBaseParser.DFS, 0); }
		public TerminalNode TRUNCATE() { return getToken(HoodieSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(HoodieSqlBaseParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(HoodieSqlBaseParser.LIST, 0); }
		public TerminalNode STATISTICS() { return getToken(HoodieSqlBaseParser.STATISTICS, 0); }
		public TerminalNode ANALYZE() { return getToken(HoodieSqlBaseParser.ANALYZE, 0); }
		public TerminalNode PARTITIONED() { return getToken(HoodieSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode EXTERNAL() { return getToken(HoodieSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode DEFINED() { return getToken(HoodieSqlBaseParser.DEFINED, 0); }
		public TerminalNode RECORDWRITER() { return getToken(HoodieSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode REVOKE() { return getToken(HoodieSqlBaseParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(HoodieSqlBaseParser.GRANT, 0); }
		public TerminalNode LOCK() { return getToken(HoodieSqlBaseParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(HoodieSqlBaseParser.UNLOCK, 0); }
		public TerminalNode MSCK() { return getToken(HoodieSqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(HoodieSqlBaseParser.REPAIR, 0); }
		public TerminalNode RECOVER() { return getToken(HoodieSqlBaseParser.RECOVER, 0); }
		public TerminalNode EXPORT() { return getToken(HoodieSqlBaseParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(HoodieSqlBaseParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(HoodieSqlBaseParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(HoodieSqlBaseParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(HoodieSqlBaseParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(HoodieSqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(HoodieSqlBaseParser.ROLES, 0); }
		public TerminalNode COMPACTIONS() { return getToken(HoodieSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(HoodieSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(HoodieSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEX() { return getToken(HoodieSqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(HoodieSqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(HoodieSqlBaseParser.LOCKS, 0); }
		public TerminalNode OPTION() { return getToken(HoodieSqlBaseParser.OPTION, 0); }
		public TerminalNode LOCAL() { return getToken(HoodieSqlBaseParser.LOCAL, 0); }
		public TerminalNode INPATH() { return getToken(HoodieSqlBaseParser.INPATH, 0); }
		public TerminalNode ASC() { return getToken(HoodieSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(HoodieSqlBaseParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(HoodieSqlBaseParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(HoodieSqlBaseParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(HoodieSqlBaseParser.SETS, 0); }
		public TerminalNode AT() { return getToken(HoodieSqlBaseParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(HoodieSqlBaseParser.NULLS, 0); }
		public TerminalNode OVERWRITE() { return getToken(HoodieSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode ALL() { return getToken(HoodieSqlBaseParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(HoodieSqlBaseParser.ANY, 0); }
		public TerminalNode ALTER() { return getToken(HoodieSqlBaseParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(HoodieSqlBaseParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(HoodieSqlBaseParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(HoodieSqlBaseParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(HoodieSqlBaseParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(HoodieSqlBaseParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(HoodieSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(HoodieSqlBaseParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(HoodieSqlBaseParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(HoodieSqlBaseParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(HoodieSqlBaseParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(HoodieSqlBaseParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(HoodieSqlBaseParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(HoodieSqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(HoodieSqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(HoodieSqlBaseParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(HoodieSqlBaseParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(HoodieSqlBaseParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(HoodieSqlBaseParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(HoodieSqlBaseParser.OUTER, 0); }
		public TerminalNode TABLE() { return getToken(HoodieSqlBaseParser.TABLE, 0); }
		public TerminalNode TRUE() { return getToken(HoodieSqlBaseParser.TRUE, 0); }
		public TerminalNode WITH() { return getToken(HoodieSqlBaseParser.WITH, 0); }
		public TerminalNode RLIKE() { return getToken(HoodieSqlBaseParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(HoodieSqlBaseParser.AND, 0); }
		public TerminalNode CASE() { return getToken(HoodieSqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(HoodieSqlBaseParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(HoodieSqlBaseParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(HoodieSqlBaseParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(HoodieSqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(HoodieSqlBaseParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(HoodieSqlBaseParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(HoodieSqlBaseParser.INTERVAL, 0); }
		public TerminalNode MACRO() { return getToken(HoodieSqlBaseParser.MACRO, 0); }
		public TerminalNode OR() { return getToken(HoodieSqlBaseParser.OR, 0); }
		public TerminalNode STRATIFY() { return getToken(HoodieSqlBaseParser.STRATIFY, 0); }
		public TerminalNode THEN() { return getToken(HoodieSqlBaseParser.THEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(HoodieSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode WHEN() { return getToken(HoodieSqlBaseParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(HoodieSqlBaseParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(HoodieSqlBaseParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(HoodieSqlBaseParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(HoodieSqlBaseParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(HoodieSqlBaseParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(HoodieSqlBaseParser.NOT, 0); }
		public TerminalNode DIRECTORY() { return getToken(HoodieSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode BOTH() { return getToken(HoodieSqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(HoodieSqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(HoodieSqlBaseParser.TRAILING, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlBaseListener ) ((HoodieSqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlBaseVisitor ) return ((HoodieSqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PIVOT - 67)) | (1L << (LATERAL - 67)) | (1L << (WINDOW - 67)) | (1L << (OVER - 67)) | (1L << (PARTITION - 67)) | (1L << (RANGE - 67)) | (1L << (ROWS - 67)) | (1L << (UNBOUNDED - 67)) | (1L << (PRECEDING - 67)) | (1L << (FOLLOWING - 67)) | (1L << (CURRENT - 67)) | (1L << (FIRST - 67)) | (1L << (AFTER - 67)) | (1L << (LAST - 67)) | (1L << (ROW - 67)) | (1L << (WITH - 67)) | (1L << (VALUES - 67)) | (1L << (CREATE - 67)) | (1L << (TABLE - 67)) | (1L << (DIRECTORY - 67)) | (1L << (VIEW - 67)) | (1L << (REPLACE - 67)) | (1L << (INSERT - 67)) | (1L << (DELETE - 67)) | (1L << (INTO - 67)) | (1L << (DESCRIBE - 67)) | (1L << (EXPLAIN - 67)) | (1L << (FORMAT - 67)) | (1L << (LOGICAL - 67)) | (1L << (CODEGEN - 67)) | (1L << (COST - 67)) | (1L << (CAST - 67)) | (1L << (SHOW - 67)) | (1L << (TABLES - 67)) | (1L << (COLUMNS - 67)) | (1L << (COLUMN - 67)) | (1L << (USE - 67)) | (1L << (PARTITIONS - 67)) | (1L << (FUNCTIONS - 67)) | (1L << (DROP - 67)) | (1L << (TO - 67)) | (1L << (TABLESAMPLE - 67)) | (1L << (STRATIFY - 67)) | (1L << (ALTER - 67)) | (1L << (RENAME - 67)) | (1L << (ARRAY - 67)) | (1L << (MAP - 67)) | (1L << (STRUCT - 67)) | (1L << (COMMENT - 67)) | (1L << (SET - 67)) | (1L << (RESET - 67)) | (1L << (DATA - 67)) | (1L << (START - 67)) | (1L << (TRANSACTION - 67)) | (1L << (COMMIT - 67)) | (1L << (ROLLBACK - 67)) | (1L << (MACRO - 67)) | (1L << (IGNORE - 67)) | (1L << (BOTH - 67)) | (1L << (LEADING - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (TRAILING - 131)) | (1L << (IF - 131)) | (1L << (POSITION - 131)) | (1L << (EXTRACT - 131)) | (1L << (DIV - 131)) | (1L << (PERCENTLIT - 131)) | (1L << (BUCKET - 131)) | (1L << (OUT - 131)) | (1L << (OF - 131)) | (1L << (SORT - 131)) | (1L << (CLUSTER - 131)) | (1L << (DISTRIBUTE - 131)) | (1L << (OVERWRITE - 131)) | (1L << (TRANSFORM - 131)) | (1L << (REDUCE - 131)) | (1L << (SERDE - 131)) | (1L << (SERDEPROPERTIES - 131)) | (1L << (RECORDREADER - 131)) | (1L << (RECORDWRITER - 131)) | (1L << (DELIMITED - 131)) | (1L << (FIELDS - 131)) | (1L << (TERMINATED - 131)) | (1L << (COLLECTION - 131)) | (1L << (ITEMS - 131)) | (1L << (KEYS - 131)) | (1L << (ESCAPED - 131)) | (1L << (LINES - 131)) | (1L << (SEPARATED - 131)) | (1L << (FUNCTION - 131)) | (1L << (EXTENDED - 131)) | (1L << (REFRESH - 131)) | (1L << (CLEAR - 131)) | (1L << (CACHE - 131)) | (1L << (UNCACHE - 131)) | (1L << (LAZY - 131)) | (1L << (FORMATTED - 131)) | (1L << (GLOBAL - 131)) | (1L << (TEMPORARY - 131)) | (1L << (OPTIONS - 131)) | (1L << (UNSET - 131)) | (1L << (TBLPROPERTIES - 131)) | (1L << (DBPROPERTIES - 131)) | (1L << (BUCKETS - 131)) | (1L << (SKEWED - 131)) | (1L << (STORED - 131)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (DIRECTORIES - 195)) | (1L << (LOCATION - 195)) | (1L << (EXCHANGE - 195)) | (1L << (ARCHIVE - 195)) | (1L << (UNARCHIVE - 195)) | (1L << (FILEFORMAT - 195)) | (1L << (TOUCH - 195)) | (1L << (COMPACT - 195)) | (1L << (CONCATENATE - 195)) | (1L << (CHANGE - 195)) | (1L << (CASCADE - 195)) | (1L << (RESTRICT - 195)) | (1L << (CLUSTERED - 195)) | (1L << (SORTED - 195)) | (1L << (PURGE - 195)) | (1L << (INPUTFORMAT - 195)) | (1L << (OUTPUTFORMAT - 195)) | (1L << (DATABASE - 195)) | (1L << (DATABASES - 195)) | (1L << (DFS - 195)) | (1L << (TRUNCATE - 195)) | (1L << (ANALYZE - 195)) | (1L << (COMPUTE - 195)) | (1L << (LIST - 195)) | (1L << (STATISTICS - 195)) | (1L << (PARTITIONED - 195)) | (1L << (EXTERNAL - 195)) | (1L << (DEFINED - 195)) | (1L << (REVOKE - 195)) | (1L << (GRANT - 195)) | (1L << (LOCK - 195)) | (1L << (UNLOCK - 195)) | (1L << (MSCK - 195)) | (1L << (REPAIR - 195)) | (1L << (RECOVER - 195)) | (1L << (EXPORT - 195)) | (1L << (IMPORT - 195)) | (1L << (LOAD - 195)) | (1L << (ROLE - 195)) | (1L << (ROLES - 195)) | (1L << (COMPACTIONS - 195)) | (1L << (PRINCIPALS - 195)) | (1L << (TRANSACTIONS - 195)) | (1L << (INDEX - 195)) | (1L << (INDEXES - 195)) | (1L << (LOCKS - 195)) | (1L << (OPTION - 195)) | (1L << (LOCAL - 195)) | (1L << (INPATH - 195)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 50:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 86:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 88:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 89:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enbled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enbled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enbled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0105\u07f1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\7\3\u00f2\n\3\f\3\16\3\u00f5\13\3\5\3\u00f7\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0103\n\4\3\4\3\4\3\4\7\4\u0108"+
		"\n\4\f\4\16\4\u010b\13\4\3\4\7\4\u010e\n\4\f\4\16\4\u0111\13\4\3\5\3\5"+
		"\3\5\3\6\3\6\5\6\u0118\n\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0120\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u0129\n\b\3\t\3\t\3\t\3\t\5\t\u012f\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0138\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u013f\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0148\n\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0152\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u015f\n\r\f\r\16\r\u0162\13\r\3\r\3\r\5\r\u0166\n\r\3\16\3\16\3\16\7"+
		"\16\u016b\n\16\f\16\16\16\u016e\13\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\7\20\u0177\n\20\f\20\16\20\u017a\13\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u0182\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0189\n\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u01a0\n\30\3\30\3\30\5\30\u01a4\n\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u01ab\n\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u021f\n\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0227\n\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u022f\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0238\n\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0244\n\30\3\31"+
		"\3\31\5\31\u0248\n\31\3\31\5\31\u024b\n\31\3\31\3\31\3\31\3\31\5\31\u0251"+
		"\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u025b\n\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0267\n\33\3\33\3\33\3\33"+
		"\5\33\u026c\n\33\3\34\3\34\3\34\3\35\5\35\u0272\n\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u027e\n\36\5\36\u0280\n\36\3\36"+
		"\3\36\3\36\5\36\u0285\n\36\3\36\3\36\5\36\u0289\n\36\3\36\3\36\3\36\5"+
		"\36\u028e\n\36\3\36\3\36\3\36\5\36\u0293\n\36\3\36\5\36\u0296\n\36\3\36"+
		"\3\36\3\36\5\36\u029b\n\36\3\36\3\36\5\36\u029f\n\36\3\36\3\36\3\36\5"+
		"\36\u02a4\n\36\5\36\u02a6\n\36\3\37\3\37\5\37\u02aa\n\37\3 \3 \3 \3 \3"+
		" \7 \u02b1\n \f \16 \u02b4\13 \3 \3 \3!\3!\3!\5!\u02bb\n!\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u02c2\n\"\3#\3#\3#\7#\u02c7\n#\f#\16#\u02ca\13#\3$\3$\3$"+
		"\3$\7$\u02d0\n$\f$\16$\u02d3\13$\3%\3%\5%\u02d7\n%\3%\3%\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\7\'\u02e4\n\'\f\'\16\'\u02e7\13\'\3\'\3\'\3(\3(\5(\u02ed"+
		"\n(\3(\5(\u02f0\n(\3)\3)\3)\7)\u02f5\n)\f)\16)\u02f8\13)\3)\5)\u02fb\n"+
		")\3*\3*\3*\3*\5*\u0301\n*\3+\3+\3+\3+\7+\u0307\n+\f+\16+\u030a\13+\3+"+
		"\3+\3,\3,\3,\3,\7,\u0312\n,\f,\16,\u0315\13,\3,\3,\3-\3-\3-\3-\3-\3-\5"+
		"-\u031f\n-\3.\3.\3.\3.\3.\5.\u0326\n.\3/\3/\3/\3/\5/\u032c\n/\3\60\3\60"+
		"\3\60\3\61\5\61\u0332\n\61\3\61\3\61\3\61\3\61\3\61\6\61\u0339\n\61\r"+
		"\61\16\61\u033a\5\61\u033d\n\61\3\62\3\62\3\62\3\62\3\62\7\62\u0344\n"+
		"\62\f\62\16\62\u0347\13\62\5\62\u0349\n\62\3\62\3\62\3\62\3\62\3\62\7"+
		"\62\u0350\n\62\f\62\16\62\u0353\13\62\5\62\u0355\n\62\3\62\3\62\3\62\3"+
		"\62\3\62\7\62\u035c\n\62\f\62\16\62\u035f\13\62\5\62\u0361\n\62\3\62\3"+
		"\62\3\62\3\62\3\62\7\62\u0368\n\62\f\62\16\62\u036b\13\62\5\62\u036d\n"+
		"\62\3\62\5\62\u0370\n\62\3\62\3\62\3\62\5\62\u0375\n\62\5\62\u0377\n\62"+
		"\3\63\5\63\u037a\n\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u0386\n\64\3\64\3\64\3\64\3\64\3\64\5\64\u038d\n\64\3\64\3\64\3"+
		"\64\3\64\3\64\5\64\u0394\n\64\3\64\7\64\u0397\n\64\f\64\16\64\u039a\13"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u03a4\n\65\3\66\3\66"+
		"\5\66\u03a8\n\66\3\66\3\66\5\66\u03ac\n\66\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\5\67\u03b8\n\67\3\67\5\67\u03bb\n\67\3\67\3\67"+
		"\5\67\u03bf\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u03c9\n"+
		"\67\3\67\3\67\5\67\u03cd\n\67\5\67\u03cf\n\67\3\67\5\67\u03d2\n\67\3\67"+
		"\3\67\5\67\u03d6\n\67\3\67\5\67\u03d9\n\67\3\67\3\67\5\67\u03dd\n\67\3"+
		"\67\3\67\7\67\u03e1\n\67\f\67\16\67\u03e4\13\67\3\67\5\67\u03e7\n\67\3"+
		"\67\3\67\5\67\u03eb\n\67\3\67\3\67\3\67\5\67\u03f0\n\67\3\67\5\67\u03f3"+
		"\n\67\5\67\u03f5\n\67\3\67\7\67\u03f8\n\67\f\67\16\67\u03fb\13\67\3\67"+
		"\3\67\5\67\u03ff\n\67\3\67\5\67\u0402\n\67\3\67\3\67\5\67\u0406\n\67\3"+
		"\67\5\67\u0409\n\67\5\67\u040b\n\67\38\38\38\58\u0410\n8\38\78\u0413\n"+
		"8\f8\168\u0416\138\38\38\39\39\39\39\39\39\79\u0420\n9\f9\169\u0423\13"+
		"9\39\39\59\u0427\n9\3:\3:\3:\3:\7:\u042d\n:\f:\16:\u0430\13:\3:\7:\u0433"+
		"\n:\f:\16:\u0436\13:\3:\5:\u0439\n:\3;\3;\3;\3;\3;\7;\u0440\n;\f;\16;"+
		"\u0443\13;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\7;\u044f\n;\f;\16;\u0452\13;"+
		"\3;\3;\5;\u0456\n;\3;\3;\3;\3;\3;\3;\3;\3;\7;\u0460\n;\f;\16;\u0463\13"+
		";\3;\3;\5;\u0467\n;\3<\3<\3<\3<\7<\u046d\n<\f<\16<\u0470\13<\5<\u0472"+
		"\n<\3<\3<\5<\u0476\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\7=\u0482\n=\f=\16"+
		"=\u0485\13=\3=\3=\3=\3>\3>\3>\3>\3>\7>\u048f\n>\f>\16>\u0492\13>\3>\3"+
		">\5>\u0496\n>\3?\3?\5?\u049a\n?\3?\5?\u049d\n?\3@\3@\3@\5@\u04a2\n@\3"+
		"@\3@\3@\3@\3@\7@\u04a9\n@\f@\16@\u04ac\13@\5@\u04ae\n@\3@\3@\3@\5@\u04b3"+
		"\n@\3@\3@\3@\7@\u04b8\n@\f@\16@\u04bb\13@\5@\u04bd\n@\3A\3A\3B\3B\7B\u04c3"+
		"\nB\fB\16B\u04c6\13B\3C\3C\3C\3C\5C\u04cc\nC\3C\3C\3C\3C\3C\5C\u04d3\n"+
		"C\3D\5D\u04d6\nD\3D\3D\3D\5D\u04db\nD\3D\3D\3D\3D\5D\u04e1\nD\3D\3D\5"+
		"D\u04e5\nD\3D\5D\u04e8\nD\3D\5D\u04eb\nD\3E\3E\3E\3E\3E\3E\3E\7E\u04f4"+
		"\nE\fE\16E\u04f7\13E\3E\3E\5E\u04fb\nE\3F\3F\3F\5F\u0500\nF\3F\3F\3G\5"+
		"G\u0505\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0517\n"+
		"G\5G\u0519\nG\3G\5G\u051c\nG\3H\3H\3H\3H\3I\3I\3I\7I\u0525\nI\fI\16I\u0528"+
		"\13I\3J\3J\3J\3J\7J\u052e\nJ\fJ\16J\u0531\13J\3J\3J\3K\3K\5K\u0537\nK"+
		"\3L\3L\3L\3L\7L\u053d\nL\fL\16L\u0540\13L\3L\3L\3M\3M\3M\5M\u0547\nM\3"+
		"N\3N\5N\u054b\nN\3N\3N\3N\3N\3N\3N\5N\u0553\nN\3N\3N\3N\3N\3N\3N\5N\u055b"+
		"\nN\3N\3N\3N\3N\5N\u0561\nN\3O\3O\3O\3O\7O\u0567\nO\fO\16O\u056a\13O\3"+
		"O\3O\3P\3P\3P\3P\3P\7P\u0573\nP\fP\16P\u0576\13P\5P\u0578\nP\3P\3P\3P"+
		"\3Q\5Q\u057e\nQ\3Q\3Q\5Q\u0582\nQ\5Q\u0584\nQ\3R\3R\3R\3R\3R\3R\3R\5R"+
		"\u058d\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0599\nR\5R\u059b\nR\3R\3R"+
		"\3R\3R\3R\5R\u05a2\nR\3R\3R\3R\3R\3R\5R\u05a9\nR\3R\3R\3R\3R\5R\u05af"+
		"\nR\3R\3R\3R\3R\5R\u05b5\nR\5R\u05b7\nR\3S\3S\3S\5S\u05bc\nS\3S\3S\3T"+
		"\3T\3T\5T\u05c3\nT\3T\3T\3U\3U\5U\u05c9\nU\3U\3U\5U\u05cd\nU\5U\u05cf"+
		"\nU\3V\3V\3V\7V\u05d4\nV\fV\16V\u05d7\13V\3W\3W\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\5X\u05e5\nX\5X\u05e7\nX\3X\3X\3X\3X\3X\3X\7X\u05ef\nX\fX\16X\u05f2"+
		"\13X\3Y\5Y\u05f5\nY\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u05fd\nY\3Y\3Y\3Y\3Y\3Y\7Y\u0604"+
		"\nY\fY\16Y\u0607\13Y\3Y\3Y\3Y\5Y\u060c\nY\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0614\n"+
		"Y\3Y\3Y\3Y\3Y\5Y\u061a\nY\3Y\3Y\3Y\5Y\u061f\nY\3Y\3Y\3Y\5Y\u0624\nY\3"+
		"Z\3Z\3Z\3Z\5Z\u062a\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\7Z\u063f\nZ\fZ\16Z\u0642\13Z\3[\3[\3[\6[\u0647\n[\r[\16[\u0648"+
		"\3[\3[\5[\u064d\n[\3[\3[\3[\3[\3[\6[\u0654\n[\r[\16[\u0655\3[\3[\5[\u065a"+
		"\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\7[\u066a\n[\f[\16[\u066d"+
		"\13[\5[\u066f\n[\3[\3[\3[\3[\3[\3[\5[\u0677\n[\3[\3[\3[\3[\3[\3[\3[\5"+
		"[\u0680\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\6"+
		"[\u0695\n[\r[\16[\u0696\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u06a2\n[\3[\3[\3"+
		"[\7[\u06a7\n[\f[\16[\u06aa\13[\5[\u06ac\n[\3[\3[\3[\5[\u06b1\n[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\6[\u06c2\n[\r[\16[\u06c3\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u06d5\n[\3[\3[\3[\3[\3[\3"+
		"[\3[\3[\7[\u06df\n[\f[\16[\u06e2\13[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\6"+
		"\\\u06ec\n\\\r\\\16\\\u06ed\5\\\u06f0\n\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3"+
		"a\7a\u06fc\na\fa\16a\u06ff\13a\3b\3b\3b\3b\5b\u0705\nb\3c\5c\u0708\nc"+
		"\3c\3c\5c\u070c\nc\3d\3d\3d\5d\u0711\nd\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e"+
		"\3e\3e\3e\3e\3e\5e\u0722\ne\3e\3e\5e\u0726\ne\3e\3e\3e\3e\3e\7e\u072d"+
		"\ne\fe\16e\u0730\13e\3e\5e\u0733\ne\5e\u0735\ne\3f\3f\3f\7f\u073a\nf\f"+
		"f\16f\u073d\13f\3g\3g\3g\3g\5g\u0743\ng\3h\3h\3h\7h\u0748\nh\fh\16h\u074b"+
		"\13h\3i\3i\3i\3i\3i\5i\u0752\ni\3j\3j\3j\3j\3j\3k\3k\3k\3k\7k\u075d\n"+
		"k\fk\16k\u0760\13k\3l\3l\3l\3l\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\7m\u0771"+
		"\nm\fm\16m\u0774\13m\3m\3m\3m\3m\3m\7m\u077b\nm\fm\16m\u077e\13m\5m\u0780"+
		"\nm\3m\3m\3m\3m\3m\7m\u0787\nm\fm\16m\u078a\13m\5m\u078c\nm\5m\u078e\n"+
		"m\3m\5m\u0791\nm\3m\5m\u0794\nm\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3"+
		"n\3n\3n\3n\5n\u07a6\nn\3o\3o\3o\3o\3o\3o\3o\5o\u07af\no\3p\3p\3p\7p\u07b4"+
		"\np\fp\16p\u07b7\13p\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\5q\u07c8"+
		"\nq\3r\3r\3r\5r\u07cd\nr\3s\3s\3t\5t\u07d2\nt\3t\3t\5t\u07d6\nt\3t\3t"+
		"\5t\u07da\nt\3t\3t\5t\u07de\nt\3t\3t\5t\u07e2\nt\3t\3t\5t\u07e6\nt\3t"+
		"\3t\5t\u07ea\nt\3t\5t\u07ed\nt\3u\3u\3u\3\u00f3\6f\u00ae\u00b2\u00b4v"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\2\26\3\2"+
		"mp\3\2mo\3\2\62\63\4\2PPRR\4\2\26\26\30\30\3\2\u00fb\u00fc\3\2+,\4\2\u0091"+
		"\u0092\u0097\u0097\3\2\u0093\u0096\4\2\u0091\u0092\u009a\u009a\3\2\u0083"+
		"\u0085\3\2\u0089\u0090\3\2\u0091\u009b\3\2$\'\3\2/\60\3\2\u0091\u0092"+
		"\4\2II\u00a2\u00a2\4\2  \u00a0\u00a0\3\2MN\n\2\22:==Elq\u0088\u0096\u0096"+
		"\u009c\u00a5\u00a7\u00f3\u00f5\u00f6\2\u08f1\2\u00ea\3\2\2\2\4\u00f6\3"+
		"\2\2\2\6\u00f8\3\2\2\2\b\u0112\3\2\2\2\n\u0117\3\2\2\2\f\u0119\3\2\2\2"+
		"\16\u0128\3\2\2\2\20\u0137\3\2\2\2\22\u0147\3\2\2\2\24\u0149\3\2\2\2\26"+
		"\u0151\3\2\2\2\30\u0165\3\2\2\2\32\u0167\3\2\2\2\34\u016f\3\2\2\2\36\u0173"+
		"\3\2\2\2 \u017b\3\2\2\2\"\u0183\3\2\2\2$\u018a\3\2\2\2&\u018d\3\2\2\2"+
		"(\u0190\3\2\2\2*\u0193\3\2\2\2,\u0196\3\2\2\2.\u0243\3\2\2\2\60\u0245"+
		"\3\2\2\2\62\u0254\3\2\2\2\64\u0260\3\2\2\2\66\u026d\3\2\2\28\u0271\3\2"+
		"\2\2:\u02a5\3\2\2\2<\u02a7\3\2\2\2>\u02ab\3\2\2\2@\u02b7\3\2\2\2B\u02c1"+
		"\3\2\2\2D\u02c3\3\2\2\2F\u02cb\3\2\2\2H\u02d4\3\2\2\2J\u02dc\3\2\2\2L"+
		"\u02df\3\2\2\2N\u02ea\3\2\2\2P\u02fa\3\2\2\2R\u0300\3\2\2\2T\u0302\3\2"+
		"\2\2V\u030d\3\2\2\2X\u031e\3\2\2\2Z\u0325\3\2\2\2\\\u0327\3\2\2\2^\u032d"+
		"\3\2\2\2`\u033c\3\2\2\2b\u0348\3\2\2\2d\u0379\3\2\2\2f\u037e\3\2\2\2h"+
		"\u03a3\3\2\2\2j\u03a5\3\2\2\2l\u040a\3\2\2\2n\u040c\3\2\2\2p\u0426\3\2"+
		"\2\2r\u0428\3\2\2\2t\u0466\3\2\2\2v\u0475\3\2\2\2x\u0477\3\2\2\2z\u0495"+
		"\3\2\2\2|\u0497\3\2\2\2~\u049e\3\2\2\2\u0080\u04be\3\2\2\2\u0082\u04c0"+
		"\3\2\2\2\u0084\u04d2\3\2\2\2\u0086\u04ea\3\2\2\2\u0088\u04fa\3\2\2\2\u008a"+
		"\u04fc\3\2\2\2\u008c\u051b\3\2\2\2\u008e\u051d\3\2\2\2\u0090\u0521\3\2"+
		"\2\2\u0092\u0529\3\2\2\2\u0094\u0534\3\2\2\2\u0096\u0538\3\2\2\2\u0098"+
		"\u0543\3\2\2\2\u009a\u0560\3\2\2\2\u009c\u0562\3\2\2\2\u009e\u056d\3\2"+
		"\2\2\u00a0\u0583\3\2\2\2\u00a2\u05b6\3\2\2\2\u00a4\u05bb\3\2\2\2\u00a6"+
		"\u05c2\3\2\2\2\u00a8\u05c6\3\2\2\2\u00aa\u05d0\3\2\2\2\u00ac\u05d8\3\2"+
		"\2\2\u00ae\u05e6\3\2\2\2\u00b0\u0623\3\2\2\2\u00b2\u0629\3\2\2\2\u00b4"+
		"\u06d4\3\2\2\2\u00b6\u06ef\3\2\2\2\u00b8\u06f1\3\2\2\2\u00ba\u06f3\3\2"+
		"\2\2\u00bc\u06f5\3\2\2\2\u00be\u06f7\3\2\2\2\u00c0\u06f9\3\2\2\2\u00c2"+
		"\u0700\3\2\2\2\u00c4\u070b\3\2\2\2\u00c6\u0710\3\2\2\2\u00c8\u0734\3\2"+
		"\2\2\u00ca\u0736\3\2\2\2\u00cc\u073e\3\2\2\2\u00ce\u0744\3\2\2\2\u00d0"+
		"\u074c\3\2\2\2\u00d2\u0753\3\2\2\2\u00d4\u0758\3\2\2\2\u00d6\u0761\3\2"+
		"\2\2\u00d8\u0793\3\2\2\2\u00da\u07a5\3\2\2\2\u00dc\u07ae\3\2\2\2\u00de"+
		"\u07b0\3\2\2\2\u00e0\u07c7\3\2\2\2\u00e2\u07cc\3\2\2\2\u00e4\u07ce\3\2"+
		"\2\2\u00e6\u07ec\3\2\2\2\u00e8\u07ee\3\2\2\2\u00ea\u00eb\5\4\3\2\u00eb"+
		"\u00ec\7\2\2\3\u00ec\3\3\2\2\2\u00ed\u00f7\5\6\4\2\u00ee\u00f7\5 \21\2"+
		"\u00ef\u00f7\5\"\22\2\u00f0\u00f2\13\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00ef\3\2"+
		"\2\2\u00f6\u00f3\3\2\2\2\u00f7\5\3\2\2\2\u00f8\u00f9\7\17\2\2\u00f9\u00fa"+
		"\7]\2\2\u00fa\u00fb\5\u00a4S\2\u00fb\u00fc\5\u00a0Q\2\u00fc\u0102\7\u00a6"+
		"\2\2\u00fd\u0103\5\u00a4S\2\u00fe\u00ff\7\3\2\2\u00ff\u0100\58\35\2\u0100"+
		"\u0101\7\4\2\2\u0101\u0103\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\u0105\5\u00a0Q\2\u0105\u0109\5\b\5\2\u0106"+
		"\u0108\5\n\6\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u010f\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010e\5\f\7\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\7\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113"+
		"\7D\2\2\u0113\u0114\5\u00aeX\2\u0114\t\3\2\2\2\u0115\u0118\5\16\b\2\u0116"+
		"\u0118\5\20\t\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\13\3\2\2"+
		"\2\u0119\u011a\5\22\n\2\u011a\r\3\2\2\2\u011b\u011c\7\67\2\2\u011c\u011f"+
		"\7\20\2\2\u011d\u011e\7%\2\2\u011e\u0120\5\u00aeX\2\u011f\u011d\3\2\2"+
		"\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\78\2\2\u0122\u0129"+
		"\5\24\13\2\u0123\u0124\7\67\2\2\u0124\u0125\5\u00aeX\2\u0125\u0126\78"+
		"\2\2\u0126\u0127\5\24\13\2\u0127\u0129\3\2\2\2\u0128\u011b\3\2\2\2\u0128"+
		"\u0123\3\2\2\2\u0129\17\3\2\2\2\u012a\u012b\7\67\2\2\u012b\u012e\7\20"+
		"\2\2\u012c\u012d\7%\2\2\u012d\u012f\5\u00aeX\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\78\2\2\u0131\u0138\5\26"+
		"\f\2\u0132\u0133\7\67\2\2\u0133\u0134\5\u00aeX\2\u0134\u0135\78\2\2\u0135"+
		"\u0136\5\26\f\2\u0136\u0138\3\2\2\2\u0137\u012a\3\2\2\2\u0137\u0132\3"+
		"\2\2\2\u0138\21\3\2\2\2\u0139\u013a\7\67\2\2\u013a\u013b\7\'\2\2\u013b"+
		"\u013e\7\20\2\2\u013c\u013d\7%\2\2\u013d\u013f\5\u00aeX\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\78\2\2\u0141"+
		"\u0148\5\30\r\2\u0142\u0143\7\67\2\2\u0143\u0144\5\u00aeX\2\u0144\u0145"+
		"\78\2\2\u0145\u0146\5\30\r\2\u0146\u0148\3\2\2\2\u0147\u0139\3\2\2\2\u0147"+
		"\u0142\3\2\2\2\u0148\23\3\2\2\2\u0149\u014a\7\\\2\2\u014a\25\3\2\2\2\u014b"+
		"\u014c\7\21\2\2\u014c\u014d\7z\2\2\u014d\u0152\7\u0093\2\2\u014e\u014f"+
		"\7\21\2\2\u014f\u0150\7z\2\2\u0150\u0152\5\32\16\2\u0151\u014b\3\2\2\2"+
		"\u0151\u014e\3\2\2\2\u0152\27\3\2\2\2\u0153\u0154\7[\2\2\u0154\u0166\7"+
		"\u0093\2\2\u0155\u0156\7[\2\2\u0156\u0157\7\3\2\2\u0157\u0158\5\36\20"+
		"\2\u0158\u0159\7\4\2\2\u0159\u015a\7U\2\2\u015a\u015b\7\3\2\2\u015b\u0160"+
		"\5\u00acW\2\u015c\u015d\7\5\2\2\u015d\u015f\5\u00acW\2\u015e\u015c\3\2"+
		"\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7\4\2\2\u0164\u0166\3\2"+
		"\2\2\u0165\u0153\3\2\2\2\u0165\u0155\3\2\2\2\u0166\31\3\2\2\2\u0167\u016c"+
		"\5\34\17\2\u0168\u0169\7\5\2\2\u0169\u016b\5\34\17\2\u016a\u0168\3\2\2"+
		"\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\33"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\5\u00dep\2\u0170\u0171\7\u0089"+
		"\2\2\u0171\u0172\5\u00acW\2\u0172\35\3\2\2\2\u0173\u0178\5\u00dep\2\u0174"+
		"\u0175\7\5\2\2\u0175\u0177\5\u00dep\2\u0176\u0174\3\2\2\2\u0177\u017a"+
		"\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\37\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017b\u017c\7\21\2\2\u017c\u017d\5\u00a4S\2\u017d\u017e"+
		"\7z\2\2\u017e\u0181\5\32\16\2\u017f\u0180\7\31\2\2\u0180\u0182\5\u00ae"+
		"X\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182!\3\2\2\2\u0183\u0184"+
		"\7\\\2\2\u0184\u0185\7\23\2\2\u0185\u0188\5\u00a4S\2\u0186\u0187\7\31"+
		"\2\2\u0187\u0189\5\u00aeX\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"#\3\2\2\2\u018a\u018b\5\u00a8U\2\u018b\u018c\7\2\2\3\u018c%\3\2\2\2\u018d"+
		"\u018e\5\u00a4S\2\u018e\u018f\7\2\2\3\u018f\'\3\2\2\2\u0190\u0191\5\u00a6"+
		"T\2\u0191\u0192\7\2\2\3\u0192)\3\2\2\2\u0193\u0194\5\u00c8e\2\u0194\u0195"+
		"\7\2\2\3\u0195+\3\2\2\2\u0196\u0197\5\u00caf\2\u0197\u0198\7\2\2\3\u0198"+
		"-\3\2\2\2\u0199\u019a\7V\2\2\u019a\u0244\7\u00eb\2\2\u019b\u019c\7l\2"+
		"\2\u019c\u0244\7\u00eb\2\2\u019d\u019f\7\u00e2\2\2\u019e\u01a0\7\u00eb"+
		"\2\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u0244\3\2\2\2\u01a1"+
		"\u01a3\7\u00e1\2\2\u01a2\u01a4\7\u00eb\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u0244\3\2\2\2\u01a5\u01a6\7e\2\2\u01a6\u0244\7\u00e2\2"+
		"\2\u01a7\u01a8\7e\2\2\u01a8\u01aa\7\u00eb\2\2\u01a9\u01ab\7\u00e2\2\2"+
		"\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u0244\3\2\2\2\u01ac\u01ad"+
		"\7e\2\2\u01ad\u0244\7\u00ee\2\2\u01ae\u01af\7e\2\2\u01af\u0244\7\u00ec"+
		"\2\2\u01b0\u01b1\7e\2\2\u01b1\u01b2\7O\2\2\u01b2\u0244\7\u00ec\2\2\u01b3"+
		"\u01b4\7\u00e8\2\2\u01b4\u0244\7W\2\2\u01b5\u01b6\7\u00e9\2\2\u01b6\u0244"+
		"\7W\2\2\u01b7\u01b8\7e\2\2\u01b8\u0244\7\u00ed\2\2\u01b9\u01ba\7e\2\2"+
		"\u01ba\u01bb\7V\2\2\u01bb\u0244\7W\2\2\u01bc\u01bd\7e\2\2\u01bd\u0244"+
		"\7\u00ef\2\2\u01be\u01bf\7e\2\2\u01bf\u0244\7\u00f1\2\2\u01c0\u01c1\7"+
		"e\2\2\u01c1\u0244\7\u00f2\2\2\u01c2\u01c3\7V\2\2\u01c3\u0244\7\u00f0\2"+
		"\2\u01c4\u01c5\7l\2\2\u01c5\u0244\7\u00f0\2\2\u01c6\u01c7\7t\2\2\u01c7"+
		"\u0244\7\u00f0\2\2\u01c8\u01c9\7\u00e3\2\2\u01c9\u0244\7W\2\2\u01ca\u01cb"+
		"\7\u00e3\2\2\u01cb\u0244\7\u00d6\2\2\u01cc\u01cd\7\u00e4\2\2\u01cd\u0244"+
		"\7W\2\2\u01ce\u01cf\7\u00e4\2\2\u01cf\u0244\7\u00d6\2\2\u01d0\u01d1\7"+
		"V\2\2\u01d1\u01d2\7\u00bd\2\2\u01d2\u0244\7\u0081\2\2\u01d3\u01d4\7l\2"+
		"\2\u01d4\u01d5\7\u00bd\2\2\u01d5\u0244\7\u0081\2\2\u01d6\u01d7\7t\2\2"+
		"\u01d7\u01d8\7W\2\2\u01d8\u01d9\5\u00a4S\2\u01d9\u01da\7\'\2\2\u01da\u01db"+
		"\7\u00d1\2\2\u01db\u0244\3\2\2\2\u01dc\u01dd\7t\2\2\u01dd\u01de\7W\2\2"+
		"\u01de\u01df\5\u00a4S\2\u01df\u01e0\7\u00d1\2\2\u01e0\u01e1\7\33\2\2\u01e1"+
		"\u0244\3\2\2\2\u01e2\u01e3\7t\2\2\u01e3\u01e4\7W\2\2\u01e4\u01e5\5\u00a4"+
		"S\2\u01e5\u01e6\7\'\2\2\u01e6\u01e7\7\u00d2\2\2\u01e7\u0244\3\2\2\2\u01e8"+
		"\u01e9\7t\2\2\u01e9\u01ea\7W\2\2\u01ea\u01eb\5\u00a4S\2\u01eb\u01ec\7"+
		"\u00c3\2\2\u01ec\u01ed\7\33\2\2\u01ed\u0244\3\2\2\2\u01ee\u01ef\7t\2\2"+
		"\u01ef\u01f0\7W\2\2\u01f0\u01f1\5\u00a4S\2\u01f1\u01f2\7\'\2\2\u01f2\u01f3"+
		"\7\u00c3\2\2\u01f3\u0244\3\2\2\2\u01f4\u01f5\7t\2\2\u01f5\u01f6\7W\2\2"+
		"\u01f6\u01f7\5\u00a4S\2\u01f7\u01f8\7\'\2\2\u01f8\u01f9\7\u00c4\2\2\u01f9"+
		"\u01fa\7\25\2\2\u01fa\u01fb\7\u00c5\2\2\u01fb\u0244\3\2\2\2\u01fc\u01fd"+
		"\7t\2\2\u01fd\u01fe\7W\2\2\u01fe\u01ff\5\u00a4S\2\u01ff\u0200\7z\2\2\u0200"+
		"\u0201\7\u00c3\2\2\u0201\u0202\7\u00c6\2\2\u0202\u0244\3\2\2\2\u0203\u0204"+
		"\7t\2\2\u0204\u0205\7W\2\2\u0205\u0206\5\u00a4S\2\u0206\u0207\7\u00c7"+
		"\2\2\u0207\u0208\7I\2\2\u0208\u0244\3\2\2\2\u0209\u020a\7t\2\2\u020a\u020b"+
		"\7W\2\2\u020b\u020c\5\u00a4S\2\u020c\u020d\7\u00c8\2\2\u020d\u020e\7I"+
		"\2\2\u020e\u0244\3\2\2\2\u020f\u0210\7t\2\2\u0210\u0211\7W\2\2\u0211\u0212"+
		"\5\u00a4S\2\u0212\u0213\7\u00c9\2\2\u0213\u0214\7I\2\2\u0214\u0244\3\2"+
		"\2\2\u0215\u0216\7t\2\2\u0216\u0217\7W\2\2\u0217\u0218\5\u00a4S\2\u0218"+
		"\u0219\7\u00cb\2\2\u0219\u0244\3\2\2\2\u021a\u021b\7t\2\2\u021b\u021c"+
		"\7W\2\2\u021c\u021e\5\u00a4S\2\u021d\u021f\5> \2\u021e\u021d\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\7\u00cc\2\2\u0221\u0244"+
		"\3\2\2\2\u0222\u0223\7t\2\2\u0223\u0224\7W\2\2\u0224\u0226\5\u00a4S\2"+
		"\u0225\u0227\5> \2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228"+
		"\3\2\2\2\u0228\u0229\7\u00cd\2\2\u0229\u0244\3\2\2\2\u022a\u022b\7t\2"+
		"\2\u022b\u022c\7W\2\2\u022c\u022e\5\u00a4S\2\u022d\u022f\5> \2\u022e\u022d"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\7z\2\2\u0231"+
		"\u0232\7\u00ca\2\2\u0232\u0244\3\2\2\2\u0233\u0234\7t\2\2\u0234\u0235"+
		"\7W\2\2\u0235\u0237\5\u00a4S\2\u0236\u0238\5> \2\u0237\u0236\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\7Z\2\2\u023a\u023b\7g\2"+
		"\2\u023b\u0244\3\2\2\2\u023c\u023d\7}\2\2\u023d\u0244\7~\2\2\u023e\u0244"+
		"\7\177\2\2\u023f\u0244\7\u0080\2\2\u0240\u0244\7\u00d8\2\2\u0241\u0242"+
		"\7\\\2\2\u0242\u0244\7\23\2\2\u0243\u0199\3\2\2\2\u0243\u019b\3\2\2\2"+
		"\u0243\u019d\3\2\2\2\u0243\u01a1\3\2\2\2\u0243\u01a5\3\2\2\2\u0243\u01a7"+
		"\3\2\2\2\u0243\u01ac\3\2\2\2\u0243\u01ae\3\2\2\2\u0243\u01b0\3\2\2\2\u0243"+
		"\u01b3\3\2\2\2\u0243\u01b5\3\2\2\2\u0243\u01b7\3\2\2\2\u0243\u01b9\3\2"+
		"\2\2\u0243\u01bc\3\2\2\2\u0243\u01be\3\2\2\2\u0243\u01c0\3\2\2\2\u0243"+
		"\u01c2\3\2\2\2\u0243\u01c4\3\2\2\2\u0243\u01c6\3\2\2\2\u0243\u01c8\3\2"+
		"\2\2\u0243\u01ca\3\2\2\2\u0243\u01cc\3\2\2\2\u0243\u01ce\3\2\2\2\u0243"+
		"\u01d0\3\2\2\2\u0243\u01d3\3\2\2\2\u0243\u01d6\3\2\2\2\u0243\u01dc\3\2"+
		"\2\2\u0243\u01e2\3\2\2\2\u0243\u01e8\3\2\2\2\u0243\u01ee\3\2\2\2\u0243"+
		"\u01f4\3\2\2\2\u0243\u01fc\3\2\2\2\u0243\u0203\3\2\2\2\u0243\u0209\3\2"+
		"\2\2\u0243\u020f\3\2\2\2\u0243\u0215\3\2\2\2\u0243\u021a\3\2\2\2\u0243"+
		"\u0222\3\2\2\2\u0243\u022a\3\2\2\2\u0243\u0233\3\2\2\2\u0243\u023c\3\2"+
		"\2\2\u0243\u023e\3\2\2\2\u0243\u023f\3\2\2\2\u0243\u0240\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0244/\3\2\2\2\u0245\u0247\7V\2\2\u0246\u0248\7\u00bd\2"+
		"\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u024b"+
		"\7\u00df\2\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2"+
		"\2\u024c\u0250\7W\2\2\u024d\u024e\7\u0086\2\2\u024e\u024f\7\'\2\2\u024f"+
		"\u0251\7)\2\2\u0250\u024d\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2"+
		"\2\2\u0252\u0253\5\u00a4S\2\u0253\61\3\2\2\2\u0254\u0255\7\u00d1\2\2\u0255"+
		"\u0256\7\33\2\2\u0256\u025a\5\u008eH\2\u0257\u0258\7\u00d2\2\2\u0258\u0259"+
		"\7\33\2\2\u0259\u025b\5\u0092J\2\u025a\u0257\3\2\2\2\u025a\u025b\3\2\2"+
		"\2\u025b\u025c\3\2\2\2\u025c\u025d\7]\2\2\u025d\u025e\7\u00fb\2\2\u025e"+
		"\u025f\7\u00c2\2\2\u025f\63\3\2\2\2\u0260\u0261\7\u00c3\2\2\u0261\u0262"+
		"\7\33\2\2\u0262\u0263\5\u008eH\2\u0263\u0266\7D\2\2\u0264\u0267\5T+\2"+
		"\u0265\u0267\5V,\2\u0266\u0264\3\2\2\2\u0266\u0265\3\2\2\2\u0267\u026b"+
		"\3\2\2\2\u0268\u0269\7\u00c4\2\2\u0269\u026a\7\25\2\2\u026a\u026c\7\u00c5"+
		"\2\2\u026b\u0268\3\2\2\2\u026b\u026c\3\2\2\2\u026c\65\3\2\2\2\u026d\u026e"+
		"\7\u00c6\2\2\u026e\u026f\7\u00f7\2\2\u026f\67\3\2\2\2\u0270\u0272\5F$"+
		"\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274"+
		"\5`\61\2\u02749\3\2\2\2\u0275\u0276\7[\2\2\u0276\u0277\7\u00a3\2\2\u0277"+
		"\u0278\7W\2\2\u0278\u027f\5\u00a4S\2\u0279\u027d\5> \2\u027a\u027b\7\u0086"+
		"\2\2\u027b\u027c\7\'\2\2\u027c\u027e\7)\2\2\u027d\u027a\3\2\2\2\u027d"+
		"\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u0279\3\2\2\2\u027f\u0280\3\2"+
		"\2\2\u0280\u02a6\3\2\2\2\u0281\u0282\7[\2\2\u0282\u0284\7]\2\2\u0283\u0285"+
		"\7W\2\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u0288\5\u00a4S\2\u0287\u0289\5> \2\u0288\u0287\3\2\2\2\u0288\u0289\3"+
		"\2\2\2\u0289\u02a6\3\2\2\2\u028a\u028b\7[\2\2\u028b\u028d\7\u00a3\2\2"+
		"\u028c\u028e\7\u00f5\2\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u0290\7X\2\2\u0290\u0292\7\u00f7\2\2\u0291\u0293"+
		"\5\u00a2R\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\3\2\2"+
		"\2\u0294\u0296\5X-\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u02a6"+
		"\3\2\2\2\u0297\u0298\7[\2\2\u0298\u029a\7\u00a3\2\2\u0299\u029b\7\u00f5"+
		"\2\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c"+
		"\u029e\7X\2\2\u029d\u029f\7\u00f7\2\2\u029e\u029d\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a3\5J&\2\u02a1\u02a2\7\u00be\2\2"+
		"\u02a2\u02a4\5L\'\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6"+
		"\3\2\2\2\u02a5\u0275\3\2\2\2\u02a5\u0281\3\2\2\2\u02a5\u028a\3\2\2\2\u02a5"+
		"\u0297\3\2\2\2\u02a6;\3\2\2\2\u02a7\u02a9\5> \2\u02a8\u02aa\5\66\34\2"+
		"\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa=\3\2\2\2\u02ab\u02ac\7"+
		"I\2\2\u02ac\u02ad\7\3\2\2\u02ad\u02b2\5@!\2\u02ae\u02af\7\5\2\2\u02af"+
		"\u02b1\5@!\2\u02b0\u02ae\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2"+
		"\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6"+
		"\7\4\2\2\u02b6?\3\2\2\2\u02b7\u02ba\5\u00e0q\2\u02b8\u02b9\7\u0089\2\2"+
		"\u02b9\u02bb\5\u00b6\\\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb"+
		"A\3\2\2\2\u02bc\u02c2\5\u00dep\2\u02bd\u02c2\7\u00f7\2\2\u02be\u02c2\5"+
		"\u00b8]\2\u02bf\u02c2\5\u00ba^\2\u02c0\u02c2\5\u00bc_\2\u02c1\u02bc\3"+
		"\2\2\2\u02c1\u02bd\3\2\2\2\u02c1\u02be\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1"+
		"\u02c0\3\2\2\2\u02c2C\3\2\2\2\u02c3\u02c8\5\u00e0q\2\u02c4\u02c5\7\6\2"+
		"\2\u02c5\u02c7\5\u00e0q\2\u02c6\u02c4\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8"+
		"\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9E\3\2\2\2\u02ca\u02c8\3\2\2\2"+
		"\u02cb\u02cc\7T\2\2\u02cc\u02d1\5H%\2\u02cd\u02ce\7\5\2\2\u02ce\u02d0"+
		"\5H%\2\u02cf\u02cd\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2G\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d6\5\u00e0"+
		"q\2\u02d5\u02d7\7\25\2\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u02d9\7\3\2\2\u02d9\u02da\58\35\2\u02da\u02db\7\4"+
		"\2\2\u02dbI\3\2\2\2\u02dc\u02dd\7\u00a6\2\2\u02dd\u02de\5\u00dep\2\u02de"+
		"K\3\2\2\2\u02df\u02e0\7\3\2\2\u02e0\u02e5\5N(\2\u02e1\u02e2\7\5\2\2\u02e2"+
		"\u02e4\5N(\2\u02e3\u02e1\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2"+
		"\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02e9"+
		"\7\4\2\2\u02e9M\3\2\2\2\u02ea\u02ef\5P)\2\u02eb\u02ed\7\u0089\2\2\u02ec"+
		"\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\5R"+
		"*\2\u02ef\u02ec\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0O\3\2\2\2\u02f1\u02f6"+
		"\5\u00e0q\2\u02f2\u02f3\7\6\2\2\u02f3\u02f5\5\u00e0q\2\u02f4\u02f2\3\2"+
		"\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02fb\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fb\7\u00f7\2\2\u02fa\u02f1"+
		"\3\2\2\2\u02fa\u02f9\3\2\2\2\u02fbQ\3\2\2\2\u02fc\u0301\7\u00fb\2\2\u02fd"+
		"\u0301\7\u00fc\2\2\u02fe\u0301\5\u00be`\2\u02ff\u0301\7\u00f7\2\2\u0300"+
		"\u02fc\3\2\2\2\u0300\u02fd\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u02ff\3\2"+
		"\2\2\u0301S\3\2\2\2\u0302\u0303\7\3\2\2\u0303\u0308\5\u00b6\\\2\u0304"+
		"\u0305\7\5\2\2\u0305\u0307\5\u00b6\\\2\u0306\u0304\3\2\2\2\u0307\u030a"+
		"\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\3\2\2\2\u030a"+
		"\u0308\3\2\2\2\u030b\u030c\7\4\2\2\u030cU\3\2\2\2\u030d\u030e\7\3\2\2"+
		"\u030e\u0313\5T+\2\u030f\u0310\7\5\2\2\u0310\u0312\5T+\2\u0311\u030f\3"+
		"\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0316\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0317\7\4\2\2\u0317W\3\2\2\2"+
		"\u0318\u0319\7\u00c4\2\2\u0319\u031a\7\25\2\2\u031a\u031f\5Z.\2\u031b"+
		"\u031c\7\u00c4\2\2\u031c\u031d\7\33\2\2\u031d\u031f\5\\/\2\u031e\u0318"+
		"\3\2\2\2\u031e\u031b\3\2\2\2\u031fY\3\2\2\2\u0320\u0321\7\u00d4\2\2\u0321"+
		"\u0322\7\u00f7\2\2\u0322\u0323\7\u00d5\2\2\u0323\u0326\7\u00f7\2\2\u0324"+
		"\u0326\5\u00e0q\2\u0325\u0320\3\2\2\2\u0325\u0324\3\2\2\2\u0326[\3\2\2"+
		"\2\u0327\u032b\7\u00f7\2\2\u0328\u0329\7T\2\2\u0329\u032a\7\u00a8\2\2"+
		"\u032a\u032c\5L\'\2\u032b\u0328\3\2\2\2\u032b\u032c\3\2\2\2\u032c]\3\2"+
		"\2\2\u032d\u032e\5\u00e0q\2\u032e\u032f\7\u00f7\2\2\u032f_\3\2\2\2\u0330"+
		"\u0332\5:\36\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0333\3\2"+
		"\2\2\u0333\u0334\5f\64\2\u0334\u0335\5b\62\2\u0335\u033d\3\2\2\2\u0336"+
		"\u0338\5r:\2\u0337\u0339\5d\63\2\u0338\u0337\3\2\2\2\u0339\u033a\3\2\2"+
		"\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u0331"+
		"\3\2\2\2\u033c\u0336\3\2\2\2\u033da\3\2\2\2\u033e\u033f\7 \2\2\u033f\u0340"+
		"\7\33\2\2\u0340\u0345\5j\66\2\u0341\u0342\7\5\2\2\u0342\u0344\5j\66\2"+
		"\u0343\u0341\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346"+
		"\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u033e\3\2\2\2\u0348"+
		"\u0349\3\2\2\2\u0349\u0354\3\2\2\2\u034a\u034b\7\u00a1\2\2\u034b\u034c"+
		"\7\33\2\2\u034c\u0351\5\u00acW\2\u034d\u034e\7\5\2\2\u034e\u0350\5\u00ac"+
		"W\2\u034f\u034d\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0351"+
		"\u0352\3\2\2\2\u0352\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0354\u034a\3\2"+
		"\2\2\u0354\u0355\3\2\2\2\u0355\u0360\3\2\2\2\u0356\u0357\7\u00a2\2\2\u0357"+
		"\u0358\7\33\2\2\u0358\u035d\5\u00acW\2\u0359\u035a\7\5\2\2\u035a\u035c"+
		"\5\u00acW\2\u035b\u0359\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b\3\2\2"+
		"\2\u035d\u035e\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u0360\u0356"+
		"\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u036c\3\2\2\2\u0362\u0363\7\u00a0\2"+
		"\2\u0363\u0364\7\33\2\2\u0364\u0369\5j\66\2\u0365\u0366\7\5\2\2\u0366"+
		"\u0368\5j\66\2\u0367\u0365\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2"+
		"\2\2\u0369\u036a\3\2\2\2\u036a\u036d\3\2\2\2\u036b\u0369\3\2\2\2\u036c"+
		"\u0362\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036f\3\2\2\2\u036e\u0370\5\u00d4"+
		"k\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0376\3\2\2\2\u0371"+
		"\u0374\7\"\2\2\u0372\u0375\7\26\2\2\u0373\u0375\5\u00acW\2\u0374\u0372"+
		"\3\2\2\2\u0374\u0373\3\2\2\2\u0375\u0377\3\2\2\2\u0376\u0371\3\2\2\2\u0376"+
		"\u0377\3\2\2\2\u0377c\3\2\2\2\u0378\u037a\5:\36\2\u0379\u0378\3\2\2\2"+
		"\u0379\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c\5l\67\2\u037c\u037d"+
		"\5b\62\2\u037de\3\2\2\2\u037e\u037f\b\64\1\2\u037f\u0380\5h\65\2\u0380"+
		"\u0398\3\2\2\2\u0381\u0382\f\5\2\2\u0382\u0383\6\64\3\2\u0383\u0385\t"+
		"\2\2\2\u0384\u0386\5\u0080A\2\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2\2"+
		"\u0386\u0387\3\2\2\2\u0387\u0397\5f\64\6\u0388\u0389\f\4\2\2\u0389\u038a"+
		"\6\64\5\2\u038a\u038c\7p\2\2\u038b\u038d\5\u0080A\2\u038c\u038b\3\2\2"+
		"\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0397\5f\64\5\u038f\u0390"+
		"\f\3\2\2\u0390\u0391\6\64\7\2\u0391\u0393\t\3\2\2\u0392\u0394\5\u0080"+
		"A\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u0397\5f\64\4\u0396\u0381\3\2\2\2\u0396\u0388\3\2\2\2\u0396\u038f\3\2"+
		"\2\2\u0397\u039a\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"g\3\2\2\2\u039a\u0398\3\2\2\2\u039b\u03a4\5l\67\2\u039c\u039d\7W\2\2\u039d"+
		"\u03a4\5\u00a4S\2\u039e\u03a4\5\u009cO\2\u039f\u03a0\7\3\2\2\u03a0\u03a1"+
		"\5`\61\2\u03a1\u03a2\7\4\2\2\u03a2\u03a4\3\2\2\2\u03a3\u039b\3\2\2\2\u03a3"+
		"\u039c\3\2\2\2\u03a3\u039e\3\2\2\2\u03a3\u039f\3\2\2\2\u03a4i\3\2\2\2"+
		"\u03a5\u03a7\5\u00acW\2\u03a6\u03a8\t\4\2\2\u03a7\u03a6\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03aa\7\61\2\2\u03aa\u03ac\t"+
		"\5\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ack\3\2\2\2\u03ad\u03ae"+
		"\7\22\2\2\u03ae\u03af\7\u00a4\2\2\u03af\u03b0\7\3\2\2\u03b0\u03b1\5\u00aa"+
		"V\2\u03b1\u03b2\7\4\2\2\u03b2\u03b8\3\2\2\2\u03b3\u03b4\7w\2\2\u03b4\u03b8"+
		"\5\u00aaV\2\u03b5\u03b6\7\u00a5\2\2\u03b6\u03b8\5\u00aaV\2\u03b7\u03ad"+
		"\3\2\2\2\u03b7\u03b3\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9"+
		"\u03bb\5\u00a2R\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03be"+
		"\3\2\2\2\u03bc\u03bd\7\u00aa\2\2\u03bd\u03bf\7\u00f7\2\2\u03be\u03bc\3"+
		"\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\7\u00a6\2\2"+
		"\u03c1\u03ce\7\u00f7\2\2\u03c2\u03cc\7\25\2\2\u03c3\u03cd\5\u0090I\2\u03c4"+
		"\u03cd\5\u00caf\2\u03c5\u03c8\7\3\2\2\u03c6\u03c9\5\u0090I\2\u03c7\u03c9"+
		"\5\u00caf\2\u03c8\u03c6\3\2\2\2\u03c8\u03c7\3\2\2\2\u03c9\u03ca\3\2\2"+
		"\2\u03ca\u03cb\7\4\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03c3\3\2\2\2\u03cc\u03c4"+
		"\3\2\2\2\u03cc\u03c5\3\2\2\2\u03cd\u03cf\3\2\2\2\u03ce\u03c2\3\2\2\2\u03ce"+
		"\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03d2\5\u00a2R\2\u03d1\u03d0"+
		"\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d4\7\u00a9\2"+
		"\2\u03d4\u03d6\7\u00f7\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6"+
		"\u03d8\3\2\2\2\u03d7\u03d9\5r:\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9\3\2\2"+
		"\2\u03d9\u03dc\3\2\2\2\u03da\u03db\7\31\2\2\u03db\u03dd\5\u00aeX\2\u03dc"+
		"\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u040b\3\2\2\2\u03de\u03e2\7\22"+
		"\2\2\u03df\u03e1\5n8\2\u03e0\u03df\3\2\2\2\u03e1\u03e4\3\2\2\2\u03e2\u03e0"+
		"\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e5"+
		"\u03e7\5\u0080A\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8"+
		"\3\2\2\2\u03e8\u03ea\5\u00aaV\2\u03e9\u03eb\5r:\2\u03ea\u03e9\3\2\2\2"+
		"\u03ea\u03eb\3\2\2\2\u03eb\u03f5\3\2\2\2\u03ec\u03f2\5r:\2\u03ed\u03ef"+
		"\7\22\2\2\u03ee\u03f0\5\u0080A\2\u03ef\u03ee\3\2\2\2\u03ef\u03f0\3\2\2"+
		"\2\u03f0\u03f1\3\2\2\2\u03f1\u03f3\5\u00aaV\2\u03f2\u03ed\3\2\2\2\u03f2"+
		"\u03f3\3\2\2\2\u03f3\u03f5\3\2\2\2\u03f4\u03de\3\2\2\2\u03f4\u03ec\3\2"+
		"\2\2\u03f5\u03f9\3\2\2\2\u03f6\u03f8\5~@\2\u03f7\u03f6\3\2\2\2\u03f8\u03fb"+
		"\3\2\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fe\3\2\2\2\u03fb"+
		"\u03f9\3\2\2\2\u03fc\u03fd\7\31\2\2\u03fd\u03ff\5\u00aeX\2\u03fe\u03fc"+
		"\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0401\3\2\2\2\u0400\u0402\5t;\2\u0401"+
		"\u0400\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0405\3\2\2\2\u0403\u0404\7!"+
		"\2\2\u0404\u0406\5\u00aeX\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406"+
		"\u0408\3\2\2\2\u0407\u0409\5\u00d4k\2\u0408\u0407\3\2\2\2\u0408\u0409"+
		"\3\2\2\2\u0409\u040b\3\2\2\2\u040a\u03b7\3\2\2\2\u040a\u03f4\3\2\2\2\u040b"+
		"m\3\2\2\2\u040c\u040d\7\7\2\2\u040d\u0414\5p9\2\u040e\u0410\7\5\2\2\u040f"+
		"\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0413\5p"+
		"9\2\u0412\u040f\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0414"+
		"\u0415\3\2\2\2\u0415\u0417\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u0418\7\b"+
		"\2\2\u0418o\3\2\2\2\u0419\u0427\5\u00e0q\2\u041a\u041b\5\u00e0q\2\u041b"+
		"\u041c\7\3\2\2\u041c\u0421\5\u00b4[\2\u041d\u041e\7\5\2\2\u041e\u0420"+
		"\5\u00b4[\2\u041f\u041d\3\2\2\2\u0420\u0423\3\2\2\2\u0421\u041f\3\2\2"+
		"\2\u0421\u0422\3\2\2\2\u0422\u0424\3\2\2\2\u0423\u0421\3\2\2\2\u0424\u0425"+
		"\7\4\2\2\u0425\u0427\3\2\2\2\u0426\u0419\3\2\2\2\u0426\u041a\3\2\2\2\u0427"+
		"q\3\2\2\2\u0428\u0429\7\23\2\2\u0429\u042e\5\u0082B\2\u042a\u042b\7\5"+
		"\2\2\u042b\u042d\5\u0082B\2\u042c\u042a\3\2\2\2\u042d\u0430\3\2\2\2\u042e"+
		"\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0434\3\2\2\2\u0430\u042e\3\2"+
		"\2\2\u0431\u0433\5~@\2\u0432\u0431\3\2\2\2\u0433\u0436\3\2\2\2\u0434\u0432"+
		"\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0438\3\2\2\2\u0436\u0434\3\2\2\2\u0437"+
		"\u0439\5x=\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439s\3\2\2\2\u043a"+
		"\u043b\7\32\2\2\u043b\u043c\7\33\2\2\u043c\u0441\5\u00acW\2\u043d\u043e"+
		"\7\5\2\2\u043e\u0440\5\u00acW\2\u043f\u043d\3\2\2\2\u0440\u0443\3\2\2"+
		"\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0455\3\2\2\2\u0443\u0441"+
		"\3\2\2\2\u0444\u0445\7T\2\2\u0445\u0456\7\37\2\2\u0446\u0447\7T\2\2\u0447"+
		"\u0456\7\36\2\2\u0448\u0449\7\34\2\2\u0449\u044a\7\35\2\2\u044a\u044b"+
		"\7\3\2\2\u044b\u0450\5v<\2\u044c\u044d\7\5\2\2\u044d\u044f\5v<\2\u044e"+
		"\u044c\3\2\2\2\u044f\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2"+
		"\2\2\u0451\u0453\3\2\2\2\u0452\u0450\3\2\2\2\u0453\u0454\7\4\2\2\u0454"+
		"\u0456\3\2\2\2\u0455\u0444\3\2\2\2\u0455\u0446\3\2\2\2\u0455\u0448\3\2"+
		"\2\2\u0455\u0456\3\2\2\2\u0456\u0467\3\2\2\2\u0457\u0458\7\32\2\2\u0458"+
		"\u0459\7\33\2\2\u0459\u045a\7\34\2\2\u045a\u045b\7\35\2\2\u045b\u045c"+
		"\7\3\2\2\u045c\u0461\5v<\2\u045d\u045e\7\5\2\2\u045e\u0460\5v<\2\u045f"+
		"\u045d\3\2\2\2\u0460\u0463\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0462\3\2"+
		"\2\2\u0462\u0464\3\2\2\2\u0463\u0461\3\2\2\2\u0464\u0465\7\4\2\2\u0465"+
		"\u0467\3\2\2\2\u0466\u043a\3\2\2\2\u0466\u0457\3\2\2\2\u0467u\3\2\2\2"+
		"\u0468\u0471\7\3\2\2\u0469\u046e\5\u00acW\2\u046a\u046b\7\5\2\2\u046b"+
		"\u046d\5\u00acW\2\u046c\u046a\3\2\2\2\u046d\u0470\3\2\2\2\u046e\u046c"+
		"\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0472\3\2\2\2\u0470\u046e\3\2\2\2\u0471"+
		"\u0469\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0476\7\4"+
		"\2\2\u0474\u0476\5\u00acW\2\u0475\u0468\3\2\2\2\u0475\u0474\3\2\2\2\u0476"+
		"w\3\2\2\2\u0477\u0478\7E\2\2\u0478\u0479\7\3\2\2\u0479\u047a\5\u00aaV"+
		"\2\u047a\u047b\7\64\2\2\u047b\u047c\5z>\2\u047c\u047d\7&\2\2\u047d\u047e"+
		"\7\3\2\2\u047e\u0483\5|?\2\u047f\u0480\7\5\2\2\u0480\u0482\5|?\2\u0481"+
		"\u047f\3\2\2\2\u0482\u0485\3\2\2\2\u0483\u0481\3\2\2\2\u0483\u0484\3\2"+
		"\2\2\u0484\u0486\3\2\2\2\u0485\u0483\3\2\2\2\u0486\u0487\7\4\2\2\u0487"+
		"\u0488\7\4\2\2\u0488y\3\2\2\2\u0489\u0496\5\u00e0q\2\u048a\u048b\7\3\2"+
		"\2\u048b\u0490\5\u00e0q\2\u048c\u048d\7\5\2\2\u048d\u048f\5\u00e0q\2\u048e"+
		"\u048c\3\2\2\2\u048f\u0492\3\2\2\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2"+
		"\2\2\u0491\u0493\3\2\2\2\u0492\u0490\3\2\2\2\u0493\u0494\7\4\2\2\u0494"+
		"\u0496\3\2\2\2\u0495\u0489\3\2\2\2\u0495\u048a\3\2\2\2\u0496{\3\2\2\2"+
		"\u0497\u049c\5\u00acW\2\u0498\u049a\7\25\2\2\u0499\u0498\3\2\2\2\u0499"+
		"\u049a\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049d\5\u00e0q\2\u049c\u0499"+
		"\3\2\2\2\u049c\u049d\3\2\2\2\u049d}\3\2\2\2\u049e\u049f\7F\2\2\u049f\u04a1"+
		"\7Y\2\2\u04a0\u04a2\7=\2\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04a3\3\2\2\2\u04a3\u04a4\5\u00dep\2\u04a4\u04ad\7\3\2\2\u04a5\u04aa"+
		"\5\u00acW\2\u04a6\u04a7\7\5\2\2\u04a7\u04a9\5\u00acW\2\u04a8\u04a6\3\2"+
		"\2\2\u04a9\u04ac\3\2\2\2\u04aa\u04a8\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab"+
		"\u04ae\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ad\u04a5\3\2\2\2\u04ad\u04ae\3\2"+
		"\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\7\4\2\2\u04b0\u04bc\5\u00e0q\2\u04b1"+
		"\u04b3\7\25\2\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3"+
		"\2\2\2\u04b4\u04b9\5\u00e0q\2\u04b5\u04b6\7\5\2\2\u04b6\u04b8\5\u00e0"+
		"q\2\u04b7\u04b5\3\2\2\2\u04b8\u04bb\3\2\2\2\u04b9\u04b7\3\2\2\2\u04b9"+
		"\u04ba\3\2\2\2\u04ba\u04bd\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bc\u04b2\3\2"+
		"\2\2\u04bc\u04bd\3\2\2\2\u04bd\177\3\2\2\2\u04be\u04bf\t\6\2\2\u04bf\u0081"+
		"\3\2\2\2\u04c0\u04c4\5\u009aN\2\u04c1\u04c3\5\u0084C\2\u04c2\u04c1\3\2"+
		"\2\2\u04c3\u04c6\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5"+
		"\u0083\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c7\u04c8\5\u0086D\2\u04c8\u04c9"+
		"\7;\2\2\u04c9\u04cb\5\u009aN\2\u04ca\u04cc\5\u0088E\2\u04cb\u04ca\3\2"+
		"\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04d3\3\2\2\2\u04cd\u04ce\7C\2\2\u04ce"+
		"\u04cf\5\u0086D\2\u04cf\u04d0\7;\2\2\u04d0\u04d1\5\u009aN\2\u04d1\u04d3"+
		"\3\2\2\2\u04d2\u04c7\3\2\2\2\u04d2\u04cd\3\2\2\2\u04d3\u0085\3\2\2\2\u04d4"+
		"\u04d6\7>\2\2\u04d5\u04d4\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04eb\3\2"+
		"\2\2\u04d7\u04eb\7<\2\2\u04d8\u04da\7?\2\2\u04d9\u04db\7=\2\2\u04da\u04d9"+
		"\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04eb\3\2\2\2\u04dc\u04dd\7?\2\2\u04dd"+
		"\u04eb\7@\2\2\u04de\u04e0\7A\2\2\u04df\u04e1\7=\2\2\u04e0\u04df\3\2\2"+
		"\2\u04e0\u04e1\3\2\2\2\u04e1\u04eb\3\2\2\2\u04e2\u04e4\7B\2\2\u04e3\u04e5"+
		"\7=\2\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04eb\3\2\2\2\u04e6"+
		"\u04e8\7?\2\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04e9\3\2"+
		"\2\2\u04e9\u04eb\7\u00f4\2\2\u04ea\u04d5\3\2\2\2\u04ea\u04d7\3\2\2\2\u04ea"+
		"\u04d8\3\2\2\2\u04ea\u04dc\3\2\2\2\u04ea\u04de\3\2\2\2\u04ea\u04e2\3\2"+
		"\2\2\u04ea\u04e7\3\2\2\2\u04eb\u0087\3\2\2\2\u04ec\u04ed\7D\2\2\u04ed"+
		"\u04fb\5\u00aeX\2\u04ee\u04ef\7\u00a6\2\2\u04ef\u04f0\7\3\2\2\u04f0\u04f5"+
		"\5\u00e0q\2\u04f1\u04f2\7\5\2\2\u04f2\u04f4\5\u00e0q\2\u04f3\u04f1\3\2"+
		"\2\2\u04f4\u04f7\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6"+
		"\u04f8\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f8\u04f9\7\4\2\2\u04f9\u04fb\3\2"+
		"\2\2\u04fa\u04ec\3\2\2\2\u04fa\u04ee\3\2\2\2\u04fb\u0089\3\2\2\2\u04fc"+
		"\u04fd\7r\2\2\u04fd\u04ff\7\3\2\2\u04fe\u0500\5\u008cG\2\u04ff\u04fe\3"+
		"\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\7\4\2\2\u0502"+
		"\u008b\3\2\2\2\u0503\u0505\7\u0092\2\2\u0504\u0503\3\2\2\2\u0504\u0505"+
		"\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\t\7\2\2\u0507\u051c\7\u009c\2"+
		"\2\u0508\u0509\5\u00acW\2\u0509\u050a\7K\2\2\u050a\u051c\3\2\2\2\u050b"+
		"\u050c\7\u009d\2\2\u050c\u050d\7\u00fb\2\2\u050d\u050e\7\u009e\2\2\u050e"+
		"\u050f\7\u009f\2\2\u050f\u0518\7\u00fb\2\2\u0510\u0516\7D\2\2\u0511\u0517"+
		"\5\u00e0q\2\u0512\u0513\5\u00dep\2\u0513\u0514\7\3\2\2\u0514\u0515\7\4"+
		"\2\2\u0515\u0517\3\2\2\2\u0516\u0511\3\2\2\2\u0516\u0512\3\2\2\2\u0517"+
		"\u0519\3\2\2\2\u0518\u0510\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051c\3\2"+
		"\2\2\u051a\u051c\5\u00acW\2\u051b\u0504\3\2\2\2\u051b\u0508\3\2\2\2\u051b"+
		"\u050b\3\2\2\2\u051b\u051a\3\2\2\2\u051c\u008d\3\2\2\2\u051d\u051e\7\3"+
		"\2\2\u051e\u051f\5\u0090I\2\u051f\u0520\7\4\2\2\u0520\u008f\3\2\2\2\u0521"+
		"\u0526\5\u00e0q\2\u0522\u0523\7\5\2\2\u0523\u0525\5\u00e0q\2\u0524\u0522"+
		"\3\2\2\2\u0525\u0528\3\2\2\2\u0526\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527"+
		"\u0091\3\2\2\2\u0528\u0526\3\2\2\2\u0529\u052a\7\3\2\2\u052a\u052f\5\u0094"+
		"K\2\u052b\u052c\7\5\2\2\u052c\u052e\5\u0094K\2\u052d\u052b\3\2\2\2\u052e"+
		"\u0531\3\2\2\2\u052f\u052d\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0532\3\2"+
		"\2\2\u0531\u052f\3\2\2\2\u0532\u0533\7\4\2\2\u0533\u0093\3\2\2\2\u0534"+
		"\u0536\5\u00e0q\2\u0535\u0537\t\4\2\2\u0536\u0535\3\2\2\2\u0536\u0537"+
		"\3\2\2\2\u0537\u0095\3\2\2\2\u0538\u0539\7\3\2\2\u0539\u053e\5\u0098M"+
		"\2\u053a\u053b\7\5\2\2\u053b\u053d\5\u0098M\2\u053c\u053a\3\2\2\2\u053d"+
		"\u0540\3\2\2\2\u053e\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541\3\2"+
		"\2\2\u0540\u053e\3\2\2\2\u0541\u0542\7\4\2\2\u0542\u0097\3\2\2\2\u0543"+
		"\u0546\5\u00e0q\2\u0544\u0545\7y\2\2\u0545\u0547\7\u00f7\2\2\u0546\u0544"+
		"\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0099\3\2\2\2\u0548\u054a\5\u00a4S"+
		"\2\u0549\u054b\5\u008aF\2\u054a\u0549\3\2\2\2\u054a\u054b\3\2\2\2\u054b"+
		"\u054c\3\2\2\2\u054c\u054d\5\u00a0Q\2\u054d\u0561\3\2\2\2\u054e\u054f"+
		"\7\3\2\2\u054f\u0550\5`\61\2\u0550\u0552\7\4\2\2\u0551\u0553\5\u008aF"+
		"\2\u0552\u0551\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0555"+
		"\5\u00a0Q\2\u0555\u0561\3\2\2\2\u0556\u0557\7\3\2\2\u0557\u0558\5\u0082"+
		"B\2\u0558\u055a\7\4\2\2\u0559\u055b\5\u008aF\2\u055a\u0559\3\2\2\2\u055a"+
		"\u055b\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d\5\u00a0Q\2\u055d\u0561"+
		"\3\2\2\2\u055e\u0561\5\u009cO\2\u055f\u0561\5\u009eP\2\u0560\u0548\3\2"+
		"\2\2\u0560\u054e\3\2\2\2\u0560\u0556\3\2\2\2\u0560\u055e\3\2\2\2\u0560"+
		"\u055f\3\2\2\2\u0561\u009b\3\2\2\2\u0562\u0563\7U\2\2\u0563\u0568\5\u00ac"+
		"W\2\u0564\u0565\7\5\2\2\u0565\u0567\5\u00acW\2\u0566\u0564\3\2\2\2\u0567"+
		"\u056a\3\2\2\2\u0568\u0566\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056b\3\2"+
		"\2\2\u056a\u0568\3\2\2\2\u056b\u056c\5\u00a0Q\2\u056c\u009d\3\2\2\2\u056d"+
		"\u056e\5\u00e0q\2\u056e\u0577\7\3\2\2\u056f\u0574\5\u00acW\2\u0570\u0571"+
		"\7\5\2\2\u0571\u0573\5\u00acW\2\u0572\u0570\3\2\2\2\u0573\u0576\3\2\2"+
		"\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0578\3\2\2\2\u0576\u0574"+
		"\3\2\2\2\u0577\u056f\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u0579\3\2\2\2\u0579"+
		"\u057a\7\4\2\2\u057a\u057b\5\u00a0Q\2\u057b\u009f\3\2\2\2\u057c\u057e"+
		"\7\25\2\2\u057d\u057c\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u057f\3\2\2\2"+
		"\u057f\u0581\5\u00e2r\2\u0580\u0582\5\u008eH\2\u0581\u0580\3\2\2\2\u0581"+
		"\u0582\3\2\2\2\u0582\u0584\3\2\2\2\u0583\u057d\3\2\2\2\u0583\u0584\3\2"+
		"\2\2\u0584\u00a1\3\2\2\2\u0585\u0586\7S\2\2\u0586\u0587\7`\2\2\u0587\u0588"+
		"\7\u00a7\2\2\u0588\u058c\7\u00f7\2\2\u0589\u058a\7T\2\2\u058a\u058b\7"+
		"\u00a8\2\2\u058b\u058d\5L\'\2\u058c\u0589\3\2\2\2\u058c\u058d\3\2\2\2"+
		"\u058d\u05b7\3\2\2\2\u058e\u058f\7S\2\2\u058f\u0590\7`\2\2\u0590\u059a"+
		"\7\u00ab\2\2\u0591\u0592\7\u00ac\2\2\u0592\u0593\7\u00ad\2\2\u0593\u0594"+
		"\7\33\2\2\u0594\u0598\7\u00f7\2\2\u0595\u0596\7\u00b1\2\2\u0596\u0597"+
		"\7\33\2\2\u0597\u0599\7\u00f7\2\2\u0598\u0595\3\2\2\2\u0598\u0599\3\2"+
		"\2\2\u0599\u059b\3\2\2\2\u059a\u0591\3\2\2\2\u059a\u059b\3\2\2\2\u059b"+
		"\u05a1\3\2\2\2\u059c\u059d\7\u00ae\2\2\u059d\u059e\7\u00af\2\2\u059e\u059f"+
		"\7\u00ad\2\2\u059f\u05a0\7\33\2\2\u05a0\u05a2\7\u00f7\2\2\u05a1\u059c"+
		"\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a8\3\2\2\2\u05a3\u05a4\7w\2\2\u05a4"+
		"\u05a5\7\u00b0\2\2\u05a5\u05a6\7\u00ad\2\2\u05a6\u05a7\7\33\2\2\u05a7"+
		"\u05a9\7\u00f7\2\2\u05a8\u05a3\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05ae"+
		"\3\2\2\2\u05aa\u05ab\7\u00b2\2\2\u05ab\u05ac\7\u00ad\2\2\u05ac\u05ad\7"+
		"\33\2\2\u05ad\u05af\7\u00f7\2\2\u05ae\u05aa\3\2\2\2\u05ae\u05af\3\2\2"+
		"\2\u05af\u05b4\3\2\2\2\u05b0\u05b1\7.\2\2\u05b1\u05b2\7\u00e0\2\2\u05b2"+
		"\u05b3\7\25\2\2\u05b3\u05b5\7\u00f7\2\2\u05b4\u05b0\3\2\2\2\u05b4\u05b5"+
		"\3\2\2\2\u05b5\u05b7\3\2\2\2\u05b6\u0585\3\2\2\2\u05b6\u058e\3\2\2\2\u05b7"+
		"\u00a3\3\2\2\2\u05b8\u05b9\5\u00e0q\2\u05b9\u05ba\7\6\2\2\u05ba\u05bc"+
		"\3\2\2\2\u05bb\u05b8\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd"+
		"\u05be\5\u00e0q\2\u05be\u00a5\3\2\2\2\u05bf\u05c0\5\u00e0q\2\u05c0\u05c1"+
		"\7\6\2\2\u05c1\u05c3\3\2\2\2\u05c2\u05bf\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3"+
		"\u05c4\3\2\2\2\u05c4\u05c5\5\u00e0q\2\u05c5\u00a7\3\2\2\2\u05c6\u05ce"+
		"\5\u00acW\2\u05c7\u05c9\7\25\2\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9\3\2\2"+
		"\2\u05c9\u05cc\3\2\2\2\u05ca\u05cd\5\u00e0q\2\u05cb\u05cd\5\u008eH\2\u05cc"+
		"\u05ca\3\2\2\2\u05cc\u05cb\3\2\2\2\u05cd\u05cf\3\2\2\2\u05ce\u05c8\3\2"+
		"\2\2\u05ce\u05cf\3\2\2\2\u05cf\u00a9\3\2\2\2\u05d0\u05d5\5\u00a8U\2\u05d1"+
		"\u05d2\7\5\2\2\u05d2\u05d4\5\u00a8U\2\u05d3\u05d1\3\2\2\2\u05d4\u05d7"+
		"\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u00ab\3\2\2\2\u05d7"+
		"\u05d5\3\2\2\2\u05d8\u05d9\5\u00aeX\2\u05d9\u00ad\3\2\2\2\u05da\u05db"+
		"\bX\1\2\u05db\u05dc\7\'\2\2\u05dc\u05e7\5\u00aeX\7\u05dd\u05de\7)\2\2"+
		"\u05de\u05df\7\3\2\2\u05df\u05e0\58\35\2\u05e0\u05e1\7\4\2\2\u05e1\u05e7"+
		"\3\2\2\2\u05e2\u05e4\5\u00b2Z\2\u05e3\u05e5\5\u00b0Y\2\u05e4\u05e3\3\2"+
		"\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e7\3\2\2\2\u05e6\u05da\3\2\2\2\u05e6"+
		"\u05dd\3\2\2\2\u05e6\u05e2\3\2\2\2\u05e7\u05f0\3\2\2\2\u05e8\u05e9\f\4"+
		"\2\2\u05e9\u05ea\7%\2\2\u05ea\u05ef\5\u00aeX\5\u05eb\u05ec\f\3\2\2\u05ec"+
		"\u05ed\7$\2\2\u05ed\u05ef\5\u00aeX\4\u05ee\u05e8\3\2\2\2\u05ee\u05eb\3"+
		"\2\2\2\u05ef\u05f2\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1"+
		"\u00af\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f3\u05f5\7\'\2\2\u05f4\u05f3\3\2"+
		"\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\7*\2\2\u05f7"+
		"\u05f8\5\u00b2Z\2\u05f8\u05f9\7%\2\2\u05f9\u05fa\5\u00b2Z\2\u05fa\u0624"+
		"\3\2\2\2\u05fb\u05fd\7\'\2\2\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd"+
		"\u05fe\3\2\2\2\u05fe\u05ff\7&\2\2\u05ff\u0600\7\3\2\2\u0600\u0605\5\u00ac"+
		"W\2\u0601\u0602\7\5\2\2\u0602\u0604\5\u00acW\2\u0603\u0601\3\2\2\2\u0604"+
		"\u0607\3\2\2\2\u0605\u0603\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0608\3\2"+
		"\2\2\u0607\u0605\3\2\2\2\u0608\u0609\7\4\2\2\u0609\u0624\3\2\2\2\u060a"+
		"\u060c\7\'\2\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\3\2"+
		"\2\2\u060d\u060e\7&\2\2\u060e\u060f\7\3\2\2\u060f\u0610\58\35\2\u0610"+
		"\u0611\7\4\2\2\u0611\u0624\3\2\2\2\u0612\u0614\7\'\2\2\u0613\u0612\3\2"+
		"\2\2\u0613\u0614\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\t\b\2\2\u0616"+
		"\u0624\5\u00b2Z\2\u0617\u0619\7-\2\2\u0618\u061a\7\'\2\2\u0619\u0618\3"+
		"\2\2\2\u0619\u061a\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u0624\7.\2\2\u061c"+
		"\u061e\7-\2\2\u061d\u061f\7\'\2\2\u061e\u061d\3\2\2\2\u061e\u061f\3\2"+
		"\2\2\u061f\u0620\3\2\2\2\u0620\u0621\7\30\2\2\u0621\u0622\7\23\2\2\u0622"+
		"\u0624\5\u00b2Z\2\u0623\u05f4\3\2\2\2\u0623\u05fc\3\2\2\2\u0623\u060b"+
		"\3\2\2\2\u0623\u0613\3\2\2\2\u0623\u0617\3\2\2\2\u0623\u061c\3\2\2\2\u0624"+
		"\u00b1\3\2\2\2\u0625\u0626\bZ\1\2\u0626\u062a\5\u00b4[\2\u0627\u0628\t"+
		"\t\2\2\u0628\u062a\5\u00b2Z\t\u0629\u0625\3\2\2\2\u0629\u0627\3\2\2\2"+
		"\u062a\u0640\3\2\2\2\u062b\u062c\f\b\2\2\u062c\u062d\t\n\2\2\u062d\u063f"+
		"\5\u00b2Z\t\u062e\u062f\f\7\2\2\u062f\u0630\t\13\2\2\u0630\u063f\5\u00b2"+
		"Z\b\u0631\u0632\f\6\2\2\u0632\u0633\7\u0098\2\2\u0633\u063f\5\u00b2Z\7"+
		"\u0634\u0635\f\5\2\2\u0635\u0636\7\u009b\2\2\u0636\u063f\5\u00b2Z\6\u0637"+
		"\u0638\f\4\2\2\u0638\u0639\7\u0099\2\2\u0639\u063f\5\u00b2Z\5\u063a\u063b"+
		"\f\3\2\2\u063b\u063c\5\u00b8]\2\u063c\u063d\5\u00b2Z\4\u063d\u063f\3\2"+
		"\2\2\u063e\u062b\3\2\2\2\u063e\u062e\3\2\2\2\u063e\u0631\3\2\2\2\u063e"+
		"\u0634\3\2\2\2\u063e\u0637\3\2\2\2\u063e\u063a\3\2\2\2\u063f\u0642\3\2"+
		"\2\2\u0640\u063e\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u00b3\3\2\2\2\u0642"+
		"\u0640\3\2\2\2\u0643\u0644\b[\1\2\u0644\u0646\7\66\2\2\u0645\u0647\5\u00d2"+
		"j\2\u0646\u0645\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u0646\3\2\2\2\u0648"+
		"\u0649\3\2\2\2\u0649\u064c\3\2\2\2\u064a\u064b\79\2\2\u064b\u064d\5\u00ac"+
		"W\2\u064c\u064a\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e\3\2\2\2\u064e"+
		"\u064f\7:\2\2\u064f\u06d5\3\2\2\2\u0650\u0651\7\66\2\2\u0651\u0653\5\u00ac"+
		"W\2\u0652\u0654\5\u00d2j\2\u0653\u0652\3\2\2\2\u0654\u0655\3\2\2\2\u0655"+
		"\u0653\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u0659\3\2\2\2\u0657\u0658\79"+
		"\2\2\u0658\u065a\5\u00acW\2\u0659\u0657\3\2\2\2\u0659\u065a\3\2\2\2\u065a"+
		"\u065b\3\2\2\2\u065b\u065c\7:\2\2\u065c\u06d5\3\2\2\2\u065d\u065e\7d\2"+
		"\2\u065e\u065f\7\3\2\2\u065f\u0660\5\u00acW\2\u0660\u0661\7\25\2\2\u0661"+
		"\u0662\5\u00c8e\2\u0662\u0663\7\4\2\2\u0663\u06d5\3\2\2\2\u0664\u0665"+
		"\7x\2\2\u0665\u066e\7\3\2\2\u0666\u066b\5\u00a8U\2\u0667\u0668\7\5\2\2"+
		"\u0668\u066a\5\u00a8U\2\u0669\u0667\3\2\2\2\u066a\u066d\3\2\2\2\u066b"+
		"\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066f\3\2\2\2\u066d\u066b\3\2"+
		"\2\2\u066e\u0666\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0670\3\2\2\2\u0670"+
		"\u06d5\7\4\2\2\u0671\u0672\7P\2\2\u0672\u0673\7\3\2\2\u0673\u0676\5\u00ac"+
		"W\2\u0674\u0675\7\u0082\2\2\u0675\u0677\7\61\2\2\u0676\u0674\3\2\2\2\u0676"+
		"\u0677\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u0679\7\4\2\2\u0679\u06d5\3\2"+
		"\2\2\u067a\u067b\7R\2\2\u067b\u067c\7\3\2\2\u067c\u067f\5\u00acW\2\u067d"+
		"\u067e\7\u0082\2\2\u067e\u0680\7\61\2\2\u067f\u067d\3\2\2\2\u067f\u0680"+
		"\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0682\7\4\2\2\u0682\u06d5\3\2\2\2\u0683"+
		"\u0684\7\u0087\2\2\u0684\u0685\7\3\2\2\u0685\u0686\5\u00b2Z\2\u0686\u0687"+
		"\7&\2\2\u0687\u0688\5\u00b2Z\2\u0688\u0689\7\4\2\2\u0689\u06d5\3\2\2\2"+
		"\u068a\u06d5\5\u00b6\\\2\u068b\u06d5\7\u0093\2\2\u068c\u068d\5\u00dep"+
		"\2\u068d\u068e\7\6\2\2\u068e\u068f\7\u0093\2\2\u068f\u06d5\3\2\2\2\u0690"+
		"\u0691\7\3\2\2\u0691\u0694\5\u00a8U\2\u0692\u0693\7\5\2\2\u0693\u0695"+
		"\5\u00a8U\2\u0694\u0692\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u0694\3\2\2"+
		"\2\u0696\u0697\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u0699\7\4\2\2\u0699\u06d5"+
		"\3\2\2\2\u069a\u069b\7\3\2\2\u069b\u069c\58\35\2\u069c\u069d\7\4\2\2\u069d"+
		"\u06d5\3\2\2\2\u069e\u069f\5\u00dep\2\u069f\u06ab\7\3\2\2\u06a0\u06a2"+
		"\5\u0080A\2\u06a1\u06a0\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a3\3\2\2"+
		"\2\u06a3\u06a8\5\u00acW\2\u06a4\u06a5\7\5\2\2\u06a5\u06a7\5\u00acW\2\u06a6"+
		"\u06a4\3\2\2\2\u06a7\u06aa\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a8\u06a9\3\2"+
		"\2\2\u06a9\u06ac\3\2\2\2\u06aa\u06a8\3\2\2\2\u06ab\u06a1\3\2\2\2\u06ab"+
		"\u06ac\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06b0\7\4\2\2\u06ae\u06af\7H"+
		"\2\2\u06af\u06b1\5\u00d8m\2\u06b0\u06ae\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1"+
		"\u06d5\3\2\2\2\u06b2\u06b3\5\u00dep\2\u06b3\u06b4\7\3\2\2\u06b4\u06b5"+
		"\t\f\2\2\u06b5\u06b6\5\u00acW\2\u06b6\u06b7\7\23\2\2\u06b7\u06b8\5\u00ac"+
		"W\2\u06b8\u06b9\7\4\2\2\u06b9\u06d5\3\2\2\2\u06ba\u06bb\7\u00ff\2\2\u06bb"+
		"\u06bc\7\t\2\2\u06bc\u06d5\5\u00acW\2\u06bd\u06be\7\3\2\2\u06be\u06c1"+
		"\7\u00ff\2\2\u06bf\u06c0\7\5\2\2\u06c0\u06c2\7\u00ff\2\2\u06c1\u06bf\3"+
		"\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4"+
		"\u06c5\3\2\2\2\u06c5\u06c6\7\4\2\2\u06c6\u06c7\7\t\2\2\u06c7\u06d5\5\u00ac"+
		"W\2\u06c8\u06d5\5\u00e0q\2\u06c9\u06ca\7\3\2\2\u06ca\u06cb\5\u00acW\2"+
		"\u06cb\u06cc\7\4\2\2\u06cc\u06d5\3\2\2\2\u06cd\u06ce\7\u0088\2\2\u06ce"+
		"\u06cf\7\3\2\2\u06cf\u06d0\5\u00e0q\2\u06d0\u06d1\7\23\2\2\u06d1\u06d2"+
		"\5\u00b2Z\2\u06d2\u06d3\7\4\2\2\u06d3\u06d5\3\2\2\2\u06d4\u0643\3\2\2"+
		"\2\u06d4\u0650\3\2\2\2\u06d4\u065d\3\2\2\2\u06d4\u0664\3\2\2\2\u06d4\u0671"+
		"\3\2\2\2\u06d4\u067a\3\2\2\2\u06d4\u0683\3\2\2\2\u06d4\u068a\3\2\2\2\u06d4"+
		"\u068b\3\2\2\2\u06d4\u068c\3\2\2\2\u06d4\u0690\3\2\2\2\u06d4\u069a\3\2"+
		"\2\2\u06d4\u069e\3\2\2\2\u06d4\u06b2\3\2\2\2\u06d4\u06ba\3\2\2\2\u06d4"+
		"\u06bd\3\2\2\2\u06d4\u06c8\3\2\2\2\u06d4\u06c9\3\2\2\2\u06d4\u06cd\3\2"+
		"\2\2\u06d5\u06e0\3\2\2\2\u06d6\u06d7\f\7\2\2\u06d7\u06d8\7\n\2\2\u06d8"+
		"\u06d9\5\u00b2Z\2\u06d9\u06da\7\13\2\2\u06da\u06df\3\2\2\2\u06db\u06dc"+
		"\f\5\2\2\u06dc\u06dd\7\6\2\2\u06dd\u06df\5\u00e0q\2\u06de\u06d6\3\2\2"+
		"\2\u06de\u06db\3\2\2\2\u06df\u06e2\3\2\2\2\u06e0\u06de\3\2\2\2\u06e0\u06e1"+
		"\3\2\2\2\u06e1\u00b5\3\2\2\2\u06e2\u06e0\3\2\2\2\u06e3\u06f0\7.\2\2\u06e4"+
		"\u06f0\5\u00c0a\2\u06e5\u06e6\5\u00e0q\2\u06e6\u06e7\7\u00f7\2\2\u06e7"+
		"\u06f0\3\2\2\2\u06e8\u06f0\5\u00e6t\2\u06e9\u06f0\5\u00be`\2\u06ea\u06ec"+
		"\7\u00f7\2\2\u06eb\u06ea\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06eb\3\2\2"+
		"\2\u06ed\u06ee\3\2\2\2\u06ee\u06f0\3\2\2\2\u06ef\u06e3\3\2\2\2\u06ef\u06e4"+
		"\3\2\2\2\u06ef\u06e5\3\2\2\2\u06ef\u06e8\3\2\2\2\u06ef\u06e9\3\2\2\2\u06ef"+
		"\u06eb\3\2\2\2\u06f0\u00b7\3\2\2\2\u06f1\u06f2\t\r\2\2\u06f2\u00b9\3\2"+
		"\2\2\u06f3\u06f4\t\16\2\2\u06f4\u00bb\3\2\2\2\u06f5\u06f6\t\17\2\2\u06f6"+
		"\u00bd\3\2\2\2\u06f7\u06f8\t\20\2\2\u06f8\u00bf\3\2\2\2\u06f9\u06fd\7"+
		"\65\2\2\u06fa\u06fc\5\u00c2b\2\u06fb\u06fa\3\2\2\2\u06fc\u06ff\3\2\2\2"+
		"\u06fd\u06fb\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u00c1\3\2\2\2\u06ff\u06fd"+
		"\3\2\2\2\u0700\u0701\5\u00c4c\2\u0701\u0704\5\u00e0q\2\u0702\u0703\7q"+
		"\2\2\u0703\u0705\5\u00e0q\2\u0704\u0702\3\2\2\2\u0704\u0705\3\2\2\2\u0705"+
		"\u00c3\3\2\2\2\u0706\u0708\t\21\2\2\u0707\u0706\3\2\2\2\u0707\u0708\3"+
		"\2\2\2\u0708\u0709\3\2\2\2\u0709\u070c\t\7\2\2\u070a\u070c\7\u00f7\2\2"+
		"\u070b\u0707\3\2\2\2\u070b\u070a\3\2\2\2\u070c\u00c5\3\2\2\2\u070d\u0711"+
		"\7P\2\2\u070e\u070f\7Q\2\2\u070f\u0711\5\u00e0q\2\u0710\u070d\3\2\2\2"+
		"\u0710\u070e\3\2\2\2\u0711\u00c7\3\2\2\2\u0712\u0713\7v\2\2\u0713\u0714"+
		"\7\u008d\2\2\u0714\u0715\5\u00c8e\2\u0715\u0716\7\u008f\2\2\u0716\u0735"+
		"\3\2\2\2\u0717\u0718\7w\2\2\u0718\u0719\7\u008d\2\2\u0719\u071a\5\u00c8"+
		"e\2\u071a\u071b\7\5\2\2\u071b\u071c\5\u00c8e\2\u071c\u071d\7\u008f\2\2"+
		"\u071d\u0735\3\2\2\2\u071e\u0725\7x\2\2\u071f\u0721\7\u008d\2\2\u0720"+
		"\u0722\5\u00ceh\2\u0721\u0720\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0723"+
		"\3\2\2\2\u0723\u0726\7\u008f\2\2\u0724\u0726\7\u008b\2\2\u0725\u071f\3"+
		"\2\2\2\u0725\u0724\3\2\2\2\u0726\u0735\3\2\2\2\u0727\u0732\5\u00e0q\2"+
		"\u0728\u0729\7\3\2\2\u0729\u072e\7\u00fb\2\2\u072a\u072b\7\5\2\2\u072b"+
		"\u072d\7\u00fb\2\2\u072c\u072a\3\2\2\2\u072d\u0730\3\2\2\2\u072e\u072c"+
		"\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0731\3\2\2\2\u0730\u072e\3\2\2\2\u0731"+
		"\u0733\7\4\2\2\u0732\u0728\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0735\3\2"+
		"\2\2\u0734\u0712\3\2\2\2\u0734\u0717\3\2\2\2\u0734\u071e\3\2\2\2\u0734"+
		"\u0727\3\2\2\2\u0735\u00c9\3\2\2\2\u0736\u073b\5\u00ccg\2\u0737\u0738"+
		"\7\5\2\2\u0738\u073a\5\u00ccg\2\u0739\u0737\3\2\2\2\u073a\u073d\3\2\2"+
		"\2\u073b\u0739\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u00cb\3\2\2\2\u073d\u073b"+
		"\3\2\2\2\u073e\u073f\5\u00e0q\2\u073f\u0742\5\u00c8e\2\u0740\u0741\7y"+
		"\2\2\u0741\u0743\7\u00f7\2\2\u0742\u0740\3\2\2\2\u0742\u0743\3\2\2\2\u0743"+
		"\u00cd\3\2\2\2\u0744\u0749\5\u00d0i\2\u0745\u0746\7\5\2\2\u0746\u0748"+
		"\5\u00d0i\2\u0747\u0745\3\2\2\2\u0748\u074b\3\2\2\2\u0749\u0747\3\2\2"+
		"\2\u0749\u074a\3\2\2\2\u074a\u00cf\3\2\2\2\u074b\u0749\3\2\2\2\u074c\u074d"+
		"\5\u00e0q\2\u074d\u074e\7\f\2\2\u074e\u0751\5\u00c8e\2\u074f\u0750\7y"+
		"\2\2\u0750\u0752\7\u00f7\2\2\u0751\u074f\3\2\2\2\u0751\u0752\3\2\2\2\u0752"+
		"\u00d1\3\2\2\2\u0753\u0754\7\67\2\2\u0754\u0755\5\u00acW\2\u0755\u0756"+
		"\78\2\2\u0756\u0757\5\u00acW\2\u0757\u00d3\3\2\2\2\u0758\u0759\7G\2\2"+
		"\u0759\u075e\5\u00d6l\2\u075a\u075b\7\5\2\2\u075b\u075d\5\u00d6l\2\u075c"+
		"\u075a\3\2\2\2\u075d\u0760\3\2\2\2\u075e\u075c\3\2\2\2\u075e\u075f\3\2"+
		"\2\2\u075f\u00d5\3\2\2\2\u0760\u075e\3\2\2\2\u0761\u0762\5\u00e0q\2\u0762"+
		"\u0763\7\25\2\2\u0763\u0764\5\u00d8m\2\u0764\u00d7\3\2\2\2\u0765\u0794"+
		"\5\u00e0q\2\u0766\u0767\7\3\2\2\u0767\u0768\5\u00e0q\2\u0768\u0769\7\4"+
		"\2\2\u0769\u0794\3\2\2\2\u076a\u078d\7\3\2\2\u076b\u076c\7\u00a1\2\2\u076c"+
		"\u076d\7\33\2\2\u076d\u0772\5\u00acW\2\u076e\u076f\7\5\2\2\u076f\u0771"+
		"\5\u00acW\2\u0770\u076e\3\2\2\2\u0771\u0774\3\2\2\2\u0772\u0770\3\2\2"+
		"\2\u0772\u0773\3\2\2\2\u0773\u078e\3\2\2\2\u0774\u0772\3\2\2\2\u0775\u0776"+
		"\t\22\2\2\u0776\u0777\7\33\2\2\u0777\u077c\5\u00acW\2\u0778\u0779\7\5"+
		"\2\2\u0779\u077b\5\u00acW\2\u077a\u0778\3\2\2\2\u077b\u077e\3\2\2\2\u077c"+
		"\u077a\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u0780\3\2\2\2\u077e\u077c\3\2"+
		"\2\2\u077f\u0775\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u078b\3\2\2\2\u0781"+
		"\u0782\t\23\2\2\u0782\u0783\7\33\2\2\u0783\u0788\5j\66\2\u0784\u0785\7"+
		"\5\2\2\u0785\u0787\5j\66\2\u0786\u0784\3\2\2\2\u0787\u078a\3\2\2\2\u0788"+
		"\u0786\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u078c\3\2\2\2\u078a\u0788\3\2"+
		"\2\2\u078b\u0781\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u078e\3\2\2\2\u078d"+
		"\u076b\3\2\2\2\u078d\u077f\3\2\2\2\u078e\u0790\3\2\2\2\u078f\u0791\5\u00da"+
		"n\2\u0790\u078f\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u0792\3\2\2\2\u0792"+
		"\u0794\7\4\2\2\u0793\u0765\3\2\2\2\u0793\u0766\3\2\2\2\u0793\u076a\3\2"+
		"\2\2\u0794\u00d9\3\2\2\2\u0795\u0796\7J\2\2\u0796\u07a6\5\u00dco\2\u0797"+
		"\u0798\7K\2\2\u0798\u07a6\5\u00dco\2\u0799\u079a\7J\2\2\u079a\u079b\7"+
		"*\2\2\u079b\u079c\5\u00dco\2\u079c\u079d\7%\2\2\u079d\u079e\5\u00dco\2"+
		"\u079e\u07a6\3\2\2\2\u079f\u07a0\7K\2\2\u07a0\u07a1\7*\2\2\u07a1\u07a2"+
		"\5\u00dco\2\u07a2\u07a3\7%\2\2\u07a3\u07a4\5\u00dco\2\u07a4\u07a6\3\2"+
		"\2\2\u07a5\u0795\3\2\2\2\u07a5\u0797\3\2\2\2\u07a5\u0799\3\2\2\2\u07a5"+
		"\u079f\3\2\2\2\u07a6\u00db\3\2\2\2\u07a7\u07a8\7L\2\2\u07a8\u07af\t\24"+
		"\2\2\u07a9\u07aa\7O\2\2\u07aa\u07af\7S\2\2\u07ab\u07ac\5\u00acW\2\u07ac"+
		"\u07ad\t\24\2\2\u07ad\u07af\3\2\2\2\u07ae\u07a7\3\2\2\2\u07ae\u07a9\3"+
		"\2\2\2\u07ae\u07ab\3\2\2\2\u07af\u00dd\3\2\2\2\u07b0\u07b5\5\u00e0q\2"+
		"\u07b1\u07b2\7\6\2\2\u07b2\u07b4\5\u00e0q\2\u07b3\u07b1\3\2\2\2\u07b4"+
		"\u07b7\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u00df\3\2"+
		"\2\2\u07b7\u07b5\3\2\2\2\u07b8\u07c8\5\u00e2r\2\u07b9\u07c8\7\u00f4\2"+
		"\2\u07ba\u07c8\7B\2\2\u07bb\u07c8\7>\2\2\u07bc\u07c8\7?\2\2\u07bd\u07c8"+
		"\7@\2\2\u07be\u07c8\7A\2\2\u07bf\u07c8\7C\2\2\u07c0\u07c8\7;\2\2\u07c1"+
		"\u07c8\7<\2\2\u07c2\u07c8\7D\2\2\u07c3\u07c8\7m\2\2\u07c4\u07c8\7p\2\2"+
		"\u07c5\u07c8\7n\2\2\u07c6\u07c8\7o\2\2\u07c7\u07b8\3\2\2\2\u07c7\u07b9"+
		"\3\2\2\2\u07c7\u07ba\3\2\2\2\u07c7\u07bb\3\2\2\2\u07c7\u07bc\3\2\2\2\u07c7"+
		"\u07bd\3\2\2\2\u07c7\u07be\3\2\2\2\u07c7\u07bf\3\2\2\2\u07c7\u07c0\3\2"+
		"\2\2\u07c7\u07c1\3\2\2\2\u07c7\u07c2\3\2\2\2\u07c7\u07c3\3\2\2\2\u07c7"+
		"\u07c4\3\2\2\2\u07c7\u07c5\3\2\2\2\u07c7\u07c6\3\2\2\2\u07c8\u00e1\3\2"+
		"\2\2\u07c9\u07cd\7\u00ff\2\2\u07ca\u07cd\5\u00e4s\2\u07cb\u07cd\5\u00e8"+
		"u\2\u07cc\u07c9\3\2\2\2\u07cc\u07ca\3\2\2\2\u07cc\u07cb\3\2\2\2\u07cd"+
		"\u00e3\3\2\2\2\u07ce\u07cf\7\u0100\2\2\u07cf\u00e5\3\2\2\2\u07d0\u07d2"+
		"\7\u0092\2\2\u07d1\u07d0\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d3\3\2\2"+
		"\2\u07d3\u07ed\7\u00fc\2\2\u07d4\u07d6\7\u0092\2\2\u07d5\u07d4\3\2\2\2"+
		"\u07d5\u07d6\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07ed\7\u00fb\2\2\u07d8"+
		"\u07da\7\u0092\2\2\u07d9\u07d8\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u07db"+
		"\3\2\2\2\u07db\u07ed\7\u00f8\2\2\u07dc\u07de\7\u0092\2\2\u07dd\u07dc\3"+
		"\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07ed\7\u00f9\2\2"+
		"\u07e0\u07e2\7\u0092\2\2\u07e1\u07e0\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2"+
		"\u07e3\3\2\2\2\u07e3\u07ed\7\u00fa\2\2\u07e4\u07e6\7\u0092\2\2\u07e5\u07e4"+
		"\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07ed\7\u00fd\2"+
		"\2\u07e8\u07ea\7\u0092\2\2\u07e9\u07e8\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea"+
		"\u07eb\3\2\2\2\u07eb\u07ed\7\u00fe\2\2\u07ec\u07d1\3\2\2\2\u07ec\u07d5"+
		"\3\2\2\2\u07ec\u07d9\3\2\2\2\u07ec\u07dd\3\2\2\2\u07ec\u07e1\3\2\2\2\u07ec"+
		"\u07e5\3\2\2\2\u07ec\u07e9\3\2\2\2\u07ed\u00e7\3\2\2\2\u07ee\u07ef\t\25"+
		"\2\2\u07ef\u00e9\3\2\2\2\u00fb\u00f3\u00f6\u0102\u0109\u010f\u0117\u011f"+
		"\u0128\u012e\u0137\u013e\u0147\u0151\u0160\u0165\u016c\u0178\u0181\u0188"+
		"\u019f\u01a3\u01aa\u021e\u0226\u022e\u0237\u0243\u0247\u024a\u0250\u025a"+
		"\u0266\u026b\u0271\u027d\u027f\u0284\u0288\u028d\u0292\u0295\u029a\u029e"+
		"\u02a3\u02a5\u02a9\u02b2\u02ba\u02c1\u02c8\u02d1\u02d6\u02e5\u02ec\u02ef"+
		"\u02f6\u02fa\u0300\u0308\u0313\u031e\u0325\u032b\u0331\u033a\u033c\u0345"+
		"\u0348\u0351\u0354\u035d\u0360\u0369\u036c\u036f\u0374\u0376\u0379\u0385"+
		"\u038c\u0393\u0396\u0398\u03a3\u03a7\u03ab\u03b7\u03ba\u03be\u03c8\u03cc"+
		"\u03ce\u03d1\u03d5\u03d8\u03dc\u03e2\u03e6\u03ea\u03ef\u03f2\u03f4\u03f9"+
		"\u03fe\u0401\u0405\u0408\u040a\u040f\u0414\u0421\u0426\u042e\u0434\u0438"+
		"\u0441\u0450\u0455\u0461\u0466\u046e\u0471\u0475\u0483\u0490\u0495\u0499"+
		"\u049c\u04a1\u04aa\u04ad\u04b2\u04b9\u04bc\u04c4\u04cb\u04d2\u04d5\u04da"+
		"\u04e0\u04e4\u04e7\u04ea\u04f5\u04fa\u04ff\u0504\u0516\u0518\u051b\u0526"+
		"\u052f\u0536\u053e\u0546\u054a\u0552\u055a\u0560\u0568\u0574\u0577\u057d"+
		"\u0581\u0583\u058c\u0598\u059a\u05a1\u05a8\u05ae\u05b4\u05b6\u05bb\u05c2"+
		"\u05c8\u05cc\u05ce\u05d5\u05e4\u05e6\u05ee\u05f0\u05f4\u05fc\u0605\u060b"+
		"\u0613\u0619\u061e\u0623\u0629\u063e\u0640\u0648\u064c\u0655\u0659\u066b"+
		"\u066e\u0676\u067f\u0696\u06a1\u06a8\u06ab\u06b0\u06c3\u06d4\u06de\u06e0"+
		"\u06ed\u06ef\u06fd\u0704\u0707\u070b\u0710\u0721\u0725\u072e\u0732\u0734"+
		"\u073b\u0742\u0749\u0751\u075e\u0772\u077c\u077f\u0788\u078b\u078d\u0790"+
		"\u0793\u07a5\u07ae\u07b5\u07c7\u07cc\u07d1\u07d5\u07d9\u07dd\u07e1\u07e5"+
		"\u07e9\u07ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}