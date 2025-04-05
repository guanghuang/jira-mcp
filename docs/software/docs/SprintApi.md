# SprintApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSprint**](SprintApi.md#createSprint) | **POST** /rest/agile/1.0/sprint | Create sprint |
| [**deleteProperty**](SprintApi.md#deleteProperty) | **DELETE** /rest/agile/1.0/sprint/{sprintId}/properties/{propertyKey} | Delete property |
| [**deleteSprint**](SprintApi.md#deleteSprint) | **DELETE** /rest/agile/1.0/sprint/{sprintId} | Delete sprint |
| [**getIssuesForSprint**](SprintApi.md#getIssuesForSprint) | **GET** /rest/agile/1.0/sprint/{sprintId}/issue | Get issues for sprint |
| [**getPropertiesKeys**](SprintApi.md#getPropertiesKeys) | **GET** /rest/agile/1.0/sprint/{sprintId}/properties | Get properties keys |
| [**getProperty**](SprintApi.md#getProperty) | **GET** /rest/agile/1.0/sprint/{sprintId}/properties/{propertyKey} | Get property |
| [**getSprint**](SprintApi.md#getSprint) | **GET** /rest/agile/1.0/sprint/{sprintId} | Get sprint |
| [**moveIssuesToSprintAndRank**](SprintApi.md#moveIssuesToSprintAndRank) | **POST** /rest/agile/1.0/sprint/{sprintId}/issue | Move issues to sprint and rank |
| [**partiallyUpdateSprint**](SprintApi.md#partiallyUpdateSprint) | **POST** /rest/agile/1.0/sprint/{sprintId} | Partially update sprint |
| [**setProperty**](SprintApi.md#setProperty) | **PUT** /rest/agile/1.0/sprint/{sprintId}/properties/{propertyKey} | Set property |
| [**swapSprint**](SprintApi.md#swapSprint) | **POST** /rest/agile/1.0/sprint/{sprintId}/swap | Swap sprint |
| [**updateSprint**](SprintApi.md#updateSprint) | **PUT** /rest/agile/1.0/sprint/{sprintId} | Update sprint |


<a id="createSprint"></a>
# **createSprint**
> CreateSprint201Response createSprint(createSprintRequest)

Create sprint

Creates a future sprint. Sprint name and origin board id are required. Start date, end date, and goal are optional.  Note that the sprint name is trimmed. Also, when starting sprints from the UI, the \&quot;endDate\&quot; set through this call is ignored and instead the last sprint&#39;s duration is used to fill the form.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SprintApi apiInstance = new SprintApi(defaultClient);
    CreateSprintRequest createSprintRequest = new CreateSprintRequest(); // CreateSprintRequest | 
    try {
      CreateSprint201Response result = apiInstance.createSprint(createSprintRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SprintApi#createSprint");
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
| **createSprintRequest** | [**CreateSprintRequest**](CreateSprintRequest.md)|  | |

### Return type

[**CreateSprint201Response**](CreateSprint201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created sprint |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if the board does not exist or the user does not have permission to view it. |  -  |

<a id="deleteProperty"></a>
# **deleteProperty**
> deleteProperty(sprintId, propertyKey)

Delete property

Removes the property from the sprint identified by the id. Ths user removing the property is required to have permissions to modify the sprint.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SprintApi apiInstance = new SprintApi(defaultClient);
    String sprintId = "sprintId_example"; // String | the ID of the sprint from which the property will be removed.
    String propertyKey = "propertyKey_example"; // String | the key of the property to remove.
    try {
      apiInstance.deleteProperty(sprintId, propertyKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling SprintApi#deleteProperty");
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
| **sprintId** | **String**| the ID of the sprint from which the property will be removed. | |
| **propertyKey** | **String**| the key of the property to remove. | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the sprint property was removed successfully. |  -  |
| **400** | Returned if the sprintId is invalid (negative or not a number). |  -  |
| **401** | Returned if the calling user is not authenticated. |  -  |
| **403** | Returned if the calling user does not have permission to modify the sprint. |  -  |
| **404** | Returned if the sprint with given id does not exist or if the property with given key is not found. |  -  |

<a id="deleteSprint"></a>
# **deleteSprint**
> deleteSprint(sprintId)

Delete sprint

Deletes a sprint. Once a sprint is deleted, all open issues in the sprint will be moved to the backlog.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SprintApi apiInstance = new SprintApi(defaultClient);
    Long sprintId = 56L; // Long | The ID of the sprint to delete.
    try {
      apiInstance.deleteSprint(sprintId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SprintApi#deleteSprint");
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
| **sprintId** | **Long**| The ID of the sprint to delete. | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the sprint was deleted successfully |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license or does not have permission to delete sprints. |  -  |
| **404** | Returned if the sprint does not exist. |  -  |

<a id="getIssuesForSprint"></a>
# **getIssuesForSprint**
> SearchResults getIssuesForSprint(sprintId, startAt, maxResults, jql, validateQuery, fields, expand)

Get issues for sprint

Returns all issues in a sprint, for a given sprint ID. This only includes issues that the user has permission to view. By default, the returned issues are ordered by rank.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SprintApi apiInstance = new SprintApi(defaultClient);
    Long sprintId = 56L; // Long | The ID of the sprint that contains the requested issues.
    Long startAt = 56L; // Long | The starting index of the returned issues. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 56; // Integer | The maximum number of issues to return per page. See the 'Pagination' section at the top of this page for more details. Note, the total number of issues returned is limited by the property 'jira.search.views.default.max' in your Jira instance. If you exceed this limit, your results will be truncated.
    String jql = "jql_example"; // String | Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues.   Note that `username` and `userkey` can't be used as search terms for this parameter due to privacy reasons. Use `accountId` instead.
    Boolean validateQuery = true; // Boolean | Specifies whether to validate the JQL query or not. Default: true.
    List<Object> fields = null; // List<Object> | The list of fields to return for each issue. By default, all navigable and Agile fields are returned.
    String expand = "expand_example"; // String | A comma-separated list of the parameters to expand.
    try {
      SearchResults result = apiInstance.getIssuesForSprint(sprintId, startAt, maxResults, jql, validateQuery, fields, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SprintApi#getIssuesForSprint");
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
| **sprintId** | **Long**| The ID of the sprint that contains the requested issues. | |
| **startAt** | **Long**| The starting index of the returned issues. Base index: 0. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **maxResults** | **Integer**| The maximum number of issues to return per page. See the &#39;Pagination&#39; section at the top of this page for more details. Note, the total number of issues returned is limited by the property &#39;jira.search.views.default.max&#39; in your Jira instance. If you exceed this limit, your results will be truncated. | [optional] |
| **jql** | **String**| Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues.   Note that &#x60;username&#x60; and &#x60;userkey&#x60; can&#39;t be used as search terms for this parameter due to privacy reasons. Use &#x60;accountId&#x60; instead. | [optional] |
| **validateQuery** | **Boolean**| Specifies whether to validate the JQL query or not. Default: true. | [optional] |
| **fields** | [**List&lt;Object&gt;**](Object.md)| The list of fields to return for each issue. By default, all navigable and Agile fields are returned. | [optional] |
| **expand** | **String**| A comma-separated list of the parameters to expand. | [optional] |

### Return type

[**SearchResults**](SearchResults.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested issues, at the specified page of the results. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if sprint does not exist or the user cannot view it. |  -  |

<a id="getPropertiesKeys"></a>
# **getPropertiesKeys**
> GetPropertiesKeys200Response getPropertiesKeys(sprintId)

Get properties keys

Returns the keys of all properties for the sprint identified by the id. The user who retrieves the property keys is required to have permissions to view the sprint.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SprintApi apiInstance = new SprintApi(defaultClient);
    String sprintId = "sprintId_example"; // String | the ID of the sprint from which property keys will be returned.
    try {
      GetPropertiesKeys200Response result = apiInstance.getPropertiesKeys(sprintId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SprintApi#getPropertiesKeys");
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
| **sprintId** | **String**| the ID of the sprint from which property keys will be returned. | |

### Return type

[**GetPropertiesKeys200Response**](GetPropertiesKeys200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the sprint with given id exists. |  -  |
| **400** | Returned if the sprintId is invalid (negative or not a number). |  -  |
| **401** | Returned if the calling user is not authenticated. |  -  |
| **403** | Returned if the calling user does not have permission to view the sprint. |  -  |
| **404** | Returned if the sprint with given id does not exist. |  -  |

<a id="getProperty"></a>
# **getProperty**
> GetProperty200Response getProperty(sprintId, propertyKey)

Get property

Returns the value of the property with a given key from the sprint identified by the provided id. The user who retrieves the property is required to have permissions to view the sprint.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SprintApi apiInstance = new SprintApi(defaultClient);
    String sprintId = "sprintId_example"; // String | the ID of the sprint from which the property will be returned.
    String propertyKey = "propertyKey_example"; // String | the key of the property to return.
    try {
      GetProperty200Response result = apiInstance.getProperty(sprintId, propertyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SprintApi#getProperty");
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
| **sprintId** | **String**| the ID of the sprint from which the property will be returned. | |
| **propertyKey** | **String**| the key of the property to return. | |

### Return type

[**GetProperty200Response**](GetProperty200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the sprint exists and the property was found. |  -  |
| **400** | Returned if the sprintId is invalid (negative or not a number). |  -  |
| **401** | Returned if the calling user is not authenticated. |  -  |
| **403** | Returned if the calling user does not have permission to view the sprint. |  -  |
| **404** | Returned if the sprint with a given id does not exist or if the property with given key is not found. |  -  |

<a id="getSprint"></a>
# **getSprint**
> GetSprint200Response getSprint(sprintId)

Get sprint

Returns the sprint for a given sprint ID. The sprint will only be returned if the user can view the board that the sprint was created on, or view at least one of the issues in the sprint.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SprintApi apiInstance = new SprintApi(defaultClient);
    Long sprintId = 56L; // Long | The ID of the requested sprint.
    try {
      GetSprint200Response result = apiInstance.getSprint(sprintId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SprintApi#getSprint");
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
| **sprintId** | **Long**| The ID of the requested sprint. | |

### Return type

[**GetSprint200Response**](GetSprint200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested sprint. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if the sprint does not exist or the user does not have permission to view it. |  -  |

<a id="moveIssuesToSprintAndRank"></a>
# **moveIssuesToSprintAndRank**
> moveIssuesToSprintAndRank(sprintId, moveIssuesToBacklogForBoardRequest)

Move issues to sprint and rank

Moves issues to a sprint, for a given sprint ID. Issues can only be moved to open or active sprints. The maximum number of issues that can be moved in one operation is 50.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SprintApi apiInstance = new SprintApi(defaultClient);
    Long sprintId = 56L; // Long | The ID of the sprint that you want to assign issues to.
    MoveIssuesToBacklogForBoardRequest moveIssuesToBacklogForBoardRequest = new MoveIssuesToBacklogForBoardRequest(); // MoveIssuesToBacklogForBoardRequest | 
    try {
      apiInstance.moveIssuesToSprintAndRank(sprintId, moveIssuesToBacklogForBoardRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SprintApi#moveIssuesToSprintAndRank");
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
| **sprintId** | **Long**| The ID of the sprint that you want to assign issues to. | |
| **moveIssuesToBacklogForBoardRequest** | [**MoveIssuesToBacklogForBoardRequest**](MoveIssuesToBacklogForBoardRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty response is returned if operation was successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license or does not have permission to assign issues. |  -  |
| **404** | Returned if the sprint does not exist or the user does not have permission to view it. |  -  |

<a id="partiallyUpdateSprint"></a>
# **partiallyUpdateSprint**
> PartiallyUpdateSprint200Response partiallyUpdateSprint(sprintId, updateSprintRequest)

Partially update sprint

Performs a partial update of a sprint. A partial update means that fields not present in the request JSON will not be updated.  Notes:   *  For closed sprints, only the name and goal can be updated; changes to other fields will be ignored.  *  A sprint can be started by updating the state to &#39;active&#39;. This requires the sprint to be in the &#39;future&#39; state and have a startDate and endDate set.  *  A sprint can be completed by updating the state to &#39;closed&#39;. This action requires the sprint to be in the &#39;active&#39; state. This sets the completeDate to the time of the request.  *  Other changes to state are not allowed.  *  The completeDate field cannot be updated manually.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SprintApi apiInstance = new SprintApi(defaultClient);
    Long sprintId = 56L; // Long | The ID of the sprint to update.
    UpdateSprintRequest updateSprintRequest = new UpdateSprintRequest(); // UpdateSprintRequest | 
    try {
      PartiallyUpdateSprint200Response result = apiInstance.partiallyUpdateSprint(sprintId, updateSprintRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SprintApi#partiallyUpdateSprint");
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
| **sprintId** | **Long**| The ID of the sprint to update. | |
| **updateSprintRequest** | [**UpdateSprintRequest**](UpdateSprintRequest.md)|  | |

### Return type

[**PartiallyUpdateSprint200Response**](PartiallyUpdateSprint200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated sprint |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if the sprint does not exist. |  -  |

<a id="setProperty"></a>
# **setProperty**
> Object setProperty(sprintId, propertyKey, body)

Set property

Sets the value of the specified sprint&#39;s property.  You can use this resource to store a custom data against the sprint identified by the id. The user who stores the data is required to have permissions to modify the sprint.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SprintApi apiInstance = new SprintApi(defaultClient);
    String sprintId = "sprintId_example"; // String | the ID of the sprint on which the property will be set.
    String propertyKey = "propertyKey_example"; // String | the key of the sprint's property. The maximum length of the key is 255 bytes.
    Object body = null; // Object | The value of the property. The value has to be a valid, non-empty [JSON](https://tools.ietf.org/html/rfc4627) value. The maximum length of the property value is 32768 bytes.
    try {
      Object result = apiInstance.setProperty(sprintId, propertyKey, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SprintApi#setProperty");
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
| **sprintId** | **String**| the ID of the sprint on which the property will be set. | |
| **propertyKey** | **String**| the key of the sprint&#39;s property. The maximum length of the key is 255 bytes. | |
| **body** | **Object**| The value of the property. The value has to be a valid, non-empty [JSON](https://tools.ietf.org/html/rfc4627) value. The maximum length of the property value is 32768 bytes. | |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the sprint property is successfully updated. |  -  |
| **201** | Returned if the sprint property is successfully created. |  -  |
| **400** | Returned if the sprintId is invalid (negative or not a number). |  -  |
| **401** | Returned if the calling user is not authenticated. |  -  |
| **403** | Returned if the calling user does not have permission to edit the sprint |  -  |
| **404** | Returned if the sprint with given id does not exist. |  -  |

<a id="swapSprint"></a>
# **swapSprint**
> swapSprint(sprintId, swapSprintRequest)

Swap sprint

Swap the position of the sprint with the second sprint.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SprintApi apiInstance = new SprintApi(defaultClient);
    Long sprintId = 56L; // Long | The ID of the sprint to swap.
    SwapSprintRequest swapSprintRequest = new SwapSprintRequest(); // SwapSprintRequest | 
    try {
      apiInstance.swapSprint(sprintId, swapSprintRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SprintApi#swapSprint");
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
| **sprintId** | **Long**| The ID of the sprint to swap. | |
| **swapSprintRequest** | [**SwapSprintRequest**](SwapSprintRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the sprint swap was performed successfully |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license or does not have permission to at least one sprint. |  -  |
| **404** | Returned if at least one sprint does not exist or user does not have permission to view to at least one sprint. |  -  |

<a id="updateSprint"></a>
# **updateSprint**
> UpdateSprint200Response updateSprint(sprintId, updateSprintRequest)

Update sprint

Performs a full update of a sprint. A full update means that the result will be exactly the same as the request body. Any fields not present in the request JSON will be set to null.  Notes:   *  For closed sprints, only the name and goal can be updated; changes to other fields will be ignored.  *  A sprint can be started by updating the state to &#39;active&#39;. This requires the sprint to be in the &#39;future&#39; state and have a startDate and endDate set.  *  A sprint can be completed by updating the state to &#39;closed&#39;. This action requires the sprint to be in the &#39;active&#39; state. This sets the completeDate to the time of the request.  *  Other changes to state are not allowed.  *  The completeDate field cannot be updated manually.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.SprintApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SprintApi apiInstance = new SprintApi(defaultClient);
    Long sprintId = 56L; // Long | the ID of the sprint to update.
    UpdateSprintRequest updateSprintRequest = new UpdateSprintRequest(); // UpdateSprintRequest | 
    try {
      UpdateSprint200Response result = apiInstance.updateSprint(sprintId, updateSprintRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SprintApi#updateSprint");
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
| **sprintId** | **Long**| the ID of the sprint to update. | |
| **updateSprintRequest** | [**UpdateSprintRequest**](UpdateSprintRequest.md)|  | |

### Return type

[**UpdateSprint200Response**](UpdateSprint200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated sprint |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if the sprint does not exist. |  -  |

