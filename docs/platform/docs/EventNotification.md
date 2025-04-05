

# EventNotification

Details about a notification associated with an event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAddress** | **String** | The email address. |  [optional] |
|**expand** | **String** | Expand options that include additional event notification details in the response. |  [optional] |
|**field** | [**FieldDetails**](FieldDetails.md) | The custom user or group field. |  [optional] |
|**group** | [**GroupName**](GroupName.md) | The specified group. |  [optional] |
|**id** | **Long** | The ID of the notification. |  [optional] |
|**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) | Identifies the recipients of the notification. |  [optional] |
|**parameter** | **String** | As a group&#39;s name can change, use of &#x60;recipient&#x60; is recommended. The identifier associated with the &#x60;notificationType&#x60; value that defines the receiver of the notification, where the receiver isn&#39;t implied by &#x60;notificationType&#x60; value. So, when &#x60;notificationType&#x60; is:   *  &#x60;User&#x60; The &#x60;parameter&#x60; is the user account ID.  *  &#x60;Group&#x60; The &#x60;parameter&#x60; is the group name.  *  &#x60;ProjectRole&#x60; The &#x60;parameter&#x60; is the project role ID.  *  &#x60;UserCustomField&#x60; The &#x60;parameter&#x60; is the ID of the custom field.  *  &#x60;GroupCustomField&#x60; The &#x60;parameter&#x60; is the ID of the custom field. |  [optional] |
|**projectRole** | [**ProjectRole**](ProjectRole.md) | The specified project role. |  [optional] |
|**recipient** | **String** | The identifier associated with the &#x60;notificationType&#x60; value that defines the receiver of the notification, where the receiver isn&#39;t implied by the &#x60;notificationType&#x60; value. So, when &#x60;notificationType&#x60; is:   *  &#x60;User&#x60;, &#x60;recipient&#x60; is the user account ID.  *  &#x60;Group&#x60;, &#x60;recipient&#x60; is the group ID.  *  &#x60;ProjectRole&#x60;, &#x60;recipient&#x60; is the project role ID.  *  &#x60;UserCustomField&#x60;, &#x60;recipient&#x60; is the ID of the custom field.  *  &#x60;GroupCustomField&#x60;, &#x60;recipient&#x60; is the ID of the custom field. |  [optional] |
|**user** | [**UserDetails**](UserDetails.md) | The specified user. |  [optional] |



## Enum: NotificationTypeEnum

| Name | Value |
|---- | -----|
| CURRENT_ASSIGNEE | &quot;CurrentAssignee&quot; |
| REPORTER | &quot;Reporter&quot; |
| CURRENT_USER | &quot;CurrentUser&quot; |
| PROJECT_LEAD | &quot;ProjectLead&quot; |
| COMPONENT_LEAD | &quot;ComponentLead&quot; |
| USER | &quot;User&quot; |
| GROUP | &quot;Group&quot; |
| PROJECT_ROLE | &quot;ProjectRole&quot; |
| EMAIL_ADDRESS | &quot;EmailAddress&quot; |
| ALL_WATCHERS | &quot;AllWatchers&quot; |
| USER_CUSTOM_FIELD | &quot;UserCustomField&quot; |
| GROUP_CUSTOM_FIELD | &quot;GroupCustomField&quot; |



