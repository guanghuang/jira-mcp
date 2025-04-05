

# BuildData

Data related to a single build 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | [**SchemaVersionEnum**](#SchemaVersionEnum) | The schema version used for this data.  Placeholder to support potential schema changes in the future.  |  [optional] |
|**pipelineId** | **String** | An ID that relates a sequence of builds. Depending on your use case this might be a project ID, pipeline ID, plan key etc. - whatever logical unit you use to group a sequence of builds.  The combination of &#x60;pipelineId&#x60; and &#x60;buildNumber&#x60; must uniquely identify a build you have provided.  |  |
|**buildNumber** | **Long** | Identifies a build within the sequence of builds identified by the build &#x60;pipelineId&#x60;.  Used to identify the &#39;most recent&#39; build in that sequence of builds.  The combination of &#x60;pipelineId&#x60; and &#x60;buildNumber&#x60; must uniquely identify a build you have provided.  |  |
|**updateSequenceNumber** | **Long** | A number used to apply an order to the updates to the build, as identified by &#x60;pipelineId&#x60; and &#x60;buildNumber&#x60;, in the case of out-of-order receipt of update requests.  It must be a monotonically increasing number. For example, epoch time could be one way to generate the &#x60;updateSequenceNumber&#x60;.  Updates for a build that is received with an &#x60;updateSqeuenceNumber&#x60; less than or equal to what is currently stored will be ignored.  |  |
|**displayName** | **String** | The human-readable name for the build.  Will be shown in the UI.  |  |
|**description** | **String** | An optional description to attach to this build.  This may be anything that makes sense in your system.  |  [optional] |
|**label** | **String** | A human-readable string that to provide information about the build.  |  [optional] |
|**url** | **String** | The URL to this build in your system.  |  |
|**state** | [**StateEnum**](#StateEnum) | The state of a build.  * &#x60;pending&#x60; - The build is queued, or some manual action is required. * &#x60;in_progress&#x60; - The build is currently running. * &#x60;successful&#x60; - The build completed successfully. * &#x60;failed&#x60; - The build failed. * &#x60;cancelled&#x60; - The build has been cancelled or stopped. * &#x60;unknown&#x60; - The build is in an unknown state.  |  |
|**lastUpdated** | **OffsetDateTime** | The last-updated timestamp to present to the user as a summary of the state of the build.  |  |
|**issueKeys** | **List&lt;String&gt;** | The Jira issue keys to associate the build information with.  You are free to associate issue keys in any way you like. However, we recommend that you use the name of the branch the build was executed on, and extract issue keys from that name using a simple regex. This has the advantage that it provides an intuitive association of builds to issue keys.  |  |
|**testInfo** | [**TestInfo**](TestInfo.md) |  |  [optional] |
|**references** | [**List&lt;BuildReferences&gt;**](BuildReferences.md) | Optional information that links a build to a commit, branch etc.  |  [optional] |



## Enum: SchemaVersionEnum

| Name | Value |
|---- | -----|
| _1_0 | &quot;1.0&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| SUCCESSFUL | &quot;successful&quot; |
| FAILED | &quot;failed&quot; |
| CANCELLED | &quot;cancelled&quot; |
| UNKNOWN | &quot;unknown&quot; |



