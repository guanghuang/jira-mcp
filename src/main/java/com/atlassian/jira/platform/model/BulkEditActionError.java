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
 * Errors of bulk edit action.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class BulkEditActionError {
  public static final String SERIALIZED_NAME_ERROR_MESSAGES = "errorMessages";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGES)
  @javax.annotation.Nonnull
  private List<String> errorMessages = new ArrayList<>();

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  @javax.annotation.Nonnull
  private Map<String, String> errors = new HashMap<>();

  public BulkEditActionError() {
  }

  public BulkEditActionError errorMessages(@javax.annotation.Nonnull List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public BulkEditActionError addErrorMessagesItem(String errorMessagesItem) {
    if (this.errorMessages == null) {
      this.errorMessages = new ArrayList<>();
    }
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

  /**
   * The error messages.
   * @return errorMessages
   */
  @javax.annotation.Nonnull
  public List<String> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(@javax.annotation.Nonnull List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }


  public BulkEditActionError errors(@javax.annotation.Nonnull Map<String, String> errors) {
    this.errors = errors;
    return this;
  }

  public BulkEditActionError putErrorsItem(String key, String errorsItem) {
    if (this.errors == null) {
      this.errors = new HashMap<>();
    }
    this.errors.put(key, errorsItem);
    return this;
  }

  /**
   * The errors.
   * @return errors
   */
  @javax.annotation.Nonnull
  public Map<String, String> getErrors() {
    return errors;
  }

  public void setErrors(@javax.annotation.Nonnull Map<String, String> errors) {
    this.errors = errors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkEditActionError bulkEditActionError = (BulkEditActionError) o;
    return Objects.equals(this.errorMessages, bulkEditActionError.errorMessages) &&
        Objects.equals(this.errors, bulkEditActionError.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessages, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkEditActionError {\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("errorMessages");
    openapiRequiredFields.add("errors");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BulkEditActionError
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BulkEditActionError.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkEditActionError is not found in the empty JSON string", BulkEditActionError.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BulkEditActionError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BulkEditActionError` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BulkEditActionError.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("errorMessages") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("errorMessages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessages` to be an array in the JSON string but got `%s`", jsonObj.get("errorMessages").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkEditActionError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkEditActionError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkEditActionError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkEditActionError.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkEditActionError>() {
           @Override
           public void write(JsonWriter out, BulkEditActionError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkEditActionError read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BulkEditActionError given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BulkEditActionError
   * @throws IOException if the JSON string is invalid with respect to BulkEditActionError
   */
  public static BulkEditActionError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkEditActionError.class);
  }

  /**
   * Convert an instance of BulkEditActionError to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

