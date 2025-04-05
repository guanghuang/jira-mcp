

# SubmitDeploymentsResponse

The result of a successful submitDeployments request. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedDeployments** | [**List&lt;DeploymentKey&gt;**](DeploymentKey.md) | The keys of deployments that have been accepted for submission. A deployment key is a composite key that consists of &#x60;pipelineId&#x60;, &#x60;environmentId&#x60; and &#x60;deploymentSequenceNumber&#x60;.  A deployment may be rejected if it was only associated with unknown issue keys.  Note that a deployment that isn&#39;t updated due to it&#39;s updateSequenceNumber being out of order is not considered a failed submission.  |  [optional] |
|**rejectedDeployments** | [**List&lt;RejectedDeployment&gt;**](RejectedDeployment.md) | Details of deployments that have not been accepted for submission, usually due to a problem with the request data.  The object will contain the deployment key and any errors associated with that deployment that have prevented it being submitted.  |  [optional] |
|**unknownIssueKeys** | **List&lt;String&gt;** | Issue keys that are not known on this Jira instance (if any).  These may be invalid keys (e.g. &#x60;UTF-8&#x60; is sometimes incorrectly identified as a Jira issue key), or they may be for projects that no longer exist.  If a deployment has been associated with issue keys other than those in this array it will still be stored against those valid keys. If a deployment was only associated with issue keys deemed to be invalid it won&#39;t be persisted.  |  [optional] |
|**unknownAssociations** | [**List&lt;SubmitDeploymentsResponseUnknownAssociationsInner&gt;**](SubmitDeploymentsResponseUnknownAssociationsInner.md) | Associations (e.g. Issue Keys or Service IDs) that are not known on this Jira instance (if any).  These may be invalid keys (e.g. &#x60;UTF-8&#x60; is sometimes incorrectly identified as a Jira issue key), or they may be for projects that no longer exist.  If a deployment has been associated with any other association other than those in this array it will still be stored against those valid associations. If a deployment was only associated with the associations in this array, it is deemed to be invalid and it won&#39;t be persisted.  |  [optional] |



