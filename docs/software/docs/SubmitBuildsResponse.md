

# SubmitBuildsResponse

The result of a successful `submitBuilds` request. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedBuilds** | [**List&lt;BuildKey&gt;**](BuildKey.md) | The keys of builds that have been accepted for submission. A build key is a composite key that consists of &#x60;pipelineId&#x60; and &#x60;buildNumber&#x60;.  A build may be rejected if it was only associated with unknown issue keys, or if the submitted data for that build does not match the required schema.  Note that a build that isn&#39;t updated due to it&#39;s &#x60;updateSequenceNumber&#x60; being out of order is not considered a failed submission.  |  [optional] |
|**rejectedBuilds** | [**List&lt;RejectedBuild&gt;**](RejectedBuild.md) | Details of builds that have not been accepted for submission.  A build may be rejected if it was only associated with unknown issue keys, or if the submitted data for the build does not match the required schema.  |  [optional] |
|**unknownIssueKeys** | **List&lt;String&gt;** | Issue keys that are not known on this Jira instance (if any).  These may be invalid keys (e.g. &#x60;UTF-8&#x60; is sometimes incorrectly identified as a Jira issue key), or they may be for projects that no longer exist.  If a build has been associated with issue keys other than those in this array it will still be stored against those valid keys. If a build was only associated with issue keys deemed to be invalid it won&#39;t be persisted.  |  [optional] |



