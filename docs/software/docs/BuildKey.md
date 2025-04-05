

# BuildKey

Fields that uniquely reference a build. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pipelineId** | **String** | An ID that relates a sequence of builds. Depending on your system this might be a project ID, pipeline ID, plan key etc. - whatever logical unit you use to group a sequence of builds.  The combination of &#x60;pipelineId&#x60; and &#x60;buildNumber&#x60; must uniquely identify the build.  |  |
|**buildNumber** | **Long** | Identifies a build within the sequence of builds identified by the build &#x60;pipelineId&#x60;.  Used to identify the &#39;most recent&#39; build in that sequence of builds.  The combination of &#x60;pipelineId&#x60; and &#x60;buildNumber&#x60; must uniquely identify the build.  |  |



