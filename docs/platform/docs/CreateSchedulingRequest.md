

# CreateSchedulingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dependencies** | [**DependenciesEnum**](#DependenciesEnum) | The dependencies for the plan. This must be \&quot;Sequential\&quot; or \&quot;Concurrent\&quot;. |  [optional] |
|**endDate** | [**CreateDateFieldRequest**](CreateDateFieldRequest.md) | The end date field for the plan. |  [optional] |
|**estimation** | [**EstimationEnum**](#EstimationEnum) | The estimation unit for the plan. This must be \&quot;StoryPoints\&quot;, \&quot;Days\&quot; or \&quot;Hours\&quot;. |  |
|**inferredDates** | [**InferredDatesEnum**](#InferredDatesEnum) | The inferred dates for the plan. This must be \&quot;None\&quot;, \&quot;SprintDates\&quot; or \&quot;ReleaseDates\&quot;. |  [optional] |
|**startDate** | [**CreateDateFieldRequest**](CreateDateFieldRequest.md) | The start date field for the plan. |  [optional] |



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



