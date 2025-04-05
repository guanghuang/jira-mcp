

# SubmitRemoteLinksRequest

The payload used to submit (update / insert) Remote Link data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**properties** | **Map&lt;String, String&gt;** | Properties assigned to Remote Link data that can then be used for delete / query operations.  Examples might be an account or user ID that can then be used to clean up data if an account is removed from the Provider system.  Properties are supplied as key/value pairs, a maximum of 5 properties can be supplied, and keys must not contain &#39;:&#39; or start with &#39;_&#39;.  |  [optional] |
|**remoteLinks** | [**List&lt;RemoteLinkData&gt;**](RemoteLinkData.md) | A list of Remote Links to submit to Jira.  Each Remote Link may be associated with one or more Jira issue keys, and will be associated with any properties included in this request.  |  |
|**providerMetadata** | [**ProviderMetadata4**](ProviderMetadata4.md) |  |  [optional] |



