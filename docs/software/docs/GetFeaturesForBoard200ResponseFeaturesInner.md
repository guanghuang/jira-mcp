

# GetFeaturesForBoard200ResponseFeaturesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**boardFeature** | [**BoardFeatureEnum**](#BoardFeatureEnum) |  |  [optional] |
|**boardId** | **Long** |  |  [optional] |
|**featureId** | **String** |  |  [optional] |
|**featureType** | [**FeatureTypeEnum**](#FeatureTypeEnum) |  |  [optional] |
|**imageUri** | **String** |  |  [optional] |
|**learnMoreArticleId** | **String** |  |  [optional] |
|**learnMoreLink** | **String** |  |  [optional] |
|**localisedDescription** | **String** |  |  [optional] |
|**localisedGroup** | **String** |  |  [optional] |
|**localisedName** | **String** |  |  [optional] |
|**permissibleEstimationTypes** | [**List&lt;GetFeaturesForBoard200ResponseFeaturesInnerPermissibleEstimationTypesInner&gt;**](GetFeaturesForBoard200ResponseFeaturesInnerPermissibleEstimationTypesInner.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**toggleLocked** | **Boolean** |  |  [optional] |



## Enum: BoardFeatureEnum

| Name | Value |
|---- | -----|
| SIMPLE_ROADMAP | &quot;SIMPLE_ROADMAP&quot; |
| BACKLOG | &quot;BACKLOG&quot; |
| SPRINTS | &quot;SPRINTS&quot; |
| CALENDAR | &quot;CALENDAR&quot; |
| DEVTOOLS | &quot;DEVTOOLS&quot; |
| REPORTS | &quot;REPORTS&quot; |
| ESTIMATION | &quot;ESTIMATION&quot; |
| PAGES | &quot;PAGES&quot; |
| CODE | &quot;CODE&quot; |
| SECURITY | &quot;SECURITY&quot; |
| REQUESTS | &quot;REQUESTS&quot; |
| INCIDENTS | &quot;INCIDENTS&quot; |
| RELEASES | &quot;RELEASES&quot; |
| DEPLOYMENTS | &quot;DEPLOYMENTS&quot; |
| ISSUE_NAVIGATOR | &quot;ISSUE_NAVIGATOR&quot; |
| ON_CALL_SCHEDULE | &quot;ON_CALL_SCHEDULE&quot; |
| BOARD | &quot;BOARD&quot; |
| GOALS | &quot;GOALS&quot; |
| LIST_VIEW | &quot;LIST_VIEW&quot; |



## Enum: FeatureTypeEnum

| Name | Value |
|---- | -----|
| BASIC | &quot;BASIC&quot; |
| ESTIMATION | &quot;ESTIMATION&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;ENABLED&quot; |
| DISABLED | &quot;DISABLED&quot; |
| COMING_SOON | &quot;COMING_SOON&quot; |



