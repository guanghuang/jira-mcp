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
import com.atlassian.jira.platform.model.FieldConfigurationScheme;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
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
 * A page of items.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class PageBeanFieldConfigurationScheme {
  public static final String SERIALIZED_NAME_IS_LAST = "isLast";
  @SerializedName(SERIALIZED_NAME_IS_LAST)
  @javax.annotation.Nullable
  private Boolean isLast;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  @javax.annotation.Nullable
  private Integer maxResults;

  public static final String SERIALIZED_NAME_NEXT_PAGE = "nextPage";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  @javax.annotation.Nullable
  private URI nextPage;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  @javax.annotation.Nullable
  private URI self;

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  @javax.annotation.Nullable
  private Long startAt;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private Long total;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  @javax.annotation.Nullable
  private List<FieldConfigurationScheme> values = new ArrayList<>();

  public PageBeanFieldConfigurationScheme() {
  }

  public PageBeanFieldConfigurationScheme(
     Boolean isLast, 
     Integer maxResults, 
     URI nextPage, 
     URI self, 
     Long startAt, 
     Long total, 
     List<FieldConfigurationScheme> values
  ) {
    this();
    this.isLast = isLast;
    this.maxResults = maxResults;
    this.nextPage = nextPage;
    this.self = self;
    this.startAt = startAt;
    this.total = total;
    this.values = values;
  }

  /**
   * Whether this is the last page.
   * @return isLast
   */
  @javax.annotation.Nullable
  public Boolean getIsLast() {
    return isLast;
  }



  /**
   * The maximum number of items that could be returned.
   * @return maxResults
   */
  @javax.annotation.Nullable
  public Integer getMaxResults() {
    return maxResults;
  }



  /**
   * If there is another page of results, the URL of the next page.
   * @return nextPage
   */
  @javax.annotation.Nullable
  public URI getNextPage() {
    return nextPage;
  }



  /**
   * The URL of the page.
   * @return self
   */
  @javax.annotation.Nullable
  public URI getSelf() {
    return self;
  }



  /**
   * The index of the first item returned.
   * @return startAt
   */
  @javax.annotation.Nullable
  public Long getStartAt() {
    return startAt;
  }



  /**
   * The number of items returned.
   * @return total
   */
  @javax.annotation.Nullable
  public Long getTotal() {
    return total;
  }



  /**
   * The list of items.
   * @return values
   */
  @javax.annotation.Nullable
  public List<FieldConfigurationScheme> getValues() {
    return values;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageBeanFieldConfigurationScheme pageBeanFieldConfigurationScheme = (PageBeanFieldConfigurationScheme) o;
    return Objects.equals(this.isLast, pageBeanFieldConfigurationScheme.isLast) &&
        Objects.equals(this.maxResults, pageBeanFieldConfigurationScheme.maxResults) &&
        Objects.equals(this.nextPage, pageBeanFieldConfigurationScheme.nextPage) &&
        Objects.equals(this.self, pageBeanFieldConfigurationScheme.self) &&
        Objects.equals(this.startAt, pageBeanFieldConfigurationScheme.startAt) &&
        Objects.equals(this.total, pageBeanFieldConfigurationScheme.total) &&
        Objects.equals(this.values, pageBeanFieldConfigurationScheme.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLast, maxResults, nextPage, self, startAt, total, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageBeanFieldConfigurationScheme {\n");
    sb.append("    isLast: ").append(toIndentedString(isLast)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("isLast");
    openapiFields.add("maxResults");
    openapiFields.add("nextPage");
    openapiFields.add("self");
    openapiFields.add("startAt");
    openapiFields.add("total");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PageBeanFieldConfigurationScheme
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PageBeanFieldConfigurationScheme.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageBeanFieldConfigurationScheme is not found in the empty JSON string", PageBeanFieldConfigurationScheme.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PageBeanFieldConfigurationScheme.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageBeanFieldConfigurationScheme` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nextPage") != null && !jsonObj.get("nextPage").isJsonNull()) && !jsonObj.get("nextPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPage").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull()) {
        JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
        if (jsonArrayvalues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("values").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
          }

          // validate the optional field `values` (array)
          for (int i = 0; i < jsonArrayvalues.size(); i++) {
            FieldConfigurationScheme.validateJsonElement(jsonArrayvalues.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageBeanFieldConfigurationScheme.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageBeanFieldConfigurationScheme' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageBeanFieldConfigurationScheme> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageBeanFieldConfigurationScheme.class));

       return (TypeAdapter<T>) new TypeAdapter<PageBeanFieldConfigurationScheme>() {
           @Override
           public void write(JsonWriter out, PageBeanFieldConfigurationScheme value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageBeanFieldConfigurationScheme read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PageBeanFieldConfigurationScheme given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PageBeanFieldConfigurationScheme
   * @throws IOException if the JSON string is invalid with respect to PageBeanFieldConfigurationScheme
   */
  public static PageBeanFieldConfigurationScheme fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageBeanFieldConfigurationScheme.class);
  }

  /**
   * Convert an instance of PageBeanFieldConfigurationScheme to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

