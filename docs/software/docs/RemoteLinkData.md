

# RemoteLinkData

Data related to a single Remote Link. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | [**SchemaVersionEnum**](#SchemaVersionEnum) | The schema version used for this data.  Placeholder to support potential schema changes in the future.  |  [optional] |
|**id** | **String** | The identifier for the Remote Link. Must be unique for a given Provider.  |  |
|**updateSequenceNumber** | **Long** | An ID used to apply an ordering to updates for this Remote Link in the case of out-of-order receipt of update requests.  It must be a monotonically increasing number. For example, epoch time could be one way to generate the &#x60;updateSequenceNumber&#x60;.  Updates for a Remote Link that is received with an &#x60;updateSqeuenceNumber&#x60; less than or equal to what is currently stored will be ignored.  |  |
|**displayName** | **String** | The human-readable name for the Remote Link.  Will be shown in the UI.  |  |
|**url** | **URI** | The URL to this Remote Link in your system.  |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the Remote Link. The current supported types are &#39;document&#39;, &#39;alert&#39;, &#39;test&#39;, &#39;security&#39;, &#39;logFile&#39;, &#39;prototype&#39;, &#39;coverage&#39;, &#39;bugReport&#39; and &#39;other&#39;  |  |
|**description** | **String** | An optional description to attach to this Remote Link.  This may be anything that makes sense in your system.  |  [optional] |
|**lastUpdated** | **OffsetDateTime** | The last-updated timestamp to present to the user as a summary of when Remote Link was last updated.  |  |
|**associations** | [**List&lt;RemoteLinkDataAssociationsInner&gt;**](RemoteLinkDataAssociationsInner.md) | The entities to associate the Remote Link information with.  |  [optional] |
|**status** | [**RemoteLinkStatus**](RemoteLinkStatus.md) |  |  [optional] |
|**actionIds** | **List&lt;String&gt;** | Optional list of actionIds. They are associated with the actions the provider is able to provide when they registered. Indicates which actions this Remote Link has.  If any actions have a templateUrl that requires string substitution, then &#x60;attributeMap&#x60; must be passed in.  |  [optional] |
|**attributeMap** | **Map&lt;String, String&gt;** | Map of key/values (string to string mapping). This is used to build the urls for actions from the templateUrl the provider registered their available actions with.  |  [optional] |



## Enum: SchemaVersionEnum

| Name | Value |
|---- | -----|
| _1_0 | &quot;1.0&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DOCUMENT | &quot;document&quot; |
| ALERT | &quot;alert&quot; |
| TEST | &quot;test&quot; |
| SECURITY | &quot;security&quot; |
| LOG_FILE | &quot;logFile&quot; |
| PROTOTYPE | &quot;prototype&quot; |
| COVERAGE | &quot;coverage&quot; |
| BUG_REPORT | &quot;bugReport&quot; |
| OTHER | &quot;other&quot; |



