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
 * NotificationSchemeAndProjectMappingJsonBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class NotificationSchemeAndProjectMappingJsonBean {
  public static final String SERIALIZED_NAME_NOTIFICATION_SCHEME_ID = "notificationSchemeId";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_SCHEME_ID)
  @javax.annotation.Nullable
  private String notificationSchemeId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  @javax.annotation.Nullable
  private String projectId;

  public NotificationSchemeAndProjectMappingJsonBean() {
  }

  public NotificationSchemeAndProjectMappingJsonBean notificationSchemeId(@javax.annotation.Nullable String notificationSchemeId) {
    this.notificationSchemeId = notificationSchemeId;
    return this;
  }

  /**
   * Get notificationSchemeId
   * @return notificationSchemeId
   */
  @javax.annotation.Nullable
  public String getNotificationSchemeId() {
    return notificationSchemeId;
  }

  public void setNotificationSchemeId(@javax.annotation.Nullable String notificationSchemeId) {
    this.notificationSchemeId = notificationSchemeId;
  }


  public NotificationSchemeAndProjectMappingJsonBean projectId(@javax.annotation.Nullable String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   */
  @javax.annotation.Nullable
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(@javax.annotation.Nullable String projectId) {
    this.projectId = projectId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSchemeAndProjectMappingJsonBean notificationSchemeAndProjectMappingJsonBean = (NotificationSchemeAndProjectMappingJsonBean) o;
    return Objects.equals(this.notificationSchemeId, notificationSchemeAndProjectMappingJsonBean.notificationSchemeId) &&
        Objects.equals(this.projectId, notificationSchemeAndProjectMappingJsonBean.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationSchemeId, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSchemeAndProjectMappingJsonBean {\n");
    sb.append("    notificationSchemeId: ").append(toIndentedString(notificationSchemeId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
    openapiFields.add("notificationSchemeId");
    openapiFields.add("projectId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NotificationSchemeAndProjectMappingJsonBean
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NotificationSchemeAndProjectMappingJsonBean.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationSchemeAndProjectMappingJsonBean is not found in the empty JSON string", NotificationSchemeAndProjectMappingJsonBean.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NotificationSchemeAndProjectMappingJsonBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotificationSchemeAndProjectMappingJsonBean` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("notificationSchemeId") != null && !jsonObj.get("notificationSchemeId").isJsonNull()) && !jsonObj.get("notificationSchemeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notificationSchemeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notificationSchemeId").toString()));
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationSchemeAndProjectMappingJsonBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationSchemeAndProjectMappingJsonBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationSchemeAndProjectMappingJsonBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationSchemeAndProjectMappingJsonBean.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationSchemeAndProjectMappingJsonBean>() {
           @Override
           public void write(JsonWriter out, NotificationSchemeAndProjectMappingJsonBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationSchemeAndProjectMappingJsonBean read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NotificationSchemeAndProjectMappingJsonBean given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NotificationSchemeAndProjectMappingJsonBean
   * @throws IOException if the JSON string is invalid with respect to NotificationSchemeAndProjectMappingJsonBean
   */
  public static NotificationSchemeAndProjectMappingJsonBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationSchemeAndProjectMappingJsonBean.class);
  }

  /**
   * Convert an instance of NotificationSchemeAndProjectMappingJsonBean to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

