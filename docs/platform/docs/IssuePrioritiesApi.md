# IssuePrioritiesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPriority**](IssuePrioritiesApi.md#createPriority) | **POST** /rest/api/3/priority | Create priority |
| [**deletePriority**](IssuePrioritiesApi.md#deletePriority) | **DELETE** /rest/api/3/priority/{id} | Delete priority |
| [**getPriorities**](IssuePrioritiesApi.md#getPriorities) | **GET** /rest/api/3/priority | Get priorities |
| [**getPriority**](IssuePrioritiesApi.md#getPriority) | **GET** /rest/api/3/priority/{id} | Get priority |
| [**movePriorities**](IssuePrioritiesApi.md#movePriorities) | **PUT** /rest/api/3/priority/move | Move priorities |
| [**searchPriorities**](IssuePrioritiesApi.md#searchPriorities) | **GET** /rest/api/3/priority/search | Search priorities |
| [**setDefaultPriority**](IssuePrioritiesApi.md#setDefaultPriority) | **PUT** /rest/api/3/priority/default | Set default priority |
| [**updatePriority**](IssuePrioritiesApi.md#updatePriority) | **PUT** /rest/api/3/priority/{id} | Update priority |


<a id="createPriority"></a>
# **createPriority**
> PriorityId createPriority(createPriorityDetails)

Create priority

Creates an issue priority.  Deprecation applies to iconUrl param in request body which will be sunset on 16th Mar 2025. For more details refer to [changelog](https://developer.atlassian.com/changelog/#CHANGE-1525).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssuePrioritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuePrioritiesApi apiInstance = new IssuePrioritiesApi(defaultClient);
    CreatePriorityDetails createPriorityDetails = new CreatePriorityDetails(); // CreatePriorityDetails | 
    try {
      PriorityId result = apiInstance.createPriority(createPriorityDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuePrioritiesApi#createPriority");
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
| **createPriorityDetails** | [**CreatePriorityDetails**](CreatePriorityDetails.md)|  | |

### Return type

[**PriorityId**](PriorityId.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is successful. |  -  |
| **400** | Returned if the request isn&#39;t valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user doesn&#39;t have the necessary permission. |  -  |

<a id="deletePriority"></a>
# **deletePriority**
> deletePriority(id)

Delete priority

Deletes an issue priority.  This operation is [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssuePrioritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuePrioritiesApi apiInstance = new IssuePrioritiesApi(defaultClient);
    String id = "id_example"; // String | The ID of the issue priority.
    try {
      apiInstance.deletePriority(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuePrioritiesApi#deletePriority");
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
| **id** | **String**| The ID of the issue priority. | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **303** | Returned if the request is successful. |  -  |
| **400** | Returned if the request isn&#39;t valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user doesn&#39;t have the necessary permission. |  -  |
| **404** | Returned if the issue priority isn&#39;t found. |  -  |
| **409** | Returned if a task to delete the issue priority is already running. |  -  |

<a id="getPriorities"></a>
# **getPriorities**
> List&lt;Priority&gt; getPriorities()

Get priorities

Returns the list of all issue priorities.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssuePrioritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuePrioritiesApi apiInstance = new IssuePrioritiesApi(defaultClient);
    try {
      List<Priority> result = apiInstance.getPriorities();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuePrioritiesApi#getPriorities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Priority&gt;**](Priority.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |

<a id="getPriority"></a>
# **getPriority**
> Priority getPriority(id)

Get priority

Returns an issue priority.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssuePrioritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuePrioritiesApi apiInstance = new IssuePrioritiesApi(defaultClient);
    String id = "id_example"; // String | The ID of the issue priority.
    try {
      Priority result = apiInstance.getPriority(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuePrioritiesApi#getPriority");
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
| **id** | **String**| The ID of the issue priority. | |

### Return type

[**Priority**](Priority.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **404** | Returned if the issue priority isn&#39;t found. |  -  |

<a id="movePriorities"></a>
# **movePriorities**
> Object movePriorities(reorderIssuePriorities)

Move priorities

Changes the order of issue priorities.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssuePrioritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuePrioritiesApi apiInstance = new IssuePrioritiesApi(defaultClient);
    ReorderIssuePriorities reorderIssuePriorities = new ReorderIssuePriorities(); // ReorderIssuePriorities | 
    try {
      Object result = apiInstance.movePriorities(reorderIssuePriorities);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuePrioritiesApi#movePriorities");
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
| **reorderIssuePriorities** | [**ReorderIssuePriorities**](ReorderIssuePriorities.md)|  | |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the request is successful. |  -  |
| **400** | Returned if the request isn&#39;t valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user doesn&#39;t have the necessary permission. |  -  |
| **404** | Returned if the issue priority isn&#39;t found. |  -  |

<a id="searchPriorities"></a>
# **searchPriorities**
> PageBeanPriority searchPriorities(startAt, maxResults, id, projectId, priorityName, onlyDefault, expand)

Search priorities

Returns a [paginated](#pagination) list of priorities. The list can contain all priorities or a subset determined by any combination of these criteria:   *  a list of priority IDs. Any invalid priority IDs are ignored.  *  a list of project IDs. Only priorities that are available in these projects will be returned. Any invalid project IDs are ignored.  *  whether the field configuration is a default. This returns priorities from company-managed (classic) projects only, as there is no concept of default priorities in team-managed projects.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssuePrioritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuePrioritiesApi apiInstance = new IssuePrioritiesApi(defaultClient);
    String startAt = "0"; // String | The index of the first item to return in a page of results (page offset).
    String maxResults = "50"; // String | The maximum number of items to return per page.
    List<String> id = Arrays.asList(""""); // List<String> | The list of priority IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=2&id=3`.
    List<String> projectId = Arrays.asList(""""); // List<String> | The list of projects IDs. To include multiple IDs, provide an ampersand-separated list. For example, `projectId=10010&projectId=10111`.
    String priorityName = ""; // String | The name of priority to search for.
    Boolean onlyDefault = false; // Boolean | Whether only the default priority is returned.
    String expand = ""; // String | Use `schemes` to return the associated priority schemes for each priority. Limited to returning first 15 priority schemes per priority.
    try {
      PageBeanPriority result = apiInstance.searchPriorities(startAt, maxResults, id, projectId, priorityName, onlyDefault, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuePrioritiesApi#searchPriorities");
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
| **startAt** | **String**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **String**| The maximum number of items to return per page. | [optional] [default to 50] |
| **id** | [**List&lt;String&gt;**](String.md)| The list of priority IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;2&amp;id&#x3D;3&#x60;. | [optional] |
| **projectId** | [**List&lt;String&gt;**](String.md)| The list of projects IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;projectId&#x3D;10010&amp;projectId&#x3D;10111&#x60;. | [optional] |
| **priorityName** | **String**| The name of priority to search for. | [optional] [default to ] |
| **onlyDefault** | **Boolean**| Whether only the default priority is returned. | [optional] [default to false] |
| **expand** | **String**| Use &#x60;schemes&#x60; to return the associated priority schemes for each priority. Limited to returning first 15 priority schemes per priority. | [optional] [default to ] |

### Return type

[**PageBeanPriority**](PageBeanPriority.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a id="setDefaultPriority"></a>
# **setDefaultPriority**
> Object setDefaultPriority(setDefaultPriorityRequest)

Set default priority

Sets default issue priority.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssuePrioritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuePrioritiesApi apiInstance = new IssuePrioritiesApi(defaultClient);
    SetDefaultPriorityRequest setDefaultPriorityRequest = new SetDefaultPriorityRequest(); // SetDefaultPriorityRequest | 
    try {
      Object result = apiInstance.setDefaultPriority(setDefaultPriorityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuePrioritiesApi#setDefaultPriority");
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
| **setDefaultPriorityRequest** | [**SetDefaultPriorityRequest**](SetDefaultPriorityRequest.md)|  | |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the request is successful. |  -  |
| **400** | Returned if the request isn&#39;t valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user doesn&#39;t have the necessary permission. |  -  |
| **404** | Returned if the issue priority isn&#39;t found. |  -  |

<a id="updatePriority"></a>
# **updatePriority**
> Object updatePriority(id, updatePriorityDetails)

Update priority

Updates an issue priority.  At least one request body parameter must be defined.  Deprecation applies to iconUrl param in request body which will be sunset on 16th Mar 2025. For more details refer to [changelog](https://developer.atlassian.com/changelog/#CHANGE-1525).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssuePrioritiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssuePrioritiesApi apiInstance = new IssuePrioritiesApi(defaultClient);
    String id = "id_example"; // String | The ID of the issue priority.
    UpdatePriorityDetails updatePriorityDetails = new UpdatePriorityDetails(); // UpdatePriorityDetails | 
    try {
      Object result = apiInstance.updatePriority(id, updatePriorityDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuePrioritiesApi#updatePriority");
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
| **id** | **String**| The ID of the issue priority. | |
| **updatePriorityDetails** | [**UpdatePriorityDetails**](UpdatePriorityDetails.md)|  | |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the request is successful. |  -  |
| **400** | Returned if the request isn&#39;t valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user doesn&#39;t have the necessary permission. |  -  |
| **404** | Returned if the issue priority isn&#39;t found. |  -  |

