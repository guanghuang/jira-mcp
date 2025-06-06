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
import com.atlassian.jira.platform.model.IssueBean;
import com.atlassian.jira.platform.model.JsonTypeBean;
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
 * The result of a JQL search.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class SearchResults {
  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  @javax.annotation.Nullable
  private String expand;

  public static final String SERIALIZED_NAME_ISSUES = "issues";
  @SerializedName(SERIALIZED_NAME_ISSUES)
  @javax.annotation.Nullable
  private List<IssueBean> issues = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  @javax.annotation.Nullable
  private Integer maxResults;

  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  @javax.annotation.Nullable
  private Map<String, String> names = new HashMap<>();

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  @javax.annotation.Nullable
  private Map<String, JsonTypeBean> schema = new HashMap<>();

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  @javax.annotation.Nullable
  private Integer startAt;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private Integer total;

  public static final String SERIALIZED_NAME_WARNING_MESSAGES = "warningMessages";
  @SerializedName(SERIALIZED_NAME_WARNING_MESSAGES)
  @javax.annotation.Nullable
  private List<String> warningMessages = new ArrayList<>();

  public SearchResults() {
  }

  public SearchResults(
     String expand, 
     List<IssueBean> issues, 
     Integer maxResults, 
     Map<String, String> names, 
     Map<String, JsonTypeBean> schema, 
     Integer startAt, 
     Integer total, 
     List<String> warningMessages
  ) {
    this();
    this.expand = expand;
    this.issues = issues;
    this.maxResults = maxResults;
    this.names = names;
    this.schema = schema;
    this.startAt = startAt;
    this.total = total;
    this.warningMessages = warningMessages;
  }

  /**
   * Expand options that include additional search result details in the response.
   * @return expand
   */
  @javax.annotation.Nullable
  public String getExpand() {
    return expand;
  }



  /**
   * The list of issues found by the search.
   * @return issues
   */
  @javax.annotation.Nullable
  public List<IssueBean> getIssues() {
    return issues;
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
   * The ID and name of each field in the search results.
   * @return names
   */
  @javax.annotation.Nullable
  public Map<String, String> getNames() {
    return names;
  }



  /**
   * The schema describing the field types in the search results.
   * @return schema
   */
  @javax.annotation.Nullable
  public Map<String, JsonTypeBean> getSchema() {
    return schema;
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



  /**
   * Any warnings related to the JQL query.
   * @return warningMessages
   */
  @javax.annotation.Nullable
  public List<String> getWarningMessages() {
    return warningMessages;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResults searchResults = (SearchResults) o;
    return Objects.equals(this.expand, searchResults.expand) &&
        Objects.equals(this.issues, searchResults.issues) &&
        Objects.equals(this.maxResults, searchResults.maxResults) &&
        Objects.equals(this.names, searchResults.names) &&
        Objects.equals(this.schema, searchResults.schema) &&
        Objects.equals(this.startAt, searchResults.startAt) &&
        Objects.equals(this.total, searchResults.total) &&
        Objects.equals(this.warningMessages, searchResults.warningMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, issues, maxResults, names, schema, startAt, total, warningMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResults {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    warningMessages: ").append(toIndentedString(warningMessages)).append("\n");
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
    openapiFields.add("expand");
    openapiFields.add("issues");
    openapiFields.add("maxResults");
    openapiFields.add("names");
    openapiFields.add("schema");
    openapiFields.add("startAt");
    openapiFields.add("total");
    openapiFields.add("warningMessages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchResults
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchResults is not found in the empty JSON string", SearchResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull()) && !jsonObj.get("expand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expand").toString()));
      }
      if (jsonObj.get("issues") != null && !jsonObj.get("issues").isJsonNull()) {
        JsonArray jsonArrayissues = jsonObj.getAsJsonArray("issues");
        if (jsonArrayissues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("issues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `issues` to be an array in the JSON string but got `%s`", jsonObj.get("issues").toString()));
          }

          // validate the optional field `issues` (array)
          for (int i = 0; i < jsonArrayissues.size(); i++) {
            IssueBean.validateJsonElement(jsonArrayissues.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("warningMessages") != null && !jsonObj.get("warningMessages").isJsonNull() && !jsonObj.get("warningMessages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `warningMessages` to be an array in the JSON string but got `%s`", jsonObj.get("warningMessages").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchResults.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchResults>() {
           @Override
           public void write(JsonWriter out, SearchResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchResults given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchResults
   * @throws IOException if the JSON string is invalid with respect to SearchResults
   */
  public static SearchResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchResults.class);
  }

  /**
   * Convert an instance of SearchResults to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

