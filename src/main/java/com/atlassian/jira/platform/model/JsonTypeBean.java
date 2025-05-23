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
import java.util.HashMap;
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
 * The schema of a field.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class JsonTypeBean {
  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  @javax.annotation.Nullable
  private Map<String, Object> _configuration = new HashMap<>();

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  @javax.annotation.Nullable
  private String custom;

  public static final String SERIALIZED_NAME_CUSTOM_ID = "customId";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ID)
  @javax.annotation.Nullable
  private Long customId;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  @javax.annotation.Nullable
  private String items;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  @javax.annotation.Nullable
  private String system;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private String type;

  public JsonTypeBean() {
  }

  public JsonTypeBean(
     Map<String, Object> _configuration, 
     String custom, 
     Long customId, 
     String items, 
     String system, 
     String type
  ) {
    this();
    this._configuration = _configuration;
    this.custom = custom;
    this.customId = customId;
    this.items = items;
    this.system = system;
    this.type = type;
  }

  /**
   * If the field is a custom field, the configuration of the field.
   * @return _configuration
   */
  @javax.annotation.Nullable
  public Map<String, Object> getConfiguration() {
    return _configuration;
  }



  /**
   * If the field is a custom field, the URI of the field.
   * @return custom
   */
  @javax.annotation.Nullable
  public String getCustom() {
    return custom;
  }



  /**
   * If the field is a custom field, the custom ID of the field.
   * @return customId
   */
  @javax.annotation.Nullable
  public Long getCustomId() {
    return customId;
  }



  /**
   * When the data type is an array, the name of the field items within the array.
   * @return items
   */
  @javax.annotation.Nullable
  public String getItems() {
    return items;
  }



  /**
   * If the field is a system field, the name of the field.
   * @return system
   */
  @javax.annotation.Nullable
  public String getSystem() {
    return system;
  }



  /**
   * The data type of the field.
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonTypeBean jsonTypeBean = (JsonTypeBean) o;
    return Objects.equals(this._configuration, jsonTypeBean._configuration) &&
        Objects.equals(this.custom, jsonTypeBean.custom) &&
        Objects.equals(this.customId, jsonTypeBean.customId) &&
        Objects.equals(this.items, jsonTypeBean.items) &&
        Objects.equals(this.system, jsonTypeBean.system) &&
        Objects.equals(this.type, jsonTypeBean.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, custom, customId, items, system, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonTypeBean {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("configuration");
    openapiFields.add("custom");
    openapiFields.add("customId");
    openapiFields.add("items");
    openapiFields.add("system");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to JsonTypeBean
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JsonTypeBean.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JsonTypeBean is not found in the empty JSON string", JsonTypeBean.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!JsonTypeBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JsonTypeBean` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JsonTypeBean.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("custom") != null && !jsonObj.get("custom").isJsonNull()) && !jsonObj.get("custom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom").toString()));
      }
      if ((jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) && !jsonObj.get("items").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be a primitive type in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }
      if ((jsonObj.get("system") != null && !jsonObj.get("system").isJsonNull()) && !jsonObj.get("system").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `system` to be a primitive type in the JSON string but got `%s`", jsonObj.get("system").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JsonTypeBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JsonTypeBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JsonTypeBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JsonTypeBean.class));

       return (TypeAdapter<T>) new TypeAdapter<JsonTypeBean>() {
           @Override
           public void write(JsonWriter out, JsonTypeBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JsonTypeBean read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of JsonTypeBean given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JsonTypeBean
   * @throws IOException if the JSON string is invalid with respect to JsonTypeBean
   */
  public static JsonTypeBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JsonTypeBean.class);
  }

  /**
   * Convert an instance of JsonTypeBean to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

