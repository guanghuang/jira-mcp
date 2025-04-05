

# WorkflowCondition

The workflow transition rule conditions tree.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_configuration** | **Object** | EXPERIMENTAL. The configuration of the transition rule. |  [optional] |
|**nodeType** | **String** |  |  |
|**type** | **String** | The type of the transition rule. |  |
|**conditions** | [**List&lt;WorkflowCondition&gt;**](WorkflowCondition.md) | The list of workflow conditions. |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The compound condition operator. |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



