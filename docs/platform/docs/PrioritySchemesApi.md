# PrioritySchemesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPriorityScheme**](PrioritySchemesApi.md#createPriorityScheme) | **POST** /rest/api/3/priorityscheme | Create priority scheme |
| [**deletePriorityScheme**](PrioritySchemesApi.md#deletePriorityScheme) | **DELETE** /rest/api/3/priorityscheme/{schemeId} | Delete priority scheme |
| [**getAvailablePrioritiesByPriorityScheme**](PrioritySchemesApi.md#getAvailablePrioritiesByPriorityScheme) | **GET** /rest/api/3/priorityscheme/priorities/available | Get available priorities by priority scheme |
| [**getPrioritiesByPriorityScheme**](PrioritySchemesApi.md#getPrioritiesByPriorityScheme) | **GET** /rest/api/3/priorityscheme/{schemeId}/priorities | Get priorities by priority scheme |
| [**getPrioritySchemes**](PrioritySchemesApi.md#getPrioritySchemes) | **GET** /rest/api/3/priorityscheme | Get priority schemes |
| [**getProjectsByPriorityScheme**](PrioritySchemesApi.md#getProjectsByPriorityScheme) | **GET** /rest/api/3/priorityscheme/{schemeId}/projects | Get projects by priority scheme |
| [**suggestedPrioritiesForMappings**](PrioritySchemesApi.md#suggestedPrioritiesForMappings) | **POST** /rest/api/3/priorityscheme/mappings | Suggested priorities for mappings |
| [**updatePriorityScheme**](PrioritySchemesApi.md#updatePriorityScheme) | **PUT** /rest/api/3/priorityscheme/{schemeId} | Update priority scheme |


<a id="createPriorityScheme"></a>
# **createPriorityScheme**
> PrioritySchemeId createPriorityScheme(createPrioritySchemeDetails)

Create priority scheme

Creates a new priority scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.PrioritySchemesApi;

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

    PrioritySchemesApi apiInstance = new PrioritySchemesApi(defaultClient);
    CreatePrioritySchemeDetails createPrioritySchemeDetails = new CreatePrioritySchemeDetails(); // CreatePrioritySchemeDetails | 
    try {
      PrioritySchemeId result = apiInstance.createPriorityScheme(createPrioritySchemeDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrioritySchemesApi#createPriorityScheme");
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
| **createPrioritySchemeDetails** | [**CreatePrioritySchemeDetails**](CreatePrioritySchemeDetails.md)|  | |

### Return type

[**PrioritySchemeId**](PrioritySchemeId.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is completed. |  -  |
| **202** | Returned if the request is accepted. |  -  |
| **400** | Returned if the request isn&#39;t valid.  **Mappings Validation Errors**   *  &#x60;&#x60;The priorities with IDs [ID 1, ID 2, ...] require mapping. Please provide mappings in the &#39;in&#39; mappings object, where these priorities are the keys with corresponding values.&#x60;&#x60; The listed priority ID(s) have not been provided as keys for &#x60;&#x60;in&#x60;&#x60; mappings but are required, add them to the mappings object. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **403** | Returned if the user doesn&#39;t have the necessary permissions. |  -  |
| **409** | Returned if an action with this priority scheme is still in progress. |  -  |

<a id="deletePriorityScheme"></a>
# **deletePriorityScheme**
> Object deletePriorityScheme(schemeId)

Delete priority scheme

Deletes a priority scheme.  This operation is only available for priority schemes without any associated projects. Any associated projects must be removed from the priority scheme before this operation can be performed.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.PrioritySchemesApi;

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

    PrioritySchemesApi apiInstance = new PrioritySchemesApi(defaultClient);
    Long schemeId = 56L; // Long | The priority scheme ID.
    try {
      Object result = apiInstance.deletePriorityScheme(schemeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrioritySchemesApi#deletePriorityScheme");
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
| **schemeId** | **Long**| The priority scheme ID. | |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the request is successful. |  -  |
| **400** | Returned if the request isn&#39;t valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user doesn&#39;t have the necessary permissions. |  -  |

<a id="getAvailablePrioritiesByPriorityScheme"></a>
# **getAvailablePrioritiesByPriorityScheme**
> PageBeanPriorityWithSequence getAvailablePrioritiesByPriorityScheme(schemeId, startAt, maxResults, query, exclude)

Get available priorities by priority scheme

Returns a [paginated](#pagination) list of priorities available for adding to a priority scheme.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.PrioritySchemesApi;

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

    PrioritySchemesApi apiInstance = new PrioritySchemesApi(defaultClient);
    String schemeId = "schemeId_example"; // String | The priority scheme ID.
    String startAt = "0"; // String | The index of the first item to return in a page of results (page offset).
    String maxResults = "50"; // String | The maximum number of items to return per page.
    String query = ""; // String | The string to query priorities on by name.
    Set<String> exclude = Arrays.asList(); // Set<String> | A list of priority IDs to exclude from the results.
    try {
      PageBeanPriorityWithSequence result = apiInstance.getAvailablePrioritiesByPriorityScheme(schemeId, startAt, maxResults, query, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrioritySchemesApi#getAvailablePrioritiesByPriorityScheme");
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
| **schemeId** | **String**| The priority scheme ID. | |
| **startAt** | **String**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **String**| The maximum number of items to return per page. | [optional] [default to 50] |
| **query** | **String**| The string to query priorities on by name. | [optional] [default to ] |
| **exclude** | [**Set&lt;String&gt;**](String.md)| A list of priority IDs to exclude from the results. | [optional] |

### Return type

[**PageBeanPriorityWithSequence**](PageBeanPriorityWithSequence.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request isn&#39;t valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |

<a id="getPrioritiesByPriorityScheme"></a>
# **getPrioritiesByPriorityScheme**
> PageBeanPriorityWithSequence getPrioritiesByPriorityScheme(schemeId, startAt, maxResults)

Get priorities by priority scheme

Returns a [paginated](#pagination) list of priorities by scheme.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.PrioritySchemesApi;

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

    PrioritySchemesApi apiInstance = new PrioritySchemesApi(defaultClient);
    String schemeId = "schemeId_example"; // String | The priority scheme ID.
    String startAt = "0"; // String | The index of the first item to return in a page of results (page offset).
    String maxResults = "50"; // String | The maximum number of items to return per page.
    try {
      PageBeanPriorityWithSequence result = apiInstance.getPrioritiesByPriorityScheme(schemeId, startAt, maxResults);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrioritySchemesApi#getPrioritiesByPriorityScheme");
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
| **schemeId** | **String**| The priority scheme ID. | |
| **startAt** | **String**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **String**| The maximum number of items to return per page. | [optional] [default to 50] |

### Return type

[**PageBeanPriorityWithSequence**](PageBeanPriorityWithSequence.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request isn&#39;t valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |

<a id="getPrioritySchemes"></a>
# **getPrioritySchemes**
> PageBeanPrioritySchemeWithPaginatedPrioritiesAndProjects getPrioritySchemes(startAt, maxResults, priorityId, schemeId, schemeName, onlyDefault, orderBy, expand)

Get priority schemes

Returns a [paginated](#pagination) list of priority schemes.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.PrioritySchemesApi;

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

    PrioritySchemesApi apiInstance = new PrioritySchemesApi(defaultClient);
    String startAt = "0"; // String | The index of the first item to return in a page of results (page offset).
    String maxResults = "50"; // String | The maximum number of items to return per page.
    Set<Long> priorityId = Arrays.asList(); // Set<Long> | A set of priority IDs to filter by. To include multiple IDs, provide an ampersand-separated list. For example, `priorityId=10000&priorityId=10001`.
    Set<Long> schemeId = Arrays.asList(); // Set<Long> | A set of priority scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, `schemeId=10000&schemeId=10001`.
    String schemeName = ""; // String | The name of scheme to search for.
    Boolean onlyDefault = false; // Boolean | Whether only the default priority is returned.
    String orderBy = "name"; // String | The ordering to return the priority schemes by.
    String expand = "expand_example"; // String | A comma separated list of additional information to return. \"priorities\" will return priorities associated with the priority scheme. \"projects\" will return projects associated with the priority scheme. `expand=priorities,projects`.
    try {
      PageBeanPrioritySchemeWithPaginatedPrioritiesAndProjects result = apiInstance.getPrioritySchemes(startAt, maxResults, priorityId, schemeId, schemeName, onlyDefault, orderBy, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrioritySchemesApi#getPrioritySchemes");
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
| **priorityId** | [**Set&lt;Long&gt;**](Long.md)| A set of priority IDs to filter by. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;priorityId&#x3D;10000&amp;priorityId&#x3D;10001&#x60;. | [optional] |
| **schemeId** | [**Set&lt;Long&gt;**](Long.md)| A set of priority scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;schemeId&#x3D;10000&amp;schemeId&#x3D;10001&#x60;. | [optional] |
| **schemeName** | **String**| The name of scheme to search for. | [optional] [default to ] |
| **onlyDefault** | **Boolean**| Whether only the default priority is returned. | [optional] [default to false] |
| **orderBy** | **String**| The ordering to return the priority schemes by. | [optional] [default to +name] [enum: name, +name, -name] |
| **expand** | **String**| A comma separated list of additional information to return. \&quot;priorities\&quot; will return priorities associated with the priority scheme. \&quot;projects\&quot; will return projects associated with the priority scheme. &#x60;expand&#x3D;priorities,projects&#x60;. | [optional] |

### Return type

[**PageBeanPrioritySchemeWithPaginatedPrioritiesAndProjects**](PageBeanPrioritySchemeWithPaginatedPrioritiesAndProjects.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request isn&#39;t valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |

<a id="getProjectsByPriorityScheme"></a>
# **getProjectsByPriorityScheme**
> PageBeanProject getProjectsByPriorityScheme(schemeId, startAt, maxResults, projectId, query)

Get projects by priority scheme

Returns a [paginated](#pagination) list of projects by scheme.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.PrioritySchemesApi;

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

    PrioritySchemesApi apiInstance = new PrioritySchemesApi(defaultClient);
    String schemeId = "schemeId_example"; // String | The priority scheme ID.
    String startAt = "0"; // String | The index of the first item to return in a page of results (page offset).
    String maxResults = "50"; // String | The maximum number of items to return per page.
    Set<Long> projectId = Arrays.asList(); // Set<Long> | The project IDs to filter by. For example, `projectId=10000&projectId=10001`.
    String query = ""; // String | The string to query projects on by name.
    try {
      PageBeanProject result = apiInstance.getProjectsByPriorityScheme(schemeId, startAt, maxResults, projectId, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrioritySchemesApi#getProjectsByPriorityScheme");
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
| **schemeId** | **String**| The priority scheme ID. | |
| **startAt** | **String**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **String**| The maximum number of items to return per page. | [optional] [default to 50] |
| **projectId** | [**Set&lt;Long&gt;**](Long.md)| The project IDs to filter by. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. | [optional] |
| **query** | **String**| The string to query projects on by name. | [optional] [default to ] |

### Return type

[**PageBeanProject**](PageBeanProject.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request isn&#39;t valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |

<a id="suggestedPrioritiesForMappings"></a>
# **suggestedPrioritiesForMappings**
> PageBeanPriorityWithSequence suggestedPrioritiesForMappings(suggestedMappingsRequestBean)

Suggested priorities for mappings

Returns a [paginated](#pagination) list of priorities that would require mapping, given a change in priorities or projects associated with a priority scheme.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.PrioritySchemesApi;

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

    PrioritySchemesApi apiInstance = new PrioritySchemesApi(defaultClient);
    SuggestedMappingsRequestBean suggestedMappingsRequestBean = new SuggestedMappingsRequestBean(); // SuggestedMappingsRequestBean | 
    try {
      PageBeanPriorityWithSequence result = apiInstance.suggestedPrioritiesForMappings(suggestedMappingsRequestBean);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrioritySchemesApi#suggestedPrioritiesForMappings");
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
| **suggestedMappingsRequestBean** | [**SuggestedMappingsRequestBean**](SuggestedMappingsRequestBean.md)|  | |

### Return type

[**PageBeanPriorityWithSequence**](PageBeanPriorityWithSequence.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request isn&#39;t valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |

<a id="updatePriorityScheme"></a>
# **updatePriorityScheme**
> UpdatePrioritySchemeResponseBean updatePriorityScheme(schemeId, updatePrioritySchemeRequestBean)

Update priority scheme

Updates a priority scheme. This includes its details, the lists of priorities and projects in it  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.PrioritySchemesApi;

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

    PrioritySchemesApi apiInstance = new PrioritySchemesApi(defaultClient);
    Long schemeId = 56L; // Long | The ID of the priority scheme.
    UpdatePrioritySchemeRequestBean updatePrioritySchemeRequestBean = new UpdatePrioritySchemeRequestBean(); // UpdatePrioritySchemeRequestBean | 
    try {
      UpdatePrioritySchemeResponseBean result = apiInstance.updatePriorityScheme(schemeId, updatePrioritySchemeRequestBean);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrioritySchemesApi#updatePriorityScheme");
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
| **schemeId** | **Long**| The ID of the priority scheme. | |
| **updatePrioritySchemeRequestBean** | [**UpdatePrioritySchemeRequestBean**](UpdatePrioritySchemeRequestBean.md)|  | |

### Return type

[**UpdatePrioritySchemeResponseBean**](UpdatePrioritySchemeResponseBean.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returned if the request is accepted. |  -  |
| **400** | Returned if the request isn&#39;t valid.  **Mappings Validation Errors**   *  &#x60;&#x60;The changes to priority schemes require mapping of priorities. Please provide a value for the &#39;in&#39; mappings object.&#x60;&#x60; Priorities are being removed and/or projects are being added to the scheme, but &#x60;&#x60;in&#x60;&#x60; mappings are not provided.  *  &#x60;&#x60;The changes to priority schemes require mapping of priorities. Please provide a value for the &#39;out&#39; mappings object.&#x60;&#x60; Projects are being removed from the scheme, but &#x60;&#x60;out&#x60;&#x60; mappings are not provided.  *  &#x60;&#x60;The priorities with IDs [ID 1, ID 2, ...] provided as keys for the &#39;in&#39; mappings object do not exist. Please provide existing priority IDs.&#x60;&#x60; The listed priority ID(s) have been provided as keys for &#x60;&#x60;in&#x60;&#x60; mappings but do not exist. Please confirm the correct priority ID(s) have been provided, they should be priorities that exist on the Jira site which are used by projects being added to the current scheme, but are not in use by the current scheme.  *  &#x60;&#x60;The priorities with IDs [ID 1, ID 2, ...] provided as values for the &#39;in&#39; mappings object do not exist. Please provide existing priority IDs used by the current priority scheme.&#x60;&#x60; The listed priority ID(s) have been provided as values for &#x60;&#x60;in&#x60;&#x60; mappings but do not exist. Please confirm the correct priority ID(s) have been provided, they should be priorities that exist on the Jira site and are in use by the current scheme.  *  &#x60;&#x60;The priorities with IDs [ID 1, ID 2, ...] provided as keys for the &#39;out&#39; mappings object do not exist. Please provide existing priority IDs used by the current priority scheme.&#x60;&#x60; The listed priority ID(s) have been provided as keys for &#x60;&#x60;out&#x60;&#x60; mappings but are invalid. Please confirm the correct priority ID(s) have been provided, they should be priorities that exist on the Jira site and are in use by the current scheme.  *  &#x60;&#x60;The priorities with IDs [ID 1, ID 2, ...] provided as values for the &#39;out&#39; mappings object do not exist. Please provide existing priority IDs used by the default scheme.&#x60;&#x60; The listed priority ID(s) have been provided as values for &#x60;&#x60;out&#x60;&#x60; mappings but are invalid. Please confirm the correct priority ID(s) have been provided, they should be priorities that exist on the Jira site and are in use by the Default Priority Scheme, but are not in use by the current scheme.  *  &#x60;&#x60;The priorities with IDs [ID 1, ID 2, ...] do not require mapping. Please remove these keys and their corresponding values from the &#39;in&#39; mappings object.&#x60;&#x60; The listed priority ID(s) have been provided as keys for &#x60;&#x60;in&#x60;&#x60; mappings but are not required, they can be removed from the mappings object.  *  &#x60;&#x60;The priorities with IDs [ID 1, ID 2, ...] require mapping. Please provide mappings in the &#39;in&#39; mappings object, where these priorities are the keys with corresponding values.&#x60;&#x60; The listed priority ID(s) have not been provided as keys for &#x60;&#x60;in&#x60;&#x60; mappings but are required, add them to the mappings object.  *  &#x60;&#x60;The priorities with IDs [ID 1, ID 2, ...] being mapped to are not in the current scheme. Please remove these values and their corresponding keys from the &#39;in&#39; mappings object.&#x60;&#x60; The listed priority ID(s) have been provided as keys for &#x60;&#x60;in&#x60;&#x60; mappings but are not in use by the current scheme, they can be removed from the mappings object.  *  &#x60;&#x60;The priorities with IDs [ID 1, ID 2, ...] do not require mapping. Please remove these keys and their corresponding values from the &#39;out&#39; mappings object.&#x60;&#x60; The listed priority ID(s) hve been provided as keys for &#x60;&#x60;out&#x60;&#x60; mappings but are not required, they can be removed from the mappings object.  *  &#x60;&#x60;The priorities with IDs [ID 1, ID 2, ...] require mapping. Please provide mappings in the &#39;out&#39; mappings object, where these priorities are the keys with corresponding values.&#x60;&#x60; The listed priority ID(s) have not been provided as keys for &#x60;&#x60;out&#x60;&#x60; mappings but are required, add them to the mappings object.  *  &#x60;&#x60;The priorities with IDs [ID 1, ID 2, ...] being mapped to are not in the default scheme. Please remove these values and their corresponding keys from the &#39;out&#39; mappings object.&#x60;&#x60; The listed priority ID(s) have been provided as keys for &#x60;&#x60;out&#x60;&#x60; mappings but are not in use by the Default Priority Scheme, they can be removed from the mappings object. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user doesn&#39;t have the necessary permissions. |  -  |
| **409** | Returned if an action with this priority scheme is still in progress. |  -  |

