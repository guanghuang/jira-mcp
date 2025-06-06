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
 * The details of a custom field context.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class CustomFieldContext {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_IS_ANY_ISSUE_TYPE = "isAnyIssueType";
  @SerializedName(SERIALIZED_NAME_IS_ANY_ISSUE_TYPE)
  @javax.annotation.Nonnull
  private Boolean isAnyIssueType;

  public static final String SERIALIZED_NAME_IS_GLOBAL_CONTEXT = "isGlobalContext";
  @SerializedName(SERIALIZED_NAME_IS_GLOBAL_CONTEXT)
  @javax.annotation.Nonnull
  private Boolean isGlobalContext;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public CustomFieldContext() {
  }

  public CustomFieldContext description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the context.
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public CustomFieldContext id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the context.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public CustomFieldContext isAnyIssueType(@javax.annotation.Nonnull Boolean isAnyIssueType) {
    this.isAnyIssueType = isAnyIssueType;
    return this;
  }

  /**
   * Whether the context apply to all issue types.
   * @return isAnyIssueType
   */
  @javax.annotation.Nonnull
  public Boolean getIsAnyIssueType() {
    return isAnyIssueType;
  }

  public void setIsAnyIssueType(@javax.annotation.Nonnull Boolean isAnyIssueType) {
    this.isAnyIssueType = isAnyIssueType;
  }


  public CustomFieldContext isGlobalContext(@javax.annotation.Nonnull Boolean isGlobalContext) {
    this.isGlobalContext = isGlobalContext;
    return this;
  }

  /**
   * Whether the context is global.
   * @return isGlobalContext
   */
  @javax.annotation.Nonnull
  public Boolean getIsGlobalContext() {
    return isGlobalContext;
  }

  public void setIsGlobalContext(@javax.annotation.Nonnull Boolean isGlobalContext) {
    this.isGlobalContext = isGlobalContext;
  }


  public CustomFieldContext name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the context.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
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
    CustomFieldContext customFieldContext = (CustomFieldContext) o;
    return Objects.equals(this.description, customFieldContext.description) &&
        Objects.equals(this.id, customFieldContext.id) &&
        Objects.equals(this.isAnyIssueType, customFieldContext.isAnyIssueType) &&
        Objects.equals(this.isGlobalContext, customFieldContext.isGlobalContext) &&
        Objects.equals(this.name, customFieldContext.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isAnyIssueType, isGlobalContext, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContext {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAnyIssueType: ").append(toIndentedString(isAnyIssueType)).append("\n");
    sb.append("    isGlobalContext: ").append(toIndentedString(isGlobalContext)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("isAnyIssueType");
    openapiFields.add("isGlobalContext");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("isAnyIssueType");
    openapiRequiredFields.add("isGlobalContext");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomFieldContext
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomFieldContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldContext is not found in the empty JSON string", CustomFieldContext.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldContext` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomFieldContext.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldContext.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldContext>() {
           @Override
           public void write(JsonWriter out, CustomFieldContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomFieldContext given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomFieldContext
   * @throws IOException if the JSON string is invalid with respect to CustomFieldContext
   */
  public static CustomFieldContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldContext.class);
  }

  /**
   * Convert an instance of CustomFieldContext to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

