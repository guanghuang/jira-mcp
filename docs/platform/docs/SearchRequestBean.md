

# SearchRequestBean


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expand** | **List&lt;String&gt;** | Use [expand](#expansion) to include additional information about issues in the response. Note that, unlike the majority of instances where &#x60;expand&#x60; is specified, &#x60;expand&#x60; is defined as a list of values. The expand options are:   *  &#x60;renderedFields&#x60; Returns field values rendered in HTML format.  *  &#x60;names&#x60; Returns the display name of each field.  *  &#x60;schema&#x60; Returns the schema describing a field type.  *  &#x60;transitions&#x60; Returns all possible transitions for the issue.  *  &#x60;operations&#x60; Returns all possible operations for the issue.  *  &#x60;editmeta&#x60; Returns information about how each field can be edited.  *  &#x60;changelog&#x60; Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  &#x60;versionedRepresentations&#x60; Instead of &#x60;fields&#x60;, returns &#x60;versionedRepresentations&#x60; a JSON array containing each version of a field&#39;s value, with the highest numbered item representing the most recent version. |  [optional] |
|**fields** | **List&lt;String&gt;** | A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;*all&#x60; Returns all fields.  *  &#x60;*navigable&#x60; Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  The default is &#x60;*navigable&#x60;.  Examples:   *  &#x60;summary,comment&#x60; Returns the summary and comments fields only.  *  &#x60;-description&#x60; Returns all navigable (default) fields except description.  *  &#x60;*all,-comment&#x60; Returns all fields except comments.  Multiple &#x60;fields&#x60; parameters can be included in a request.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields. |  [optional] |
|**fieldsByKeys** | **Boolean** | Reference fields by their key (rather than ID). The default is &#x60;false&#x60;. |  [optional] |
|**jql** | **String** | A [JQL](https://confluence.atlassian.com/x/egORLQ) expression. |  [optional] |
|**maxResults** | **Integer** | The maximum number of items to return per page. |  [optional] |
|**properties** | **List&lt;String&gt;** | A list of up to 5 issue properties to include in the results. This parameter accepts a comma-separated list. |  [optional] |
|**startAt** | **Integer** | The index of the first item to return in the page of results (page offset). The base index is &#x60;0&#x60;. |  [optional] |
|**validateQuery** | [**ValidateQueryEnum**](#ValidateQueryEnum) | Determines how to validate the JQL query and treat the validation results. Supported values:   *  &#x60;strict&#x60; Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  &#x60;warn&#x60; Returns all errors as warnings.  *  &#x60;none&#x60; No validation is performed.  *  &#x60;true&#x60; *Deprecated* A legacy synonym for &#x60;strict&#x60;.  *  &#x60;false&#x60; *Deprecated* A legacy synonym for &#x60;warn&#x60;.  The default is &#x60;strict&#x60;.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the &#x60;validateQuery&#x60; value. |  [optional] |



## Enum: ValidateQueryEnum

| Name | Value |
|---- | -----|
| STRICT | &quot;strict&quot; |
| WARN | &quot;warn&quot; |
| NONE | &quot;none&quot; |
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



