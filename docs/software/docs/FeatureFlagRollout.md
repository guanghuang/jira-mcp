

# FeatureFlagRollout

Information about the rollout of a Feature Flag in an environment (or in summary).  Only one of 'percentage', 'text', or 'rules' should be provided. They will be used in that order if multiple are present.  This information may be presented to the user in the UI. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**percentage** | **BigDecimal** | If the Feature Flag rollout is a simple percentage rollout  |  [optional] |
|**text** | **String** | A text status to display that represents the rollout. This could be e.g. a named cohort.  |  [optional] |
|**rules** | **Integer** | A count of the number of rules active for this Feature Flag in an environment.  |  [optional] |



