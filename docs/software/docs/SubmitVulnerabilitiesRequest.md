

# SubmitVulnerabilitiesRequest

The payload used to submit (update / insert) Vulnerability data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operationType** | [**OperationTypeEnum**](#OperationTypeEnum) | Indicates the operation being performed by the provider system when sending this data. \&quot;NORMAL\&quot; - Data received during real-time, user-triggered actions (e.g. user closed or updated a vulnerability). \&quot;SCAN\&quot; - Data sent through some automated process (e.g. some periodically scheduled repository scan). \&quot;BACKFILL\&quot; - Data received while backfilling existing data (e.g. pushing historical vulnerabilities when re-connect a workspace). Default is \&quot;NORMAL\&quot;. \&quot;NORMAL\&quot; traffic has higher priority but tighter rate limits, \&quot;SCAN\&quot; traffic has medium priority and looser limits, \&quot;BACKFILL\&quot; has lower priority and much looser limits  |  [optional] |
|**properties** | **Map&lt;String, String&gt;** | Properties assigned to vulnerability data that can then be used for delete / query operations.  Examples might be an account or user ID that can then be used to clean up data if an account is removed from the Provider system.  Properties are supplied as key/value pairs, and a maximum of 5 properties can be supplied, keys cannot contain &#39;:&#39; or start with &#39;_&#39;.  |  [optional] |
|**vulnerabilities** | [**List&lt;VulnerabilityDetails&gt;**](VulnerabilityDetails.md) |  |  |
|**providerMetadata** | [**ProviderMetadata5**](ProviderMetadata5.md) |  |  [optional] |



## Enum: OperationTypeEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| SCAN | &quot;SCAN&quot; |
| BACKFILL | &quot;BACKFILL&quot; |



