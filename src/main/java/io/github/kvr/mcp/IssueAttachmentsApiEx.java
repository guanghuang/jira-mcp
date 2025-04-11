package io.github.kvr.mcp;

import com.atlassian.jira.invoker.*;
import com.atlassian.jira.platform.api.IssueAttachmentsApi;
import com.atlassian.jira.platform.model.Attachment;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A wrapper around the IssueAttachmentsApi to add support for multipart/form-data.
 */
public class IssueAttachmentsApiEx extends IssueAttachmentsApi {
    public IssueAttachmentsApiEx(ApiClient apiClient) {
        super(apiClient);
    }

    public List<Attachment> addAttachments(String issueIdOrKey, List<MultipartFile> files) throws ApiException {
        ApiResponse<List<Attachment>> localVarResp = addAttachmentExWithHttpInfo(issueIdOrKey, files);
        return localVarResp.getData();
    }

    private ApiResponse<List<Attachment>> addAttachmentExWithHttpInfo(String issueIdOrKey, List<MultipartFile> files) throws ApiException {
        okhttp3.Call localVarCall = addAttachmentExValidateBeforeCall(issueIdOrKey, files, null);
        Type localVarReturnType = new TypeToken<List<Attachment>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call addAttachmentExValidateBeforeCall(String issueIdOrKey, List<MultipartFile> files, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new ApiException("Missing the required parameter 'issueIdOrKey' when calling addAttachment(Async)");
        }

        return addAttachmentExCall(issueIdOrKey, files, _callback);
    }

    public okhttp3.Call addAttachmentExCall(String issueIdOrKey, List<MultipartFile> files, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/attachments"
                .replace("{" + "issueIdOrKey" + "}", localVarApiClient.escapeString(issueIdOrKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (files != null) {
            // the attachment name must be `file` for attachments
            for (MultipartFile file : files) {
                file.setName("file");
            }
            localVarFormParams.put("files", files);
        }
        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        // must add for add attachments
        localVarHeaderParams.put("X-Atlassian-Token", "no-check");
        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

}
