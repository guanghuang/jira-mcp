# JqlFunctionsAppsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPrecomputations**](JqlFunctionsAppsApi.md#getPrecomputations) | **GET** /rest/api/3/jql/function/computation | Get precomputations (apps) |
| [**getPrecomputationsByID**](JqlFunctionsAppsApi.md#getPrecomputationsByID) | **POST** /rest/api/3/jql/function/computation/search | Get precomputations by ID (apps) |
| [**updatePrecomputations**](JqlFunctionsAppsApi.md#updatePrecomputations) | **POST** /rest/api/3/jql/function/computation | Update precomputations (apps) |


<a id="getPrecomputations"></a>
# **getPrecomputations**
> PageBean2JqlFunctionPrecomputationBean getPrecomputations(functionKey, startAt, maxResults, orderBy)

Get precomputations (apps)

Returns the list of a function&#39;s precomputations along with information about when they were created, updated, and last used. Each precomputation has a &#x60;value&#x60; \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.  The new &#x60;read:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.JqlFunctionsAppsApi;

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

    JqlFunctionsAppsApi apiInstance = new JqlFunctionsAppsApi(defaultClient);
    List<String> functionKey = Arrays.asList(""""); // List<String> | The function key in format:   *  Forge: `ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]`  *  Connect: `[App key]__[Module key]`
    Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
    Integer maxResults = 100; // Integer | The maximum number of items to return per page.
    String orderBy = "orderBy_example"; // String | [Order](#ordering) the results by a field:   *  `functionKey` Sorts by the functionKey.  *  `used` Sorts by the used timestamp.  *  `created` Sorts by the created timestamp.  *  `updated` Sorts by the updated timestamp.
    try {
      PageBean2JqlFunctionPrecomputationBean result = apiInstance.getPrecomputations(functionKey, startAt, maxResults, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlFunctionsAppsApi#getPrecomputations");
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
| **functionKey** | [**List&lt;String&gt;**](String.md)| The function key in format:   *  Forge: &#x60;ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]&#x60;  *  Connect: &#x60;[App key]__[Module key]&#x60; | [optional] |
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 100] |
| **orderBy** | **String**| [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. | [optional] |

### Return type

[**PageBean2JqlFunctionPrecomputationBean**](PageBean2JqlFunctionPrecomputationBean.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the request is not authenticated as the app that provided the function. |  -  |
| **404** | Returned if the function is not found. |  -  |

<a id="getPrecomputationsByID"></a>
# **getPrecomputationsByID**
> JqlFunctionPrecomputationGetByIdResponse getPrecomputationsByID(jqlFunctionPrecomputationGetByIdRequest, orderBy)

Get precomputations by ID (apps)

Returns function precomputations by IDs, along with information about when they were created, updated, and last used. Each precomputation has a &#x60;value&#x60; \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.  The new &#x60;read:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.JqlFunctionsAppsApi;

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

    JqlFunctionsAppsApi apiInstance = new JqlFunctionsAppsApi(defaultClient);
    JqlFunctionPrecomputationGetByIdRequest jqlFunctionPrecomputationGetByIdRequest = new JqlFunctionPrecomputationGetByIdRequest(); // JqlFunctionPrecomputationGetByIdRequest | 
    String orderBy = "orderBy_example"; // String | [Order](#ordering) the results by a field:   *  `functionKey` Sorts by the functionKey.  *  `used` Sorts by the used timestamp.  *  `created` Sorts by the created timestamp.  *  `updated` Sorts by the updated timestamp.
    try {
      JqlFunctionPrecomputationGetByIdResponse result = apiInstance.getPrecomputationsByID(jqlFunctionPrecomputationGetByIdRequest, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlFunctionsAppsApi#getPrecomputationsByID");
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
| **jqlFunctionPrecomputationGetByIdRequest** | [**JqlFunctionPrecomputationGetByIdRequest**](JqlFunctionPrecomputationGetByIdRequest.md)|  | |
| **orderBy** | **String**| [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. | [optional] |

### Return type

[**JqlFunctionPrecomputationGetByIdResponse**](JqlFunctionPrecomputationGetByIdResponse.md)

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
| **403** | Returned if the request is not authenticated as the app that provided the function. |  -  |
| **404** | Returned if the function is not found. |  -  |

<a id="updatePrecomputations"></a>
# **updatePrecomputations**
> JqlFunctionPrecomputationUpdateResponse updatePrecomputations(jqlFunctionPrecomputationUpdateRequestBean, skipNotFoundPrecomputations)

Update precomputations (apps)

Update the precomputation value of a function created by a Forge/Connect app.  **[Permissions](#permissions) required:** An API for apps to update their own precomputations.  The new &#x60;write:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.JqlFunctionsAppsApi;

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

    JqlFunctionsAppsApi apiInstance = new JqlFunctionsAppsApi(defaultClient);
    JqlFunctionPrecomputationUpdateRequestBean jqlFunctionPrecomputationUpdateRequestBean = new JqlFunctionPrecomputationUpdateRequestBean(); // JqlFunctionPrecomputationUpdateRequestBean | 
    Boolean skipNotFoundPrecomputations = false; // Boolean | 
    try {
      JqlFunctionPrecomputationUpdateResponse result = apiInstance.updatePrecomputations(jqlFunctionPrecomputationUpdateRequestBean, skipNotFoundPrecomputations);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JqlFunctionsAppsApi#updatePrecomputations");
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
| **jqlFunctionPrecomputationUpdateRequestBean** | [**JqlFunctionPrecomputationUpdateRequestBean**](JqlFunctionPrecomputationUpdateRequestBean.md)|  | |
| **skipNotFoundPrecomputations** | **Boolean**|  | [optional] [default to false] |

### Return type

[**JqlFunctionPrecomputationUpdateResponse**](JqlFunctionPrecomputationUpdateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |
| **204** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **403** | Returned if the request is not authenticated as the app that provided the function. |  -  |
| **404** | Returned if the function is not found. |  -  |

