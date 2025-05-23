

# SubmitDeploymentRequest

The payload used to submit (update / insert) deployment data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**properties** | **Map&lt;String, String&gt;** | Properties assigned to deployment data that can then be used for delete / query operations.  Examples might be an account or user ID that can then be used to clean up data if an account is removed from the Provider system.  Properties are supplied as key/value pairs, and a maximum of 5 properties can be supplied, keys cannot contain &#39;:&#39; or start with &#39;_&#39;.  |  [optional] |
|**deployments** | [**List&lt;DeploymentData&gt;**](DeploymentData.md) | A list of deployments to submit to Jira.  Each deployment may be associated with one or more Jira issue keys, and will be associated with any properties included in this request.  |  |
|**providerMetadata** | [**ProviderMetadata2**](ProviderMetadata2.md) |  |  [optional] |



