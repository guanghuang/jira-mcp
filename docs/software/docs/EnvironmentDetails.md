

# EnvironmentDetails

Details of a single environment.  At the simplest this must be the name of the environment.  Ideally there is also type information which may be used to group data from multiple Feature Flags and other entities for visualisation in the UI. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the environment. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The &#39;type&#39; or &#39;category&#39; of environment this environment belongs to. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DEVELOPMENT | &quot;development&quot; |
| TESTING | &quot;testing&quot; |
| STAGING | &quot;staging&quot; |
| PRODUCTION | &quot;production&quot; |



