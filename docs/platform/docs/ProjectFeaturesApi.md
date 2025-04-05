# ProjectFeaturesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFeaturesForProject**](ProjectFeaturesApi.md#getFeaturesForProject) | **GET** /rest/api/3/project/{projectIdOrKey}/features | Get project features |
| [**toggleFeatureForProject**](ProjectFeaturesApi.md#toggleFeatureForProject) | **PUT** /rest/api/3/project/{projectIdOrKey}/features/{featureKey} | Set project feature state |


<a id="getFeaturesForProject"></a>
# **getFeaturesForProject**
> ContainerForProjectFeatures getFeaturesForProject(projectIdOrKey)

Get project features

Returns the list of features for a project.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.ProjectFeaturesApi;

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

    ProjectFeaturesApi apiInstance = new ProjectFeaturesApi(defaultClient);
    String projectIdOrKey = "projectIdOrKey_example"; // String | The ID or (case-sensitive) key of the project.
    try {
      ContainerForProjectFeatures result = apiInstance.getFeaturesForProject(projectIdOrKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectFeaturesApi#getFeaturesForProject");
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
| **projectIdOrKey** | **String**| The ID or (case-sensitive) key of the project. | |

### Return type

[**ContainerForProjectFeatures**](ContainerForProjectFeatures.md)

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
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the project is not found. |  -  |

<a id="toggleFeatureForProject"></a>
# **toggleFeatureForProject**
> ContainerForProjectFeatures toggleFeatureForProject(projectIdOrKey, featureKey, projectFeatureState)

Set project feature state

Sets the state of a project feature.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.ProjectFeaturesApi;

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

    ProjectFeaturesApi apiInstance = new ProjectFeaturesApi(defaultClient);
    String projectIdOrKey = "projectIdOrKey_example"; // String | The ID or (case-sensitive) key of the project.
    String featureKey = "featureKey_example"; // String | The key of the feature.
    ProjectFeatureState projectFeatureState = new ProjectFeatureState(); // ProjectFeatureState | Details of the feature state change.
    try {
      ContainerForProjectFeatures result = apiInstance.toggleFeatureForProject(projectIdOrKey, featureKey, projectFeatureState);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectFeaturesApi#toggleFeatureForProject");
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
| **projectIdOrKey** | **String**| The ID or (case-sensitive) key of the project. | |
| **featureKey** | **String**| The key of the feature. | |
| **projectFeatureState** | [**ProjectFeatureState**](ProjectFeatureState.md)| Details of the feature state change. | |

### Return type

[**ContainerForProjectFeatures**](ContainerForProjectFeatures.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the project or project feature is not found. |  -  |

