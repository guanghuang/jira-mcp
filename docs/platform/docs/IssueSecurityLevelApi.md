# IssueSecurityLevelApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIssueSecurityLevel**](IssueSecurityLevelApi.md#getIssueSecurityLevel) | **GET** /rest/api/3/securitylevel/{id} | Get issue security level |
| [**getIssueSecurityLevelMembers**](IssueSecurityLevelApi.md#getIssueSecurityLevelMembers) | **GET** /rest/api/3/issuesecurityschemes/{issueSecuritySchemeId}/members | Get issue security level members by issue security scheme |


<a id="getIssueSecurityLevel"></a>
# **getIssueSecurityLevel**
> SecurityLevel getIssueSecurityLevel(id)

Get issue security level

Returns details of an issue security level.  Use [Get issue security scheme](#api-rest-api-3-issuesecurityschemes-id-get) to obtain the IDs of issue security levels associated with the issue security scheme.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueSecurityLevelApi;

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

    IssueSecurityLevelApi apiInstance = new IssueSecurityLevelApi(defaultClient);
    String id = "id_example"; // String | The ID of the issue security level.
    try {
      SecurityLevel result = apiInstance.getIssueSecurityLevel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecurityLevelApi#getIssueSecurityLevel");
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
| **id** | **String**| The ID of the issue security level. | |

### Return type

[**SecurityLevel**](SecurityLevel.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **404** | Returned if the issue security level is not found. |  -  |

<a id="getIssueSecurityLevelMembers"></a>
# **getIssueSecurityLevelMembers**
> PageBeanIssueSecurityLevelMember getIssueSecurityLevelMembers(issueSecuritySchemeId, startAt, maxResults, issueSecurityLevelId, expand)

Get issue security level members by issue security scheme

Returns issue security level members.  Only issue security level members in context of classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueSecurityLevelApi;

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

    IssueSecurityLevelApi apiInstance = new IssueSecurityLevelApi(defaultClient);
    Long issueSecuritySchemeId = 56L; // Long | The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) operation to get a list of issue security scheme IDs.
    Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
    Integer maxResults = 50; // Integer | The maximum number of items to return per page.
    Set<String> issueSecurityLevelId = Arrays.asList(); // Set<String> | The list of issue security level IDs. To include multiple issue security levels separate IDs with ampersand: `issueSecurityLevelId=10000&issueSecurityLevelId=10001`.
    String expand = "expand_example"; // String | Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
    try {
      PageBeanIssueSecurityLevelMember result = apiInstance.getIssueSecurityLevelMembers(issueSecuritySchemeId, startAt, maxResults, issueSecurityLevelId, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueSecurityLevelApi#getIssueSecurityLevelMembers");
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
| **issueSecuritySchemeId** | **Long**| The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) operation to get a list of issue security scheme IDs. | |
| **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0] |
| **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50] |
| **issueSecurityLevelId** | [**Set&lt;String&gt;**](String.md)| The list of issue security level IDs. To include multiple issue security levels separate IDs with ampersand: &#x60;issueSecurityLevelId&#x3D;10000&amp;issueSecurityLevelId&#x3D;10001&#x60;. | [optional] |
| **expand** | **String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional] |

### Return type

[**PageBeanIssueSecurityLevelMember**](PageBeanIssueSecurityLevelMember.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if no issue security level members are found. |  -  |

