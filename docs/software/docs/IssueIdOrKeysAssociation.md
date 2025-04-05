

# IssueIdOrKeysAssociation

An association type referencing Jira issue id or keys. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**associationType** | [**AssociationTypeEnum**](#AssociationTypeEnum) | Defines the association type.  |  |
|**values** | **List&lt;String&gt;** | The Jira issue id or keys to associate the Security information with.  The number of values counted across all associationTypes (issueIdOrKeys) must not exceed a limit of 500.  |  |



## Enum: AssociationTypeEnum

| Name | Value |
|---- | -----|
| ISSUE_ID_OR_KEYS | &quot;issueIdOrKeys&quot; |



