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
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-05T13:52:26.392070-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class Associations {
  /**
   * the type of the association being made
   */
  @JsonAdapter(AssociationTypeEnum.Adapter.class)
  public enum AssociationTypeEnum {
    ISSUE_ID_OR_KEYS("issueIdOrKeys"),
    
    SERVICE_ID_OR_KEYS("serviceIdOrKeys"),
    
    ATI_CLOUD_COMPASS_EVENT_SOURCE("ati:cloud:compass:event-source");

    private String value;

    AssociationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AssociationTypeEnum fromValue(String value) {
      for (AssociationTypeEnum b : AssociationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AssociationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssociationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AssociationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AssociationTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AssociationTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ASSOCIATION_TYPE = "associationType";
  @SerializedName(SERIALIZED_NAME_ASSOCIATION_TYPE)
  @javax.annotation.Nullable
  private AssociationTypeEnum associationType;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  @javax.annotation.Nullable
  private List<String> values = new ArrayList<>();

  public Associations() {
  }

  public Associations associationType(@javax.annotation.Nullable AssociationTypeEnum associationType) {
    this.associationType = associationType;
    return this;
  }

  /**
   * the type of the association being made
   * @return associationType
   */
  @javax.annotation.Nullable
  public AssociationTypeEnum getAssociationType() {
    return associationType;
  }

  public void setAssociationType(@javax.annotation.Nullable AssociationTypeEnum associationType) {
    this.associationType = associationType;
  }


  public Associations values(@javax.annotation.Nullable List<String> values) {
    this.values = values;
    return this;
  }

  public Associations addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   */
  @javax.annotation.Nullable
  public List<String> getValues() {
    return values;
  }

  public void setValues(@javax.annotation.Nullable List<String> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Associations associations = (Associations) o;
    return Objects.equals(this.associationType, associations.associationType) &&
        Objects.equals(this.values, associations.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associationType, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Associations {\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
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
    openapiFields.add("associationType");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Associations
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Associations.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Associations is not found in the empty JSON string", Associations.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Associations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Associations` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("associationType") != null && !jsonObj.get("associationType").isJsonNull()) && !jsonObj.get("associationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `associationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("associationType").toString()));
      }
      // validate the optional field `associationType`
      if (jsonObj.get("associationType") != null && !jsonObj.get("associationType").isJsonNull()) {
        AssociationTypeEnum.validateJsonElement(jsonObj.get("associationType"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull() && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Associations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Associations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Associations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Associations.class));

       return (TypeAdapter<T>) new TypeAdapter<Associations>() {
           @Override
           public void write(JsonWriter out, Associations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Associations read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Associations given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Associations
   * @throws IOException if the JSON string is invalid with respect to Associations
   */
  public static Associations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Associations.class);
  }

  /**
   * Convert an instance of Associations to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

