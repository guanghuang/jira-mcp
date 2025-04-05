# BacklogApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moveIssuesToBacklog**](BacklogApi.md#moveIssuesToBacklog) | **POST** /rest/agile/1.0/backlog/issue | Move issues to backlog |
| [**moveIssuesToBacklogForBoard**](BacklogApi.md#moveIssuesToBacklogForBoard) | **POST** /rest/agile/1.0/backlog/{boardId}/issue | Move issues to backlog for board |


<a id="moveIssuesToBacklog"></a>
# **moveIssuesToBacklog**
> moveIssuesToBacklog(moveIssuesToBacklogRequest)

Move issues to backlog

Move issues to the backlog.   This operation is equivalent to remove future and active sprints from a given set of issues. At most 50 issues may be moved at once.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BacklogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BacklogApi apiInstance = new BacklogApi(defaultClient);
    MoveIssuesToBacklogRequest moveIssuesToBacklogRequest = new MoveIssuesToBacklogRequest(); // MoveIssuesToBacklogRequest | 
    try {
      apiInstance.moveIssuesToBacklog(moveIssuesToBacklogRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklogApi#moveIssuesToBacklog");
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
| **403** | Returned if user does not a have valid license or does not have permission to assign issues. |  -  |
| **404** | Returned if sprint does not exist or the user cannot view it. |  -  |

<a id="moveIssuesToBacklogForBoard"></a>
# **moveIssuesToBacklogForBoard**
> moveIssuesToBacklogForBoard(boardId, moveIssuesToBacklogForBoardRequest)

Move issues to backlog for board

Move issues to the backlog of a particular board (if they are already on that board).   This operation is equivalent to remove future and active sprints from a given set of issues if the board has sprints If the board does not have sprints this will put the issues back into the backlog from the board. At most 50 issues may be moved at once.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BacklogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    BacklogApi apiInstance = new BacklogApi(defaultClient);
    Long boardId = 56L; // Long | 
    MoveIssuesToBacklogForBoardRequest moveIssuesToBacklogForBoardRequest = new MoveIssuesToBacklogForBoardRequest(); // MoveIssuesToBacklogForBoardRequest | 
    try {
      apiInstance.moveIssuesToBacklogForBoard(boardId, moveIssuesToBacklogForBoardRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling BacklogApi#moveIssuesToBacklogForBoard");
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
| **404** | Returned if sprint does not exist or the user cannot view it. |  -  |

