package io.github.kvr.mcp;

import io.vertx.core.http.HttpServerRequest;

import java.util.Arrays;
import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class HttpHeaderParameterHelper {
    /**
     * Get the value of a header parameter from the request.
     *
     * @param request The HTTP request.
     * @param headerNames The names of the header parameter.
     * @return The values of the header parameter.
     */
    public static String[] getHeaderParameters(HttpServerRequest request, String[] headerNames) {
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

        return Arrays.stream(headerNames).map(request::getHeader)
                .toArray(String[]::new);
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
