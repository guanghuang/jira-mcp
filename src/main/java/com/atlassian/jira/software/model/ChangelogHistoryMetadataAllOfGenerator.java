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
import java.util.Arrays;
import java.util.Map;

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
 * Details of the system that generated the history record.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-05T13:52:26.392070-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class ChangelogHistoryMetadataAllOfGenerator {
  public static final String SERIALIZED_NAME_AVATAR_URL = "avatarUrl";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  @javax.annotation.Nullable
  private String avatarUrl;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  @javax.annotation.Nullable
  private String displayName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME_KEY = "displayNameKey";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_KEY)
  @javax.annotation.Nullable
  private String displayNameKey;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public ChangelogHistoryMetadataAllOfGenerator() {
  }

  public ChangelogHistoryMetadataAllOfGenerator avatarUrl(@javax.annotation.Nullable String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * The URL to an avatar for the user or system associated with a history record.
   * @return avatarUrl
   */
  @javax.annotation.Nullable
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(@javax.annotation.Nullable String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public ChangelogHistoryMetadataAllOfGenerator displayName(@javax.annotation.Nullable String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the user or system associated with a history record.
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(@javax.annotation.Nullable String displayName) {
    this.displayName = displayName;
  }


  public ChangelogHistoryMetadataAllOfGenerator displayNameKey(@javax.annotation.Nullable String displayNameKey) {
    this.displayNameKey = displayNameKey;
    return this;
  }

  /**
   * The key of the display name of the user or system associated with a history record.
   * @return displayNameKey
   */
  @javax.annotation.Nullable
  public String getDisplayNameKey() {
    return displayNameKey;
  }

  public void setDisplayNameKey(@javax.annotation.Nullable String displayNameKey) {
    this.displayNameKey = displayNameKey;
  }


  public ChangelogHistoryMetadataAllOfGenerator id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the user or system associated with a history record.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public ChangelogHistoryMetadataAllOfGenerator type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the user or system associated with a history record.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public ChangelogHistoryMetadataAllOfGenerator url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the user or system associated with a history record.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangelogHistoryMetadataAllOfGenerator changelogHistoryMetadataAllOfGenerator = (ChangelogHistoryMetadataAllOfGenerator) o;
    return Objects.equals(this.avatarUrl, changelogHistoryMetadataAllOfGenerator.avatarUrl) &&
        Objects.equals(this.displayName, changelogHistoryMetadataAllOfGenerator.displayName) &&
        Objects.equals(this.displayNameKey, changelogHistoryMetadataAllOfGenerator.displayNameKey) &&
        Objects.equals(this.id, changelogHistoryMetadataAllOfGenerator.id) &&
        Objects.equals(this.type, changelogHistoryMetadataAllOfGenerator.type) &&
        Objects.equals(this.url, changelogHistoryMetadataAllOfGenerator.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, displayName, displayNameKey, id, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangelogHistoryMetadataAllOfGenerator {\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayNameKey: ").append(toIndentedString(displayNameKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("avatarUrl");
    openapiFields.add("displayName");
    openapiFields.add("displayNameKey");
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ChangelogHistoryMetadataAllOfGenerator
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChangelogHistoryMetadataAllOfGenerator.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangelogHistoryMetadataAllOfGenerator is not found in the empty JSON string", ChangelogHistoryMetadataAllOfGenerator.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChangelogHistoryMetadataAllOfGenerator.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangelogHistoryMetadataAllOfGenerator` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("avatarUrl") != null && !jsonObj.get("avatarUrl").isJsonNull()) && !jsonObj.get("avatarUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarUrl").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("displayNameKey") != null && !jsonObj.get("displayNameKey").isJsonNull()) && !jsonObj.get("displayNameKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayNameKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayNameKey").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangelogHistoryMetadataAllOfGenerator.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangelogHistoryMetadataAllOfGenerator' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangelogHistoryMetadataAllOfGenerator> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangelogHistoryMetadataAllOfGenerator.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangelogHistoryMetadataAllOfGenerator>() {
           @Override
           public void write(JsonWriter out, ChangelogHistoryMetadataAllOfGenerator value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangelogHistoryMetadataAllOfGenerator read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ChangelogHistoryMetadataAllOfGenerator given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ChangelogHistoryMetadataAllOfGenerator
   * @throws IOException if the JSON string is invalid with respect to ChangelogHistoryMetadataAllOfGenerator
   */
  public static ChangelogHistoryMetadataAllOfGenerator fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangelogHistoryMetadataAllOfGenerator.class);
  }

  /**
   * Convert an instance of ChangelogHistoryMetadataAllOfGenerator to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

