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
import com.atlassian.jira.platform.model.DashboardGadgetPosition;
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
 * The details of the gadget to update.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class DashboardGadgetUpdateRequest {
  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  @javax.annotation.Nullable
  private String color;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  @javax.annotation.Nullable
  private DashboardGadgetPosition position;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nullable
  private String title;

  public DashboardGadgetUpdateRequest() {
  }

  public DashboardGadgetUpdateRequest color(@javax.annotation.Nullable String color) {
    this.color = color;
    return this;
  }

  /**
   * The color of the gadget. Should be one of &#x60;blue&#x60;, &#x60;red&#x60;, &#x60;yellow&#x60;, &#x60;green&#x60;, &#x60;cyan&#x60;, &#x60;purple&#x60;, &#x60;gray&#x60;, or &#x60;white&#x60;.
   * @return color
   */
  @javax.annotation.Nullable
  public String getColor() {
    return color;
  }

  public void setColor(@javax.annotation.Nullable String color) {
    this.color = color;
  }


  public DashboardGadgetUpdateRequest position(@javax.annotation.Nullable DashboardGadgetPosition position) {
    this.position = position;
    return this;
  }

  /**
   * The position of the gadget.
   * @return position
   */
  @javax.annotation.Nullable
  public DashboardGadgetPosition getPosition() {
    return position;
  }

  public void setPosition(@javax.annotation.Nullable DashboardGadgetPosition position) {
    this.position = position;
  }


  public DashboardGadgetUpdateRequest title(@javax.annotation.Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the gadget.
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardGadgetUpdateRequest dashboardGadgetUpdateRequest = (DashboardGadgetUpdateRequest) o;
    return Objects.equals(this.color, dashboardGadgetUpdateRequest.color) &&
        Objects.equals(this.position, dashboardGadgetUpdateRequest.position) &&
        Objects.equals(this.title, dashboardGadgetUpdateRequest.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, position, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardGadgetUpdateRequest {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("color");
    openapiFields.add("position");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DashboardGadgetUpdateRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DashboardGadgetUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DashboardGadgetUpdateRequest is not found in the empty JSON string", DashboardGadgetUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DashboardGadgetUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DashboardGadgetUpdateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      // validate the optional field `position`
      if (jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) {
        DashboardGadgetPosition.validateJsonElement(jsonObj.get("position"));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DashboardGadgetUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DashboardGadgetUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DashboardGadgetUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DashboardGadgetUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DashboardGadgetUpdateRequest>() {
           @Override
           public void write(JsonWriter out, DashboardGadgetUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DashboardGadgetUpdateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DashboardGadgetUpdateRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DashboardGadgetUpdateRequest
   * @throws IOException if the JSON string is invalid with respect to DashboardGadgetUpdateRequest
   */
  public static DashboardGadgetUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DashboardGadgetUpdateRequest.class);
  }

  /**
   * Convert an instance of DashboardGadgetUpdateRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

