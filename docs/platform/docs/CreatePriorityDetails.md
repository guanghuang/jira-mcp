

# CreatePriorityDetails

Details of an issue priority.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**avatarId** | **Long** | The ID for the avatar for the priority. Either the iconUrl or avatarId must be defined, but not both. This parameter is nullable and will become mandatory once the iconUrl parameter is deprecated. |  [optional] |
|**description** | **String** | The description of the priority. |  [optional] |
|**iconUrl** | [**IconUrlEnum**](#IconUrlEnum) | The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used. Either the iconUrl or avatarId must be defined, but not both. |  [optional] |
|**name** | **String** | The name of the priority. Must be unique. |  |
|**statusColor** | **String** | The status color of the priority in 3-digit or 6-digit hexadecimal format. |  |



## Enum: IconUrlEnum

| Name | Value |
|---- | -----|
| _IMAGES_ICONS_PRIORITIES_BLOCKER_PNG | &quot;/images/icons/priorities/blocker.png&quot; |
| _IMAGES_ICONS_PRIORITIES_CRITICAL_PNG | &quot;/images/icons/priorities/critical.png&quot; |
| _IMAGES_ICONS_PRIORITIES_HIGH_PNG | &quot;/images/icons/priorities/high.png&quot; |
| _IMAGES_ICONS_PRIORITIES_HIGHEST_PNG | &quot;/images/icons/priorities/highest.png&quot; |
| _IMAGES_ICONS_PRIORITIES_LOW_PNG | &quot;/images/icons/priorities/low.png&quot; |
| _IMAGES_ICONS_PRIORITIES_LOWEST_PNG | &quot;/images/icons/priorities/lowest.png&quot; |
| _IMAGES_ICONS_PRIORITIES_MAJOR_PNG | &quot;/images/icons/priorities/major.png&quot; |
| _IMAGES_ICONS_PRIORITIES_MEDIUM_PNG | &quot;/images/icons/priorities/medium.png&quot; |
| _IMAGES_ICONS_PRIORITIES_MINOR_PNG | &quot;/images/icons/priorities/minor.png&quot; |
| _IMAGES_ICONS_PRIORITIES_TRIVIAL_PNG | &quot;/images/icons/priorities/trivial.png&quot; |
| _IMAGES_ICONS_PRIORITIES_BLOCKER_NEW_PNG | &quot;/images/icons/priorities/blocker_new.png&quot; |
| _IMAGES_ICONS_PRIORITIES_CRITICAL_NEW_PNG | &quot;/images/icons/priorities/critical_new.png&quot; |
| _IMAGES_ICONS_PRIORITIES_HIGH_NEW_PNG | &quot;/images/icons/priorities/high_new.png&quot; |
| _IMAGES_ICONS_PRIORITIES_HIGHEST_NEW_PNG | &quot;/images/icons/priorities/highest_new.png&quot; |
| _IMAGES_ICONS_PRIORITIES_LOW_NEW_PNG | &quot;/images/icons/priorities/low_new.png&quot; |
| _IMAGES_ICONS_PRIORITIES_LOWEST_NEW_PNG | &quot;/images/icons/priorities/lowest_new.png&quot; |
| _IMAGES_ICONS_PRIORITIES_MAJOR_NEW_PNG | &quot;/images/icons/priorities/major_new.png&quot; |
| _IMAGES_ICONS_PRIORITIES_MEDIUM_NEW_PNG | &quot;/images/icons/priorities/medium_new.png&quot; |
| _IMAGES_ICONS_PRIORITIES_MINOR_NEW_PNG | &quot;/images/icons/priorities/minor_new.png&quot; |
| _IMAGES_ICONS_PRIORITIES_TRIVIAL_NEW_PNG | &quot;/images/icons/priorities/trivial_new.png&quot; |



