# RemoteLinksApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRemoteLinkById**](RemoteLinksApi.md#deleteRemoteLinkById) | **DELETE** /rest/remotelinks/1.0/remotelink/{remoteLinkId} | Delete a Remote Link by ID |
| [**deleteRemoteLinksByProperty**](RemoteLinksApi.md#deleteRemoteLinksByProperty) | **DELETE** /rest/remotelinks/1.0/bulkByProperties | Delete Remote Links by Property |
| [**getRemoteLinkById**](RemoteLinksApi.md#getRemoteLinkById) | **GET** /rest/remotelinks/1.0/remotelink/{remoteLinkId} | Get a Remote Link by ID |
| [**submitRemoteLinks**](RemoteLinksApi.md#submitRemoteLinks) | **POST** /rest/remotelinks/1.0/bulk | Submit Remote Link data |


<a id="deleteRemoteLinkById"></a>
# **deleteRemoteLinkById**
> deleteRemoteLinkById(authorization, remoteLinkId, updateSequenceNumber)

Delete a Remote Link by ID

Delete the Remote Link data currently stored for the given ID.  Deletion is performed asynchronously. The &#x60;getRemoteLinkById&#x60; operation can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraRemoteLinkInfoProvider&#x60; module, and on-premise integrations, can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.RemoteLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    RemoteLinksApi apiInstance = new RemoteLinksApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define `jiraRemoteLinkInfoProvider` module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations. 
    String remoteLinkId = "remoteLinkId_example"; // String | The ID of the Remote Link to fetch. 
    Long updateSequenceNumber = 56L; // Long | This parameter usage is no longer supported.  An optional `_updateSequenceNumber` to use to control deletion.  Only stored data with an `updateSequenceNumber` less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together. 
    try {
      apiInstance.deleteRemoteLinkById(authorization, remoteLinkId, updateSequenceNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling RemoteLinksApi#deleteRemoteLinkById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**| All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define &#x60;jiraRemoteLinkInfoProvider&#x60; module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations.  | |
| **remoteLinkId** | **String**| The ID of the Remote Link to fetch.  | |
| **updateSequenceNumber** | **Long**| This parameter usage is no longer supported.  An optional &#x60;_updateSequenceNumber&#x60; to use to control deletion.  Only stored data with an &#x60;updateSequenceNumber&#x60; less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together.  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Delete has been accepted. Data will eventually be removed from Jira if it exists.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraRemoteLinkInfoProvider&#x60; module, or the app does not define the &#39;DELETE&#39; scope.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="deleteRemoteLinksByProperty"></a>
# **deleteRemoteLinksByProperty**
> deleteRemoteLinksByProperty(authorization, updateSequenceNumber, params)

Delete Remote Links by Property

Bulk delete all Remote Links data that match the given request.  One or more query params must be supplied to specify Properties to delete by. Optional param &#x60;_updateSequenceNumber&#x60; is no longer supported. If more than one Property is provided, data will be deleted that matches ALL of the Properties (e.g. treated as an AND).  See the documentation for the &#x60;submitRemoteLinks&#x60; operation for more details.  e.g. DELETE /bulkByProperties?accountId&#x3D;account-123&amp;repoId&#x3D;repo-345  Deletion is performed asynchronously. The &#x60;getRemoteLinkById&#x60; operation can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraRemoteLinkInfoProvider&#x60; module, and on-premise integrations, can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.RemoteLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    RemoteLinksApi apiInstance = new RemoteLinksApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define `jiraRemoteLinkInfoProvider` module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations. 
    Long updateSequenceNumber = 56L; // Long | This parameter usage is no longer supported.  An optional `_updateSequenceNumber` to use to control deletion.  Only stored data with an `updateSequenceNumber` less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together.  If not provided, all stored data that matches the request will be deleted. 
    Object params = null; // Object | Free-form query parameters to specify which properties to delete by. Properties refer to the arbitrary information the provider tagged Remote Links with previously.  For example, if the provider previously tagged a remote link with accountId:   \"properties\": {     \"accountId\": \"account-123\"   }  And now they want to delete Remote Links in bulk by that specific accountId as follows: e.g. DELETE /bulkByProperties?accountId=account-123 
    try {
      apiInstance.deleteRemoteLinksByProperty(authorization, updateSequenceNumber, params);
    } catch (ApiException e) {
      System.err.println("Exception when calling RemoteLinksApi#deleteRemoteLinksByProperty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**| All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define &#x60;jiraRemoteLinkInfoProvider&#x60; module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations.  | |
| **updateSequenceNumber** | **Long**| This parameter usage is no longer supported.  An optional &#x60;_updateSequenceNumber&#x60; to use to control deletion.  Only stored data with an &#x60;updateSequenceNumber&#x60; less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together.  If not provided, all stored data that matches the request will be deleted.  | [optional] |
| **params** | [**Object**](.md)| Free-form query parameters to specify which properties to delete by. Properties refer to the arbitrary information the provider tagged Remote Links with previously.  For example, if the provider previously tagged a remote link with accountId:   \&quot;properties\&quot;: {     \&quot;accountId\&quot;: \&quot;account-123\&quot;   }  And now they want to delete Remote Links in bulk by that specific accountId as follows: e.g. DELETE /bulkByProperties?accountId&#x3D;account-123  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Delete accepted. Data will eventually be removed from Jira.  |  -  |
| **400** | Request has incorrect format (e.g. missing at least one Property param).  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraRemoteLinkInfoProvider&#x60; module, or the app does not define the &#39;DELETE&#39; scope.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="getRemoteLinkById"></a>
# **getRemoteLinkById**
> RemoteLinkData getRemoteLinkById(authorization, remoteLinkId)

Get a Remote Link by ID

Retrieve the currently stored Remote Link data for the given ID.  The result will be what is currently stored, ignoring any pending updates or deletes.  Only Connect apps that define the &#x60;jiraRemoteLinkInfoProvider&#x60; module, and on-premise integrations, can access this resource. This resource requires the &#39;READ&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.RemoteLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    RemoteLinksApi apiInstance = new RemoteLinksApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define `jiraRemoteLinkInfoProvider` module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations. 
    String remoteLinkId = "remoteLinkId_example"; // String | The ID of the Remote Link to fetch. 
    try {
      RemoteLinkData result = apiInstance.getRemoteLinkById(authorization, remoteLinkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RemoteLinksApi#getRemoteLinkById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**| All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define &#x60;jiraRemoteLinkInfoProvider&#x60; module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations.  | |
| **remoteLinkId** | **String**| The ID of the Remote Link to fetch.  | |

### Return type

[**RemoteLinkData**](RemoteLinkData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Remote Link data currently stored for the given ID.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraRemoteLinkInfoProvider&#x60; module, or the app does not define the &#39;READ&#39; scope.  |  -  |
| **404** | No Remote Link data found for the given ID.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="submitRemoteLinks"></a>
# **submitRemoteLinks**
> SubmitRemoteLinks202Response submitRemoteLinks(authorization, submitRemoteLinksRequest)

Submit Remote Link data

Update / insert Remote Link data.  Remote Links are identified by their ID, existing Remote Link data for the same ID will be replaced if it exists and the updateSequenceId of existing data is less than the incoming data.  Submissions are performed asynchronously. Submitted data will eventually be available in Jira; most updates are available within a short period of time, but may take some time during peak load and/or maintenance times. The &#x60;getRemoteLinkById&#x60; operation can be used to confirm that data has been stored successfully (if needed).  In the case of multiple Remote Links being submitted in one request, each is validated individually prior to submission. Details of which Remote LInk failed submission (if any) are available in the response object.  Only Connect apps that define the &#x60;jiraRemoteLinkInfoProvider&#x60; module can access this resource. This resource requires the &#39;WRITE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.RemoteLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    RemoteLinksApi apiInstance = new RemoteLinksApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define `jiraRemoteLinkInfoProvider` module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations. 
    SubmitRemoteLinksRequest submitRemoteLinksRequest = new SubmitRemoteLinksRequest(); // SubmitRemoteLinksRequest | Remote Links data to submit. 
    try {
      SubmitRemoteLinks202Response result = apiInstance.submitRemoteLinks(authorization, submitRemoteLinksRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RemoteLinksApi#submitRemoteLinks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define &#x60;jiraRemoteLinkInfoProvider&#x60; module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations.  | |
| **submitRemoteLinksRequest** | [**SubmitRemoteLinksRequest**](SubmitRemoteLinksRequest.md)| Remote Links data to submit.  | |

### Return type

[**SubmitRemoteLinks202Response**](SubmitRemoteLinks202Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Submission accepted. Each submitted Remote Link that is of a valid format will be eventually available in Jira.  Details of which Remote Links were submitted and which failed submission (due to data format problems etc.) are available in the response object.  |  -  |
| **400** | Request has incorrect format.  Note that in the case of an individual Remote Link having an invalid format (rather than the request as a whole) the response for the request will be a 202 and details of the invalid Remote Link will be contained in the response object.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraRemoteLinkInfoProvider&#x60; module, or the app does not define the &#39;WRITE&#39; scope.  |  -  |
| **413** | Data is too large. Submit fewer Remote Links in each payload.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

