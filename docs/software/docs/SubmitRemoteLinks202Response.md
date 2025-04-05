

# SubmitRemoteLinks202Response

The result of a successful `submitRemoteLinks` request. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedRemoteLinks** | **List&lt;String&gt;** | The IDs of Remote Links that have been accepted for submission.  A Remote Link may be rejected if it was only associated with unknown issue keys, unknown service IDs, or if the submitted data for that Remote Link does not match the required schema.  Note that a Remote Link that isn&#39;t updated due to it&#39;s &#x60;updateSequenceNumber&#x60; being out of order is not considered a failed submission.  |  [optional] |
|**rejectedRemoteLinks** | **Map&lt;String, List&lt;SubmitRemoteLinks202ResponseRejectedRemoteLinksValueInner&gt;&gt;** | Details of Remote Links that have not been accepted for submission, usually due to a problem with the request data.  A Remote Link may be rejected if it was only associated with unknown issue keys, unknown service IDs, or if the submitted data for the Remote Link does not match the required schema.  The object (if present) will be keyed by Remote Link ID and include any errors associated with that Remote Link that have prevented it being submitted.  |  [optional] |
|**unknownAssociations** | [**List&lt;RemoteLinkDataAssociationsInner&gt;**](RemoteLinkDataAssociationsInner.md) | Issue keys or services IDs or keys that are not known on this Jira instance (if any).  |  [optional] |



