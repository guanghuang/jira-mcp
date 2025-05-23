/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT-1461af1efd5cc75bf21cb8256a8b42f9bd4278be
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.atlassian.jira.platform.api;

import com.atlassian.jira.invoker.ApiCallback;
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.ApiResponse;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.Pair;
import com.atlassian.jira.invoker.ProgressRequestBody;
import com.atlassian.jira.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.atlassian.jira.platform.model.ProjectEmailAddress;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectEmailApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProjectEmailApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectEmailApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getProjectEmail
     * @param projectId The project ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have permission to read project. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project or project&#39;s sender email address is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProjectEmailCall(Long projectId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/api/3/project/{projectId}/email"
            .replace("{" + "projectId" + "}", localVarApiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProjectEmailValidateBeforeCall(Long projectId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getProjectEmail(Async)");
        }

        return getProjectEmailCall(projectId, _callback);

    }

    /**
     * Get project&#39;s sender email
     * Returns the [project&#39;s sender email address](https://confluence.atlassian.com/x/dolKLg).  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * @param projectId The project ID. (required)
     * @return ProjectEmailAddress
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have permission to read project. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project or project&#39;s sender email address is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ProjectEmailAddress getProjectEmail(Long projectId) throws ApiException {
        ApiResponse<ProjectEmailAddress> localVarResp = getProjectEmailWithHttpInfo(projectId);
        return localVarResp.getData();
    }

    /**
     * Get project&#39;s sender email
     * Returns the [project&#39;s sender email address](https://confluence.atlassian.com/x/dolKLg).  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * @param projectId The project ID. (required)
     * @return ApiResponse&lt;ProjectEmailAddress&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have permission to read project. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project or project&#39;s sender email address is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProjectEmailAddress> getProjectEmailWithHttpInfo(Long projectId) throws ApiException {
        okhttp3.Call localVarCall = getProjectEmailValidateBeforeCall(projectId, null);
        Type localVarReturnType = new TypeToken<ProjectEmailAddress>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get project&#39;s sender email (asynchronously)
     * Returns the [project&#39;s sender email address](https://confluence.atlassian.com/x/dolKLg).  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * @param projectId The project ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have permission to read project. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project or project&#39;s sender email address is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProjectEmailAsync(Long projectId, final ApiCallback<ProjectEmailAddress> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProjectEmailValidateBeforeCall(projectId, _callback);
        Type localVarReturnType = new TypeToken<ProjectEmailAddress>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProjectEmail
     * @param projectId The project ID. (required)
     * @param projectEmailAddress The project&#39;s sender email address to be set. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the project&#39;s sender email address is successfully set. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid, if the email address is not valid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have permission to administer the project. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProjectEmailCall(Long projectId, ProjectEmailAddress projectEmailAddress, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = projectEmailAddress;

        // create path and map variables
        String localVarPath = "/rest/api/3/project/{projectId}/email"
            .replace("{" + "projectId" + "}", localVarApiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateProjectEmailValidateBeforeCall(Long projectId, ProjectEmailAddress projectEmailAddress, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling updateProjectEmail(Async)");
        }

        // verify the required parameter 'projectEmailAddress' is set
        if (projectEmailAddress == null) {
            throw new ApiException("Missing the required parameter 'projectEmailAddress' when calling updateProjectEmail(Async)");
        }

        return updateProjectEmailCall(projectId, projectEmailAddress, _callback);

    }

    /**
     * Set project&#39;s sender email
     * Sets the [project&#39;s sender email address](https://confluence.atlassian.com/x/dolKLg).  If &#x60;emailAddress&#x60; is an empty string, the default email address is restored.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * @param projectId The project ID. (required)
     * @param projectEmailAddress The project&#39;s sender email address to be set. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the project&#39;s sender email address is successfully set. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid, if the email address is not valid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have permission to administer the project. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
     </table>
     */
    public Object updateProjectEmail(Long projectId, ProjectEmailAddress projectEmailAddress) throws ApiException {
        ApiResponse<Object> localVarResp = updateProjectEmailWithHttpInfo(projectId, projectEmailAddress);
        return localVarResp.getData();
    }

    /**
     * Set project&#39;s sender email
     * Sets the [project&#39;s sender email address](https://confluence.atlassian.com/x/dolKLg).  If &#x60;emailAddress&#x60; is an empty string, the default email address is restored.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * @param projectId The project ID. (required)
     * @param projectEmailAddress The project&#39;s sender email address to be set. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the project&#39;s sender email address is successfully set. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid, if the email address is not valid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have permission to administer the project. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> updateProjectEmailWithHttpInfo(Long projectId, ProjectEmailAddress projectEmailAddress) throws ApiException {
        okhttp3.Call localVarCall = updateProjectEmailValidateBeforeCall(projectId, projectEmailAddress, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Set project&#39;s sender email (asynchronously)
     * Sets the [project&#39;s sender email address](https://confluence.atlassian.com/x/dolKLg).  If &#x60;emailAddress&#x60; is an empty string, the default email address is restored.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * @param projectId The project ID. (required)
     * @param projectEmailAddress The project&#39;s sender email address to be set. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the project&#39;s sender email address is successfully set. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid, if the email address is not valid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have permission to administer the project. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProjectEmailAsync(Long projectId, ProjectEmailAddress projectEmailAddress, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProjectEmailValidateBeforeCall(projectId, projectEmailAddress, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
