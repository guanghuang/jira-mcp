

# SubmitDevopsComponentsRequest

The payload used to submit (update / insert) DevOps Component data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**properties** | **Map&lt;String, String&gt;** | Properties assigned to incidents/components/review data that can then be used for delete / query operations.  Examples might be an account or user ID that can then be used to clean up data if an account is removed from the Provider system.  Properties are supplied as key/value pairs, and a maximum of 5 properties can be supplied, keys cannot contain &#39;:&#39; or start with &#39;_&#39;.  |  [optional] |
|**components** | [**List&lt;Component&gt;**](Component.md) |  |  |
|**providerMetadata** | [**ProviderMetadata6**](ProviderMetadata6.md) |  |  [optional] |



