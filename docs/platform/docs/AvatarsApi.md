# AvatarsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAvatar**](AvatarsApi.md#deleteAvatar) | **DELETE** /rest/api/3/universal_avatar/type/{type}/owner/{owningObjectId}/avatar/{id} | Delete avatar |
| [**getAllSystemAvatars**](AvatarsApi.md#getAllSystemAvatars) | **GET** /rest/api/3/avatar/{type}/system | Get system avatars by type |
| [**getAvatarImageByID**](AvatarsApi.md#getAvatarImageByID) | **GET** /rest/api/3/universal_avatar/view/type/{type}/avatar/{id} | Get avatar image by ID |
| [**getAvatarImageByOwner**](AvatarsApi.md#getAvatarImageByOwner) | **GET** /rest/api/3/universal_avatar/view/type/{type}/owner/{entityId} | Get avatar image by owner |
| [**getAvatarImageByType**](AvatarsApi.md#getAvatarImageByType) | **GET** /rest/api/3/universal_avatar/view/type/{type} | Get avatar image by type |
| [**getAvatars**](AvatarsApi.md#getAvatars) | **GET** /rest/api/3/universal_avatar/type/{type}/owner/{entityId} | Get avatars |
| [**storeAvatar**](AvatarsApi.md#storeAvatar) | **POST** /rest/api/3/universal_avatar/type/{type}/owner/{entityId} | Load avatar |


<a id="deleteAvatar"></a>
# **deleteAvatar**
> deleteAvatar(type, owningObjectId, id)

Delete avatar

Deletes an avatar from a project, issue type or priority.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.AvatarsApi;

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

    AvatarsApi apiInstance = new AvatarsApi(defaultClient);
    String type = "project"; // String | The avatar type.
    String owningObjectId = "owningObjectId_example"; // String | The ID of the item the avatar is associated with.
    Long id = 56L; // Long | The ID of the avatar.
    try {
      apiInstance.deleteAvatar(type, owningObjectId, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#deleteAvatar");
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
| **type** | **String**| The avatar type. | [enum: project, issuetype, priority] |
| **owningObjectId** | **String**| The ID of the item the avatar is associated with. | |
| **id** | **Long**| The ID of the avatar. | |

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
| **400** | Returned if the request is invalid. |  -  |
| **403** | Returned if the user does not have permission to delete the avatar, the avatar is not deletable. |  -  |
| **404** | Returned if the avatar type, associated item ID, or avatar ID is invalid. |  -  |

<a id="getAllSystemAvatars"></a>
# **getAllSystemAvatars**
> SystemAvatars getAllSystemAvatars(type)

Get system avatars by type

Returns a list of system avatar details by owner type, where the owner types are issue type, project, user or priority.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.AvatarsApi;

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

    AvatarsApi apiInstance = new AvatarsApi(defaultClient);
    String type = "issuetype"; // String | The avatar type.
    try {
      SystemAvatars result = apiInstance.getAllSystemAvatars(type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getAllSystemAvatars");
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
| **type** | **String**| The avatar type. | [enum: issuetype, project, user, priority] |

### Return type

[**SystemAvatars**](SystemAvatars.md)

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
| **500** | Returned if an error occurs while retrieving the list of avatars. |  -  |

<a id="getAvatarImageByID"></a>
# **getAvatarImageByID**
> getAvatarImageByID(type, id, size, format)

Get avatar image by ID

Returns a project, issue type or priority avatar image by ID.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  For system avatars, none.  *  For custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  For custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.  *  For priority avatars, none.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.AvatarsApi;

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

    AvatarsApi apiInstance = new AvatarsApi(defaultClient);
    String type = "issuetype"; // String | The icon type of the avatar.
    Long id = 56L; // Long | The ID of the avatar.
    String size = "xsmall"; // String | The size of the avatar image. If not provided the default size is returned.
    String format = "png"; // String | The format to return the avatar image in. If not provided the original content format is returned.
    try {
      apiInstance.getAvatarImageByID(type, id, size, format);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getAvatarImageByID");
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
| **type** | **String**| The icon type of the avatar. | [enum: issuetype, project, priority] |
| **id** | **Long**| The ID of the avatar. | |
| **size** | **String**| The size of the avatar image. If not provided the default size is returned. | [optional] [enum: xsmall, small, medium, large, xlarge] |
| **format** | **String**| The format to return the avatar image in. If not provided the original content format is returned. | [optional] [enum: png, svg] |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json, image/png, image/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if an avatar is not found or an avatar matching the requested size is not found. |  -  |

<a id="getAvatarImageByOwner"></a>
# **getAvatarImageByOwner**
> getAvatarImageByOwner(type, entityId, size, format)

Get avatar image by owner

Returns the avatar image for a project, issue type or priority.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  For system avatars, none.  *  For custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  For custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.  *  For priority avatars, none.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.AvatarsApi;

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

    AvatarsApi apiInstance = new AvatarsApi(defaultClient);
    String type = "issuetype"; // String | The icon type of the avatar.
    String entityId = "entityId_example"; // String | The ID of the project or issue type the avatar belongs to.
    String size = "xsmall"; // String | The size of the avatar image. If not provided the default size is returned.
    String format = "png"; // String | The format to return the avatar image in. If not provided the original content format is returned.
    try {
      apiInstance.getAvatarImageByOwner(type, entityId, size, format);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getAvatarImageByOwner");
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
| **type** | **String**| The icon type of the avatar. | [enum: issuetype, project, priority] |
| **entityId** | **String**| The ID of the project or issue type the avatar belongs to. | |
| **size** | **String**| The size of the avatar image. If not provided the default size is returned. | [optional] [enum: xsmall, small, medium, large, xlarge] |
| **format** | **String**| The format to return the avatar image in. If not provided the original content format is returned. | [optional] [enum: png, svg] |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json, image/png, image/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if an avatar is not found or an avatar matching the requested size is not found. |  -  |

<a id="getAvatarImageByType"></a>
# **getAvatarImageByType**
> getAvatarImageByType(type, size, format)

Get avatar image by type

Returns the default project, issue type or priority avatar image.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.AvatarsApi;

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

    AvatarsApi apiInstance = new AvatarsApi(defaultClient);
    String type = "issuetype"; // String | The icon type of the avatar.
    String size = "xsmall"; // String | The size of the avatar image. If not provided the default size is returned.
    String format = "png"; // String | The format to return the avatar image in. If not provided the original content format is returned.
    try {
      apiInstance.getAvatarImageByType(type, size, format);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getAvatarImageByType");
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
| **type** | **String**| The icon type of the avatar. | [enum: issuetype, project, priority] |
| **size** | **String**| The size of the avatar image. If not provided the default size is returned. | [optional] [enum: xsmall, small, medium, large, xlarge] |
| **format** | **String**| The format to return the avatar image in. If not provided the original content format is returned. | [optional] [enum: png, svg] |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json, image/png, image/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if an avatar is not found or an avatar matching the requested size is not found. |  -  |

<a id="getAvatars"></a>
# **getAvatars**
> Avatars getAvatars(type, entityId)

Get avatars

Returns the system and custom avatars for a project, issue type or priority.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  for custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  for custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.  *  for system avatars, none.  *  for priority avatars, none.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.AvatarsApi;

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

    AvatarsApi apiInstance = new AvatarsApi(defaultClient);
    String type = "project"; // String | The avatar type.
    String entityId = "entityId_example"; // String | The ID of the item the avatar is associated with.
    try {
      Avatars result = apiInstance.getAvatars(type, entityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getAvatars");
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
| **type** | **String**| The avatar type. | [enum: project, issuetype, priority] |
| **entityId** | **String**| The ID of the item the avatar is associated with. | |

### Return type

[**Avatars**](Avatars.md)

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
| **404** | Returned if the avatar type is invalid, the associated item ID is missing, or the item is not found. |  -  |

<a id="storeAvatar"></a>
# **storeAvatar**
> Avatar storeAvatar(type, entityId, size, body, x, y)

Load avatar

Loads a custom avatar for a project, issue type or priority.  Specify the avatar&#39;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST &#x60;  &#x60;--user email@example.com:&lt;api_token&gt; &#x60;  &#x60;--header &#39;X-Atlassian-Token: no-check&#39; &#x60;  &#x60;--header &#39;Content-Type: image/&lt; image_type&gt;&#39; &#x60;  &#x60;--data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; &#x60;  &#x60;--url &#39;https://your-domain.atlassian.net/rest/api/3/universal_avatar/type/{type}/owner/{entityId}&#39;&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#39;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar use:   *  [Update issue type](#api-rest-api-3-issuetype-id-put) to set it as the issue type&#39;s displayed avatar.  *  [Set project avatar](#api-rest-api-3-project-projectIdOrKey-avatar-put) to set it as the project&#39;s displayed avatar.  *  [Update priority](#api-rest-api-3-priority-id-put) to set it as the priority&#39;s displayed avatar.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.AvatarsApi;

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

    AvatarsApi apiInstance = new AvatarsApi(defaultClient);
    String type = "project"; // String | The avatar type.
    String entityId = "entityId_example"; // String | The ID of the item the avatar is associated with.
    Integer size = 0; // Integer | The length of each side of the crop region.
    Object body = null; // Object | 
    Integer x = 0; // Integer | The X coordinate of the top-left corner of the crop region.
    Integer y = 0; // Integer | The Y coordinate of the top-left corner of the crop region.
    try {
      Avatar result = apiInstance.storeAvatar(type, entityId, size, body, x, y);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#storeAvatar");
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
| **type** | **String**| The avatar type. | [enum: project, issuetype, priority] |
| **entityId** | **String**| The ID of the item the avatar is associated with. | |
| **size** | **Integer**| The length of each side of the crop region. | [default to 0] |
| **body** | **Object**|  | |
| **x** | **Integer**| The X coordinate of the top-left corner of the crop region. | [optional] [default to 0] |
| **y** | **Integer**| The Y coordinate of the top-left corner of the crop region. | [optional] [default to 0] |

### Return type

[**Avatar**](Avatar.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the request is successful. |  -  |
| **400** | Returned if:   *  an image isn&#39;t included in the request.  *  the image type is unsupported.  *  the crop parameters extend the crop area beyond the edge of the image. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permissions. |  -  |
| **404** | Returned if the avatar type is invalid, the associated item ID is missing, or the item is not found. |  -  |

