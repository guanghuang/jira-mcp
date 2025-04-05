

# WorkflowUpdate

The details of the workflows to update.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultStatusMappings** | **List&lt;StatusMigration&gt;** | The mapping of old to new status ID. |  [optional] |
|**description** | **String** | The new description for this workflow. |  [optional] |
|**id** | **String** | The ID of this workflow. |  |
|**startPointLayout** | [**WorkflowLayout**](WorkflowLayout.md) |  |  [optional] |
|**statusMappings** | **List&lt;StatusMappingDTO&gt;** | The mapping of old to new status ID for a specific project and issue type. |  [optional] |
|**statuses** | **List&lt;StatusLayoutUpdate&gt;** | The statuses associated with this workflow. |  |
|**transitions** | **List&lt;TransitionUpdateDTO&gt;** | The transitions of this workflow. |  |
|**version** | [**DocumentVersion**](DocumentVersion.md) |  |  |



