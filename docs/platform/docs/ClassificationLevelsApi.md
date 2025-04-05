# ClassificationLevelsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllUserDataClassificationLevels**](ClassificationLevelsApi.md#getAllUserDataClassificationLevels) | **GET** /rest/api/3/classification-levels | Get all classification levels |


<a id="getAllUserDataClassificationLevels"></a>
# **getAllUserDataClassificationLevels**
> DataClassificationLevelsBean getAllUserDataClassificationLevels(status, orderBy)

Get all classification levels

Returns all classification levels.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.ClassificationLevelsApi;

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

    ClassificationLevelsApi apiInstance = new ClassificationLevelsApi(defaultClient);
    Set<String> status = Arrays.asList(""); // Set<String> | Optional set of statuses to filter by.
    String orderBy = "rank"; // String | Ordering of the results by a given field. If not provided, values will not be sorted.
    try {
      DataClassificationLevelsBean result = apiInstance.getAllUserDataClassificationLevels(status, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationLevelsApi#getAllUserDataClassificationLevels");
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
| **status** | [**Set&lt;String&gt;**](String.md)| Optional set of statuses to filter by. | [optional] [enum: PUBLISHED, ARCHIVED, DRAFT] |
| **orderBy** | **String**| Ordering of the results by a given field. If not provided, values will not be sorted. | [optional] [enum: rank, -rank, +rank] |

### Return type

[**DataClassificationLevelsBean**](DataClassificationLevelsBean.md)

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

