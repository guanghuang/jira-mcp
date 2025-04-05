# TeamsInPlanApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAtlassianTeam**](TeamsInPlanApi.md#addAtlassianTeam) | **POST** /rest/api/3/plans/plan/{planId}/team/atlassian | Add Atlassian team to plan |
| [**createPlanOnlyTeam**](TeamsInPlanApi.md#createPlanOnlyTeam) | **POST** /rest/api/3/plans/plan/{planId}/team/planonly | Create plan-only team |
| [**deletePlanOnlyTeam**](TeamsInPlanApi.md#deletePlanOnlyTeam) | **DELETE** /rest/api/3/plans/plan/{planId}/team/planonly/{planOnlyTeamId} | Delete plan-only team |
| [**getAtlassianTeam**](TeamsInPlanApi.md#getAtlassianTeam) | **GET** /rest/api/3/plans/plan/{planId}/team/atlassian/{atlassianTeamId} | Get Atlassian team in plan |
| [**getPlanOnlyTeam**](TeamsInPlanApi.md#getPlanOnlyTeam) | **GET** /rest/api/3/plans/plan/{planId}/team/planonly/{planOnlyTeamId} | Get plan-only team |
| [**getTeams**](TeamsInPlanApi.md#getTeams) | **GET** /rest/api/3/plans/plan/{planId}/team | Get teams in plan paginated |
| [**removeAtlassianTeam**](TeamsInPlanApi.md#removeAtlassianTeam) | **DELETE** /rest/api/3/plans/plan/{planId}/team/atlassian/{atlassianTeamId} | Remove Atlassian team from plan |
| [**updateAtlassianTeam**](TeamsInPlanApi.md#updateAtlassianTeam) | **PUT** /rest/api/3/plans/plan/{planId}/team/atlassian/{atlassianTeamId} | Update Atlassian team in plan |
| [**updatePlanOnlyTeam**](TeamsInPlanApi.md#updatePlanOnlyTeam) | **PUT** /rest/api/3/plans/plan/{planId}/team/planonly/{planOnlyTeamId} | Update plan-only team |


<a id="addAtlassianTeam"></a>
# **addAtlassianTeam**
> Object addAtlassianTeam(planId, addAtlassianTeamRequest)

Add Atlassian team to plan

Adds an existing Atlassian team to a plan and configures their plannning settings.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.TeamsInPlanApi;

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

    TeamsInPlanApi apiInstance = new TeamsInPlanApi(defaultClient);
    Long planId = 56L; // Long | The ID of the plan.
    AddAtlassianTeamRequest addAtlassianTeamRequest = new AddAtlassianTeamRequest(); // AddAtlassianTeamRequest | 
    try {
      Object result = apiInstance.addAtlassianTeam(planId, addAtlassianTeamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsInPlanApi#addAtlassianTeam");
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
| **planId** | **Long**| The ID of the plan. | |
| **addAtlassianTeamRequest** | [**AddAtlassianTeamRequest**](AddAtlassianTeamRequest.md)|  | |

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
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not have the Administer Jira global permission. |  -  |
| **404** | Returned if the plan or Atlassian team is not found. |  -  |
| **409** | Returned if the plan is not active. |  -  |

<a id="createPlanOnlyTeam"></a>
# **createPlanOnlyTeam**
> Long createPlanOnlyTeam(planId, createPlanOnlyTeamRequest)

Create plan-only team

Creates a plan-only team and configures their planning settings.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.TeamsInPlanApi;

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

    TeamsInPlanApi apiInstance = new TeamsInPlanApi(defaultClient);
    Long planId = 56L; // Long | The ID of the plan.
    CreatePlanOnlyTeamRequest createPlanOnlyTeamRequest = new CreatePlanOnlyTeamRequest(); // CreatePlanOnlyTeamRequest | 
    try {
      Long result = apiInstance.createPlanOnlyTeam(planId, createPlanOnlyTeamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsInPlanApi#createPlanOnlyTeam");
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
| **planId** | **Long**| The ID of the plan. | |
| **createPlanOnlyTeamRequest** | [**CreatePlanOnlyTeamRequest**](CreatePlanOnlyTeamRequest.md)|  | |

### Return type

**Long**

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
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not have the Administer Jira global permission. |  -  |
| **404** | Returned if the plan is not found. |  -  |
| **409** | Returned if the plan is not active. |  -  |

<a id="deletePlanOnlyTeam"></a>
# **deletePlanOnlyTeam**
> Object deletePlanOnlyTeam(planId, planOnlyTeamId)

Delete plan-only team

Deletes a plan-only team and their planning settings.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.TeamsInPlanApi;

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

    TeamsInPlanApi apiInstance = new TeamsInPlanApi(defaultClient);
    Long planId = 56L; // Long | The ID of the plan.
    Long planOnlyTeamId = 56L; // Long | The ID of the plan-only team.
    try {
      Object result = apiInstance.deletePlanOnlyTeam(planId, planOnlyTeamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsInPlanApi#deletePlanOnlyTeam");
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
| **planId** | **Long**| The ID of the plan. | |
| **planOnlyTeamId** | **Long**| The ID of the plan-only team. | |

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
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not have the Administer Jira global permission. |  -  |
| **404** | Returned if the plan or plan-only team is not found, or the plan-only team is not associated with the plan. |  -  |
| **409** | Returned if the plan is not active. |  -  |

<a id="getAtlassianTeam"></a>
# **getAtlassianTeam**
> GetAtlassianTeamResponse getAtlassianTeam(planId, atlassianTeamId)

Get Atlassian team in plan

Returns planning settings for an Atlassian team in a plan.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.TeamsInPlanApi;

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

    TeamsInPlanApi apiInstance = new TeamsInPlanApi(defaultClient);
    Long planId = 56L; // Long | The ID of the plan.
    String atlassianTeamId = "atlassianTeamId_example"; // String | The ID of the Atlassian team.
    try {
      GetAtlassianTeamResponse result = apiInstance.getAtlassianTeam(planId, atlassianTeamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsInPlanApi#getAtlassianTeam");
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
| **planId** | **Long**| The ID of the plan. | |
| **atlassianTeamId** | **String**| The ID of the Atlassian team. | |

### Return type

[**GetAtlassianTeamResponse**](GetAtlassianTeamResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not have the Administer Jira global permission. |  -  |
| **404** | Returned if the plan or Atlassian team is not found, or the Atlassian team is not associated with the plan. |  -  |
| **409** | Returned if the plan is not active. |  -  |

<a id="getPlanOnlyTeam"></a>
# **getPlanOnlyTeam**
> GetPlanOnlyTeamResponse getPlanOnlyTeam(planId, planOnlyTeamId)

Get plan-only team

Returns planning settings for a plan-only team.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.TeamsInPlanApi;

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

    TeamsInPlanApi apiInstance = new TeamsInPlanApi(defaultClient);
    Long planId = 56L; // Long | The ID of the plan.
    Long planOnlyTeamId = 56L; // Long | The ID of the plan-only team.
    try {
      GetPlanOnlyTeamResponse result = apiInstance.getPlanOnlyTeam(planId, planOnlyTeamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsInPlanApi#getPlanOnlyTeam");
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
| **planId** | **Long**| The ID of the plan. | |
| **planOnlyTeamId** | **Long**| The ID of the plan-only team. | |

### Return type

[**GetPlanOnlyTeamResponse**](GetPlanOnlyTeamResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not have the Administer Jira global permission. |  -  |
| **404** | Returned if the plan or plan-only team is not found, or the plan-only team is not associated with the plan. |  -  |
| **409** | Returned if the plan is not active. |  -  |

<a id="getTeams"></a>
# **getTeams**
> PageWithCursorGetTeamResponseForPage getTeams(planId, cursor, maxResults)

Get teams in plan paginated

Returns a [paginated](#pagination) list of plan-only and Atlassian teams in a plan.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.TeamsInPlanApi;

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

    TeamsInPlanApi apiInstance = new TeamsInPlanApi(defaultClient);
    Long planId = 56L; // Long | The ID of the plan.
    String cursor = ""; // String | The cursor to start from. If not provided, the first page will be returned.
    Integer maxResults = 50; // Integer | The maximum number of plan teams to return per page. The maximum value is 50. The default value is 50.
    try {
      PageWithCursorGetTeamResponseForPage result = apiInstance.getTeams(planId, cursor, maxResults);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsInPlanApi#getTeams");
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
| **planId** | **Long**| The ID of the plan. | |
| **cursor** | **String**| The cursor to start from. If not provided, the first page will be returned. | [optional] [default to ] |
| **maxResults** | **Integer**| The maximum number of plan teams to return per page. The maximum value is 50. The default value is 50. | [optional] [default to 50] |

### Return type

[**PageWithCursorGetTeamResponseForPage**](PageWithCursorGetTeamResponseForPage.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not have the Administer Jira global permission. |  -  |
| **404** | Returned if the plan is not found. |  -  |

<a id="removeAtlassianTeam"></a>
# **removeAtlassianTeam**
> Object removeAtlassianTeam(planId, atlassianTeamId)

Remove Atlassian team from plan

Removes an Atlassian team from a plan and deletes their planning settings.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.TeamsInPlanApi;

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

    TeamsInPlanApi apiInstance = new TeamsInPlanApi(defaultClient);
    Long planId = 56L; // Long | The ID of the plan.
    String atlassianTeamId = "atlassianTeamId_example"; // String | The ID of the Atlassian team.
    try {
      Object result = apiInstance.removeAtlassianTeam(planId, atlassianTeamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsInPlanApi#removeAtlassianTeam");
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
| **planId** | **Long**| The ID of the plan. | |
| **atlassianTeamId** | **String**| The ID of the Atlassian team. | |

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
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not have the Administer Jira global permission. |  -  |
| **404** | Returned if the plan or Atlassian team is not found, or the Atlassian team is not associated with the plan. |  -  |
| **409** | Returned if the plan is not active. |  -  |

<a id="updateAtlassianTeam"></a>
# **updateAtlassianTeam**
> Object updateAtlassianTeam(planId, atlassianTeamId, body)

Update Atlassian team in plan

Updates any of the following planning settings of an Atlassian team in a plan using [JSON Patch](https://datatracker.ietf.org/doc/html/rfc6902).   *  planningStyle  *  issueSourceId  *  sprintLength  *  capacity  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *Note that \&quot;add\&quot; operations do not respect array indexes in target locations. Call the \&quot;Get Atlassian team in plan\&quot; endpoint to find out the order of array elements.*

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.TeamsInPlanApi;

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

    TeamsInPlanApi apiInstance = new TeamsInPlanApi(defaultClient);
    Long planId = 56L; // Long | The ID of the plan.
    String atlassianTeamId = "atlassianTeamId_example"; // String | The ID of the Atlassian team.
    Object body = [{"op": "replace", "path": "/planningStyle", "value": "Kanban"}]
; // Object | 
    try {
      Object result = apiInstance.updateAtlassianTeam(planId, atlassianTeamId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsInPlanApi#updateAtlassianTeam");
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
| **planId** | **Long**| The ID of the plan. | |
| **atlassianTeamId** | **String**| The ID of the Atlassian team. | |
| **body** | **Object**|  | |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not have the Administer Jira global permission. |  -  |
| **404** | Returned if the plan or Atlassian team is not found, or the Atlassian team is not associated with the plan. |  -  |
| **409** | Returned if the plan is not active. |  -  |

<a id="updatePlanOnlyTeam"></a>
# **updatePlanOnlyTeam**
> Object updatePlanOnlyTeam(planId, planOnlyTeamId, body)

Update plan-only team

Updates any of the following planning settings of a plan-only team using [JSON Patch](https://datatracker.ietf.org/doc/html/rfc6902).   *  name  *  planningStyle  *  issueSourceId  *  sprintLength  *  capacity  *  memberAccountIds  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *Note that \&quot;add\&quot; operations do not respect array indexes in target locations. Call the \&quot;Get plan-only team\&quot; endpoint to find out the order of array elements.*

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.TeamsInPlanApi;

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

    TeamsInPlanApi apiInstance = new TeamsInPlanApi(defaultClient);
    Long planId = 56L; // Long | The ID of the plan.
    Long planOnlyTeamId = 56L; // Long | The ID of the plan-only team.
    Object body = [{"op": "replace", "path": "/planningStyle", "value": "Kanban"}]
; // Object | 
    try {
      Object result = apiInstance.updatePlanOnlyTeam(planId, planOnlyTeamId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsInPlanApi#updatePlanOnlyTeam");
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
| **planId** | **Long**| The ID of the plan. | |
| **planOnlyTeamId** | **Long**| The ID of the plan-only team. | |
| **body** | **Object**|  | |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the user is not logged in. |  -  |
| **403** | Returned if the user does not have the Administer Jira global permission. |  -  |
| **404** | Returned if the plan or plan-only team is not found, or the plan-only team is not associated with the plan. |  -  |
| **409** | Returned if the plan is not active. |  -  |

