

# FeatureFlagData

Data related to a single Feature Flag, across any Environment that the flag is present in. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | [**SchemaVersionEnum**](#SchemaVersionEnum) | The FeatureFlagData schema version used for this flag data.   Placeholder to support potential schema changes in the future.  |  [optional] |
|**id** | **String** | The identifier for the Feature Flag. Must be unique for a given Provider.  |  |
|**key** | **String** | The identifier that users would use to reference the Feature Flag in their source code etc.  Will be made available via the UI for users to copy into their source code etc.  |  |
|**updateSequenceId** | **Long** | An ID used to apply an ordering to updates for this Feature Flag in the case of out-of-order receipt of update requests.  This can be any monotonically increasing number. A suggested implementation is to use epoch millis from the Provider system, but other alternatives are valid (e.g. a Provider could store a counter against each Feature Flag and increment that on each update to Jira).  Updates for a Feature Flag that are received with an updateSqeuenceId lower than what is currently stored will be ignored.  |  |
|**displayName** | **String** | The human-readable name for the Feature Flag. Will be shown in the UI.  If not provided, will use the ID for display.  |  [optional] |
|**issueKeys** | **List&lt;String&gt;** | The Jira issue keys to associate the Feature Flag information with.  |  |
|**summary** | [**FeatureFlagSummary**](FeatureFlagSummary.md) |  |  |
|**details** | [**List&lt;FeatureFlagDetails&gt;**](FeatureFlagDetails.md) | Detail information for this Feature Flag.  This may be information for each environment the Feature Flag is defined in or a selection of environments made by the user, as appropriate.  |  |



## Enum: SchemaVersionEnum

| Name | Value |
|---- | -----|
| _1_0 | &quot;1.0&quot; |



