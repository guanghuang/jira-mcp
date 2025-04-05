

# FeatureFlagStatus

Status information about a single Feature Flag. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | Whether the Feature Flag is enabled in the given environment (or in summary).  Enabled may imply a partial rollout, which can be described using the &#39;rollout&#39; field.  |  |
|**defaultValue** | **String** | The value served by this Feature Flag when it is disabled. This could be the actual value or an alias, as appropriate.  This value may be presented to the user in the UI.  |  [optional] |
|**rollout** | [**FeatureFlagRollout**](FeatureFlagRollout.md) |  |  [optional] |



