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
import com.atlassian.jira.platform.model.DocumentVersion;
import com.atlassian.jira.platform.model.MappingsByIssueTypeOverride;
import com.atlassian.jira.platform.model.MappingsByWorkflow;
import com.atlassian.jira.platform.model.WorkflowSchemeAssociation;
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
 * The update workflow scheme payload.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class WorkflowSchemeUpdateRequest {
  public static final String SERIALIZED_NAME_DEFAULT_WORKFLOW_ID = "defaultWorkflowId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_WORKFLOW_ID)
  @javax.annotation.Nullable
  private String defaultWorkflowId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_STATUS_MAPPINGS_BY_ISSUE_TYPE_OVERRIDE = "statusMappingsByIssueTypeOverride";
  @SerializedName(SERIALIZED_NAME_STATUS_MAPPINGS_BY_ISSUE_TYPE_OVERRIDE)
  @javax.annotation.Nullable
  private List<MappingsByIssueTypeOverride> statusMappingsByIssueTypeOverride = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS_MAPPINGS_BY_WORKFLOWS = "statusMappingsByWorkflows";
  @SerializedName(SERIALIZED_NAME_STATUS_MAPPINGS_BY_WORKFLOWS)
  @javax.annotation.Nullable
  private List<MappingsByWorkflow> statusMappingsByWorkflows = new ArrayList<>();

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @javax.annotation.Nonnull
  private DocumentVersion version;

  public static final String SERIALIZED_NAME_WORKFLOWS_FOR_ISSUE_TYPES = "workflowsForIssueTypes";
  @SerializedName(SERIALIZED_NAME_WORKFLOWS_FOR_ISSUE_TYPES)
  @javax.annotation.Nullable
  private List<WorkflowSchemeAssociation> workflowsForIssueTypes = new ArrayList<>();

  public WorkflowSchemeUpdateRequest() {
  }

  public WorkflowSchemeUpdateRequest defaultWorkflowId(@javax.annotation.Nullable String defaultWorkflowId) {
    this.defaultWorkflowId = defaultWorkflowId;
    return this;
  }

  /**
   * The ID of the workflow for issue types without having a mapping defined in this workflow scheme. Only used in global-scoped workflow schemes. If the &#x60;defaultWorkflowId&#x60; isn&#39;t specified, this is set to *Jira Workflow (jira)*.
   * @return defaultWorkflowId
   */
  @javax.annotation.Nullable
  public String getDefaultWorkflowId() {
    return defaultWorkflowId;
  }

  public void setDefaultWorkflowId(@javax.annotation.Nullable String defaultWorkflowId) {
    this.defaultWorkflowId = defaultWorkflowId;
  }


  public WorkflowSchemeUpdateRequest description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * The new description for this workflow scheme.
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public WorkflowSchemeUpdateRequest id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this workflow scheme.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public WorkflowSchemeUpdateRequest name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The new name for this workflow scheme.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public WorkflowSchemeUpdateRequest statusMappingsByIssueTypeOverride(@javax.annotation.Nullable List<MappingsByIssueTypeOverride> statusMappingsByIssueTypeOverride) {
    this.statusMappingsByIssueTypeOverride = statusMappingsByIssueTypeOverride;
    return this;
  }

  public WorkflowSchemeUpdateRequest addStatusMappingsByIssueTypeOverrideItem(MappingsByIssueTypeOverride statusMappingsByIssueTypeOverrideItem) {
    if (this.statusMappingsByIssueTypeOverride == null) {
      this.statusMappingsByIssueTypeOverride = new ArrayList<>();
    }
    this.statusMappingsByIssueTypeOverride.add(statusMappingsByIssueTypeOverrideItem);
    return this;
  }

  /**
   * Overrides, for the selected issue types, any status mappings provided in &#x60;statusMappingsByWorkflows&#x60;. Status mappings are required when the new workflow for an issue type doesn&#39;t contain all statuses that the old workflow has. Status mappings can be provided by a combination of &#x60;statusMappingsByWorkflows&#x60; and &#x60;statusMappingsByIssueTypeOverride&#x60;.
   * @return statusMappingsByIssueTypeOverride
   */
  @javax.annotation.Nullable
  public List<MappingsByIssueTypeOverride> getStatusMappingsByIssueTypeOverride() {
    return statusMappingsByIssueTypeOverride;
  }

  public void setStatusMappingsByIssueTypeOverride(@javax.annotation.Nullable List<MappingsByIssueTypeOverride> statusMappingsByIssueTypeOverride) {
    this.statusMappingsByIssueTypeOverride = statusMappingsByIssueTypeOverride;
  }


  public WorkflowSchemeUpdateRequest statusMappingsByWorkflows(@javax.annotation.Nullable List<MappingsByWorkflow> statusMappingsByWorkflows) {
    this.statusMappingsByWorkflows = statusMappingsByWorkflows;
    return this;
  }

  public WorkflowSchemeUpdateRequest addStatusMappingsByWorkflowsItem(MappingsByWorkflow statusMappingsByWorkflowsItem) {
    if (this.statusMappingsByWorkflows == null) {
      this.statusMappingsByWorkflows = new ArrayList<>();
    }
    this.statusMappingsByWorkflows.add(statusMappingsByWorkflowsItem);
    return this;
  }

  /**
   * The status mappings by workflows. Status mappings are required when the new workflow for an issue type doesn&#39;t contain all statuses that the old workflow has. Status mappings can be provided by a combination of &#x60;statusMappingsByWorkflows&#x60; and &#x60;statusMappingsByIssueTypeOverride&#x60;.
   * @return statusMappingsByWorkflows
   */
  @javax.annotation.Nullable
  public List<MappingsByWorkflow> getStatusMappingsByWorkflows() {
    return statusMappingsByWorkflows;
  }

  public void setStatusMappingsByWorkflows(@javax.annotation.Nullable List<MappingsByWorkflow> statusMappingsByWorkflows) {
    this.statusMappingsByWorkflows = statusMappingsByWorkflows;
  }


  public WorkflowSchemeUpdateRequest version(@javax.annotation.Nonnull DocumentVersion version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nonnull
  public DocumentVersion getVersion() {
    return version;
  }

  public void setVersion(@javax.annotation.Nonnull DocumentVersion version) {
    this.version = version;
  }


  public WorkflowSchemeUpdateRequest workflowsForIssueTypes(@javax.annotation.Nullable List<WorkflowSchemeAssociation> workflowsForIssueTypes) {
    this.workflowsForIssueTypes = workflowsForIssueTypes;
    return this;
  }

  public WorkflowSchemeUpdateRequest addWorkflowsForIssueTypesItem(WorkflowSchemeAssociation workflowsForIssueTypesItem) {
    if (this.workflowsForIssueTypes == null) {
      this.workflowsForIssueTypes = new ArrayList<>();
    }
    this.workflowsForIssueTypes.add(workflowsForIssueTypesItem);
    return this;
  }

  /**
   * Mappings from workflows to issue types.
   * @return workflowsForIssueTypes
   */
  @javax.annotation.Nullable
  public List<WorkflowSchemeAssociation> getWorkflowsForIssueTypes() {
    return workflowsForIssueTypes;
  }

  public void setWorkflowsForIssueTypes(@javax.annotation.Nullable List<WorkflowSchemeAssociation> workflowsForIssueTypes) {
    this.workflowsForIssueTypes = workflowsForIssueTypes;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the WorkflowSchemeUpdateRequest instance itself
   */
  public WorkflowSchemeUpdateRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSchemeUpdateRequest workflowSchemeUpdateRequest = (WorkflowSchemeUpdateRequest) o;
    return Objects.equals(this.defaultWorkflowId, workflowSchemeUpdateRequest.defaultWorkflowId) &&
        Objects.equals(this.description, workflowSchemeUpdateRequest.description) &&
        Objects.equals(this.id, workflowSchemeUpdateRequest.id) &&
        Objects.equals(this.name, workflowSchemeUpdateRequest.name) &&
        Objects.equals(this.statusMappingsByIssueTypeOverride, workflowSchemeUpdateRequest.statusMappingsByIssueTypeOverride) &&
        Objects.equals(this.statusMappingsByWorkflows, workflowSchemeUpdateRequest.statusMappingsByWorkflows) &&
        Objects.equals(this.version, workflowSchemeUpdateRequest.version) &&
        Objects.equals(this.workflowsForIssueTypes, workflowSchemeUpdateRequest.workflowsForIssueTypes)&&
        Objects.equals(this.additionalProperties, workflowSchemeUpdateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultWorkflowId, description, id, name, statusMappingsByIssueTypeOverride, statusMappingsByWorkflows, version, workflowsForIssueTypes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSchemeUpdateRequest {\n");
    sb.append("    defaultWorkflowId: ").append(toIndentedString(defaultWorkflowId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusMappingsByIssueTypeOverride: ").append(toIndentedString(statusMappingsByIssueTypeOverride)).append("\n");
    sb.append("    statusMappingsByWorkflows: ").append(toIndentedString(statusMappingsByWorkflows)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    workflowsForIssueTypes: ").append(toIndentedString(workflowsForIssueTypes)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("defaultWorkflowId");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("statusMappingsByIssueTypeOverride");
    openapiFields.add("statusMappingsByWorkflows");
    openapiFields.add("version");
    openapiFields.add("workflowsForIssueTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("version");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkflowSchemeUpdateRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkflowSchemeUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowSchemeUpdateRequest is not found in the empty JSON string", WorkflowSchemeUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkflowSchemeUpdateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("defaultWorkflowId") != null && !jsonObj.get("defaultWorkflowId").isJsonNull()) && !jsonObj.get("defaultWorkflowId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultWorkflowId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultWorkflowId").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("statusMappingsByIssueTypeOverride") != null && !jsonObj.get("statusMappingsByIssueTypeOverride").isJsonNull()) {
        JsonArray jsonArraystatusMappingsByIssueTypeOverride = jsonObj.getAsJsonArray("statusMappingsByIssueTypeOverride");
        if (jsonArraystatusMappingsByIssueTypeOverride != null) {
          // ensure the json data is an array
          if (!jsonObj.get("statusMappingsByIssueTypeOverride").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `statusMappingsByIssueTypeOverride` to be an array in the JSON string but got `%s`", jsonObj.get("statusMappingsByIssueTypeOverride").toString()));
          }

          // validate the optional field `statusMappingsByIssueTypeOverride` (array)
          for (int i = 0; i < jsonArraystatusMappingsByIssueTypeOverride.size(); i++) {
            MappingsByIssueTypeOverride.validateJsonElement(jsonArraystatusMappingsByIssueTypeOverride.get(i));
          };
        }
      }
      if (jsonObj.get("statusMappingsByWorkflows") != null && !jsonObj.get("statusMappingsByWorkflows").isJsonNull()) {
        JsonArray jsonArraystatusMappingsByWorkflows = jsonObj.getAsJsonArray("statusMappingsByWorkflows");
        if (jsonArraystatusMappingsByWorkflows != null) {
          // ensure the json data is an array
          if (!jsonObj.get("statusMappingsByWorkflows").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `statusMappingsByWorkflows` to be an array in the JSON string but got `%s`", jsonObj.get("statusMappingsByWorkflows").toString()));
          }

          // validate the optional field `statusMappingsByWorkflows` (array)
          for (int i = 0; i < jsonArraystatusMappingsByWorkflows.size(); i++) {
            MappingsByWorkflow.validateJsonElement(jsonArraystatusMappingsByWorkflows.get(i));
          };
        }
      }
      // validate the required field `version`
      DocumentVersion.validateJsonElement(jsonObj.get("version"));
      if (jsonObj.get("workflowsForIssueTypes") != null && !jsonObj.get("workflowsForIssueTypes").isJsonNull()) {
        JsonArray jsonArrayworkflowsForIssueTypes = jsonObj.getAsJsonArray("workflowsForIssueTypes");
        if (jsonArrayworkflowsForIssueTypes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("workflowsForIssueTypes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `workflowsForIssueTypes` to be an array in the JSON string but got `%s`", jsonObj.get("workflowsForIssueTypes").toString()));
          }

          // validate the optional field `workflowsForIssueTypes` (array)
          for (int i = 0; i < jsonArrayworkflowsForIssueTypes.size(); i++) {
            WorkflowSchemeAssociation.validateJsonElement(jsonArrayworkflowsForIssueTypes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowSchemeUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowSchemeUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowSchemeUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowSchemeUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowSchemeUpdateRequest>() {
           @Override
           public void write(JsonWriter out, WorkflowSchemeUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowSchemeUpdateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             WorkflowSchemeUpdateRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkflowSchemeUpdateRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkflowSchemeUpdateRequest
   * @throws IOException if the JSON string is invalid with respect to WorkflowSchemeUpdateRequest
   */
  public static WorkflowSchemeUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowSchemeUpdateRequest.class);
  }

  /**
   * Convert an instance of WorkflowSchemeUpdateRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

