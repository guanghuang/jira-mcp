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
import com.atlassian.jira.software.model.DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf;
import com.atlassian.jira.software.model.DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.atlassian.jira.invoker.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-05T13:52:26.392070-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class DeploymentDataAssociationsInnerAnyOf2ValuesInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(DeploymentDataAssociationsInnerAnyOf2ValuesInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeploymentDataAssociationsInnerAnyOf2ValuesInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeploymentDataAssociationsInnerAnyOf2ValuesInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf> adapterDeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf = gson.getDelegateAdapter(this, TypeToken.get(DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf.class));
            final TypeAdapter<DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1> adapterDeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1 = gson.getDelegateAdapter(this, TypeToken.get(DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<DeploymentDataAssociationsInnerAnyOf2ValuesInner>() {
                @Override
                public void write(JsonWriter out, DeploymentDataAssociationsInnerAnyOf2ValuesInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf`
                    if (value.getActualInstance() instanceof DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf) {
                        JsonElement element = adapterDeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf.toJsonTree((DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1`
                    if (value.getActualInstance() instanceof DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1) {
                        JsonElement element = adapterDeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1.toJsonTree((DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf, DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1");
                }

                @Override
                public DeploymentDataAssociationsInnerAnyOf2ValuesInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterDeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf;
                        DeploymentDataAssociationsInnerAnyOf2ValuesInner ret = new DeploymentDataAssociationsInnerAnyOf2ValuesInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf'", e);
                    }
                    // deserialize DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterDeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1;
                        DeploymentDataAssociationsInnerAnyOf2ValuesInner ret = new DeploymentDataAssociationsInnerAnyOf2ValuesInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for DeploymentDataAssociationsInnerAnyOf2ValuesInner: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public DeploymentDataAssociationsInnerAnyOf2ValuesInner() {
        super("anyOf", Boolean.FALSE);
    }

    public DeploymentDataAssociationsInnerAnyOf2ValuesInner(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf", DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf.class);
        schemas.put("DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1", DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return DeploymentDataAssociationsInnerAnyOf2ValuesInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf, DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf, DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf, DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1
     *
     * @return The actual instance (DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf, DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf`. If the actual instance is not `DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf`
     * @throws ClassCastException if the instance is not `DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf`
     */
    public DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf getDeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf() throws ClassCastException {
        return (DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1`. If the actual instance is not `DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1`
     * @throws ClassCastException if the instance is not `DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1`
     */
    public DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1 getDeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1() throws ClassCastException {
        return (DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DeploymentDataAssociationsInnerAnyOf2ValuesInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf
        try {
            DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1
        try {
            DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for DeploymentDataAssociationsInnerAnyOf2ValuesInner with anyOf schemas: DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf, DeploymentDataAssociationsInnerAnyOf2ValuesInnerAnyOf1. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of DeploymentDataAssociationsInnerAnyOf2ValuesInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeploymentDataAssociationsInnerAnyOf2ValuesInner
     * @throws IOException if the JSON string is invalid with respect to DeploymentDataAssociationsInnerAnyOf2ValuesInner
     */
    public static DeploymentDataAssociationsInnerAnyOf2ValuesInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DeploymentDataAssociationsInnerAnyOf2ValuesInner.class);
    }

    /**
     * Convert an instance of DeploymentDataAssociationsInnerAnyOf2ValuesInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

