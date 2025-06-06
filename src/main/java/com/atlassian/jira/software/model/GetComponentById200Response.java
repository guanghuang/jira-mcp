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
import java.net.URI;
import java.time.OffsetDateTime;
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
 * Data related to a specific component in a specific workspace that is affected by incidents. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-05T13:52:26.392070-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class GetComponentById200Response {
  /**
   * The DevOpsComponentData schema version used for this devops component data.  Placeholder to support potential schema changes in the future. 
   */
  @JsonAdapter(SchemaVersionEnum.Adapter.class)
  public enum SchemaVersionEnum {
    _1_0("1.0");

    private String value;

    SchemaVersionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SchemaVersionEnum fromValue(String value) {
      for (SchemaVersionEnum b : SchemaVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SchemaVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SchemaVersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SchemaVersionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SchemaVersionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SchemaVersionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schemaVersion";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  @javax.annotation.Nonnull
  private SchemaVersionEnum schemaVersion = SchemaVersionEnum._1_0;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_UPDATE_SEQUENCE_NUMBER = "updateSequenceNumber";
  @SerializedName(SERIALIZED_NAME_UPDATE_SEQUENCE_NUMBER)
  @javax.annotation.Nonnull
  private Long updateSequenceNumber;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  @javax.annotation.Nullable
  private String providerName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nonnull
  private URI url;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatarUrl";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  @javax.annotation.Nonnull
  private URI avatarUrl;

  /**
   * The tier of the component. Will be shown in the UI. 
   */
  @JsonAdapter(TierEnum.Adapter.class)
  public enum TierEnum {
    TIER_1("Tier 1"),
    
    TIER_2("Tier 2"),
    
    TIER_3("Tier 3"),
    
    TIER_4("Tier 4");

    private String value;

    TierEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TierEnum fromValue(String value) {
      for (TierEnum b : TierEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TierEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TierEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TierEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TierEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TierEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TIER = "tier";
  @SerializedName(SERIALIZED_NAME_TIER)
  @javax.annotation.Nonnull
  private TierEnum tier;

  /**
   * The type of the component. Will be shown in the UI. 
   */
  @JsonAdapter(ComponentTypeEnum.Adapter.class)
  public enum ComponentTypeEnum {
    SERVICE("Service"),
    
    APPLICATION("Application"),
    
    LIBRARY("Library"),
    
    CAPABILITY("Capability"),
    
    CLOUD_RESOURCE("Cloud resource"),
    
    DATA_PIPELINE("Data pipeline"),
    
    MACHINE_LEARNING_MODEL("Machine learning model"),
    
    UI_ELEMENT("UI element"),
    
    WEBSITE("Website"),
    
    OTHER("Other");

    private String value;

    ComponentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ComponentTypeEnum fromValue(String value) {
      for (ComponentTypeEnum b : ComponentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ComponentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComponentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ComponentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ComponentTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ComponentTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_COMPONENT_TYPE = "componentType";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPE)
  @javax.annotation.Nonnull
  private ComponentTypeEnum componentType;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  @javax.annotation.Nonnull
  private OffsetDateTime lastUpdated;

  public GetComponentById200Response() {
  }

  public GetComponentById200Response schemaVersion(@javax.annotation.Nonnull SchemaVersionEnum schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }

  /**
   * The DevOpsComponentData schema version used for this devops component data.  Placeholder to support potential schema changes in the future. 
   * @return schemaVersion
   */
  @javax.annotation.Nonnull
  public SchemaVersionEnum getSchemaVersion() {
    return schemaVersion;
  }

  public void setSchemaVersion(@javax.annotation.Nonnull SchemaVersionEnum schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  public GetComponentById200Response id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for the DevOps Component. Must be unique for a given Provider. 
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public GetComponentById200Response updateSequenceNumber(@javax.annotation.Nonnull Long updateSequenceNumber) {
    this.updateSequenceNumber = updateSequenceNumber;
    return this;
  }

  /**
   * An ID used to apply an ordering to updates for this DevOps Component in the case of out-of-order receipt of update requests.  This can be any monotonically increasing number. A suggested implementation is to use epoch millis from the Provider system, but other alternatives are valid (e.g. a Provider could store a counter against each DevOps Component and increment that on each update to Jira).  Updates for a DevOps Component that are received with an updateSqeuenceId lower than what is currently stored will be ignored. 
   * @return updateSequenceNumber
   */
  @javax.annotation.Nonnull
  public Long getUpdateSequenceNumber() {
    return updateSequenceNumber;
  }

  public void setUpdateSequenceNumber(@javax.annotation.Nonnull Long updateSequenceNumber) {
    this.updateSequenceNumber = updateSequenceNumber;
  }


  public GetComponentById200Response name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The human-readable name for the DevOps Component. Will be shown in the UI. 
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GetComponentById200Response providerName(@javax.annotation.Nullable String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * The human-readable name for the Provider that owns this DevOps Component. Will be shown in the UI. 
   * @return providerName
   */
  @javax.annotation.Nullable
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(@javax.annotation.Nullable String providerName) {
    this.providerName = providerName;
  }


  public GetComponentById200Response description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the DevOps Component in Markdown format. Will be shown in the UI. 
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public GetComponentById200Response url(@javax.annotation.Nonnull URI url) {
    this.url = url;
    return this;
  }

  /**
   * A URL users can use to link to a summary view of this devops component, if appropriate.  This could be any location that makes sense in the Provider system (e.g. if the summary information comes from a specific project, it might make sense to link the user to the component in that project). 
   * @return url
   */
  @javax.annotation.Nonnull
  public URI getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nonnull URI url) {
    this.url = url;
  }


  public GetComponentById200Response avatarUrl(@javax.annotation.Nonnull URI avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * A URL to display a logo representing this devops component, if available. 
   * @return avatarUrl
   */
  @javax.annotation.Nonnull
  public URI getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(@javax.annotation.Nonnull URI avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public GetComponentById200Response tier(@javax.annotation.Nonnull TierEnum tier) {
    this.tier = tier;
    return this;
  }

  /**
   * The tier of the component. Will be shown in the UI. 
   * @return tier
   */
  @javax.annotation.Nonnull
  public TierEnum getTier() {
    return tier;
  }

  public void setTier(@javax.annotation.Nonnull TierEnum tier) {
    this.tier = tier;
  }


  public GetComponentById200Response componentType(@javax.annotation.Nonnull ComponentTypeEnum componentType) {
    this.componentType = componentType;
    return this;
  }

  /**
   * The type of the component. Will be shown in the UI. 
   * @return componentType
   */
  @javax.annotation.Nonnull
  public ComponentTypeEnum getComponentType() {
    return componentType;
  }

  public void setComponentType(@javax.annotation.Nonnull ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }


  public GetComponentById200Response lastUpdated(@javax.annotation.Nonnull OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * The last-updated timestamp to present to the user the last time the DevOps Component was updated.  Expected format is an RFC3339 formatted string. 
   * @return lastUpdated
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(@javax.annotation.Nonnull OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetComponentById200Response getComponentById200Response = (GetComponentById200Response) o;
    return Objects.equals(this.schemaVersion, getComponentById200Response.schemaVersion) &&
        Objects.equals(this.id, getComponentById200Response.id) &&
        Objects.equals(this.updateSequenceNumber, getComponentById200Response.updateSequenceNumber) &&
        Objects.equals(this.name, getComponentById200Response.name) &&
        Objects.equals(this.providerName, getComponentById200Response.providerName) &&
        Objects.equals(this.description, getComponentById200Response.description) &&
        Objects.equals(this.url, getComponentById200Response.url) &&
        Objects.equals(this.avatarUrl, getComponentById200Response.avatarUrl) &&
        Objects.equals(this.tier, getComponentById200Response.tier) &&
        Objects.equals(this.componentType, getComponentById200Response.componentType) &&
        Objects.equals(this.lastUpdated, getComponentById200Response.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaVersion, id, updateSequenceNumber, name, providerName, description, url, avatarUrl, tier, componentType, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetComponentById200Response {\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updateSequenceNumber: ").append(toIndentedString(updateSequenceNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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
    openapiFields.add("schemaVersion");
    openapiFields.add("id");
    openapiFields.add("updateSequenceNumber");
    openapiFields.add("name");
    openapiFields.add("providerName");
    openapiFields.add("description");
    openapiFields.add("url");
    openapiFields.add("avatarUrl");
    openapiFields.add("tier");
    openapiFields.add("componentType");
    openapiFields.add("lastUpdated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemaVersion");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("updateSequenceNumber");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("avatarUrl");
    openapiRequiredFields.add("tier");
    openapiRequiredFields.add("componentType");
    openapiRequiredFields.add("lastUpdated");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetComponentById200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetComponentById200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetComponentById200Response is not found in the empty JSON string", GetComponentById200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetComponentById200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetComponentById200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetComponentById200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("schemaVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemaVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schemaVersion").toString()));
      }
      // validate the required field `schemaVersion`
      SchemaVersionEnum.validateJsonElement(jsonObj.get("schemaVersion"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("providerName") != null && !jsonObj.get("providerName").isJsonNull()) && !jsonObj.get("providerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerName").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("avatarUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarUrl").toString()));
      }
      if (!jsonObj.get("tier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tier").toString()));
      }
      // validate the required field `tier`
      TierEnum.validateJsonElement(jsonObj.get("tier"));
      if (!jsonObj.get("componentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("componentType").toString()));
      }
      // validate the required field `componentType`
      ComponentTypeEnum.validateJsonElement(jsonObj.get("componentType"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetComponentById200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetComponentById200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetComponentById200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetComponentById200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetComponentById200Response>() {
           @Override
           public void write(JsonWriter out, GetComponentById200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetComponentById200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetComponentById200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetComponentById200Response
   * @throws IOException if the JSON string is invalid with respect to GetComponentById200Response
   */
  public static GetComponentById200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetComponentById200Response.class);
  }

  /**
   * Convert an instance of GetComponentById200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

