

# Changelog

A log of changes made to issue fields. Changelogs related to workflow associations are currently being deprecated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**author** | [**ChangelogAuthor**](ChangelogAuthor.md) |  |  [optional] |
|**created** | **OffsetDateTime** | The date on which the change took place. |  [optional] [readonly] |
|**historyMetadata** | [**ChangelogHistoryMetadata**](ChangelogHistoryMetadata.md) |  |  [optional] |
|**id** | **String** | The ID of the changelog. |  [optional] [readonly] |
|**items** | [**List&lt;ChangelogItemsInner&gt;**](ChangelogItemsInner.md) | The list of items changed. |  [optional] [readonly] |



