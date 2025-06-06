

# BulkEditShareableEntityRequest

Details of a request to bulk edit shareable entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Allowed action for bulk edit shareable entity |  |
|**changeOwnerDetails** | [**BulkChangeOwnerDetails**](BulkChangeOwnerDetails.md) | The details of change owner action. |  [optional] |
|**entityIds** | **Set&lt;Long&gt;** | The id list of shareable entities to be changed. |  |
|**extendAdminPermissions** | **Boolean** | Whether the actions are executed by users with Administer Jira global permission. |  [optional] |
|**permissionDetails** | [**PermissionDetails**](PermissionDetails.md) | The permission details to be changed. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| CHANGE_OWNER | &quot;changeOwner&quot; |
| CHANGE_PERMISSION | &quot;changePermission&quot; |
| ADD_PERMISSION | &quot;addPermission&quot; |
| REMOVE_PERMISSION | &quot;removePermission&quot; |



