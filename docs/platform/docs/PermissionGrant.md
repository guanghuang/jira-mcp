

# PermissionGrant

Details about a permission granted to a user or group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**holder** | [**PermissionHolder**](PermissionHolder.md) | The user or group being granted the permission. It consists of a &#x60;type&#x60;, a type-dependent &#x60;parameter&#x60; and a type-dependent &#x60;value&#x60;. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information. |  [optional] |
|**id** | **Long** | The ID of the permission granted details. |  [optional] [readonly] |
|**permission** | **String** | The permission to grant. This permission can be one of the built-in permissions or a custom permission added by an app. See [Built-in permissions](../api-group-permission-schemes/#built-in-permissions) in *Get all permission schemes* for more information about the built-in permissions. See the [project permission](https://developer.atlassian.com/cloud/jira/platform/modules/project-permission/) and [global permission](https://developer.atlassian.com/cloud/jira/platform/modules/global-permission/) module documentation for more information about custom permissions. |  [optional] |
|**self** | **URI** | The URL of the permission granted details. |  [optional] [readonly] |



