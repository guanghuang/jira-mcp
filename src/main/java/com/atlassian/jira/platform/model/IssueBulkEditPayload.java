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
import com.atlassian.jira.platform.model.JiraIssueFields;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Issue Bulk Edit Payload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class IssueBulkEditPayload {
  public static final String SERIALIZED_NAME_EDITED_FIELDS_INPUT = "editedFieldsInput";
  @SerializedName(SERIALIZED_NAME_EDITED_FIELDS_INPUT)
  @javax.annotation.Nonnull
  private JiraIssueFields editedFieldsInput;

  public static final String SERIALIZED_NAME_SELECTED_ACTIONS = "selectedActions";
  @SerializedName(SERIALIZED_NAME_SELECTED_ACTIONS)
  @javax.annotation.Nonnull
  private List<String> selectedActions = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELECTED_ISSUE_IDS_OR_KEYS = "selectedIssueIdsOrKeys";
  @SerializedName(SERIALIZED_NAME_SELECTED_ISSUE_IDS_OR_KEYS)
  @javax.annotation.Nonnull
  private List<String> selectedIssueIdsOrKeys = new ArrayList<>();

  public static final String SERIALIZED_NAME_SEND_BULK_NOTIFICATION = "sendBulkNotification";
  @SerializedName(SERIALIZED_NAME_SEND_BULK_NOTIFICATION)
  @javax.annotation.Nullable
  private Boolean sendBulkNotification = true;

  public IssueBulkEditPayload() {
  }

  public IssueBulkEditPayload editedFieldsInput(@javax.annotation.Nonnull JiraIssueFields editedFieldsInput) {
    this.editedFieldsInput = editedFieldsInput;
    return this;
  }

  /**
   * An object that defines the values to be updated in specified fields of an issue. The structure and content of this parameter vary depending on the type of field being edited. Although the order is not significant, ensure that field IDs align with those in selectedActions.
   * @return editedFieldsInput
   */
  @javax.annotation.Nonnull
  public JiraIssueFields getEditedFieldsInput() {
    return editedFieldsInput;
  }

  public void setEditedFieldsInput(@javax.annotation.Nonnull JiraIssueFields editedFieldsInput) {
    this.editedFieldsInput = editedFieldsInput;
  }


  public IssueBulkEditPayload selectedActions(@javax.annotation.Nonnull List<String> selectedActions) {
    this.selectedActions = selectedActions;
    return this;
  }

  public IssueBulkEditPayload addSelectedActionsItem(String selectedActionsItem) {
    if (this.selectedActions == null) {
      this.selectedActions = new ArrayList<>();
    }
    this.selectedActions.add(selectedActionsItem);
    return this;
  }

  /**
   * List of all the field IDs that are to be bulk edited. Each field ID in this list corresponds to a specific attribute of an issue that is set to be modified in the bulk edit operation. The relevant field ID can be obtained by calling the Bulk Edit Get Fields REST API (documentation available on this page itself).
   * @return selectedActions
   */
  @javax.annotation.Nonnull
  public List<String> getSelectedActions() {
    return selectedActions;
  }

  public void setSelectedActions(@javax.annotation.Nonnull List<String> selectedActions) {
    this.selectedActions = selectedActions;
  }


  public IssueBulkEditPayload selectedIssueIdsOrKeys(@javax.annotation.Nonnull List<String> selectedIssueIdsOrKeys) {
    this.selectedIssueIdsOrKeys = selectedIssueIdsOrKeys;
    return this;
  }

  public IssueBulkEditPayload addSelectedIssueIdsOrKeysItem(String selectedIssueIdsOrKeysItem) {
    if (this.selectedIssueIdsOrKeys == null) {
      this.selectedIssueIdsOrKeys = new ArrayList<>();
    }
    this.selectedIssueIdsOrKeys.add(selectedIssueIdsOrKeysItem);
    return this;
  }

  /**
   * List of issue IDs or keys which are to be bulk edited. These IDs or keys can be from different projects and issue types.
   * @return selectedIssueIdsOrKeys
   */
  @javax.annotation.Nonnull
  public List<String> getSelectedIssueIdsOrKeys() {
    return selectedIssueIdsOrKeys;
  }

  public void setSelectedIssueIdsOrKeys(@javax.annotation.Nonnull List<String> selectedIssueIdsOrKeys) {
    this.selectedIssueIdsOrKeys = selectedIssueIdsOrKeys;
  }


  public IssueBulkEditPayload sendBulkNotification(@javax.annotation.Nullable Boolean sendBulkNotification) {
    this.sendBulkNotification = sendBulkNotification;
    return this;
  }

  /**
   * A boolean value that indicates whether to send a bulk change notification when the issues are being edited.  If &#x60;true&#x60;, dispatches a bulk notification email to users about the updates.
   * @return sendBulkNotification
   */
  @javax.annotation.Nullable
  public Boolean getSendBulkNotification() {
    return sendBulkNotification;
  }

  public void setSendBulkNotification(@javax.annotation.Nullable Boolean sendBulkNotification) {
    this.sendBulkNotification = sendBulkNotification;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueBulkEditPayload issueBulkEditPayload = (IssueBulkEditPayload) o;
    return Objects.equals(this.editedFieldsInput, issueBulkEditPayload.editedFieldsInput) &&
        Objects.equals(this.selectedActions, issueBulkEditPayload.selectedActions) &&
        Objects.equals(this.selectedIssueIdsOrKeys, issueBulkEditPayload.selectedIssueIdsOrKeys) &&
        Objects.equals(this.sendBulkNotification, issueBulkEditPayload.sendBulkNotification);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(editedFieldsInput, selectedActions, selectedIssueIdsOrKeys, sendBulkNotification);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueBulkEditPayload {\n");
    sb.append("    editedFieldsInput: ").append(toIndentedString(editedFieldsInput)).append("\n");
    sb.append("    selectedActions: ").append(toIndentedString(selectedActions)).append("\n");
    sb.append("    selectedIssueIdsOrKeys: ").append(toIndentedString(selectedIssueIdsOrKeys)).append("\n");
    sb.append("    sendBulkNotification: ").append(toIndentedString(sendBulkNotification)).append("\n");
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
    openapiFields.add("editedFieldsInput");
    openapiFields.add("selectedActions");
    openapiFields.add("selectedIssueIdsOrKeys");
    openapiFields.add("sendBulkNotification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("editedFieldsInput");
    openapiRequiredFields.add("selectedActions");
    openapiRequiredFields.add("selectedIssueIdsOrKeys");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IssueBulkEditPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IssueBulkEditPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueBulkEditPayload is not found in the empty JSON string", IssueBulkEditPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IssueBulkEditPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueBulkEditPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueBulkEditPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `editedFieldsInput`
      JiraIssueFields.validateJsonElement(jsonObj.get("editedFieldsInput"));
      // ensure the required json array is present
      if (jsonObj.get("selectedActions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("selectedActions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedActions` to be an array in the JSON string but got `%s`", jsonObj.get("selectedActions").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("selectedIssueIdsOrKeys") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("selectedIssueIdsOrKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedIssueIdsOrKeys` to be an array in the JSON string but got `%s`", jsonObj.get("selectedIssueIdsOrKeys").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueBulkEditPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueBulkEditPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueBulkEditPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueBulkEditPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueBulkEditPayload>() {
           @Override
           public void write(JsonWriter out, IssueBulkEditPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueBulkEditPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IssueBulkEditPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssueBulkEditPayload
   * @throws IOException if the JSON string is invalid with respect to IssueBulkEditPayload
   */
  public static IssueBulkEditPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueBulkEditPayload.class);
  }

  /**
   * Convert an instance of IssueBulkEditPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

