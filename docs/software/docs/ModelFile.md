

# ModelFile

Describes changes to a file

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**path** | **String** | The path of the file. Max length is 1024 characters. |  |
|**url** | **String** | The URL of this file. Max length is 2000 characters. |  |
|**changeType** | [**ChangeTypeEnum**](#ChangeTypeEnum) | The operation performed on this file |  |
|**linesAdded** | **Integer** | Number of lines added to the file |  |
|**linesRemoved** | **Integer** | Number of lines removed from the file |  |



## Enum: ChangeTypeEnum

| Name | Value |
|---- | -----|
| ADDED | &quot;ADDED&quot; |
| COPIED | &quot;COPIED&quot; |
| DELETED | &quot;DELETED&quot; |
| MODIFIED | &quot;MODIFIED&quot; |
| MOVED | &quot;MOVED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



