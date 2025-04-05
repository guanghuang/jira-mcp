

# JqlQueryClauseOperand

Details of an operand in a JQL clause.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encodedOperand** | **String** | Encoded operand, which can be used directly in a JQL query. |  [optional] |
|**values** | [**List&lt;JqlQueryUnitaryOperand&gt;**](JqlQueryUnitaryOperand.md) | The list of operand values. |  |
|**encodedValue** | **String** | Encoded value, which can be used directly in a JQL query. |  [optional] |
|**value** | **String** | The operand value. |  |
|**arguments** | **List&lt;String&gt;** | The list of function arguments. |  |
|**function** | **String** | The name of the function. |  |
|**keyword** | [**KeywordEnum**](#KeywordEnum) | The keyword that is the operand value. |  |



## Enum: KeywordEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;empty&quot; |



