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
import com.atlassian.jira.software.model.ErrorMessage;
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
 * A response returned in the case of an error.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-05T13:52:26.392070-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class ErrorMessages {
  public static final String SERIALIZED_NAME_ERROR_MESSAGES = "errorMessages";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGES)
  @javax.annotation.Nonnull
  private List<ErrorMessage> errorMessages = new ArrayList<>();

  public ErrorMessages() {
  }

  public ErrorMessages errorMessages(@javax.annotation.Nonnull List<ErrorMessage> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public ErrorMessages addErrorMessagesItem(ErrorMessage errorMessagesItem) {
    if (this.errorMessages == null) {
      this.errorMessages = new ArrayList<>();
    }
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

  /**
   * List of errors occurred.
   * @return errorMessages
   */
  @javax.annotation.Nonnull
  public List<ErrorMessage> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(@javax.annotation.Nonnull List<ErrorMessage> errorMessages) {
    this.errorMessages = errorMessages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorMessages errorMessages = (ErrorMessages) o;
    return Objects.equals(this.errorMessages, errorMessages.errorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorMessages {\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
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
    openapiFields.add("errorMessages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("errorMessages");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ErrorMessages
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ErrorMessages.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ErrorMessages is not found in the empty JSON string", ErrorMessages.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ErrorMessages.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ErrorMessages` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ErrorMessages.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("errorMessages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessages` to be an array in the JSON string but got `%s`", jsonObj.get("errorMessages").toString()));
      }

      JsonArray jsonArrayerrorMessages = jsonObj.getAsJsonArray("errorMessages");
      // validate the required field `errorMessages` (array)
      for (int i = 0; i < jsonArrayerrorMessages.size(); i++) {
        ErrorMessage.validateJsonElement(jsonArrayerrorMessages.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ErrorMessages.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ErrorMessages' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ErrorMessages> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ErrorMessages.class));

       return (TypeAdapter<T>) new TypeAdapter<ErrorMessages>() {
           @Override
           public void write(JsonWriter out, ErrorMessages value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ErrorMessages read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ErrorMessages given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ErrorMessages
   * @throws IOException if the JSON string is invalid with respect to ErrorMessages
   */
  public static ErrorMessages fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ErrorMessages.class);
  }

  /**
   * Convert an instance of ErrorMessages to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

