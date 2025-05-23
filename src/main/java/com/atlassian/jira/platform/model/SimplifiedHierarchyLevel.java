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
import java.util.List;
import java.util.UUID;

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
 * SimplifiedHierarchyLevel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class SimplifiedHierarchyLevel {
  public static final String SERIALIZED_NAME_ABOVE_LEVEL_ID = "aboveLevelId";
  @SerializedName(SERIALIZED_NAME_ABOVE_LEVEL_ID)
  @javax.annotation.Nullable
  private Long aboveLevelId;

  public static final String SERIALIZED_NAME_BELOW_LEVEL_ID = "belowLevelId";
  @SerializedName(SERIALIZED_NAME_BELOW_LEVEL_ID)
  @javax.annotation.Nullable
  private Long belowLevelId;

  public static final String SERIALIZED_NAME_EXTERNAL_UUID = "externalUuid";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_UUID)
  @javax.annotation.Nullable
  private UUID externalUuid;

  public static final String SERIALIZED_NAME_HIERARCHY_LEVEL_NUMBER = "hierarchyLevelNumber";
  @SerializedName(SERIALIZED_NAME_HIERARCHY_LEVEL_NUMBER)
  @javax.annotation.Nullable
  private Integer hierarchyLevelNumber;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Long id;

  public static final String SERIALIZED_NAME_ISSUE_TYPE_IDS = "issueTypeIds";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_IDS)
  @javax.annotation.Nullable
  private List<Long> issueTypeIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  @javax.annotation.Nullable
  private Integer level;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PROJECT_CONFIGURATION_ID = "projectConfigurationId";
  @SerializedName(SERIALIZED_NAME_PROJECT_CONFIGURATION_ID)
  @javax.annotation.Nullable
  private Long projectConfigurationId;

  public SimplifiedHierarchyLevel() {
  }

  public SimplifiedHierarchyLevel aboveLevelId(@javax.annotation.Nullable Long aboveLevelId) {
    this.aboveLevelId = aboveLevelId;
    return this;
  }

  /**
   * The ID of the level above this one in the hierarchy. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
   * @return aboveLevelId
   */
  @javax.annotation.Nullable
  public Long getAboveLevelId() {
    return aboveLevelId;
  }

  public void setAboveLevelId(@javax.annotation.Nullable Long aboveLevelId) {
    this.aboveLevelId = aboveLevelId;
  }


  public SimplifiedHierarchyLevel belowLevelId(@javax.annotation.Nullable Long belowLevelId) {
    this.belowLevelId = belowLevelId;
    return this;
  }

  /**
   * The ID of the level below this one in the hierarchy. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
   * @return belowLevelId
   */
  @javax.annotation.Nullable
  public Long getBelowLevelId() {
    return belowLevelId;
  }

  public void setBelowLevelId(@javax.annotation.Nullable Long belowLevelId) {
    this.belowLevelId = belowLevelId;
  }


  public SimplifiedHierarchyLevel externalUuid(@javax.annotation.Nullable UUID externalUuid) {
    this.externalUuid = externalUuid;
    return this;
  }

  /**
   * The external UUID of the hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
   * @return externalUuid
   */
  @javax.annotation.Nullable
  public UUID getExternalUuid() {
    return externalUuid;
  }

  public void setExternalUuid(@javax.annotation.Nullable UUID externalUuid) {
    this.externalUuid = externalUuid;
  }


  public SimplifiedHierarchyLevel hierarchyLevelNumber(@javax.annotation.Nullable Integer hierarchyLevelNumber) {
    this.hierarchyLevelNumber = hierarchyLevelNumber;
    return this;
  }

  /**
   * Get hierarchyLevelNumber
   * @return hierarchyLevelNumber
   */
  @javax.annotation.Nullable
  public Integer getHierarchyLevelNumber() {
    return hierarchyLevelNumber;
  }

  public void setHierarchyLevelNumber(@javax.annotation.Nullable Integer hierarchyLevelNumber) {
    this.hierarchyLevelNumber = hierarchyLevelNumber;
  }


  public SimplifiedHierarchyLevel id(@javax.annotation.Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
   * @return id
   */
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Long id) {
    this.id = id;
  }


  public SimplifiedHierarchyLevel issueTypeIds(@javax.annotation.Nullable List<Long> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
    return this;
  }

  public SimplifiedHierarchyLevel addIssueTypeIdsItem(Long issueTypeIdsItem) {
    if (this.issueTypeIds == null) {
      this.issueTypeIds = new ArrayList<>();
    }
    this.issueTypeIds.add(issueTypeIdsItem);
    return this;
  }

  /**
   * The issue types available in this hierarchy level.
   * @return issueTypeIds
   */
  @javax.annotation.Nullable
  public List<Long> getIssueTypeIds() {
    return issueTypeIds;
  }

  public void setIssueTypeIds(@javax.annotation.Nullable List<Long> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }


  public SimplifiedHierarchyLevel level(@javax.annotation.Nullable Integer level) {
    this.level = level;
    return this;
  }

  /**
   * The level of this item in the hierarchy.
   * @return level
   */
  @javax.annotation.Nullable
  public Integer getLevel() {
    return level;
  }

  public void setLevel(@javax.annotation.Nullable Integer level) {
    this.level = level;
  }


  public SimplifiedHierarchyLevel name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this hierarchy level.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public SimplifiedHierarchyLevel projectConfigurationId(@javax.annotation.Nullable Long projectConfigurationId) {
    this.projectConfigurationId = projectConfigurationId;
    return this;
  }

  /**
   * The ID of the project configuration. This property is deprecated, see [Change oticen: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
   * @return projectConfigurationId
   */
  @javax.annotation.Nullable
  public Long getProjectConfigurationId() {
    return projectConfigurationId;
  }

  public void setProjectConfigurationId(@javax.annotation.Nullable Long projectConfigurationId) {
    this.projectConfigurationId = projectConfigurationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimplifiedHierarchyLevel simplifiedHierarchyLevel = (SimplifiedHierarchyLevel) o;
    return Objects.equals(this.aboveLevelId, simplifiedHierarchyLevel.aboveLevelId) &&
        Objects.equals(this.belowLevelId, simplifiedHierarchyLevel.belowLevelId) &&
        Objects.equals(this.externalUuid, simplifiedHierarchyLevel.externalUuid) &&
        Objects.equals(this.hierarchyLevelNumber, simplifiedHierarchyLevel.hierarchyLevelNumber) &&
        Objects.equals(this.id, simplifiedHierarchyLevel.id) &&
        Objects.equals(this.issueTypeIds, simplifiedHierarchyLevel.issueTypeIds) &&
        Objects.equals(this.level, simplifiedHierarchyLevel.level) &&
        Objects.equals(this.name, simplifiedHierarchyLevel.name) &&
        Objects.equals(this.projectConfigurationId, simplifiedHierarchyLevel.projectConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aboveLevelId, belowLevelId, externalUuid, hierarchyLevelNumber, id, issueTypeIds, level, name, projectConfigurationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplifiedHierarchyLevel {\n");
    sb.append("    aboveLevelId: ").append(toIndentedString(aboveLevelId)).append("\n");
    sb.append("    belowLevelId: ").append(toIndentedString(belowLevelId)).append("\n");
    sb.append("    externalUuid: ").append(toIndentedString(externalUuid)).append("\n");
    sb.append("    hierarchyLevelNumber: ").append(toIndentedString(hierarchyLevelNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueTypeIds: ").append(toIndentedString(issueTypeIds)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectConfigurationId: ").append(toIndentedString(projectConfigurationId)).append("\n");
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
    openapiFields.add("aboveLevelId");
    openapiFields.add("belowLevelId");
    openapiFields.add("externalUuid");
    openapiFields.add("hierarchyLevelNumber");
    openapiFields.add("id");
    openapiFields.add("issueTypeIds");
    openapiFields.add("level");
    openapiFields.add("name");
    openapiFields.add("projectConfigurationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SimplifiedHierarchyLevel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SimplifiedHierarchyLevel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimplifiedHierarchyLevel is not found in the empty JSON string", SimplifiedHierarchyLevel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SimplifiedHierarchyLevel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimplifiedHierarchyLevel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("externalUuid") != null && !jsonObj.get("externalUuid").isJsonNull()) && !jsonObj.get("externalUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalUuid").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("issueTypeIds") != null && !jsonObj.get("issueTypeIds").isJsonNull() && !jsonObj.get("issueTypeIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueTypeIds` to be an array in the JSON string but got `%s`", jsonObj.get("issueTypeIds").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimplifiedHierarchyLevel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimplifiedHierarchyLevel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimplifiedHierarchyLevel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimplifiedHierarchyLevel.class));

       return (TypeAdapter<T>) new TypeAdapter<SimplifiedHierarchyLevel>() {
           @Override
           public void write(JsonWriter out, SimplifiedHierarchyLevel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimplifiedHierarchyLevel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SimplifiedHierarchyLevel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SimplifiedHierarchyLevel
   * @throws IOException if the JSON string is invalid with respect to SimplifiedHierarchyLevel
   */
  public static SimplifiedHierarchyLevel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimplifiedHierarchyLevel.class);
  }

  /**
   * Convert an instance of SimplifiedHierarchyLevel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

