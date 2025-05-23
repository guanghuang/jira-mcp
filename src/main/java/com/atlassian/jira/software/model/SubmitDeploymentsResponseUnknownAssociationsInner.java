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
import com.atlassian.jira.software.model.DeploymentDataAssociationsInnerAnyOf;
import com.atlassian.jira.software.model.DeploymentDataAssociationsInnerAnyOf1;
import com.atlassian.jira.software.model.DeploymentDataAssociationsInnerAnyOf2;
import com.atlassian.jira.software.model.DeploymentDataAssociationsInnerAnyOf2ValuesInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



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
public class SubmitDeploymentsResponseUnknownAssociationsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SubmitDeploymentsResponseUnknownAssociationsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SubmitDeploymentsResponseUnknownAssociationsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SubmitDeploymentsResponseUnknownAssociationsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeploymentDataAssociationsInnerAnyOf> adapterDeploymentDataAssociationsInnerAnyOf = gson.getDelegateAdapter(this, TypeToken.get(DeploymentDataAssociationsInnerAnyOf.class));
            final TypeAdapter<DeploymentDataAssociationsInnerAnyOf1> adapterDeploymentDataAssociationsInnerAnyOf1 = gson.getDelegateAdapter(this, TypeToken.get(DeploymentDataAssociationsInnerAnyOf1.class));
            final TypeAdapter<DeploymentDataAssociationsInnerAnyOf2> adapterDeploymentDataAssociationsInnerAnyOf2 = gson.getDelegateAdapter(this, TypeToken.get(DeploymentDataAssociationsInnerAnyOf2.class));

            return (TypeAdapter<T>) new TypeAdapter<SubmitDeploymentsResponseUnknownAssociationsInner>() {
                @Override
                public void write(JsonWriter out, SubmitDeploymentsResponseUnknownAssociationsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `DeploymentDataAssociationsInnerAnyOf`
                    if (value.getActualInstance() instanceof DeploymentDataAssociationsInnerAnyOf) {
                        JsonElement element = adapterDeploymentDataAssociationsInnerAnyOf.toJsonTree((DeploymentDataAssociationsInnerAnyOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `DeploymentDataAssociationsInnerAnyOf1`
                    if (value.getActualInstance() instanceof DeploymentDataAssociationsInnerAnyOf1) {
                        JsonElement element = adapterDeploymentDataAssociationsInnerAnyOf1.toJsonTree((DeploymentDataAssociationsInnerAnyOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `DeploymentDataAssociationsInnerAnyOf2`
                    if (value.getActualInstance() instanceof DeploymentDataAssociationsInnerAnyOf2) {
                        JsonElement element = adapterDeploymentDataAssociationsInnerAnyOf2.toJsonTree((DeploymentDataAssociationsInnerAnyOf2)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: DeploymentDataAssociationsInnerAnyOf, DeploymentDataAssociationsInnerAnyOf1, DeploymentDataAssociationsInnerAnyOf2");
                }

                @Override
                public SubmitDeploymentsResponseUnknownAssociationsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize DeploymentDataAssociationsInnerAnyOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        DeploymentDataAssociationsInnerAnyOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterDeploymentDataAssociationsInnerAnyOf;
                        SubmitDeploymentsResponseUnknownAssociationsInner ret = new SubmitDeploymentsResponseUnknownAssociationsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for DeploymentDataAssociationsInnerAnyOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'DeploymentDataAssociationsInnerAnyOf'", e);
                    }
                    // deserialize DeploymentDataAssociationsInnerAnyOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        DeploymentDataAssociationsInnerAnyOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterDeploymentDataAssociationsInnerAnyOf1;
                        SubmitDeploymentsResponseUnknownAssociationsInner ret = new SubmitDeploymentsResponseUnknownAssociationsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for DeploymentDataAssociationsInnerAnyOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'DeploymentDataAssociationsInnerAnyOf1'", e);
                    }
                    // deserialize DeploymentDataAssociationsInnerAnyOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        DeploymentDataAssociationsInnerAnyOf2.validateJsonElement(jsonElement);
                        actualAdapter = adapterDeploymentDataAssociationsInnerAnyOf2;
                        SubmitDeploymentsResponseUnknownAssociationsInner ret = new SubmitDeploymentsResponseUnknownAssociationsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for DeploymentDataAssociationsInnerAnyOf2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'DeploymentDataAssociationsInnerAnyOf2'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for SubmitDeploymentsResponseUnknownAssociationsInner: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public SubmitDeploymentsResponseUnknownAssociationsInner() {
        super("anyOf", Boolean.FALSE);
    }

    public SubmitDeploymentsResponseUnknownAssociationsInner(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("DeploymentDataAssociationsInnerAnyOf", DeploymentDataAssociationsInnerAnyOf.class);
        schemas.put("DeploymentDataAssociationsInnerAnyOf1", DeploymentDataAssociationsInnerAnyOf1.class);
        schemas.put("DeploymentDataAssociationsInnerAnyOf2", DeploymentDataAssociationsInnerAnyOf2.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return SubmitDeploymentsResponseUnknownAssociationsInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * DeploymentDataAssociationsInnerAnyOf, DeploymentDataAssociationsInnerAnyOf1, DeploymentDataAssociationsInnerAnyOf2
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof DeploymentDataAssociationsInnerAnyOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DeploymentDataAssociationsInnerAnyOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DeploymentDataAssociationsInnerAnyOf2) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be DeploymentDataAssociationsInnerAnyOf, DeploymentDataAssociationsInnerAnyOf1, DeploymentDataAssociationsInnerAnyOf2");
    }

    /**
     * Get the actual instance, which can be the following:
     * DeploymentDataAssociationsInnerAnyOf, DeploymentDataAssociationsInnerAnyOf1, DeploymentDataAssociationsInnerAnyOf2
     *
     * @return The actual instance (DeploymentDataAssociationsInnerAnyOf, DeploymentDataAssociationsInnerAnyOf1, DeploymentDataAssociationsInnerAnyOf2)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `DeploymentDataAssociationsInnerAnyOf`. If the actual instance is not `DeploymentDataAssociationsInnerAnyOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DeploymentDataAssociationsInnerAnyOf`
     * @throws ClassCastException if the instance is not `DeploymentDataAssociationsInnerAnyOf`
     */
    public DeploymentDataAssociationsInnerAnyOf getDeploymentDataAssociationsInnerAnyOf() throws ClassCastException {
        return (DeploymentDataAssociationsInnerAnyOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DeploymentDataAssociationsInnerAnyOf1`. If the actual instance is not `DeploymentDataAssociationsInnerAnyOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DeploymentDataAssociationsInnerAnyOf1`
     * @throws ClassCastException if the instance is not `DeploymentDataAssociationsInnerAnyOf1`
     */
    public DeploymentDataAssociationsInnerAnyOf1 getDeploymentDataAssociationsInnerAnyOf1() throws ClassCastException {
        return (DeploymentDataAssociationsInnerAnyOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DeploymentDataAssociationsInnerAnyOf2`. If the actual instance is not `DeploymentDataAssociationsInnerAnyOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DeploymentDataAssociationsInnerAnyOf2`
     * @throws ClassCastException if the instance is not `DeploymentDataAssociationsInnerAnyOf2`
     */
    public DeploymentDataAssociationsInnerAnyOf2 getDeploymentDataAssociationsInnerAnyOf2() throws ClassCastException {
        return (DeploymentDataAssociationsInnerAnyOf2)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SubmitDeploymentsResponseUnknownAssociationsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with DeploymentDataAssociationsInnerAnyOf
        try {
            DeploymentDataAssociationsInnerAnyOf.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for DeploymentDataAssociationsInnerAnyOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with DeploymentDataAssociationsInnerAnyOf1
        try {
            DeploymentDataAssociationsInnerAnyOf1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for DeploymentDataAssociationsInnerAnyOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with DeploymentDataAssociationsInnerAnyOf2
        try {
            DeploymentDataAssociationsInnerAnyOf2.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for DeploymentDataAssociationsInnerAnyOf2 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for SubmitDeploymentsResponseUnknownAssociationsInner with anyOf schemas: DeploymentDataAssociationsInnerAnyOf, DeploymentDataAssociationsInnerAnyOf1, DeploymentDataAssociationsInnerAnyOf2. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of SubmitDeploymentsResponseUnknownAssociationsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SubmitDeploymentsResponseUnknownAssociationsInner
     * @throws IOException if the JSON string is invalid with respect to SubmitDeploymentsResponseUnknownAssociationsInner
     */
    public static SubmitDeploymentsResponseUnknownAssociationsInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SubmitDeploymentsResponseUnknownAssociationsInner.class);
    }

    /**
     * Convert an instance of SubmitDeploymentsResponseUnknownAssociationsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

