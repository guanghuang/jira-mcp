

# BuildCommitReference

Details about the commit the build was run against. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the commit. E.g. for a Git repository this would be the SHA1 hash.  |  |
|**repositoryUri** | **String** | An identifier for the repository containing the commit.  In most cases this should be the URL of the repository in the SCM provider.  For cases where the build was executed against a local repository etc. this should be some identifier that is unique to that repository.  |  |



