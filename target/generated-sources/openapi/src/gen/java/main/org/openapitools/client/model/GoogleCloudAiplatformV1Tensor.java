/*
 * Vertex AI API
 * Train high-quality custom machine learning models with minimal machine learning expertise and effort.
 *
 * The version of the OpenAPI document: v1
 * Contact: info@stackql.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import org.openapitools.client.JSON;

/**
 * A tensor value type.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1Tensor {
  public static final String SERIALIZED_NAME_UINT64_VAL = "uint64Val";
  @SerializedName(SERIALIZED_NAME_UINT64_VAL)
  private List<String> uint64Val = new ArrayList<>();

  public static final String SERIALIZED_NAME_BYTES_VAL = "bytesVal";
  @SerializedName(SERIALIZED_NAME_BYTES_VAL)
  private List<byte[]> bytesVal = new ArrayList<>();

  public static final String SERIALIZED_NAME_STRUCT_VAL = "structVal";
  @SerializedName(SERIALIZED_NAME_STRUCT_VAL)
  private Map<String, GoogleCloudAiplatformV1Tensor> structVal = new HashMap<>();

  public static final String SERIALIZED_NAME_LIST_VAL = "listVal";
  @SerializedName(SERIALIZED_NAME_LIST_VAL)
  private List<GoogleCloudAiplatformV1Tensor> listVal = new ArrayList<>();

  /**
   * The data type of tensor.
   */
  @JsonAdapter(DtypeEnum.Adapter.class)
  public enum DtypeEnum {
    DATA_TYPE_UNSPECIFIED("DATA_TYPE_UNSPECIFIED"),
    
    BOOL("BOOL"),
    
    STRING("STRING"),
    
    FLOAT("FLOAT"),
    
    DOUBLE("DOUBLE"),
    
    INT8("INT8"),
    
    INT16("INT16"),
    
    INT32("INT32"),
    
    INT64("INT64"),
    
    UINT8("UINT8"),
    
    UINT16("UINT16"),
    
    UINT32("UINT32"),
    
    UINT64("UINT64");

    private String value;

    DtypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DtypeEnum fromValue(String value) {
      for (DtypeEnum b : DtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DtypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DtypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DtypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DtypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DtypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DTYPE = "dtype";
  @SerializedName(SERIALIZED_NAME_DTYPE)
  private DtypeEnum dtype;

  public static final String SERIALIZED_NAME_INT64_VAL = "int64Val";
  @SerializedName(SERIALIZED_NAME_INT64_VAL)
  private List<String> int64Val = new ArrayList<>();

  public static final String SERIALIZED_NAME_TENSOR_VAL = "tensorVal";
  @SerializedName(SERIALIZED_NAME_TENSOR_VAL)
  private byte[] tensorVal;

  public static final String SERIALIZED_NAME_FLOAT_VAL = "floatVal";
  @SerializedName(SERIALIZED_NAME_FLOAT_VAL)
  private List<Float> floatVal = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHAPE = "shape";
  @SerializedName(SERIALIZED_NAME_SHAPE)
  private List<String> shape = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOUBLE_VAL = "doubleVal";
  @SerializedName(SERIALIZED_NAME_DOUBLE_VAL)
  private List<Double> doubleVal = new ArrayList<>();

  public static final String SERIALIZED_NAME_STRING_VAL = "stringVal";
  @SerializedName(SERIALIZED_NAME_STRING_VAL)
  private List<String> stringVal = new ArrayList<>();

  public static final String SERIALIZED_NAME_BOOL_VAL = "boolVal";
  @SerializedName(SERIALIZED_NAME_BOOL_VAL)
  private List<Boolean> boolVal = new ArrayList<>();

  public static final String SERIALIZED_NAME_INT_VAL = "intVal";
  @SerializedName(SERIALIZED_NAME_INT_VAL)
  private List<Integer> intVal = new ArrayList<>();

  public static final String SERIALIZED_NAME_UINT_VAL = "uintVal";
  @SerializedName(SERIALIZED_NAME_UINT_VAL)
  private List<Integer> uintVal = new ArrayList<>();

  public GoogleCloudAiplatformV1Tensor() {
  }

  public GoogleCloudAiplatformV1Tensor uint64Val(List<String> uint64Val) {
    this.uint64Val = uint64Val;
    return this;
  }

  public GoogleCloudAiplatformV1Tensor addUint64ValItem(String uint64ValItem) {
    if (this.uint64Val == null) {
      this.uint64Val = new ArrayList<>();
    }
    this.uint64Val.add(uint64ValItem);
    return this;
  }

  /**
   * UINT64
   * @return uint64Val
   */
  @javax.annotation.Nullable
  public List<String> getUint64Val() {
    return uint64Val;
  }

  public void setUint64Val(List<String> uint64Val) {
    this.uint64Val = uint64Val;
  }


  public GoogleCloudAiplatformV1Tensor bytesVal(List<byte[]> bytesVal) {
    this.bytesVal = bytesVal;
    return this;
  }

  public GoogleCloudAiplatformV1Tensor addBytesValItem(byte[] bytesValItem) {
    if (this.bytesVal == null) {
      this.bytesVal = new ArrayList<>();
    }
    this.bytesVal.add(bytesValItem);
    return this;
  }

  /**
   * STRING
   * @return bytesVal
   */
  @javax.annotation.Nullable
  public List<byte[]> getBytesVal() {
    return bytesVal;
  }

  public void setBytesVal(List<byte[]> bytesVal) {
    this.bytesVal = bytesVal;
  }


  public GoogleCloudAiplatformV1Tensor structVal(Map<String, GoogleCloudAiplatformV1Tensor> structVal) {
    this.structVal = structVal;
    return this;
  }

  public GoogleCloudAiplatformV1Tensor putStructValItem(String key, GoogleCloudAiplatformV1Tensor structValItem) {
    if (this.structVal == null) {
      this.structVal = new HashMap<>();
    }
    this.structVal.put(key, structValItem);
    return this;
  }

  /**
   * A map of string to tensor.
   * @return structVal
   */
  @javax.annotation.Nullable
  public Map<String, GoogleCloudAiplatformV1Tensor> getStructVal() {
    return structVal;
  }

  public void setStructVal(Map<String, GoogleCloudAiplatformV1Tensor> structVal) {
    this.structVal = structVal;
  }


  public GoogleCloudAiplatformV1Tensor listVal(List<GoogleCloudAiplatformV1Tensor> listVal) {
    this.listVal = listVal;
    return this;
  }

  public GoogleCloudAiplatformV1Tensor addListValItem(GoogleCloudAiplatformV1Tensor listValItem) {
    if (this.listVal == null) {
      this.listVal = new ArrayList<>();
    }
    this.listVal.add(listValItem);
    return this;
  }

  /**
   * A list of tensor values.
   * @return listVal
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1Tensor> getListVal() {
    return listVal;
  }

  public void setListVal(List<GoogleCloudAiplatformV1Tensor> listVal) {
    this.listVal = listVal;
  }


  public GoogleCloudAiplatformV1Tensor dtype(DtypeEnum dtype) {
    this.dtype = dtype;
    return this;
  }

  /**
   * The data type of tensor.
   * @return dtype
   */
  @javax.annotation.Nullable
  public DtypeEnum getDtype() {
    return dtype;
  }

  public void setDtype(DtypeEnum dtype) {
    this.dtype = dtype;
  }


  public GoogleCloudAiplatformV1Tensor int64Val(List<String> int64Val) {
    this.int64Val = int64Val;
    return this;
  }

  public GoogleCloudAiplatformV1Tensor addInt64ValItem(String int64ValItem) {
    if (this.int64Val == null) {
      this.int64Val = new ArrayList<>();
    }
    this.int64Val.add(int64ValItem);
    return this;
  }

  /**
   * INT64
   * @return int64Val
   */
  @javax.annotation.Nullable
  public List<String> getInt64Val() {
    return int64Val;
  }

  public void setInt64Val(List<String> int64Val) {
    this.int64Val = int64Val;
  }


  public GoogleCloudAiplatformV1Tensor tensorVal(byte[] tensorVal) {
    this.tensorVal = tensorVal;
    return this;
  }

  /**
   * Serialized raw tensor content.
   * @return tensorVal
   */
  @javax.annotation.Nullable
  public byte[] getTensorVal() {
    return tensorVal;
  }

  public void setTensorVal(byte[] tensorVal) {
    this.tensorVal = tensorVal;
  }


  public GoogleCloudAiplatformV1Tensor floatVal(List<Float> floatVal) {
    this.floatVal = floatVal;
    return this;
  }

  public GoogleCloudAiplatformV1Tensor addFloatValItem(Float floatValItem) {
    if (this.floatVal == null) {
      this.floatVal = new ArrayList<>();
    }
    this.floatVal.add(floatValItem);
    return this;
  }

  /**
   * FLOAT
   * @return floatVal
   */
  @javax.annotation.Nullable
  public List<Float> getFloatVal() {
    return floatVal;
  }

  public void setFloatVal(List<Float> floatVal) {
    this.floatVal = floatVal;
  }


  public GoogleCloudAiplatformV1Tensor shape(List<String> shape) {
    this.shape = shape;
    return this;
  }

  public GoogleCloudAiplatformV1Tensor addShapeItem(String shapeItem) {
    if (this.shape == null) {
      this.shape = new ArrayList<>();
    }
    this.shape.add(shapeItem);
    return this;
  }

  /**
   * Shape of the tensor.
   * @return shape
   */
  @javax.annotation.Nullable
  public List<String> getShape() {
    return shape;
  }

  public void setShape(List<String> shape) {
    this.shape = shape;
  }


  public GoogleCloudAiplatformV1Tensor doubleVal(List<Double> doubleVal) {
    this.doubleVal = doubleVal;
    return this;
  }

  public GoogleCloudAiplatformV1Tensor addDoubleValItem(Double doubleValItem) {
    if (this.doubleVal == null) {
      this.doubleVal = new ArrayList<>();
    }
    this.doubleVal.add(doubleValItem);
    return this;
  }

  /**
   * DOUBLE
   * @return doubleVal
   */
  @javax.annotation.Nullable
  public List<Double> getDoubleVal() {
    return doubleVal;
  }

  public void setDoubleVal(List<Double> doubleVal) {
    this.doubleVal = doubleVal;
  }


  public GoogleCloudAiplatformV1Tensor stringVal(List<String> stringVal) {
    this.stringVal = stringVal;
    return this;
  }

  public GoogleCloudAiplatformV1Tensor addStringValItem(String stringValItem) {
    if (this.stringVal == null) {
      this.stringVal = new ArrayList<>();
    }
    this.stringVal.add(stringValItem);
    return this;
  }

  /**
   * STRING
   * @return stringVal
   */
  @javax.annotation.Nullable
  public List<String> getStringVal() {
    return stringVal;
  }

  public void setStringVal(List<String> stringVal) {
    this.stringVal = stringVal;
  }


  public GoogleCloudAiplatformV1Tensor boolVal(List<Boolean> boolVal) {
    this.boolVal = boolVal;
    return this;
  }

  public GoogleCloudAiplatformV1Tensor addBoolValItem(Boolean boolValItem) {
    if (this.boolVal == null) {
      this.boolVal = new ArrayList<>();
    }
    this.boolVal.add(boolValItem);
    return this;
  }

  /**
   * Type specific representations that make it easy to create tensor protos in all languages. Only the representation corresponding to \&quot;dtype\&quot; can be set. The values hold the flattened representation of the tensor in row major order. BOOL
   * @return boolVal
   */
  @javax.annotation.Nullable
  public List<Boolean> getBoolVal() {
    return boolVal;
  }

  public void setBoolVal(List<Boolean> boolVal) {
    this.boolVal = boolVal;
  }


  public GoogleCloudAiplatformV1Tensor intVal(List<Integer> intVal) {
    this.intVal = intVal;
    return this;
  }

  public GoogleCloudAiplatformV1Tensor addIntValItem(Integer intValItem) {
    if (this.intVal == null) {
      this.intVal = new ArrayList<>();
    }
    this.intVal.add(intValItem);
    return this;
  }

  /**
   * INT_8 INT_16 INT_32
   * @return intVal
   */
  @javax.annotation.Nullable
  public List<Integer> getIntVal() {
    return intVal;
  }

  public void setIntVal(List<Integer> intVal) {
    this.intVal = intVal;
  }


  public GoogleCloudAiplatformV1Tensor uintVal(List<Integer> uintVal) {
    this.uintVal = uintVal;
    return this;
  }

  public GoogleCloudAiplatformV1Tensor addUintValItem(Integer uintValItem) {
    if (this.uintVal == null) {
      this.uintVal = new ArrayList<>();
    }
    this.uintVal.add(uintValItem);
    return this;
  }

  /**
   * UINT8 UINT16 UINT32
   * @return uintVal
   */
  @javax.annotation.Nullable
  public List<Integer> getUintVal() {
    return uintVal;
  }

  public void setUintVal(List<Integer> uintVal) {
    this.uintVal = uintVal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1Tensor googleCloudAiplatformV1Tensor = (GoogleCloudAiplatformV1Tensor) o;
    return Objects.equals(this.uint64Val, googleCloudAiplatformV1Tensor.uint64Val) &&
        Objects.equals(this.bytesVal, googleCloudAiplatformV1Tensor.bytesVal) &&
        Objects.equals(this.structVal, googleCloudAiplatformV1Tensor.structVal) &&
        Objects.equals(this.listVal, googleCloudAiplatformV1Tensor.listVal) &&
        Objects.equals(this.dtype, googleCloudAiplatformV1Tensor.dtype) &&
        Objects.equals(this.int64Val, googleCloudAiplatformV1Tensor.int64Val) &&
        Arrays.equals(this.tensorVal, googleCloudAiplatformV1Tensor.tensorVal) &&
        Objects.equals(this.floatVal, googleCloudAiplatformV1Tensor.floatVal) &&
        Objects.equals(this.shape, googleCloudAiplatformV1Tensor.shape) &&
        Objects.equals(this.doubleVal, googleCloudAiplatformV1Tensor.doubleVal) &&
        Objects.equals(this.stringVal, googleCloudAiplatformV1Tensor.stringVal) &&
        Objects.equals(this.boolVal, googleCloudAiplatformV1Tensor.boolVal) &&
        Objects.equals(this.intVal, googleCloudAiplatformV1Tensor.intVal) &&
        Objects.equals(this.uintVal, googleCloudAiplatformV1Tensor.uintVal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uint64Val, bytesVal, structVal, listVal, dtype, int64Val, Arrays.hashCode(tensorVal), floatVal, shape, doubleVal, stringVal, boolVal, intVal, uintVal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1Tensor {\n");
    sb.append("    uint64Val: ").append(toIndentedString(uint64Val)).append("\n");
    sb.append("    bytesVal: ").append(toIndentedString(bytesVal)).append("\n");
    sb.append("    structVal: ").append(toIndentedString(structVal)).append("\n");
    sb.append("    listVal: ").append(toIndentedString(listVal)).append("\n");
    sb.append("    dtype: ").append(toIndentedString(dtype)).append("\n");
    sb.append("    int64Val: ").append(toIndentedString(int64Val)).append("\n");
    sb.append("    tensorVal: ").append(toIndentedString(tensorVal)).append("\n");
    sb.append("    floatVal: ").append(toIndentedString(floatVal)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    doubleVal: ").append(toIndentedString(doubleVal)).append("\n");
    sb.append("    stringVal: ").append(toIndentedString(stringVal)).append("\n");
    sb.append("    boolVal: ").append(toIndentedString(boolVal)).append("\n");
    sb.append("    intVal: ").append(toIndentedString(intVal)).append("\n");
    sb.append("    uintVal: ").append(toIndentedString(uintVal)).append("\n");
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
    openapiFields.add("uint64Val");
    openapiFields.add("bytesVal");
    openapiFields.add("structVal");
    openapiFields.add("listVal");
    openapiFields.add("dtype");
    openapiFields.add("int64Val");
    openapiFields.add("tensorVal");
    openapiFields.add("floatVal");
    openapiFields.add("shape");
    openapiFields.add("doubleVal");
    openapiFields.add("stringVal");
    openapiFields.add("boolVal");
    openapiFields.add("intVal");
    openapiFields.add("uintVal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1Tensor
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1Tensor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1Tensor is not found in the empty JSON string", GoogleCloudAiplatformV1Tensor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1Tensor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1Tensor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("uint64Val") != null && !jsonObj.get("uint64Val").isJsonNull() && !jsonObj.get("uint64Val").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uint64Val` to be an array in the JSON string but got `%s`", jsonObj.get("uint64Val").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bytesVal") != null && !jsonObj.get("bytesVal").isJsonNull() && !jsonObj.get("bytesVal").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bytesVal` to be an array in the JSON string but got `%s`", jsonObj.get("bytesVal").toString()));
      }
      if (jsonObj.get("listVal") != null && !jsonObj.get("listVal").isJsonNull()) {
        JsonArray jsonArraylistVal = jsonObj.getAsJsonArray("listVal");
        if (jsonArraylistVal != null) {
          // ensure the json data is an array
          if (!jsonObj.get("listVal").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `listVal` to be an array in the JSON string but got `%s`", jsonObj.get("listVal").toString()));
          }

          // validate the optional field `listVal` (array)
          for (int i = 0; i < jsonArraylistVal.size(); i++) {
            GoogleCloudAiplatformV1Tensor.validateJsonElement(jsonArraylistVal.get(i));
          };
        }
      }
      if ((jsonObj.get("dtype") != null && !jsonObj.get("dtype").isJsonNull()) && !jsonObj.get("dtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtype").toString()));
      }
      // validate the optional field `dtype`
      if (jsonObj.get("dtype") != null && !jsonObj.get("dtype").isJsonNull()) {
        DtypeEnum.validateJsonElement(jsonObj.get("dtype"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("int64Val") != null && !jsonObj.get("int64Val").isJsonNull() && !jsonObj.get("int64Val").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `int64Val` to be an array in the JSON string but got `%s`", jsonObj.get("int64Val").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("floatVal") != null && !jsonObj.get("floatVal").isJsonNull() && !jsonObj.get("floatVal").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `floatVal` to be an array in the JSON string but got `%s`", jsonObj.get("floatVal").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("shape") != null && !jsonObj.get("shape").isJsonNull() && !jsonObj.get("shape").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shape` to be an array in the JSON string but got `%s`", jsonObj.get("shape").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("doubleVal") != null && !jsonObj.get("doubleVal").isJsonNull() && !jsonObj.get("doubleVal").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `doubleVal` to be an array in the JSON string but got `%s`", jsonObj.get("doubleVal").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("stringVal") != null && !jsonObj.get("stringVal").isJsonNull() && !jsonObj.get("stringVal").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `stringVal` to be an array in the JSON string but got `%s`", jsonObj.get("stringVal").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("boolVal") != null && !jsonObj.get("boolVal").isJsonNull() && !jsonObj.get("boolVal").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `boolVal` to be an array in the JSON string but got `%s`", jsonObj.get("boolVal").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("intVal") != null && !jsonObj.get("intVal").isJsonNull() && !jsonObj.get("intVal").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `intVal` to be an array in the JSON string but got `%s`", jsonObj.get("intVal").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("uintVal") != null && !jsonObj.get("uintVal").isJsonNull() && !jsonObj.get("uintVal").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uintVal` to be an array in the JSON string but got `%s`", jsonObj.get("uintVal").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1Tensor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1Tensor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1Tensor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1Tensor.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1Tensor>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1Tensor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1Tensor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1Tensor given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1Tensor
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1Tensor
   */
  public static GoogleCloudAiplatformV1Tensor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1Tensor.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1Tensor to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
