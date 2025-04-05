

# CreatePlanRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**crossProjectReleases** | [**Set&lt;CreateCrossProjectReleaseRequest&gt;**](CreateCrossProjectReleaseRequest.md) | The cross-project releases to include in the plan. |  [optional] |
|**customFields** | [**Set&lt;CreateCustomFieldRequest&gt;**](CreateCustomFieldRequest.md) | The custom fields for the plan. |  [optional] |
|**exclusionRules** | [**CreateExclusionRulesRequest**](CreateExclusionRulesRequest.md) | The exclusion rules for the plan. |  [optional] |
|**issueSources** | [**Set&lt;CreateIssueSourceRequest&gt;**](CreateIssueSourceRequest.md) | The issue sources to include in the plan. |  |
|**leadAccountId** | **String** | The account ID of the plan lead. |  [optional] |
|**name** | **String** | The plan name. |  |
|**permissions** | [**Set&lt;CreatePermissionRequest&gt;**](CreatePermissionRequest.md) | The permissions for the plan. |  [optional] |
|**scheduling** | [**CreateSchedulingRequest**](CreateSchedulingRequest.md) | The scheduling settings for the plan. |  |



