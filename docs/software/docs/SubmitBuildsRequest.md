

# SubmitBuildsRequest

The payload used to submit (update / insert) build data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**properties** | **Map&lt;String, String&gt;** | Properties assigned to build data that can then be used for delete / query operations.  Examples might be an account or user ID that can then be used to clean up data if an account is removed from the Provider system.  Note that these properties will never be returned with build data. They are not intended for use as metadata to associate with a build. Internally they are stored as a hash so that personal information etc. is never stored within Jira.  Properties are supplied as key/value pairs, a maximum of 5 properties can be supplied, and keys must not contain &#39;:&#39; or start with &#39;_&#39;.  |  [optional] |
|**builds** | [**List&lt;BuildData&gt;**](BuildData.md) | A list of builds to submit to Jira.  Each build may be associated with one or more Jira issue keys, and will be associated with any properties included in this request.  |  |
|**providerMetadata** | [**ProviderMetadata3**](ProviderMetadata3.md) |  |  [optional] |



