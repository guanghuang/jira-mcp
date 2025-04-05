

# BulkEditShareableEntityResponse

Details of a request to bulk edit shareable entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Allowed action for bulk edit shareable entity |  |
|**entityErrors** | [**Map&lt;String, BulkEditActionError&gt;**](BulkEditActionError.md) | The mapping dashboard id to errors if any. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| CHANGE_OWNER | &quot;changeOwner&quot; |
| CHANGE_PERMISSION | &quot;changePermission&quot; |
| ADD_PERMISSION | &quot;addPermission&quot; |
| REMOVE_PERMISSION | &quot;removePermission&quot; |



