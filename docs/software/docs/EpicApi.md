# EpicApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEpic**](EpicApi.md#getEpic) | **GET** /rest/agile/1.0/epic/{epicIdOrKey} | Get epic |
| [**getIssuesForEpic**](EpicApi.md#getIssuesForEpic) | **GET** /rest/agile/1.0/epic/{epicIdOrKey}/issue | Get issues for epic |
| [**getIssuesWithoutEpic**](EpicApi.md#getIssuesWithoutEpic) | **GET** /rest/agile/1.0/epic/none/issue | Get issues without epic |
| [**moveIssuesToEpic**](EpicApi.md#moveIssuesToEpic) | **POST** /rest/agile/1.0/epic/{epicIdOrKey}/issue | Move issues to epic |
| [**partiallyUpdateEpic**](EpicApi.md#partiallyUpdateEpic) | **POST** /rest/agile/1.0/epic/{epicIdOrKey} | Partially update epic |
| [**rankEpics**](EpicApi.md#rankEpics) | **PUT** /rest/agile/1.0/epic/{epicIdOrKey}/rank | Rank epics |
| [**removeIssuesFromEpic**](EpicApi.md#removeIssuesFromEpic) | **POST** /rest/agile/1.0/epic/none/issue | Remove issues from epic |


<a id="getEpic"></a>
# **getEpic**
> GetEpic200Response getEpic(epicIdOrKey)

Get epic

Returns the epic for a given epic ID. This epic will only be returned if the user has permission to view it. **Note:** This operation does not work for epics in next-gen projects.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.EpicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    EpicApi apiInstance = new EpicApi(defaultClient);
    String epicIdOrKey = "epicIdOrKey_example"; // String | The id or key of the requested epic.
    try {
      GetEpic200Response result = apiInstance.getEpic(epicIdOrKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EpicApi#getEpic");
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
| **epicIdOrKey** | **String**| The id or key of the requested epic. | |

### Return type

[**GetEpic200Response**](GetEpic200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested epic. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if the epic does not exist or the user does not have permission to view it. |  -  |

<a id="getIssuesForEpic"></a>
# **getIssuesForEpic**
> SearchResults getIssuesForEpic(epicIdOrKey, startAt, maxResults, jql, validateQuery, fields, expand)

Get issues for epic

Returns all issues that belong to the epic, for the given epic ID. This only includes issues that the user has permission to view. Issues returned from this resource include Agile fields, like sprint, closedSprints, flagged, and epic. By default, the returned issues are ordered by rank. **Note:** If you are querying a next-gen project, do not use this operation. Instead, search for issues that belong to an epic by using the [Search for issues using JQL](https://developer.atlassian.com/cloud/jira/platform/rest/v2/#api-rest-api-2-search-get) operation in the Jira platform REST API. Build your JQL query using the &#x60;parent&#x60; clause. For more information on the &#x60;parent&#x60; JQL field, see [Advanced searching](https://confluence.atlassian.com/x/dAiiLQ#Advancedsearching-fieldsreference-Parent).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.EpicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    EpicApi apiInstance = new EpicApi(defaultClient);
    String epicIdOrKey = "epicIdOrKey_example"; // String | The id or key of the epic that contains the requested issues.
    Long startAt = 56L; // Long | The starting index of the returned issues. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 56; // Integer | The maximum number of issues to return per page. Default: 50. See the 'Pagination' section at the top of this page for more details. Note, the total number of issues returned is limited by the property 'jira.search.views.default.max' in your Jira instance. If you exceed this limit, your results will be truncated.
    String jql = "jql_example"; // String | Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues.   Note that `username` and `userkey` can't be used as search terms for this parameter due to privacy reasons. Use `accountId` instead.
    Boolean validateQuery = true; // Boolean | Specifies whether to validate the JQL query or not. Default: true.
    List<Object> fields = null; // List<Object> | The list of fields to return for each issue. By default, all navigable and Agile fields are returned.
    String expand = "expand_example"; // String | A comma-separated list of the parameters to expand.
    try {
      SearchResults result = apiInstance.getIssuesForEpic(epicIdOrKey, startAt, maxResults, jql, validateQuery, fields, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EpicApi#getIssuesForEpic");
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
| **epicIdOrKey** | **String**| The id or key of the epic that contains the requested issues. | |
| **startAt** | **Long**| The starting index of the returned issues. Base index: 0. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **maxResults** | **Integer**| The maximum number of issues to return per page. Default: 50. See the &#39;Pagination&#39; section at the top of this page for more details. Note, the total number of issues returned is limited by the property &#39;jira.search.views.default.max&#39; in your Jira instance. If you exceed this limit, your results will be truncated. | [optional] |
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
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if the epic does not exist or the user does not have permission to view it. |  -  |

<a id="getIssuesWithoutEpic"></a>
# **getIssuesWithoutEpic**
> SearchResults getIssuesWithoutEpic(startAt, maxResults, jql, validateQuery, fields, expand)

Get issues without epic

Returns all issues that do not belong to any epic. This only includes issues that the user has permission to view. Issues returned from this resource include Agile fields, like sprint, closedSprints, flagged, and epic. By default, the returned issues are ordered by rank. **Note:** If you are querying a next-gen project, do not use this operation. Instead, search for issues that don&#39;t belong to an epic by using the [Search for issues using JQL](https://developer.atlassian.com/cloud/jira/platform/rest/v2/#api-rest-api-2-search-get) operation in the Jira platform REST API. Build your JQL query using the &#x60;parent is empty&#x60; clause. For more information on the &#x60;parent&#x60; JQL field, see [Advanced searching](https://confluence.atlassian.com/x/dAiiLQ#Advancedsearching-fieldsreference-Parent).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.EpicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    EpicApi apiInstance = new EpicApi(defaultClient);
    Long startAt = 56L; // Long | The starting index of the returned issues. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 56; // Integer | The maximum number of issues to return per page. See the 'Pagination' section at the top of this page for more details. Note, the total number of issues returned is limited by the property 'jira.search.views.default.max' in your Jira instance. If you exceed this limit, your results will be truncated.
    String jql = "jql_example"; // String | Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues.
    Boolean validateQuery = true; // Boolean | Specifies whether to validate the JQL query or not. Default: true.
    List<Object> fields = null; // List<Object> | The list of fields to return for each issue. By default, all navigable and Agile fields are returned.
    String expand = "expand_example"; // String | A comma-separated list of the parameters to expand.
    try {
      SearchResults result = apiInstance.getIssuesWithoutEpic(startAt, maxResults, jql, validateQuery, fields, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EpicApi#getIssuesWithoutEpic");
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
| **startAt** | **Long**| The starting index of the returned issues. Base index: 0. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **maxResults** | **Integer**| The maximum number of issues to return per page. See the &#39;Pagination&#39; section at the top of this page for more details. Note, the total number of issues returned is limited by the property &#39;jira.search.views.default.max&#39; in your Jira instance. If you exceed this limit, your results will be truncated. | [optional] |
| **jql** | **String**| Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues. | [optional] |
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
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |

<a id="moveIssuesToEpic"></a>
# **moveIssuesToEpic**
> moveIssuesToEpic(epicIdOrKey, moveIssuesToBacklogRequest)

Move issues to epic

Moves issues to an epic, for a given epic id. Issues can be only in a single epic at the same time. That means that already assigned issues to an epic, will not be assigned to the previous epic anymore. The user needs to have the edit issue permission for all issue they want to move and to the epic. The maximum number of issues that can be moved in one operation is 50. **Note:** This operation does not work for epics in next-gen projects.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.EpicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    EpicApi apiInstance = new EpicApi(defaultClient);
    String epicIdOrKey = "epicIdOrKey_example"; // String | The id or key of the epic that you want to assign issues to.
    MoveIssuesToBacklogRequest moveIssuesToBacklogRequest = new MoveIssuesToBacklogRequest(); // MoveIssuesToBacklogRequest | 
    try {
      apiInstance.moveIssuesToEpic(epicIdOrKey, moveIssuesToBacklogRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EpicApi#moveIssuesToEpic");
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
| **epicIdOrKey** | **String**| The id or key of the epic that you want to assign issues to. | |
| **moveIssuesToBacklogRequest** | [**MoveIssuesToBacklogRequest**](MoveIssuesToBacklogRequest.md)|  | |

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
| **403** | Returned if the user does not a have valid license or does not have edit issue permission for all issues to assign or for the epic. |  -  |
| **404** | Returned if the epic does not exist or the user does not have permission to view it. |  -  |

<a id="partiallyUpdateEpic"></a>
# **partiallyUpdateEpic**
> PartiallyUpdateEpic200Response partiallyUpdateEpic(epicIdOrKey, partiallyUpdateEpicRequest)

Partially update epic

Performs a partial update of the epic. A partial update means that fields not present in the request JSON will not be updated. Valid values for color are &#x60;color_1&#x60; to &#x60;color_9&#x60;. **Note:** This operation does not work for epics in next-gen projects.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.EpicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    EpicApi apiInstance = new EpicApi(defaultClient);
    String epicIdOrKey = "epicIdOrKey_example"; // String | The id or key of the epic to update.
    PartiallyUpdateEpicRequest partiallyUpdateEpicRequest = new PartiallyUpdateEpicRequest(); // PartiallyUpdateEpicRequest | 
    try {
      PartiallyUpdateEpic200Response result = apiInstance.partiallyUpdateEpic(epicIdOrKey, partiallyUpdateEpicRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EpicApi#partiallyUpdateEpic");
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
| **epicIdOrKey** | **String**| The id or key of the epic to update. | |
| **partiallyUpdateEpicRequest** | [**PartiallyUpdateEpicRequest**](PartiallyUpdateEpicRequest.md)|  | |

### Return type

[**PartiallyUpdateEpic200Response**](PartiallyUpdateEpic200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated epic |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license or edit issue permission. |  -  |
| **404** | Returned if the epic does not exist or the user does not have permission to view it. |  -  |

<a id="rankEpics"></a>
# **rankEpics**
> rankEpics(epicIdOrKey, rankEpicsRequest)

Rank epics

Moves (ranks) an epic before or after a given epic.  If rankCustomFieldId is not defined, the default rank field will be used.  **Note:** This operation does not work for epics in next-gen projects.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.EpicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    EpicApi apiInstance = new EpicApi(defaultClient);
    String epicIdOrKey = "epicIdOrKey_example"; // String | The id or key of the epic to rank.
    RankEpicsRequest rankEpicsRequest = new RankEpicsRequest(); // RankEpicsRequest | bean which contains the information where the given epic should be ranked.
    try {
      apiInstance.rankEpics(epicIdOrKey, rankEpicsRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EpicApi#rankEpics");
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
| **epicIdOrKey** | **String**| The id or key of the epic to rank. | |
| **rankEpicsRequest** | [**RankEpicsRequest**](RankEpicsRequest.md)| bean which contains the information where the given epic should be ranked. | |

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
| **403** | Returned if user does not a have valid license or does not have permission to rank. To rank issues user have to have schedule issue permission for epics that they want to rank. |  -  |
| **404** | Returned when the given epics in the path parameter or the request body do not exist. |  -  |

<a id="removeIssuesFromEpic"></a>
# **removeIssuesFromEpic**
> removeIssuesFromEpic(moveIssuesToBacklogRequest)

Remove issues from epic

Removes issues from epics. The user needs to have the edit issue permission for all issue they want to remove from epics. The maximum number of issues that can be moved in one operation is 50. **Note:** This operation does not work for epics in next-gen projects. Instead, update the issue using &#x60;\\{ fields: \\{ parent: \\{\\} \\} \\}&#x60;

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.EpicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    EpicApi apiInstance = new EpicApi(defaultClient);
    MoveIssuesToBacklogRequest moveIssuesToBacklogRequest = new MoveIssuesToBacklogRequest(); // MoveIssuesToBacklogRequest | 
    try {
      apiInstance.removeIssuesFromEpic(moveIssuesToBacklogRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EpicApi#removeIssuesFromEpic");
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
| **moveIssuesToBacklogRequest** | [**MoveIssuesToBacklogRequest**](MoveIssuesToBacklogRequest.md)|  | |

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
| **404** | Returned if the epic does not exist or the user does not have permission to view it. |  -  |

