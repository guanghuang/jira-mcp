# BuildsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteBuildByKey**](BuildsApi.md#deleteBuildByKey) | **DELETE** /rest/builds/0.1/pipelines/{pipelineId}/builds/{buildNumber} | Delete a build by key |
| [**deleteBuildsByProperty**](BuildsApi.md#deleteBuildsByProperty) | **DELETE** /rest/builds/0.1/bulkByProperties | Delete builds by Property |
| [**getBuildByKey**](BuildsApi.md#getBuildByKey) | **GET** /rest/builds/0.1/pipelines/{pipelineId}/builds/{buildNumber} | Get a build by key |
| [**submitBuilds**](BuildsApi.md#submitBuilds) | **POST** /rest/builds/0.1/bulk | Submit build data |


<a id="deleteBuildByKey"></a>
# **deleteBuildByKey**
> deleteBuildByKey(authorization, pipelineId, buildNumber, updateSequenceNumber)

Delete a build by key

Delete the build data currently stored for the given &#x60;pipelineId&#x60; and &#x60;buildNumber&#x60; combination.  Deletion is performed asynchronously. The &#x60;getBuildByKey&#x60; operation can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraBuildInfoProvider&#x60; module, and on-premise integrations, can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BuildsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    BuildsApi apiInstance = new BuildsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define `jiraBuildInfoProvider` module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations. 
    String pipelineId = "pipelineId_example"; // String | The `pipelineId` of the build to delete. 
    Long buildNumber = 56L; // Long | The `buildNumber` of the build to delete. 
    Long updateSequenceNumber = 56L; // Long | This parameter usage is no longer supported.  An optional `_updateSequenceNumber` to use to control deletion.  Only stored data with an `updateSequenceNumber` less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together. 
    try {
      apiInstance.deleteBuildByKey(authorization, pipelineId, buildNumber, updateSequenceNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuildsApi#deleteBuildByKey");
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
| **authorization** | **String**| All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define &#x60;jiraBuildInfoProvider&#x60; module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations.  | |
| **pipelineId** | **String**| The &#x60;pipelineId&#x60; of the build to delete.  | |
| **buildNumber** | **Long**| The &#x60;buildNumber&#x60; of the build to delete.  | |
| **updateSequenceNumber** | **Long**| This parameter usage is no longer supported.  An optional &#x60;_updateSequenceNumber&#x60; to use to control deletion.  Only stored data with an &#x60;updateSequenceNumber&#x60; less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together.  | [optional] |

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
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraBuildInfoProvider&#x60; module, or the app does not define the &#39;DELETE&#39; scope.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="deleteBuildsByProperty"></a>
# **deleteBuildsByProperty**
> deleteBuildsByProperty(authorization, updateSequenceNumber)

Delete builds by Property

Bulk delete all builds data that match the given request.  One or more query params must be supplied to specify Properties to delete by. Optional param &#x60;_updateSequenceNumber&#x60; is no longer supported. If more than one Property is provided, data will be deleted that matches ALL of the Properties (e.g. treated as an AND).  See the documentation for the &#x60;submitBuilds&#x60; operation for more details.  e.g. DELETE /bulkByProperties?accountId&#x3D;account-123&amp;repoId&#x3D;repo-345  Deletion is performed asynchronously. The &#x60;getBuildByKey&#x60; operation can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraBuildInfoProvider&#x60; module, and on-premise integrations, can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BuildsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    BuildsApi apiInstance = new BuildsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define `jiraBuildInfoProvider` module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations. 
    Long updateSequenceNumber = 56L; // Long | This parameter usage is no longer supported.  An optional `_updateSequenceNumber` to use to control deletion.  Only stored data with an `updateSequenceNumber` less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together.  If not provided, all stored data that matches the request will be deleted. 
    try {
      apiInstance.deleteBuildsByProperty(authorization, updateSequenceNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuildsApi#deleteBuildsByProperty");
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
| **authorization** | **String**| All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define &#x60;jiraBuildInfoProvider&#x60; module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations.  | |
| **updateSequenceNumber** | **Long**| This parameter usage is no longer supported.  An optional &#x60;_updateSequenceNumber&#x60; to use to control deletion.  Only stored data with an &#x60;updateSequenceNumber&#x60; less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together.  If not provided, all stored data that matches the request will be deleted.  | [optional] |

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
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraBuildInfoProvider&#x60; module, or the app does not define the &#39;DELETE&#39; scope.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="getBuildByKey"></a>
# **getBuildByKey**
> BuildData getBuildByKey(authorization, pipelineId, buildNumber)

Get a build by key

Retrieve the currently stored build data for the given &#x60;pipelineId&#x60; and &#x60;buildNumber&#x60; combination.  The result will be what is currently stored, ignoring any pending updates or deletes.  Only Connect apps that define the &#x60;jiraBuildInfoProvider&#x60; module, and on-premise integrations, can access this resource. This resource requires the &#39;READ&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BuildsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    BuildsApi apiInstance = new BuildsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define `jiraBuildInfoProvider` module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations. 
    String pipelineId = "pipelineId_example"; // String | The `pipelineId` of the build. 
    Long buildNumber = 56L; // Long | The `buildNumber` of the build. 
    try {
      BuildData result = apiInstance.getBuildByKey(authorization, pipelineId, buildNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuildsApi#getBuildByKey");
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
| **authorization** | **String**| All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define &#x60;jiraBuildInfoProvider&#x60; module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations.  | |
| **pipelineId** | **String**| The &#x60;pipelineId&#x60; of the build.  | |
| **buildNumber** | **Long**| The &#x60;buildNumber&#x60; of the build.  | |

### Return type

[**BuildData**](BuildData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The build data currently stored for the given key.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraBuildInfoProvider&#x60; module, or the app does not define the &#39;READ&#39; scope.  |  -  |
| **404** | No build data found for the given key.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="submitBuilds"></a>
# **submitBuilds**
> SubmitBuildsResponse submitBuilds(authorization, submitBuildsRequest)

Submit build data

Update / insert builds data.  Builds are identified by the combination of &#x60;pipelineId&#x60; and &#x60;buildNumber&#x60;, and existing build data for the same build will be replaced if it exists and the &#x60;updateSequenceNumber&#x60; of the existing data is less than the incoming data.  Submissions are performed asynchronously. Submitted data will eventually be available in Jira; most updates are available within a short period of time, but may take some time during peak load and/or maintenance times. The &#x60;getBuildByKey&#x60; operation can be used to confirm that data has been stored successfully (if needed).  In the case of multiple builds being submitted in one request, each is validated individually prior to submission. Details of which build failed submission (if any) are available in the response object.  Only Connect apps that define the &#x60;jiraBuildInfoProvider&#x60; module, and on-premise integrations, can access this resource. This resource requires the &#39;WRITE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.BuildsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    BuildsApi apiInstance = new BuildsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define `jiraBuildInfoProvider` module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations. 
    SubmitBuildsRequest submitBuildsRequest = new SubmitBuildsRequest(); // SubmitBuildsRequest | Builds data to submit. 
    try {
      SubmitBuildsResponse result = apiInstance.submitBuilds(authorization, submitBuildsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuildsApi#submitBuilds");
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
| **authorization** | **String**| All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define &#x60;jiraBuildInfoProvider&#x60; module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations.  | |
| **submitBuildsRequest** | [**SubmitBuildsRequest**](SubmitBuildsRequest.md)| Builds data to submit.  | |

### Return type

[**SubmitBuildsResponse**](SubmitBuildsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Submission accepted. Each submitted build that is of a valid format will be eventually available in Jira.  Details of which builds were submitted and which failed submission (due to data format problems etc.) are available in the response object.  |  -  |
| **400** | Request has incorrect format.  Note that in the case of an individual build having an invalid format (rather than the request as a whole) the response for the request will be a 202 and details of the invalid build will be contained in the response object.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraBuildInfoProvider&#x60; module, or the app does not define the &#39;WRITE&#39; scope.  |  -  |
| **413** | Data is too large. Submit fewer builds in each payload.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

