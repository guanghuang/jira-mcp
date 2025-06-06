/*
 * Jira Software Cloud API
 * Jira Software Cloud REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.atlassian.jira.software.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.atlassian.jira.invoker.JSON;

/**
 * The payload used to submit (update / insert) Security Workspace IDs.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-05T13:52:26.392070-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class SubmitSecurityWorkspacesRequest {
  public static final String SERIALIZED_NAME_WORKSPACE_IDS = "workspaceIds";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_IDS)
  @javax.annotation.Nonnull
  private List<String> workspaceIds = new ArrayList<>();

  public SubmitSecurityWorkspacesRequest() {
  }

  public SubmitSecurityWorkspacesRequest workspaceIds(@javax.annotation.Nonnull List<String> workspaceIds) {
    this.workspaceIds = workspaceIds;
    return this;
  }

  public SubmitSecurityWorkspacesRequest addWorkspaceIdsItem(String workspaceIdsItem) {
    if (this.workspaceIds == null) {
      this.workspaceIds = new ArrayList<>();
    }
    this.workspaceIds.add(workspaceIdsItem);
    return this;
  }

  /**
   * The IDs of Security Workspaces to link to this Jira site. These must follow this regex pattern: &#x60;[a-zA-Z0-9\\\\-_.~@:{}&#x3D;]+(/[a-zA-Z0-9\\\\-_.~@:{}&#x3D;]+)*&#x60; 
   * @return workspaceIds
   */
  @javax.annotation.Nonnull
  public List<String> getWorkspaceIds() {
    return workspaceIds;
  }

  public void setWorkspaceIds(@javax.annotation.Nonnull List<String> workspaceIds) {
    this.workspaceIds = workspaceIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSecurityWorkspacesRequest submitSecurityWorkspacesRequest = (SubmitSecurityWorkspacesRequest) o;
    return Objects.equals(this.workspaceIds, submitSecurityWorkspacesRequest.workspaceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSecurityWorkspacesRequest {\n");
    sb.append("    workspaceIds: ").append(toIndentedString(workspaceIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("workspaceIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("workspaceIds");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubmitSecurityWorkspacesRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubmitSecurityWorkspacesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitSecurityWorkspacesRequest is not found in the empty JSON string", SubmitSecurityWorkspacesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubmitSecurityWorkspacesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitSecurityWorkspacesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubmitSecurityWorkspacesRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("workspaceIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("workspaceIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workspaceIds` to be an array in the JSON string but got `%s`", jsonObj.get("workspaceIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitSecurityWorkspacesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitSecurityWorkspacesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitSecurityWorkspacesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitSecurityWorkspacesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitSecurityWorkspacesRequest>() {
           @Override
           public void write(JsonWriter out, SubmitSecurityWorkspacesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitSecurityWorkspacesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubmitSecurityWorkspacesRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubmitSecurityWorkspacesRequest
   * @throws IOException if the JSON string is invalid with respect to SubmitSecurityWorkspacesRequest
   */
  public static SubmitSecurityWorkspacesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitSecurityWorkspacesRequest.class);
  }

  /**
   * Convert an instance of SubmitSecurityWorkspacesRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

