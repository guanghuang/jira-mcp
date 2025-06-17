package io.github.kvr.mcp;

import com.atlassian.jira.invoker.ApiException;
import io.quarkiverse.mcp.server.ToolCallException;

/**
 * ExceptionFunction is a functional interface that represents a function that can throw an ApiException.
 * It is used to wrap the execution of a function in a try-catch block and throw a ToolCallException if an ApiException is thrown.
 */
@FunctionalInterface
public interface ExceptionFunction<T> {
    T execute() throws ApiException;

    /**
     * Executes the function and returns the result.
     * @param f The function to execute.
     * @return The result of the function.
     */
    static <T> T DoInException(ExceptionFunction<T> f) {
        return DoInException(f, "tool");
    }

    /**
     * Executes the function and returns the result.
     * @param f The function to execute.
     * @param toolInfo The tool information.
     * @return The result of the function.
     */
    static <T> T DoInException(ExceptionFunction<T> f, String toolInfo) {
        try {
            return EmptyValueCleaner.removeEmptyValues(f.execute());
        } catch (ApiException e) {
            throw new ToolCallException("Failed to call " + toolInfo + ": " + e.getMessage()
                    + "\n status code:" + e.getCode(), e);
        }
    }
}
