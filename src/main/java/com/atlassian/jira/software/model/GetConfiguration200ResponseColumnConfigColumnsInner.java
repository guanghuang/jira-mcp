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
import com.atlassian.jira.software.model.GetConfiguration200ResponseColumnConfigColumnsInnerStatusesInner;
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
 * GetConfiguration200ResponseColumnConfigColumnsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-05T13:52:26.392070-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class GetConfiguration200ResponseColumnConfigColumnsInner {
  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  @javax.annotation.Nullable
  private Integer max;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  @javax.annotation.Nullable
  private Integer min;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  @javax.annotation.Nullable
  private List<GetConfiguration200ResponseColumnConfigColumnsInnerStatusesInner> statuses = new ArrayList<>();

  public GetConfiguration200ResponseColumnConfigColumnsInner() {
  }

  public GetConfiguration200ResponseColumnConfigColumnsInner max(@javax.annotation.Nullable Integer max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
   */
  @javax.annotation.Nullable
  public Integer getMax() {
    return max;
  }

  public void setMax(@javax.annotation.Nullable Integer max) {
    this.max = max;
  }


  public GetConfiguration200ResponseColumnConfigColumnsInner min(@javax.annotation.Nullable Integer min) {
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
   */
  @javax.annotation.Nullable
  public Integer getMin() {
    return min;
  }

  public void setMin(@javax.annotation.Nullable Integer min) {
    this.min = min;
  }


  public GetConfiguration200ResponseColumnConfigColumnsInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetConfiguration200ResponseColumnConfigColumnsInner statuses(@javax.annotation.Nullable List<GetConfiguration200ResponseColumnConfigColumnsInnerStatusesInner> statuses) {
    this.statuses = statuses;
    return this;
  }

  public GetConfiguration200ResponseColumnConfigColumnsInner addStatusesItem(GetConfiguration200ResponseColumnConfigColumnsInnerStatusesInner statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Get statuses
   * @return statuses
   */
  @javax.annotation.Nullable
  public List<GetConfiguration200ResponseColumnConfigColumnsInnerStatusesInner> getStatuses() {
    return statuses;
  }

  public void setStatuses(@javax.annotation.Nullable List<GetConfiguration200ResponseColumnConfigColumnsInnerStatusesInner> statuses) {
    this.statuses = statuses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetConfiguration200ResponseColumnConfigColumnsInner getConfiguration200ResponseColumnConfigColumnsInner = (GetConfiguration200ResponseColumnConfigColumnsInner) o;
    return Objects.equals(this.max, getConfiguration200ResponseColumnConfigColumnsInner.max) &&
        Objects.equals(this.min, getConfiguration200ResponseColumnConfigColumnsInner.min) &&
        Objects.equals(this.name, getConfiguration200ResponseColumnConfigColumnsInner.name) &&
        Objects.equals(this.statuses, getConfiguration200ResponseColumnConfigColumnsInner.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min, name, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetConfiguration200ResponseColumnConfigColumnsInner {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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
    openapiFields.add("max");
    openapiFields.add("min");
    openapiFields.add("name");
    openapiFields.add("statuses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetConfiguration200ResponseColumnConfigColumnsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetConfiguration200ResponseColumnConfigColumnsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetConfiguration200ResponseColumnConfigColumnsInner is not found in the empty JSON string", GetConfiguration200ResponseColumnConfigColumnsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetConfiguration200ResponseColumnConfigColumnsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetConfiguration200ResponseColumnConfigColumnsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("statuses") != null && !jsonObj.get("statuses").isJsonNull()) {
        JsonArray jsonArraystatuses = jsonObj.getAsJsonArray("statuses");
        if (jsonArraystatuses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("statuses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `statuses` to be an array in the JSON string but got `%s`", jsonObj.get("statuses").toString()));
          }

          // validate the optional field `statuses` (array)
          for (int i = 0; i < jsonArraystatuses.size(); i++) {
            GetConfiguration200ResponseColumnConfigColumnsInnerStatusesInner.validateJsonElement(jsonArraystatuses.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetConfiguration200ResponseColumnConfigColumnsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetConfiguration200ResponseColumnConfigColumnsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetConfiguration200ResponseColumnConfigColumnsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetConfiguration200ResponseColumnConfigColumnsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetConfiguration200ResponseColumnConfigColumnsInner>() {
           @Override
           public void write(JsonWriter out, GetConfiguration200ResponseColumnConfigColumnsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetConfiguration200ResponseColumnConfigColumnsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetConfiguration200ResponseColumnConfigColumnsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetConfiguration200ResponseColumnConfigColumnsInner
   * @throws IOException if the JSON string is invalid with respect to GetConfiguration200ResponseColumnConfigColumnsInner
   */
  public static GetConfiguration200ResponseColumnConfigColumnsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetConfiguration200ResponseColumnConfigColumnsInner.class);
  }

  /**
   * Convert an instance of GetConfiguration200ResponseColumnConfigColumnsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

