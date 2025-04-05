# DeploymentsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDeploymentByKey**](DeploymentsApi.md#deleteDeploymentByKey) | **DELETE** /rest/deployments/0.1/pipelines/{pipelineId}/environments/{environmentId}/deployments/{deploymentSequenceNumber} | Delete a deployment by key |
| [**deleteDeploymentsByProperty**](DeploymentsApi.md#deleteDeploymentsByProperty) | **DELETE** /rest/deployments/0.1/bulkByProperties | Delete deployments by Property |
| [**getDeploymentByKey**](DeploymentsApi.md#getDeploymentByKey) | **GET** /rest/deployments/0.1/pipelines/{pipelineId}/environments/{environmentId}/deployments/{deploymentSequenceNumber} | Get a deployment by key |
| [**getDeploymentGatingStatusByKey**](DeploymentsApi.md#getDeploymentGatingStatusByKey) | **GET** /rest/deployments/0.1/pipelines/{pipelineId}/environments/{environmentId}/deployments/{deploymentSequenceNumber}/gating-status | Get deployment gating status by key |
| [**submitDeployments**](DeploymentsApi.md#submitDeployments) | **POST** /rest/deployments/0.1/bulk | Submit deployment data |


<a id="deleteDeploymentByKey"></a>
# **deleteDeploymentByKey**
> deleteDeploymentByKey(authorization, pipelineId, environmentId, deploymentSequenceNumber, updateSequenceNumber)

Delete a deployment by key

Delete the currently stored deployment data for the given &#x60;pipelineId&#x60;, &#x60;environmentId&#x60; and &#x60;deploymentSequenceNumber&#x60; combination.  Deletion is performed asynchronously. The &#x60;getDeploymentByKey&#x60; operation can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraDeploymentInfoProvider&#x60; module, and on-premise integrations, can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.DeploymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    DeploymentsApi apiInstance = new DeploymentsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define `jiraDeploymentInfoProvider` module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations. 
    String pipelineId = "pipelineId_example"; // String | The ID of the deployment's pipeline. 
    String environmentId = "environmentId_example"; // String | The ID of the deployment's environment. 
    Long deploymentSequenceNumber = 56L; // Long | The deployment's deploymentSequenceNumber. 
    Long updateSequenceNumber = 56L; // Long | This parameter usage is no longer supported.  An optional `_updateSequenceNumber` to use to control deletion.  Only stored data with an `updateSequenceNumber` less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together. 
    try {
      apiInstance.deleteDeploymentByKey(authorization, pipelineId, environmentId, deploymentSequenceNumber, updateSequenceNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentsApi#deleteDeploymentByKey");
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
| **authorization** | **String**| All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define &#x60;jiraDeploymentInfoProvider&#x60; module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations.  | |
| **pipelineId** | **String**| The ID of the deployment&#39;s pipeline.  | |
| **environmentId** | **String**| The ID of the deployment&#39;s environment.  | |
| **deploymentSequenceNumber** | **Long**| The deployment&#39;s deploymentSequenceNumber.  | |
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
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraDeploymentInfoProvider&#x60; module, or the app does not define the &#39;DELETE&#39; scope.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="deleteDeploymentsByProperty"></a>
# **deleteDeploymentsByProperty**
> deleteDeploymentsByProperty(authorization, updateSequenceNumber)

Delete deployments by Property

Bulk delete all deployments that match the given request.  One or more query params must be supplied to specify the Properties to delete by. Optional param &#x60;_updateSequenceNumber&#x60; is no longer supported. If more than one Property is provided, data will be deleted that matches ALL of the Properties (i.e. treated as AND). See the documentation for the &#x60;submitDeployments&#x60; operation for more details.  Example operation: DELETE /bulkByProperties?accountId&#x3D;account-123&amp;createdBy&#x3D;user-456  Deletion is performed asynchronously. The &#x60;getDeploymentByKey&#x60; operation can be used to confirm that data has been deleted successfully (if needed).  Only Connect apps that define the &#x60;jiraDeploymentInfoProvider&#x60; module, and on-premise integrations, can access this resource. This resource requires the &#39;DELETE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.DeploymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    DeploymentsApi apiInstance = new DeploymentsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define `jiraDeploymentInfoProvider` module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations. 
    Long updateSequenceNumber = 56L; // Long | This parameter usage is no longer supported.  An optional `updateSequenceNumber` to use to control deletion.  Only stored data with an `updateSequenceNumber` less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together.  If not provided, all stored data that matches the request will be deleted. 
    try {
      apiInstance.deleteDeploymentsByProperty(authorization, updateSequenceNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentsApi#deleteDeploymentsByProperty");
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
| **authorization** | **String**| All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define &#x60;jiraDeploymentInfoProvider&#x60; module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations.  | |
| **updateSequenceNumber** | **Long**| This parameter usage is no longer supported.  An optional &#x60;updateSequenceNumber&#x60; to use to control deletion.  Only stored data with an &#x60;updateSequenceNumber&#x60; less than or equal to that provided will be deleted. This can be used help ensure submit/delete requests are applied correctly if issued close together.  If not provided, all stored data that matches the request will be deleted.  | [optional] |

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
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraDeploymentInfoProvider&#x60; module, or the app does not define the &#39;DELETE&#39; scope for Connect apps.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="getDeploymentByKey"></a>
# **getDeploymentByKey**
> DeploymentData getDeploymentByKey(authorization, pipelineId, environmentId, deploymentSequenceNumber)

Get a deployment by key

Retrieve the currently stored deployment data for the given &#x60;pipelineId&#x60;, &#x60;environmentId&#x60; and &#x60;deploymentSequenceNumber&#x60; combination.  The result will be what is currently stored, ignoring any pending updates or deletes.  Only Connect apps that define the &#x60;jiraDeploymentInfoProvider&#x60; module, and on-premise integrations, can access this resource. This resource requires the &#39;READ&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.DeploymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    DeploymentsApi apiInstance = new DeploymentsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define `jiraDeploymentInfoProvider` module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations. 
    String pipelineId = "pipelineId_example"; // String | The ID of the deployment's pipeline. 
    String environmentId = "environmentId_example"; // String | The ID of the deployment's environment. 
    Long deploymentSequenceNumber = 56L; // Long | The deployment's deploymentSequenceNumber. 
    try {
      DeploymentData result = apiInstance.getDeploymentByKey(authorization, pipelineId, environmentId, deploymentSequenceNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentsApi#getDeploymentByKey");
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
| **authorization** | **String**| All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define &#x60;jiraDeploymentInfoProvider&#x60; module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations.  | |
| **pipelineId** | **String**| The ID of the deployment&#39;s pipeline.  | |
| **environmentId** | **String**| The ID of the deployment&#39;s environment.  | |
| **deploymentSequenceNumber** | **Long**| The deployment&#39;s deploymentSequenceNumber.  | |

### Return type

[**DeploymentData**](DeploymentData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The deployment data currently stored for the given ID.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraDeploymentInfoProvider&#x60; module,  or the app does not define the &#39;READ&#39; scope.  |  -  |
| **404** | No data found for the given deployment ID.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="getDeploymentGatingStatusByKey"></a>
# **getDeploymentGatingStatusByKey**
> SubmitDeploymentsResponse1 getDeploymentGatingStatusByKey(pipelineId, environmentId, deploymentSequenceNumber)

Get deployment gating status by key

Retrieve the  Deployment gating status for the given &#x60;pipelineId + environmentId + deploymentSequenceNumber&#x60; combination. Only apps that define the &#x60;jiraDeploymentInfoProvider&#x60; module can access this resource. This resource requires the &#39;READ&#39; scope. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.DeploymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    DeploymentsApi apiInstance = new DeploymentsApi(defaultClient);
    String pipelineId = "pipelineId_example"; // String | The ID of the Deployment's pipeline. 
    String environmentId = "environmentId_example"; // String | The ID of the Deployment's environment. 
    Long deploymentSequenceNumber = 56L; // Long | The Deployment's deploymentSequenceNumber. 
    try {
      SubmitDeploymentsResponse1 result = apiInstance.getDeploymentGatingStatusByKey(pipelineId, environmentId, deploymentSequenceNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentsApi#getDeploymentGatingStatusByKey");
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
| **pipelineId** | **String**| The ID of the Deployment&#39;s pipeline.  | |
| **environmentId** | **String**| The ID of the Deployment&#39;s environment.  | |
| **deploymentSequenceNumber** | **Long**| The Deployment&#39;s deploymentSequenceNumber.  | |

### Return type

[**SubmitDeploymentsResponse1**](SubmitDeploymentsResponse1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The current gating status for the given Deployment  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraDeploymentInfoProvider&#x60; module,  |  -  |
| **404** | No data found for the given deployment ID.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

<a id="submitDeployments"></a>
# **submitDeployments**
> SubmitDeploymentsResponse submitDeployments(authorization, submitDeploymentRequest)

Submit deployment data

Update / insert deployment data.  Deployments are identified by the combination of &#x60;pipelineId&#x60;, &#x60;environmentId&#x60; and &#x60;deploymentSequenceNumber&#x60;, and existing deployment data for the same deployment will be replaced if it exists and the &#x60;updateSequenceNumber&#x60; of existing data is less than the incoming data.  Submissions are processed asynchronously. Submitted data will eventually be available in Jira. Most updates are available within a short period of time, but may take some time during peak load and/or maintenance times. The &#x60;getDeploymentByKey&#x60; operation can be used to confirm that data has been stored successfully (if needed).  In the case of multiple deployments being submitted in one request, each is validated individually prior to submission. Details of which deployments failed submission (if any) are available in the response object.  Only Connect apps that define the &#x60;jiraDeploymentInfoProvider&#x60; module, and on-premise integrations, can access this resource. This resource requires the &#39;WRITE&#39; scope for Connect apps. 

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.software.api.DeploymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    DeploymentsApi apiInstance = new DeploymentsApi(defaultClient);
    String authorization = "authorization_example"; // String | All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define `jiraDeploymentInfoProvider` module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations. 
    SubmitDeploymentRequest submitDeploymentRequest = new SubmitDeploymentRequest(); // SubmitDeploymentRequest | Deployment data to submit. 
    try {
      SubmitDeploymentsResponse result = apiInstance.submitDeployments(authorization, submitDeploymentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentsApi#submitDeployments");
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
| **authorization** | **String**| All requests must be signed with either a Connect JWT token or OAuth token for an on-premise integration that corresponds to an app installed in Jira.  If the Connect JWT token corresponds to an app that does not define &#x60;jiraDeploymentInfoProvider&#x60; module it will be rejected with a 403.  See https://developer.atlassian.com/blog/2015/01/understanding-jwt/ for more details about Connect JWT tokens. See https://developer.atlassian.com/cloud/jira/software/integrate-jsw-cloud-with-onpremises-tools/ for details about on-premise integrations.  | |
| **submitDeploymentRequest** | [**SubmitDeploymentRequest**](SubmitDeploymentRequest.md)| Deployment data to submit.  | |

### Return type

[**SubmitDeploymentsResponse**](SubmitDeploymentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Submission accepted. Each submitted deployment that is of a valid format will eventually be available in Jira.  Details of which deployments were submitted and which failed submission (due to data format problems etc.) are available in the response object.  |  -  |
| **400** | Request has incorrect format.  Note that in the case of an individual deployment having an invalid format (rather than the request as a whole) the response for the request will be a 202 and details of the invalid deployment will be contained in the response object.  |  -  |
| **401** | Missing a JWT token, or token is invalid.  |  -  |
| **403** | The JWT token used does not correspond to an app that defines the &#x60;jiraDeploymentInfoProvider&#x60; module, or the app does not define the &#39;WRITE&#39; scope.  |  -  |
| **413** | Data is too large. Submit fewer deployments in each payload.  |  -  |
| **429** | API rate limit has been exceeded.  |  -  |
| **503** | Service is unavailable due to maintenance or other reasons.  |  -  |
| **0** | An unknown error has occurred.  |  -  |

