package io.github.kvr.mcp;

import io.quarkus.logging.Log;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import java.io.IOException;


/**
 * LoggingInterceptor is a custom interceptor that logs the request and response of an HTTP call.
 * It is used to debug the HTTP calls made by the MCP server.
 */
public class LoggingInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        // Log request
        long requestStartTime = System.currentTimeMillis();
        Log.info("REQUEST: " + request.method() + " " + request.url());
        Log.info("HEADERS: " + request.headers());
        if (request.body() != null) {
            Buffer requestBuffer = new Buffer();
            request.body().writeTo(requestBuffer);
            Log.info("BODY: " + requestBuffer.readUtf8());
        }

        // Execute request
        Response response = chain.proceed(request);

        // Log response
        long requestEndTime = System.currentTimeMillis();
        long duration = requestEndTime - requestStartTime;

        ResponseBody responseBody = response.body();
        String responseBodyString = responseBody.string();

        Log.info("RESPONSE: " + response.code() + " " + response.message() + " (" + duration + "ms)");
        Log.info("HEADERS: " + response.headers());
        Log.info("BODY: " + responseBodyString);

        // You need to rebuild the response with the body you already consumed
        return response.newBuilder()
                .body(ResponseBody.create(responseBody.contentType(), responseBodyString))
                .build();
    }
}
