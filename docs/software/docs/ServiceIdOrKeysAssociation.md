

# ServiceIdOrKeysAssociation

An association type referencing service id or keys. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**associationType** | [**AssociationTypeEnum**](#AssociationTypeEnum) | Defines the asssociation type.  |  |
|**values** | **List&lt;String&gt;** | The service id or keys to associate the Remote Link information with.  The number of values counted across all associationTypes (issueKeys, issueIdOrKeys and serviceIdOrKeys) must not exceed a limit of 500.  |  |



## Enum: AssociationTypeEnum

| Name | Value |
|---- | -----|
| SERVICE_ID_OR_KEYS | &quot;serviceIdOrKeys&quot; |



