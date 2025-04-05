

# FeatureFlagSummary

Summary information for a single Feature Flag.  Providers may elect to provide information from a specific environment, or they may choose to 'roll up' information from across multiple environments - whatever makes most sense in the Provider system.  This is the summary information that will be presented to the user on e.g. the Jira issue screen. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** | A URL users can use to link to a summary view of this flag, if appropriate.  This could be any location that makes sense in the Provider system (e.g. if the summary information comes from a specific environment, it might make sense to link the user to the flag in that environment).  |  [optional] |
|**status** | [**FeatureFlagStatus**](FeatureFlagStatus.md) |  |  |
|**lastUpdated** | **OffsetDateTime** | The last-updated timestamp to present to the user as a summary of the state of the Feature Flag.  Providers may choose to supply the last-updated timestamp from a specific environment, or the &#39;most recent&#39; last-updated timestamp across all environments - whatever makes sense in the Provider system.  Expected format is an RFC3339 formatted string.  |  |



