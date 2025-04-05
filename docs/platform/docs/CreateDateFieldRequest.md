

# CreateDateFieldRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateCustomFieldId** | **Long** | A date custom field ID. This is required if the type is \&quot;DateCustomField\&quot;. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The date field type. This must be \&quot;DueDate\&quot;, \&quot;TargetStartDate\&quot;, \&quot;TargetEndDate\&quot; or \&quot;DateCustomField\&quot;. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DUE_DATE | &quot;DueDate&quot; |
| TARGET_START_DATE | &quot;TargetStartDate&quot; |
| TARGET_END_DATE | &quot;TargetEndDate&quot; |
| DATE_CUSTOM_FIELD | &quot;DateCustomField&quot; |



