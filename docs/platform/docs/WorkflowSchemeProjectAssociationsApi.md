# WorkflowSchemeProjectAssociationsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignSchemeToProject**](WorkflowSchemeProjectAssociationsApi.md#assignSchemeToProject) | **PUT** /rest/api/3/workflowscheme/project | Assign workflow scheme to project |
| [**getWorkflowSchemeProjectAssociations**](WorkflowSchemeProjectAssociationsApi.md#getWorkflowSchemeProjectAssociations) | **GET** /rest/api/3/workflowscheme/project | Get workflow scheme project associations |


<a id="assignSchemeToProject"></a>
# **assignSchemeToProject**
> Object assignSchemeToProject(workflowSchemeProjectAssociation)

Assign workflow scheme to project

Assigns a workflow scheme to a project. This operation is performed only when there are no issues in the project.  Workflow schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.WorkflowSchemeProjectAssociationsApi;

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

    WorkflowSchemeProjectAssociationsApi apiInstance = new WorkflowSchemeProjectAssociationsApi(defaultClient);
    WorkflowSchemeProjectAssociation workflowSchemeProjectAssociation = new WorkflowSchemeProjectAssociation(); // WorkflowSchemeProjectAssociation | 
    try {
      Object result = apiInstance.assignSchemeToProject(workflowSchemeProjectAssociation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeProjectAssociationsApi#assignSchemeToProject");
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
| **workflowSchemeProjectAssociation** | [**WorkflowSchemeProjectAssociation**](WorkflowSchemeProjectAssociation.md)|  | |

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
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the workflow scheme or the project are not found. |  -  |

<a id="getWorkflowSchemeProjectAssociations"></a>
# **getWorkflowSchemeProjectAssociations**
> ContainerOfWorkflowSchemeAssociations getWorkflowSchemeProjectAssociations(projectId)

Get workflow scheme project associations

Returns a list of the workflow schemes associated with a list of projects. Each returned workflow scheme includes a list of the requested projects associated with it. Any team-managed or non-existent projects in the request are ignored and no errors are returned.  If the project is associated with the &#x60;Default Workflow Scheme&#x60; no ID is returned. This is because the way the &#x60;Default Workflow Scheme&#x60; is stored means it has no ID.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.WorkflowSchemeProjectAssociationsApi;

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

    WorkflowSchemeProjectAssociationsApi apiInstance = new WorkflowSchemeProjectAssociationsApi(defaultClient);
    Set<Long> projectId = Arrays.asList(); // Set<Long> | The ID of a project to return the workflow schemes for. To include multiple projects, provide an ampersand-Jim: oneseparated list. For example, `projectId=10000&projectId=10001`.
    try {
      ContainerOfWorkflowSchemeAssociations result = apiInstance.getWorkflowSchemeProjectAssociations(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemeProjectAssociationsApi#getWorkflowSchemeProjectAssociations");
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
| **projectId** | [**Set&lt;Long&gt;**](Long.md)| The ID of a project to return the workflow schemes for. To include multiple projects, provide an ampersand-Jim: oneseparated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. | |

### Return type

[**ContainerOfWorkflowSchemeAssociations**](ContainerOfWorkflowSchemeAssociations.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |

