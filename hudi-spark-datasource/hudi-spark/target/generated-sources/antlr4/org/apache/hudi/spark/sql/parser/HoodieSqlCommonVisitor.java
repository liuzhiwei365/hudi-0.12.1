// Generated from org/apache/hudi/spark/sql/parser/HoodieSqlCommon.g4 by ANTLR 4.7
package org.apache.hudi.spark.sql.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HoodieSqlCommonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HoodieSqlCommonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HoodieSqlCommonParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(HoodieSqlCommonParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compactionCommand}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompactionCommand(HoodieSqlCommonParser.CompactionCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(HoodieSqlCommonParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createIndex}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(HoodieSqlCommonParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropIndex}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(HoodieSqlCommonParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowIndexes(HoodieSqlCommonParser.ShowIndexesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshIndex}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshIndex(HoodieSqlCommonParser.RefreshIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passThrough}
	 * labeled alternative in {@link HoodieSqlCommonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassThrough(HoodieSqlCommonParser.PassThroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compactionOnTable}
	 * labeled alternative in {@link HoodieSqlCommonParser#compactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompactionOnTable(HoodieSqlCommonParser.CompactionOnTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compactionOnPath}
	 * labeled alternative in {@link HoodieSqlCommonParser#compactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompactionOnPath(HoodieSqlCommonParser.CompactionOnPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCompactionOnTable}
	 * labeled alternative in {@link HoodieSqlCommonParser#compactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCompactionOnTable(HoodieSqlCommonParser.ShowCompactionOnTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCompactionOnPath}
	 * labeled alternative in {@link HoodieSqlCommonParser#compactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCompactionOnPath(HoodieSqlCommonParser.ShowCompactionOnPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link HoodieSqlCommonParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(HoodieSqlCommonParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positionalArgument}
	 * labeled alternative in {@link HoodieSqlCommonParser#callArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArgument(HoodieSqlCommonParser.PositionalArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedArgument}
	 * labeled alternative in {@link HoodieSqlCommonParser#callArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(HoodieSqlCommonParser.NamedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HoodieSqlCommonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HoodieSqlCommonParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(HoodieSqlCommonParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(HoodieSqlCommonParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(HoodieSqlCommonParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link HoodieSqlCommonParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(HoodieSqlCommonParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HoodieSqlCommonParser#stringMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringMap(HoodieSqlCommonParser.StringMapContext ctx);
	/**
	 * Visit a parse tree produced by {@link HoodieSqlCommonParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(HoodieSqlCommonParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentLiteral(HoodieSqlCommonParser.ExponentLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(HoodieSqlCommonParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(HoodieSqlCommonParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(HoodieSqlCommonParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(HoodieSqlCommonParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(HoodieSqlCommonParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(HoodieSqlCommonParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(HoodieSqlCommonParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link HoodieSqlCommonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigDecimalLiteral(HoodieSqlCommonParser.BigDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HoodieSqlCommonParser#multipartIdentifierPropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifierPropertyList(HoodieSqlCommonParser.MultipartIdentifierPropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HoodieSqlCommonParser#multipartIdentifierProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifierProperty(HoodieSqlCommonParser.MultipartIdentifierPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HoodieSqlCommonParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifier(HoodieSqlCommonParser.MultipartIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link HoodieSqlCommonParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(HoodieSqlCommonParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link HoodieSqlCommonParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(HoodieSqlCommonParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HoodieSqlCommonParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(HoodieSqlCommonParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HoodieSqlCommonParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(HoodieSqlCommonParser.NonReservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HoodieSqlCommonParser#propertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyList(HoodieSqlCommonParser.PropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HoodieSqlCommonParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(HoodieSqlCommonParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HoodieSqlCommonParser#propertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyKey(HoodieSqlCommonParser.PropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HoodieSqlCommonParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyValue(HoodieSqlCommonParser.PropertyValueContext ctx);
}