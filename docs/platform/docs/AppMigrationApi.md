# AppMigrationApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appIssueFieldValueUpdateResourceUpdateIssueFieldsPut**](AppMigrationApi.md#appIssueFieldValueUpdateResourceUpdateIssueFieldsPut) | **PUT** /rest/atlassian-connect/1/migration/field | Bulk update custom field value |
| [**migrationResourceUpdateEntityPropertiesValuePut**](AppMigrationApi.md#migrationResourceUpdateEntityPropertiesValuePut) | **PUT** /rest/atlassian-connect/1/migration/properties/{entityType} | Bulk update entity properties |
| [**migrationResourceWorkflowRuleSearchPost**](AppMigrationApi.md#migrationResourceWorkflowRuleSearchPost) | **POST** /rest/atlassian-connect/1/migration/workflow/rule/search | Get workflow transition rule configurations |


<a id="appIssueFieldValueUpdateResourceUpdateIssueFieldsPut"></a>
# **appIssueFieldValueUpdateResourceUpdateIssueFieldsPut**
> Object appIssueFieldValueUpdateResourceUpdateIssueFieldsPut(atlassianTransferId, connectCustomFieldValues)

Bulk update custom field value

Updates the value of a custom field added by Connect apps on one or more issues. The values of up to 200 custom fields can be updated.  **[Permissions](#permissions) required:** Only Connect apps can make this request

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.AppMigrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    AppMigrationApi apiInstance = new AppMigrationApi(defaultClient);
    UUID atlassianTransferId = UUID.randomUUID(); // UUID | The ID of the transfer.
    ConnectCustomFieldValues connectCustomFieldValues = new ConnectCustomFieldValues(); // ConnectCustomFieldValues | 
    try {
      Object result = apiInstance.appIssueFieldValueUpdateResourceUpdateIssueFieldsPut(atlassianTransferId, connectCustomFieldValues);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppMigrationApi#appIssueFieldValueUpdateResourceUpdateIssueFieldsPut");
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
| **atlassianTransferId** | **UUID**| The ID of the transfer. | |
| **connectCustomFieldValues** | [**ConnectCustomFieldValues**](ConnectCustomFieldValues.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **403** | Returned if: * the transfer ID is not found. * the authorisation credentials are incorrect or missing. |  -  |

<a id="migrationResourceUpdateEntityPropertiesValuePut"></a>
# **migrationResourceUpdateEntityPropertiesValuePut**
> migrationResourceUpdateEntityPropertiesValuePut(atlassianTransferId, entityType, entityPropertyDetails)

Bulk update entity properties

Updates the values of multiple entity properties for an object, up to 50 updates per request. This operation is for use by Connect apps during app migration.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.AppMigrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    AppMigrationApi apiInstance = new AppMigrationApi(defaultClient);
    UUID atlassianTransferId = UUID.randomUUID(); // UUID | The app migration transfer ID.
    String entityType = "IssueProperty"; // String | The type indicating the object that contains the entity properties.
    List<EntityPropertyDetails> entityPropertyDetails = Arrays.asList(); // List<EntityPropertyDetails> | 
    try {
      apiInstance.migrationResourceUpdateEntityPropertiesValuePut(atlassianTransferId, entityType, entityPropertyDetails);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppMigrationApi#migrationResourceUpdateEntityPropertiesValuePut");
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
| **atlassianTransferId** | **UUID**| The app migration transfer ID. | |
| **entityType** | **String**| The type indicating the object that contains the entity properties. | [enum: IssueProperty, CommentProperty, DashboardItemProperty, IssueTypeProperty, ProjectProperty, UserProperty, WorklogProperty, BoardProperty, SprintProperty] |
| **entityPropertyDetails** | [**List&lt;EntityPropertyDetails&gt;**](EntityPropertyDetails.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **403** | Returned if the authorisation credentials are incorrect or missing. |  -  |

<a id="migrationResourceWorkflowRuleSearchPost"></a>
# **migrationResourceWorkflowRuleSearchPost**
> WorkflowRulesSearchDetails migrationResourceWorkflowRuleSearchPost(atlassianTransferId, workflowRulesSearch)

Get workflow transition rule configurations

Returns configurations for workflow transition rules migrated from server to cloud and owned by the calling Connect app.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.AppMigrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");

    AppMigrationApi apiInstance = new AppMigrationApi(defaultClient);
    UUID atlassianTransferId = UUID.randomUUID(); // UUID | The app migration transfer ID.
    WorkflowRulesSearch workflowRulesSearch = new WorkflowRulesSearch(); // WorkflowRulesSearch | 
    try {
      WorkflowRulesSearchDetails result = apiInstance.migrationResourceWorkflowRuleSearchPost(atlassianTransferId, workflowRulesSearch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppMigrationApi#migrationResourceWorkflowRuleSearchPost");
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
| **atlassianTransferId** | **UUID**| The app migration transfer ID. | |
| **workflowRulesSearch** | [**WorkflowRulesSearch**](WorkflowRulesSearch.md)|  | |

### Return type

[**WorkflowRulesSearchDetails**](WorkflowRulesSearchDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **403** | Returned if the authorisation credentials are incorrect or missing. |  -  |

