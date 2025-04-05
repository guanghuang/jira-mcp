

# WorkflowCompoundCondition

A compound workflow transition rule condition. This object returns `nodeType` as `compound`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditions** | [**List&lt;WorkflowCondition&gt;**](WorkflowCondition.md) | The list of workflow conditions. |  |
|**nodeType** | **String** |  |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The compound condition operator. |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



