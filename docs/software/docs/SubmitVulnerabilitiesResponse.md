

# SubmitVulnerabilitiesResponse

The result of a successful submitVulnerabilities request. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedVulnerabilities** | **List&lt;String&gt;** | The IDs of Vulnerabilities that have been accepted for submission.  A Vulnerability may be rejected if it was only associated with unknown project keys.  Note that a Vulnerability that isn&#39;t updated due to it&#39;s updateSequenceNumber being out of order is not considered a failed submission.  |  [optional] |
|**failedVulnerabilities** | **Map&lt;String, List&lt;ErrorMessage1&gt;&gt;** | Details of Vulnerabilities that have not been accepted for submission, usually due to a problem with the request data.  The object (if present) will be keyed by Vulnerability ID and include any errors associated with that Vulnerability that have prevented it being submitted.  |  [optional] |
|**unknownAssociations** | [**List&lt;IssueIdOrKeysAssociation&gt;**](IssueIdOrKeysAssociation.md) | Associations (e.g. Service IDs) that are not known on this Jira instance (if any).  If a Vulnerability has been associated with any other association other than those in this array it will still be stored against those valid associations. If a Vulnerability was only associated with the associations in this array, it is deemed to be invalid and it won&#39;t be persisted.  |  [optional] |



