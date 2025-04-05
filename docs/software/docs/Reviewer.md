

# Reviewer

The reviewer of a pull request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Deprecated. The name of this reviewer. Max length is 255 characters. |  [optional] |
|**approvalStatus** | [**ApprovalStatusEnum**](#ApprovalStatusEnum) | The approval status of this reviewer, default is UNAPPROVED. |  [optional] |
|**url** | **String** | Deprecated. The URL of the profile for this reviewer. Max length is 2000 characters. |  [optional] |
|**avatar** | **String** | Deprecated. The URL of the avatar for this reviewer. Max length is 2000 characters. |  [optional] |
|**email** | **String** | The email address of this reviewer. Max length is 254 characters. |  [optional] |
|**accountId** | **String** | The Atlassian Account ID (AAID) of this reviewer. Max length is 128 characters. |  [optional] |



## Enum: ApprovalStatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;APPROVED&quot; |
| UNAPPROVED | &quot;UNAPPROVED&quot; |



