/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT-1461af1efd5cc75bf21cb8256a8b42f9bd4278be
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.atlassian.jira.platform.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * An associated workflow scheme and project.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class WorkflowSchemeProjectAssociation {
  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  @javax.annotation.Nonnull
  private String projectId;

  public static final String SERIALIZED_NAME_WORKFLOW_SCHEME_ID = "workflowSchemeId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_SCHEME_ID)
  @javax.annotation.Nullable
  private String workflowSchemeId;

  public WorkflowSchemeProjectAssociation() {
  }

  public WorkflowSchemeProjectAssociation projectId(@javax.annotation.Nonnull String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project.
   * @return projectId
   */
  @javax.annotation.Nonnull
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(@javax.annotation.Nonnull String projectId) {
    this.projectId = projectId;
  }


  public WorkflowSchemeProjectAssociation workflowSchemeId(@javax.annotation.Nullable String workflowSchemeId) {
    this.workflowSchemeId = workflowSchemeId;
    return this;
  }

  /**
   * The ID of the workflow scheme. If the workflow scheme ID is &#x60;null&#x60;, the operation assigns the default workflow scheme.
   * @return workflowSchemeId
   */
  @javax.annotation.Nullable
  public String getWorkflowSchemeId() {
    return workflowSchemeId;
  }

  public void setWorkflowSchemeId(@javax.annotation.Nullable String workflowSchemeId) {
    this.workflowSchemeId = workflowSchemeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSchemeProjectAssociation workflowSchemeProjectAssociation = (WorkflowSchemeProjectAssociation) o;
    return Objects.equals(this.projectId, workflowSchemeProjectAssociation.projectId) &&
        Objects.equals(this.workflowSchemeId, workflowSchemeProjectAssociation.workflowSchemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, workflowSchemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSchemeProjectAssociation {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    workflowSchemeId: ").append(toIndentedString(workflowSchemeId)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("workflowSchemeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("projectId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkflowSchemeProjectAssociation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkflowSchemeProjectAssociation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowSchemeProjectAssociation is not found in the empty JSON string", WorkflowSchemeProjectAssociation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkflowSchemeProjectAssociation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkflowSchemeProjectAssociation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkflowSchemeProjectAssociation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("workflowSchemeId") != null && !jsonObj.get("workflowSchemeId").isJsonNull()) && !jsonObj.get("workflowSchemeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowSchemeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowSchemeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowSchemeProjectAssociation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowSchemeProjectAssociation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowSchemeProjectAssociation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowSchemeProjectAssociation.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowSchemeProjectAssociation>() {
           @Override
           public void write(JsonWriter out, WorkflowSchemeProjectAssociation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowSchemeProjectAssociation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkflowSchemeProjectAssociation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkflowSchemeProjectAssociation
   * @throws IOException if the JSON string is invalid with respect to WorkflowSchemeProjectAssociation
   */
  public static WorkflowSchemeProjectAssociation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowSchemeProjectAssociation.class);
  }

  /**
   * Convert an instance of WorkflowSchemeProjectAssociation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

