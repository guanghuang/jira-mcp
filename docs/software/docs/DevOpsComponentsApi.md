# DevOpsComponentsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteComponentById**](DevOpsComponentsApi.md#deleteComponentById) | **DELETE** /rest/devopscomponents/1.0/{componentId} | Delete a Component by ID |
| [**deleteComponentsByProperty**](DevOpsComponentsApi.md#deleteComponentsByProperty) | **DELETE** /rest/devopscomponents/1.0/bulkByProperties | Delete DevOps Components by Property |
| [**getComponentById**](DevOpsComponentsApi.md#getComponentById) | **GET** /rest/devopscomponents/1.0/{componentId} | Get a Component by ID |
| [**submitComponents**](DevOpsComponentsApi.md#submitComponents) | **POST** /rest/devopscomponents/1.0/bulk | Submit DevOps Components |


<a id="deleteComponentById"></a>
# **deleteComponentById**
> deleteComponentById(authorization, componentId)

Delete a Component by ID

Delete the Component data currently stored for the given ID.  Deletion is performed asynchronously. The getComponentById operation can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraDevOpsComponentProvider&#x60; module can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.DevOpsComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    DevOpsComponentsApi apiInstance = new DevOpsComponentsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Operations Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    String componentId = "componentId_example"; // String | The ID of the Component to delete. 
    try {
      apiInstance.deleteComponentById(authorization, componentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevOpsComponentsApi#deleteComponentById");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Operations Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details.  | |
| **componentId** | **String**| The ID of the Component to delete.  | |

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
| **403** | The JWT token used does not correspond to an app that defines the Operations Information module, or the app does not define the &#39;DELETE&#39; scope.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="deleteComponentsByProperty"></a>
# **deleteComponentsByProperty**
> deleteComponentsByProperty(authorization)

Delete DevOps Components by Property

Bulk delete all Components that match the given request.  One or more query params must be supplied to specify Properties to delete by. If more than one Property is provided, data will be deleted that matches ALL of the Properties (e.g. treated as an AND). See the documentation for the submitComponents operation for more details.  e.g. DELETE /bulkByProperties?accountId&#x3D;account-123&amp;createdBy&#x3D;user-456  Deletion is performed asynchronously. The getComponentById operation can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraDevOpsComponentProvider&#x60; module can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.DevOpsComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    DevOpsComponentsApi apiInstance = new DevOpsComponentsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Operations Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    try {
      apiInstance.deleteComponentsByProperty(authorization);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevOpsComponentsApi#deleteComponentsByProperty");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Operations Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details.  | |

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
| **403** | The JWT token used does not correspond to an app that defines the Operations Information module, or the app does not define the &#39;DELETE&#39; scope.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="getComponentById"></a>
# **getComponentById**
> GetComponentById200Response getComponentById(authorization, componentId)

Get a Component by ID

Retrieve the currently stored Component data for the given ID.  The result will be what is currently stored, ignoring any pending updates or deletes.  Only Connect apps that define the &#x60;jiraDevOpsComponentProvider&#x60; module can access this resource. This resource requires the &#39;READ&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.DevOpsComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    DevOpsComponentsApi apiInstance = new DevOpsComponentsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Operations Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    String componentId = "componentId_example"; // String | The ID of the Component to fetch. 
    try {
      GetComponentById200Response result = apiInstance.getComponentById(authorization, componentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevOpsComponentsApi#getComponentById");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Operations Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details.  | |
| **componentId** | **String**| The ID of the Component to fetch.  | |

### Return type

[**GetComponentById200Response**](GetComponentById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Component data currently stored for the given ID.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the Operations Information module, or the app does not define the &#39;READ&#39; scope.  |  -  |
| **404** | No data found for the given Component ID.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="submitComponents"></a>
# **submitComponents**
> SubmitDevopsComponentsResponse submitComponents(authorization, submitDevopsComponentsRequest)

Submit DevOps Components

Update / insert DevOps Component data.  Components are identified by their ID, and existing Component data for the same ID will be replaced if it exists and the updateSequenceNumber of existing data is less than the incoming data.  Submissions are performed asynchronously. Submitted data will eventually be available in Jira; most updates are available within a short period of time, but may take some time during peak load and/or maintenance times. The getComponentById operation can be used to confirm that data has been stored successfully (if needed).  In the case of multiple Components being submitted in one request, each is validated individually prior to submission. Details of which Components failed submission (if any) are available in the response object.  A maximum of 1000 components can be submitted in one request.  Only Connect apps that define the &#x60;jiraDevOpsComponentProvider&#x60; module can access this resource. This resource requires the &#39;WRITE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.DevOpsComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    DevOpsComponentsApi apiInstance = new DevOpsComponentsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the DevOps Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    SubmitDevopsComponentsRequest submitDevopsComponentsRequest = new SubmitDevopsComponentsRequest(); // SubmitDevopsComponentsRequest | DevOps Component data to submit. 
    try {
      SubmitDevopsComponentsResponse result = apiInstance.submitComponents(authorization, submitDevopsComponentsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevOpsComponentsApi#submitComponents");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the DevOps Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details.  | |
| **submitDevopsComponentsRequest** | [**SubmitDevopsComponentsRequest**](SubmitDevopsComponentsRequest.md)| DevOps Component data to submit.  | |

### Return type

[**SubmitDevopsComponentsResponse**](SubmitDevopsComponentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Submission accepted. Each submitted Component that is of a valid format will be eventually available in Jira. Details of which Components were submitted and which failed submission (due to data format problems etc.) are available in the response object.  |  -  |
| **400** | Request has incorrect format.  Note that in the case of an individual Component having an invalid format (rather than the request as a whole) the response for the request will be a 202 and details of the invalid Component will be contained in the response object.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the Operations Information module, or the app does not define the &#39;WRITE&#39; scope.  |  -  |
| **413** | Data is too large. Submit fewer Components in each payload.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

