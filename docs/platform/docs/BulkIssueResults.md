

# BulkIssueResults

The list of requested issues & fields.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**issueErrors** | [**List&lt;IssueError&gt;**](IssueError.md) | When Jira can&#39;t return an issue enumerated in a request due to a retriable error or payload constraint, we&#39;ll return the respective issue ID with a corresponding error message. This list is empty when there are no errors Issues which aren&#39;t found or that the user doesn&#39;t have permission to view won&#39;t be returned in this list. |  [optional] [readonly] |
|**issues** | [**List&lt;IssueBean&gt;**](IssueBean.md) | The list of issues. |  [optional] [readonly] |



