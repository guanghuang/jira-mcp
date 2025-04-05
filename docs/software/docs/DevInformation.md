

# DevInformation

Request object for development information push operations, entities are grouped by repository

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**repositories** | [**List&lt;Repository&gt;**](Repository.md) | List of repositories containing development information. Must not contain duplicates. Maximum number of entities across all repositories is 1000. |  |
|**preventTransitions** | **Boolean** | Flag to prevent automatic issue transitions and smart commits being fired, default is false. |  [optional] |
|**operationType** | [**OperationTypeEnum**](#OperationTypeEnum) | Indicates the operation being performed by the provider system when sending this data. \&quot;NORMAL\&quot; - Data received during normal operation (e.g. a user pushing a branch). \&quot;BACKFILL\&quot; - Data received while backfilling existing data (e.g. indexing a newly connected account). Default is \&quot;NORMAL\&quot;. Please note that \&quot;BACKFILL\&quot; operations have a much higher rate-limiting threshold but are also processed slower in comparison to \&quot;NORMAL\&quot; operations. |  [optional] |
|**properties** | **Map&lt;String, String&gt;** | Arbitrary properties to tag the submitted repositories with. These properties can be used for delete operations to e.g. clean up all development information associated with an account in the event that the account is removed from the provider system. Note that these properties will never be returned with repository or entity data. They are not intended for use as metadata to associate with a repository. Maximum length of each key or value is 255 characters. Maximum allowed number of properties key/value pairs is 5. Properties keys cannot start with &#39;_&#39; character. Properties keys cannot contain &#39;:&#39; character.  |  [optional] |
|**providerMetadata** | [**ProviderMetadata**](ProviderMetadata.md) |  |  [optional] |



## Enum: OperationTypeEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| BACKFILL | &quot;BACKFILL&quot; |



