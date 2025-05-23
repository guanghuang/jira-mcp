package io.github.kvr.mcp;

import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.auth.HttpBasicAuth;
import jakarta.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * Jira MCP Application
 */
public class JiraMCPApplication {
    @Produces
    public ApiClient getApiClient(@ConfigProperty(name = "atlassian.url") String basePath,
                                   @ConfigProperty(name = "atlassian.username") String username,
                                   @ConfigProperty(name = "atlassian.pat") String pat) {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(basePath);

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) apiClient.getAuthentication("basicAuth");
        basicAuth.setUsername(username);
        basicAuth.setPassword(pat);

        return apiClient;
    }
}
