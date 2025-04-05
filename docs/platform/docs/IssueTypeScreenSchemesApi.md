# IssueTypeScreenSchemesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appendMappingsForIssueTypeScreenScheme**](IssueTypeScreenSchemesApi.md#appendMappingsForIssueTypeScreenScheme) | **PUT** /rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping | Append mappings to issue type screen scheme |
| [**assignIssueTypeScreenSchemeToProject**](IssueTypeScreenSchemesApi.md#assignIssueTypeScreenSchemeToProject) | **PUT** /rest/api/3/issuetypescreenscheme/project | Assign issue type screen scheme to project |
| [**createIssueTypeScreenScheme**](IssueTypeScreenSchemesApi.md#createIssueTypeScreenScheme) | **POST** /rest/api/3/issuetypescreenscheme | Create issue type screen scheme |
| [**deleteIssueTypeScreenScheme**](IssueTypeScreenSchemesApi.md#deleteIssueTypeScreenScheme) | **DELETE** /rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId} | Delete issue type screen scheme |
| [**getIssueTypeScreenSchemeMappings**](IssueTypeScreenSchemesApi.md#getIssueTypeScreenSchemeMappings) | **GET** /rest/api/3/issuetypescreenscheme/mapping | Get issue type screen scheme items |
| [**getIssueTypeScreenSchemeProjectAssociations**](IssueTypeScreenSchemesApi.md#getIssueTypeScreenSchemeProjectAssociations) | **GET** /rest/api/3/issuetypescreenscheme/project | Get issue type screen schemes for projects |
| [**getIssueTypeScreenSchemes**](IssueTypeScreenSchemesApi.md#getIssueTypeScreenSchemes) | **GET** /rest/api/3/issuetypescreenscheme | Get issue type screen schemes |
| [**getProjectsForIssueTypeScreenScheme**](IssueTypeScreenSchemesApi.md#getProjectsForIssueTypeScreenScheme) | **GET** /rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}/project | Get issue type screen scheme projects |
| [**removeMappingsFromIssueTypeScreenScheme**](IssueTypeScreenSchemesApi.md#removeMappingsFromIssueTypeScreenScheme) | **POST** /rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping/remove | Remove mappings from issue type screen scheme |
| [**updateDefaultScreenScheme**](IssueTypeScreenSchemesApi.md#updateDefaultScreenScheme) | **PUT** /rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping/default | Update issue type screen scheme default screen scheme |
| [**updateIssueTypeScreenScheme**](IssueTypeScreenSchemesApi.md#updateIssueTypeScreenScheme) | **PUT** /rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId} | Update issue type screen scheme |


<a id="appendMappingsForIssueTypeScreenScheme"></a>
# **appendMappingsForIssueTypeScreenScheme**
> Object appendMappingsForIssueTypeScreenScheme(issueTypeScreenSchemeId, issueTypeScreenSchemeMappingDetails)

Append mappings to issue type screen scheme

Appends issue type to screen scheme mappings to an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeScreenSchemesApi;

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

    IssueTypeScreenSchemesApi apiInstance = new IssueTypeScreenSchemesApi(defaultClient);
    String issueTypeScreenSchemeId = "issueTypeScreenSchemeId_example"; // String | The ID of the issue type screen scheme.
    IssueTypeScreenSchemeMappingDetails issueTypeScreenSchemeMappingDetails = new IssueTypeScreenSchemeMappingDetails(); // IssueTypeScreenSchemeMappingDetails | 
    try {
      Object result = apiInstance.appendMappingsForIssueTypeScreenScheme(issueTypeScreenSchemeId, issueTypeScreenSchemeMappingDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeScreenSchemesApi#appendMappingsForIssueTypeScreenScheme");
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
| **issueTypeScreenSchemeId** | **String**| The ID of the issue type screen scheme. | |
| **issueTypeScreenSchemeMappingDetails** | [**IssueTypeScreenSchemeMappingDetails**](IssueTypeScreenSchemeMappingDetails.md)|  | |

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
| **404** | Returned if the issue type screen scheme, issue type, or screen scheme is not found. |  -  |
| **409** | Returned if the issue type is a sub-task, but sub-tasks are disabled in Jira settings. |  -  |

<a id="assignIssueTypeScreenSchemeToProject"></a>
# **assignIssueTypeScreenSchemeToProject**
> Object assignIssueTypeScreenSchemeToProject(issueTypeScreenSchemeProjectAssociation)

Assign issue type screen scheme to project

Assigns an issue type screen scheme to a project.  Issue type screen schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeScreenSchemesApi;

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

    IssueTypeScreenSchemesApi apiInstance = new IssueTypeScreenSchemesApi(defaultClient);
    IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeProjectAssociation = new IssueTypeScreenSchemeProjectAssociation(); // IssueTypeScreenSchemeProjectAssociation | 
    try {
      Object result = apiInstance.assignIssueTypeScreenSchemeToProject(issueTypeScreenSchemeProjectAssociation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeScreenSchemesApi#assignIssueTypeScreenSchemeToProject");
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
| **issueTypeScreenSchemeProjectAssociation** | [**IssueTypeScreenSchemeProjectAssociation**](IssueTypeScreenSchemeProjectAssociation.md)|  | |

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
| **400** | Returned if:   *  project is not found.  *  issue type screen scheme is not found.  *  the project is not a classic project. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the issue type screen scheme or the project are missing. |  -  |

<a id="createIssueTypeScreenScheme"></a>
# **createIssueTypeScreenScheme**
> IssueTypeScreenSchemeId createIssueTypeScreenScheme(issueTypeScreenSchemeDetails)

Create issue type screen scheme

Creates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeScreenSchemesApi;

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

    IssueTypeScreenSchemesApi apiInstance = new IssueTypeScreenSchemesApi(defaultClient);
    IssueTypeScreenSchemeDetails issueTypeScreenSchemeDetails = new IssueTypeScreenSchemeDetails(); // IssueTypeScreenSchemeDetails | An issue type screen scheme bean.
    try {
      IssueTypeScreenSchemeId result = apiInstance.createIssueTypeScreenScheme(issueTypeScreenSchemeDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeScreenSchemesApi#createIssueTypeScreenScheme");
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
| **issueTypeScreenSchemeDetails** | [**IssueTypeScreenSchemeDetails**](IssueTypeScreenSchemeDetails.md)| An issue type screen scheme bean. | |

### Return type

[**IssueTypeScreenSchemeId**](IssueTypeScreenSchemeId.md)

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
| **404** | Returned if the issue type or screen scheme is not found. |  -  |
| **409** | Returned if the issue type is a sub-task, but sub-tasks are disabled in Jira settings. |  -  |

<a id="deleteIssueTypeScreenScheme"></a>
# **deleteIssueTypeScreenScheme**
> Object deleteIssueTypeScreenScheme(issueTypeScreenSchemeId)

Delete issue type screen scheme

Deletes an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeScreenSchemesApi;

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

    IssueTypeScreenSchemesApi apiInstance = new IssueTypeScreenSchemesApi(defaultClient);
    String issueTypeScreenSchemeId = "issueTypeScreenSchemeId_example"; // String | The ID of the issue type screen scheme.
    try {
      Object result = apiInstance.deleteIssueTypeScreenScheme(issueTypeScreenSchemeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeScreenSchemesApi#deleteIssueTypeScreenScheme");
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
| **issueTypeScreenSchemeId** | **String**| The ID of the issue type screen scheme. | |

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
| **204** | Returned if the issue type screen scheme is deleted. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the issue type screen scheme is not found. |  -  |

<a id="getIssueTypeScreenSchemeMappings"></a>
# **getIssueTypeScreenSchemeMappings**
> PageBeanIssueTypeScreenSchemeItem getIssueTypeScreenSchemeMappings(startAt, maxResults, issueTypeScreenSchemeId)

Get issue type screen scheme items

Returns a [paginated](#pagination) list of issue type screen scheme items.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeScreenSchemesApi;

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

    IssueTypeScreenSchemesApi apiInstance = new IssueTypeScreenSchemesApi(defaultClient);
    Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // Integer | The maximum number of items to return per page.
    Set<Long> issueTypeScreenSchemeId = Arrays.asList(); // Set<Long> | The list of issue type screen scheme IDs. To include multiple issue type screen schemes, separate IDs with ampersand: `issueTypeScreenSchemeId=10000&issueTypeScreenSchemeId=10001`.
    try {
      PageBeanIssueTypeScreenSchemeItem result = apiInstance.getIssueTypeScreenSchemeMappings(startAt, maxResults, issueTypeScreenSchemeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeScreenSchemesApi#getIssueTypeScreenSchemeMappings");
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
| **issueTypeScreenSchemeId** | [**Set&lt;Long&gt;**](Long.md)| The list of issue type screen scheme IDs. To include multiple issue type screen schemes, separate IDs with ampersand: &#x60;issueTypeScreenSchemeId&#x3D;10000&amp;issueTypeScreenSchemeId&#x3D;10001&#x60;. | [optional] |

### Return type

[**PageBeanIssueTypeScreenSchemeItem**](PageBeanIssueTypeScreenSchemeItem.md)

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

<a id="getIssueTypeScreenSchemeProjectAssociations"></a>
# **getIssueTypeScreenSchemeProjectAssociations**
> PageBeanIssueTypeScreenSchemesProjects getIssueTypeScreenSchemeProjectAssociations(projectId, startAt, maxResults)

Get issue type screen schemes for projects

Returns a [paginated](#pagination) list of issue type screen schemes and, for each issue type screen scheme, a list of the projects that use it.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeScreenSchemesApi;

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

    IssueTypeScreenSchemesApi apiInstance = new IssueTypeScreenSchemesApi(defaultClient);
    Set<Long> projectId = Arrays.asList(); // Set<Long> | The list of project IDs. To include multiple projects, separate IDs with ampersand: `projectId=10000&projectId=10001`.
    Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // Integer | The maximum number of items to return per page.
    try {
      PageBeanIssueTypeScreenSchemesProjects result = apiInstance.getIssueTypeScreenSchemeProjectAssociations(projectId, startAt, maxResults);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeScreenSchemesApi#getIssueTypeScreenSchemeProjectAssociations");
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
| **projectId** | [**Set&lt;Long&gt;**](Long.md)| The list of project IDs. To include multiple projects, separate IDs with ampersand: &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. | |
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |

### Return type

[**PageBeanIssueTypeScreenSchemesProjects**](PageBeanIssueTypeScreenSchemesProjects.md)

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

<a id="getIssueTypeScreenSchemes"></a>
# **getIssueTypeScreenSchemes**
> PageBeanIssueTypeScreenScheme getIssueTypeScreenSchemes(startAt, maxResults, id, queryString, orderBy, expand)

Get issue type screen schemes

Returns a [paginated](#pagination) list of issue type screen schemes.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeScreenSchemesApi;

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

    IssueTypeScreenSchemesApi apiInstance = new IssueTypeScreenSchemesApi(defaultClient);
    Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // Integer | The maximum number of items to return per page.
    Set<Long> id = Arrays.asList(); // Set<Long> | The list of issue type screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&id=10001`.
    String queryString = ""; // String | String used to perform a case-insensitive partial match with issue type screen scheme name.
    String orderBy = "name"; // String | [Order](#ordering) the results by a field:   *  `name` Sorts by issue type screen scheme name.  *  `id` Sorts by issue type screen scheme ID.
    String expand = ""; // String | Use [expand](#expansion) to include additional information in the response. This parameter accepts `projects` that, for each issue type screen schemes, returns information about the projects the issue type screen scheme is assigned to.
    try {
      PageBeanIssueTypeScreenScheme result = apiInstance.getIssueTypeScreenSchemes(startAt, maxResults, id, queryString, orderBy, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeScreenSchemesApi#getIssueTypeScreenSchemes");
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
| **id** | [**Set&lt;Long&gt;**](Long.md)| The list of issue type screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. | [optional] |
| **queryString** | **String**| String used to perform a case-insensitive partial match with issue type screen scheme name. | [optional] [default to ] |
| **orderBy** | **String**| [Order](#ordering) the results by a field:   *  &#x60;name&#x60; Sorts by issue type screen scheme name.  *  &#x60;id&#x60; Sorts by issue type screen scheme ID. | [optional] [default to id] [enum: name, -name, +name, id, -id, +id] |
| **expand** | **String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts &#x60;projects&#x60; that, for each issue type screen schemes, returns information about the projects the issue type screen scheme is assigned to. | [optional] [default to ] |

### Return type

[**PageBeanIssueTypeScreenScheme**](PageBeanIssueTypeScreenScheme.md)

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

<a id="getProjectsForIssueTypeScreenScheme"></a>
# **getProjectsForIssueTypeScreenScheme**
> PageBeanProjectDetails getProjectsForIssueTypeScreenScheme(issueTypeScreenSchemeId, startAt, maxResults, query)

Get issue type screen scheme projects

Returns a [paginated](#pagination) list of projects associated with an issue type screen scheme.  Only company-managed projects associated with an issue type screen scheme are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeScreenSchemesApi;

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

    IssueTypeScreenSchemesApi apiInstance = new IssueTypeScreenSchemesApi(defaultClient);
    Long issueTypeScreenSchemeId = 56L; // Long | The ID of the issue type screen scheme.
    Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // Integer | The maximum number of items to return per page.
    String query = ""; // String | 
    try {
      PageBeanProjectDetails result = apiInstance.getProjectsForIssueTypeScreenScheme(issueTypeScreenSchemeId, startAt, maxResults, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeScreenSchemesApi#getProjectsForIssueTypeScreenScheme");
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
| **issueTypeScreenSchemeId** | **Long**| The ID of the issue type screen scheme. | |
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |
| **query** | **String**|  | [optional] [default to ] |

### Return type

[**PageBeanProjectDetails**](PageBeanProjectDetails.md)

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

<a id="removeMappingsFromIssueTypeScreenScheme"></a>
# **removeMappingsFromIssueTypeScreenScheme**
> Object removeMappingsFromIssueTypeScreenScheme(issueTypeScreenSchemeId, issueTypeIds)

Remove mappings from issue type screen scheme

Removes issue type to screen scheme mappings from an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeScreenSchemesApi;

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

    IssueTypeScreenSchemesApi apiInstance = new IssueTypeScreenSchemesApi(defaultClient);
    String issueTypeScreenSchemeId = "issueTypeScreenSchemeId_example"; // String | The ID of the issue type screen scheme.
    IssueTypeIds issueTypeIds = new IssueTypeIds(); // IssueTypeIds | 
    try {
      Object result = apiInstance.removeMappingsFromIssueTypeScreenScheme(issueTypeScreenSchemeId, issueTypeIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeScreenSchemesApi#removeMappingsFromIssueTypeScreenScheme");
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
| **issueTypeScreenSchemeId** | **String**| The ID of the issue type screen scheme. | |
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
| **204** | Returned if the screen scheme mappings are removed from the issue type screen scheme. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the issue type screen scheme or one or more issue type mappings are not found. |  -  |

<a id="updateDefaultScreenScheme"></a>
# **updateDefaultScreenScheme**
> Object updateDefaultScreenScheme(issueTypeScreenSchemeId, updateDefaultScreenScheme)

Update issue type screen scheme default screen scheme

Updates the default screen scheme of an issue type screen scheme. The default screen scheme is used for all unmapped issue types.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeScreenSchemesApi;

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

    IssueTypeScreenSchemesApi apiInstance = new IssueTypeScreenSchemesApi(defaultClient);
    String issueTypeScreenSchemeId = "issueTypeScreenSchemeId_example"; // String | The ID of the issue type screen scheme.
    UpdateDefaultScreenScheme updateDefaultScreenScheme = new UpdateDefaultScreenScheme(); // UpdateDefaultScreenScheme | 
    try {
      Object result = apiInstance.updateDefaultScreenScheme(issueTypeScreenSchemeId, updateDefaultScreenScheme);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeScreenSchemesApi#updateDefaultScreenScheme");
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
| **issueTypeScreenSchemeId** | **String**| The ID of the issue type screen scheme. | |
| **updateDefaultScreenScheme** | [**UpdateDefaultScreenScheme**](UpdateDefaultScreenScheme.md)|  | |

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
| **404** | Returned if the issue type screen scheme or the screen scheme is not found, or the screen scheme isn&#39;t used in classic projects. |  -  |

<a id="updateIssueTypeScreenScheme"></a>
# **updateIssueTypeScreenScheme**
> Object updateIssueTypeScreenScheme(issueTypeScreenSchemeId, issueTypeScreenSchemeUpdateDetails)

Update issue type screen scheme

Updates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueTypeScreenSchemesApi;

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

    IssueTypeScreenSchemesApi apiInstance = new IssueTypeScreenSchemesApi(defaultClient);
    String issueTypeScreenSchemeId = "issueTypeScreenSchemeId_example"; // String | The ID of the issue type screen scheme.
    IssueTypeScreenSchemeUpdateDetails issueTypeScreenSchemeUpdateDetails = new IssueTypeScreenSchemeUpdateDetails(); // IssueTypeScreenSchemeUpdateDetails | The issue type screen scheme update details.
    try {
      Object result = apiInstance.updateIssueTypeScreenScheme(issueTypeScreenSchemeId, issueTypeScreenSchemeUpdateDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueTypeScreenSchemesApi#updateIssueTypeScreenScheme");
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
| **issueTypeScreenSchemeId** | **String**| The ID of the issue type screen scheme. | |
| **issueTypeScreenSchemeUpdateDetails** | [**IssueTypeScreenSchemeUpdateDetails**](IssueTypeScreenSchemeUpdateDetails.md)| The issue type screen scheme update details. | |

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
| **404** | Returned if the issue type screen scheme is not found. |  -  |

