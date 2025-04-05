

# JqlQueryClause

A JQL query clause.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clauses** | [**List&lt;JqlQueryClause&gt;**](JqlQueryClause.md) | The list of nested clauses. |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The operator applied to the field. |  |
|**field** | [**JqlQueryField**](JqlQueryField.md) |  |  |
|**operand** | [**JqlQueryClauseOperand**](JqlQueryClauseOperand.md) |  |  |
|**predicates** | [**List&lt;JqlQueryClauseTimePredicate&gt;**](JqlQueryClauseTimePredicate.md) | The list of time predicates. |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| CHANGED | &quot;changed&quot; |



