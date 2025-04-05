# WorkflowTransitionPropertiesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWorkflowTransitionProperty**](WorkflowTransitionPropertiesApi.md#createWorkflowTransitionProperty) | **POST** /rest/api/3/workflow/transitions/{transitionId}/properties | Create workflow transition property |
| [**deleteWorkflowTransitionProperty**](WorkflowTransitionPropertiesApi.md#deleteWorkflowTransitionProperty) | **DELETE** /rest/api/3/workflow/transitions/{transitionId}/properties | Delete workflow transition property |
| [**getWorkflowTransitionProperties**](WorkflowTransitionPropertiesApi.md#getWorkflowTransitionProperties) | **GET** /rest/api/3/workflow/transitions/{transitionId}/properties | Get workflow transition properties |
| [**updateWorkflowTransitionProperty**](WorkflowTransitionPropertiesApi.md#updateWorkflowTransitionProperty) | **PUT** /rest/api/3/workflow/transitions/{transitionId}/properties | Update workflow transition property |


<a id="createWorkflowTransitionProperty"></a>
# **createWorkflowTransitionProperty**
> WorkflowTransitionProperty createWorkflowTransitionProperty(transitionId, key, workflowName, workflowTransitionProperty, workflowMode)

Create workflow transition property

Adds a property to a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.WorkflowTransitionPropertiesApi;

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

    WorkflowTransitionPropertiesApi apiInstance = new WorkflowTransitionPropertiesApi(defaultClient);
    Long transitionId = 56L; // Long | The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
    String key = "key_example"; // String | The key of the property being added, also known as the name of the property. Set this to the same value as the `key` defined in the request body.
    String workflowName = "workflowName_example"; // String | The name of the workflow that the transition belongs to.
    WorkflowTransitionProperty workflowTransitionProperty = new WorkflowTransitionProperty(); // WorkflowTransitionProperty | 
    String workflowMode = "live"; // String | The workflow status. Set to *live* for inactive workflows or *draft* for draft workflows. Active workflows cannot be edited.
    try {
      WorkflowTransitionProperty result = apiInstance.createWorkflowTransitionProperty(transitionId, key, workflowName, workflowTransitionProperty, workflowMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionPropertiesApi#createWorkflowTransitionProperty");
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
| **transitionId** | **Long**| The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. | |
| **key** | **String**| The key of the property being added, also known as the name of the property. Set this to the same value as the &#x60;key&#x60; defined in the request body. | |
| **workflowName** | **String**| The name of the workflow that the transition belongs to. | |
| **workflowTransitionProperty** | [**WorkflowTransitionProperty**](WorkflowTransitionProperty.md)|  | |
| **workflowMode** | **String**| The workflow status. Set to *live* for inactive workflows or *draft* for draft workflows. Active workflows cannot be edited. | [optional] [default to live] [enum: live, draft] |

### Return type

[**WorkflowTransitionProperty**](WorkflowTransitionProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |
| **400** | Returned if a workflow property with the same key is present on the transition. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the workflow transition is not found. |  -  |

<a id="deleteWorkflowTransitionProperty"></a>
# **deleteWorkflowTransitionProperty**
> deleteWorkflowTransitionProperty(transitionId, key, workflowName, workflowMode)

Delete workflow transition property

Deletes a property from a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.WorkflowTransitionPropertiesApi;

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

    WorkflowTransitionPropertiesApi apiInstance = new WorkflowTransitionPropertiesApi(defaultClient);
    Long transitionId = 56L; // Long | The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
    String key = "key_example"; // String | The name of the transition property to delete, also known as the name of the property.
    String workflowName = "workflowName_example"; // String | The name of the workflow that the transition belongs to.
    String workflowMode = "live"; // String | The workflow status. Set to `live` for inactive workflows or `draft` for draft workflows. Active workflows cannot be edited.
    try {
      apiInstance.deleteWorkflowTransitionProperty(transitionId, key, workflowName, workflowMode);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionPropertiesApi#deleteWorkflowTransitionProperty");
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
| **transitionId** | **Long**| The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. | |
| **key** | **String**| The name of the transition property to delete, also known as the name of the property. | |
| **workflowName** | **String**| The name of the workflow that the transition belongs to. | |
| **workflowMode** | **String**| The workflow status. Set to &#x60;live&#x60; for inactive workflows or &#x60;draft&#x60; for draft workflows. Active workflows cannot be edited. | [optional] [enum: live, draft] |

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
| **200** | 200 response |  -  |
| **304** | Returned if no changes were made by the request. For example, trying to delete a property that cannot be found. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the workflow transition is not found. |  -  |

<a id="getWorkflowTransitionProperties"></a>
# **getWorkflowTransitionProperties**
> WorkflowTransitionProperty getWorkflowTransitionProperties(transitionId, workflowName, includeReservedKeys, key, workflowMode)

Get workflow transition properties

Returns the properties on a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.WorkflowTransitionPropertiesApi;

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

    WorkflowTransitionPropertiesApi apiInstance = new WorkflowTransitionPropertiesApi(defaultClient);
    Long transitionId = 56L; // Long | The ID of the transition. To get the ID, view the workflow in text mode in the Jira administration console. The ID is shown next to the transition.
    String workflowName = "workflowName_example"; // String | The name of the workflow that the transition belongs to.
    Boolean includeReservedKeys = false; // Boolean | Some properties with keys that have the *jira.* prefix are reserved, which means they are not editable. To include these properties in the results, set this parameter to *true*.
    String key = "key_example"; // String | The key of the property being returned, also known as the name of the property. If this parameter is not specified, all properties on the transition are returned.
    String workflowMode = "live"; // String | The workflow status. Set to *live* for active and inactive workflows, or *draft* for draft workflows.
    try {
      WorkflowTransitionProperty result = apiInstance.getWorkflowTransitionProperties(transitionId, workflowName, includeReservedKeys, key, workflowMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionPropertiesApi#getWorkflowTransitionProperties");
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
| **transitionId** | **Long**| The ID of the transition. To get the ID, view the workflow in text mode in the Jira administration console. The ID is shown next to the transition. | |
| **workflowName** | **String**| The name of the workflow that the transition belongs to. | |
| **includeReservedKeys** | **Boolean**| Some properties with keys that have the *jira.* prefix are reserved, which means they are not editable. To include these properties in the results, set this parameter to *true*. | [optional] [default to false] |
| **key** | **String**| The key of the property being returned, also known as the name of the property. If this parameter is not specified, all properties on the transition are returned. | [optional] |
| **workflowMode** | **String**| The workflow status. Set to *live* for active and inactive workflows, or *draft* for draft workflows. | [optional] [default to live] [enum: live, draft] |

### Return type

[**WorkflowTransitionProperty**](WorkflowTransitionProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have admin permission |  -  |
| **404** | Returned if the workflow transition or property is not found. |  -  |

<a id="updateWorkflowTransitionProperty"></a>
# **updateWorkflowTransitionProperty**
> WorkflowTransitionProperty updateWorkflowTransitionProperty(transitionId, key, workflowName, workflowTransitionProperty, workflowMode)

Update workflow transition property

Updates a workflow transition by changing the property value. Trying to update a property that does not exist results in a new property being added to the transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.WorkflowTransitionPropertiesApi;

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

    WorkflowTransitionPropertiesApi apiInstance = new WorkflowTransitionPropertiesApi(defaultClient);
    Long transitionId = 56L; // Long | The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
    String key = "key_example"; // String | The key of the property being updated, also known as the name of the property. Set this to the same value as the `key` defined in the request body.
    String workflowName = "workflowName_example"; // String | The name of the workflow that the transition belongs to.
    WorkflowTransitionProperty workflowTransitionProperty = new WorkflowTransitionProperty(); // WorkflowTransitionProperty | 
    String workflowMode = "live"; // String | The workflow status. Set to `live` for inactive workflows or `draft` for draft workflows. Active workflows cannot be edited.
    try {
      WorkflowTransitionProperty result = apiInstance.updateWorkflowTransitionProperty(transitionId, key, workflowName, workflowTransitionProperty, workflowMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTransitionPropertiesApi#updateWorkflowTransitionProperty");
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
| **transitionId** | **Long**| The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. | |
| **key** | **String**| The key of the property being updated, also known as the name of the property. Set this to the same value as the &#x60;key&#x60; defined in the request body. | |
| **workflowName** | **String**| The name of the workflow that the transition belongs to. | |
| **workflowTransitionProperty** | [**WorkflowTransitionProperty**](WorkflowTransitionProperty.md)|  | |
| **workflowMode** | **String**| The workflow status. Set to &#x60;live&#x60; for inactive workflows or &#x60;draft&#x60; for draft workflows. Active workflows cannot be edited. | [optional] [enum: live, draft] |

### Return type

[**WorkflowTransitionProperty**](WorkflowTransitionProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |
| **304** | Returned if no changes were made by the request. For example, attempting to update a property with its current value. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the workflow transition is not found. |  -  |

