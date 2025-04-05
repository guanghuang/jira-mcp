# OperationsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteEntityByProperty**](OperationsApi.md#deleteEntityByProperty) | **DELETE** /rest/operations/1.0/bulkByProperties | Delete Incidents or Review by Property |
| [**deleteIncidentById**](OperationsApi.md#deleteIncidentById) | **DELETE** /rest/operations/1.0/incidents/{incidentId} | Delete a Incident by ID |
| [**deleteReviewById**](OperationsApi.md#deleteReviewById) | **DELETE** /rest/operations/1.0/post-incident-reviews/{reviewId} | Delete a Review by ID |
| [**deleteWorkspaces**](OperationsApi.md#deleteWorkspaces) | **DELETE** /rest/operations/1.0/linkedWorkspaces/bulk | Delete Operations Workpaces by Id |
| [**getIncidentById**](OperationsApi.md#getIncidentById) | **GET** /rest/operations/1.0/incidents/{incidentId} | Get a Incident by ID |
| [**getReviewById**](OperationsApi.md#getReviewById) | **GET** /rest/operations/1.0/post-incident-reviews/{reviewId} | Get a Review by ID |
| [**getWorkspaces**](OperationsApi.md#getWorkspaces) | **GET** /rest/operations/1.0/linkedWorkspaces | Get all Operations Workspace IDs or a specific Operations Workspace by ID |
| [**submitEntity**](OperationsApi.md#submitEntity) | **POST** /rest/operations/1.0/bulk | Submit Incident or Review data |
| [**submitOperationsWorkspaces**](OperationsApi.md#submitOperationsWorkspaces) | **POST** /rest/operations/1.0/linkedWorkspaces/bulk | Submit Operations Workspace Ids |


<a id="deleteEntityByProperty"></a>
# **deleteEntityByProperty**
> deleteEntityByProperty(authorization)

Delete Incidents or Review by Property

Bulk delete all Entties that match the given request.  One or more query params must be supplied to specify Properties to delete by. If more than one Property is provided, data will be deleted that matches ALL of the Properties (e.g. treated as an AND). See the documentation for the submitEntity operation for more details.  e.g. DELETE /bulkByProperties?accountId&#x3D;account-123&amp;createdBy&#x3D;user-456  Deletion is performed asynchronously. The getIncidentById operation can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraOperationsInfoProvider&#x60; module can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Operations Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    try {
      apiInstance.deleteEntityByProperty(authorization);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#deleteEntityByProperty");
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

<a id="deleteIncidentById"></a>
# **deleteIncidentById**
> deleteIncidentById(authorization, incidentId)

Delete a Incident by ID

Delete the Incident data currently stored for the given ID.  Deletion is performed asynchronously. The getIncidentById operation can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraOperationsInfoProvider&#x60; module can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Operations Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    String incidentId = "incidentId_example"; // String | The ID of the Incident to delete. 
    try {
      apiInstance.deleteIncidentById(authorization, incidentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#deleteIncidentById");
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
| **incidentId** | **String**| The ID of the Incident to delete.  | |

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

<a id="deleteReviewById"></a>
# **deleteReviewById**
> deleteReviewById(authorization, reviewId)

Delete a Review by ID

Delete the Review data currently stored for the given ID.  Deletion is performed asynchronously. The getReviewById operation can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraOperationsInfoProvider&#x60; module can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Operations Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    String reviewId = "reviewId_example"; // String | The ID of the Review to delete. 
    try {
      apiInstance.deleteReviewById(authorization, reviewId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#deleteReviewById");
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
| **reviewId** | **String**| The ID of the Review to delete.  | |

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

<a id="deleteWorkspaces"></a>
# **deleteWorkspaces**
> deleteWorkspaces(authorization)

Delete Operations Workpaces by Id

Bulk delete all Operations Workspaces that match the given request.  Only Connect apps that define the &#x60;jiraOperationsInfoProvider&#x60; module can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps.  e.g. DELETE /bulk?workspaceIds&#x3D;111-222-333,444-555-666 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Operations module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    try {
      apiInstance.deleteWorkspaces(authorization);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#deleteWorkspaces");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Operations module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details.  | |

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
| **202** | Delete accepted. Workspaces and relate data will eventually be removed from Jira.  |  -  |
| **400** | Request has incorrect format.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the Operations Information module, or the app does not define the &#39;DELETE&#39; scope.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="getIncidentById"></a>
# **getIncidentById**
> GetIncidentById200Response getIncidentById(authorization, incidentId)

Get a Incident by ID

Retrieve the currently stored Incident data for the given ID.  The result will be what is currently stored, ignoring any pending updates or deletes.  Only Connect apps that define the &#x60;jiraOperationsInfoProvider&#x60; module can access this resource. This resource requires the &#39;READ&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Operations Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    String incidentId = "incidentId_example"; // String | The ID of the Incident to fetch. 
    try {
      GetIncidentById200Response result = apiInstance.getIncidentById(authorization, incidentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#getIncidentById");
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
| **incidentId** | **String**| The ID of the Incident to fetch.  | |

### Return type

[**GetIncidentById200Response**](GetIncidentById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Incident data currently stored for the given ID.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the Operations Information module, or the app does not define the &#39;READ&#39; scope.  |  -  |
| **404** | No data found for the given Incident ID.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="getReviewById"></a>
# **getReviewById**
> GetReviewById200Response getReviewById(authorization, reviewId)

Get a Review by ID

Retrieve the currently stored Review data for the given ID.  The result will be what is currently stored, ignoring any pending updates or deletes.  Only Connect apps that define the &#x60;jiraOperationsInfoProvider&#x60; module can access this resource. This resource requires the &#39;READ&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Operations Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    String reviewId = "reviewId_example"; // String | The ID of the Review to fetch. 
    try {
      GetReviewById200Response result = apiInstance.getReviewById(authorization, reviewId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#getReviewById");
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
| **reviewId** | **String**| The ID of the Review to fetch.  | |

### Return type

[**GetReviewById200Response**](GetReviewById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Review data currently stored for the given ID.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the Operations Information module, or the app does not define the &#39;READ&#39; scope.  |  -  |
| **404** | No data found for the given Review ID.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="getWorkspaces"></a>
# **getWorkspaces**
> OperationsWorkspaceIds getWorkspaces(authorization)

Get all Operations Workspace IDs or a specific Operations Workspace by ID

Retrieve the either all Operations Workspace IDs associated with the Jira site or a specific Operations Workspace ID for the given ID.  The result will be what is currently stored, ignoring any pending updates or deletes.  e.g. GET /workspace?workspaceId&#x3D;111-222-333  Only Connect apps that define the &#x60;jiraOperationsInfoProvider&#x60; module can access this resource. This resource requires the &#39;READ&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Operations Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    try {
      OperationsWorkspaceIds result = apiInstance.getWorkspaces(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#getWorkspaces");
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

[**OperationsWorkspaceIds**](OperationsWorkspaceIds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Either the ID provided if stored or a list of available IDs.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the Operations Information module, or the app does not define the &#39;READ&#39; scope.  |  -  |
| **404** | No data found for the given Workspace ID.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="submitEntity"></a>
# **submitEntity**
> SubmitIncidentsResponse submitEntity(authorization, submitIncidentsRequest)

Submit Incident or Review data

Update / insert Incident or Review data.  Incidents and reviews are identified by their ID, and existing Incident and Review data for the same ID will be replaced if it exists and the updateSequenceNumber of existing data is less than the incoming data.  Submissions are performed asynchronously. Submitted data will eventually be available in Jira; most updates are available within a short period of time, but may take some time during peak load and/or maintenance times. The getIncidentById or getReviewById operation can be used to confirm that data has been stored successfully (if needed).  In the case of multiple Incidents and Reviews being submitted in one request, each is validated individually prior to submission. Details of which entities failed submission (if any) are available in the response object.  A maximum of 1000 incidents can be submitted in one request.  Only Connect apps that define the &#x60;jiraOperationsInfoProvider&#x60; module can access this resource. This resource requires the &#39;WRITE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Operations Information module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    SubmitIncidentsRequest submitIncidentsRequest = new SubmitIncidentsRequest(); // SubmitIncidentsRequest | Incident data to submit. 
    try {
      SubmitIncidentsResponse result = apiInstance.submitEntity(authorization, submitIncidentsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#submitEntity");
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
| **submitIncidentsRequest** | [**SubmitIncidentsRequest**](SubmitIncidentsRequest.md)| Incident data to submit.  | |

### Return type

[**SubmitIncidentsResponse**](SubmitIncidentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Submission accepted. Each submitted Incident that is of a valid format will be eventually available in Jira.  Details of which Incidents were submitted and which failed submission (due to data format problems etc.) are available in the response object.  |  -  |
| **400** | Request has incorrect format.  Note that in the case of an individual Incident having an invalid format (rather than the request as a whole) the response for the request will be a 202 and details of the invalid Incident will be contained in the response object.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the Operations Information module, or the app does not define the &#39;WRITE&#39; scope.  |  -  |
| **413** | Data is too large. Submit fewer Incidents in each payload.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="submitOperationsWorkspaces"></a>
# **submitOperationsWorkspaces**
> SubmitOperationsWorkspacesResponse submitOperationsWorkspaces(authorization, submitOperationsWorkspacesRequest)

Submit Operations Workspace Ids

Insert Operations Workspace IDs to establish a relationship between them and the Jira site the app is installed in. If a relationship between the Workspace ID and Jira already exists then the workspace ID will be ignored and Jira will process the rest of the entries.  Only Connect apps that define the &#x60;jiraOperationsInfoProvider&#x60; module can access this resource. This resource requires the &#39;WRITE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Operations module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    SubmitOperationsWorkspacesRequest submitOperationsWorkspacesRequest = new SubmitOperationsWorkspacesRequest(); // SubmitOperationsWorkspacesRequest | Operations Workspace ids to submit. 
    try {
      SubmitOperationsWorkspacesResponse result = apiInstance.submitOperationsWorkspaces(authorization, submitOperationsWorkspacesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#submitOperationsWorkspaces");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Operations module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details.  | |
| **submitOperationsWorkspacesRequest** | [**SubmitOperationsWorkspacesRequest**](SubmitOperationsWorkspacesRequest.md)| Operations Workspace ids to submit.  | |

### Return type

[**SubmitOperationsWorkspacesResponse**](SubmitOperationsWorkspacesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Submission accepted. Each submitted Operations Workspace ID will be linked to Jira.  |  -  |
| **400** | Request has incorrect format.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the Operations module, or the app does not define the &#39;WRITE&#39; scope.  |  -  |
| **413** | Set of Ids is too large. Submit fewer Ids in each payload.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

