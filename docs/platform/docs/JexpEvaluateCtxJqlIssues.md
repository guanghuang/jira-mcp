

# JexpEvaluateCtxJqlIssues

The JQL specifying the issues available in the evaluated Jira expression under the `issues` context variable. Not all issues returned by the JQL query are loaded, only those described by the `nextPageToken` and `maxResults` properties. This bean will be replacing JexpJqlIssues bean as part of new `evaluate` endpoint

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxResults** | **Integer** | The maximum number of issues to return from the JQL query. max results value considered may be lower than the number specific here. |  [optional] |
|**nextPageToken** | **String** | The token for a page to fetch that is not the first page. The first page has a &#x60;nextPageToken&#x60; of &#x60;null&#x60;. Use the &#x60;nextPageToken&#x60; to fetch the next page of issues. |  [optional] |
|**query** | **String** | The JQL query, required to be bounded. Additionally, &#x60;orderBy&#x60; clause can contain a maximum of 7 fields |  [optional] |



