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
 * RankIssues207ResponseEntriesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-05T13:52:26.392070-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class RankIssues207ResponseEntriesInner {
  public static final String SERIALIZED_NAME_ISSUE_ID = "issueId";
  @SerializedName(SERIALIZED_NAME_ISSUE_ID)
  @javax.annotation.Nullable
  private Integer issueId;

  public static final String SERIALIZED_NAME_ISSUE_KEY = "issueKey";
  @SerializedName(SERIALIZED_NAME_ISSUE_KEY)
  @javax.annotation.Nullable
  private String issueKey;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private Integer status;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  @javax.annotation.Nullable
  private List<String> errors = new ArrayList<>();

  public RankIssues207ResponseEntriesInner() {
  }

  public RankIssues207ResponseEntriesInner issueId(@javax.annotation.Nullable Integer issueId) {
    this.issueId = issueId;
    return this;
  }

  /**
   * Get issueId
   * @return issueId
   */
  @javax.annotation.Nullable
  public Integer getIssueId() {
    return issueId;
  }

  public void setIssueId(@javax.annotation.Nullable Integer issueId) {
    this.issueId = issueId;
  }


  public RankIssues207ResponseEntriesInner issueKey(@javax.annotation.Nullable String issueKey) {
    this.issueKey = issueKey;
    return this;
  }

  /**
   * Get issueKey
   * @return issueKey
   */
  @javax.annotation.Nullable
  public String getIssueKey() {
    return issueKey;
  }

  public void setIssueKey(@javax.annotation.Nullable String issueKey) {
    this.issueKey = issueKey;
  }


  public RankIssues207ResponseEntriesInner status(@javax.annotation.Nullable Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public Integer getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable Integer status) {
    this.status = status;
  }


  public RankIssues207ResponseEntriesInner errors(@javax.annotation.Nullable List<String> errors) {
    this.errors = errors;
    return this;
  }

  public RankIssues207ResponseEntriesInner addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
   */
  @javax.annotation.Nullable
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(@javax.annotation.Nullable List<String> errors) {
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
    RankIssues207ResponseEntriesInner rankIssues207ResponseEntriesInner = (RankIssues207ResponseEntriesInner) o;
    return Objects.equals(this.issueId, rankIssues207ResponseEntriesInner.issueId) &&
        Objects.equals(this.issueKey, rankIssues207ResponseEntriesInner.issueKey) &&
        Objects.equals(this.status, rankIssues207ResponseEntriesInner.status) &&
        Objects.equals(this.errors, rankIssues207ResponseEntriesInner.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueId, issueKey, status, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankIssues207ResponseEntriesInner {\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    issueKey: ").append(toIndentedString(issueKey)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("issueId");
    openapiFields.add("issueKey");
    openapiFields.add("status");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RankIssues207ResponseEntriesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RankIssues207ResponseEntriesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RankIssues207ResponseEntriesInner is not found in the empty JSON string", RankIssues207ResponseEntriesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RankIssues207ResponseEntriesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RankIssues207ResponseEntriesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("issueKey") != null && !jsonObj.get("issueKey").isJsonNull()) && !jsonObj.get("issueKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueKey").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull() && !jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RankIssues207ResponseEntriesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RankIssues207ResponseEntriesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RankIssues207ResponseEntriesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RankIssues207ResponseEntriesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RankIssues207ResponseEntriesInner>() {
           @Override
           public void write(JsonWriter out, RankIssues207ResponseEntriesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RankIssues207ResponseEntriesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RankIssues207ResponseEntriesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RankIssues207ResponseEntriesInner
   * @throws IOException if the JSON string is invalid with respect to RankIssues207ResponseEntriesInner
   */
  public static RankIssues207ResponseEntriesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RankIssues207ResponseEntriesInner.class);
  }

  /**
   * Convert an instance of RankIssues207ResponseEntriesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

