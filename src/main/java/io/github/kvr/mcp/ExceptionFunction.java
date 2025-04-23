package io.github.kvr.mcp;

import com.atlassian.jira.invoker.ApiException;
import io.quarkiverse.mcp.server.ToolCallException;


@FunctionalInterface
public interface ExceptionFunction<T> {
    T execute() throws ApiException;

    static <T> T DoInException(ExceptionFunction<T> f) {
        return DoInException(f, "tool");
    }

    static <T> T DoInException(ExceptionFunction<T> f, String toolInfo) {
        try {
            return EmptyValueCleaner.removeEmptyValues(f.execute());
        } catch (ApiException e) {
            throw new ToolCallException("Failed to call " + toolInfo + ": " + e.getMessage()
                    + "\n status code:" + e.getCode(), e);
        }
    }
}
