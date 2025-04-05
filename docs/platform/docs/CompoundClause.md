

# CompoundClause

A JQL query clause that consists of nested clauses. For example, `(labels in (urgent, blocker) OR lastCommentedBy = currentUser()). Note that, where nesting is not defined, the parser nests JQL clauses based on the operator precedence. For example, \"A OR B AND C\" is parsed as \"(A OR B) AND C\". See Setting the precedence of operators for more information about precedence in JQL queries.`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clauses** | [**List&lt;JqlQueryClause&gt;**](JqlQueryClause.md) | The list of nested clauses. |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The operator between the clauses. |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| AND | &quot;and&quot; |
| OR | &quot;or&quot; |
| NOT | &quot;not&quot; |



