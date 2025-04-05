

# DeploymentData

Data related to a specific deployment in a specific environment that the deployment is present in. Must specify one of `issueKeys` or `associations`. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deploymentSequenceNumber** | **Long** | This is the identifier for the deployment. It must be unique for the specified pipeline and environment. It must be a monotonically increasing number, as this is used to sequence the deployments.  |  |
|**updateSequenceNumber** | **Long** | A number used to apply an order to the updates to the deployment, as identified by the deploymentSequenceNumber, in the case of out-of-order receipt of update requests. It must be a monotonically increasing number. For example, epoch time could be one way to generate the updateSequenceNumber.  |  |
|**issueKeys** | **List&lt;String&gt;** | Deprecated. The Jira issue keys to associate the Deployment information with. Should replace this field with the \&quot;associations\&quot; field to associate Deployment information with issueKeys or other types of associations.  |  [optional] |
|**associations** | [**List&lt;DeploymentDataAssociationsInner&gt;**](DeploymentDataAssociationsInner.md) | The entities to associate the Deployment information with. It must contain at least one of IssueIdOrKeysAssociation or ServiceIdOrKeysAssociation.  |  [optional] |
|**displayName** | **String** | The human-readable name for the deployment. Will be shown in the UI.  |  |
|**url** | **URI** | A URL users can use to link to this deployment, in this environment.  |  |
|**description** | **String** | A short description of the deployment  |  |
|**lastUpdated** | **OffsetDateTime** | The last-updated timestamp to present to the user as a summary of the state of the deployment.  |  |
|**label** | **String** | An (optional) additional label that may be displayed with deployment information. Can be used to display version information etc. for the deployment.  |  [optional] |
|**duration** | **Long** | The duration of the deployment (in seconds).  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The state of the deployment  |  |
|**pipeline** | [**Pipeline**](Pipeline.md) |  |  |
|**environment** | [**Environment**](Environment.md) |  |  |
|**commands** | [**List&lt;Command&gt;**](Command.md) | A list of commands to be actioned for this Deployment  |  [optional] |
|**schemaVersion** | [**SchemaVersionEnum**](#SchemaVersionEnum) | The DeploymentData schema version used for this deployment data.  Placeholder to support potential schema changes in the future.  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| PENDING | &quot;pending&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| CANCELLED | &quot;cancelled&quot; |
| FAILED | &quot;failed&quot; |
| ROLLED_BACK | &quot;rolled_back&quot; |
| SUCCESSFUL | &quot;successful&quot; |



## Enum: SchemaVersionEnum

| Name | Value |
|---- | -----|
| _1_0 | &quot;1.0&quot; |



