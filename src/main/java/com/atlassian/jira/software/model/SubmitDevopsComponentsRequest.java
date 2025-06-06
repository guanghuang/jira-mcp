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
import com.atlassian.jira.software.model.Component;
import com.atlassian.jira.software.model.ProviderMetadata6;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * The payload used to submit (update / insert) DevOps Component data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-05T13:52:26.392070-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class SubmitDevopsComponentsRequest {
  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  @javax.annotation.Nullable
  private Map<String, String> properties = new HashMap<>();

  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  @javax.annotation.Nonnull
  private List<Component> components = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROVIDER_METADATA = "providerMetadata";
  @SerializedName(SERIALIZED_NAME_PROVIDER_METADATA)
  @javax.annotation.Nullable
  private ProviderMetadata6 providerMetadata;

  public SubmitDevopsComponentsRequest() {
  }

  public SubmitDevopsComponentsRequest properties(@javax.annotation.Nullable Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public SubmitDevopsComponentsRequest putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Properties assigned to incidents/components/review data that can then be used for delete / query operations.  Examples might be an account or user ID that can then be used to clean up data if an account is removed from the Provider system.  Properties are supplied as key/value pairs, and a maximum of 5 properties can be supplied, keys cannot contain &#39;:&#39; or start with &#39;_&#39;. 
   * @return properties
   */
  @javax.annotation.Nullable
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(@javax.annotation.Nullable Map<String, String> properties) {
    this.properties = properties;
  }


  public SubmitDevopsComponentsRequest components(@javax.annotation.Nonnull List<Component> components) {
    this.components = components;
    return this;
  }

  public SubmitDevopsComponentsRequest addComponentsItem(Component componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

  /**
   * Get components
   * @return components
   */
  @javax.annotation.Nonnull
  public List<Component> getComponents() {
    return components;
  }

  public void setComponents(@javax.annotation.Nonnull List<Component> components) {
    this.components = components;
  }


  public SubmitDevopsComponentsRequest providerMetadata(@javax.annotation.Nullable ProviderMetadata6 providerMetadata) {
    this.providerMetadata = providerMetadata;
    return this;
  }

  /**
   * Get providerMetadata
   * @return providerMetadata
   */
  @javax.annotation.Nullable
  public ProviderMetadata6 getProviderMetadata() {
    return providerMetadata;
  }

  public void setProviderMetadata(@javax.annotation.Nullable ProviderMetadata6 providerMetadata) {
    this.providerMetadata = providerMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitDevopsComponentsRequest submitDevopsComponentsRequest = (SubmitDevopsComponentsRequest) o;
    return Objects.equals(this.properties, submitDevopsComponentsRequest.properties) &&
        Objects.equals(this.components, submitDevopsComponentsRequest.components) &&
        Objects.equals(this.providerMetadata, submitDevopsComponentsRequest.providerMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, components, providerMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitDevopsComponentsRequest {\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    providerMetadata: ").append(toIndentedString(providerMetadata)).append("\n");
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
    openapiFields.add("properties");
    openapiFields.add("components");
    openapiFields.add("providerMetadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("components");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubmitDevopsComponentsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubmitDevopsComponentsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitDevopsComponentsRequest is not found in the empty JSON string", SubmitDevopsComponentsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubmitDevopsComponentsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitDevopsComponentsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubmitDevopsComponentsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("components").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `components` to be an array in the JSON string but got `%s`", jsonObj.get("components").toString()));
      }

      JsonArray jsonArraycomponents = jsonObj.getAsJsonArray("components");
      // validate the required field `components` (array)
      for (int i = 0; i < jsonArraycomponents.size(); i++) {
        Component.validateJsonElement(jsonArraycomponents.get(i));
      };
      // validate the optional field `providerMetadata`
      if (jsonObj.get("providerMetadata") != null && !jsonObj.get("providerMetadata").isJsonNull()) {
        ProviderMetadata6.validateJsonElement(jsonObj.get("providerMetadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitDevopsComponentsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitDevopsComponentsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitDevopsComponentsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitDevopsComponentsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitDevopsComponentsRequest>() {
           @Override
           public void write(JsonWriter out, SubmitDevopsComponentsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitDevopsComponentsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubmitDevopsComponentsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubmitDevopsComponentsRequest
   * @throws IOException if the JSON string is invalid with respect to SubmitDevopsComponentsRequest
   */
  public static SubmitDevopsComponentsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitDevopsComponentsRequest.class);
  }

  /**
   * Convert an instance of SubmitDevopsComponentsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

