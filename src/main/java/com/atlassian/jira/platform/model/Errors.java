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
import com.atlassian.jira.platform.model.Error;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * Errors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class Errors {
  public static final String SERIALIZED_NAME_ISSUE_IS_SUBTASK = "issueIsSubtask";
  @SerializedName(SERIALIZED_NAME_ISSUE_IS_SUBTASK)
  @javax.annotation.Nullable
  private Error issueIsSubtask;

  public static final String SERIALIZED_NAME_ISSUES_IN_ARCHIVED_PROJECTS = "issuesInArchivedProjects";
  @SerializedName(SERIALIZED_NAME_ISSUES_IN_ARCHIVED_PROJECTS)
  @javax.annotation.Nullable
  private Error issuesInArchivedProjects;

  public static final String SERIALIZED_NAME_ISSUES_IN_UNLICENSED_PROJECTS = "issuesInUnlicensedProjects";
  @SerializedName(SERIALIZED_NAME_ISSUES_IN_UNLICENSED_PROJECTS)
  @javax.annotation.Nullable
  private Error issuesInUnlicensedProjects;

  public static final String SERIALIZED_NAME_ISSUES_NOT_FOUND = "issuesNotFound";
  @SerializedName(SERIALIZED_NAME_ISSUES_NOT_FOUND)
  @javax.annotation.Nullable
  private Error issuesNotFound;

  public static final String SERIALIZED_NAME_USER_DOES_NOT_HAVE_PERMISSION = "userDoesNotHavePermission";
  @SerializedName(SERIALIZED_NAME_USER_DOES_NOT_HAVE_PERMISSION)
  @javax.annotation.Nullable
  private Error userDoesNotHavePermission;

  public Errors() {
  }

  public Errors issueIsSubtask(@javax.annotation.Nullable Error issueIsSubtask) {
    this.issueIsSubtask = issueIsSubtask;
    return this;
  }

  /**
   * Get issueIsSubtask
   * @return issueIsSubtask
   */
  @javax.annotation.Nullable
  public Error getIssueIsSubtask() {
    return issueIsSubtask;
  }

  public void setIssueIsSubtask(@javax.annotation.Nullable Error issueIsSubtask) {
    this.issueIsSubtask = issueIsSubtask;
  }


  public Errors issuesInArchivedProjects(@javax.annotation.Nullable Error issuesInArchivedProjects) {
    this.issuesInArchivedProjects = issuesInArchivedProjects;
    return this;
  }

  /**
   * Get issuesInArchivedProjects
   * @return issuesInArchivedProjects
   */
  @javax.annotation.Nullable
  public Error getIssuesInArchivedProjects() {
    return issuesInArchivedProjects;
  }

  public void setIssuesInArchivedProjects(@javax.annotation.Nullable Error issuesInArchivedProjects) {
    this.issuesInArchivedProjects = issuesInArchivedProjects;
  }


  public Errors issuesInUnlicensedProjects(@javax.annotation.Nullable Error issuesInUnlicensedProjects) {
    this.issuesInUnlicensedProjects = issuesInUnlicensedProjects;
    return this;
  }

  /**
   * Get issuesInUnlicensedProjects
   * @return issuesInUnlicensedProjects
   */
  @javax.annotation.Nullable
  public Error getIssuesInUnlicensedProjects() {
    return issuesInUnlicensedProjects;
  }

  public void setIssuesInUnlicensedProjects(@javax.annotation.Nullable Error issuesInUnlicensedProjects) {
    this.issuesInUnlicensedProjects = issuesInUnlicensedProjects;
  }


  public Errors issuesNotFound(@javax.annotation.Nullable Error issuesNotFound) {
    this.issuesNotFound = issuesNotFound;
    return this;
  }

  /**
   * Get issuesNotFound
   * @return issuesNotFound
   */
  @javax.annotation.Nullable
  public Error getIssuesNotFound() {
    return issuesNotFound;
  }

  public void setIssuesNotFound(@javax.annotation.Nullable Error issuesNotFound) {
    this.issuesNotFound = issuesNotFound;
  }


  public Errors userDoesNotHavePermission(@javax.annotation.Nullable Error userDoesNotHavePermission) {
    this.userDoesNotHavePermission = userDoesNotHavePermission;
    return this;
  }

  /**
   * Get userDoesNotHavePermission
   * @return userDoesNotHavePermission
   */
  @javax.annotation.Nullable
  public Error getUserDoesNotHavePermission() {
    return userDoesNotHavePermission;
  }

  public void setUserDoesNotHavePermission(@javax.annotation.Nullable Error userDoesNotHavePermission) {
    this.userDoesNotHavePermission = userDoesNotHavePermission;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Errors errors = (Errors) o;
    return Objects.equals(this.issueIsSubtask, errors.issueIsSubtask) &&
        Objects.equals(this.issuesInArchivedProjects, errors.issuesInArchivedProjects) &&
        Objects.equals(this.issuesInUnlicensedProjects, errors.issuesInUnlicensedProjects) &&
        Objects.equals(this.issuesNotFound, errors.issuesNotFound) &&
        Objects.equals(this.userDoesNotHavePermission, errors.userDoesNotHavePermission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueIsSubtask, issuesInArchivedProjects, issuesInUnlicensedProjects, issuesNotFound, userDoesNotHavePermission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Errors {\n");
    sb.append("    issueIsSubtask: ").append(toIndentedString(issueIsSubtask)).append("\n");
    sb.append("    issuesInArchivedProjects: ").append(toIndentedString(issuesInArchivedProjects)).append("\n");
    sb.append("    issuesInUnlicensedProjects: ").append(toIndentedString(issuesInUnlicensedProjects)).append("\n");
    sb.append("    issuesNotFound: ").append(toIndentedString(issuesNotFound)).append("\n");
    sb.append("    userDoesNotHavePermission: ").append(toIndentedString(userDoesNotHavePermission)).append("\n");
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
    openapiFields.add("issueIsSubtask");
    openapiFields.add("issuesInArchivedProjects");
    openapiFields.add("issuesInUnlicensedProjects");
    openapiFields.add("issuesNotFound");
    openapiFields.add("userDoesNotHavePermission");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Errors
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Errors.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Errors is not found in the empty JSON string", Errors.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Errors.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Errors` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `issueIsSubtask`
      if (jsonObj.get("issueIsSubtask") != null && !jsonObj.get("issueIsSubtask").isJsonNull()) {
        Error.validateJsonElement(jsonObj.get("issueIsSubtask"));
      }
      // validate the optional field `issuesInArchivedProjects`
      if (jsonObj.get("issuesInArchivedProjects") != null && !jsonObj.get("issuesInArchivedProjects").isJsonNull()) {
        Error.validateJsonElement(jsonObj.get("issuesInArchivedProjects"));
      }
      // validate the optional field `issuesInUnlicensedProjects`
      if (jsonObj.get("issuesInUnlicensedProjects") != null && !jsonObj.get("issuesInUnlicensedProjects").isJsonNull()) {
        Error.validateJsonElement(jsonObj.get("issuesInUnlicensedProjects"));
      }
      // validate the optional field `issuesNotFound`
      if (jsonObj.get("issuesNotFound") != null && !jsonObj.get("issuesNotFound").isJsonNull()) {
        Error.validateJsonElement(jsonObj.get("issuesNotFound"));
      }
      // validate the optional field `userDoesNotHavePermission`
      if (jsonObj.get("userDoesNotHavePermission") != null && !jsonObj.get("userDoesNotHavePermission").isJsonNull()) {
        Error.validateJsonElement(jsonObj.get("userDoesNotHavePermission"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Errors.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Errors' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Errors> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Errors.class));

       return (TypeAdapter<T>) new TypeAdapter<Errors>() {
           @Override
           public void write(JsonWriter out, Errors value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Errors read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Errors given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Errors
   * @throws IOException if the JSON string is invalid with respect to Errors
   */
  public static Errors fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Errors.class);
  }

  /**
   * Convert an instance of Errors to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

