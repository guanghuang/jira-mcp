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
        apiClient.setBasePath(request.getHeader("x-atlassian-url"));

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) apiClient.getAuthentication("basicAuth");
        basicAuth.setUsername(request.getHeader("x-atlassian-username"));
        basicAuth.setPassword(request.getHeader("x-atlassian-pat"));

        return apiClient;
    }
}
