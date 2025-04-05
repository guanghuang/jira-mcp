

# ChangelogAuthor

The user who made the change.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. |  [optional] |
|**accountType** | **String** | The type of account represented by this user. This will be one of &#39;atlassian&#39; (normal users), &#39;app&#39; (application user) or &#39;customer&#39; (Jira Service Desk customer user) |  [optional] [readonly] |
|**active** | **Boolean** | Whether the user is active. |  [optional] [readonly] |
|**avatarUrls** | [**ChangelogAuthorAllOfAvatarUrls**](ChangelogAuthorAllOfAvatarUrls.md) |  |  [optional] |
|**displayName** | **String** | The display name of the user. Depending on the user’s privacy settings, this may return an alternative value. |  [optional] [readonly] |
|**emailAddress** | **String** | The email address of the user. Depending on the user’s privacy settings, this may be returned as null. |  [optional] [readonly] |
|**key** | **String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional] [readonly] |
|**name** | **String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional] [readonly] |
|**self** | **String** | The URL of the user. |  [optional] [readonly] |
|**timeZone** | **String** | The time zone specified in the user&#39;s profile. Depending on the user’s privacy settings, this may be returned as null. |  [optional] [readonly] |



