

# SubmitFeatureFlagRequest

The payload used to submit (update / insert) Feature Flag data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**properties** | **Map&lt;String, String&gt;** | Properties assigned to Feature Flag data that can then be used for delete / query operations.  Examples might be an account or user ID that can then be used to clean up data if an account is removed from the Provider system.  Note that these properties will never be returned with Feature Flag data. They are not intended for use as metadata to associate with a Feature Flag. Internally they are stored as a hash so that personal information etc. is never stored within Jira.  Properties are supplied as key/value pairs, a maximum of 5 properties can be supplied, and keys must not contain &#39;:&#39; or start with &#39;_&#39;.  |  [optional] |
|**flags** | [**List&lt;FeatureFlagData&gt;**](FeatureFlagData.md) | A list of Feature Flags to submit to Jira.  Each Feature Flag may be associated with 1 or more Jira issue keys, and will be associated with any properties included in this request.  |  |
|**providerMetadata** | [**ProviderMetadata1**](ProviderMetadata1.md) |  |  [optional] |



