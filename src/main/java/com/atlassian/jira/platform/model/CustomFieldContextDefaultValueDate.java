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
 * The default value for a Date custom field.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class CustomFieldContextDefaultValueDate {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  @javax.annotation.Nullable
  private String date;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private String type;

  public static final String SERIALIZED_NAME_USE_CURRENT = "useCurrent";
  @SerializedName(SERIALIZED_NAME_USE_CURRENT)
  @javax.annotation.Nullable
  private Boolean useCurrent = false;

  public CustomFieldContextDefaultValueDate() {
  }

  public CustomFieldContextDefaultValueDate date(@javax.annotation.Nullable String date) {
    this.date = date;
    return this;
  }

  /**
   * The default date in ISO format. Ignored if &#x60;useCurrent&#x60; is true.
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(@javax.annotation.Nullable String date) {
    this.date = date;
  }


  public CustomFieldContextDefaultValueDate type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public CustomFieldContextDefaultValueDate useCurrent(@javax.annotation.Nullable Boolean useCurrent) {
    this.useCurrent = useCurrent;
    return this;
  }

  /**
   * Whether to use the current date.
   * @return useCurrent
   */
  @javax.annotation.Nullable
  public Boolean getUseCurrent() {
    return useCurrent;
  }

  public void setUseCurrent(@javax.annotation.Nullable Boolean useCurrent) {
    this.useCurrent = useCurrent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueDate customFieldContextDefaultValueDate = (CustomFieldContextDefaultValueDate) o;
    return Objects.equals(this.date, customFieldContextDefaultValueDate.date) &&
        Objects.equals(this.type, customFieldContextDefaultValueDate.type) &&
        Objects.equals(this.useCurrent, customFieldContextDefaultValueDate.useCurrent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, type, useCurrent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueDate {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    useCurrent: ").append(toIndentedString(useCurrent)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("type");
    openapiFields.add("useCurrent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomFieldContextDefaultValueDate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomFieldContextDefaultValueDate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldContextDefaultValueDate is not found in the empty JSON string", CustomFieldContextDefaultValueDate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldContextDefaultValueDate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldContextDefaultValueDate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomFieldContextDefaultValueDate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldContextDefaultValueDate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldContextDefaultValueDate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldContextDefaultValueDate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldContextDefaultValueDate.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldContextDefaultValueDate>() {
           @Override
           public void write(JsonWriter out, CustomFieldContextDefaultValueDate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldContextDefaultValueDate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomFieldContextDefaultValueDate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomFieldContextDefaultValueDate
   * @throws IOException if the JSON string is invalid with respect to CustomFieldContextDefaultValueDate
   */
  public static CustomFieldContextDefaultValueDate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldContextDefaultValueDate.class);
  }

  /**
   * Convert an instance of CustomFieldContextDefaultValueDate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

