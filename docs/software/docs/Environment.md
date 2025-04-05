

# Environment

The environment that the deployment is present in. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier of this environment, must be unique for the provider so that it can be shared across pipelines.  |  |
|**displayName** | **String** | The name of the environment to present to the user.  |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the environment.  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UNMAPPED | &quot;unmapped&quot; |
| DEVELOPMENT | &quot;development&quot; |
| TESTING | &quot;testing&quot; |
| STAGING | &quot;staging&quot; |
| PRODUCTION | &quot;production&quot; |



