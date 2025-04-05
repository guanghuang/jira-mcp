# DynamicModulesApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dynamicModulesResourceGetModulesGet**](DynamicModulesApi.md#dynamicModulesResourceGetModulesGet) | **GET** /rest/atlassian-connect/1/app/module/dynamic | Get modules |
| [**dynamicModulesResourceRegisterModulesPost**](DynamicModulesApi.md#dynamicModulesResourceRegisterModulesPost) | **POST** /rest/atlassian-connect/1/app/module/dynamic | Register modules |
| [**dynamicModulesResourceRemoveModulesDelete**](DynamicModulesApi.md#dynamicModulesResourceRemoveModulesDelete) | **DELETE** /rest/atlassian-connect/1/app/module/dynamic | Remove modules |


<a id="dynamicModulesResourceGetModulesGet"></a>
# **dynamicModulesResourceGetModulesGet**
> ConnectModules dynamicModulesResourceGetModulesGet()

Get modules

Returns all modules registered dynamically by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.DynamicModulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    DynamicModulesApi apiInstance = new DynamicModulesApi(defaultClient);
    try {
      ConnectModules result = apiInstance.dynamicModulesResourceGetModulesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicModulesApi#dynamicModulesResourceGetModulesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConnectModules**](ConnectModules.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the call is not from a Connect app. |  -  |

<a id="dynamicModulesResourceRegisterModulesPost"></a>
# **dynamicModulesResourceRegisterModulesPost**
> dynamicModulesResourceRegisterModulesPost(connectModules)

Register modules

Registers a list of modules.  **[Permissions](#permissions) required:** Only Connect apps can make this request.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.DynamicModulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    DynamicModulesApi apiInstance = new DynamicModulesApi(defaultClient);
    ConnectModules connectModules = new ConnectModules(); // ConnectModules | 
    try {
      apiInstance.dynamicModulesResourceRegisterModulesPost(connectModules);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicModulesApi#dynamicModulesResourceRegisterModulesPost");
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
| **connectModules** | [**ConnectModules**](ConnectModules.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if: * any of the provided modules is invalid. For example, required properties are missing. * any of the modules conflict with registered dynamic modules or modules defined in the app descriptor. For example, there are duplicate keys.  Details of the issues encountered are included in the error message. |  -  |
| **401** | Returned if the call is not from a Connect app. |  -  |

<a id="dynamicModulesResourceRemoveModulesDelete"></a>
# **dynamicModulesResourceRemoveModulesDelete**
> dynamicModulesResourceRemoveModulesDelete(moduleKey)

Remove modules

Remove all or a list of modules registered by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.DynamicModulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    DynamicModulesApi apiInstance = new DynamicModulesApi(defaultClient);
    List<String> moduleKey = Arrays.asList(); // List<String> | The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, `moduleKey=dynamic-attachment-entity-property&moduleKey=dynamic-select-field`. Nonexistent keys are ignored.
    try {
      apiInstance.dynamicModulesResourceRemoveModulesDelete(moduleKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicModulesApi#dynamicModulesResourceRemoveModulesDelete");
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
| **moduleKey** | [**List&lt;String&gt;**](String.md)| The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, &#x60;moduleKey&#x3D;dynamic-attachment-entity-property&amp;moduleKey&#x3D;dynamic-select-field&#x60;. Nonexistent keys are ignored. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the request is successful. |  -  |
| **401** | Returned if the call is not from a Connect app. |  -  |

