

# ConnectCustomFieldValue

A list of custom field details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of custom field. |  |
|**fieldID** | **Integer** | The custom field ID. |  |
|**issueID** | **Integer** | The issue ID. |  |
|**number** | **BigDecimal** | The value of number type custom field when &#x60;_type&#x60; is &#x60;NumberIssueField&#x60;. |  [optional] |
|**optionID** | **String** | The value of single select and multiselect custom field type when &#x60;_type&#x60; is &#x60;SingleSelectIssueField&#x60; or &#x60;MultiSelectIssueField&#x60;. |  [optional] |
|**richText** | **String** | The value of richText type custom field when &#x60;_type&#x60; is &#x60;RichTextIssueField&#x60;. |  [optional] |
|**string** | **String** | The value of string type custom field when &#x60;_type&#x60; is &#x60;StringIssueField&#x60;. |  [optional] |
|**text** | **String** | The value of of text custom field type when &#x60;_type&#x60; is &#x60;TextIssueField&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING_ISSUE_FIELD | &quot;StringIssueField&quot; |
| NUMBER_ISSUE_FIELD | &quot;NumberIssueField&quot; |
| RICH_TEXT_ISSUE_FIELD | &quot;RichTextIssueField&quot; |
| SINGLE_SELECT_ISSUE_FIELD | &quot;SingleSelectIssueField&quot; |
| MULTI_SELECT_ISSUE_FIELD | &quot;MultiSelectIssueField&quot; |
| TEXT_ISSUE_FIELD | &quot;TextIssueField&quot; |



