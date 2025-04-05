# BoardApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBoard**](BoardApi.md#createBoard) | **POST** /rest/agile/1.0/board | Create board |
| [**deleteBoard**](BoardApi.md#deleteBoard) | **DELETE** /rest/agile/1.0/board/{boardId} | Delete board |
| [**deleteBoardProperty**](BoardApi.md#deleteBoardProperty) | **DELETE** /rest/agile/1.0/board/{boardId}/properties/{propertyKey} | Delete board property |
| [**getAllBoards**](BoardApi.md#getAllBoards) | **GET** /rest/agile/1.0/board | Get all boards |
| [**getAllQuickFilters**](BoardApi.md#getAllQuickFilters) | **GET** /rest/agile/1.0/board/{boardId}/quickfilter | Get all quick filters |
| [**getAllSprints**](BoardApi.md#getAllSprints) | **GET** /rest/agile/1.0/board/{boardId}/sprint | Get all sprints |
| [**getAllVersions**](BoardApi.md#getAllVersions) | **GET** /rest/agile/1.0/board/{boardId}/version | Get all versions |
| [**getBoard**](BoardApi.md#getBoard) | **GET** /rest/agile/1.0/board/{boardId} | Get board |
| [**getBoardByFilterId**](BoardApi.md#getBoardByFilterId) | **GET** /rest/agile/1.0/board/filter/{filterId} | Get board by filter id |
| [**getBoardIssuesForEpic**](BoardApi.md#getBoardIssuesForEpic) | **GET** /rest/agile/1.0/board/{boardId}/epic/{epicId}/issue | Get board issues for epic |
| [**getBoardIssuesForSprint**](BoardApi.md#getBoardIssuesForSprint) | **GET** /rest/agile/1.0/board/{boardId}/sprint/{sprintId}/issue | Get board issues for sprint |
| [**getBoardProperty**](BoardApi.md#getBoardProperty) | **GET** /rest/agile/1.0/board/{boardId}/properties/{propertyKey} | Get board property |
| [**getBoardPropertyKeys**](BoardApi.md#getBoardPropertyKeys) | **GET** /rest/agile/1.0/board/{boardId}/properties | Get board property keys |
| [**getConfiguration**](BoardApi.md#getConfiguration) | **GET** /rest/agile/1.0/board/{boardId}/configuration | Get configuration |
| [**getEpics**](BoardApi.md#getEpics) | **GET** /rest/agile/1.0/board/{boardId}/epic | Get epics |
| [**getFeaturesForBoard**](BoardApi.md#getFeaturesForBoard) | **GET** /rest/agile/1.0/board/{boardId}/features | Get features for board |
| [**getIssuesForBacklog**](BoardApi.md#getIssuesForBacklog) | **GET** /rest/agile/1.0/board/{boardId}/backlog | Get issues for backlog |
| [**getIssuesForBoard**](BoardApi.md#getIssuesForBoard) | **GET** /rest/agile/1.0/board/{boardId}/issue | Get issues for board |
| [**getIssuesWithoutEpicForBoard**](BoardApi.md#getIssuesWithoutEpicForBoard) | **GET** /rest/agile/1.0/board/{boardId}/epic/none/issue | Get issues without epic for board |
| [**getProjects**](BoardApi.md#getProjects) | **GET** /rest/agile/1.0/board/{boardId}/project | Get projects |
| [**getProjectsFull**](BoardApi.md#getProjectsFull) | **GET** /rest/agile/1.0/board/{boardId}/project/full | Get projects full |
| [**getQuickFilter**](BoardApi.md#getQuickFilter) | **GET** /rest/agile/1.0/board/{boardId}/quickfilter/{quickFilterId} | Get quick filter |
| [**getReportsForBoard**](BoardApi.md#getReportsForBoard) | **GET** /rest/agile/1.0/board/{boardId}/reports | Get reports for board |
| [**moveIssuesToBoard**](BoardApi.md#moveIssuesToBoard) | **POST** /rest/agile/1.0/board/{boardId}/issue | Move issues to board |
| [**setBoardProperty**](BoardApi.md#setBoardProperty) | **PUT** /rest/agile/1.0/board/{boardId}/properties/{propertyKey} | Set board property |
| [**toggleFeatures**](BoardApi.md#toggleFeatures) | **PUT** /rest/agile/1.0/board/{boardId}/features | Toggle features |


<a id="createBoard"></a>
# **createBoard**
> GetAllBoards200ResponseValuesInner createBoard(createBoardRequest)

Create board

Creates a new board. Board name, type and filter ID is required.   *  &#x60;name&#x60; \\- Must be less than 255 characters.  *  &#x60;type&#x60; \\- Valid values: scrum, kanban  *  &#x60;filterId&#x60; \\- ID of a filter that the user has permissions to view. Note, if the user does not have the &#39;Create shared objects&#39; permission and tries to create a shared board, a private board will be created instead (remember that board sharing depends on the filter sharing).  *  &#x60;location&#x60; \\- The container that the board will be located in. &#x60;location&#x60; must include the &#x60;type&#x60; property (Valid values: project, user). If choosing &#39;project&#39;, then a project must be specified by a &#x60;projectKeyOrId&#x60; property in &#x60;location&#x60;. If choosing &#39;user&#39;, the current user is chosen by default. The &#x60;projectKeyOrId&#x60; property should not be provided.  Note:   *  If you want to create a new project with an associated board, use the [Jira platform REST API](https://docs.atlassian.com/jira/REST/latest). For more information, see the [Create project](#api-rest-api-3-project-post) method. The &#x60;projectTypeKey&#x60; for software boards must be &#39;software&#39; and the &#x60;projectTemplateKey&#x60; must be either &#x60;com.pyxis.greenhopper.jira:gh-kanban-template&#x60; or &#x60;com.pyxis.greenhopper.jira:gh-scrum-template&#x60;.  *  You can create a filter using the [Jira REST API](https://docs.atlassian.com/jira/REST/latest). For more information, see the [Create filter](#api-rest-api-3-filter-post) method.  *  If you do not ORDER BY the Rank field for the filter of your board, you will not be able to reorder issues on the board.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    CreateBoardRequest createBoardRequest = new CreateBoardRequest(); // CreateBoardRequest | 
    try {
      GetAllBoards200ResponseValuesInner result = apiInstance.createBoard(createBoardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#createBoard");
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
| **createBoardRequest** | [**CreateBoardRequest**](CreateBoardRequest.md)|  | |

### Return type

[**GetAllBoards200ResponseValuesInner**](GetAllBoards200ResponseValuesInner.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the created board. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |

<a id="deleteBoard"></a>
# **deleteBoard**
> deleteBoard(boardId)

Delete board

Deletes the board. Admin without the view permission can still remove the board.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | ID of the board to be deleted
    try {
      apiInstance.deleteBoard(boardId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#deleteBoard");
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
| **boardId** | **Long**| ID of the board to be deleted | |

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
| **204** | Returned if the board has been successfully removed. |  -  |
| **403** | Returned if the user does not a have valid license, or when the user does not have the permission to delete the board, or when the user tried to delete a next-gen board. The user has to be a Jira Administrator or a board administrator to remove the board. Next-gen boards cannot be deleted, because next-gen software projects must have a board. |  -  |
| **404** | Returned if a board with the given ID does not exist or the user does not have the permission to view the board. |  -  |

<a id="deleteBoardProperty"></a>
# **deleteBoardProperty**
> deleteBoardProperty(boardId, propertyKey)

Delete board property

Removes the property from the board identified by the id. Ths user removing the property is required to have permissions to modify the board.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    String boardId = "boardId_example"; // String | the id of the board from which the property will be removed.
    String propertyKey = "propertyKey_example"; // String | the key of the property to remove.
    try {
      apiInstance.deleteBoardProperty(boardId, propertyKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#deleteBoardProperty");
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
| **boardId** | **String**| the id of the board from which the property will be removed. | |
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
| **204** | Returned if the board property was removed successfully. |  -  |
| **400** | Returned if the boardId is invalid (negative or not a number). |  -  |
| **401** | Returned if the calling user is not authenticated. |  -  |
| **404** | Returned if the board with given id does not exist, or if the property with given key is not found, or the user doesn&#39;t have permissions to see it. |  -  |

<a id="getAllBoards"></a>
# **getAllBoards**
> GetAllBoards200Response getAllBoards(startAt, maxResults, type, name, projectKeyOrId, accountIdLocation, projectLocation, includePrivate, negateLocationFiltering, orderBy, expand, projectTypeLocation, filterId)

Get all boards

Returns all boards. This only includes boards that the user has permission to view.  **Deprecation notice:** The required OAuth 2.0 scopes will be updated on February 15, 2024.   *  &#x60;read:board-scope:jira-software&#x60;, &#x60;read:project:jira&#x60;

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long startAt = 0L; // Long | The starting index of the returned boards. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 50; // Integer | The maximum number of boards to return per page. See the 'Pagination' section at the top of this page for more details.
    Object type = null; // Object | Filters results to boards of the specified types. Valid values: scrum, kanban, simple.
    String name = "name_example"; // String | Filters results to boards that match or partially match the specified name.
    String projectKeyOrId = "projectKeyOrId_example"; // String | Filters results to boards that are relevant to a project. Relevance means that the jql filter defined in board contains a reference to a project.
    String accountIdLocation = "accountIdLocation_example"; // String | 
    String projectLocation = "projectLocation_example"; // String | 
    Boolean includePrivate = true; // Boolean | Appends private boards to the end of the list. The name and type fields are excluded for security reasons.
    Boolean negateLocationFiltering = true; // Boolean | If set to true, negate filters used for querying by location. By default false.
    String orderBy = "name"; // String | Ordering of the results by a given field. If not provided, values will not be sorted. Valid values: name.
    String expand = "expand_example"; // String | List of fields to expand for each board. Valid values: admins, permissions.
    List<String> projectTypeLocation = Arrays.asList(""""); // List<String> | Filters results to boards that are relevant to a project types. Support Jira Software, Jira Service Management. Valid values: software, service\\_desk. By default software.
    Long filterId = 56L; // Long | Filters results to boards that are relevant to a filter. Not supported for next-gen boards.
    try {
      GetAllBoards200Response result = apiInstance.getAllBoards(startAt, maxResults, type, name, projectKeyOrId, accountIdLocation, projectLocation, includePrivate, negateLocationFiltering, orderBy, expand, projectTypeLocation, filterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getAllBoards");
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
| **startAt** | **Long**| The starting index of the returned boards. Base index: 0. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of boards to return per page. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] [default to 50] |
| **type** | [**Object**](.md)| Filters results to boards of the specified types. Valid values: scrum, kanban, simple. | [optional] |
| **name** | **String**| Filters results to boards that match or partially match the specified name. | [optional] |
| **projectKeyOrId** | **String**| Filters results to boards that are relevant to a project. Relevance means that the jql filter defined in board contains a reference to a project. | [optional] |
| **accountIdLocation** | **String**|  | [optional] |
| **projectLocation** | **String**|  | [optional] |
| **includePrivate** | **Boolean**| Appends private boards to the end of the list. The name and type fields are excluded for security reasons. | [optional] |
| **negateLocationFiltering** | **Boolean**| If set to true, negate filters used for querying by location. By default false. | [optional] |
| **orderBy** | **String**| Ordering of the results by a given field. If not provided, values will not be sorted. Valid values: name. | [optional] [enum: name, -name, +name] |
| **expand** | **String**| List of fields to expand for each board. Valid values: admins, permissions. | [optional] |
| **projectTypeLocation** | [**List&lt;String&gt;**](String.md)| Filters results to boards that are relevant to a project types. Support Jira Software, Jira Service Management. Valid values: software, service\\_desk. By default software. | [optional] |
| **filterId** | **Long**| Filters results to boards that are relevant to a filter. Not supported for next-gen boards. | [optional] |

### Return type

[**GetAllBoards200Response**](GetAllBoards200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested boards, at the specified page of the results. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not have valid license. |  -  |

<a id="getAllQuickFilters"></a>
# **getAllQuickFilters**
> GetAllQuickFilters200Response getAllQuickFilters(boardId, startAt, maxResults)

Get all quick filters

Returns all quick filters from a board, for a given board ID.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | The ID of the board that contains the requested quick filters.
    Long startAt = 56L; // Long | The starting index of the returned quick filters. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 56; // Integer | The maximum number of sprints to return per page. See the 'Pagination' section at the top of this page for more details.
    try {
      GetAllQuickFilters200Response result = apiInstance.getAllQuickFilters(boardId, startAt, maxResults);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getAllQuickFilters");
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
| **boardId** | **Long**| The ID of the board that contains the requested quick filters. | |
| **startAt** | **Long**| The starting index of the returned quick filters. Base index: 0. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **maxResults** | **Integer**| The maximum number of sprints to return per page. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |

### Return type

[**GetAllQuickFilters200Response**](GetAllQuickFilters200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested quick filters, at the specified page of the results. Quick filters will be ordered first by position. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if board does not exist or the user does not have permission to view it. |  -  |

<a id="getAllSprints"></a>
# **getAllSprints**
> GetAllSprints200Response getAllSprints(boardId, startAt, maxResults, state)

Get all sprints

Returns all sprints from a board, for a given board ID. This only includes sprints that the user has permission to view.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | The ID of the board that contains the requested sprints.
    Long startAt = 56L; // Long | The starting index of the returned sprints. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 56; // Integer | The maximum number of sprints to return per page. See the 'Pagination' section at the top of this page for more details.
    Object state = null; // Object | Filters results to sprints in specified states. Valid values: future, active, closed. You can define multiple states separated by commas, e.g. state=active,closed
    try {
      GetAllSprints200Response result = apiInstance.getAllSprints(boardId, startAt, maxResults, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getAllSprints");
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
| **boardId** | **Long**| The ID of the board that contains the requested sprints. | |
| **startAt** | **Long**| The starting index of the returned sprints. Base index: 0. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **maxResults** | **Integer**| The maximum number of sprints to return per page. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **state** | [**Object**](.md)| Filters results to sprints in specified states. Valid values: future, active, closed. You can define multiple states separated by commas, e.g. state&#x3D;active,closed | [optional] |

### Return type

[**GetAllSprints200Response**](GetAllSprints200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested sprints, at the specified page of the results. Sprints will be ordered first by state (i.e. closed, active, future) then by their position in the backlog. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if board does not exist or the user does not have permission to view it. |  -  |

<a id="getAllVersions"></a>
# **getAllVersions**
> GetAllVersions200Response getAllVersions(boardId, startAt, maxResults, released)

Get all versions

Returns all versions from a board, for a given board ID. This only includes versions that the user has permission to view. Note, if the user does not have permission to view the board, no versions will be returned at all. Returned versions are ordered by the name of the project from which they belong and then by sequence defined by user.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | The ID of the board that contains the requested versions.
    Long startAt = 56L; // Long | The starting index of the returned versions. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 56; // Integer | The maximum number of versions to return per page. See the 'Pagination' section at the top of this page for more details.
    String released = "released_example"; // String | Filters results to versions that are either released or unreleased. Valid values: true, false.
    try {
      GetAllVersions200Response result = apiInstance.getAllVersions(boardId, startAt, maxResults, released);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getAllVersions");
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
| **boardId** | **Long**| The ID of the board that contains the requested versions. | |
| **startAt** | **Long**| The starting index of the returned versions. Base index: 0. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **maxResults** | **Integer**| The maximum number of versions to return per page. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **released** | **String**| Filters results to versions that are either released or unreleased. Valid values: true, false. | [optional] |

### Return type

[**GetAllVersions200Response**](GetAllVersions200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested versions, at the specified page of the results. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if board does not exist or the user does not have permission to view it. |  -  |

<a id="getBoard"></a>
# **getBoard**
> GetAllBoards200ResponseValuesInner getBoard(boardId)

Get board

Returns the board for the given board ID. This board will only be returned if the user has permission to view it. Admins without the view permission will see the board as a private one, so will see only a subset of the board&#39;s data (board location for instance).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | The ID of the requested board.
    try {
      GetAllBoards200ResponseValuesInner result = apiInstance.getBoard(boardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getBoard");
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
| **boardId** | **Long**| The ID of the requested board. | |

### Return type

[**GetAllBoards200ResponseValuesInner**](GetAllBoards200ResponseValuesInner.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested board. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if the board does not exist or the user does not have permission to view it. |  -  |

<a id="getBoardByFilterId"></a>
# **getBoardByFilterId**
> GetBoardByFilterId200Response getBoardByFilterId(filterId, startAt, maxResults)

Get board by filter id

Returns any boards which use the provided filter id. This method can be executed by users without a valid software license in order to find which boards are using a particular filter.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long filterId = 56L; // Long | Filters results to boards that are relevant to a filter. Not supported for next-gen boards.
    Long startAt = 56L; // Long | The starting index of the returned boards. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 56; // Integer | The maximum number of boards to return per page. Default: 50. See the 'Pagination' section at the top of this page for more details.
    try {
      GetBoardByFilterId200Response result = apiInstance.getBoardByFilterId(filterId, startAt, maxResults);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getBoardByFilterId");
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
| **filterId** | **Long**| Filters results to boards that are relevant to a filter. Not supported for next-gen boards. | |
| **startAt** | **Long**| The starting index of the returned boards. Base index: 0. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **maxResults** | **Integer**| The maximum number of boards to return per page. Default: 50. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |

### Return type

[**GetBoardByFilterId200Response**](GetBoardByFilterId200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested boards, at the specified page of the results. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |

<a id="getBoardIssuesForEpic"></a>
# **getBoardIssuesForEpic**
> SearchResults getBoardIssuesForEpic(boardId, epicId, startAt, maxResults, jql, validateQuery, fields, expand)

Get board issues for epic

Returns all issues that belong to an epic on the board, for the given epic ID and the board ID. This only includes issues that the user has permission to view. Issues returned from this resource include Agile fields, like sprint, closedSprints, flagged, and epic. By default, the returned issues are ordered by rank.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | The ID of the board that contains the requested issues.
    Long epicId = 56L; // Long | The ID of the epic that contains the requested issues.
    Long startAt = 56L; // Long | The starting index of the returned issues. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 56; // Integer | The maximum number of issues to return per page. Default: 50. See the 'Pagination' section at the top of this page for more details. Note, the total number of issues returned is limited by the property 'jira.search.views.default.max' in your Jira instance. If you exceed this limit, your results will be truncated.
    String jql = "jql_example"; // String | Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues.
    Boolean validateQuery = true; // Boolean | Specifies whether to validate the JQL query or not. Default: true.
    List<Object> fields = null; // List<Object> | The list of fields to return for each issue. By default, all navigable and Agile fields are returned.
    String expand = "expand_example"; // String | A comma-separated list of the parameters to expand.
    try {
      SearchResults result = apiInstance.getBoardIssuesForEpic(boardId, epicId, startAt, maxResults, jql, validateQuery, fields, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getBoardIssuesForEpic");
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
| **boardId** | **Long**| The ID of the board that contains the requested issues. | |
| **epicId** | **Long**| The ID of the epic that contains the requested issues. | |
| **startAt** | **Long**| The starting index of the returned issues. Base index: 0. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **maxResults** | **Integer**| The maximum number of issues to return per page. Default: 50. See the &#39;Pagination&#39; section at the top of this page for more details. Note, the total number of issues returned is limited by the property &#39;jira.search.views.default.max&#39; in your Jira instance. If you exceed this limit, your results will be truncated. | [optional] |
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
| **404** | Returned if the board does not exist or the user does not have permission to view it. |  -  |

<a id="getBoardIssuesForSprint"></a>
# **getBoardIssuesForSprint**
> SearchResults getBoardIssuesForSprint(boardId, sprintId, startAt, maxResults, jql, validateQuery, fields, expand)

Get board issues for sprint

Get all issues you have access to that belong to the sprint from the board. Issue returned from this resource contains additional fields like: sprint, closedSprints, flagged and epic. Issues are returned ordered by rank. JQL order has higher priority than default rank.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | The ID of the board that contains requested issues.
    Long sprintId = 56L; // Long | The ID of the sprint that contains requested issues.
    Long startAt = 56L; // Long | The starting index of the returned issues. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 56; // Integer | The maximum number of issues to return per page. See the 'Pagination' section at the top of this page for more details. Note, the total number of issues returned is limited by the property 'jira.search.views.default.max' in your Jira instance. If you exceed this limit, your results will be truncated.
    String jql = "jql_example"; // String | Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues.   Note that `username` and `userkey` can't be used as search terms for this parameter due to privacy reasons. Use `accountId` instead.
    Boolean validateQuery = true; // Boolean | Specifies whether to validate the JQL query or not. Default: true.
    List<Object> fields = null; // List<Object> | The list of fields to return for each issue. By default, all navigable and Agile fields are returned.
    String expand = "expand_example"; // String | A comma-separated list of the parameters to expand.
    try {
      SearchResults result = apiInstance.getBoardIssuesForSprint(boardId, sprintId, startAt, maxResults, jql, validateQuery, fields, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getBoardIssuesForSprint");
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
| **boardId** | **Long**| The ID of the board that contains requested issues. | |
| **sprintId** | **Long**| The ID of the sprint that contains requested issues. | |
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
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if the board does not exist or the user does not have permission to view it. |  -  |

<a id="getBoardProperty"></a>
# **getBoardProperty**
> getBoardProperty(boardId, propertyKey)

Get board property

Returns the value of the property with a given key from the board identified by the provided id. The user who retrieves the property is required to have permissions to view the board.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    String boardId = "boardId_example"; // String | the ID of the board from which the property will be returned.
    String propertyKey = "propertyKey_example"; // String | the key of the property to return.
    try {
      apiInstance.getBoardProperty(boardId, propertyKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getBoardProperty");
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
| **boardId** | **String**| the ID of the board from which the property will be returned. | |
| **propertyKey** | **String**| the key of the property to return. | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the board exists and the property was found. |  -  |
| **400** | Returned if the boardId is invalid (negative or not a number). |  -  |
| **401** | Returned if the calling user is not authenticated. |  -  |
| **404** | Returned if the board with given id does not exist, or if the property with given key is not found, or the user doesn&#39;t have permissions to see it. |  -  |

<a id="getBoardPropertyKeys"></a>
# **getBoardPropertyKeys**
> getBoardPropertyKeys(boardId)

Get board property keys

Returns the keys of all properties for the board identified by the id. The user who retrieves the property keys is required to have permissions to view the board.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    String boardId = "boardId_example"; // String | the ID of the board from which property keys will be returned.
    try {
      apiInstance.getBoardPropertyKeys(boardId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getBoardPropertyKeys");
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
| **boardId** | **String**| the ID of the board from which property keys will be returned. | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the board with given id exists. |  -  |
| **400** | Returned if the boardId is invalid (negative or not a number). |  -  |
| **401** | Returned if the calling user is not authenticated. |  -  |
| **404** | Returned if the board with given id does not exist, or if the property with given key is not found, or the user doesn&#39;t have permissions to see it. |  -  |

<a id="getConfiguration"></a>
# **getConfiguration**
> GetConfiguration200Response getConfiguration(boardId)

Get configuration

Get the board configuration. The response contains the following fields:   *  &#x60;id&#x60; \\- ID of the board.  *  &#x60;name&#x60; \\- Name of the board.  *  &#x60;filter&#x60; \\- Reference to the filter used by the given board.  *  &#x60;location&#x60; \\- Reference to the container that the board is located in. Includes the container type (Valid values: project, user).  *  &#x60;subQuery&#x60; (Kanban only) - JQL subquery used by the given board.  *  &#x60;columnConfig&#x60; \\- The column configuration lists the columns for the board, in the order defined in the column configuration. For each column, it shows the issue status mapping as well as the constraint type (Valid values: none, issueCount, issueCountExclSubs) for the min/max number of issues. Note, the last column with statuses mapped to it is treated as the \&quot;Done\&quot; column, which means that issues in that column will be marked as already completed.  *  &#x60;estimation&#x60; (Scrum only) - Contains information about type of estimation used for the board. Valid values: none, issueCount, field. If the estimation type is \&quot;field\&quot;, the ID and display name of the field used for estimation is also returned. Note, estimates for an issue can be updated by a PUT /rest/api/3/issue/\\{issueIdOrKey\\} request, however the fields must be on the screen. \&quot;timeoriginalestimate\&quot; field will never be on the screen, so in order to update it \&quot;originalEstimate\&quot; in \&quot;timetracking\&quot; field should be updated.  *  &#x60;ranking&#x60; \\- Contains information about custom field used for ranking in the given board.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | The ID of the board for which configuration is requested.
    try {
      GetConfiguration200Response result = apiInstance.getConfiguration(boardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getConfiguration");
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
| **boardId** | **Long**| The ID of the board for which configuration is requested. | |

### Return type

[**GetConfiguration200Response**](GetConfiguration200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the configuration of the board for given boardId. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if user does not a have valid license. |  -  |
| **404** | Returned if board does not exist or the user cannot view it. |  -  |

<a id="getEpics"></a>
# **getEpics**
> GetEpics200Response getEpics(boardId, startAt, maxResults, done)

Get epics

Returns all epics from the board, for the given board ID. This only includes epics that the user has permission to view. Note, if the user does not have permission to view the board, no epics will be returned at all.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | The ID of the board that contains the requested epics.
    Long startAt = 56L; // Long | The starting index of the returned epics. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 56; // Integer | The maximum number of epics to return per page. See the 'Pagination' section at the top of this page for more details.
    String done = "done_example"; // String | Filters results to epics that are either done or not done. Valid values: true, false.
    try {
      GetEpics200Response result = apiInstance.getEpics(boardId, startAt, maxResults, done);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getEpics");
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
| **boardId** | **Long**| The ID of the board that contains the requested epics. | |
| **startAt** | **Long**| The starting index of the returned epics. Base index: 0. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **maxResults** | **Integer**| The maximum number of epics to return per page. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **done** | **String**| Filters results to epics that are either done or not done. Valid values: true, false. | [optional] |

### Return type

[**GetEpics200Response**](GetEpics200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested epics, at the specified page of the results. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not have valid license. |  -  |
| **404** | Returned if board does not exist or the user does not have permission to view it. |  -  |

<a id="getFeaturesForBoard"></a>
# **getFeaturesForBoard**
> GetFeaturesForBoard200Response getFeaturesForBoard(boardId)

Get features for board



### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | 
    try {
      GetFeaturesForBoard200Response result = apiInstance.getFeaturesForBoard(boardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getFeaturesForBoard");
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
| **boardId** | **Long**|  | |

### Return type

[**GetFeaturesForBoard200Response**](GetFeaturesForBoard200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |

<a id="getIssuesForBacklog"></a>
# **getIssuesForBacklog**
> SearchResults getIssuesForBacklog(boardId, startAt, maxResults, jql, validateQuery, fields, expand)

Get issues for backlog

Returns all issues from the board&#39;s backlog, for the given board ID. This only includes issues that the user has permission to view. The backlog contains incomplete issues that are not assigned to any future or active sprint. Note, if the user does not have permission to view the board, no issues will be returned at all. Issues returned from this resource include Agile fields, like sprint, closedSprints, flagged, and epic. By default, the returned issues are ordered by rank.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | The ID of the board that has the backlog containing the requested issues.
    Long startAt = 56L; // Long | The starting index of the returned issues. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 56; // Integer | The maximum number of issues to return per page. Default: 50. See the 'Pagination' section at the top of this page for more details. Note, the total number of issues returned is limited by the property 'jira.search.views.default.max' in your Jira instance. If you exceed this limit, your results will be truncated.
    String jql = "jql_example"; // String | Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues.   Note that `username` and `userkey` can't be used as search terms for this parameter due to privacy reasons. Use `accountId` instead.
    Boolean validateQuery = true; // Boolean | Specifies whether to validate the JQL query or not. Default: true.
    List<Object> fields = null; // List<Object> | The list of fields to return for each issue. By default, all navigable and Agile fields are returned.
    String expand = "expand_example"; // String | This parameter is currently not used.
    try {
      SearchResults result = apiInstance.getIssuesForBacklog(boardId, startAt, maxResults, jql, validateQuery, fields, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getIssuesForBacklog");
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
| **boardId** | **Long**| The ID of the board that has the backlog containing the requested issues. | |
| **startAt** | **Long**| The starting index of the returned issues. Base index: 0. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **maxResults** | **Integer**| The maximum number of issues to return per page. Default: 50. See the &#39;Pagination&#39; section at the top of this page for more details. Note, the total number of issues returned is limited by the property &#39;jira.search.views.default.max&#39; in your Jira instance. If you exceed this limit, your results will be truncated. | [optional] |
| **jql** | **String**| Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues.   Note that &#x60;username&#x60; and &#x60;userkey&#x60; can&#39;t be used as search terms for this parameter due to privacy reasons. Use &#x60;accountId&#x60; instead. | [optional] |
| **validateQuery** | **Boolean**| Specifies whether to validate the JQL query or not. Default: true. | [optional] |
| **fields** | [**List&lt;Object&gt;**](Object.md)| The list of fields to return for each issue. By default, all navigable and Agile fields are returned. | [optional] |
| **expand** | **String**| This parameter is currently not used. | [optional] |

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
| **404** | Returned if the board does not exist or the user does not have permission to view it. |  -  |

<a id="getIssuesForBoard"></a>
# **getIssuesForBoard**
> SearchResults getIssuesForBoard(boardId, startAt, maxResults, jql, validateQuery, fields, expand)

Get issues for board

Returns all issues from a board, for a given board ID. This only includes issues that the user has permission to view. An issue belongs to the board if its status is mapped to the board&#39;s column. Epic issues do not belongs to the scrum boards. Note, if the user does not have permission to view the board, no issues will be returned at all. Issues returned from this resource include Agile fields, like sprint, closedSprints, flagged, and epic. By default, the returned issues are ordered by rank.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | The ID of the board that contains the requested issues.
    Long startAt = 56L; // Long | The starting index of the returned issues. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 56; // Integer | The maximum number of issues to return per page. See the 'Pagination' section at the top of this page for more details. Note, the total number of issues returned is limited by the property 'jira.search.views.default.max' in your Jira instance. If you exceed this limit, your results will be truncated.
    String jql = "jql_example"; // String | Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues.   Note that `username` and `userkey` can't be used as search terms for this parameter due to privacy reasons. Use `accountId` instead.
    Boolean validateQuery = true; // Boolean | Specifies whether to validate the JQL query or not. Default: true.
    List<Object> fields = null; // List<Object> | The list of fields to return for each issue. By default, all navigable and Agile fields are returned.
    String expand = "expand_example"; // String | This parameter is currently not used.
    try {
      SearchResults result = apiInstance.getIssuesForBoard(boardId, startAt, maxResults, jql, validateQuery, fields, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getIssuesForBoard");
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
| **boardId** | **Long**| The ID of the board that contains the requested issues. | |
| **startAt** | **Long**| The starting index of the returned issues. Base index: 0. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **maxResults** | **Integer**| The maximum number of issues to return per page. See the &#39;Pagination&#39; section at the top of this page for more details. Note, the total number of issues returned is limited by the property &#39;jira.search.views.default.max&#39; in your Jira instance. If you exceed this limit, your results will be truncated. | [optional] |
| **jql** | **String**| Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues.   Note that &#x60;username&#x60; and &#x60;userkey&#x60; can&#39;t be used as search terms for this parameter due to privacy reasons. Use &#x60;accountId&#x60; instead. | [optional] |
| **validateQuery** | **Boolean**| Specifies whether to validate the JQL query or not. Default: true. | [optional] |
| **fields** | [**List&lt;Object&gt;**](Object.md)| The list of fields to return for each issue. By default, all navigable and Agile fields are returned. | [optional] |
| **expand** | **String**| This parameter is currently not used. | [optional] |

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
| **404** | Returned if the board does not exist or the user does not have permission to view it. |  -  |

<a id="getIssuesWithoutEpicForBoard"></a>
# **getIssuesWithoutEpicForBoard**
> SearchResults getIssuesWithoutEpicForBoard(boardId, startAt, maxResults, jql, validateQuery, fields, expand)

Get issues without epic for board

Returns all issues that do not belong to any epic on a board, for a given board ID. This only includes issues that the user has permission to view. Issues returned from this resource include Agile fields, like sprint, closedSprints, flagged, and epic. By default, the returned issues are ordered by rank.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | The ID of the board that contains the requested issues.
    Long startAt = 56L; // Long | The starting index of the returned issues. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 56; // Integer | The maximum number of issues to return per page. See the 'Pagination' section at the top of this page for more details. Note, the total number of issues returned is limited by the property 'jira.search.views.default.max' in your Jira instance. If you exceed this limit, your results will be truncated.
    String jql = "jql_example"; // String | Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues.   Note that `username` and `userkey` can't be used as search terms for this parameter due to privacy reasons. Use `accountId` instead.
    Boolean validateQuery = true; // Boolean | Specifies whether to validate the JQL query or not. Default: true.
    List<Object> fields = null; // List<Object> | The list of fields to return for each issue. By default, all navigable and Agile fields are returned.
    String expand = "expand_example"; // String | A comma-separated list of the parameters to expand.
    try {
      SearchResults result = apiInstance.getIssuesWithoutEpicForBoard(boardId, startAt, maxResults, jql, validateQuery, fields, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getIssuesWithoutEpicForBoard");
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
| **boardId** | **Long**| The ID of the board that contains the requested issues. | |
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
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if the board does not exist or the user does not have permission to view it. |  -  |

<a id="getProjects"></a>
# **getProjects**
> GetProjects200Response getProjects(boardId, startAt, maxResults)

Get projects

Returns all projects that are associated with the board, for the given board ID. If the user does not have permission to view the board, no projects will be returned at all. Returned projects are ordered by the name.  A project is associated with a board if the board filter contains reference the project or there is an issue from the project that belongs to the board.  The board filter contains reference the project only if JQL query guarantees that returned issues will be returned from the project set defined in JQL. For instance the query &#x60;project in (ABC, BCD) AND reporter &#x3D; admin&#x60; have reference to ABC and BCD projects but query &#x60;project in (ABC, BCD) OR reporter &#x3D; admin&#x60; doesn&#39;t have reference to any project.  An issue belongs to the board if its status is mapped to the board&#39;s column. Epic issues do not belongs to the scrum boards.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | The ID of the board that contains returned projects.
    Long startAt = 56L; // Long | The starting index of the returned projects. Base index: 0. See the 'Pagination' section at the top of this page for more details.
    Integer maxResults = 56; // Integer | The maximum number of projects to return per page. See the 'Pagination' section at the top of this page for more details.
    try {
      GetProjects200Response result = apiInstance.getProjects(boardId, startAt, maxResults);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getProjects");
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
| **boardId** | **Long**| The ID of the board that contains returned projects. | |
| **startAt** | **Long**| The starting index of the returned projects. Base index: 0. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |
| **maxResults** | **Integer**| The maximum number of projects to return per page. See the &#39;Pagination&#39; section at the top of this page for more details. | [optional] |

### Return type

[**GetProjects200Response**](GetProjects200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the board&#39;s projects, at the specified page of the results. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if board does not exist or the user does not have permission to access it. |  -  |

<a id="getProjectsFull"></a>
# **getProjectsFull**
> getProjectsFull(boardId)

Get projects full

Returns all projects that are statically associated with the board, for the given board ID. Returned projects are ordered by the name.  A project is associated with a board if the board filter contains reference the project.  The board filter contains reference the project only if JQL query guarantees that returned issues will be returned from the project set defined in JQL. For instance the query &#x60;project in (ABC, BCD) AND reporter &#x3D; admin&#x60; have reference to ABC and BCD projects but query &#x60;project in (ABC, BCD) OR reporter &#x3D; admin&#x60; doesn&#39;t have reference to any project.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | The ID of the board that contains returned projects.
    try {
      apiInstance.getProjectsFull(boardId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getProjectsFull");
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
| **boardId** | **Long**| The ID of the board that contains returned projects. | |

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
| **200** | Returns the board&#39;s projects, at the specified page of the results. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if board does not exist or the user does not have permission to access it. |  -  |

<a id="getQuickFilter"></a>
# **getQuickFilter**
> GetAllQuickFilters200ResponseValuesInner getQuickFilter(boardId, quickFilterId)

Get quick filter

Returns the quick filter for a given quick filter ID. The quick filter will only be returned if the user can view the board that the quick filter belongs to.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | 
    Long quickFilterId = 56L; // Long | The ID of the requested quick filter.
    try {
      GetAllQuickFilters200ResponseValuesInner result = apiInstance.getQuickFilter(boardId, quickFilterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getQuickFilter");
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
| **boardId** | **Long**|  | |
| **quickFilterId** | **Long**| The ID of the requested quick filter. | |

### Return type

[**GetAllQuickFilters200ResponseValuesInner**](GetAllQuickFilters200ResponseValuesInner.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested quick filter. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned if the board with given id does not exist or if the quick filter with given id is not found or the user doesn&#39;t have permissions to see it. |  -  |

<a id="getReportsForBoard"></a>
# **getReportsForBoard**
> GetReportsForBoard200Response getReportsForBoard(boardId)

Get reports for board



### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | 
    try {
      GetReportsForBoard200Response result = apiInstance.getReportsForBoard(boardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getReportsForBoard");
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
| **boardId** | **Long**|  | |

### Return type

[**GetReportsForBoard200Response**](GetReportsForBoard200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |

<a id="moveIssuesToBoard"></a>
# **moveIssuesToBoard**
> moveIssuesToBoard(boardId, moveIssuesToBacklogForBoardRequest)

Move issues to board

Move issues from the backog to the board (if they are already in the backlog of that board).   This operation either moves an issue(s) onto a board from the backlog (by adding it to the issueList for the board) Or transitions the issue(s) to the first column for a kanban board with backlog. At most 50 issues may be moved at once.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | 
    MoveIssuesToBacklogForBoardRequest moveIssuesToBacklogForBoardRequest = new MoveIssuesToBacklogForBoardRequest(); // MoveIssuesToBacklogForBoardRequest | 
    try {
      apiInstance.moveIssuesToBoard(boardId, moveIssuesToBacklogForBoardRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#moveIssuesToBoard");
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
| **boardId** | **Long**|  | |
| **moveIssuesToBacklogForBoardRequest** | [**MoveIssuesToBacklogForBoardRequest**](MoveIssuesToBacklogForBoardRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty response is returned if operation was successful. |  -  |
| **207** | Returns the list of issue with status of rank operation. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if user does not a have valid license or does not have permission to assign issues. |  -  |

<a id="setBoardProperty"></a>
# **setBoardProperty**
> Object setBoardProperty(boardId, propertyKey, body)

Set board property

Sets the value of the specified board&#39;s property.  You can use this resource to store a custom data against the board identified by the id. The user who stores the data is required to have permissions to modify the board.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    String boardId = "boardId_example"; // String | the ID of the board on which the property will be set.
    String propertyKey = "propertyKey_example"; // String | the key of the board's property. The maximum length of the key is 255 bytes.
    Object body = null; // Object | The value of the property. The value has to be a valid, non-empty [JSON](https://tools.ietf.org/html/rfc4627) value. The maximum length of the property value is 32768 bytes.
    try {
      Object result = apiInstance.setBoardProperty(boardId, propertyKey, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#setBoardProperty");
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
| **boardId** | **String**| the ID of the board on which the property will be set. | |
| **propertyKey** | **String**| the key of the board&#39;s property. The maximum length of the key is 255 bytes. | |
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
| **200** | Returned if the board property is successfully updated. |  -  |
| **201** | Returned if the board property is successfully created. |  -  |
| **400** | Returned if the boardId is invalid (negative or not a number). |  -  |
| **401** | Returned if the calling user is not authenticated. |  -  |
| **404** | Returned if the board with given id does not exist or the user doesn&#39;t have permissions to see it. |  -  |

<a id="toggleFeatures"></a>
# **toggleFeatures**
> GetFeaturesForBoard200Response toggleFeatures(boardId, toggleFeaturesRequest)

Toggle features



### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BoardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardApi apiInstance = new BoardApi(defaultClient);
    Long boardId = 56L; // Long | 
    ToggleFeaturesRequest toggleFeaturesRequest = new ToggleFeaturesRequest(); // ToggleFeaturesRequest | 
    try {
      GetFeaturesForBoard200Response result = apiInstance.toggleFeatures(boardId, toggleFeaturesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#toggleFeatures");
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
| **boardId** | **Long**|  | |
| **toggleFeaturesRequest** | [**ToggleFeaturesRequest**](ToggleFeaturesRequest.md)|  | |

### Return type

[**GetFeaturesForBoard200Response**](GetFeaturesForBoard200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |

