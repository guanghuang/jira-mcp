# SecurityInformationApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteLinkedWorkspaces**](SecurityInformationApi.md#deleteLinkedWorkspaces) | **DELETE** /rest/security/1.0/linkedWorkspaces/bulk | Delete linked Security Workspaces |
| [**deleteVulnerabilitiesByProperty**](SecurityInformationApi.md#deleteVulnerabilitiesByProperty) | **DELETE** /rest/security/1.0/bulkByProperties | Delete Vulnerabilities by Property |
| [**deleteVulnerabilityById**](SecurityInformationApi.md#deleteVulnerabilityById) | **DELETE** /rest/security/1.0/vulnerability/{vulnerabilityId} | Delete a Vulnerability by ID |
| [**getLinkedWorkspaceById**](SecurityInformationApi.md#getLinkedWorkspaceById) | **GET** /rest/security/1.0/linkedWorkspaces/{workspaceId} | Get a linked Security Workspace by ID |
| [**getLinkedWorkspaces**](SecurityInformationApi.md#getLinkedWorkspaces) | **GET** /rest/security/1.0/linkedWorkspaces | Get linked Security Workspaces |
| [**getVulnerabilityById**](SecurityInformationApi.md#getVulnerabilityById) | **GET** /rest/security/1.0/vulnerability/{vulnerabilityId} | Get a Vulnerability by ID |
| [**submitVulnerabilities**](SecurityInformationApi.md#submitVulnerabilities) | **POST** /rest/security/1.0/bulk | Submit Vulnerability data |
| [**submitWorkspaces**](SecurityInformationApi.md#submitWorkspaces) | **POST** /rest/security/1.0/linkedWorkspaces/bulk | Submit Security Workspaces to link |


<a id="deleteLinkedWorkspaces"></a>
# **deleteLinkedWorkspaces**
> deleteLinkedWorkspaces(authorization)

Delete linked Security Workspaces

Bulk delete all linked Security Workspaces that match the given request.  Only Connect apps that define the &#x60;jiraSecurityInfoProvider&#x60; module can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps.  e.g. DELETE /bulk?workspaceIds&#x3D;111-222-333,444-555-666 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SecurityInformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    SecurityInformationApi apiInstance = new SecurityInformationApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Security Information module it will be rejected with a 403.  Read [understanding jwt](https://developer.atlassian.com/blog/2015/01/understanding-jwt/) for more details. 
    try {
      apiInstance.deleteLinkedWorkspaces(authorization);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityInformationApi#deleteLinkedWorkspaces");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Security Information module it will be rejected with a 403.  Read [understanding jwt](https://developer.atlassian.com/blog/2015/01/understanding-jwt/) for more details.  | |

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
| **202** | Delete accepted. Workspaces and related data will eventually be removed from Jira.  |  -  |
| **400** | Request has incorrect format.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraSecurityInfoProvider&#x60; module, or the app does not define the &#39;DELETE&#39; scope.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="deleteVulnerabilitiesByProperty"></a>
# **deleteVulnerabilitiesByProperty**
> deleteVulnerabilitiesByProperty(authorization)

Delete Vulnerabilities by Property

Bulk delete all Vulnerabilities that match the given request.  One or more query params must be supplied to specify Properties to delete by. If more than one Property is provided, data will be deleted that matches ALL of the Properties (e.g. treated as an AND). Read the POST bulk endpoint documentation for more details.  e.g. DELETE /bulkByProperties?accountId&#x3D;account-123&amp;createdBy&#x3D;user-456  Deletion is performed asynchronously. The GET vulnerability endpoint can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraSecurityInfoProvider&#x60; module can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SecurityInformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    SecurityInformationApi apiInstance = new SecurityInformationApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Security Information module it will be rejected with a 403.  Read more about JWT [here](https://developer.atlassian.com/blog/2015/01/understanding-jwt/). 
    try {
      apiInstance.deleteVulnerabilitiesByProperty(authorization);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityInformationApi#deleteVulnerabilitiesByProperty");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Security Information module it will be rejected with a 403.  Read more about JWT [here](https://developer.atlassian.com/blog/2015/01/understanding-jwt/).  | |

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
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraSecurityInfoProvider&#x60; module, or the app does not define the &#39;DELETE&#39; scope.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="deleteVulnerabilityById"></a>
# **deleteVulnerabilityById**
> deleteVulnerabilityById(authorization, vulnerabilityId)

Delete a Vulnerability by ID

Delete the Vulnerability data currently stored for the given ID.  Deletion is performed asynchronously. The GET vulnerability endpoint can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraSecurityInfoProvider&#x60; module can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SecurityInformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    SecurityInformationApi apiInstance = new SecurityInformationApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Security Information module it will be rejected with a 403.  Read more about JWT [here](https://developer.atlassian.com/blog/2015/01/understanding-jwt/). 
    String vulnerabilityId = "vulnerabilityId_example"; // String | The ID of the Vulnerability to delete. 
    try {
      apiInstance.deleteVulnerabilityById(authorization, vulnerabilityId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityInformationApi#deleteVulnerabilityById");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Security Information module it will be rejected with a 403.  Read more about JWT [here](https://developer.atlassian.com/blog/2015/01/understanding-jwt/).  | |
| **vulnerabilityId** | **String**| The ID of the Vulnerability to delete.  | |

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
| **202** | Delete has been accepted. If the data exists, it will eventually be removed from Jira.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraSecurityInfoProvider&#x60; module, or the app does not define the &#39;DELETE&#39; scope.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="getLinkedWorkspaceById"></a>
# **getLinkedWorkspaceById**
> SecurityWorkspaceResponse getLinkedWorkspaceById(authorization, workspaceId)

Get a linked Security Workspace by ID

Retrieve a specific Security Workspace linked to the Jira site for the given workspace ID.  The result will be what is currently stored, ignoring any pending updates or deletes.  Only Connect apps that define the &#x60;jiraSecurityInfoProvider&#x60; module can access this resource. This resource requires the &#39;READ&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SecurityInformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    SecurityInformationApi apiInstance = new SecurityInformationApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Security Information module it will be rejected with a 403.  Read more about JWT [here](https://developer.atlassian.com/blog/2015/01/understanding-jwt/). 
    String workspaceId = "workspaceId_example"; // String | The ID of the workspace to fetch. 
    try {
      SecurityWorkspaceResponse result = apiInstance.getLinkedWorkspaceById(authorization, workspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityInformationApi#getLinkedWorkspaceById");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Security Information module it will be rejected with a 403.  Read more about JWT [here](https://developer.atlassian.com/blog/2015/01/understanding-jwt/).  | |
| **workspaceId** | **String**| The ID of the workspace to fetch.  | |

### Return type

[**SecurityWorkspaceResponse**](SecurityWorkspaceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Security Workspace information stored for the given ID.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraSecurityInfoProvider&#x60; module, or the app does not define the &#39;READ&#39; scope.  |  -  |
| **404** | No data found for the given workspace ID.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="getLinkedWorkspaces"></a>
# **getLinkedWorkspaces**
> SecurityWorkspaceIds getLinkedWorkspaces(authorization)

Get linked Security Workspaces

Retrieve all Security Workspaces linked with the Jira site.  The result will be what is currently stored, ignoring any pending updates or deletes.  Only Connect apps that define the &#x60;jiraSecurityInfoProvider&#x60; module can access this resource. This resource requires the &#39;READ&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SecurityInformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    SecurityInformationApi apiInstance = new SecurityInformationApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Security Information module it will be rejected with a 403.  Read more about JWT [here](https://developer.atlassian.com/blog/2015/01/understanding-jwt/). 
    try {
      SecurityWorkspaceIds result = apiInstance.getLinkedWorkspaces(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityInformationApi#getLinkedWorkspaces");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Security Information module it will be rejected with a 403.  Read more about JWT [here](https://developer.atlassian.com/blog/2015/01/understanding-jwt/).  | |

### Return type

[**SecurityWorkspaceIds**](SecurityWorkspaceIds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of all stored workspace IDs.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraSecurityInfoProvider&#x60; module, or the app does not define the &#39;READ&#39; scope.  |  -  |
| **404** | No data found for the given workspace ID.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="getVulnerabilityById"></a>
# **getVulnerabilityById**
> VulnerabilityDetails getVulnerabilityById(authorization, vulnerabilityId)

Get a Vulnerability by ID

Retrieve the currently stored Vulnerability data for the given ID.  The result will be what is currently stored, ignoring any pending updates or deletes.  Only Connect apps that define the &#x60;jiraSecurityInfoProvider&#x60; module can access this resource. This resource requires the &#39;READ&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SecurityInformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    SecurityInformationApi apiInstance = new SecurityInformationApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Security Information module it will be rejected with a 403.  Read more about JWT [here](https://developer.atlassian.com/blog/2015/01/understanding-jwt/). 
    String vulnerabilityId = "vulnerabilityId_example"; // String | The ID of the Vulnerability to fetch. 
    try {
      VulnerabilityDetails result = apiInstance.getVulnerabilityById(authorization, vulnerabilityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityInformationApi#getVulnerabilityById");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Security Information module it will be rejected with a 403.  Read more about JWT [here](https://developer.atlassian.com/blog/2015/01/understanding-jwt/).  | |
| **vulnerabilityId** | **String**| The ID of the Vulnerability to fetch.  | |

### Return type

[**VulnerabilityDetails**](VulnerabilityDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Vulnerability data currently stored for the given ID.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraSecurityInfoProvider&#x60; module, or the app does not define the &#39;READ&#39; scope.  |  -  |
| **404** | No data found for the given Vulnerability ID.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="submitVulnerabilities"></a>
# **submitVulnerabilities**
> SubmitVulnerabilitiesResponse submitVulnerabilities(authorization, submitVulnerabilitiesRequest)

Submit Vulnerability data

Update / Insert Vulnerability data.  Vulnerabilities are identified by their ID, any existing Vulnerability data with the same ID will be replaced if it exists and the updateSequenceNumber of the existing data is less than the incoming data.  Submissions are performed asynchronously. Most updates are available within a short period of time but may take some time during peak load and/or maintenance times. The GET vulnerability endpoint can be used to confirm that data has been stored successfully (if needed).  In the case of multiple Vulnerabilities being submitted in one request, each is validated individually prior to submission. Details of Vulnerabilities that failed submission (if any) are available in the response object.  A maximum of 1000 vulnerabilities can be submitted in one request.  Only Connect apps that define the &#x60;jiraSecurityInfoProvider&#x60; module can access this resource. This resource requires the &#39;WRITE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SecurityInformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    SecurityInformationApi apiInstance = new SecurityInformationApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Security Information module it will be rejected with a 403.  Read more about JWT [here](https://developer.atlassian.com/blog/2015/01/understanding-jwt/). 
    SubmitVulnerabilitiesRequest submitVulnerabilitiesRequest = new SubmitVulnerabilitiesRequest(); // SubmitVulnerabilitiesRequest | Vulnerability data to submit. 
    try {
      SubmitVulnerabilitiesResponse result = apiInstance.submitVulnerabilities(authorization, submitVulnerabilitiesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityInformationApi#submitVulnerabilities");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Security Information module it will be rejected with a 403.  Read more about JWT [here](https://developer.atlassian.com/blog/2015/01/understanding-jwt/).  | |
| **submitVulnerabilitiesRequest** | [**SubmitVulnerabilitiesRequest**](SubmitVulnerabilitiesRequest.md)| Vulnerability data to submit.  | |

### Return type

[**SubmitVulnerabilitiesResponse**](SubmitVulnerabilitiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Submission accepted. Each Vulnerability submitted in a valid format will eventually be available in Jira.  Details of any Vulnerabilities that were submitted but failed submission (due to data format problems, etc.) are available in the response object.  |  -  |
| **400** | Request has incorrect format.  Note that in the case of an individual Vulnerability having an invalid format (rather than the request as a whole) the response for the request will be a 202 and details of the invalid Vulnerability will be contained in the response object.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraSecurityInfoProvider&#x60; module, or the app does not define the &#39;WRITE&#39; scope.  |  -  |
| **413** | Data is too large. Submit fewer Vulnerabilities in each payload.  |  -  |
| **429** | API rate limit has been exceeded.  |  * X-RateLimit-Remaining - The number of remaining possible requests in current rate limit window. <br>  * X-RateLimit-Reset - The date in ISO 8601 format when the rate limit values will be next reset. <br>  * X-RateLimit-Limit - The maximum possible requests in a window of one minute. <br>  * Retry-After - The number of seconds to wait before making a follow-up request. <br>  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="submitWorkspaces"></a>
# **submitWorkspaces**
> submitWorkspaces(authorization, submitSecurityWorkspacesRequest)

Submit Security Workspaces to link

Insert Security Workspace IDs to establish a relationship between them and the Jira site the app is installed on. If a relationship between the workspace ID and Jira already exists then the workspace ID will be ignored and Jira will process the rest of the entries.  Only Connect apps that define the &#x60;jiraSecurityInfoProvider&#x60; module can access this resource. This resource requires the &#39;WRITE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SecurityInformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    SecurityInformationApi apiInstance = new SecurityInformationApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Security Information module it will be rejected with a 403.  Read [understanding jwt](https://developer.atlassian.com/blog/2015/01/understanding-jwt/) for more details. 
    SubmitSecurityWorkspacesRequest submitSecurityWorkspacesRequest = new SubmitSecurityWorkspacesRequest(); // SubmitSecurityWorkspacesRequest | Security Workspace IDs to submit. 
    try {
      apiInstance.submitWorkspaces(authorization, submitSecurityWorkspacesRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityInformationApi#submitWorkspaces");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define the Security Information module it will be rejected with a 403.  Read [understanding jwt](https://developer.atlassian.com/blog/2015/01/understanding-jwt/) for more details.  | |
| **submitSecurityWorkspacesRequest** | [**SubmitSecurityWorkspacesRequest**](SubmitSecurityWorkspacesRequest.md)| Security Workspace IDs to submit.  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Submission accepted. Each submitted Security Workspace ID will be linked to Jira.  |  -  |
| **400** | Request has incorrect format.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraSecurityInfoProvider&#x60; module, or the app does not define the &#39;WRITE&#39; scope.  |  -  |
| **413** | Set of Ids is too large. Submit fewer Ids in each payload.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

