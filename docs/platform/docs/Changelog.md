

# Changelog

A log of changes made to issue fields. Changelogs related to workflow associations are currently being deprecated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**author** | [**UserDetails**](UserDetails.md) | The user who made the change. |  [optional] [readonly] |
|**created** | **OffsetDateTime** | The date on which the change took place. |  [optional] [readonly] |
|**historyMetadata** | **HistoryMetadata** | The history metadata associated with the changed. |  [optional] [readonly] |
|**id** | **String** | The ID of the changelog. |  [optional] [readonly] |
|**items** | [**List&lt;ChangeDetails&gt;**](ChangeDetails.md) | The list of items changed. |  [optional] [readonly] |



