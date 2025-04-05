# IssueApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**estimateIssueForBoard**](IssueApi.md#estimateIssueForBoard) | **PUT** /rest/agile/1.0/issue/{issueIdOrKey}/estimation | Estimate issue for board |
| [**getIssue**](IssueApi.md#getIssue) | **GET** /rest/agile/1.0/issue/{issueIdOrKey} | Get issue |
| [**getIssueEstimationForBoard**](IssueApi.md#getIssueEstimationForBoard) | **GET** /rest/agile/1.0/issue/{issueIdOrKey}/estimation | Get issue estimation for board |
| [**rankIssues**](IssueApi.md#rankIssues) | **PUT** /rest/agile/1.0/issue/rank | Rank issues |


<a id="estimateIssueForBoard"></a>
# **estimateIssueForBoard**
> EstimateIssueForBoard200Response estimateIssueForBoard(issueIdOrKey, estimateIssueForBoardRequest, boardId)

Estimate issue for board

Updates the estimation of the issue. boardId param is required. This param determines which field will be updated on a issue.  Note that this resource changes the estimation field of the issue regardless of appearance the field on the screen.  Original time tracking estimation field accepts estimation in formats like \&quot;1w\&quot;, \&quot;2d\&quot;, \&quot;3h\&quot;, \&quot;20m\&quot; or number which represent number of minutes. However, internally the field stores and returns the estimation as a number of seconds.  The field used for estimation on the given board can be obtained from [board configuration resource](#agile/1.0/board-getConfiguration). More information about the field are returned by [edit meta resource](#api-rest-api-3-issue-issueIdOrKey-editmeta-get) or [field resource](#api-rest-api-3-field-get).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.IssueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    IssueApi apiInstance = new IssueApi(defaultClient);
    String issueIdOrKey = "issueIdOrKey_example"; // String | The ID or key of the requested issue.
    EstimateIssueForBoardRequest estimateIssueForBoardRequest = new EstimateIssueForBoardRequest(); // EstimateIssueForBoardRequest | bean that contains value of a new estimation.
    Long boardId = 56L; // Long | The ID of the board required to determine which field is used for estimation.
    try {
      EstimateIssueForBoard200Response result = apiInstance.estimateIssueForBoard(issueIdOrKey, estimateIssueForBoardRequest, boardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueApi#estimateIssueForBoard");
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
| **issueIdOrKey** | **String**| The ID or key of the requested issue. | |
| **estimateIssueForBoardRequest** | [**EstimateIssueForBoardRequest**](EstimateIssueForBoardRequest.md)| bean that contains value of a new estimation. | |
| **boardId** | **Long**| The ID of the board required to determine which field is used for estimation. | [optional] |

### Return type

[**EstimateIssueForBoard200Response**](EstimateIssueForBoard200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the estimation of the issue and a fieldId of the field that is used for it. |  -  |
| **400** | Returned if the boardId was not provided, field does not exists or value was in wrong format. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if user does not a have valid license or does not have permission to edit issue. |  -  |
| **404** | Returned in these cases:   *  the issue does not exist  *  the user does not have permission to view issue  *  the board does not exist  *  the user does not have permission to view board  *  the issue does not belong to the board |  -  |

<a id="getIssue"></a>
# **getIssue**
> GetIssue200Response getIssue(issueIdOrKey, fields, expand, updateHistory)

Get issue

Returns a single issue, for a given issue ID or issue key. Issues returned from this resource include Agile fields, like sprint, closedSprints, flagged, and epic.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.IssueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    IssueApi apiInstance = new IssueApi(defaultClient);
    String issueIdOrKey = "issueIdOrKey_example"; // String | The ID or key of the requested issue.
    List<Object> fields = null; // List<Object> | The list of fields to return for each issue. By default, all navigable and Agile fields are returned.
    String expand = "expand_example"; // String | A comma-separated list of the parameters to expand.
    Boolean updateHistory = true; // Boolean | A boolean indicating whether the issue retrieved by this method should be added to the current user's issue history
    try {
      GetIssue200Response result = apiInstance.getIssue(issueIdOrKey, fields, expand, updateHistory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueApi#getIssue");
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
| **issueIdOrKey** | **String**| The ID or key of the requested issue. | |
| **fields** | [**List&lt;Object&gt;**](Object.md)| The list of fields to return for each issue. By default, all navigable and Agile fields are returned. | [optional] |
| **expand** | **String**| A comma-separated list of the parameters to expand. | [optional] |
| **updateHistory** | **Boolean**| A boolean indicating whether the issue retrieved by this method should be added to the current user&#39;s issue history | [optional] |

### Return type

[**GetIssue200Response**](GetIssue200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested issue. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not a have valid license. |  -  |
| **404** | Returned in these cases:   *  the issue does not exist  *  the user does not have permission to view issue |  -  |

<a id="getIssueEstimationForBoard"></a>
# **getIssueEstimationForBoard**
> getIssueEstimationForBoard(issueIdOrKey, boardId)

Get issue estimation for board

Returns the estimation of the issue and a fieldId of the field that is used for it. &#x60;boardId&#x60; param is required. This param determines which field will be updated on a issue.  Original time internally stores and returns the estimation as a number of seconds.  The field used for estimation on the given board can be obtained from [board configuration resource](#agile/1.0/board-getConfiguration). More information about the field are returned by [edit meta resource](#api-rest-api-3-issue-getEditIssueMeta) or [field resource](#api-rest-api-3-field-get).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.IssueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    IssueApi apiInstance = new IssueApi(defaultClient);
    String issueIdOrKey = "issueIdOrKey_example"; // String | The ID or key of the requested issue.
    Long boardId = 56L; // Long | The ID of the board required to determine which field is used for estimation.
    try {
      apiInstance.getIssueEstimationForBoard(issueIdOrKey, boardId);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueApi#getIssueEstimationForBoard");
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
| **issueIdOrKey** | **String**| The ID or key of the requested issue. | |
| **boardId** | **Long**| The ID of the board required to determine which field is used for estimation. | [optional] |

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
| **200** | Returns the estimation of the issue and a fieldId of the field that is used for it. |  -  |
| **400** | Returned if the boardId was not provided, field does not exists or value was in wrong format. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if user does not a have valid license or does not have permission to edit issue. |  -  |
| **404** | Returned in these cases:   *  the issue does not exist  *  the user does not have permission to view issue  *  the board does not exist  *  the user does not have permission to view board  *  the issue does not belong to the board |  -  |

<a id="rankIssues"></a>
# **rankIssues**
> rankIssues(moveIssuesToBacklogForBoardRequest)

Rank issues

Moves (ranks) issues before or after a given issue. At most 50 issues may be ranked at once.  This operation may fail for some issues, although this will be rare. In that case the 207 status code is returned for the whole response and detailed information regarding each issue is available in the response body.  If rankCustomFieldId is not defined, the default rank field will be used.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.IssueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    IssueApi apiInstance = new IssueApi(defaultClient);
    MoveIssuesToBacklogForBoardRequest moveIssuesToBacklogForBoardRequest = new MoveIssuesToBacklogForBoardRequest(); // MoveIssuesToBacklogForBoardRequest | bean which contains list of issues to rank and information where it should be ranked.
    try {
      apiInstance.rankIssues(moveIssuesToBacklogForBoardRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueApi#rankIssues");
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
| **moveIssuesToBacklogForBoardRequest** | [**MoveIssuesToBacklogForBoardRequest**](MoveIssuesToBacklogForBoardRequest.md)| bean which contains list of issues to rank and information where it should be ranked. | |

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
| **403** | Returned if user does not a have valid license or does not have permission to rank. To rank issues user has to have schedule issue permission for issues that they want to rank. |  -  |

