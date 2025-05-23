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
import com.atlassian.jira.platform.model.RoleActor;
import com.atlassian.jira.platform.model.Scope;
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
 * Details about the roles in a project.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class ProjectRole {
  public static final String SERIALIZED_NAME_ACTORS = "actors";
  @SerializedName(SERIALIZED_NAME_ACTORS)
  @javax.annotation.Nullable
  private List<RoleActor> actors = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADMIN = "admin";
  @SerializedName(SERIALIZED_NAME_ADMIN)
  @javax.annotation.Nullable
  private Boolean admin;

  public static final String SERIALIZED_NAME_CURRENT_USER_ROLE = "currentUserRole";
  @SerializedName(SERIALIZED_NAME_CURRENT_USER_ROLE)
  @javax.annotation.Nullable
  private Boolean currentUserRole;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  @javax.annotation.Nullable
  private Boolean _default;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_ROLE_CONFIGURABLE = "roleConfigurable";
  @SerializedName(SERIALIZED_NAME_ROLE_CONFIGURABLE)
  @javax.annotation.Nullable
  private Boolean roleConfigurable;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  @javax.annotation.Nullable
  private Scope scope;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  @javax.annotation.Nullable
  private URI self;

  public static final String SERIALIZED_NAME_TRANSLATED_NAME = "translatedName";
  @SerializedName(SERIALIZED_NAME_TRANSLATED_NAME)
  @javax.annotation.Nullable
  private String translatedName;

  public ProjectRole() {
  }

  public ProjectRole(
     List<RoleActor> actors, 
     Boolean admin, 
     Boolean _default, 
     String description, 
     Long id, 
     Boolean roleConfigurable, 
     Scope scope, 
     URI self
  ) {
    this();
    this.actors = actors;
    this.admin = admin;
    this._default = _default;
    this.description = description;
    this.id = id;
    this.roleConfigurable = roleConfigurable;
    this.scope = scope;
    this.self = self;
  }

  /**
   * The list of users who act in this role.
   * @return actors
   */
  @javax.annotation.Nullable
  public List<RoleActor> getActors() {
    return actors;
  }



  /**
   * Whether this role is the admin role for the project.
   * @return admin
   */
  @javax.annotation.Nullable
  public Boolean getAdmin() {
    return admin;
  }



  public ProjectRole currentUserRole(@javax.annotation.Nullable Boolean currentUserRole) {
    this.currentUserRole = currentUserRole;
    return this;
  }

  /**
   * Whether the calling user is part of this role.
   * @return currentUserRole
   */
  @javax.annotation.Nullable
  public Boolean getCurrentUserRole() {
    return currentUserRole;
  }

  public void setCurrentUserRole(@javax.annotation.Nullable Boolean currentUserRole) {
    this.currentUserRole = currentUserRole;
  }


  /**
   * Whether this role is the default role for the project
   * @return _default
   */
  @javax.annotation.Nullable
  public Boolean getDefault() {
    return _default;
  }



  /**
   * The description of the project role.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }



  /**
   * The ID of the project role.
   * @return id
   */
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }



  public ProjectRole name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the project role.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  /**
   * Whether the roles are configurable for this project.
   * @return roleConfigurable
   */
  @javax.annotation.Nullable
  public Boolean getRoleConfigurable() {
    return roleConfigurable;
  }



  /**
   * The scope of the role. Indicated for roles associated with [next-gen projects](https://confluence.atlassian.com/x/loMyO).
   * @return scope
   */
  @javax.annotation.Nullable
  public Scope getScope() {
    return scope;
  }



  /**
   * The URL the project role details.
   * @return self
   */
  @javax.annotation.Nullable
  public URI getSelf() {
    return self;
  }



  public ProjectRole translatedName(@javax.annotation.Nullable String translatedName) {
    this.translatedName = translatedName;
    return this;
  }

  /**
   * The translated name of the project role.
   * @return translatedName
   */
  @javax.annotation.Nullable
  public String getTranslatedName() {
    return translatedName;
  }

  public void setTranslatedName(@javax.annotation.Nullable String translatedName) {
    this.translatedName = translatedName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRole projectRole = (ProjectRole) o;
    return Objects.equals(this.actors, projectRole.actors) &&
        Objects.equals(this.admin, projectRole.admin) &&
        Objects.equals(this.currentUserRole, projectRole.currentUserRole) &&
        Objects.equals(this._default, projectRole._default) &&
        Objects.equals(this.description, projectRole.description) &&
        Objects.equals(this.id, projectRole.id) &&
        Objects.equals(this.name, projectRole.name) &&
        Objects.equals(this.roleConfigurable, projectRole.roleConfigurable) &&
        Objects.equals(this.scope, projectRole.scope) &&
        Objects.equals(this.self, projectRole.self) &&
        Objects.equals(this.translatedName, projectRole.translatedName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actors, admin, currentUserRole, _default, description, id, name, roleConfigurable, scope, self, translatedName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRole {\n");
    sb.append("    actors: ").append(toIndentedString(actors)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    currentUserRole: ").append(toIndentedString(currentUserRole)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roleConfigurable: ").append(toIndentedString(roleConfigurable)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    translatedName: ").append(toIndentedString(translatedName)).append("\n");
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
    openapiFields.add("actors");
    openapiFields.add("admin");
    openapiFields.add("currentUserRole");
    openapiFields.add("default");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("roleConfigurable");
    openapiFields.add("scope");
    openapiFields.add("self");
    openapiFields.add("translatedName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProjectRole
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProjectRole.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectRole is not found in the empty JSON string", ProjectRole.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProjectRole.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectRole` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("actors") != null && !jsonObj.get("actors").isJsonNull()) {
        JsonArray jsonArrayactors = jsonObj.getAsJsonArray("actors");
        if (jsonArrayactors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("actors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `actors` to be an array in the JSON string but got `%s`", jsonObj.get("actors").toString()));
          }

          // validate the optional field `actors` (array)
          for (int i = 0; i < jsonArrayactors.size(); i++) {
            RoleActor.validateJsonElement(jsonArrayactors.get(i));
          };
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("translatedName") != null && !jsonObj.get("translatedName").isJsonNull()) && !jsonObj.get("translatedName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `translatedName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("translatedName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectRole.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectRole' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectRole> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectRole.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectRole>() {
           @Override
           public void write(JsonWriter out, ProjectRole value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectRole read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProjectRole given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProjectRole
   * @throws IOException if the JSON string is invalid with respect to ProjectRole
   */
  public static ProjectRole fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectRole.class);
  }

  /**
   * Convert an instance of ProjectRole to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

