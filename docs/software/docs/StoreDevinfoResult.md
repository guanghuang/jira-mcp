

# StoreDevinfoResult

The result of a successful store development information request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedDevinfoEntities** | [**Map&lt;String, EntityIds&gt;**](EntityIds.md) | The IDs of devinfo entities that have been accepted for submission grouped by their repository IDs. Note that a devinfo entity that isn&#39;t updated due to it&#39;s updateSequenceId being out of order is not considered a failed submission. |  [optional] |
|**failedDevinfoEntities** | [**Map&lt;String, RepositoryErrors&gt;**](RepositoryErrors.md) | IDs of devinfo entities that have not been accepted for submission and caused error descriptions, usually due to a problem with the request data. The entities (if present) will be grouped by their repository id and type. Entity IDs are listed with errors associated with that devinfo entity that have prevented it being submitted.  |  [optional] |
|**unknownIssueKeys** | **List&lt;String&gt;** | Issue keys that are not known on this Jira instance (if any). These may be invalid keys (e.g. &#x60;UTF-8&#x60; is sometimes incorrectly identified as a Jira issue key), or they may be for projects that no longer exist. If a devinfo entity has been associated with issue keys other than those in this array it will still be stored against those valid keys.  |  [optional] |



