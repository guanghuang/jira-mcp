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
 * GetPlanOnlyTeamResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class GetPlanOnlyTeamResponse {
  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  @javax.annotation.Nullable
  private Double capacity;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private Long id;

  public static final String SERIALIZED_NAME_ISSUE_SOURCE_ID = "issueSourceId";
  @SerializedName(SERIALIZED_NAME_ISSUE_SOURCE_ID)
  @javax.annotation.Nullable
  private Long issueSourceId;

  public static final String SERIALIZED_NAME_MEMBER_ACCOUNT_IDS = "memberAccountIds";
  @SerializedName(SERIALIZED_NAME_MEMBER_ACCOUNT_IDS)
  @javax.annotation.Nullable
  private List<String> memberAccountIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  /**
   * The planning style for the plan-only team. This is \&quot;Scrum\&quot; or \&quot;Kanban\&quot;.
   */
  @JsonAdapter(PlanningStyleEnum.Adapter.class)
  public enum PlanningStyleEnum {
    SCRUM("Scrum"),
    
    KANBAN("Kanban");

    private String value;

    PlanningStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlanningStyleEnum fromValue(String value) {
      for (PlanningStyleEnum b : PlanningStyleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlanningStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlanningStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlanningStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlanningStyleEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PlanningStyleEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PLANNING_STYLE = "planningStyle";
  @SerializedName(SERIALIZED_NAME_PLANNING_STYLE)
  @javax.annotation.Nonnull
  private PlanningStyleEnum planningStyle;

  public static final String SERIALIZED_NAME_SPRINT_LENGTH = "sprintLength";
  @SerializedName(SERIALIZED_NAME_SPRINT_LENGTH)
  @javax.annotation.Nullable
  private Long sprintLength;

  public GetPlanOnlyTeamResponse() {
  }

  public GetPlanOnlyTeamResponse capacity(@javax.annotation.Nullable Double capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * The capacity for the plan-only team.
   * @return capacity
   */
  @javax.annotation.Nullable
  public Double getCapacity() {
    return capacity;
  }

  public void setCapacity(@javax.annotation.Nullable Double capacity) {
    this.capacity = capacity;
  }


  public GetPlanOnlyTeamResponse id(@javax.annotation.Nonnull Long id) {
    this.id = id;
    return this;
  }

  /**
   * The plan-only team ID.
   * @return id
   */
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull Long id) {
    this.id = id;
  }


  public GetPlanOnlyTeamResponse issueSourceId(@javax.annotation.Nullable Long issueSourceId) {
    this.issueSourceId = issueSourceId;
    return this;
  }

  /**
   * The ID of the issue source for the plan-only team.
   * @return issueSourceId
   */
  @javax.annotation.Nullable
  public Long getIssueSourceId() {
    return issueSourceId;
  }

  public void setIssueSourceId(@javax.annotation.Nullable Long issueSourceId) {
    this.issueSourceId = issueSourceId;
  }


  public GetPlanOnlyTeamResponse memberAccountIds(@javax.annotation.Nullable List<String> memberAccountIds) {
    this.memberAccountIds = memberAccountIds;
    return this;
  }

  public GetPlanOnlyTeamResponse addMemberAccountIdsItem(String memberAccountIdsItem) {
    if (this.memberAccountIds == null) {
      this.memberAccountIds = new ArrayList<>();
    }
    this.memberAccountIds.add(memberAccountIdsItem);
    return this;
  }

  /**
   * The account IDs of the plan-only team members.
   * @return memberAccountIds
   */
  @javax.annotation.Nullable
  public List<String> getMemberAccountIds() {
    return memberAccountIds;
  }

  public void setMemberAccountIds(@javax.annotation.Nullable List<String> memberAccountIds) {
    this.memberAccountIds = memberAccountIds;
  }


  public GetPlanOnlyTeamResponse name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The plan-only team name.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GetPlanOnlyTeamResponse planningStyle(@javax.annotation.Nonnull PlanningStyleEnum planningStyle) {
    this.planningStyle = planningStyle;
    return this;
  }

  /**
   * The planning style for the plan-only team. This is \&quot;Scrum\&quot; or \&quot;Kanban\&quot;.
   * @return planningStyle
   */
  @javax.annotation.Nonnull
  public PlanningStyleEnum getPlanningStyle() {
    return planningStyle;
  }

  public void setPlanningStyle(@javax.annotation.Nonnull PlanningStyleEnum planningStyle) {
    this.planningStyle = planningStyle;
  }


  public GetPlanOnlyTeamResponse sprintLength(@javax.annotation.Nullable Long sprintLength) {
    this.sprintLength = sprintLength;
    return this;
  }

  /**
   * The sprint length for the plan-only team.
   * @return sprintLength
   */
  @javax.annotation.Nullable
  public Long getSprintLength() {
    return sprintLength;
  }

  public void setSprintLength(@javax.annotation.Nullable Long sprintLength) {
    this.sprintLength = sprintLength;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPlanOnlyTeamResponse getPlanOnlyTeamResponse = (GetPlanOnlyTeamResponse) o;
    return Objects.equals(this.capacity, getPlanOnlyTeamResponse.capacity) &&
        Objects.equals(this.id, getPlanOnlyTeamResponse.id) &&
        Objects.equals(this.issueSourceId, getPlanOnlyTeamResponse.issueSourceId) &&
        Objects.equals(this.memberAccountIds, getPlanOnlyTeamResponse.memberAccountIds) &&
        Objects.equals(this.name, getPlanOnlyTeamResponse.name) &&
        Objects.equals(this.planningStyle, getPlanOnlyTeamResponse.planningStyle) &&
        Objects.equals(this.sprintLength, getPlanOnlyTeamResponse.sprintLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, id, issueSourceId, memberAccountIds, name, planningStyle, sprintLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPlanOnlyTeamResponse {\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueSourceId: ").append(toIndentedString(issueSourceId)).append("\n");
    sb.append("    memberAccountIds: ").append(toIndentedString(memberAccountIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    planningStyle: ").append(toIndentedString(planningStyle)).append("\n");
    sb.append("    sprintLength: ").append(toIndentedString(sprintLength)).append("\n");
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
    openapiFields.add("capacity");
    openapiFields.add("id");
    openapiFields.add("issueSourceId");
    openapiFields.add("memberAccountIds");
    openapiFields.add("name");
    openapiFields.add("planningStyle");
    openapiFields.add("sprintLength");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("planningStyle");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPlanOnlyTeamResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPlanOnlyTeamResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPlanOnlyTeamResponse is not found in the empty JSON string", GetPlanOnlyTeamResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPlanOnlyTeamResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPlanOnlyTeamResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetPlanOnlyTeamResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("memberAccountIds") != null && !jsonObj.get("memberAccountIds").isJsonNull() && !jsonObj.get("memberAccountIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `memberAccountIds` to be an array in the JSON string but got `%s`", jsonObj.get("memberAccountIds").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("planningStyle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `planningStyle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("planningStyle").toString()));
      }
      // validate the required field `planningStyle`
      PlanningStyleEnum.validateJsonElement(jsonObj.get("planningStyle"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPlanOnlyTeamResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPlanOnlyTeamResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPlanOnlyTeamResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPlanOnlyTeamResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPlanOnlyTeamResponse>() {
           @Override
           public void write(JsonWriter out, GetPlanOnlyTeamResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPlanOnlyTeamResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPlanOnlyTeamResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPlanOnlyTeamResponse
   * @throws IOException if the JSON string is invalid with respect to GetPlanOnlyTeamResponse
   */
  public static GetPlanOnlyTeamResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPlanOnlyTeamResponse.class);
  }

  /**
   * Convert an instance of GetPlanOnlyTeamResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

