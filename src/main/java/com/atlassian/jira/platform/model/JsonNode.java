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
import java.math.BigDecimal;
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
 * JsonNode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T17:36:18.838627-04:00[America/New_York]", comments = "Generator version: 7.12.0")
public class JsonNode {
  public static final String SERIALIZED_NAME_ARRAY = "array";
  @SerializedName(SERIALIZED_NAME_ARRAY)
  @javax.annotation.Nullable
  private Boolean array;

  public static final String SERIALIZED_NAME_BIG_DECIMAL = "bigDecimal";
  @SerializedName(SERIALIZED_NAME_BIG_DECIMAL)
  @javax.annotation.Nullable
  private Boolean bigDecimal;

  public static final String SERIALIZED_NAME_BIG_INTEGER = "bigInteger";
  @SerializedName(SERIALIZED_NAME_BIG_INTEGER)
  @javax.annotation.Nullable
  private Boolean bigInteger;

  public static final String SERIALIZED_NAME_BIG_INTEGER_VALUE = "bigIntegerValue";
  @SerializedName(SERIALIZED_NAME_BIG_INTEGER_VALUE)
  @javax.annotation.Nullable
  private Integer bigIntegerValue;

  public static final String SERIALIZED_NAME_BINARY = "binary";
  @SerializedName(SERIALIZED_NAME_BINARY)
  @javax.annotation.Nullable
  private Boolean binary;

  public static final String SERIALIZED_NAME_BINARY_VALUE = "binaryValue";
  @SerializedName(SERIALIZED_NAME_BINARY_VALUE)
  @javax.annotation.Nullable
  private List<byte[]> binaryValue = new ArrayList<>();

  public static final String SERIALIZED_NAME_BOOLEAN = "boolean";
  @SerializedName(SERIALIZED_NAME_BOOLEAN)
  @javax.annotation.Nullable
  private Boolean _boolean;

  public static final String SERIALIZED_NAME_BOOLEAN_VALUE = "booleanValue";
  @SerializedName(SERIALIZED_NAME_BOOLEAN_VALUE)
  @javax.annotation.Nullable
  private Boolean booleanValue;

