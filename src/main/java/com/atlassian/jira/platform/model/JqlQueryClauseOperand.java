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
import com.atlassian.jira.platform.model.FunctionOperand;
import com.atlassian.jira.platform.model.JqlQueryUnitaryOperand;
import com.atlassian.jira.platform.model.KeywordOperand;
import com.atlassian.jira.platform.model.ListOperand;
import com.atlassian.jira.platform.model.ValueOperand;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class JqlQueryClauseOperand extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(JqlQueryClauseOperand.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!JqlQueryClauseOperand.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'JqlQueryClauseOperand' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ListOperand> adapterListOperand = gson.getDelegateAdapter(this, TypeToken.get(ListOperand.class));
            final TypeAdapter<ValueOperand> adapterValueOperand = gson.getDelegateAdapter(this, TypeToken.get(ValueOperand.class));
            final TypeAdapter<FunctionOperand> adapterFunctionOperand = gson.getDelegateAdapter(this, TypeToken.get(FunctionOperand.class));
            final TypeAdapter<KeywordOperand> adapterKeywordOperand = gson.getDelegateAdapter(this, TypeToken.get(KeywordOperand.class));

            return (TypeAdapter<T>) new TypeAdapter<JqlQueryClauseOperand>() {
                @Override
                public void write(JsonWriter out, JqlQueryClauseOperand value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ListOperand`
                    if (value.getActualInstance() instanceof ListOperand) {
                        JsonElement element = adapterListOperand.toJsonTree((ListOperand)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ValueOperand`
                    if (value.getActualInstance() instanceof ValueOperand) {
                        JsonElement element = adapterValueOperand.toJsonTree((ValueOperand)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `FunctionOperand`
                    if (value.getActualInstance() instanceof FunctionOperand) {
                        JsonElement element = adapterFunctionOperand.toJsonTree((FunctionOperand)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `KeywordOperand`
                    if (value.getActualInstance() instanceof KeywordOperand) {
                        JsonElement element = adapterKeywordOperand.toJsonTree((KeywordOperand)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: FunctionOperand, KeywordOperand, ListOperand, ValueOperand");
                }

                @Override
                public JqlQueryClauseOperand read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ListOperand
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListOperand.validateJsonElement(jsonElement);
                        actualAdapter = adapterListOperand;
                        JqlQueryClauseOperand ret = new JqlQueryClauseOperand();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListOperand failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListOperand'", e);
                    }
                    // deserialize ValueOperand
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ValueOperand.validateJsonElement(jsonElement);
                        actualAdapter = adapterValueOperand;
                        JqlQueryClauseOperand ret = new JqlQueryClauseOperand();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ValueOperand failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ValueOperand'", e);
                    }
                    // deserialize FunctionOperand
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FunctionOperand.validateJsonElement(jsonElement);
                        actualAdapter = adapterFunctionOperand;
                        JqlQueryClauseOperand ret = new JqlQueryClauseOperand();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FunctionOperand failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FunctionOperand'", e);
                    }
                    // deserialize KeywordOperand
                    try {
                        // validate the JSON object to see if any exception is thrown
                        KeywordOperand.validateJsonElement(jsonElement);
                        actualAdapter = adapterKeywordOperand;
                        JqlQueryClauseOperand ret = new JqlQueryClauseOperand();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for KeywordOperand failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'KeywordOperand'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for JqlQueryClauseOperand: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public JqlQueryClauseOperand() {
        super("anyOf", Boolean.FALSE);
    }

    public JqlQueryClauseOperand(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ListOperand", ListOperand.class);
        schemas.put("ValueOperand", ValueOperand.class);
        schemas.put("FunctionOperand", FunctionOperand.class);
        schemas.put("KeywordOperand", KeywordOperand.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return JqlQueryClauseOperand.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * FunctionOperand, KeywordOperand, ListOperand, ValueOperand
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ListOperand) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ValueOperand) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FunctionOperand) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof KeywordOperand) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be FunctionOperand, KeywordOperand, ListOperand, ValueOperand");
    }

    /**
     * Get the actual instance, which can be the following:
     * FunctionOperand, KeywordOperand, ListOperand, ValueOperand
     *
     * @return The actual instance (FunctionOperand, KeywordOperand, ListOperand, ValueOperand)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListOperand`. If the actual instance is not `ListOperand`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListOperand`
     * @throws ClassCastException if the instance is not `ListOperand`
     */
    public ListOperand getListOperand() throws ClassCastException {
        return (ListOperand)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ValueOperand`. If the actual instance is not `ValueOperand`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ValueOperand`
     * @throws ClassCastException if the instance is not `ValueOperand`
     */
    public ValueOperand getValueOperand() throws ClassCastException {
        return (ValueOperand)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FunctionOperand`. If the actual instance is not `FunctionOperand`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FunctionOperand`
     * @throws ClassCastException if the instance is not `FunctionOperand`
     */
    public FunctionOperand getFunctionOperand() throws ClassCastException {
        return (FunctionOperand)super.getActualInstance();
    }

    /**
     * Get the actual instance of `KeywordOperand`. If the actual instance is not `KeywordOperand`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `KeywordOperand`
     * @throws ClassCastException if the instance is not `KeywordOperand`
     */
    public KeywordOperand getKeywordOperand() throws ClassCastException {
        return (KeywordOperand)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to JqlQueryClauseOperand
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with ListOperand
        try {
            ListOperand.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ListOperand failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ValueOperand
        try {
            ValueOperand.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ValueOperand failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with FunctionOperand
        try {
            FunctionOperand.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FunctionOperand failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with KeywordOperand
        try {
            KeywordOperand.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for KeywordOperand failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for JqlQueryClauseOperand with anyOf schemas: FunctionOperand, KeywordOperand, ListOperand, ValueOperand. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of JqlQueryClauseOperand given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of JqlQueryClauseOperand
     * @throws IOException if the JSON string is invalid with respect to JqlQueryClauseOperand
     */
    public static JqlQueryClauseOperand fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, JqlQueryClauseOperand.class);
    }

    /**
     * Convert an instance of JqlQueryClauseOperand to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

