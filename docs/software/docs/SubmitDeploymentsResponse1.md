

# SubmitDeploymentsResponse1

The current gating status for the given Deployment. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deploymentSequenceNumber** | **Long** | This is the identifier for the Deployment.  |  [optional] |
|**pipelineId** | **String** | The ID of the Deployment&#39;s pipeline.  |  [optional] |
|**environmentId** | **String** | The ID of the Deployment&#39;s environment.  |  [optional] |
|**updatedTimestamp** | **OffsetDateTime** | Time the deployment gating status was updated.  |  [optional] |
|**gatingStatus** | [**GatingStatusEnum**](#GatingStatusEnum) | The gating status  |  [optional] |
|**details** | [**List&lt;SubmitDeploymentsResponse1DetailsInner&gt;**](SubmitDeploymentsResponse1DetailsInner.md) |  |  [optional] |



## Enum: GatingStatusEnum

| Name | Value |
|---- | -----|
| ALLOWED | &quot;allowed&quot; |
| PREVENTED | &quot;prevented&quot; |
| AWAITING | &quot;awaiting&quot; |
| INVALID | &quot;invalid&quot; |



