# ServiceRegistryApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**serviceRegistryResourceServicesGet**](ServiceRegistryApi.md#serviceRegistryResourceServicesGet) | **GET** /rest/atlassian-connect/1/service-registry | Retrieve the attributes of service registries |


<a id="serviceRegistryResourceServicesGet"></a>
# **serviceRegistryResourceServicesGet**
> List&lt;ServiceRegistry&gt; serviceRegistryResourceServicesGet(serviceIds)

Retrieve the attributes of service registries

Retrieve the attributes of given service registries.  **[Permissions](#permissions) required:** Only Connect apps can make this request and the servicesIds belong to the tenant you are requesting

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.ServiceRegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    ServiceRegistryApi apiInstance = new ServiceRegistryApi(defaultClient);
    List<String> serviceIds = Arrays.asList(); // List<String> | The ID of the services (the strings starting with \"b:\" need to be decoded in Base64).
    try {
      List<ServiceRegistry> result = apiInstance.serviceRegistryResourceServicesGet(serviceIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceRegistryApi#serviceRegistryResourceServicesGet");
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
| **serviceIds** | [**List&lt;String&gt;**](String.md)| The ID of the services (the strings starting with \&quot;b:\&quot; need to be decoded in Base64). | |

### Return type

[**List&lt;ServiceRegistry&gt;**](ServiceRegistry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | The request needs to be authenticated. |  -  |
| **403** | The request isn&#39;t authorized. |  -  |
| **500** | The endpoint failed internally. |  -  |
| **501** | The endpoint isn&#39;t ready for receiving requests. |  -  |
| **504** | The upstream service is busy. |  -  |

