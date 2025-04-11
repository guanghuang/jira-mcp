package io.github.kvr.mcp;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * A helper class for the MCP.
 */
public class Helper {
    /**
     * Convert a JSON string to a Map.
     * @param jsonString The JSON string to convert.
     * @return The Map.
     */
    public static Map<String, Object> getMapFromJsonString(String jsonString) {
        if (jsonString == null || jsonString.isEmpty()) {
            return null;
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Map<String, Object>>(){}.getType();
        return gson.fromJson(jsonString, type);
    }

    /**
     * Build a multipart header for a list of MultipartFile.
     * @param mpBuilder The MultipartBody.Builder.
     * @param files The list of MultipartFile.
     */
    public static void buildMultipartHeader(MultipartBody.Builder mpBuilder, List<MultipartFile> files) {
        if (files == null || files.isEmpty()) {
            return;
        }
        for (MultipartFile file : files) {
            mpBuilder.addPart(
                Headers.of("Content-Disposition", "form-data; name=\"" + file.getName() + "\"; filename=\"" + file.getOriginalFilename() + "\""),
                RequestBody.create(file.getDecodedContent(), MediaType.parse(file.getContentType()))
            );
        }
    }
}
