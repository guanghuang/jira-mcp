# ScreenTabsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addScreenTab**](ScreenTabsApi.md#addScreenTab) | **POST** /rest/api/3/screens/{screenId}/tabs | Create screen tab |
| [**deleteScreenTab**](ScreenTabsApi.md#deleteScreenTab) | **DELETE** /rest/api/3/screens/{screenId}/tabs/{tabId} | Delete screen tab |
| [**getAllScreenTabs**](ScreenTabsApi.md#getAllScreenTabs) | **GET** /rest/api/3/screens/{screenId}/tabs | Get all screen tabs |
| [**getBulkScreenTabs**](ScreenTabsApi.md#getBulkScreenTabs) | **GET** /rest/api/3/screens/tabs | Get bulk screen tabs |
| [**moveScreenTab**](ScreenTabsApi.md#moveScreenTab) | **POST** /rest/api/3/screens/{screenId}/tabs/{tabId}/move/{pos} | Move screen tab |
| [**renameScreenTab**](ScreenTabsApi.md#renameScreenTab) | **PUT** /rest/api/3/screens/{screenId}/tabs/{tabId} | Update screen tab |


<a id="addScreenTab"></a>
# **addScreenTab**
> ScreenableTab addScreenTab(screenId, screenableTab)

Create screen tab

Creates a tab for a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.ScreenTabsApi;

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

    ScreenTabsApi apiInstance = new ScreenTabsApi(defaultClient);
    Long screenId = 56L; // Long | The ID of the screen.
    ScreenableTab screenableTab = new ScreenableTab(); // ScreenableTab | 
    try {
      ScreenableTab result = apiInstance.addScreenTab(screenId, screenableTab);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreenTabsApi#addScreenTab");
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
| **screenId** | **Long**| The ID of the screen. | |
| **screenableTab** | [**ScreenableTab**](ScreenableTab.md)|  | |

### Return type

[**ScreenableTab**](ScreenableTab.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the screen is not found. |  -  |

<a id="deleteScreenTab"></a>
# **deleteScreenTab**
> deleteScreenTab(screenId, tabId)

Delete screen tab

Deletes a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.ScreenTabsApi;

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

    ScreenTabsApi apiInstance = new ScreenTabsApi(defaultClient);
    Long screenId = 56L; // Long | The ID of the screen.
    Long tabId = 56L; // Long | The ID of the screen tab.
    try {
      apiInstance.deleteScreenTab(screenId, tabId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreenTabsApi#deleteScreenTab");
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
| **screenId** | **Long**| The ID of the screen. | |
| **tabId** | **Long**| The ID of the screen tab. | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the screen or screen tab is not found. |  -  |

<a id="getAllScreenTabs"></a>
# **getAllScreenTabs**
> List&lt;ScreenableTab&gt; getAllScreenTabs(screenId, projectKey)

Get all screen tabs

Returns the list of tabs for a screen.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.ScreenTabsApi;

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

    ScreenTabsApi apiInstance = new ScreenTabsApi(defaultClient);
    Long screenId = 56L; // Long | The ID of the screen.
    String projectKey = "projectKey_example"; // String | The key of the project.
    try {
      List<ScreenableTab> result = apiInstance.getAllScreenTabs(screenId, projectKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreenTabsApi#getAllScreenTabs");
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
| **screenId** | **Long**| The ID of the screen. | |
| **projectKey** | **String**| The key of the project. | [optional] |

### Return type

[**List&lt;ScreenableTab&gt;**](ScreenableTab.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the screen ID is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the screen is not found. |  -  |

<a id="getBulkScreenTabs"></a>
# **getBulkScreenTabs**
> getBulkScreenTabs(screenId, tabId, startAt, maxResult)

Get bulk screen tabs

Returns the list of tabs for a bulk of screens.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.ScreenTabsApi;

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

    ScreenTabsApi apiInstance = new ScreenTabsApi(defaultClient);
    Set<Long> screenId = Arrays.asList(); // Set<Long> | The list of screen IDs. To include multiple screen IDs, provide an ampersand-separated list. For example, `screenId=10000&screenId=10001`.
    Set<Long> tabId = Arrays.asList(); // Set<Long> | The list of tab IDs. To include multiple tab IDs, provide an ampersand-separated list. For example, `tabId=10000&tabId=10001`.
    Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
    Integer maxResult = 100; // Integer | The maximum number of items to return per page. The maximum number is 100,
    try {
      apiInstance.getBulkScreenTabs(screenId, tabId, startAt, maxResult);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreenTabsApi#getBulkScreenTabs");
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
| **screenId** | [**Set&lt;Long&gt;**](Long.md)| The list of screen IDs. To include multiple screen IDs, provide an ampersand-separated list. For example, &#x60;screenId&#x3D;10000&amp;screenId&#x3D;10001&#x60;. | [optional] |
| **tabId** | [**Set&lt;Long&gt;**](Long.md)| The list of tab IDs. To include multiple tab IDs, provide an ampersand-separated list. For example, &#x60;tabId&#x3D;10000&amp;tabId&#x3D;10001&#x60;. | [optional] |
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResult** | **Integer**| The maximum number of items to return per page. The maximum number is 100, | [optional] [default to 100] |

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
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the screen ID or the tab ID is empty. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |

<a id="moveScreenTab"></a>
# **moveScreenTab**
> Object moveScreenTab(screenId, tabId, pos)

Move screen tab

Moves a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.ScreenTabsApi;

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

    ScreenTabsApi apiInstance = new ScreenTabsApi(defaultClient);
    Long screenId = 56L; // Long | The ID of the screen.
    Long tabId = 56L; // Long | The ID of the screen tab.
    Integer pos = 56; // Integer | The position of tab. The base index is 0.
    try {
      Object result = apiInstance.moveScreenTab(screenId, tabId, pos);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreenTabsApi#moveScreenTab");
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
| **screenId** | **Long**| The ID of the screen. | |
| **tabId** | **Long**| The ID of the screen tab. | |
| **pos** | **Integer**| The position of tab. The base index is 0. | |

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
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the screen or screen tab is not found or the position is invalid. |  -  |

<a id="renameScreenTab"></a>
# **renameScreenTab**
> ScreenableTab renameScreenTab(screenId, tabId, screenableTab)

Update screen tab

Updates the name of a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.ScreenTabsApi;

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

    ScreenTabsApi apiInstance = new ScreenTabsApi(defaultClient);
    Long screenId = 56L; // Long | The ID of the screen.
    Long tabId = 56L; // Long | The ID of the screen tab.
    ScreenableTab screenableTab = new ScreenableTab(); // ScreenableTab | 
    try {
      ScreenableTab result = apiInstance.renameScreenTab(screenId, tabId, screenableTab);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreenTabsApi#renameScreenTab");
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
| **screenId** | **Long**| The ID of the screen. | |
| **tabId** | **Long**| The ID of the screen tab. | |
| **screenableTab** | [**ScreenableTab**](ScreenableTab.md)|  | |

### Return type

[**ScreenableTab**](ScreenableTab.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the screen or screen tab is not found. |  -  |

