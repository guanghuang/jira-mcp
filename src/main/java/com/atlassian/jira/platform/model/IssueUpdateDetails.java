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
import com.atlassian.jira.platform.model.EntityProperty;
import com.atlassian.jira.platform.model.FieldUpdateOperation;
import com.atlassian.jira.platform.model.HistoryMetadata;
import com.atlassian.jira.platform.model.IssueTransition;
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
 * Details of an issue update request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class IssueUpdateDetails {
  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  @javax.annotation.Nullable
  private Map<String, Object> fields = new HashMap<>();

  public static final String SERIALIZED_NAME_HISTORY_METADATA = "historyMetadata";
  @SerializedName(SERIALIZED_NAME_HISTORY_METADATA)
  @javax.annotation.Nullable
  private HistoryMetadata historyMetadata;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  @javax.annotation.Nullable
  private List<EntityProperty> properties = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRANSITION = "transition";
  @SerializedName(SERIALIZED_NAME_TRANSITION)
  @javax.annotation.Nullable
  private IssueTransition transition;

  public static final String SERIALIZED_NAME_UPDATE = "update";
  @SerializedName(SERIALIZED_NAME_UPDATE)
  @javax.annotation.Nullable
  private Map<String, List<FieldUpdateOperation>> update = new HashMap<>();

  public IssueUpdateDetails() {
  }

  public IssueUpdateDetails fields(@javax.annotation.Nullable Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public IssueUpdateDetails putFieldsItem(String key, Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use &#x60;update&#x60;. Fields included in here cannot be included in &#x60;update&#x60;.
   * @return fields
   */
  @javax.annotation.Nullable
  public Map<String, Object> getFields() {
    return fields;
  }

  public void setFields(@javax.annotation.Nullable Map<String, Object> fields) {
    this.fields = fields;
  }


  public IssueUpdateDetails historyMetadata(@javax.annotation.Nullable HistoryMetadata historyMetadata) {
    this.historyMetadata = historyMetadata;
    return this;
  }

  /**
   * Additional issue history details.
   * @return historyMetadata
   */
  @javax.annotation.Nullable
  public HistoryMetadata getHistoryMetadata() {
    return historyMetadata;
  }

  public void setHistoryMetadata(@javax.annotation.Nullable HistoryMetadata historyMetadata) {
    this.historyMetadata = historyMetadata;
  }


  public IssueUpdateDetails properties(@javax.annotation.Nullable List<EntityProperty> properties) {
    this.properties = properties;
    return this;
  }

  public IssueUpdateDetails addPropertiesItem(EntityProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Details of issue properties to be add or update.
   * @return properties
   */
  @javax.annotation.Nullable
  public List<EntityProperty> getProperties() {
    return properties;
  }

  public void setProperties(@javax.annotation.Nullable List<EntityProperty> properties) {
    this.properties = properties;
  }


  public IssueUpdateDetails transition(@javax.annotation.Nullable IssueTransition transition) {
    this.transition = transition;
    return this;
  }

  /**
   * Details of a transition. Required when performing a transition, optional when creating or editing an issue.
   * @return transition
   */
  @javax.annotation.Nullable
  public IssueTransition getTransition() {
    return transition;
  }

  public void setTransition(@javax.annotation.Nullable IssueTransition transition) {
    this.transition = transition;
  }


  public IssueUpdateDetails update(@javax.annotation.Nullable Map<String, List<FieldUpdateOperation>> update) {
    this.update = update;
    return this;
  }

  public IssueUpdateDetails putUpdateItem(String key, List<FieldUpdateOperation> updateItem) {
    if (this.update == null) {
      this.update = new HashMap<>();
    }
    this.update.put(key, updateItem);
    return this;
  }

  /**
   * A Map containing the field field name and a list of operations to perform on the issue screen field. Note that fields included in here cannot be included in &#x60;fields&#x60;.
   * @return update
   */
  @javax.annotation.Nullable
  public Map<String, List<FieldUpdateOperation>> getUpdate() {
    return update;
  }

  public void setUpdate(@javax.annotation.Nullable Map<String, List<FieldUpdateOperation>> update) {
    this.update = update;
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
   * @return the IssueUpdateDetails instance itself
   */
  public IssueUpdateDetails putAdditionalProperty(String key, Object value) {
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
    IssueUpdateDetails issueUpdateDetails = (IssueUpdateDetails) o;
    return Objects.equals(this.fields, issueUpdateDetails.fields) &&
        Objects.equals(this.historyMetadata, issueUpdateDetails.historyMetadata) &&
        Objects.equals(this.properties, issueUpdateDetails.properties) &&
        Objects.equals(this.transition, issueUpdateDetails.transition) &&
        Objects.equals(this.update, issueUpdateDetails.update)&&
        Objects.equals(this.additionalProperties, issueUpdateDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, historyMetadata, properties, transition, update, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueUpdateDetails {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    historyMetadata: ").append(toIndentedString(historyMetadata)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    transition: ").append(toIndentedString(transition)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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
    openapiFields.add("fields");
    openapiFields.add("historyMetadata");
    openapiFields.add("properties");
    openapiFields.add("transition");
    openapiFields.add("update");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IssueUpdateDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IssueUpdateDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueUpdateDetails is not found in the empty JSON string", IssueUpdateDetails.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("properties") != null && !jsonObj.get("properties").isJsonNull()) {
        JsonArray jsonArrayproperties = jsonObj.getAsJsonArray("properties");
        if (jsonArrayproperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("properties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", jsonObj.get("properties").toString()));
          }

          // validate the optional field `properties` (array)
          for (int i = 0; i < jsonArrayproperties.size(); i++) {
            EntityProperty.validateJsonElement(jsonArrayproperties.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueUpdateDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueUpdateDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueUpdateDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueUpdateDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueUpdateDetails>() {
           @Override
           public void write(JsonWriter out, IssueUpdateDetails value) throws IOException {
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
           public IssueUpdateDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             IssueUpdateDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of IssueUpdateDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssueUpdateDetails
   * @throws IOException if the JSON string is invalid with respect to IssueUpdateDetails
   */
  public static IssueUpdateDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueUpdateDetails.class);
  }

  /**
   * Convert an instance of IssueUpdateDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