  public static final String SERIALIZED_NAME_CONTAINER_NODE = "containerNode";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NODE)
  @javax.annotation.Nullable
  private Boolean containerNode;

  public static final String SERIALIZED_NAME_DECIMAL_VALUE = "decimalValue";
  @SerializedName(SERIALIZED_NAME_DECIMAL_VALUE)
  @javax.annotation.Nullable
  private BigDecimal decimalValue;

  public static final String SERIALIZED_NAME_DOUBLE = "double";
  @SerializedName(SERIALIZED_NAME_DOUBLE)
  @javax.annotation.Nullable
  private Boolean _double;

  public static final String SERIALIZED_NAME_DOUBLE_VALUE = "doubleValue";
  @SerializedName(SERIALIZED_NAME_DOUBLE_VALUE)
  @javax.annotation.Nullable
  private Double doubleValue;

  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  @javax.annotation.Nullable
  private Object elements;

  public static final String SERIALIZED_NAME_FIELD_NAMES = "fieldNames";
  @SerializedName(SERIALIZED_NAME_FIELD_NAMES)
  @javax.annotation.Nullable
  private Object fieldNames;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  @javax.annotation.Nullable
  private Object fields;

  public static final String SERIALIZED_NAME_FLOATING_POINT_NUMBER = "floatingPointNumber";
  @SerializedName(SERIALIZED_NAME_FLOATING_POINT_NUMBER)
  @javax.annotation.Nullable
  private Boolean floatingPointNumber;

  public static final String SERIALIZED_NAME_INT = "int";
  @SerializedName(SERIALIZED_NAME_INT)
  @javax.annotation.Nullable
  private Boolean _int;

  public static final String SERIALIZED_NAME_INT_VALUE = "intValue";
  @SerializedName(SERIALIZED_NAME_INT_VALUE)
  @javax.annotation.Nullable
  private Integer intValue;

  public static final String SERIALIZED_NAME_INTEGRAL_NUMBER = "integralNumber";
  @SerializedName(SERIALIZED_NAME_INTEGRAL_NUMBER)
  @javax.annotation.Nullable
  private Boolean integralNumber;

  public static final String SERIALIZED_NAME_LONG = "long";
  @SerializedName(SERIALIZED_NAME_LONG)
  @javax.annotation.Nullable
  private Boolean _long;

  public static final String SERIALIZED_NAME_LONG_VALUE = "longValue";
  @SerializedName(SERIALIZED_NAME_LONG_VALUE)
  @javax.annotation.Nullable
  private Long longValue;

  public static final String SERIALIZED_NAME_MISSING_NODE = "missingNode";
  @SerializedName(SERIALIZED_NAME_MISSING_NODE)
  @javax.annotation.Nullable
  private Boolean missingNode;

  public static final String SERIALIZED_NAME_NULL = "null";
  @SerializedName(SERIALIZED_NAME_NULL)
  @javax.annotation.Nullable
  private Boolean _null;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  @javax.annotation.Nullable
  private Boolean number;

  /**
   * Gets or Sets numberType
   */
  @JsonAdapter(NumberTypeEnum.Adapter.class)
  public enum NumberTypeEnum {
    INT("INT"),
    
    LONG("LONG"),
    
    BIG_INTEGER("BIG_INTEGER"),
    
    FLOAT("FLOAT"),
    
    DOUBLE("DOUBLE"),
    
    BIG_DECIMAL("BIG_DECIMAL");

    private String value;

    NumberTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NumberTypeEnum fromValue(String value) {
      for (NumberTypeEnum b : NumberTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NumberTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NumberTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NumberTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NumberTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NumberTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NUMBER_TYPE = "numberType";
  @SerializedName(SERIALIZED_NAME_NUMBER_TYPE)
  @javax.annotation.Nullable
  private NumberTypeEnum numberType;

  public static final String SERIALIZED_NAME_NUMBER_VALUE = "numberValue";
  @SerializedName(SERIALIZED_NAME_NUMBER_VALUE)
  @javax.annotation.Nullable
  private BigDecimal numberValue;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  @javax.annotation.Nullable
  private Boolean _object;

  public static final String SERIALIZED_NAME_POJO = "pojo";
  @SerializedName(SERIALIZED_NAME_POJO)
  @javax.annotation.Nullable
  private Boolean pojo;

  public static final String SERIALIZED_NAME_TEXT_VALUE = "textValue";
  @SerializedName(SERIALIZED_NAME_TEXT_VALUE)
  @javax.annotation.Nullable
  private String textValue;

  public static final String SERIALIZED_NAME_TEXTUAL = "textual";
  @SerializedName(SERIALIZED_NAME_TEXTUAL)
  @javax.annotation.Nullable
  private Boolean textual;

  public static final String SERIALIZED_NAME_VALUE_AS_BOOLEAN = "valueAsBoolean";
  @SerializedName(SERIALIZED_NAME_VALUE_AS_BOOLEAN)
  @javax.annotation.Nullable
  private Boolean valueAsBoolean;

  public static final String SERIALIZED_NAME_VALUE_AS_DOUBLE = "valueAsDouble";
  @SerializedName(SERIALIZED_NAME_VALUE_AS_DOUBLE)
  @javax.annotation.Nullable
  private Double valueAsDouble;

  public static final String SERIALIZED_NAME_VALUE_AS_INT = "valueAsInt";
  @SerializedName(SERIALIZED_NAME_VALUE_AS_INT)
  @javax.annotation.Nullable
  private Integer valueAsInt;

  public static final String SERIALIZED_NAME_VALUE_AS_LONG = "valueAsLong";
  @SerializedName(SERIALIZED_NAME_VALUE_AS_LONG)
  @javax.annotation.Nullable
  private Long valueAsLong;

  public static final String SERIALIZED_NAME_VALUE_AS_TEXT = "valueAsText";
  @SerializedName(SERIALIZED_NAME_VALUE_AS_TEXT)
  @javax.annotation.Nullable
  private String valueAsText;

  public static final String SERIALIZED_NAME_VALUE_NODE = "valueNode";
  @SerializedName(SERIALIZED_NAME_VALUE_NODE)
  @javax.annotation.Nullable
  private Boolean valueNode;

  public JsonNode() {
  }

  public JsonNode array(@javax.annotation.Nullable Boolean array) {
    this.array = array;
    return this;
  }

  /**
   * Get array
   * @return array
   */
  @javax.annotation.Nullable
  public Boolean getArray() {
    return array;
  }

  public void setArray(@javax.annotation.Nullable Boolean array) {
    this.array = array;
  }


  public JsonNode bigDecimal(@javax.annotation.Nullable Boolean bigDecimal) {
    this.bigDecimal = bigDecimal;
    return this;
  }

  /**
   * Get bigDecimal
   * @return bigDecimal
   */
  @javax.annotation.Nullable
  public Boolean getBigDecimal() {
    return bigDecimal;
  }

  public void setBigDecimal(@javax.annotation.Nullable Boolean bigDecimal) {
    this.bigDecimal = bigDecimal;
  }


  public JsonNode bigInteger(@javax.annotation.Nullable Boolean bigInteger) {
    this.bigInteger = bigInteger;
    return this;
  }

  /**
   * Get bigInteger
   * @return bigInteger
   */
  @javax.annotation.Nullable
  public Boolean getBigInteger() {
    return bigInteger;
  }

  public void setBigInteger(@javax.annotation.Nullable Boolean bigInteger) {
    this.bigInteger = bigInteger;
  }


  public JsonNode bigIntegerValue(@javax.annotation.Nullable Integer bigIntegerValue) {
    this.bigIntegerValue = bigIntegerValue;
    return this;
  }

  /**
   * Get bigIntegerValue
   * @return bigIntegerValue
   */
  @javax.annotation.Nullable
  public Integer getBigIntegerValue() {
    return bigIntegerValue;
  }

  public void setBigIntegerValue(@javax.annotation.Nullable Integer bigIntegerValue) {
    this.bigIntegerValue = bigIntegerValue;
  }


  public JsonNode binary(@javax.annotation.Nullable Boolean binary) {
    this.binary = binary;
    return this;
  }

  /**
   * Get binary
   * @return binary
   */
  @javax.annotation.Nullable
  public Boolean getBinary() {
    return binary;
  }

  public void setBinary(@javax.annotation.Nullable Boolean binary) {
    this.binary = binary;
  }


  public JsonNode binaryValue(@javax.annotation.Nullable List<byte[]> binaryValue) {
    this.binaryValue = binaryValue;
    return this;
  }

  public JsonNode addBinaryValueItem(byte[] binaryValueItem) {
    if (this.binaryValue == null) {
      this.binaryValue = new ArrayList<>();
    }
    this.binaryValue.add(binaryValueItem);
    return this;
  }

  /**
   * Get binaryValue
   * @return binaryValue
   */
  @javax.annotation.Nullable
  public List<byte[]> getBinaryValue() {
    return binaryValue;
  }

  public void setBinaryValue(@javax.annotation.Nullable List<byte[]> binaryValue) {
    this.binaryValue = binaryValue;
  }


  public JsonNode _boolean(@javax.annotation.Nullable Boolean _boolean) {
    this._boolean = _boolean;
    return this;
  }

  /**
   * Get _boolean
   * @return _boolean
   */
  @javax.annotation.Nullable
  public Boolean getBoolean() {
    return _boolean;
  }

  public void setBoolean(@javax.annotation.Nullable Boolean _boolean) {
    this._boolean = _boolean;
  }


  public JsonNode booleanValue(@javax.annotation.Nullable Boolean booleanValue) {
    this.booleanValue = booleanValue;
    return this;
  }

  /**
   * Get booleanValue
   * @return booleanValue
   */
  @javax.annotation.Nullable
  public Boolean getBooleanValue() {
    return booleanValue;
  }

  public void setBooleanValue(@javax.annotation.Nullable Boolean booleanValue) {
    this.booleanValue = booleanValue;
  }


  public JsonNode containerNode(@javax.annotation.Nullable Boolean containerNode) {
    this.containerNode = containerNode;
    return this;
  }

  /**
   * Get containerNode
   * @return containerNode
   */
  @javax.annotation.Nullable
  public Boolean getContainerNode() {
    return containerNode;
  }

  public void setContainerNode(@javax.annotation.Nullable Boolean containerNode) {
    this.containerNode = containerNode;
  }


  public JsonNode decimalValue(@javax.annotation.Nullable BigDecimal decimalValue) {
    this.decimalValue = decimalValue;
    return this;
  }

  /**
   * Get decimalValue
   * @return decimalValue
   */
  @javax.annotation.Nullable
  public BigDecimal getDecimalValue() {
    return decimalValue;
  }

  public void setDecimalValue(@javax.annotation.Nullable BigDecimal decimalValue) {
    this.decimalValue = decimalValue;
  }


  public JsonNode _double(@javax.annotation.Nullable Boolean _double) {
    this._double = _double;
    return this;
  }

  /**
   * Get _double
   * @return _double
   */
  @javax.annotation.Nullable
  public Boolean getDouble() {
    return _double;
  }

  public void setDouble(@javax.annotation.Nullable Boolean _double) {
    this._double = _double;
  }


  public JsonNode doubleValue(@javax.annotation.Nullable Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

  /**
   * Get doubleValue
   * @return doubleValue
   */
  @javax.annotation.Nullable
  public Double getDoubleValue() {
    return doubleValue;
  }

  public void setDoubleValue(@javax.annotation.Nullable Double doubleValue) {
    this.doubleValue = doubleValue;
  }


  public JsonNode elements(@javax.annotation.Nullable Object elements) {
    this.elements = elements;
    return this;
  }

  /**
   * Get elements
   * @return elements
   */
  @javax.annotation.Nullable
  public Object getElements() {
    return elements;
  }

  public void setElements(@javax.annotation.Nullable Object elements) {
    this.elements = elements;
  }


  public JsonNode fieldNames(@javax.annotation.Nullable Object fieldNames) {
    this.fieldNames = fieldNames;
    return this;
  }

  /**
   * Get fieldNames
   * @return fieldNames
   */
  @javax.annotation.Nullable
  public Object getFieldNames() {
    return fieldNames;
  }

  public void setFieldNames(@javax.annotation.Nullable Object fieldNames) {
    this.fieldNames = fieldNames;
  }


  public JsonNode fields(@javax.annotation.Nullable Object fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Get fields
   * @return fields
   */
  @javax.annotation.Nullable
  public Object getFields() {
    return fields;
  }

  public void setFields(@javax.annotation.Nullable Object fields) {
    this.fields = fields;
  }


  public JsonNode floatingPointNumber(@javax.annotation.Nullable Boolean floatingPointNumber) {
    this.floatingPointNumber = floatingPointNumber;
    return this;
  }

  /**
   * Get floatingPointNumber
   * @return floatingPointNumber
   */
  @javax.annotation.Nullable
  public Boolean getFloatingPointNumber() {
    return floatingPointNumber;
  }

  public void setFloatingPointNumber(@javax.annotation.Nullable Boolean floatingPointNumber) {
    this.floatingPointNumber = floatingPointNumber;
  }


  public JsonNode _int(@javax.annotation.Nullable Boolean _int) {
    this._int = _int;
    return this;
  }

  /**
   * Get _int
   * @return _int
   */
  @javax.annotation.Nullable
  public Boolean getInt() {
    return _int;
  }

  public void setInt(@javax.annotation.Nullable Boolean _int) {
    this._int = _int;
  }


  public JsonNode intValue(@javax.annotation.Nullable Integer intValue) {
    this.intValue = intValue;
    return this;
  }

  /**
   * Get intValue
   * @return intValue
   */
  @javax.annotation.Nullable
  public Integer getIntValue() {
    return intValue;
  }

  public void setIntValue(@javax.annotation.Nullable Integer intValue) {
    this.intValue = intValue;
  }


  public JsonNode integralNumber(@javax.annotation.Nullable Boolean integralNumber) {
    this.integralNumber = integralNumber;
    return this;
  }

  /**
   * Get integralNumber
   * @return integralNumber
   */
  @javax.annotation.Nullable
  public Boolean getIntegralNumber() {
    return integralNumber;
  }

  public void setIntegralNumber(@javax.annotation.Nullable Boolean integralNumber) {
    this.integralNumber = integralNumber;
  }


  public JsonNode _long(@javax.annotation.Nullable Boolean _long) {
    this._long = _long;
    return this;
  }

  /**
   * Get _long
   * @return _long
   */
  @javax.annotation.Nullable
  public Boolean getLong() {
    return _long;
  }

  public void setLong(@javax.annotation.Nullable Boolean _long) {
    this._long = _long;
  }


  public JsonNode longValue(@javax.annotation.Nullable Long longValue) {
    this.longValue = longValue;
    return this;
  }

  /**
   * Get longValue
   * @return longValue
   */
  @javax.annotation.Nullable
  public Long getLongValue() {
    return longValue;
  }

  public void setLongValue(@javax.annotation.Nullable Long longValue) {
    this.longValue = longValue;
  }


  public JsonNode missingNode(@javax.annotation.Nullable Boolean missingNode) {
    this.missingNode = missingNode;
    return this;
  }

  /**
   * Get missingNode
   * @return missingNode
   */
  @javax.annotation.Nullable
  public Boolean getMissingNode() {
    return missingNode;
  }

  public void setMissingNode(@javax.annotation.Nullable Boolean missingNode) {
    this.missingNode = missingNode;
  }


  public JsonNode _null(@javax.annotation.Nullable Boolean _null) {
    this._null = _null;
    return this;
  }

  /**
   * Get _null
   * @return _null
   */
  @javax.annotation.Nullable
  public Boolean getNull() {
    return _null;
  }

  public void setNull(@javax.annotation.Nullable Boolean _null) {
    this._null = _null;
  }


  public JsonNode number(@javax.annotation.Nullable Boolean number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
   */
  @javax.annotation.Nullable
  public Boolean getNumber() {
    return number;
  }

  public void setNumber(@javax.annotation.Nullable Boolean number) {
    this.number = number;
  }


  public JsonNode numberType(@javax.annotation.Nullable NumberTypeEnum numberType) {
    this.numberType = numberType;
    return this;
  }

  /**
   * Get numberType
   * @return numberType
   */
  @javax.annotation.Nullable
  public NumberTypeEnum getNumberType() {
    return numberType;
  }

  public void setNumberType(@javax.annotation.Nullable NumberTypeEnum numberType) {
    this.numberType = numberType;
  }


  public JsonNode numberValue(@javax.annotation.Nullable BigDecimal numberValue) {
    this.numberValue = numberValue;
    return this;
  }

  /**
   * Get numberValue
   * @return numberValue
   */
  @javax.annotation.Nullable
  public BigDecimal getNumberValue() {
    return numberValue;
  }

  public void setNumberValue(@javax.annotation.Nullable BigDecimal numberValue) {
    this.numberValue = numberValue;
  }


  public JsonNode _object(@javax.annotation.Nullable Boolean _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @javax.annotation.Nullable
  public Boolean getObject() {
    return _object;
  }

  public void setObject(@javax.annotation.Nullable Boolean _object) {
    this._object = _object;
  }


  public JsonNode pojo(@javax.annotation.Nullable Boolean pojo) {
    this.pojo = pojo;
    return this;
  }

  /**
   * Get pojo
   * @return pojo
   */
  @javax.annotation.Nullable
  public Boolean getPojo() {
    return pojo;
  }

  public void setPojo(@javax.annotation.Nullable Boolean pojo) {
    this.pojo = pojo;
  }


  public JsonNode textValue(@javax.annotation.Nullable String textValue) {
    this.textValue = textValue;
    return this;
  }

  /**
   * Get textValue
   * @return textValue
   */
  @javax.annotation.Nullable
  public String getTextValue() {
    return textValue;
  }

  public void setTextValue(@javax.annotation.Nullable String textValue) {
    this.textValue = textValue;
  }


  public JsonNode textual(@javax.annotation.Nullable Boolean textual) {
    this.textual = textual;
    return this;
  }

  /**
   * Get textual
   * @return textual
   */
  @javax.annotation.Nullable
  public Boolean getTextual() {
    return textual;
  }

  public void setTextual(@javax.annotation.Nullable Boolean textual) {
    this.textual = textual;
  }


  public JsonNode valueAsBoolean(@javax.annotation.Nullable Boolean valueAsBoolean) {
    this.valueAsBoolean = valueAsBoolean;
    return this;
  }

  /**
   * Get valueAsBoolean
   * @return valueAsBoolean
   */
  @javax.annotation.Nullable
  public Boolean getValueAsBoolean() {
    return valueAsBoolean;
  }

  public void setValueAsBoolean(@javax.annotation.Nullable Boolean valueAsBoolean) {
    this.valueAsBoolean = valueAsBoolean;
  }


  public JsonNode valueAsDouble(@javax.annotation.Nullable Double valueAsDouble) {
    this.valueAsDouble = valueAsDouble;
    return this;
  }

  /**
   * Get valueAsDouble
   * @return valueAsDouble
   */
  @javax.annotation.Nullable
  public Double getValueAsDouble() {
    return valueAsDouble;
  }

  public void setValueAsDouble(@javax.annotation.Nullable Double valueAsDouble) {
    this.valueAsDouble = valueAsDouble;
  }


  public JsonNode valueAsInt(@javax.annotation.Nullable Integer valueAsInt) {
    this.valueAsInt = valueAsInt;
    return this;
  }

  /**
   * Get valueAsInt
   * @return valueAsInt
   */
  @javax.annotation.Nullable
  public Integer getValueAsInt() {
    return valueAsInt;
  }

  public void setValueAsInt(@javax.annotation.Nullable Integer valueAsInt) {
    this.valueAsInt = valueAsInt;
  }


  public JsonNode valueAsLong(@javax.annotation.Nullable Long valueAsLong) {
    this.valueAsLong = valueAsLong;
    return this;
  }

  /**
   * Get valueAsLong
   * @return valueAsLong
   */
  @javax.annotation.Nullable
  public Long getValueAsLong() {
    return valueAsLong;
  }

  public void setValueAsLong(@javax.annotation.Nullable Long valueAsLong) {
    this.valueAsLong = valueAsLong;
  }


  public JsonNode valueAsText(@javax.annotation.Nullable String valueAsText) {
    this.valueAsText = valueAsText;
    return this;
  }

  /**
   * Get valueAsText
   * @return valueAsText
   */
  @javax.annotation.Nullable
  public String getValueAsText() {
    return valueAsText;
  }

  public void setValueAsText(@javax.annotation.Nullable String valueAsText) {
    this.valueAsText = valueAsText;
  }


  public JsonNode valueNode(@javax.annotation.Nullable Boolean valueNode) {
    this.valueNode = valueNode;
    return this;
  }

  /**
   * Get valueNode
   * @return valueNode
   */
  @javax.annotation.Nullable
  public Boolean getValueNode() {
    return valueNode;
  }

  public void setValueNode(@javax.annotation.Nullable Boolean valueNode) {
    this.valueNode = valueNode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonNode jsonNode = (JsonNode) o;
    return Objects.equals(this.array, jsonNode.array) &&
        Objects.equals(this.bigDecimal, jsonNode.bigDecimal) &&
        Objects.equals(this.bigInteger, jsonNode.bigInteger) &&
        Objects.equals(this.bigIntegerValue, jsonNode.bigIntegerValue) &&
        Objects.equals(this.binary, jsonNode.binary) &&
        Objects.equals(this.binaryValue, jsonNode.binaryValue) &&
        Objects.equals(this._boolean, jsonNode._boolean) &&
        Objects.equals(this.booleanValue, jsonNode.booleanValue) &&
        Objects.equals(this.containerNode, jsonNode.containerNode) &&
        Objects.equals(this.decimalValue, jsonNode.decimalValue) &&
        Objects.equals(this._double, jsonNode._double) &&
        Objects.equals(this.doubleValue, jsonNode.doubleValue) &&
        Objects.equals(this.elements, jsonNode.elements) &&
        Objects.equals(this.fieldNames, jsonNode.fieldNames) &&
        Objects.equals(this.fields, jsonNode.fields) &&
        Objects.equals(this.floatingPointNumber, jsonNode.floatingPointNumber) &&
        Objects.equals(this._int, jsonNode._int) &&
        Objects.equals(this.intValue, jsonNode.intValue) &&
        Objects.equals(this.integralNumber, jsonNode.integralNumber) &&
        Objects.equals(this._long, jsonNode._long) &&
        Objects.equals(this.longValue, jsonNode.longValue) &&
        Objects.equals(this.missingNode, jsonNode.missingNode) &&
        Objects.equals(this._null, jsonNode._null) &&
        Objects.equals(this.number, jsonNode.number) &&
        Objects.equals(this.numberType, jsonNode.numberType) &&
        Objects.equals(this.numberValue, jsonNode.numberValue) &&
        Objects.equals(this._object, jsonNode._object) &&
        Objects.equals(this.pojo, jsonNode.pojo) &&
        Objects.equals(this.textValue, jsonNode.textValue) &&
        Objects.equals(this.textual, jsonNode.textual) &&
        Objects.equals(this.valueAsBoolean, jsonNode.valueAsBoolean) &&
        Objects.equals(this.valueAsDouble, jsonNode.valueAsDouble) &&
        Objects.equals(this.valueAsInt, jsonNode.valueAsInt) &&
        Objects.equals(this.valueAsLong, jsonNode.valueAsLong) &&
        Objects.equals(this.valueAsText, jsonNode.valueAsText) &&
        Objects.equals(this.valueNode, jsonNode.valueNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(array, bigDecimal, bigInteger, bigIntegerValue, binary, binaryValue, _boolean, booleanValue, containerNode, decimalValue, _double, doubleValue, elements, fieldNames, fields, floatingPointNumber, _int, intValue, integralNumber, _long, longValue, missingNode, _null, number, numberType, numberValue, _object, pojo, textValue, textual, valueAsBoolean, valueAsDouble, valueAsInt, valueAsLong, valueAsText, valueNode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonNode {\n");
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
    sb.append("    bigDecimal: ").append(toIndentedString(bigDecimal)).append("\n");
    sb.append("    bigInteger: ").append(toIndentedString(bigInteger)).append("\n");
    sb.append("    bigIntegerValue: ").append(toIndentedString(bigIntegerValue)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    binaryValue: ").append(toIndentedString(binaryValue)).append("\n");
    sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
    sb.append("    booleanValue: ").append(toIndentedString(booleanValue)).append("\n");
    sb.append("    containerNode: ").append(toIndentedString(containerNode)).append("\n");
    sb.append("    decimalValue: ").append(toIndentedString(decimalValue)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    doubleValue: ").append(toIndentedString(doubleValue)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    fieldNames: ").append(toIndentedString(fieldNames)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    floatingPointNumber: ").append(toIndentedString(floatingPointNumber)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    intValue: ").append(toIndentedString(intValue)).append("\n");
    sb.append("    integralNumber: ").append(toIndentedString(integralNumber)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    longValue: ").append(toIndentedString(longValue)).append("\n");
    sb.append("    missingNode: ").append(toIndentedString(missingNode)).append("\n");
    sb.append("    _null: ").append(toIndentedString(_null)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberType: ").append(toIndentedString(numberType)).append("\n");
    sb.append("    numberValue: ").append(toIndentedString(numberValue)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    pojo: ").append(toIndentedString(pojo)).append("\n");
    sb.append("    textValue: ").append(toIndentedString(textValue)).append("\n");
    sb.append("    textual: ").append(toIndentedString(textual)).append("\n");
    sb.append("    valueAsBoolean: ").append(toIndentedString(valueAsBoolean)).append("\n");
    sb.append("    valueAsDouble: ").append(toIndentedString(valueAsDouble)).append("\n");
    sb.append("    valueAsInt: ").append(toIndentedString(valueAsInt)).append("\n");
    sb.append("    valueAsLong: ").append(toIndentedString(valueAsLong)).append("\n");
    sb.append("    valueAsText: ").append(toIndentedString(valueAsText)).append("\n");
    sb.append("    valueNode: ").append(toIndentedString(valueNode)).append("\n");
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
    openapiFields.add("array");
    openapiFields.add("bigDecimal");
    openapiFields.add("bigInteger");
    openapiFields.add("bigIntegerValue");
    openapiFields.add("binary");
    openapiFields.add("binaryValue");
    openapiFields.add("boolean");
    openapiFields.add("booleanValue");
    openapiFields.add("containerNode");
    openapiFields.add("decimalValue");
    openapiFields.add("double");
    openapiFields.add("doubleValue");
    openapiFields.add("elements");
    openapiFields.add("fieldNames");
    openapiFields.add("fields");
    openapiFields.add("floatingPointNumber");
    openapiFields.add("int");
    openapiFields.add("intValue");
    openapiFields.add("integralNumber");
    openapiFields.add("long");
    openapiFields.add("longValue");
    openapiFields.add("missingNode");
    openapiFields.add("null");
    openapiFields.add("number");
    openapiFields.add("numberType");
    openapiFields.add("numberValue");
    openapiFields.add("object");
    openapiFields.add("pojo");
    openapiFields.add("textValue");
    openapiFields.add("textual");
    openapiFields.add("valueAsBoolean");
    openapiFields.add("valueAsDouble");
    openapiFields.add("valueAsInt");
    openapiFields.add("valueAsLong");
    openapiFields.add("valueAsText");
    openapiFields.add("valueNode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to JsonNode
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JsonNode.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JsonNode is not found in the empty JSON string", JsonNode.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!JsonNode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JsonNode` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("binaryValue") != null && !jsonObj.get("binaryValue").isJsonNull() && !jsonObj.get("binaryValue").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `binaryValue` to be an array in the JSON string but got `%s`", jsonObj.get("binaryValue").toString()));
      }
      if ((jsonObj.get("numberType") != null && !jsonObj.get("numberType").isJsonNull()) && !jsonObj.get("numberType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberType").toString()));
      }
      // validate the optional field `numberType`
      if (jsonObj.get("numberType") != null && !jsonObj.get("numberType").isJsonNull()) {
        NumberTypeEnum.validateJsonElement(jsonObj.get("numberType"));
      }
      if ((jsonObj.get("textValue") != null && !jsonObj.get("textValue").isJsonNull()) && !jsonObj.get("textValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `textValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("textValue").toString()));
      }
      if ((jsonObj.get("valueAsText") != null && !jsonObj.get("valueAsText").isJsonNull()) && !jsonObj.get("valueAsText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueAsText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueAsText").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JsonNode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JsonNode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JsonNode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JsonNode.class));

       return (TypeAdapter<T>) new TypeAdapter<JsonNode>() {
           @Override
           public void write(JsonWriter out, JsonNode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JsonNode read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             //validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of JsonNode given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JsonNode
   * @throws IOException if the JSON string is invalid with respect to JsonNode
   */
  public static JsonNode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JsonNode.class);
  }

  /**
   * Convert an instance of JsonNode to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

