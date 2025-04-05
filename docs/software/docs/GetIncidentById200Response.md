

# GetIncidentById200Response

Data related to a specific incident in a specific container that the incident is present in. Must specify at least one association to a component. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | [**SchemaVersionEnum**](#SchemaVersionEnum) | The IncidentData schema version used for this incident data.  Placeholder to support potential schema changes in the future.  |  |
|**id** | **String** | The identifier for the Incident. Must be unique for a given Provider.  |  |
|**updateSequenceNumber** | **Long** | An ID used to apply an ordering to updates for this Incident in the case of out-of-order receipt of update requests.  This can be any monotonically increasing number. A suggested implementation is to use epoch millis from the Provider system, but other alternatives are valid (e.g. a Provider could store a counter against each Incident and increment that on each update to Jira).  Updates for a Incident that are received with an updateSqeuenceId lower than what is currently stored will be ignored.  |  |
|**affectedComponents** | **List&lt;String&gt;** | The IDs of the Components impacted by this Incident. Must be unique for a given Provider.  |  |
|**summary** | **String** | The human-readable summary for the Incident. Will be shown in the UI.  If not provided, will use the ID for display.  |  |
|**description** | **String** | A description of the issue in Markdown format. Will be shown in the UI and used when creating Jira Issues.  |  |
|**url** | **URI** | A URL users can use to link to a summary view of this incident, if appropriate.  This could be any location that makes sense in the Provider system (e.g. if the summary information comes from a specific project, it might make sense to link the user to the incident in that project).  |  |
|**createdDate** | **OffsetDateTime** | The timestamp to present to the user that shows when the Incident was raised.  Expected format is an RFC3339 formatted string.  |  |
|**lastUpdated** | **OffsetDateTime** | The last-updated timestamp to present to the user the last time the Incident was updated.  Expected format is an RFC3339 formatted string.  |  |
|**severity** | [**IncidentSeverity**](IncidentSeverity.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the Incident.  |  |
|**associations** | [**List&lt;Associations&gt;**](Associations.md) | The IDs of the Jira issues related to this Incident. Must be unique for a given Provider.  |  [optional] |



## Enum: SchemaVersionEnum

| Name | Value |
|---- | -----|
| _1_0 | &quot;1.0&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| RESOLVED | &quot;resolved&quot; |
| UNKNOWN | &quot;unknown&quot; |



