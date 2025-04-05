

# GetSchedulingResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dependencies** | [**DependenciesEnum**](#DependenciesEnum) | The dependencies for the plan. This is \&quot;Sequential\&quot; or \&quot;Concurrent\&quot;. |  |
|**endDate** | [**GetDateFieldResponse**](GetDateFieldResponse.md) | The end date field for the plan. |  |
|**estimation** | [**EstimationEnum**](#EstimationEnum) | The estimation unit for the plan. This is \&quot;StoryPoints\&quot;, \&quot;Days\&quot; or \&quot;Hours\&quot;. |  |
|**inferredDates** | [**InferredDatesEnum**](#InferredDatesEnum) | The inferred dates for the plan. This is \&quot;None\&quot;, \&quot;SprintDates\&quot; or \&quot;ReleaseDates\&quot;. |  |
|**startDate** | [**GetDateFieldResponse**](GetDateFieldResponse.md) | The start date field for the plan. |  |



## Enum: DependenciesEnum

| Name | Value |
|---- | -----|
| SEQUENTIAL | &quot;Sequential&quot; |
| CONCURRENT | &quot;Concurrent&quot; |



## Enum: EstimationEnum

| Name | Value |
|---- | -----|
| STORY_POINTS | &quot;StoryPoints&quot; |
| DAYS | &quot;Days&quot; |
| HOURS | &quot;Hours&quot; |



## Enum: InferredDatesEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| SPRINT_DATES | &quot;SprintDates&quot; |
| RELEASE_DATES | &quot;ReleaseDates&quot; |



