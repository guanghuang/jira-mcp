package io.github.kvr.mcp;

import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.auth.HttpBasicAuth;

import io.vertx.core.http.HttpServerRequest;

/**
 * Jira MCP Application
 */
public class JiraMCPApplication {
    public static ApiClient getApiClient(HttpServerRequest request) {
        ApiClient apiClient = new ApiClient();
        var parameters = HttpHeaderParameterHelper.getHeaderParameters(request, new String[]{"x-atlassian-url", "x-atlassian-username", "x-atlassian-pat"},
                new String[]{"atlassian.url", "atlassian.username", "atlassian.pat"});
        apiClient.setBasePath(parameters[0]);
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) apiClient.getAuthentication("basicAuth");
        basicAuth.setUsername(parameters[1]);
        basicAuth.setPassword(parameters[2]);

        return apiClient;
    }
}
