

# IssueKeysAssociation

An association type referencing issues in Jira. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**associationType** | [**AssociationTypeEnum**](#AssociationTypeEnum) | Defines the asssociation type.  |  |
|**values** | **List&lt;String&gt;** | The Jira issue keys to associate the Remote Link information with.  The number of values counted across all associationTypes (issueKeys, issueIdOrKeys and serviceIdOrKeys) must not exceed a limit of 500.  |  |



## Enum: AssociationTypeEnum

| Name | Value |
|---- | -----|
| ISSUE_KEYS | &quot;issueKeys&quot; |



