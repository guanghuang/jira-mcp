

# Commit

Represents a commit in the version control system.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier or hash of the commit. Will be used for cross entity linking. Must be unique for all commits within a repository, i.e., only one commit can have ID &#39;X&#39; in repository &#39;Y&#39;. But adding, e.g., a branch with ID &#39;X&#39; to repository &#39;Y&#39; is acceptable. Only alphanumeric characters, and &#39;~.-_&#39;, are allowed. Max length is 1024 characters |  |
|**issueKeys** | **List&lt;String&gt;** | List of issues keys that this entity is associated with. They must be valid Jira issue keys. |  |
|**updateSequenceId** | **Long** | An ID used to apply an ordering to updates for this entity in the case of out-of-order receipt of update requests. This can be any monotonically increasing number. A suggested implementation is to use epoch millis from the provider system, but other alternatives are valid (e.g. a provider could store a counter against each entity and increment that on each update to Jira). Updates for an entity that are received with an updateSqeuenceId lower than what is currently stored will be ignored. |  |
|**hash** | **String** | Deprecated. Use the id field instead. |  [optional] |
|**flags** | [**Set&lt;FlagsEnum&gt;**](#Set&lt;FlagsEnum&gt;) | The set of flags for this commit |  [optional] |
|**message** | **String** | The commit message. Max length is 1024 characters. If anything longer is supplied, it will be truncated down to 1024 characters. |  |
|**author** | [**Author**](Author.md) |  |  |
|**fileCount** | **Integer** | The total number of files added, removed, or modified by this commit |  |
|**url** | **String** | The URL of this commit. Max length is 2000 characters. |  |
|**files** | [**List&lt;ModelFile&gt;**](ModelFile.md) | List of file changes. Max number of files is 10. Currently, only the first 5 files are shown (sorted by path) in the UI. This UI behavior may change without notice. |  [optional] |
|**authorTimestamp** | **String** | The author timestamp of this commit. Formatted as a UTC ISO 8601 date time format. |  |
|**displayId** | **String** | Shortened identifier for this commit, used for display. Max length is 255 characters. |  |



## Enum: Set&lt;FlagsEnum&gt;

| Name | Value |
|---- | -----|
| MERGE_COMMIT | &quot;MERGE_COMMIT&quot; |



