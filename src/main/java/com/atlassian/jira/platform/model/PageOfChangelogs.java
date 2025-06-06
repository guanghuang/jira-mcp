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
import com.atlassian.jira.platform.model.Changelog;
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
 * A page of changelogs.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class PageOfChangelogs {
  public static final String SERIALIZED_NAME_HISTORIES = "histories";
  @SerializedName(SERIALIZED_NAME_HISTORIES)
  @javax.annotation.Nullable
  private List<Changelog> histories = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  @javax.annotation.Nullable
  private Integer maxResults;

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  @javax.annotation.Nullable
  private Integer startAt;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private Integer total;

  public PageOfChangelogs() {
  }

  public PageOfChangelogs(
     List<Changelog> histories, 
     Integer maxResults, 
     Integer startAt, 
     Integer total
  ) {
    this();
    this.histories = histories;
    this.maxResults = maxResults;
    this.startAt = startAt;
    this.total = total;
  }

  /**
   * The list of changelogs.
   * @return histories
   */
  @javax.annotation.Nullable
  public List<Changelog> getHistories() {
    return histories;
  }



  /**
   * The maximum number of results that could be on the page.
   * @return maxResults
   */
  @javax.annotation.Nullable
  public Integer getMaxResults() {
    return maxResults;
  }



  /**
   * The index of the first item returned on the page.
   * @return startAt
   */
  @javax.annotation.Nullable
  public Integer getStartAt() {
    return startAt;
  }



  /**
   * The number of results on the page.
   * @return total
   */
  @javax.annotation.Nullable
  public Integer getTotal() {
    return total;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfChangelogs pageOfChangelogs = (PageOfChangelogs) o;
    return Objects.equals(this.histories, pageOfChangelogs.histories) &&
        Objects.equals(this.maxResults, pageOfChangelogs.maxResults) &&
        Objects.equals(this.startAt, pageOfChangelogs.startAt) &&
        Objects.equals(this.total, pageOfChangelogs.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(histories, maxResults, startAt, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfChangelogs {\n");
    sb.append("    histories: ").append(toIndentedString(histories)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("histories");
    openapiFields.add("maxResults");
    openapiFields.add("startAt");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PageOfChangelogs
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PageOfChangelogs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageOfChangelogs is not found in the empty JSON string", PageOfChangelogs.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PageOfChangelogs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageOfChangelogs` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("histories") != null && !jsonObj.get("histories").isJsonNull()) {
        JsonArray jsonArrayhistories = jsonObj.getAsJsonArray("histories");
        if (jsonArrayhistories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("histories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `histories` to be an array in the JSON string but got `%s`", jsonObj.get("histories").toString()));
          }

          // validate the optional field `histories` (array)
          for (int i = 0; i < jsonArrayhistories.size(); i++) {
            Changelog.validateJsonElement(jsonArrayhistories.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageOfChangelogs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageOfChangelogs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageOfChangelogs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageOfChangelogs.class));

       return (TypeAdapter<T>) new TypeAdapter<PageOfChangelogs>() {
           @Override
           public void write(JsonWriter out, PageOfChangelogs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageOfChangelogs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PageOfChangelogs given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PageOfChangelogs
   * @throws IOException if the JSON string is invalid with respect to PageOfChangelogs
   */
  public static PageOfChangelogs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageOfChangelogs.class);
  }

  /**
   * Convert an instance of PageOfChangelogs to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

