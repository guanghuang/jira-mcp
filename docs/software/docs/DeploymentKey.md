

# DeploymentKey

Fields that uniquely reference a deployment. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pipelineId** | **String** | The identifier of a pipeline, must be unique for the provider.  |  |
|**environmentId** | **String** | The identifier of an environment, must be unique for the provider so that it can be shared across pipelines.  |  |
|**deploymentSequenceNumber** | **Long** | This is the identifier for the deployment. It must be unique for the specified pipeline and environment. It must be a monotonically increasing number, as this is used to sequence the deployments.  |  |



