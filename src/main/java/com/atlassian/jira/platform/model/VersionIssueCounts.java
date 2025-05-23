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
import com.atlassian.jira.platform.model.VersionUsageInCustomField;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
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
 * Various counts of issues within a version.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class VersionIssueCounts {
  public static final String SERIALIZED_NAME_CUSTOM_FIELD_USAGE = "customFieldUsage";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD_USAGE)
  @javax.annotation.Nullable
  private List<VersionUsageInCustomField> customFieldUsage = new ArrayList<>();

  public static final String SERIALIZED_NAME_ISSUE_COUNT_WITH_CUSTOM_FIELDS_SHOWING_VERSION = "issueCountWithCustomFieldsShowingVersion";
  @SerializedName(SERIALIZED_NAME_ISSUE_COUNT_WITH_CUSTOM_FIELDS_SHOWING_VERSION)
  @javax.annotation.Nullable
  private Long issueCountWithCustomFieldsShowingVersion;

  public static final String SERIALIZED_NAME_ISSUES_AFFECTED_COUNT = "issuesAffectedCount";
  @SerializedName(SERIALIZED_NAME_ISSUES_AFFECTED_COUNT)
  @javax.annotation.Nullable
  private Long issuesAffectedCount;

  public static final String SERIALIZED_NAME_ISSUES_FIXED_COUNT = "issuesFixedCount";
  @SerializedName(SERIALIZED_NAME_ISSUES_FIXED_COUNT)
  @javax.annotation.Nullable
  private Long issuesFixedCount;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  @javax.annotation.Nullable
  private URI self;

  public VersionIssueCounts() {
  }

  public VersionIssueCounts(
     List<VersionUsageInCustomField> customFieldUsage, 
     Long issueCountWithCustomFieldsShowingVersion, 
     Long issuesAffectedCount, 
     Long issuesFixedCount, 
     URI self
  ) {
    this();
    this.customFieldUsage = customFieldUsage;
    this.issueCountWithCustomFieldsShowingVersion = issueCountWithCustomFieldsShowingVersion;
    this.issuesAffectedCount = issuesAffectedCount;
    this.issuesFixedCount = issuesFixedCount;
    this.self = self;
  }

  /**
   * List of custom fields using the version.
   * @return customFieldUsage
   */
  @javax.annotation.Nullable
  public List<VersionUsageInCustomField> getCustomFieldUsage() {
    return customFieldUsage;
  }



  /**
   * Count of issues where a version custom field is set to the version.
   * @return issueCountWithCustomFieldsShowingVersion
   */
  @javax.annotation.Nullable
  public Long getIssueCountWithCustomFieldsShowingVersion() {
    return issueCountWithCustomFieldsShowingVersion;
  }



  /**
   * Count of issues where the &#x60;affectedVersion&#x60; is set to the version.
   * @return issuesAffectedCount
   */
  @javax.annotation.Nullable
  public Long getIssuesAffectedCount() {
    return issuesAffectedCount;
  }



  /**
   * Count of issues where the &#x60;fixVersion&#x60; is set to the version.
   * @return issuesFixedCount
   */
  @javax.annotation.Nullable
  public Long getIssuesFixedCount() {
    return issuesFixedCount;
  }



  /**
   * The URL of these count details.
   * @return self
   */
  @javax.annotation.Nullable
  public URI getSelf() {
    return self;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionIssueCounts versionIssueCounts = (VersionIssueCounts) o;
    return Objects.equals(this.customFieldUsage, versionIssueCounts.customFieldUsage) &&
        Objects.equals(this.issueCountWithCustomFieldsShowingVersion, versionIssueCounts.issueCountWithCustomFieldsShowingVersion) &&
        Objects.equals(this.issuesAffectedCount, versionIssueCounts.issuesAffectedCount) &&
        Objects.equals(this.issuesFixedCount, versionIssueCounts.issuesFixedCount) &&
        Objects.equals(this.self, versionIssueCounts.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldUsage, issueCountWithCustomFieldsShowingVersion, issuesAffectedCount, issuesFixedCount, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionIssueCounts {\n");
    sb.append("    customFieldUsage: ").append(toIndentedString(customFieldUsage)).append("\n");
    sb.append("    issueCountWithCustomFieldsShowingVersion: ").append(toIndentedString(issueCountWithCustomFieldsShowingVersion)).append("\n");
    sb.append("    issuesAffectedCount: ").append(toIndentedString(issuesAffectedCount)).append("\n");
    sb.append("    issuesFixedCount: ").append(toIndentedString(issuesFixedCount)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
    openapiFields.add("customFieldUsage");
    openapiFields.add("issueCountWithCustomFieldsShowingVersion");
    openapiFields.add("issuesAffectedCount");
    openapiFields.add("issuesFixedCount");
    openapiFields.add("self");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionIssueCounts
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionIssueCounts.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionIssueCounts is not found in the empty JSON string", VersionIssueCounts.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VersionIssueCounts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VersionIssueCounts` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("customFieldUsage") != null && !jsonObj.get("customFieldUsage").isJsonNull()) {
        JsonArray jsonArraycustomFieldUsage = jsonObj.getAsJsonArray("customFieldUsage");
        if (jsonArraycustomFieldUsage != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customFieldUsage").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customFieldUsage` to be an array in the JSON string but got `%s`", jsonObj.get("customFieldUsage").toString()));
          }

          // validate the optional field `customFieldUsage` (array)
          for (int i = 0; i < jsonArraycustomFieldUsage.size(); i++) {
            VersionUsageInCustomField.validateJsonElement(jsonArraycustomFieldUsage.get(i));
          };
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionIssueCounts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionIssueCounts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionIssueCounts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionIssueCounts.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionIssueCounts>() {
           @Override
           public void write(JsonWriter out, VersionIssueCounts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VersionIssueCounts read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VersionIssueCounts given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VersionIssueCounts
   * @throws IOException if the JSON string is invalid with respect to VersionIssueCounts
   */
  public static VersionIssueCounts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionIssueCounts.class);
  }

  /**
   * Convert an instance of VersionIssueCounts to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

