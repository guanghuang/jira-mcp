

# Branch

Represents a branch in the version control system

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of this entity. Will be used for cross entity linking. Must be unique by entity type within a repository, i.e., only one commit can have ID &#39;X&#39; in repository &#39;Y&#39;. But adding, e.g., a branch with ID &#39;X&#39; to repository &#39;Y&#39; is acceptable. Only alphanumeric characters, and &#39;~.-_&#39;, are allowed. Max length is 1024 characters. |  |
|**issueKeys** | **List&lt;String&gt;** | List of issues keys that this entity is associated with. They must be valid Jira issue keys. |  |
|**updateSequenceId** | **Long** | An ID used to apply an ordering to updates for this entity in the case of out-of-order receipt of update requests. This can be any monotonically increasing number. A suggested implementation is to use epoch millis from the provider system, but other alternatives are valid (e.g. a provider could store a counter against each entity and increment that on each update to Jira). Updates for an entity that are received with an updateSqeuenceId lower than what is currently stored will be ignored. |  |
|**name** | **String** | The name of the branch. Max length is 512 characters. |  |
|**lastCommit** | [**Commit**](Commit.md) |  |  |
|**createPullRequestUrl** | **String** | The URL of the page for creating a pull request from this branch. Max length is 2000 characters. |  [optional] |
|**url** | **String** | The URL of the branch. Max length is 2000 characters. |  |



