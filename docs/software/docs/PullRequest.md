

# PullRequest

Represents a pull request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of this entity. Will be used for cross entity linking. Must be unique by entity type within a repository, i.e., only one commit can have ID &#39;X&#39; in repository &#39;Y&#39;. But adding, e.g., a branch with ID &#39;X&#39; to repository &#39;Y&#39; is acceptable. Only alphanumeric characters, and &#39;~.-_&#39;, are allowed. Max length is 1024 characters |  |
|**issueKeys** | **List&lt;String&gt;** | List of issues keys that this entity is associated with. They must be valid Jira issue keys. |  |
|**updateSequenceId** | **Long** | An ID used to apply an ordering to updates for this entity in the case of out-of-order receipt of update requests. This can be any monotonically increasing number. A suggested implementation is to use epoch millis from the provider system, but other alternatives are valid (e.g. a provider could store a counter against each entity and increment that on each update to Jira). Updates for an entity that are received with an updateSqeuenceId lower than what is currently stored will be ignored. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the pull request. In the case of concurrent updates, priority is given in the order OPEN, MERGED, DECLINED, UNKNOWN |  |
|**title** | **String** | Title of the pull request. Max length is 1024 characters. |  |
|**author** | [**Author**](Author.md) |  |  |
|**commentCount** | **Integer** | The number of comments on the pull request |  |
|**sourceBranch** | **String** | The name of the source branch of this PR. Max length is 255 characters. |  |
|**sourceBranchUrl** | **String** | The url of the source branch of this PR. This is used to match this PR against the branch. Max length is 2000 characters. |  [optional] |
|**lastUpdate** | **String** | The most recent update to this PR. Formatted as a UTC ISO 8601 date time format. |  |
|**destinationBranch** | **String** | The name of destination branch of this PR. Max length is 255 characters. |  [optional] |
|**destinationBranchUrl** | **String** | The url of the destination branch of this PR. Max length is 2000 characters. |  [optional] |
|**reviewers** | [**List&lt;Reviewer&gt;**](Reviewer.md) | The list of reviewers of this pull request |  [optional] |
|**url** | **String** | The URL of this pull request. Max length is 2000 characters. |  |
|**displayId** | **String** | Shortened identifier for this pull request, used for display. Max length is 255 characters. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| MERGED | &quot;MERGED&quot; |
| DECLINED | &quot;DECLINED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



