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
import com.atlassian.jira.platform.model.IssueBulkTransitionForWorkflow;
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
 * Bulk Transition Get Available Transitions Response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class BulkTransitionGetAvailableTransitions {
  public static final String SERIALIZED_NAME_AVAILABLE_TRANSITIONS = "availableTransitions";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_TRANSITIONS)
  @javax.annotation.Nullable
  private List<IssueBulkTransitionForWorkflow> availableTransitions = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENDING_BEFORE = "endingBefore";
  @SerializedName(SERIALIZED_NAME_ENDING_BEFORE)
  @javax.annotation.Nullable
  private String endingBefore;

  public static final String SERIALIZED_NAME_STARTING_AFTER = "startingAfter";
  @SerializedName(SERIALIZED_NAME_STARTING_AFTER)
  @javax.annotation.Nullable
  private String startingAfter;

  public BulkTransitionGetAvailableTransitions() {
  }

  public BulkTransitionGetAvailableTransitions(
     List<IssueBulkTransitionForWorkflow> availableTransitions, 
     String endingBefore, 
     String startingAfter
  ) {
    this();
    this.availableTransitions = availableTransitions;
    this.endingBefore = endingBefore;
    this.startingAfter = startingAfter;
  }

  /**
   * List of available transitions for bulk transition operation for requested issues grouped by workflow
   * @return availableTransitions
   */
  @javax.annotation.Nullable
  public List<IssueBulkTransitionForWorkflow> getAvailableTransitions() {
    return availableTransitions;
  }



  /**
   * The end cursor for use in pagination.
   * @return endingBefore
   */
  @javax.annotation.Nullable
  public String getEndingBefore() {
    return endingBefore;
  }



  /**
   * The start cursor for use in pagination.
   * @return startingAfter
   */
  @javax.annotation.Nullable
  public String getStartingAfter() {
    return startingAfter;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkTransitionGetAvailableTransitions bulkTransitionGetAvailableTransitions = (BulkTransitionGetAvailableTransitions) o;
    return Objects.equals(this.availableTransitions, bulkTransitionGetAvailableTransitions.availableTransitions) &&
        Objects.equals(this.endingBefore, bulkTransitionGetAvailableTransitions.endingBefore) &&
        Objects.equals(this.startingAfter, bulkTransitionGetAvailableTransitions.startingAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableTransitions, endingBefore, startingAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkTransitionGetAvailableTransitions {\n");
    sb.append("    availableTransitions: ").append(toIndentedString(availableTransitions)).append("\n");
    sb.append("    endingBefore: ").append(toIndentedString(endingBefore)).append("\n");
    sb.append("    startingAfter: ").append(toIndentedString(startingAfter)).append("\n");
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
    openapiFields.add("availableTransitions");
    openapiFields.add("endingBefore");
    openapiFields.add("startingAfter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BulkTransitionGetAvailableTransitions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BulkTransitionGetAvailableTransitions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkTransitionGetAvailableTransitions is not found in the empty JSON string", BulkTransitionGetAvailableTransitions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BulkTransitionGetAvailableTransitions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BulkTransitionGetAvailableTransitions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("availableTransitions") != null && !jsonObj.get("availableTransitions").isJsonNull()) {
        JsonArray jsonArrayavailableTransitions = jsonObj.getAsJsonArray("availableTransitions");
        if (jsonArrayavailableTransitions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("availableTransitions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `availableTransitions` to be an array in the JSON string but got `%s`", jsonObj.get("availableTransitions").toString()));
          }

          // validate the optional field `availableTransitions` (array)
          for (int i = 0; i < jsonArrayavailableTransitions.size(); i++) {
            IssueBulkTransitionForWorkflow.validateJsonElement(jsonArrayavailableTransitions.get(i));
          };
        }
      }
      if ((jsonObj.get("endingBefore") != null && !jsonObj.get("endingBefore").isJsonNull()) && !jsonObj.get("endingBefore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endingBefore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endingBefore").toString()));
      }
      if ((jsonObj.get("startingAfter") != null && !jsonObj.get("startingAfter").isJsonNull()) && !jsonObj.get("startingAfter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startingAfter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startingAfter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkTransitionGetAvailableTransitions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkTransitionGetAvailableTransitions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkTransitionGetAvailableTransitions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkTransitionGetAvailableTransitions.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkTransitionGetAvailableTransitions>() {
           @Override
           public void write(JsonWriter out, BulkTransitionGetAvailableTransitions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkTransitionGetAvailableTransitions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BulkTransitionGetAvailableTransitions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BulkTransitionGetAvailableTransitions
   * @throws IOException if the JSON string is invalid with respect to BulkTransitionGetAvailableTransitions
   */
  public static BulkTransitionGetAvailableTransitions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkTransitionGetAvailableTransitions.class);
  }

  /**
   * Convert an instance of BulkTransitionGetAvailableTransitions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

