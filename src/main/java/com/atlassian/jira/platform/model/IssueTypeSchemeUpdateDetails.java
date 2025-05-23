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
 * Details of the name, description, and default issue type for an issue type scheme.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class IssueTypeSchemeUpdateDetails {
  public static final String SERIALIZED_NAME_DEFAULT_ISSUE_TYPE_ID = "defaultIssueTypeId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ISSUE_TYPE_ID)
  @javax.annotation.Nullable
  private String defaultIssueTypeId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public IssueTypeSchemeUpdateDetails() {
  }

  public IssueTypeSchemeUpdateDetails defaultIssueTypeId(@javax.annotation.Nullable String defaultIssueTypeId) {
    this.defaultIssueTypeId = defaultIssueTypeId;
    return this;
  }

  /**
   * The ID of the default issue type of the issue type scheme.
   * @return defaultIssueTypeId
   */
  @javax.annotation.Nullable
  public String getDefaultIssueTypeId() {
    return defaultIssueTypeId;
  }

  public void setDefaultIssueTypeId(@javax.annotation.Nullable String defaultIssueTypeId) {
    this.defaultIssueTypeId = defaultIssueTypeId;
  }


  public IssueTypeSchemeUpdateDetails description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the issue type scheme. The maximum length is 4000 characters.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public IssueTypeSchemeUpdateDetails name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeSchemeUpdateDetails issueTypeSchemeUpdateDetails = (IssueTypeSchemeUpdateDetails) o;
    return Objects.equals(this.defaultIssueTypeId, issueTypeSchemeUpdateDetails.defaultIssueTypeId) &&
        Objects.equals(this.description, issueTypeSchemeUpdateDetails.description) &&
        Objects.equals(this.name, issueTypeSchemeUpdateDetails.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultIssueTypeId, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeUpdateDetails {\n");
    sb.append("    defaultIssueTypeId: ").append(toIndentedString(defaultIssueTypeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("defaultIssueTypeId");
    openapiFields.add("description");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IssueTypeSchemeUpdateDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IssueTypeSchemeUpdateDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueTypeSchemeUpdateDetails is not found in the empty JSON string", IssueTypeSchemeUpdateDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IssueTypeSchemeUpdateDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueTypeSchemeUpdateDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("defaultIssueTypeId") != null && !jsonObj.get("defaultIssueTypeId").isJsonNull()) && !jsonObj.get("defaultIssueTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultIssueTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultIssueTypeId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueTypeSchemeUpdateDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueTypeSchemeUpdateDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueTypeSchemeUpdateDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueTypeSchemeUpdateDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueTypeSchemeUpdateDetails>() {
           @Override
           public void write(JsonWriter out, IssueTypeSchemeUpdateDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueTypeSchemeUpdateDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IssueTypeSchemeUpdateDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssueTypeSchemeUpdateDetails
   * @throws IOException if the JSON string is invalid with respect to IssueTypeSchemeUpdateDetails
   */
  public static IssueTypeSchemeUpdateDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueTypeSchemeUpdateDetails.class);
  }

  /**
   * Convert an instance of IssueTypeSchemeUpdateDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

