

# Repository

Represents a repository, containing development information such as commits, pull requests, and branches.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of this repository. Max length is 255 characters. |  |
|**description** | **String** | Description of this repository. Max length is 1024 characters. |  [optional] |
|**forkOf** | **String** | The ID of the repository this repository was forked from, if it&#39;s a fork. Max length is 1024 characters. |  [optional] |
|**url** | **String** | The URL of this repository. Max length is 2000 characters. |  |
|**commits** | [**List&lt;Commit&gt;**](Commit.md) | List of commits to update in this repository. Must not contain duplicate entity IDs. Maximum number of commits is 400 |  [optional] |
|**branches** | [**List&lt;Branch&gt;**](Branch.md) | List of branches to update in this repository. Must not contain duplicate entity IDs. Maximum number of branches is 400. |  [optional] |
|**pullRequests** | [**List&lt;PullRequest&gt;**](PullRequest.md) | List of pull requests to update in this repository. Must not contain duplicate entity IDs. Maximum number of pull requests is 400 |  [optional] |
|**avatar** | **String** | The URL of the avatar for this repository. Max length is 2000 characters. |  [optional] |
|**avatarDescription** | **String** | Description of the avatar for this repository. Max length is 1024 characters. |  [optional] |
|**id** | **String** | The ID of this entity. Will be used for cross entity linking. Must be unique by entity type within a repository, i.e., only one commit can have ID &#39;X&#39; in repository &#39;Y&#39;. But adding, e.g., a branch with ID &#39;X&#39; to repository &#39;Y&#39; is acceptable. Only alphanumeric characters, and &#39;~.-_&#39;, are allowed. Max length is 1024 characters. |  |
|**updateSequenceId** | **Long** |  An ID used to apply an ordering to updates for this entity in the case of out-of-order receipt of update requests. This can be any monotonically increasing number. A suggested implementation is to use epoch millis from the provider system, but other alternatives are valid (e.g. a provider could store a counter against each entity and increment that on each update to Jira). Updates for an entity that are received with an updateSqeuenceId lower than what is currently stored will be ignored. |  |



