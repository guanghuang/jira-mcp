package io.github.kvr.mcp;

import io.vertx.core.http.HttpServerRequest;
import org.eclipse.microprofile.config.ConfigProvider;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class HttpHeaderParameterHelper {
    /**
     * Get the value of a header parameter from the request.
     *
     * @param request The HTTP request.
     * @param headerNames The names of the header parameter.
     * @param configParameterNames The names of the configuration parameters to fall back on if the header is not present.
     * @return The values of the header parameter.
     */
    public static String[] getHeaderParameters(HttpServerRequest request, String[] headerNames, String[] configParameterNames) {
        if (request.getHeader("x-config") != null) {
            String[] configValues = request.getHeader("x-config").split("\\.");
            String[] result = new String[headerNames.length];

            // Copy values from configValues, up to the minimum length of both arrays
            for (int i = 0; i < Math.min(configValues.length, headerNames.length); i++) {
                result[i] = new String(Base64.getDecoder().decode(configValues[i]), StandardCharsets.UTF_8);
            }
            // The remaining elements in result will be null by default
            return result;
        }

        String[] result = new String[headerNames.length];
        for (int i = 0; i < headerNames.length; i++) {
            // First try to get the value from the header
            String headerValue = request.getHeader(headerNames[i]);

            // If not found in header, try to get it from configuration
            if (headerValue == null) {
                headerValue = getFromConfig(configParameterNames[i]);
            }

            result[i] = headerValue;
        }
        return result;
    }

    /**
     * Get a parameter value from the configuration.
     *
     * @param name The name of the parameter.
     * @return The value of the parameter or null if not found.
     */
    private static String getFromConfig(String name) {
        try {
            // Try to get the value from configuration using "mcp.param." prefix
            return ConfigProvider.getConfig()
                    .getOptionalValue(name, String.class)
                    .orElse(null);
        } catch (Exception e) {
            // Log error if needed and return null
            return null;
        }
    }

    /**
     * Encode an array of values to Base64 and concatenate them with dots.
     *
     * @param values The array of values to encode.
     * @return The Base64-encoded values concatenated with dots.
     */
    public static String encodeBase64Values(String[] values) {
        if (values == null || values.length == 0) {
            return "";
        }

        return Arrays.stream(values)
                .map(value -> value != null ? Base64.getEncoder().encodeToString(value.getBytes()) : "")
                .collect(java.util.stream.Collectors.joining("."));
    }
}
