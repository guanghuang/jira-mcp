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
import com.atlassian.jira.platform.model.Comment;
import com.atlassian.jira.platform.model.IssueLinkType;
import com.atlassian.jira.platform.model.LinkedIssue;
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
 * LinkIssueRequestJsonBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class LinkIssueRequestJsonBean {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nullable
  private Comment comment;

  public static final String SERIALIZED_NAME_INWARD_ISSUE = "inwardIssue";
  @SerializedName(SERIALIZED_NAME_INWARD_ISSUE)
  @javax.annotation.Nonnull
  private LinkedIssue inwardIssue;

  public static final String SERIALIZED_NAME_OUTWARD_ISSUE = "outwardIssue";
  @SerializedName(SERIALIZED_NAME_OUTWARD_ISSUE)
  @javax.annotation.Nonnull
  private LinkedIssue outwardIssue;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private IssueLinkType type;

  public LinkIssueRequestJsonBean() {
  }

  public LinkIssueRequestJsonBean comment(@javax.annotation.Nullable Comment comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nullable
  public Comment getComment() {
    return comment;
  }

  public void setComment(@javax.annotation.Nullable Comment comment) {
    this.comment = comment;
  }


  public LinkIssueRequestJsonBean inwardIssue(@javax.annotation.Nonnull LinkedIssue inwardIssue) {
    this.inwardIssue = inwardIssue;
    return this;
  }

  /**
   * Get inwardIssue
   * @return inwardIssue
   */
  @javax.annotation.Nonnull
  public LinkedIssue getInwardIssue() {
    return inwardIssue;
  }

  public void setInwardIssue(@javax.annotation.Nonnull LinkedIssue inwardIssue) {
    this.inwardIssue = inwardIssue;
  }


  public LinkIssueRequestJsonBean outwardIssue(@javax.annotation.Nonnull LinkedIssue outwardIssue) {
    this.outwardIssue = outwardIssue;
    return this;
  }

  /**
   * Get outwardIssue
   * @return outwardIssue
   */
  @javax.annotation.Nonnull
  public LinkedIssue getOutwardIssue() {
    return outwardIssue;
  }

  public void setOutwardIssue(@javax.annotation.Nonnull LinkedIssue outwardIssue) {
    this.outwardIssue = outwardIssue;
  }


  public LinkIssueRequestJsonBean type(@javax.annotation.Nonnull IssueLinkType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public IssueLinkType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull IssueLinkType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkIssueRequestJsonBean linkIssueRequestJsonBean = (LinkIssueRequestJsonBean) o;
    return Objects.equals(this.comment, linkIssueRequestJsonBean.comment) &&
        Objects.equals(this.inwardIssue, linkIssueRequestJsonBean.inwardIssue) &&
        Objects.equals(this.outwardIssue, linkIssueRequestJsonBean.outwardIssue) &&
        Objects.equals(this.type, linkIssueRequestJsonBean.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, inwardIssue, outwardIssue, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkIssueRequestJsonBean {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    inwardIssue: ").append(toIndentedString(inwardIssue)).append("\n");
    sb.append("    outwardIssue: ").append(toIndentedString(outwardIssue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("inwardIssue");
    openapiFields.add("outwardIssue");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("inwardIssue");
    openapiRequiredFields.add("outwardIssue");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LinkIssueRequestJsonBean
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LinkIssueRequestJsonBean.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinkIssueRequestJsonBean is not found in the empty JSON string", LinkIssueRequestJsonBean.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LinkIssueRequestJsonBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinkIssueRequestJsonBean` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LinkIssueRequestJsonBean.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `inwardIssue`
      LinkedIssue.validateJsonElement(jsonObj.get("inwardIssue"));
      // validate the required field `outwardIssue`
      LinkedIssue.validateJsonElement(jsonObj.get("outwardIssue"));
      // validate the required field `type`
      IssueLinkType.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkIssueRequestJsonBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkIssueRequestJsonBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkIssueRequestJsonBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkIssueRequestJsonBean.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkIssueRequestJsonBean>() {
           @Override
           public void write(JsonWriter out, LinkIssueRequestJsonBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkIssueRequestJsonBean read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LinkIssueRequestJsonBean given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LinkIssueRequestJsonBean
   * @throws IOException if the JSON string is invalid with respect to LinkIssueRequestJsonBean
   */
  public static LinkIssueRequestJsonBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkIssueRequestJsonBean.class);
  }

  /**
   * Convert an instance of LinkIssueRequestJsonBean to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

