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
 * GetIssue200ResponseFieldsClosedSprintsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-05T13:52:26.392070-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class GetIssue200ResponseFieldsClosedSprintsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  @javax.annotation.Nullable
  private String self;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private String endDate;

  public static final String SERIALIZED_NAME_COMPLETE_DATE = "completeDate";
  @SerializedName(SERIALIZED_NAME_COMPLETE_DATE)
  @javax.annotation.Nullable
  private String completeDate;

  public GetIssue200ResponseFieldsClosedSprintsInner() {
  }

  public GetIssue200ResponseFieldsClosedSprintsInner id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public GetIssue200ResponseFieldsClosedSprintsInner self(@javax.annotation.Nullable String self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
   */
  @javax.annotation.Nullable
  public String getSelf() {
    return self;
  }

  public void setSelf(@javax.annotation.Nullable String self) {
    this.self = self;
  }


  public GetIssue200ResponseFieldsClosedSprintsInner state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public GetIssue200ResponseFieldsClosedSprintsInner name(@javax.annotation.Nullable String name) {
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


  public GetIssue200ResponseFieldsClosedSprintsInner startDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
  }


  public GetIssue200ResponseFieldsClosedSprintsInner endDate(@javax.annotation.Nullable String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nullable String endDate) {
    this.endDate = endDate;
  }


  public GetIssue200ResponseFieldsClosedSprintsInner completeDate(@javax.annotation.Nullable String completeDate) {
    this.completeDate = completeDate;
    return this;
  }

  /**
   * Get completeDate
   * @return completeDate
   */
  @javax.annotation.Nullable
  public String getCompleteDate() {
    return completeDate;
  }

  public void setCompleteDate(@javax.annotation.Nullable String completeDate) {
    this.completeDate = completeDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIssue200ResponseFieldsClosedSprintsInner getIssue200ResponseFieldsClosedSprintsInner = (GetIssue200ResponseFieldsClosedSprintsInner) o;
    return Objects.equals(this.id, getIssue200ResponseFieldsClosedSprintsInner.id) &&
        Objects.equals(this.self, getIssue200ResponseFieldsClosedSprintsInner.self) &&
        Objects.equals(this.state, getIssue200ResponseFieldsClosedSprintsInner.state) &&
        Objects.equals(this.name, getIssue200ResponseFieldsClosedSprintsInner.name) &&
        Objects.equals(this.startDate, getIssue200ResponseFieldsClosedSprintsInner.startDate) &&
        Objects.equals(this.endDate, getIssue200ResponseFieldsClosedSprintsInner.endDate) &&
        Objects.equals(this.completeDate, getIssue200ResponseFieldsClosedSprintsInner.completeDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, self, state, name, startDate, endDate, completeDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIssue200ResponseFieldsClosedSprintsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    completeDate: ").append(toIndentedString(completeDate)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("self");
    openapiFields.add("state");
    openapiFields.add("name");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("completeDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetIssue200ResponseFieldsClosedSprintsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetIssue200ResponseFieldsClosedSprintsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetIssue200ResponseFieldsClosedSprintsInner is not found in the empty JSON string", GetIssue200ResponseFieldsClosedSprintsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetIssue200ResponseFieldsClosedSprintsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetIssue200ResponseFieldsClosedSprintsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if ((jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) && !jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
      if ((jsonObj.get("completeDate") != null && !jsonObj.get("completeDate").isJsonNull()) && !jsonObj.get("completeDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `completeDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("completeDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetIssue200ResponseFieldsClosedSprintsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetIssue200ResponseFieldsClosedSprintsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetIssue200ResponseFieldsClosedSprintsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetIssue200ResponseFieldsClosedSprintsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetIssue200ResponseFieldsClosedSprintsInner>() {
           @Override
           public void write(JsonWriter out, GetIssue200ResponseFieldsClosedSprintsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetIssue200ResponseFieldsClosedSprintsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetIssue200ResponseFieldsClosedSprintsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetIssue200ResponseFieldsClosedSprintsInner
   * @throws IOException if the JSON string is invalid with respect to GetIssue200ResponseFieldsClosedSprintsInner
   */
  public static GetIssue200ResponseFieldsClosedSprintsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetIssue200ResponseFieldsClosedSprintsInner.class);
  }

  /**
   * Convert an instance of GetIssue200ResponseFieldsClosedSprintsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

