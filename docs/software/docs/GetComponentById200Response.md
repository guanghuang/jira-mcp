

# GetComponentById200Response

Data related to a specific component in a specific workspace that is affected by incidents. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | [**SchemaVersionEnum**](#SchemaVersionEnum) | The DevOpsComponentData schema version used for this devops component data.  Placeholder to support potential schema changes in the future.  |  |
|**id** | **String** | The identifier for the DevOps Component. Must be unique for a given Provider.  |  |
|**updateSequenceNumber** | **Long** | An ID used to apply an ordering to updates for this DevOps Component in the case of out-of-order receipt of update requests.  This can be any monotonically increasing number. A suggested implementation is to use epoch millis from the Provider system, but other alternatives are valid (e.g. a Provider could store a counter against each DevOps Component and increment that on each update to Jira).  Updates for a DevOps Component that are received with an updateSqeuenceId lower than what is currently stored will be ignored.  |  |
|**name** | **String** | The human-readable name for the DevOps Component. Will be shown in the UI.  |  |
|**providerName** | **String** | The human-readable name for the Provider that owns this DevOps Component. Will be shown in the UI.  |  [optional] |
|**description** | **String** | A description of the DevOps Component in Markdown format. Will be shown in the UI.  |  |
|**url** | **URI** | A URL users can use to link to a summary view of this devops component, if appropriate.  This could be any location that makes sense in the Provider system (e.g. if the summary information comes from a specific project, it might make sense to link the user to the component in that project).  |  |
|**avatarUrl** | **URI** | A URL to display a logo representing this devops component, if available.  |  |
|**tier** | [**TierEnum**](#TierEnum) | The tier of the component. Will be shown in the UI.  |  |
|**componentType** | [**ComponentTypeEnum**](#ComponentTypeEnum) | The type of the component. Will be shown in the UI.  |  |
|**lastUpdated** | **OffsetDateTime** | The last-updated timestamp to present to the user the last time the DevOps Component was updated.  Expected format is an RFC3339 formatted string.  |  |



## Enum: SchemaVersionEnum

| Name | Value |
|---- | -----|
| _1_0 | &quot;1.0&quot; |



## Enum: TierEnum

| Name | Value |
|---- | -----|
| TIER_1 | &quot;Tier 1&quot; |
| TIER_2 | &quot;Tier 2&quot; |
| TIER_3 | &quot;Tier 3&quot; |
| TIER_4 | &quot;Tier 4&quot; |



## Enum: ComponentTypeEnum

| Name | Value |
|---- | -----|
| SERVICE | &quot;Service&quot; |
| APPLICATION | &quot;Application&quot; |
| LIBRARY | &quot;Library&quot; |
| CAPABILITY | &quot;Capability&quot; |
| CLOUD_RESOURCE | &quot;Cloud resource&quot; |
| DATA_PIPELINE | &quot;Data pipeline&quot; |
| MACHINE_LEARNING_MODEL | &quot;Machine learning model&quot; |
| UI_ELEMENT | &quot;UI element&quot; |
| WEBSITE | &quot;Website&quot; |
| OTHER | &quot;Other&quot; |



