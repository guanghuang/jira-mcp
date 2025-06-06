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
import com.atlassian.jira.platform.model.UiModificationContextDetails;
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
 * The details of a UI modification.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class UpdateUiModificationDetails {
  public static final String SERIALIZED_NAME_CONTEXTS = "contexts";
  @SerializedName(SERIALIZED_NAME_CONTEXTS)
  @javax.annotation.Nullable
  private List<UiModificationContextDetails> contexts = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private String data;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public UpdateUiModificationDetails() {
  }

  public UpdateUiModificationDetails contexts(@javax.annotation.Nullable List<UiModificationContextDetails> contexts) {
    this.contexts = contexts;
    return this;
  }

  public UpdateUiModificationDetails addContextsItem(UiModificationContextDetails contextsItem) {
    if (this.contexts == null) {
      this.contexts = new ArrayList<>();
    }
    this.contexts.add(contextsItem);
    return this;
  }

  /**
   * List of contexts of the UI modification. The maximum number of contexts is 1000. If provided, replaces all existing contexts.
   * @return contexts
   */
  @javax.annotation.Nullable
  public List<UiModificationContextDetails> getContexts() {
    return contexts;
  }

  public void setContexts(@javax.annotation.Nullable List<UiModificationContextDetails> contexts) {
    this.contexts = contexts;
  }


  public UpdateUiModificationDetails data(@javax.annotation.Nullable String data) {
    this.data = data;
    return this;
  }

  /**
   * The data of the UI modification. The maximum size of the data is 50000 characters.
   * @return data
   */
  @javax.annotation.Nullable
  public String getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable String data) {
    this.data = data;
  }


  public UpdateUiModificationDetails description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the UI modification. The maximum length is 255 characters.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public UpdateUiModificationDetails name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the UI modification. The maximum length is 255 characters.
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
    UpdateUiModificationDetails updateUiModificationDetails = (UpdateUiModificationDetails) o;
    return Objects.equals(this.contexts, updateUiModificationDetails.contexts) &&
        Objects.equals(this.data, updateUiModificationDetails.data) &&
        Objects.equals(this.description, updateUiModificationDetails.description) &&
        Objects.equals(this.name, updateUiModificationDetails.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contexts, data, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUiModificationDetails {\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("contexts");
    openapiFields.add("data");
    openapiFields.add("description");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateUiModificationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateUiModificationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateUiModificationDetails is not found in the empty JSON string", UpdateUiModificationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateUiModificationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateUiModificationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("contexts") != null && !jsonObj.get("contexts").isJsonNull()) {
        JsonArray jsonArraycontexts = jsonObj.getAsJsonArray("contexts");
        if (jsonArraycontexts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contexts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contexts` to be an array in the JSON string but got `%s`", jsonObj.get("contexts").toString()));
          }

          // validate the optional field `contexts` (array)
          for (int i = 0; i < jsonArraycontexts.size(); i++) {
            UiModificationContextDetails.validateJsonElement(jsonArraycontexts.get(i));
          };
        }
      }
      if ((jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
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
       if (!UpdateUiModificationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateUiModificationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateUiModificationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateUiModificationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateUiModificationDetails>() {
           @Override
           public void write(JsonWriter out, UpdateUiModificationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateUiModificationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateUiModificationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateUiModificationDetails
   * @throws IOException if the JSON string is invalid with respect to UpdateUiModificationDetails
   */
  public static UpdateUiModificationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateUiModificationDetails.class);
  }

  /**
   * Convert an instance of UpdateUiModificationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

