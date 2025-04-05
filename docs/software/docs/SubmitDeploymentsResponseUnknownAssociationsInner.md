

# SubmitDeploymentsResponseUnknownAssociationsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**associationType** | [**AssociationTypeEnum**](#AssociationTypeEnum) | Defines the association type. Currently supported entities can be found in this field&#39;s value enums list.  |  |
|**values** | [**List&lt;DeploymentDataAssociationsInnerAnyOf2ValuesInner&gt;**](DeploymentDataAssociationsInnerAnyOf2ValuesInner.md) | The entity keys that represent the entities to be associated. The number of values counted across all associationTypes (issueKeys, issueIdOrKeys, serviceIdOrKeys, supported ATIs and entity associations) must not exceed a limit of 500.  |  |



## Enum: AssociationTypeEnum

| Name | Value |
|---- | -----|
| COMMIT | &quot;commit&quot; |
| REPOSITORY | &quot;repository&quot; |



