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
import com.atlassian.jira.software.model.GetAllQuickFilters200ResponseValuesInner;
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
 * GetAllQuickFilters200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-05T13:52:26.392070-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class GetAllQuickFilters200Response {
  public static final String SERIALIZED_NAME_IS_LAST = "isLast";
  @SerializedName(SERIALIZED_NAME_IS_LAST)
  @javax.annotation.Nullable
  private Boolean isLast;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  @javax.annotation.Nullable
  private Integer maxResults;

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  @javax.annotation.Nullable
  private Long startAt;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private Long total;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  @javax.annotation.Nullable
  private List<GetAllQuickFilters200ResponseValuesInner> values = new ArrayList<>();

  public GetAllQuickFilters200Response() {
  }

  public GetAllQuickFilters200Response isLast(@javax.annotation.Nullable Boolean isLast) {
    this.isLast = isLast;
    return this;
  }

  /**
   * Get isLast
   * @return isLast
   */
  @javax.annotation.Nullable
  public Boolean getIsLast() {
    return isLast;
  }

  public void setIsLast(@javax.annotation.Nullable Boolean isLast) {
    this.isLast = isLast;
  }


  public GetAllQuickFilters200Response maxResults(@javax.annotation.Nullable Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * Get maxResults
   * @return maxResults
   */
  @javax.annotation.Nullable
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(@javax.annotation.Nullable Integer maxResults) {
    this.maxResults = maxResults;
  }


  public GetAllQuickFilters200Response startAt(@javax.annotation.Nullable Long startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * Get startAt
   * @return startAt
   */
  @javax.annotation.Nullable
  public Long getStartAt() {
    return startAt;
  }

  public void setStartAt(@javax.annotation.Nullable Long startAt) {
    this.startAt = startAt;
  }


  public GetAllQuickFilters200Response total(@javax.annotation.Nullable Long total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  @javax.annotation.Nullable
  public Long getTotal() {
    return total;
  }

  public void setTotal(@javax.annotation.Nullable Long total) {
    this.total = total;
  }


  public GetAllQuickFilters200Response values(@javax.annotation.Nullable List<GetAllQuickFilters200ResponseValuesInner> values) {
    this.values = values;
    return this;
  }

  public GetAllQuickFilters200Response addValuesItem(GetAllQuickFilters200ResponseValuesInner valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   */
  @javax.annotation.Nullable
  public List<GetAllQuickFilters200ResponseValuesInner> getValues() {
    return values;
  }

  public void setValues(@javax.annotation.Nullable List<GetAllQuickFilters200ResponseValuesInner> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllQuickFilters200Response getAllQuickFilters200Response = (GetAllQuickFilters200Response) o;
    return Objects.equals(this.isLast, getAllQuickFilters200Response.isLast) &&
        Objects.equals(this.maxResults, getAllQuickFilters200Response.maxResults) &&
        Objects.equals(this.startAt, getAllQuickFilters200Response.startAt) &&
        Objects.equals(this.total, getAllQuickFilters200Response.total) &&
        Objects.equals(this.values, getAllQuickFilters200Response.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLast, maxResults, startAt, total, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllQuickFilters200Response {\n");
    sb.append("    isLast: ").append(toIndentedString(isLast)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("isLast");
    openapiFields.add("maxResults");
    openapiFields.add("startAt");
    openapiFields.add("total");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetAllQuickFilters200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAllQuickFilters200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAllQuickFilters200Response is not found in the empty JSON string", GetAllQuickFilters200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAllQuickFilters200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAllQuickFilters200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull()) {
        JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
        if (jsonArrayvalues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("values").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
          }

          // validate the optional field `values` (array)
          for (int i = 0; i < jsonArrayvalues.size(); i++) {
            GetAllQuickFilters200ResponseValuesInner.validateJsonElement(jsonArrayvalues.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAllQuickFilters200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAllQuickFilters200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAllQuickFilters200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAllQuickFilters200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAllQuickFilters200Response>() {
           @Override
           public void write(JsonWriter out, GetAllQuickFilters200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAllQuickFilters200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetAllQuickFilters200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetAllQuickFilters200Response
   * @throws IOException if the JSON string is invalid with respect to GetAllQuickFilters200Response
   */
  public static GetAllQuickFilters200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAllQuickFilters200Response.class);
  }

  /**
   * Convert an instance of GetAllQuickFilters200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

