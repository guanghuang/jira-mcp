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
 * PartiallyUpdateEpicRequestColor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-05T13:52:26.392070-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class PartiallyUpdateEpicRequestColor {
  /**
   * Gets or Sets key
   */
  @JsonAdapter(KeyEnum.Adapter.class)
  public enum KeyEnum {
    COLOR_1("color_1"),
    
    COLOR_2("color_2"),
    
    COLOR_3("color_3"),
    
    COLOR_4("color_4"),
    
    COLOR_5("color_5"),
    
    COLOR_6("color_6"),
    
    COLOR_7("color_7"),
    
    COLOR_8("color_8"),
    
    COLOR_9("color_9"),
    
    COLOR_10("color_10"),
    
    COLOR_11("color_11"),
    
    COLOR_12("color_12"),
    
    COLOR_13("color_13"),
    
    COLOR_14("color_14");

    private String value;

    KeyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyEnum fromValue(String value) {
      for (KeyEnum b : KeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KeyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      KeyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nullable
  private KeyEnum key;

  public PartiallyUpdateEpicRequestColor() {
  }

  public PartiallyUpdateEpicRequestColor key(@javax.annotation.Nullable KeyEnum key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nullable
  public KeyEnum getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nullable KeyEnum key) {
    this.key = key;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartiallyUpdateEpicRequestColor partiallyUpdateEpicRequestColor = (PartiallyUpdateEpicRequestColor) o;
    return Objects.equals(this.key, partiallyUpdateEpicRequestColor.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartiallyUpdateEpicRequestColor {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PartiallyUpdateEpicRequestColor
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PartiallyUpdateEpicRequestColor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartiallyUpdateEpicRequestColor is not found in the empty JSON string", PartiallyUpdateEpicRequestColor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PartiallyUpdateEpicRequestColor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PartiallyUpdateEpicRequestColor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      // validate the optional field `key`
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) {
        KeyEnum.validateJsonElement(jsonObj.get("key"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartiallyUpdateEpicRequestColor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartiallyUpdateEpicRequestColor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartiallyUpdateEpicRequestColor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartiallyUpdateEpicRequestColor.class));

       return (TypeAdapter<T>) new TypeAdapter<PartiallyUpdateEpicRequestColor>() {
           @Override
           public void write(JsonWriter out, PartiallyUpdateEpicRequestColor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PartiallyUpdateEpicRequestColor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PartiallyUpdateEpicRequestColor given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PartiallyUpdateEpicRequestColor
   * @throws IOException if the JSON string is invalid with respect to PartiallyUpdateEpicRequestColor
   */
  public static PartiallyUpdateEpicRequestColor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartiallyUpdateEpicRequestColor.class);
  }

  /**
   * Convert an instance of PartiallyUpdateEpicRequestColor to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

