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


import com.atlassian.jira.platform.model.JqlFunctionPrecomputationGetByIdRequest;
import com.atlassian.jira.platform.model.JqlFunctionPrecomputationGetByIdResponse;
import com.atlassian.jira.platform.model.JqlFunctionPrecomputationUpdateErrorResponse;
import com.atlassian.jira.platform.model.JqlFunctionPrecomputationUpdateRequestBean;
import com.atlassian.jira.platform.model.JqlFunctionPrecomputationUpdateResponse;
import com.atlassian.jira.platform.model.PageBean2JqlFunctionPrecomputationBean;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JqlFunctionsAppsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public JqlFunctionsAppsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JqlFunctionsAppsApi(ApiClient apiClient) {
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
     * Build call for getPrecomputations
     * @param functionKey The function key in format:   *  Forge: &#x60;ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]&#x60;  *  Connect: &#x60;[App key]__[Module key]&#x60; (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPrecomputationsCall(List<String> functionKey, Long startAt, Integer maxResults, String orderBy, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/3/jql/function/computation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (functionKey != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "functionKey", functionKey));
        }

        if (startAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startAt", startAt));
        }

        if (maxResults != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxResults", maxResults));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderBy", orderBy));
        }

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
    private okhttp3.Call getPrecomputationsValidateBeforeCall(List<String> functionKey, Long startAt, Integer maxResults, String orderBy, final ApiCallback _callback) throws ApiException {
        return getPrecomputationsCall(functionKey, startAt, maxResults, orderBy, _callback);

    }

    /**
     * Get precomputations (apps)
     * Returns the list of a function&#39;s precomputations along with information about when they were created, updated, and last used. Each precomputation has a &#x60;value&#x60; \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.  The new &#x60;read:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param functionKey The function key in format:   *  Forge: &#x60;ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]&#x60;  *  Connect: &#x60;[App key]__[Module key]&#x60; (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. (optional)
     * @return PageBean2JqlFunctionPrecomputationBean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public PageBean2JqlFunctionPrecomputationBean getPrecomputations(List<String> functionKey, Long startAt, Integer maxResults, String orderBy) throws ApiException {
        ApiResponse<PageBean2JqlFunctionPrecomputationBean> localVarResp = getPrecomputationsWithHttpInfo(functionKey, startAt, maxResults, orderBy);
        return localVarResp.getData();
    }

    /**
     * Get precomputations (apps)
     * Returns the list of a function&#39;s precomputations along with information about when they were created, updated, and last used. Each precomputation has a &#x60;value&#x60; \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.  The new &#x60;read:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param functionKey The function key in format:   *  Forge: &#x60;ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]&#x60;  *  Connect: &#x60;[App key]__[Module key]&#x60; (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. (optional)
     * @return ApiResponse&lt;PageBean2JqlFunctionPrecomputationBean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PageBean2JqlFunctionPrecomputationBean> getPrecomputationsWithHttpInfo(List<String> functionKey, Long startAt, Integer maxResults, String orderBy) throws ApiException {
        okhttp3.Call localVarCall = getPrecomputationsValidateBeforeCall(functionKey, startAt, maxResults, orderBy, null);
        Type localVarReturnType = new TypeToken<PageBean2JqlFunctionPrecomputationBean>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get precomputations (apps) (asynchronously)
     * Returns the list of a function&#39;s precomputations along with information about when they were created, updated, and last used. Each precomputation has a &#x60;value&#x60; \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.  The new &#x60;read:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param functionKey The function key in format:   *  Forge: &#x60;ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]&#x60;  *  Connect: &#x60;[App key]__[Module key]&#x60; (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPrecomputationsAsync(List<String> functionKey, Long startAt, Integer maxResults, String orderBy, final ApiCallback<PageBean2JqlFunctionPrecomputationBean> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPrecomputationsValidateBeforeCall(functionKey, startAt, maxResults, orderBy, _callback);
        Type localVarReturnType = new TypeToken<PageBean2JqlFunctionPrecomputationBean>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPrecomputationsByID
     * @param jqlFunctionPrecomputationGetByIdRequest  (required)
     * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPrecomputationsByIDCall(JqlFunctionPrecomputationGetByIdRequest jqlFunctionPrecomputationGetByIdRequest, String orderBy, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = jqlFunctionPrecomputationGetByIdRequest;

        // create path and map variables
        String localVarPath = "/rest/api/3/jql/function/computation/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderBy", orderBy));
        }

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPrecomputationsByIDValidateBeforeCall(JqlFunctionPrecomputationGetByIdRequest jqlFunctionPrecomputationGetByIdRequest, String orderBy, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'jqlFunctionPrecomputationGetByIdRequest' is set
        if (jqlFunctionPrecomputationGetByIdRequest == null) {
            throw new ApiException("Missing the required parameter 'jqlFunctionPrecomputationGetByIdRequest' when calling getPrecomputationsByID(Async)");
        }

        return getPrecomputationsByIDCall(jqlFunctionPrecomputationGetByIdRequest, orderBy, _callback);

    }

    /**
     * Get precomputations by ID (apps)
     * Returns function precomputations by IDs, along with information about when they were created, updated, and last used. Each precomputation has a &#x60;value&#x60; \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.  The new &#x60;read:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param jqlFunctionPrecomputationGetByIdRequest  (required)
     * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. (optional)
     * @return JqlFunctionPrecomputationGetByIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public JqlFunctionPrecomputationGetByIdResponse getPrecomputationsByID(JqlFunctionPrecomputationGetByIdRequest jqlFunctionPrecomputationGetByIdRequest, String orderBy) throws ApiException {
        ApiResponse<JqlFunctionPrecomputationGetByIdResponse> localVarResp = getPrecomputationsByIDWithHttpInfo(jqlFunctionPrecomputationGetByIdRequest, orderBy);
        return localVarResp.getData();
    }

    /**
     * Get precomputations by ID (apps)
     * Returns function precomputations by IDs, along with information about when they were created, updated, and last used. Each precomputation has a &#x60;value&#x60; \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.  The new &#x60;read:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param jqlFunctionPrecomputationGetByIdRequest  (required)
     * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. (optional)
     * @return ApiResponse&lt;JqlFunctionPrecomputationGetByIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<JqlFunctionPrecomputationGetByIdResponse> getPrecomputationsByIDWithHttpInfo(JqlFunctionPrecomputationGetByIdRequest jqlFunctionPrecomputationGetByIdRequest, String orderBy) throws ApiException {
        okhttp3.Call localVarCall = getPrecomputationsByIDValidateBeforeCall(jqlFunctionPrecomputationGetByIdRequest, orderBy, null);
        Type localVarReturnType = new TypeToken<JqlFunctionPrecomputationGetByIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get precomputations by ID (apps) (asynchronously)
     * Returns function precomputations by IDs, along with information about when they were created, updated, and last used. Each precomputation has a &#x60;value&#x60; \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.  The new &#x60;read:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param jqlFunctionPrecomputationGetByIdRequest  (required)
     * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPrecomputationsByIDAsync(JqlFunctionPrecomputationGetByIdRequest jqlFunctionPrecomputationGetByIdRequest, String orderBy, final ApiCallback<JqlFunctionPrecomputationGetByIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPrecomputationsByIDValidateBeforeCall(jqlFunctionPrecomputationGetByIdRequest, orderBy, _callback);
        Type localVarReturnType = new TypeToken<JqlFunctionPrecomputationGetByIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updatePrecomputations
     * @param jqlFunctionPrecomputationUpdateRequestBean  (required)
     * @param skipNotFoundPrecomputations  (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 response </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePrecomputationsCall(JqlFunctionPrecomputationUpdateRequestBean jqlFunctionPrecomputationUpdateRequestBean, Boolean skipNotFoundPrecomputations, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = jqlFunctionPrecomputationUpdateRequestBean;

        // create path and map variables
        String localVarPath = "/rest/api/3/jql/function/computation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (skipNotFoundPrecomputations != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("skipNotFoundPrecomputations", skipNotFoundPrecomputations));
        }

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updatePrecomputationsValidateBeforeCall(JqlFunctionPrecomputationUpdateRequestBean jqlFunctionPrecomputationUpdateRequestBean, Boolean skipNotFoundPrecomputations, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'jqlFunctionPrecomputationUpdateRequestBean' is set
        if (jqlFunctionPrecomputationUpdateRequestBean == null) {
            throw new ApiException("Missing the required parameter 'jqlFunctionPrecomputationUpdateRequestBean' when calling updatePrecomputations(Async)");
        }

        return updatePrecomputationsCall(jqlFunctionPrecomputationUpdateRequestBean, skipNotFoundPrecomputations, _callback);

    }

    /**
     * Update precomputations (apps)
     * Update the precomputation value of a function created by a Forge/Connect app.  **[Permissions](#permissions) required:** An API for apps to update their own precomputations.  The new &#x60;write:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param jqlFunctionPrecomputationUpdateRequestBean  (required)
     * @param skipNotFoundPrecomputations  (optional, default to false)
     * @return JqlFunctionPrecomputationUpdateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 response </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public JqlFunctionPrecomputationUpdateResponse updatePrecomputations(JqlFunctionPrecomputationUpdateRequestBean jqlFunctionPrecomputationUpdateRequestBean, Boolean skipNotFoundPrecomputations) throws ApiException {
        ApiResponse<JqlFunctionPrecomputationUpdateResponse> localVarResp = updatePrecomputationsWithHttpInfo(jqlFunctionPrecomputationUpdateRequestBean, skipNotFoundPrecomputations);
        return localVarResp.getData();
    }

    /**
     * Update precomputations (apps)
     * Update the precomputation value of a function created by a Forge/Connect app.  **[Permissions](#permissions) required:** An API for apps to update their own precomputations.  The new &#x60;write:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param jqlFunctionPrecomputationUpdateRequestBean  (required)
     * @param skipNotFoundPrecomputations  (optional, default to false)
     * @return ApiResponse&lt;JqlFunctionPrecomputationUpdateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 response </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<JqlFunctionPrecomputationUpdateResponse> updatePrecomputationsWithHttpInfo(JqlFunctionPrecomputationUpdateRequestBean jqlFunctionPrecomputationUpdateRequestBean, Boolean skipNotFoundPrecomputations) throws ApiException {
        okhttp3.Call localVarCall = updatePrecomputationsValidateBeforeCall(jqlFunctionPrecomputationUpdateRequestBean, skipNotFoundPrecomputations, null);
        Type localVarReturnType = new TypeToken<JqlFunctionPrecomputationUpdateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update precomputations (apps) (asynchronously)
     * Update the precomputation value of a function created by a Forge/Connect app.  **[Permissions](#permissions) required:** An API for apps to update their own precomputations.  The new &#x60;write:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param jqlFunctionPrecomputationUpdateRequestBean  (required)
     * @param skipNotFoundPrecomputations  (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 response </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePrecomputationsAsync(JqlFunctionPrecomputationUpdateRequestBean jqlFunctionPrecomputationUpdateRequestBean, Boolean skipNotFoundPrecomputations, final ApiCallback<JqlFunctionPrecomputationUpdateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePrecomputationsValidateBeforeCall(jqlFunctionPrecomputationUpdateRequestBean, skipNotFoundPrecomputations, _callback);
        Type localVarReturnType = new TypeToken<JqlFunctionPrecomputationUpdateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
