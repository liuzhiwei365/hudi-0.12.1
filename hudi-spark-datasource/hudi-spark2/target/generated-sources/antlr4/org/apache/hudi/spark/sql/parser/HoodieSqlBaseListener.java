// Generated from org/apache/hudi/spark/sql/parser/HoodieSqlBase.g4 by ANTLR 4.7
package org.apache.hudi.spark.sql.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HoodieSqlBaseParser}.
 */
public interface HoodieSqlBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(HoodieSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(HoodieSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link HoodieSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMergeIntoTable(HoodieSqlBaseParser.MergeIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link HoodieSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMergeIntoTable(HoodieSqlBaseParser.MergeIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link HoodieSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateTable(HoodieSqlBaseParser.UpdateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link HoodieSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateTable(HoodieSqlBaseParser.UpdateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteTable}
	 * labeled alternative in {@link HoodieSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteTable(HoodieSqlBaseParser.DeleteTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteTable}
	 * labeled alternative in {@link HoodieSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteTable(HoodieSqlBaseParser.DeleteTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passThrough}
	 * labeled alternative in {@link HoodieSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPassThrough(HoodieSqlBaseParser.PassThroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passThrough}
	 * labeled alternative in {@link HoodieSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPassThrough(HoodieSqlBaseParser.PassThroughContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#mergeInto}.
	 * @param ctx the parse tree
	 */
	void enterMergeInto(HoodieSqlBaseParser.MergeIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#mergeInto}.
	 * @param ctx the parse tree
	 */
	void exitMergeInto(HoodieSqlBaseParser.MergeIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#mergeCondition}.
	 * @param ctx the parse tree
	 */
	void enterMergeCondition(HoodieSqlBaseParser.MergeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#mergeCondition}.
	 * @param ctx the parse tree
	 */
	void exitMergeCondition(HoodieSqlBaseParser.MergeConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#matchedClauses}.
	 * @param ctx the parse tree
	 */
	void enterMatchedClauses(HoodieSqlBaseParser.MatchedClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#matchedClauses}.
	 * @param ctx the parse tree
	 */
	void exitMatchedClauses(HoodieSqlBaseParser.MatchedClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedClause(HoodieSqlBaseParser.NotMatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedClause(HoodieSqlBaseParser.NotMatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#deleteClause}.
	 * @param ctx the parse tree
	 */
	void enterDeleteClause(HoodieSqlBaseParser.DeleteClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#deleteClause}.
	 * @param ctx the parse tree
	 */
	void exitDeleteClause(HoodieSqlBaseParser.DeleteClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#updateClause}.
	 * @param ctx the parse tree
	 */
	void enterUpdateClause(HoodieSqlBaseParser.UpdateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#updateClause}.
	 * @param ctx the parse tree
	 */
	void exitUpdateClause(HoodieSqlBaseParser.UpdateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#insertClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertClause(HoodieSqlBaseParser.InsertClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#insertClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertClause(HoodieSqlBaseParser.InsertClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#deleteAction}.
	 * @param ctx the parse tree
	 */
	void enterDeleteAction(HoodieSqlBaseParser.DeleteActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#deleteAction}.
	 * @param ctx the parse tree
	 */
	void exitDeleteAction(HoodieSqlBaseParser.DeleteActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#updateAction}.
	 * @param ctx the parse tree
	 */
	void enterUpdateAction(HoodieSqlBaseParser.UpdateActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#updateAction}.
	 * @param ctx the parse tree
	 */
	void exitUpdateAction(HoodieSqlBaseParser.UpdateActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#insertAction}.
	 * @param ctx the parse tree
	 */
	void enterInsertAction(HoodieSqlBaseParser.InsertActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#insertAction}.
	 * @param ctx the parse tree
	 */
	void exitInsertAction(HoodieSqlBaseParser.InsertActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(HoodieSqlBaseParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(HoodieSqlBaseParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(HoodieSqlBaseParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(HoodieSqlBaseParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(HoodieSqlBaseParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(HoodieSqlBaseParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#updateTableStmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdateTableStmt(HoodieSqlBaseParser.UpdateTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#updateTableStmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdateTableStmt(HoodieSqlBaseParser.UpdateTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#deleteTableStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteTableStmt(HoodieSqlBaseParser.DeleteTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#deleteTableStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteTableStmt(HoodieSqlBaseParser.DeleteTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(HoodieSqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(HoodieSqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableIdentifier(HoodieSqlBaseParser.SingleTableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableIdentifier(HoodieSqlBaseParser.SingleTableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleFunctionIdentifier(HoodieSqlBaseParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleFunctionIdentifier(HoodieSqlBaseParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void enterSingleDataType(HoodieSqlBaseParser.SingleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void exitSingleDataType(HoodieSqlBaseParser.SingleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableSchema(HoodieSqlBaseParser.SingleTableSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableSchema(HoodieSqlBaseParser.SingleTableSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(HoodieSqlBaseParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(HoodieSqlBaseParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(HoodieSqlBaseParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(HoodieSqlBaseParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(HoodieSqlBaseParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(HoodieSqlBaseParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(HoodieSqlBaseParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(HoodieSqlBaseParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(HoodieSqlBaseParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(HoodieSqlBaseParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(HoodieSqlBaseParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(HoodieSqlBaseParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link HoodieSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteTable(HoodieSqlBaseParser.InsertOverwriteTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link HoodieSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteTable(HoodieSqlBaseParser.InsertOverwriteTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link HoodieSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoTable(HoodieSqlBaseParser.InsertIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link HoodieSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoTable(HoodieSqlBaseParser.InsertIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link HoodieSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteHiveDir(HoodieSqlBaseParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link HoodieSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteHiveDir(HoodieSqlBaseParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link HoodieSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteDir(HoodieSqlBaseParser.InsertOverwriteDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link HoodieSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteDir(HoodieSqlBaseParser.InsertOverwriteDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(HoodieSqlBaseParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(HoodieSqlBaseParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(HoodieSqlBaseParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(HoodieSqlBaseParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(HoodieSqlBaseParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(HoodieSqlBaseParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(HoodieSqlBaseParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(HoodieSqlBaseParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(HoodieSqlBaseParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(HoodieSqlBaseParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(HoodieSqlBaseParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(HoodieSqlBaseParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(HoodieSqlBaseParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(HoodieSqlBaseParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(HoodieSqlBaseParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(HoodieSqlBaseParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(HoodieSqlBaseParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(HoodieSqlBaseParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(HoodieSqlBaseParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(HoodieSqlBaseParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(HoodieSqlBaseParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(HoodieSqlBaseParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(HoodieSqlBaseParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(HoodieSqlBaseParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(HoodieSqlBaseParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(HoodieSqlBaseParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(HoodieSqlBaseParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(HoodieSqlBaseParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(HoodieSqlBaseParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(HoodieSqlBaseParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link HoodieSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(HoodieSqlBaseParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link HoodieSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(HoodieSqlBaseParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link HoodieSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(HoodieSqlBaseParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link HoodieSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(HoodieSqlBaseParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(HoodieSqlBaseParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(HoodieSqlBaseParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(HoodieSqlBaseParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(HoodieSqlBaseParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(HoodieSqlBaseParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(HoodieSqlBaseParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(HoodieSqlBaseParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(HoodieSqlBaseParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(HoodieSqlBaseParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(HoodieSqlBaseParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(HoodieSqlBaseParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(HoodieSqlBaseParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(HoodieSqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(HoodieSqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(HoodieSqlBaseParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(HoodieSqlBaseParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(HoodieSqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(HoodieSqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(HoodieSqlBaseParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(HoodieSqlBaseParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(HoodieSqlBaseParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(HoodieSqlBaseParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(HoodieSqlBaseParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link HoodieSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(HoodieSqlBaseParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(HoodieSqlBaseParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(HoodieSqlBaseParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(HoodieSqlBaseParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(HoodieSqlBaseParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(HoodieSqlBaseParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(HoodieSqlBaseParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void enterHintStatement(HoodieSqlBaseParser.HintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void exitHintStatement(HoodieSqlBaseParser.HintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(HoodieSqlBaseParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(HoodieSqlBaseParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(HoodieSqlBaseParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(HoodieSqlBaseParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(HoodieSqlBaseParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(HoodieSqlBaseParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void enterPivotClause(HoodieSqlBaseParser.PivotClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void exitPivotClause(HoodieSqlBaseParser.PivotClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void enterPivotColumn(HoodieSqlBaseParser.PivotColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void exitPivotColumn(HoodieSqlBaseParser.PivotColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void enterPivotValue(HoodieSqlBaseParser.PivotValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void exitPivotValue(HoodieSqlBaseParser.PivotValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(HoodieSqlBaseParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(HoodieSqlBaseParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(HoodieSqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(HoodieSqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(HoodieSqlBaseParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(HoodieSqlBaseParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(HoodieSqlBaseParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(HoodieSqlBaseParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(HoodieSqlBaseParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(HoodieSqlBaseParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(HoodieSqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(HoodieSqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(HoodieSqlBaseParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(HoodieSqlBaseParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link HoodieSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByPercentile(HoodieSqlBaseParser.SampleByPercentileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link HoodieSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByPercentile(HoodieSqlBaseParser.SampleByPercentileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link HoodieSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByRows(HoodieSqlBaseParser.SampleByRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link HoodieSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByRows(HoodieSqlBaseParser.SampleByRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link HoodieSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBucket(HoodieSqlBaseParser.SampleByBucketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link HoodieSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBucket(HoodieSqlBaseParser.SampleByBucketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link HoodieSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBytes(HoodieSqlBaseParser.SampleByBytesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link HoodieSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBytes(HoodieSqlBaseParser.SampleByBytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(HoodieSqlBaseParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(HoodieSqlBaseParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(HoodieSqlBaseParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(HoodieSqlBaseParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(HoodieSqlBaseParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(HoodieSqlBaseParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(HoodieSqlBaseParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(HoodieSqlBaseParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(HoodieSqlBaseParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(HoodieSqlBaseParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(HoodieSqlBaseParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(HoodieSqlBaseParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link HoodieSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(HoodieSqlBaseParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link HoodieSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(HoodieSqlBaseParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link HoodieSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(HoodieSqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link HoodieSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(HoodieSqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link HoodieSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(HoodieSqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link HoodieSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(HoodieSqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link HoodieSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(HoodieSqlBaseParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link HoodieSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(HoodieSqlBaseParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link HoodieSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableValuedFunction(HoodieSqlBaseParser.TableValuedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link HoodieSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableValuedFunction(HoodieSqlBaseParser.TableValuedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(HoodieSqlBaseParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(HoodieSqlBaseParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTable(HoodieSqlBaseParser.FunctionTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTable(HoodieSqlBaseParser.FunctionTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(HoodieSqlBaseParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(HoodieSqlBaseParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link HoodieSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(HoodieSqlBaseParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link HoodieSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(HoodieSqlBaseParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link HoodieSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(HoodieSqlBaseParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link HoodieSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(HoodieSqlBaseParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(HoodieSqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(HoodieSqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(HoodieSqlBaseParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(HoodieSqlBaseParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(HoodieSqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(HoodieSqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(HoodieSqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(HoodieSqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HoodieSqlBaseParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HoodieSqlBaseParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link HoodieSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(HoodieSqlBaseParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link HoodieSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(HoodieSqlBaseParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link HoodieSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(HoodieSqlBaseParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link HoodieSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(HoodieSqlBaseParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link HoodieSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(HoodieSqlBaseParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link HoodieSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(HoodieSqlBaseParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link HoodieSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(HoodieSqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link HoodieSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(HoodieSqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(HoodieSqlBaseParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(HoodieSqlBaseParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link HoodieSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(HoodieSqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link HoodieSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(HoodieSqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link HoodieSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(HoodieSqlBaseParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link HoodieSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(HoodieSqlBaseParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link HoodieSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(HoodieSqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link HoodieSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(HoodieSqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link HoodieSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(HoodieSqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link HoodieSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(HoodieSqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code struct}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStruct(HoodieSqlBaseParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStruct(HoodieSqlBaseParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(HoodieSqlBaseParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(HoodieSqlBaseParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(HoodieSqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(HoodieSqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(HoodieSqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(HoodieSqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(HoodieSqlBaseParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(HoodieSqlBaseParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(HoodieSqlBaseParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(HoodieSqlBaseParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(HoodieSqlBaseParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(HoodieSqlBaseParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(HoodieSqlBaseParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(HoodieSqlBaseParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(HoodieSqlBaseParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(HoodieSqlBaseParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(HoodieSqlBaseParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(HoodieSqlBaseParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(HoodieSqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(HoodieSqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambda(HoodieSqlBaseParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambda(HoodieSqlBaseParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(HoodieSqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(HoodieSqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtract(HoodieSqlBaseParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtract(HoodieSqlBaseParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(HoodieSqlBaseParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(HoodieSqlBaseParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(HoodieSqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(HoodieSqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(HoodieSqlBaseParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(HoodieSqlBaseParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(HoodieSqlBaseParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link HoodieSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(HoodieSqlBaseParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(HoodieSqlBaseParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(HoodieSqlBaseParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(HoodieSqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(HoodieSqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link HoodieSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(HoodieSqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link HoodieSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(HoodieSqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(HoodieSqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(HoodieSqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(HoodieSqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(HoodieSqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(HoodieSqlBaseParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(HoodieSqlBaseParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(HoodieSqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(HoodieSqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(HoodieSqlBaseParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(HoodieSqlBaseParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(HoodieSqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(HoodieSqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(HoodieSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(HoodieSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(HoodieSqlBaseParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(HoodieSqlBaseParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(HoodieSqlBaseParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(HoodieSqlBaseParser.IntervalFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(HoodieSqlBaseParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(HoodieSqlBaseParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void enterColPosition(HoodieSqlBaseParser.ColPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void exitColPosition(HoodieSqlBaseParser.ColPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link HoodieSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(HoodieSqlBaseParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link HoodieSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(HoodieSqlBaseParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link HoodieSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(HoodieSqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link HoodieSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(HoodieSqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(HoodieSqlBaseParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(HoodieSqlBaseParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(HoodieSqlBaseParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(HoodieSqlBaseParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterComplexColTypeList(HoodieSqlBaseParser.ComplexColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitComplexColTypeList(HoodieSqlBaseParser.ComplexColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void enterComplexColType(HoodieSqlBaseParser.ComplexColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void exitComplexColType(HoodieSqlBaseParser.ComplexColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(HoodieSqlBaseParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(HoodieSqlBaseParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#windows}.
	 * @param ctx the parse tree
	 */
	void enterWindows(HoodieSqlBaseParser.WindowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#windows}.
	 * @param ctx the parse tree
	 */
	void exitWindows(HoodieSqlBaseParser.WindowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(HoodieSqlBaseParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(HoodieSqlBaseParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link HoodieSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(HoodieSqlBaseParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link HoodieSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(HoodieSqlBaseParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link HoodieSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(HoodieSqlBaseParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link HoodieSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(HoodieSqlBaseParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(HoodieSqlBaseParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(HoodieSqlBaseParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(HoodieSqlBaseParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(HoodieSqlBaseParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(HoodieSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(HoodieSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(HoodieSqlBaseParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(HoodieSqlBaseParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link HoodieSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(HoodieSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link HoodieSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(HoodieSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link HoodieSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(HoodieSqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link HoodieSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(HoodieSqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(HoodieSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(HoodieSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(HoodieSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(HoodieSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(HoodieSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(HoodieSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(HoodieSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(HoodieSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(HoodieSqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(HoodieSqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(HoodieSqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(HoodieSqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(HoodieSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(HoodieSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(HoodieSqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link HoodieSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(HoodieSqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoodieSqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(HoodieSqlBaseParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoodieSqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(HoodieSqlBaseParser.NonReservedContext ctx);
}