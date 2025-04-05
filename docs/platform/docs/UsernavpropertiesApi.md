# UsernavpropertiesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserNavProperty**](UsernavpropertiesApi.md#getUserNavProperty) | **GET** /rest/api/3/user/nav4-opt-property/{propertyKey} | Get user nav property |
| [**setUserNavProperty**](UsernavpropertiesApi.md#setUserNavProperty) | **PUT** /rest/api/3/user/nav4-opt-property/{propertyKey} | Set user nav property |


<a id="getUserNavProperty"></a>
# **getUserNavProperty**
> UserNavPropertyJsonBean getUserNavProperty(propertyKey, accountId)

Get user nav property

Returns the value of a user nav preference.  Note: This operation fetches the property key value directly from RbacClient.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to get a property from any user.  *  Access to Jira, to get a property from the calling user&#39;s record.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.UsernavpropertiesApi;

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

    UsernavpropertiesApi apiInstance = new UsernavpropertiesApi(defaultClient);
    String propertyKey = "propertyKey_example"; // String | The key of the user's property.
    String accountId = "5b10ac8d82e05b22cc7d4ef5"; // String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
    try {
      UserNavPropertyJsonBean result = apiInstance.getUserNavProperty(propertyKey, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsernavpropertiesApi#getUserNavProperty");
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
| **propertyKey** | **String**| The key of the user&#39;s property. | |
| **accountId** | **String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. | [optional] |

### Return type

[**UserNavPropertyJsonBean**](UserNavPropertyJsonBean.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if &#x60;accountId&#x60; is missing or &#x60;propertyKey&#x60; is missing. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission or is not accessing their user record. |  -  |
| **404** | Returned if either the user or property key is not found. |  -  |

<a id="setUserNavProperty"></a>
# **setUserNavProperty**
> Object setUserNavProperty(propertyKey, body, accountId)

Set user nav property

Sets the value of a Nav4 preference. Use this resource to store Nav4 preference data against a user in the Identity service.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set a property on any user.  *  Access to Jira, to set a property on the calling user&#39;s record.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.UsernavpropertiesApi;

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

    UsernavpropertiesApi apiInstance = new UsernavpropertiesApi(defaultClient);
    String propertyKey = "propertyKey_example"; // String | The key of the nav property. The maximum length is 255 characters.
    Object body = null; // Object | The value of the property. The value has to be a boolean [JSON](https://tools.ietf.org/html/rfc4627) value. The maximum length of the property value is 32768 bytes.
    String accountId = "5b10ac8d82e05b22cc7d4ef5"; // String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
    try {
      Object result = apiInstance.setUserNavProperty(propertyKey, body, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsernavpropertiesApi#setUserNavProperty");
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
| **propertyKey** | **String**| The key of the nav property. The maximum length is 255 characters. | |
| **body** | **Object**| The value of the property. The value has to be a boolean [JSON](https://tools.ietf.org/html/rfc4627) value. The maximum length of the property value is 32768 bytes. | |
| **accountId** | **String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. | [optional] |

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
| **200** | Returned if the user property is updated/created. |  -  |
| **400** | Returned if &#x60;accountId&#x60; is missing. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission or is not accessing their user record. |  -  |
| **404** | Returned if the user is not found. |  -  |
| **405** | Returned if the property key is not specified. |  -  |

