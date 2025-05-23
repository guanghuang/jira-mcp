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
import com.atlassian.jira.platform.model.IssueTypeDetails;
import com.atlassian.jira.platform.model.User;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
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
 * Details about a workflow scheme.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class WorkflowScheme {
  public static final String SERIALIZED_NAME_DEFAULT_WORKFLOW = "defaultWorkflow";
  @SerializedName(SERIALIZED_NAME_DEFAULT_WORKFLOW)
  @javax.annotation.Nullable
  private String defaultWorkflow;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_DRAFT = "draft";
  @SerializedName(SERIALIZED_NAME_DRAFT)
  @javax.annotation.Nullable
  private Boolean draft;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Long id;

  public static final String SERIALIZED_NAME_ISSUE_TYPE_MAPPINGS = "issueTypeMappings";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_MAPPINGS)
  @javax.annotation.Nullable
  private Map<String, String> issueTypeMappings = new HashMap<>();

  public static final String SERIALIZED_NAME_ISSUE_TYPES = "issueTypes";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPES)
  @javax.annotation.Nullable
  private Map<String, IssueTypeDetails> issueTypes = new HashMap<>();

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "lastModified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  @javax.annotation.Nullable
  private String lastModified;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_USER = "lastModifiedUser";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_USER)
  @javax.annotation.Nullable
  private User lastModifiedUser;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_ORIGINAL_DEFAULT_WORKFLOW = "originalDefaultWorkflow";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_DEFAULT_WORKFLOW)
  @javax.annotation.Nullable
  private String originalDefaultWorkflow;

  public static final String SERIALIZED_NAME_ORIGINAL_ISSUE_TYPE_MAPPINGS = "originalIssueTypeMappings";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_ISSUE_TYPE_MAPPINGS)
  @javax.annotation.Nullable
  private Map<String, String> originalIssueTypeMappings = new HashMap<>();

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  @javax.annotation.Nullable
  private URI self;

  public static final String SERIALIZED_NAME_UPDATE_DRAFT_IF_NEEDED = "updateDraftIfNeeded";
  @SerializedName(SERIALIZED_NAME_UPDATE_DRAFT_IF_NEEDED)
  @javax.annotation.Nullable
  private Boolean updateDraftIfNeeded;

  public WorkflowScheme() {
  }

  public WorkflowScheme(
     Boolean draft, 
     Long id, 
     Map<String, IssueTypeDetails> issueTypes, 
     String lastModified, 
     User lastModifiedUser, 
     String originalDefaultWorkflow, 
     Map<String, String> originalIssueTypeMappings, 
     URI self
  ) {
    this();
    this.draft = draft;
    this.id = id;
    this.issueTypes = issueTypes;
    this.lastModified = lastModified;
    this.lastModifiedUser = lastModifiedUser;
    this.originalDefaultWorkflow = originalDefaultWorkflow;
    this.originalIssueTypeMappings = originalIssueTypeMappings;
    this.self = self;
  }

  public WorkflowScheme defaultWorkflow(@javax.annotation.Nullable String defaultWorkflow) {
    this.defaultWorkflow = defaultWorkflow;
    return this;
  }

  /**
   * The name of the default workflow for the workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira. If &#x60;defaultWorkflow&#x60; is not specified when creating a workflow scheme, it is set to *Jira Workflow (jira)*.
   * @return defaultWorkflow
   */
  @javax.annotation.Nullable
  public String getDefaultWorkflow() {
    return defaultWorkflow;
  }

  public void setDefaultWorkflow(@javax.annotation.Nullable String defaultWorkflow) {
    this.defaultWorkflow = defaultWorkflow;
  }


  public WorkflowScheme description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the workflow scheme.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  /**
   * Whether the workflow scheme is a draft or not.
   * @return draft
   */
  @javax.annotation.Nullable
  public Boolean getDraft() {
    return draft;
  }



  /**
   * The ID of the workflow scheme.
   * @return id
   */
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }



  public WorkflowScheme issueTypeMappings(@javax.annotation.Nullable Map<String, String> issueTypeMappings) {
    this.issueTypeMappings = issueTypeMappings;
    return this;
  }

  public WorkflowScheme putIssueTypeMappingsItem(String key, String issueTypeMappingsItem) {
    if (this.issueTypeMappings == null) {
      this.issueTypeMappings = new HashMap<>();
    }
    this.issueTypeMappings.put(key, issueTypeMappingsItem);
    return this;
  }

  /**
   * The issue type to workflow mappings, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
   * @return issueTypeMappings
   */
  @javax.annotation.Nullable
  public Map<String, String> getIssueTypeMappings() {
    return issueTypeMappings;
  }

  public void setIssueTypeMappings(@javax.annotation.Nullable Map<String, String> issueTypeMappings) {
    this.issueTypeMappings = issueTypeMappings;
  }


  /**
   * The issue types available in Jira.
   * @return issueTypes
   */
  @javax.annotation.Nullable
  public Map<String, IssueTypeDetails> getIssueTypes() {
    return issueTypes;
  }



  /**
   * The date-time that the draft workflow scheme was last modified. A modification is a change to the issue type-project mappings only. This property does not apply to non-draft workflows.
   * @return lastModified
   */
  @javax.annotation.Nullable
  public String getLastModified() {
    return lastModified;
  }



  /**
   * The user that last modified the draft workflow scheme. A modification is a change to the issue type-project mappings only. This property does not apply to non-draft workflows.
   * @return lastModifiedUser
   */
  @javax.annotation.Nullable
  public User getLastModifiedUser() {
    return lastModifiedUser;
  }



  public WorkflowScheme name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the workflow scheme. The name must be unique. The maximum length is 255 characters. Required when creating a workflow scheme.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  /**
   * For draft workflow schemes, this property is the name of the default workflow for the original workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira.
   * @return originalDefaultWorkflow
   */
  @javax.annotation.Nullable
  public String getOriginalDefaultWorkflow() {
    return originalDefaultWorkflow;
  }



  /**
   * For draft workflow schemes, this property is the issue type to workflow mappings for the original workflow scheme, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
   * @return originalIssueTypeMappings
   */
  @javax.annotation.Nullable
  public Map<String, String> getOriginalIssueTypeMappings() {
    return originalIssueTypeMappings;
  }



  /**
   * Get self
   * @return self
   */
  @javax.annotation.Nullable
  public URI getSelf() {
    return self;
  }



  public WorkflowScheme updateDraftIfNeeded(@javax.annotation.Nullable Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
    return this;
  }

  /**
   * Whether to create or update a draft workflow scheme when updating an active workflow scheme. An active workflow scheme is a workflow scheme that is used by at least one project. The following examples show how this property works:   *  Update an active workflow scheme with &#x60;updateDraftIfNeeded&#x60; set to &#x60;true&#x60;: If a draft workflow scheme exists, it is updated. Otherwise, a draft workflow scheme is created.  *  Update an active workflow scheme with &#x60;updateDraftIfNeeded&#x60; set to &#x60;false&#x60;: An error is returned, as active workflow schemes cannot be updated.  *  Update an inactive workflow scheme with &#x60;updateDraftIfNeeded&#x60; set to &#x60;true&#x60;: The workflow scheme is updated, as inactive workflow schemes do not require drafts to update.  Defaults to &#x60;false&#x60;.
   * @return updateDraftIfNeeded
   */
  @javax.annotation.Nullable
  public Boolean getUpdateDraftIfNeeded() {
    return updateDraftIfNeeded;
  }

  public void setUpdateDraftIfNeeded(@javax.annotation.Nullable Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowScheme workflowScheme = (WorkflowScheme) o;
    return Objects.equals(this.defaultWorkflow, workflowScheme.defaultWorkflow) &&
        Objects.equals(this.description, workflowScheme.description) &&
        Objects.equals(this.draft, workflowScheme.draft) &&
        Objects.equals(this.id, workflowScheme.id) &&
        Objects.equals(this.issueTypeMappings, workflowScheme.issueTypeMappings) &&
        Objects.equals(this.issueTypes, workflowScheme.issueTypes) &&
        Objects.equals(this.lastModified, workflowScheme.lastModified) &&
        Objects.equals(this.lastModifiedUser, workflowScheme.lastModifiedUser) &&
        Objects.equals(this.name, workflowScheme.name) &&
        Objects.equals(this.originalDefaultWorkflow, workflowScheme.originalDefaultWorkflow) &&
        Objects.equals(this.originalIssueTypeMappings, workflowScheme.originalIssueTypeMappings) &&
        Objects.equals(this.self, workflowScheme.self) &&
        Objects.equals(this.updateDraftIfNeeded, workflowScheme.updateDraftIfNeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultWorkflow, description, draft, id, issueTypeMappings, issueTypes, lastModified, lastModifiedUser, name, originalDefaultWorkflow, originalIssueTypeMappings, self, updateDraftIfNeeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowScheme {\n");
    sb.append("    defaultWorkflow: ").append(toIndentedString(defaultWorkflow)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueTypeMappings: ").append(toIndentedString(issueTypeMappings)).append("\n");
    sb.append("    issueTypes: ").append(toIndentedString(issueTypes)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastModifiedUser: ").append(toIndentedString(lastModifiedUser)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalDefaultWorkflow: ").append(toIndentedString(originalDefaultWorkflow)).append("\n");
    sb.append("    originalIssueTypeMappings: ").append(toIndentedString(originalIssueTypeMappings)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    updateDraftIfNeeded: ").append(toIndentedString(updateDraftIfNeeded)).append("\n");
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
    openapiFields.add("defaultWorkflow");
    openapiFields.add("description");
    openapiFields.add("draft");
    openapiFields.add("id");
    openapiFields.add("issueTypeMappings");
    openapiFields.add("issueTypes");
    openapiFields.add("lastModified");
    openapiFields.add("lastModifiedUser");
    openapiFields.add("name");
    openapiFields.add("originalDefaultWorkflow");
    openapiFields.add("originalIssueTypeMappings");
    openapiFields.add("self");
    openapiFields.add("updateDraftIfNeeded");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkflowScheme
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkflowScheme.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowScheme is not found in the empty JSON string", WorkflowScheme.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkflowScheme.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkflowScheme` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("defaultWorkflow") != null && !jsonObj.get("defaultWorkflow").isJsonNull()) && !jsonObj.get("defaultWorkflow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultWorkflow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultWorkflow").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("lastModified") != null && !jsonObj.get("lastModified").isJsonNull()) && !jsonObj.get("lastModified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastModified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastModified").toString()));
      }
      // validate the optional field `lastModifiedUser`
      if (jsonObj.get("lastModifiedUser") != null && !jsonObj.get("lastModifiedUser").isJsonNull()) {
        User.validateJsonElement(jsonObj.get("lastModifiedUser"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("originalDefaultWorkflow") != null && !jsonObj.get("originalDefaultWorkflow").isJsonNull()) && !jsonObj.get("originalDefaultWorkflow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalDefaultWorkflow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalDefaultWorkflow").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowScheme.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowScheme' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowScheme> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowScheme.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowScheme>() {
           @Override
           public void write(JsonWriter out, WorkflowScheme value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowScheme read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkflowScheme given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkflowScheme
   * @throws IOException if the JSON string is invalid with respect to WorkflowScheme
   */
  public static WorkflowScheme fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowScheme.class);
  }

  /**
   * Convert an instance of WorkflowScheme to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

