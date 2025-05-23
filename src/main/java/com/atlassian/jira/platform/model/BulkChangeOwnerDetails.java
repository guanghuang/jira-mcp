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
 * Details for changing owners of shareable entities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class BulkChangeOwnerDetails {
  public static final String SERIALIZED_NAME_AUTOFIX_NAME = "autofixName";
  @SerializedName(SERIALIZED_NAME_AUTOFIX_NAME)
  @javax.annotation.Nonnull
  private Boolean autofixName;

  public static final String SERIALIZED_NAME_NEW_OWNER = "newOwner";
  @SerializedName(SERIALIZED_NAME_NEW_OWNER)
  @javax.annotation.Nonnull
  private String newOwner;

  public BulkChangeOwnerDetails() {
  }

  public BulkChangeOwnerDetails autofixName(@javax.annotation.Nonnull Boolean autofixName) {
    this.autofixName = autofixName;
    return this;
  }

  /**
   * Whether the name is fixed automatically if it&#39;s duplicated after changing owner.
   * @return autofixName
   */
  @javax.annotation.Nonnull
  public Boolean getAutofixName() {
    return autofixName;
  }

  public void setAutofixName(@javax.annotation.Nonnull Boolean autofixName) {
    this.autofixName = autofixName;
  }


  public BulkChangeOwnerDetails newOwner(@javax.annotation.Nonnull String newOwner) {
    this.newOwner = newOwner;
    return this;
  }

  /**
   * The account id of the new owner.
   * @return newOwner
   */
  @javax.annotation.Nonnull
  public String getNewOwner() {
    return newOwner;
  }

  public void setNewOwner(@javax.annotation.Nonnull String newOwner) {
    this.newOwner = newOwner;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkChangeOwnerDetails bulkChangeOwnerDetails = (BulkChangeOwnerDetails) o;
    return Objects.equals(this.autofixName, bulkChangeOwnerDetails.autofixName) &&
        Objects.equals(this.newOwner, bulkChangeOwnerDetails.newOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autofixName, newOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkChangeOwnerDetails {\n");
    sb.append("    autofixName: ").append(toIndentedString(autofixName)).append("\n");
    sb.append("    newOwner: ").append(toIndentedString(newOwner)).append("\n");
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
    openapiFields.add("autofixName");
    openapiFields.add("newOwner");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("autofixName");
    openapiRequiredFields.add("newOwner");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BulkChangeOwnerDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BulkChangeOwnerDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkChangeOwnerDetails is not found in the empty JSON string", BulkChangeOwnerDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BulkChangeOwnerDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BulkChangeOwnerDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BulkChangeOwnerDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("newOwner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newOwner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newOwner").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkChangeOwnerDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkChangeOwnerDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkChangeOwnerDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkChangeOwnerDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkChangeOwnerDetails>() {
           @Override
           public void write(JsonWriter out, BulkChangeOwnerDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkChangeOwnerDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BulkChangeOwnerDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BulkChangeOwnerDetails
   * @throws IOException if the JSON string is invalid with respect to BulkChangeOwnerDetails
   */
  public static BulkChangeOwnerDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkChangeOwnerDetails.class);
  }

  /**
   * Convert an instance of BulkChangeOwnerDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

