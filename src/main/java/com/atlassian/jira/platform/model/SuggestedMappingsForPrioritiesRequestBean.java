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
 * Details of changes to a priority scheme&#39;s priorities that require suggested priority mappings.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class SuggestedMappingsForPrioritiesRequestBean {
  public static final String SERIALIZED_NAME_ADD = "add";
  @SerializedName(SERIALIZED_NAME_ADD)
  @javax.annotation.Nullable
  private List<Long> add = new ArrayList<>();

  public static final String SERIALIZED_NAME_REMOVE = "remove";
  @SerializedName(SERIALIZED_NAME_REMOVE)
  @javax.annotation.Nullable
  private List<Long> remove = new ArrayList<>();

  public SuggestedMappingsForPrioritiesRequestBean() {
  }

  public SuggestedMappingsForPrioritiesRequestBean add(@javax.annotation.Nullable List<Long> add) {
    this.add = add;
    return this;
  }

  public SuggestedMappingsForPrioritiesRequestBean addAddItem(Long addItem) {
    if (this.add == null) {
      this.add = new ArrayList<>();
    }
    this.add.add(addItem);
    return this;
  }

  /**
   * The ids of priorities being removed from the scheme.
   * @return add
   */
  @javax.annotation.Nullable
  public List<Long> getAdd() {
    return add;
  }

  public void setAdd(@javax.annotation.Nullable List<Long> add) {
    this.add = add;
  }


  public SuggestedMappingsForPrioritiesRequestBean remove(@javax.annotation.Nullable List<Long> remove) {
    this.remove = remove;
    return this;
  }

  public SuggestedMappingsForPrioritiesRequestBean addRemoveItem(Long removeItem) {
    if (this.remove == null) {
      this.remove = new ArrayList<>();
    }
    this.remove.add(removeItem);
    return this;
  }

  /**
   * The ids of priorities being removed from the scheme.
   * @return remove
   */
  @javax.annotation.Nullable
  public List<Long> getRemove() {
    return remove;
  }

  public void setRemove(@javax.annotation.Nullable List<Long> remove) {
    this.remove = remove;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestedMappingsForPrioritiesRequestBean suggestedMappingsForPrioritiesRequestBean = (SuggestedMappingsForPrioritiesRequestBean) o;
    return Objects.equals(this.add, suggestedMappingsForPrioritiesRequestBean.add) &&
        Objects.equals(this.remove, suggestedMappingsForPrioritiesRequestBean.remove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, remove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestedMappingsForPrioritiesRequestBean {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    remove: ").append(toIndentedString(remove)).append("\n");
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
    openapiFields.add("add");
    openapiFields.add("remove");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SuggestedMappingsForPrioritiesRequestBean
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SuggestedMappingsForPrioritiesRequestBean.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuggestedMappingsForPrioritiesRequestBean is not found in the empty JSON string", SuggestedMappingsForPrioritiesRequestBean.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SuggestedMappingsForPrioritiesRequestBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuggestedMappingsForPrioritiesRequestBean` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("add") != null && !jsonObj.get("add").isJsonNull() && !jsonObj.get("add").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `add` to be an array in the JSON string but got `%s`", jsonObj.get("add").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("remove") != null && !jsonObj.get("remove").isJsonNull() && !jsonObj.get("remove").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `remove` to be an array in the JSON string but got `%s`", jsonObj.get("remove").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggestedMappingsForPrioritiesRequestBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggestedMappingsForPrioritiesRequestBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggestedMappingsForPrioritiesRequestBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggestedMappingsForPrioritiesRequestBean.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggestedMappingsForPrioritiesRequestBean>() {
           @Override
           public void write(JsonWriter out, SuggestedMappingsForPrioritiesRequestBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuggestedMappingsForPrioritiesRequestBean read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SuggestedMappingsForPrioritiesRequestBean given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SuggestedMappingsForPrioritiesRequestBean
   * @throws IOException if the JSON string is invalid with respect to SuggestedMappingsForPrioritiesRequestBean
   */
  public static SuggestedMappingsForPrioritiesRequestBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggestedMappingsForPrioritiesRequestBean.class);
  }

  /**
   * Convert an instance of SuggestedMappingsForPrioritiesRequestBean to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

