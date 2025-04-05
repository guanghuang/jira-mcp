

# SubmitFeatureFlagsResponse

The result of a successful submitFeatureFlags request. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedFeatureFlags** | **List&lt;String&gt;** | The IDs of Feature Flags that have been accepted for submission.  A Feature Flag may be rejected if it was only associated with unknown issue keys.  Note that a Feature Flag that isn&#39;t updated due to it&#39;s updateSequenceId being out of order is not considered a failed submission.  |  [optional] |
|**failedFeatureFlags** | **Map&lt;String, List&lt;ErrorMessage1&gt;&gt;** | Details of Feature Flags that have not been accepted for submission, usually due to a problem with the request data.  The object (if present) will be keyed by Feature Flag ID and include any errors associated with that Feature Flag that have prevented it being submitted.  |  [optional] |
|**unknownIssueKeys** | **List&lt;String&gt;** | Issue keys that are not known on this Jira instance (if any).   These may be invalid keys (e.g. &#x60;UTF-8&#x60; is sometimes incorrectly identified as a Jira issue key), or they may be for projects that no longer exist.  If a Feature Flag has been associated with issue keys other than those in this array it will still be stored against those valid keys. If a Feature Flag was only associated with issue keys deemed to be invalid it won&#39;t be persisted.  |  [optional] |



