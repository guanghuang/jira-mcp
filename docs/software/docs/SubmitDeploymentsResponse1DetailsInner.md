

# SubmitDeploymentsResponse1DetailsInner

Details related to the gating status 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of the gating status details.  |  |
|**issueKey** | **String** | An issue key that references an issue in Jira.  |  |
|**issueLink** | **URI** | A full HTTPS link to the Jira issue for the change request gating this Deployment. This field is provided if the details type is issue.  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ISSUE | &quot;issue&quot; |



