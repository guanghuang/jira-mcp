/*
 * Jira Software Cloud API
 * Jira Software Cloud REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.atlassian.jira.software.api;

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


import com.atlassian.jira.software.model.MoveIssuesToBacklogForBoard207Response;
import com.atlassian.jira.software.model.MoveIssuesToBacklogForBoardRequest;
import com.atlassian.jira.software.model.MoveIssuesToBacklogRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BacklogApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BacklogApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BacklogApi(ApiClient apiClient) {
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
     * Build call for moveIssuesToBacklog
     * @param moveIssuesToBacklogRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response is returned if operation was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the user is not logged in. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if user does not a have valid license or does not have permission to assign issues. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if sprint does not exist or the user cannot view it. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call moveIssuesToBacklogCall(MoveIssuesToBacklogRequest moveIssuesToBacklogRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = moveIssuesToBacklogRequest;

        // create path and map variables
        String localVarPath = "/rest/agile/1.0/backlog/issue";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
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
    private okhttp3.Call moveIssuesToBacklogValidateBeforeCall(MoveIssuesToBacklogRequest moveIssuesToBacklogRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'moveIssuesToBacklogRequest' is set
        if (moveIssuesToBacklogRequest == null) {
            throw new ApiException("Missing the required parameter 'moveIssuesToBacklogRequest' when calling moveIssuesToBacklog(Async)");
        }

        return moveIssuesToBacklogCall(moveIssuesToBacklogRequest, _callback);

    }

    /**
     * Move issues to backlog
     * Move issues to the backlog.   This operation is equivalent to remove future and active sprints from a given set of issues. At most 50 issues may be moved at once.
     * @param moveIssuesToBacklogRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response is returned if operation was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the user is not logged in. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if user does not a have valid license or does not have permission to assign issues. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if sprint does not exist or the user cannot view it. </td><td>  -  </td></tr>
     </table>
     */
    public void moveIssuesToBacklog(MoveIssuesToBacklogRequest moveIssuesToBacklogRequest) throws ApiException {
        moveIssuesToBacklogWithHttpInfo(moveIssuesToBacklogRequest);
    }

    /**
     * Move issues to backlog
     * Move issues to the backlog.   This operation is equivalent to remove future and active sprints from a given set of issues. At most 50 issues may be moved at once.
     * @param moveIssuesToBacklogRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response is returned if operation was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the user is not logged in. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if user does not a have valid license or does not have permission to assign issues. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if sprint does not exist or the user cannot view it. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> moveIssuesToBacklogWithHttpInfo(MoveIssuesToBacklogRequest moveIssuesToBacklogRequest) throws ApiException {
        okhttp3.Call localVarCall = moveIssuesToBacklogValidateBeforeCall(moveIssuesToBacklogRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Move issues to backlog (asynchronously)
     * Move issues to the backlog.   This operation is equivalent to remove future and active sprints from a given set of issues. At most 50 issues may be moved at once.
     * @param moveIssuesToBacklogRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response is returned if operation was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the user is not logged in. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if user does not a have valid license or does not have permission to assign issues. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if sprint does not exist or the user cannot view it. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call moveIssuesToBacklogAsync(MoveIssuesToBacklogRequest moveIssuesToBacklogRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = moveIssuesToBacklogValidateBeforeCall(moveIssuesToBacklogRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for moveIssuesToBacklogForBoard
     * @param boardId  (required)
     * @param moveIssuesToBacklogForBoardRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response is returned if operation was successful. </td><td>  -  </td></tr>
        <tr><td> 207 </td><td> Returns the list of issue with status of rank operation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the user is not logged in. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if user does not a have valid license or does not have permission to assign issues. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if sprint does not exist or the user cannot view it. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call moveIssuesToBacklogForBoardCall(Long boardId, MoveIssuesToBacklogForBoardRequest moveIssuesToBacklogForBoardRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = moveIssuesToBacklogForBoardRequest;

        // create path and map variables
        String localVarPath = "/rest/agile/1.0/backlog/{boardId}/issue"
            .replace("{" + "boardId" + "}", localVarApiClient.escapeString(boardId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call moveIssuesToBacklogForBoardValidateBeforeCall(Long boardId, MoveIssuesToBacklogForBoardRequest moveIssuesToBacklogForBoardRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'boardId' is set
        if (boardId == null) {
            throw new ApiException("Missing the required parameter 'boardId' when calling moveIssuesToBacklogForBoard(Async)");
        }

        // verify the required parameter 'moveIssuesToBacklogForBoardRequest' is set
        if (moveIssuesToBacklogForBoardRequest == null) {
            throw new ApiException("Missing the required parameter 'moveIssuesToBacklogForBoardRequest' when calling moveIssuesToBacklogForBoard(Async)");
        }

        return moveIssuesToBacklogForBoardCall(boardId, moveIssuesToBacklogForBoardRequest, _callback);

    }

    /**
     * Move issues to backlog for board
     * Move issues to the backlog of a particular board (if they are already on that board).   This operation is equivalent to remove future and active sprints from a given set of issues if the board has sprints If the board does not have sprints this will put the issues back into the backlog from the board. At most 50 issues may be moved at once.
     * @param boardId  (required)
     * @param moveIssuesToBacklogForBoardRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response is returned if operation was successful. </td><td>  -  </td></tr>
        <tr><td> 207 </td><td> Returns the list of issue with status of rank operation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the user is not logged in. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if user does not a have valid license or does not have permission to assign issues. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if sprint does not exist or the user cannot view it. </td><td>  -  </td></tr>
     </table>
     */
    public void moveIssuesToBacklogForBoard(Long boardId, MoveIssuesToBacklogForBoardRequest moveIssuesToBacklogForBoardRequest) throws ApiException {
        moveIssuesToBacklogForBoardWithHttpInfo(boardId, moveIssuesToBacklogForBoardRequest);
    }

    /**
     * Move issues to backlog for board
     * Move issues to the backlog of a particular board (if they are already on that board).   This operation is equivalent to remove future and active sprints from a given set of issues if the board has sprints If the board does not have sprints this will put the issues back into the backlog from the board. At most 50 issues may be moved at once.
     * @param boardId  (required)
     * @param moveIssuesToBacklogForBoardRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response is returned if operation was successful. </td><td>  -  </td></tr>
        <tr><td> 207 </td><td> Returns the list of issue with status of rank operation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the user is not logged in. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if user does not a have valid license or does not have permission to assign issues. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if sprint does not exist or the user cannot view it. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> moveIssuesToBacklogForBoardWithHttpInfo(Long boardId, MoveIssuesToBacklogForBoardRequest moveIssuesToBacklogForBoardRequest) throws ApiException {
        okhttp3.Call localVarCall = moveIssuesToBacklogForBoardValidateBeforeCall(boardId, moveIssuesToBacklogForBoardRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Move issues to backlog for board (asynchronously)
     * Move issues to the backlog of a particular board (if they are already on that board).   This operation is equivalent to remove future and active sprints from a given set of issues if the board has sprints If the board does not have sprints this will put the issues back into the backlog from the board. At most 50 issues may be moved at once.
     * @param boardId  (required)
     * @param moveIssuesToBacklogForBoardRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response is returned if operation was successful. </td><td>  -  </td></tr>
        <tr><td> 207 </td><td> Returns the list of issue with status of rank operation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the user is not logged in. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if user does not a have valid license or does not have permission to assign issues. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if sprint does not exist or the user cannot view it. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call moveIssuesToBacklogForBoardAsync(Long boardId, MoveIssuesToBacklogForBoardRequest moveIssuesToBacklogForBoardRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = moveIssuesToBacklogForBoardValidateBeforeCall(boardId, moveIssuesToBacklogForBoardRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
