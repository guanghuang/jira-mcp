# IssueTypeSchemesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addIssueTypesToIssueTypeScheme**](IssueTypeSchemesApi.md#addIssueTypesToIssueTypeScheme) | **PUT** /rest/api/3/issuetypescheme/{issueTypeSchemeId}/issuetype | Add issue types to issue type scheme |
| [**assignIssueTypeSchemeToProject**](IssueTypeSchemesApi.md#assignIssueTypeSchemeToProject) | **PUT** /rest/api/3/issuetypescheme/project | Assign issue type scheme to project |
| [**createIssueTypeScheme**](IssueTypeSchemesApi.md#createIssueTypeScheme) | **POST** /rest/api/3/issuetypescheme | Create issue type scheme |
| [**deleteIssueTypeScheme**](IssueTypeSchemesApi.md#deleteIssueTypeScheme) | **DELETE** /rest/api/3/issuetypescheme/{issueTypeSchemeId} | Delete issue type scheme |
| [**getAllIssueTypeSchemes**](IssueTypeSchemesApi.md#getAllIssueTypeSchemes) | **GET** /rest/api/3/issuetypescheme | Get all issue type schemes |
| [**getIssueTypeSchemeForProjects**](IssueTypeSchemesApi.md#getIssueTypeSchemeForProjects) | **GET** /rest/api/3/issuetypescheme/project | Get issue type schemes for projects |
| [**getIssueTypeSchemesMapping**](IssueTypeSchemesApi.md#getIssueTypeSchemesMapping) | **GET** /rest/api/3/issuetypescheme/mapping | Get issue type scheme items |
| [**removeIssueTypeFromIssueTypeScheme**](IssueTypeSchemesApi.md#removeIssueTypeFromIssueTypeScheme) | **DELETE** /rest/api/3/issuetypescheme/{issueTypeSchemeId}/issuetype/{issueTypeId} | Remove issue type from issue type scheme |
| [**reorderIssueTypesInIssueTypeScheme**](IssueTypeSchemesApi.md#reorderIssueTypesInIssueTypeScheme) | **PUT** /rest/api/3/issuetypescheme/{issueTypeSchemeId}/issuetype/move | Change order of issue types |
| [**updateIssueTypeScheme**](IssueTypeSchemesApi.md#updateIssueTypeScheme) | **PUT** /rest/api/3/issuetypescheme/{issueTypeSchemeId} | Update issue type scheme |


<a id="addIssueTypesToIssueTypeScheme"></a>
# **addIssueTypesToIssueTypeScheme**
> Object addIssueTypesToIssueTypeScheme(issueTypeSchemeId, issueTypeIds)

Add issue types to issue type scheme

Adds issue types to an issue type scheme.  The added issue types are appended to the issue types list.  If any of the issue types exist in the issue type scheme, the operation fails and no issue types are added.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeSchemesApi;

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

    IssueTypeSchemesApi apiInstance = new IssueTypeSchemesApi(defaultClient);
    Long issueTypeSchemeId = 56L; // Long | The ID of the issue type scheme.
    IssueTypeIds issueTypeIds = new IssueTypeIds(); // IssueTypeIds | 
    try {
      Object result = apiInstance.addIssueTypesToIssueTypeScheme(issueTypeSchemeId, issueTypeIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeSchemesApi#addIssueTypesToIssueTypeScheme");
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
| **issueTypeSchemeId** | **Long**| The ID of the issue type scheme. | |
| **issueTypeIds** | [**IssueTypeIds**](IssueTypeIds.md)|  | |

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
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the issue type or the issue type scheme is not found. |  -  |

<a id="assignIssueTypeSchemeToProject"></a>
# **assignIssueTypeSchemeToProject**
> Object assignIssueTypeSchemeToProject(issueTypeSchemeProjectAssociation)

Assign issue type scheme to project

Assigns an issue type scheme to a project.  If any issues in the project are assigned issue types not present in the new scheme, the operation will fail. To complete the assignment those issues must be updated to use issue types in the new scheme.  Issue type schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeSchemesApi;

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

    IssueTypeSchemesApi apiInstance = new IssueTypeSchemesApi(defaultClient);
    IssueTypeSchemeProjectAssociation issueTypeSchemeProjectAssociation = new IssueTypeSchemeProjectAssociation(); // IssueTypeSchemeProjectAssociation | 
    try {
      Object result = apiInstance.assignIssueTypeSchemeToProject(issueTypeSchemeProjectAssociation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeSchemesApi#assignIssueTypeSchemeToProject");
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
| **issueTypeSchemeProjectAssociation** | [**IssueTypeSchemeProjectAssociation**](IssueTypeSchemeProjectAssociation.md)|  | |

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
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the issue type scheme or the project is not found. |  -  |

<a id="createIssueTypeScheme"></a>
# **createIssueTypeScheme**
> IssueTypeSchemeID createIssueTypeScheme(issueTypeSchemeDetails)

Create issue type scheme

Creates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeSchemesApi;

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

    IssueTypeSchemesApi apiInstance = new IssueTypeSchemesApi(defaultClient);
    IssueTypeSchemeDetails issueTypeSchemeDetails = new IssueTypeSchemeDetails(); // IssueTypeSchemeDetails | 
    try {
      IssueTypeSchemeID result = apiInstance.createIssueTypeScheme(issueTypeSchemeDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeSchemesApi#createIssueTypeScheme");
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
| **issueTypeSchemeDetails** | [**IssueTypeSchemeDetails**](IssueTypeSchemeDetails.md)|  | |

### Return type

[**IssueTypeSchemeID**](IssueTypeSchemeID.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **409** | Returned if the scheme name is used by another scheme. |  -  |

<a id="deleteIssueTypeScheme"></a>
# **deleteIssueTypeScheme**
> Object deleteIssueTypeScheme(issueTypeSchemeId)

Delete issue type scheme

Deletes an issue type scheme.  Only issue type schemes used in classic projects can be deleted.  Any projects assigned to the scheme are reassigned to the default issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeSchemesApi;

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

    IssueTypeSchemesApi apiInstance = new IssueTypeSchemesApi(defaultClient);
    Long issueTypeSchemeId = 56L; // Long | The ID of the issue type scheme.
    try {
      Object result = apiInstance.deleteIssueTypeScheme(issueTypeSchemeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeSchemesApi#deleteIssueTypeScheme");
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
| **issueTypeSchemeId** | **Long**| The ID of the issue type scheme. | |

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
| **204** | Returned if the issue type scheme is deleted. |  -  |
| **400** | Returned if the request is to delete the default issue type scheme. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the issue type scheme is not found. |  -  |

<a id="getAllIssueTypeSchemes"></a>
# **getAllIssueTypeSchemes**
> PageBeanIssueTypeScheme getAllIssueTypeSchemes(startAt, maxResults, id, orderBy, expand, queryString)

Get all issue type schemes

Returns a [paginated](#pagination) list of issue type schemes.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeSchemesApi;

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

    IssueTypeSchemesApi apiInstance = new IssueTypeSchemesApi(defaultClient);
    Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // Integer | The maximum number of items to return per page.
    Set<Long> id = Arrays.asList(); // Set<Long> | The list of issue type schemes IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&id=10001`.
    String orderBy = "name"; // String | [Order](#ordering) the results by a field:   *  `name` Sorts by issue type scheme name.  *  `id` Sorts by issue type scheme ID.
    String expand = ""; // String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `projects` For each issue type schemes, returns information about the projects the issue type scheme is assigned to.  *  `issueTypes` For each issue type schemes, returns information about the issueTypes the issue type scheme have.
    String queryString = ""; // String | String used to perform a case-insensitive partial match with issue type scheme name.
    try {
      PageBeanIssueTypeScheme result = apiInstance.getAllIssueTypeSchemes(startAt, maxResults, id, orderBy, expand, queryString);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeSchemesApi#getAllIssueTypeSchemes");
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
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |
| **id** | [**Set&lt;Long&gt;**](Long.md)| The list of issue type schemes IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. | [optional] |
| **orderBy** | **String**| [Order](#ordering) the results by a field:   *  &#x60;name&#x60; Sorts by issue type scheme name.  *  &#x60;id&#x60; Sorts by issue type scheme ID. | [optional] [default to id] [enum: name, -name, +name, id, -id, +id] |
| **expand** | **String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;projects&#x60; For each issue type schemes, returns information about the projects the issue type scheme is assigned to.  *  &#x60;issueTypes&#x60; For each issue type schemes, returns information about the issueTypes the issue type scheme have. | [optional] [default to ] |
| **queryString** | **String**| String used to perform a case-insensitive partial match with issue type scheme name. | [optional] [default to ] |

### Return type

[**PageBeanIssueTypeScheme**](PageBeanIssueTypeScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |

<a id="getIssueTypeSchemeForProjects"></a>
# **getIssueTypeSchemeForProjects**
> PageBeanIssueTypeSchemeProjects getIssueTypeSchemeForProjects(projectId, startAt, maxResults)

Get issue type schemes for projects

Returns a [paginated](#pagination) list of issue type schemes and, for each issue type scheme, a list of the projects that use it.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeSchemesApi;

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

    IssueTypeSchemesApi apiInstance = new IssueTypeSchemesApi(defaultClient);
    Set<Long> projectId = Arrays.asList(); // Set<Long> | The list of project IDs. To include multiple project IDs, provide an ampersand-separated list. For example, `projectId=10000&projectId=10001`.
    Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // Integer | The maximum number of items to return per page.
    try {
      PageBeanIssueTypeSchemeProjects result = apiInstance.getIssueTypeSchemeForProjects(projectId, startAt, maxResults);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeSchemesApi#getIssueTypeSchemeForProjects");
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
| **projectId** | [**Set&lt;Long&gt;**](Long.md)| The list of project IDs. To include multiple project IDs, provide an ampersand-separated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. | |
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |

### Return type

[**PageBeanIssueTypeSchemeProjects**](PageBeanIssueTypeSchemeProjects.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |

<a id="getIssueTypeSchemesMapping"></a>
# **getIssueTypeSchemesMapping**
> PageBeanIssueTypeSchemeMapping getIssueTypeSchemesMapping(startAt, maxResults, issueTypeSchemeId)

Get issue type scheme items

Returns a [paginated](#pagination) list of issue type scheme items.  Only issue type scheme items used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeSchemesApi;

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

    IssueTypeSchemesApi apiInstance = new IssueTypeSchemesApi(defaultClient);
    Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // Integer | The maximum number of items to return per page.
    Set<Long> issueTypeSchemeId = Arrays.asList(); // Set<Long> | The list of issue type scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, `issueTypeSchemeId=10000&issueTypeSchemeId=10001`.
    try {
      PageBeanIssueTypeSchemeMapping result = apiInstance.getIssueTypeSchemesMapping(startAt, maxResults, issueTypeSchemeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeSchemesApi#getIssueTypeSchemesMapping");
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
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |
| **issueTypeSchemeId** | [**Set&lt;Long&gt;**](Long.md)| The list of issue type scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;issueTypeSchemeId&#x3D;10000&amp;issueTypeSchemeId&#x3D;10001&#x60;. | [optional] |

### Return type

[**PageBeanIssueTypeSchemeMapping**](PageBeanIssueTypeSchemeMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |

<a id="removeIssueTypeFromIssueTypeScheme"></a>
# **removeIssueTypeFromIssueTypeScheme**
> Object removeIssueTypeFromIssueTypeScheme(issueTypeSchemeId, issueTypeId)

Remove issue type from issue type scheme

Removes an issue type from an issue type scheme.  This operation cannot remove:   *  any issue type used by issues.  *  any issue types from the default issue type scheme.  *  the last standard issue type from an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeSchemesApi;

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

    IssueTypeSchemesApi apiInstance = new IssueTypeSchemesApi(defaultClient);
    Long issueTypeSchemeId = 56L; // Long | The ID of the issue type scheme.
    Long issueTypeId = 56L; // Long | The ID of the issue type.
    try {
      Object result = apiInstance.removeIssueTypeFromIssueTypeScheme(issueTypeSchemeId, issueTypeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeSchemesApi#removeIssueTypeFromIssueTypeScheme");
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
| **issueTypeSchemeId** | **Long**| The ID of the issue type scheme. | |
| **issueTypeId** | **Long**| The ID of the issue type. | |

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
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the issue type scheme is missing or the issue type is not found in the issue type scheme. |  -  |

<a id="reorderIssueTypesInIssueTypeScheme"></a>
# **reorderIssueTypesInIssueTypeScheme**
> Object reorderIssueTypesInIssueTypeScheme(issueTypeSchemeId, orderOfIssueTypes)

Change order of issue types

Changes the order of issue types in an issue type scheme.  The request body parameters must meet the following requirements:   *  all of the issue types must belong to the issue type scheme.  *  either &#x60;after&#x60; or &#x60;position&#x60; must be provided.  *  the issue type in &#x60;after&#x60; must not be in the issue type list.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeSchemesApi;

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

    IssueTypeSchemesApi apiInstance = new IssueTypeSchemesApi(defaultClient);
    Long issueTypeSchemeId = 56L; // Long | The ID of the issue type scheme.
    OrderOfIssueTypes orderOfIssueTypes = new OrderOfIssueTypes(); // OrderOfIssueTypes | 
    try {
      Object result = apiInstance.reorderIssueTypesInIssueTypeScheme(issueTypeSchemeId, orderOfIssueTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeSchemesApi#reorderIssueTypesInIssueTypeScheme");
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
| **issueTypeSchemeId** | **Long**| The ID of the issue type scheme. | |
| **orderOfIssueTypes** | [**OrderOfIssueTypes**](OrderOfIssueTypes.md)|  | |

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
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the issue type scheme is not found. |  -  |

<a id="updateIssueTypeScheme"></a>
# **updateIssueTypeScheme**
> Object updateIssueTypeScheme(issueTypeSchemeId, issueTypeSchemeUpdateDetails)

Update issue type scheme

Updates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeSchemesApi;

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

    IssueTypeSchemesApi apiInstance = new IssueTypeSchemesApi(defaultClient);
    Long issueTypeSchemeId = 56L; // Long | The ID of the issue type scheme.
    IssueTypeSchemeUpdateDetails issueTypeSchemeUpdateDetails = new IssueTypeSchemeUpdateDetails(); // IssueTypeSchemeUpdateDetails | 
    try {
      Object result = apiInstance.updateIssueTypeScheme(issueTypeSchemeId, issueTypeSchemeUpdateDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeSchemesApi#updateIssueTypeScheme");
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
| **issueTypeSchemeId** | **Long**| The ID of the issue type scheme. | |
| **issueTypeSchemeUpdateDetails** | [**IssueTypeSchemeUpdateDetails**](IssueTypeSchemeUpdateDetails.md)|  | |

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
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the issue type scheme is not found. |  -  |

