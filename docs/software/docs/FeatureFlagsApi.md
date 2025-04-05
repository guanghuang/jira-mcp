# FeatureFlagsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteFeatureFlagById**](FeatureFlagsApi.md#deleteFeatureFlagById) | **DELETE** /rest/featureflags/0.1/flag/{featureFlagId} | Delete a Feature Flag by ID |
| [**deleteFeatureFlagsByProperty**](FeatureFlagsApi.md#deleteFeatureFlagsByProperty) | **DELETE** /rest/featureflags/0.1/bulkByProperties | Delete Feature Flags by Property |
| [**getFeatureFlagById**](FeatureFlagsApi.md#getFeatureFlagById) | **GET** /rest/featureflags/0.1/flag/{featureFlagId} | Get a Feature Flag by ID |
| [**submitFeatureFlags**](FeatureFlagsApi.md#submitFeatureFlags) | **POST** /rest/featureflags/0.1/bulk | Submit Feature Flag data |


<a id="deleteFeatureFlagById"></a>
# **deleteFeatureFlagById**
> deleteFeatureFlagById(authorization, featureFlagId, updateSequenceId)

Delete a Feature Flag by ID

Delete the Feature Flag data currently stored for the given ID.  Deletion is performed asynchronously. The getFeatureFlagById operation can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraFeatureFlagInfoProvider&#x60; module can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.FeatureFlagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Feature Flags module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    String featureFlagId = "featureFlagId_example"; // String | The ID of the Feature Flag to delete. 
    Long updateSequenceId = 56L; // Long | This parameter usage is no longer supported.  An optional `_updateSequenceId` to use to control deletion.  Only stored data with an `updateSequenceId` less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together. 
    try {
      apiInstance.deleteFeatureFlagById(authorization, featureFlagId, updateSequenceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#deleteFeatureFlagById");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Feature Flags module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details.  | |
| **featureFlagId** | **String**| The ID of the Feature Flag to delete.  | |
| **updateSequenceId** | **Long**| This parameter usage is no longer supported.  An optional &#x60;_updateSequenceId&#x60; to use to control deletion.  Only stored data with an &#x60;updateSequenceId&#x60; less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together.  | [optional] |

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
| **202** | Delete has been accepted. Data will eventually be removed from Jira if it exists.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the Feature Flags module, or the app does not define the &#39;DELETE&#39; scope.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="deleteFeatureFlagsByProperty"></a>
# **deleteFeatureFlagsByProperty**
> deleteFeatureFlagsByProperty(authorization, updateSequenceId)

Delete Feature Flags by Property

Bulk delete all Feature Flags that match the given request.  One or more query params must be supplied to specify Properties to delete by. Optional param &#x60;_updateSequenceId&#x60; is no longer supported. If more than one Property is provided, data will be deleted that matches ALL of the Properties (e.g. treated as an AND). See the documentation for the submitFeatureFlags operation for more details.  e.g. DELETE /bulkByProperties?accountId&#x3D;account-123&amp;createdBy&#x3D;user-456  Deletion is performed asynchronously. The getFeatureFlagById operation can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraFeatureFlagInfoProvider&#x60; module can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.FeatureFlagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Feature Flags module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    Long updateSequenceId = 56L; // Long | This parameter usage is no longer supported.  An optional `_updateSequenceId` to use to control deletion.  Only stored data with an `updateSequenceId` less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together.  If not provided, all stored data that matches the request will be deleted. 
    try {
      apiInstance.deleteFeatureFlagsByProperty(authorization, updateSequenceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#deleteFeatureFlagsByProperty");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Feature Flags module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details.  | |
| **updateSequenceId** | **Long**| This parameter usage is no longer supported.  An optional &#x60;_updateSequenceId&#x60; to use to control deletion.  Only stored data with an &#x60;updateSequenceId&#x60; less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together.  If not provided, all stored data that matches the request will be deleted.  | [optional] |

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
| **202** | Delete accepted. Data will eventually be removed from Jira.  |  -  |
| **400** | Request has incorrect format (e.g. missing at least one Property param).  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the Feature Flags module, or the app does not define the &#39;DELETE&#39; scope.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="getFeatureFlagById"></a>
# **getFeatureFlagById**
> FeatureFlagData getFeatureFlagById(authorization, featureFlagId)

Get a Feature Flag by ID

Retrieve the currently stored Feature Flag data for the given ID.  The result will be what is currently stored, ignoring any pending updates or deletes.  Only Connect apps that define the &#x60;jiraFeatureFlagInfoProvider&#x60; module can access this resource. This resource requires the &#39;READ&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.FeatureFlagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Feature Flags module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    String featureFlagId = "featureFlagId_example"; // String | The ID of the Feature Flag to fetch. 
    try {
      FeatureFlagData result = apiInstance.getFeatureFlagById(authorization, featureFlagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#getFeatureFlagById");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Feature Flags module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details.  | |
| **featureFlagId** | **String**| The ID of the Feature Flag to fetch.  | |

### Return type

[**FeatureFlagData**](FeatureFlagData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Feature Flag data currently stored for the given ID.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the Feature Flags module, or the app does not define the &#39;READ&#39; scope.  |  -  |
| **404** | No data found for the given Feature Flag ID.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="submitFeatureFlags"></a>
# **submitFeatureFlags**
> SubmitFeatureFlagsResponse submitFeatureFlags(authorization, submitFeatureFlagRequest)

Submit Feature Flag data

Update / insert Feature Flag data.  Feature Flags are identified by their ID, and existing Feature Flag data for the same ID will be replaced if it exists and the updateSequenceId of existing data is less than the incoming data.  Submissions are performed asynchronously. Submitted data will eventually be available in Jira; most updates are available within a short period of time, but may take some time during peak load and/or maintenance times. The getFeatureFlagById operation can be used to confirm that data has been stored successfully (if needed).  In the case of multiple Feature Flags being submitted in one request, each is validated individually prior to submission. Details of which Feature Flags failed submission (if any) are available in the response object.  Only Connect apps that define the &#x60;jiraFeatureFlagInfoProvider&#x60; module can access this resource. This resource requires the &#39;WRITE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.FeatureFlagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Feature Flags module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details. 
    SubmitFeatureFlagRequest submitFeatureFlagRequest = new SubmitFeatureFlagRequest(); // SubmitFeatureFlagRequest | Feature Flag data to submit. 
    try {
      SubmitFeatureFlagsResponse result = apiInstance.submitFeatureFlags(authorization, submitFeatureFlagRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#submitFeatureFlags");
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
| **authorization** | **String**| All requests must be signed with a Connect JWT token that corresponds to the Provider app installed in Jira.  If the JWT token corresponds to an app that does not define Feature Flags module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details.  | |
| **submitFeatureFlagRequest** | [**SubmitFeatureFlagRequest**](SubmitFeatureFlagRequest.md)| Feature Flag data to submit.  | |

### Return type

[**SubmitFeatureFlagsResponse**](SubmitFeatureFlagsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Submission accepted. Each submitted Feature Flag that is of a valid format will be eventually available in Jira.  Details of which Feature Flags were submitted and which failed submission (due to data format problems etc.) are available in the response object.  |  -  |
| **400** | Request has incorrect format.  Note that in the case of an individual Feature Flag having an invalid format (rather than the request as a whole) the response for the request will be a 202 and details of the invalid Feature Flag will be contained in the response object.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the Feature Flags module, or the app does not define the &#39;WRITE&#39; scope.  |  -  |
| **413** | Data is too large. Submit fewer Feature Flags in each payload.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

