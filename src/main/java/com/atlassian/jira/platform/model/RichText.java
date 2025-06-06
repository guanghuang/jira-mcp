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
 * RichText
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class RichText {
  public static final String SERIALIZED_NAME_EMPTY = "empty";
  @SerializedName(SERIALIZED_NAME_EMPTY)
  @javax.annotation.Nullable
  private Boolean empty;

  public static final String SERIALIZED_NAME_EMPTY_ADF = "emptyAdf";
  @SerializedName(SERIALIZED_NAME_EMPTY_ADF)
  @javax.annotation.Nullable
  private Boolean emptyAdf;

  public static final String SERIALIZED_NAME_FINALISED = "finalised";
  @SerializedName(SERIALIZED_NAME_FINALISED)
  @javax.annotation.Nullable
  private Boolean finalised;

  public static final String SERIALIZED_NAME_VALUE_SET = "valueSet";
  @SerializedName(SERIALIZED_NAME_VALUE_SET)
  @javax.annotation.Nullable
  private Boolean valueSet;

  public RichText() {
  }

  public RichText empty(@javax.annotation.Nullable Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * Get empty
   * @return empty
   */
  @javax.annotation.Nullable
  public Boolean getEmpty() {
    return empty;
  }

  public void setEmpty(@javax.annotation.Nullable Boolean empty) {
    this.empty = empty;
  }


  public RichText emptyAdf(@javax.annotation.Nullable Boolean emptyAdf) {
    this.emptyAdf = emptyAdf;
    return this;
  }

  /**
   * Get emptyAdf
   * @return emptyAdf
   */
  @javax.annotation.Nullable
  public Boolean getEmptyAdf() {
    return emptyAdf;
  }

  public void setEmptyAdf(@javax.annotation.Nullable Boolean emptyAdf) {
    this.emptyAdf = emptyAdf;
  }


  public RichText finalised(@javax.annotation.Nullable Boolean finalised) {
    this.finalised = finalised;
    return this;
  }

  /**
   * Get finalised
   * @return finalised
   */
  @javax.annotation.Nullable
  public Boolean getFinalised() {
    return finalised;
  }

  public void setFinalised(@javax.annotation.Nullable Boolean finalised) {
    this.finalised = finalised;
  }


  public RichText valueSet(@javax.annotation.Nullable Boolean valueSet) {
    this.valueSet = valueSet;
    return this;
  }

  /**
   * Get valueSet
   * @return valueSet
   */
  @javax.annotation.Nullable
  public Boolean getValueSet() {
    return valueSet;
  }

  public void setValueSet(@javax.annotation.Nullable Boolean valueSet) {
    this.valueSet = valueSet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RichText richText = (RichText) o;
    return Objects.equals(this.empty, richText.empty) &&
        Objects.equals(this.emptyAdf, richText.emptyAdf) &&
        Objects.equals(this.finalised, richText.finalised) &&
        Objects.equals(this.valueSet, richText.valueSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empty, emptyAdf, finalised, valueSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RichText {\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    emptyAdf: ").append(toIndentedString(emptyAdf)).append("\n");
    sb.append("    finalised: ").append(toIndentedString(finalised)).append("\n");
    sb.append("    valueSet: ").append(toIndentedString(valueSet)).append("\n");
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
    openapiFields.add("empty");
    openapiFields.add("emptyAdf");
    openapiFields.add("finalised");
    openapiFields.add("valueSet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RichText
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RichText.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RichText is not found in the empty JSON string", RichText.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RichText.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RichText` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RichText.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RichText' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RichText> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RichText.class));

       return (TypeAdapter<T>) new TypeAdapter<RichText>() {
           @Override
           public void write(JsonWriter out, RichText value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RichText read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RichText given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RichText
   * @throws IOException if the JSON string is invalid with respect to RichText
   */
  public static RichText fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RichText.class);
  }

  /**
   * Convert an instance of RichText to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

