// Generated from org/apache/hudi/spark/sql/parser/HoodieSqlCommon.g4 by ANTLR 4.7
package org.apache.hudi.spark.sql.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HoodieSqlCommonParser}.
 */
public interface HoodieSqlCommonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HoodieSqlCommonParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(HoodieSqlCommonParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlCommonParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(HoodieSqlCommonParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compactionCommand}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompactionCommand(HoodieSqlCommonParser.CompactionCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compactionCommand}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompactionCommand(HoodieSqlCommonParser.CompactionCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCall(HoodieSqlCommonParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCall(HoodieSqlCommonParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createIndex}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(HoodieSqlCommonParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createIndex}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(HoodieSqlCommonParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropIndex}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(HoodieSqlCommonParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropIndex}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(HoodieSqlCommonParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowIndexes(HoodieSqlCommonParser.ShowIndexesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowIndexes(HoodieSqlCommonParser.ShowIndexesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshIndex}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshIndex(HoodieSqlCommonParser.RefreshIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshIndex}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshIndex(HoodieSqlCommonParser.RefreshIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passThrough}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPassThrough(HoodieSqlCommonParser.PassThroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passThrough}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPassThrough(HoodieSqlCommonParser.PassThroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compactionOnTable}
	 * labeled alternative in {@link HoodieSqlCommonParser#compactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompactionOnTable(HoodieSqlCommonParser.CompactionOnTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compactionOnTable}
	 * labeled alternative in {@link HoodieSqlCommonParser#compactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompactionOnTable(HoodieSqlCommonParser.CompactionOnTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compactionOnPath}
	 * labeled alternative in {@link HoodieSqlCommonParser#compactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompactionOnPath(HoodieSqlCommonParser.CompactionOnPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compactionOnPath}
	 * labeled alternative in {@link HoodieSqlCommonParser#compactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompactionOnPath(HoodieSqlCommonParser.CompactionOnPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCompactionOnTable}
	 * labeled alternative in {@link HoodieSqlCommonParser#compactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCompactionOnTable(HoodieSqlCommonParser.ShowCompactionOnTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCompactionOnTable}
	 * labeled alternative in {@link HoodieSqlCommonParser#compactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCompactionOnTable(HoodieSqlCommonParser.ShowCompactionOnTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCompactionOnPath}
	 * labeled alternative in {@link HoodieSqlCommonParser#compactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCompactionOnPath(HoodieSqlCommonParser.ShowCompactionOnPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCompactionOnPath}
	 * labeled alternative in {@link HoodieSqlCommonParser#compactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCompactionOnPath(HoodieSqlCommonParser.ShowCompactionOnPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlCommonParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(HoodieSqlCommonParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlCommonParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(HoodieSqlCommonParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positionalArgument}
	 * labeled alternative in {@link HoodieSqlCommonParser#callArgument}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArgument(HoodieSqlCommonParser.PositionalArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positionalArgument}
	 * labeled alternative in {@link HoodieSqlCommonParser#callArgument}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArgument(HoodieSqlCommonParser.PositionalArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedArgument}
	 * labeled alternative in {@link HoodieSqlCommonParser#callArgument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(HoodieSqlCommonParser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedArgument}
	 * labeled alternative in {@link HoodieSqlCommonParser#callArgument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(HoodieSqlCommonParser.NamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlCommonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HoodieSqlCommonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlCommonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HoodieSqlCommonParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(HoodieSqlCommonParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(HoodieSqlCommonParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(HoodieSqlCommonParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(HoodieSqlCommonParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(HoodieSqlCommonParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(HoodieSqlCommonParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link HoodieSqlCommonParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(HoodieSqlCommonParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link HoodieSqlCommonParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(HoodieSqlCommonParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlCommonParser#stringMap}.
	 * @param ctx the parse tree
	 */
	void enterStringMap(HoodieSqlCommonParser.StringMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlCommonParser#stringMap}.
	 * @param ctx the parse tree
	 */
	void exitStringMap(HoodieSqlCommonParser.StringMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlCommonParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(HoodieSqlCommonParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlCommonParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(HoodieSqlCommonParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterExponentLiteral(HoodieSqlCommonParser.ExponentLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitExponentLiteral(HoodieSqlCommonParser.ExponentLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(HoodieSqlCommonParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(HoodieSqlCommonParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(HoodieSqlCommonParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(HoodieSqlCommonParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(HoodieSqlCommonParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(HoodieSqlCommonParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(HoodieSqlCommonParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(HoodieSqlCommonParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(HoodieSqlCommonParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(HoodieSqlCommonParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(HoodieSqlCommonParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(HoodieSqlCommonParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(HoodieSqlCommonParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(HoodieSqlCommonParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(HoodieSqlCommonParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(HoodieSqlCommonParser.BigDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlCommonParser#multipartIdentifierPropertyList}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifierPropertyList(HoodieSqlCommonParser.MultipartIdentifierPropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlCommonParser#multipartIdentifierPropertyList}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifierPropertyList(HoodieSqlCommonParser.MultipartIdentifierPropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlCommonParser#multipartIdentifierProperty}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifierProperty(HoodieSqlCommonParser.MultipartIdentifierPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlCommonParser#multipartIdentifierProperty}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifierProperty(HoodieSqlCommonParser.MultipartIdentifierPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlCommonParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifier(HoodieSqlCommonParser.MultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlCommonParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifier(HoodieSqlCommonParser.MultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link HoodieSqlCommonParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(HoodieSqlCommonParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link HoodieSqlCommonParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(HoodieSqlCommonParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link HoodieSqlCommonParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(HoodieSqlCommonParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link HoodieSqlCommonParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(HoodieSqlCommonParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlCommonParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(HoodieSqlCommonParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlCommonParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(HoodieSqlCommonParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlCommonParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(HoodieSqlCommonParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlCommonParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(HoodieSqlCommonParser.NonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlCommonParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(HoodieSqlCommonParser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlCommonParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(HoodieSqlCommonParser.PropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlCommonParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(HoodieSqlCommonParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlCommonParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(HoodieSqlCommonParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlCommonParser#propertyKey}.
	 * @param ctx the parse tree
	 */
	void enterPropertyKey(HoodieSqlCommonParser.PropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlCommonParser#propertyKey}.
	 * @param ctx the parse tree
	 */
	void exitPropertyKey(HoodieSqlCommonParser.PropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlCommonParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValue(HoodieSqlCommonParser.PropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlCommonParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValue(HoodieSqlCommonParser.PropertyValueContext ctx);
}