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
import java.util.Arrays;
import org.openapitools.client.model.GoogleCloudAiplatformV1BoolArray;
import org.openapitools.client.model.GoogleCloudAiplatformV1DoubleArray;
import org.openapitools.client.model.GoogleCloudAiplatformV1FeatureValueMetadata;
import org.openapitools.client.model.GoogleCloudAiplatformV1Int64Array;
import org.openapitools.client.model.GoogleCloudAiplatformV1StringArray;
import org.openapitools.client.model.GoogleCloudAiplatformV1StructValue;

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
 * Value for a feature.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1FeatureValue {
  public static final String SERIALIZED_NAME_STRING_VALUE = "stringValue";
  @SerializedName(SERIALIZED_NAME_STRING_VALUE)
  private String stringValue;

  public static final String SERIALIZED_NAME_STRING_ARRAY_VALUE = "stringArrayValue";
  @SerializedName(SERIALIZED_NAME_STRING_ARRAY_VALUE)
  private GoogleCloudAiplatformV1StringArray stringArrayValue;

  public static final String SERIALIZED_NAME_BOOL_VALUE = "boolValue";
  @SerializedName(SERIALIZED_NAME_BOOL_VALUE)
  private Boolean boolValue;

  public static final String SERIALIZED_NAME_BOOL_ARRAY_VALUE = "boolArrayValue";
  @SerializedName(SERIALIZED_NAME_BOOL_ARRAY_VALUE)
  private GoogleCloudAiplatformV1BoolArray boolArrayValue;

  public static final String SERIALIZED_NAME_INT64_ARRAY_VALUE = "int64ArrayValue";
  @SerializedName(SERIALIZED_NAME_INT64_ARRAY_VALUE)
  private GoogleCloudAiplatformV1Int64Array int64ArrayValue;

  public static final String SERIALIZED_NAME_STRUCT_VALUE = "structValue";
  @SerializedName(SERIALIZED_NAME_STRUCT_VALUE)
  private GoogleCloudAiplatformV1StructValue structValue;

  public static final String SERIALIZED_NAME_DOUBLE_ARRAY_VALUE = "doubleArrayValue";
  @SerializedName(SERIALIZED_NAME_DOUBLE_ARRAY_VALUE)
  private GoogleCloudAiplatformV1DoubleArray doubleArrayValue;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private GoogleCloudAiplatformV1FeatureValueMetadata metadata;

  public static final String SERIALIZED_NAME_DOUBLE_VALUE = "doubleValue";
  @SerializedName(SERIALIZED_NAME_DOUBLE_VALUE)
  private Double doubleValue;

  public static final String SERIALIZED_NAME_INT64_VALUE = "int64Value";
  @SerializedName(SERIALIZED_NAME_INT64_VALUE)
  private String int64Value;

  public static final String SERIALIZED_NAME_BYTES_VALUE = "bytesValue";
  @SerializedName(SERIALIZED_NAME_BYTES_VALUE)
  private byte[] bytesValue;

  public GoogleCloudAiplatformV1FeatureValue() {
  }

  public GoogleCloudAiplatformV1FeatureValue stringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  /**
   * String feature value.
   * @return stringValue
   */
  @javax.annotation.Nullable
  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }


  public GoogleCloudAiplatformV1FeatureValue stringArrayValue(GoogleCloudAiplatformV1StringArray stringArrayValue) {
    this.stringArrayValue = stringArrayValue;
    return this;
  }

  /**
   * A list of string type feature value.
   * @return stringArrayValue
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1StringArray getStringArrayValue() {
    return stringArrayValue;
  }

  public void setStringArrayValue(GoogleCloudAiplatformV1StringArray stringArrayValue) {
    this.stringArrayValue = stringArrayValue;
  }


  public GoogleCloudAiplatformV1FeatureValue boolValue(Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  /**
   * Bool type feature value.
   * @return boolValue
   */
  @javax.annotation.Nullable
  public Boolean getBoolValue() {
    return boolValue;
  }

  public void setBoolValue(Boolean boolValue) {
    this.boolValue = boolValue;
  }


  public GoogleCloudAiplatformV1FeatureValue boolArrayValue(GoogleCloudAiplatformV1BoolArray boolArrayValue) {
    this.boolArrayValue = boolArrayValue;
    return this;
  }

  /**
   * A list of bool type feature value.
   * @return boolArrayValue
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1BoolArray getBoolArrayValue() {
    return boolArrayValue;
  }

  public void setBoolArrayValue(GoogleCloudAiplatformV1BoolArray boolArrayValue) {
    this.boolArrayValue = boolArrayValue;
  }


  public GoogleCloudAiplatformV1FeatureValue int64ArrayValue(GoogleCloudAiplatformV1Int64Array int64ArrayValue) {
    this.int64ArrayValue = int64ArrayValue;
    return this;
  }

  /**
   * A list of int64 type feature value.
   * @return int64ArrayValue
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1Int64Array getInt64ArrayValue() {
    return int64ArrayValue;
  }

  public void setInt64ArrayValue(GoogleCloudAiplatformV1Int64Array int64ArrayValue) {
    this.int64ArrayValue = int64ArrayValue;
  }


  public GoogleCloudAiplatformV1FeatureValue structValue(GoogleCloudAiplatformV1StructValue structValue) {
    this.structValue = structValue;
    return this;
  }

  /**
   * A struct type feature value.
   * @return structValue
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1StructValue getStructValue() {
    return structValue;
  }

  public void setStructValue(GoogleCloudAiplatformV1StructValue structValue) {
    this.structValue = structValue;
  }


  public GoogleCloudAiplatformV1FeatureValue doubleArrayValue(GoogleCloudAiplatformV1DoubleArray doubleArrayValue) {
    this.doubleArrayValue = doubleArrayValue;
    return this;
  }

  /**
   * A list of double type feature value.
   * @return doubleArrayValue
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1DoubleArray getDoubleArrayValue() {
    return doubleArrayValue;
  }

  public void setDoubleArrayValue(GoogleCloudAiplatformV1DoubleArray doubleArrayValue) {
    this.doubleArrayValue = doubleArrayValue;
  }


  public GoogleCloudAiplatformV1FeatureValue metadata(GoogleCloudAiplatformV1FeatureValueMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Metadata of feature value.
   * @return metadata
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1FeatureValueMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(GoogleCloudAiplatformV1FeatureValueMetadata metadata) {
    this.metadata = metadata;
  }


  public GoogleCloudAiplatformV1FeatureValue doubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

  /**
   * Double type feature value.
   * @return doubleValue
   */
  @javax.annotation.Nullable
  public Double getDoubleValue() {
    return doubleValue;
  }

  public void setDoubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
  }


  public GoogleCloudAiplatformV1FeatureValue int64Value(String int64Value) {
    this.int64Value = int64Value;
    return this;
  }

  /**
   * Int64 feature value.
   * @return int64Value
   */
  @javax.annotation.Nullable
  public String getInt64Value() {
    return int64Value;
  }

  public void setInt64Value(String int64Value) {
    this.int64Value = int64Value;
  }


  public GoogleCloudAiplatformV1FeatureValue bytesValue(byte[] bytesValue) {
    this.bytesValue = bytesValue;
    return this;
  }

  /**
   * Bytes feature value.
   * @return bytesValue
   */
  @javax.annotation.Nullable
  public byte[] getBytesValue() {
    return bytesValue;
  }

  public void setBytesValue(byte[] bytesValue) {
    this.bytesValue = bytesValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1FeatureValue googleCloudAiplatformV1FeatureValue = (GoogleCloudAiplatformV1FeatureValue) o;
    return Objects.equals(this.stringValue, googleCloudAiplatformV1FeatureValue.stringValue) &&
        Objects.equals(this.stringArrayValue, googleCloudAiplatformV1FeatureValue.stringArrayValue) &&
        Objects.equals(this.boolValue, googleCloudAiplatformV1FeatureValue.boolValue) &&
        Objects.equals(this.boolArrayValue, googleCloudAiplatformV1FeatureValue.boolArrayValue) &&
        Objects.equals(this.int64ArrayValue, googleCloudAiplatformV1FeatureValue.int64ArrayValue) &&
        Objects.equals(this.structValue, googleCloudAiplatformV1FeatureValue.structValue) &&
        Objects.equals(this.doubleArrayValue, googleCloudAiplatformV1FeatureValue.doubleArrayValue) &&
        Objects.equals(this.metadata, googleCloudAiplatformV1FeatureValue.metadata) &&
        Objects.equals(this.doubleValue, googleCloudAiplatformV1FeatureValue.doubleValue) &&
        Objects.equals(this.int64Value, googleCloudAiplatformV1FeatureValue.int64Value) &&
        Arrays.equals(this.bytesValue, googleCloudAiplatformV1FeatureValue.bytesValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringValue, stringArrayValue, boolValue, boolArrayValue, int64ArrayValue, structValue, doubleArrayValue, metadata, doubleValue, int64Value, Arrays.hashCode(bytesValue));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1FeatureValue {\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    stringArrayValue: ").append(toIndentedString(stringArrayValue)).append("\n");
    sb.append("    boolValue: ").append(toIndentedString(boolValue)).append("\n");
    sb.append("    boolArrayValue: ").append(toIndentedString(boolArrayValue)).append("\n");
    sb.append("    int64ArrayValue: ").append(toIndentedString(int64ArrayValue)).append("\n");
    sb.append("    structValue: ").append(toIndentedString(structValue)).append("\n");
    sb.append("    doubleArrayValue: ").append(toIndentedString(doubleArrayValue)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    doubleValue: ").append(toIndentedString(doubleValue)).append("\n");
    sb.append("    int64Value: ").append(toIndentedString(int64Value)).append("\n");
    sb.append("    bytesValue: ").append(toIndentedString(bytesValue)).append("\n");
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
    openapiFields.add("stringValue");
    openapiFields.add("stringArrayValue");
    openapiFields.add("boolValue");
    openapiFields.add("boolArrayValue");
    openapiFields.add("int64ArrayValue");
    openapiFields.add("structValue");
    openapiFields.add("doubleArrayValue");
    openapiFields.add("metadata");
    openapiFields.add("doubleValue");
    openapiFields.add("int64Value");
    openapiFields.add("bytesValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1FeatureValue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1FeatureValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1FeatureValue is not found in the empty JSON string", GoogleCloudAiplatformV1FeatureValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1FeatureValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1FeatureValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("stringValue") != null && !jsonObj.get("stringValue").isJsonNull()) && !jsonObj.get("stringValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stringValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stringValue").toString()));
      }
      // validate the optional field `stringArrayValue`
      if (jsonObj.get("stringArrayValue") != null && !jsonObj.get("stringArrayValue").isJsonNull()) {
        GoogleCloudAiplatformV1StringArray.validateJsonElement(jsonObj.get("stringArrayValue"));
      }
      // validate the optional field `boolArrayValue`
      if (jsonObj.get("boolArrayValue") != null && !jsonObj.get("boolArrayValue").isJsonNull()) {
        GoogleCloudAiplatformV1BoolArray.validateJsonElement(jsonObj.get("boolArrayValue"));
      }
      // validate the optional field `int64ArrayValue`
      if (jsonObj.get("int64ArrayValue") != null && !jsonObj.get("int64ArrayValue").isJsonNull()) {
        GoogleCloudAiplatformV1Int64Array.validateJsonElement(jsonObj.get("int64ArrayValue"));
      }
      // validate the optional field `structValue`
      if (jsonObj.get("structValue") != null && !jsonObj.get("structValue").isJsonNull()) {
        GoogleCloudAiplatformV1StructValue.validateJsonElement(jsonObj.get("structValue"));
      }
      // validate the optional field `doubleArrayValue`
      if (jsonObj.get("doubleArrayValue") != null && !jsonObj.get("doubleArrayValue").isJsonNull()) {
        GoogleCloudAiplatformV1DoubleArray.validateJsonElement(jsonObj.get("doubleArrayValue"));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        GoogleCloudAiplatformV1FeatureValueMetadata.validateJsonElement(jsonObj.get("metadata"));
      }
      if ((jsonObj.get("int64Value") != null && !jsonObj.get("int64Value").isJsonNull()) && !jsonObj.get("int64Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `int64Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("int64Value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1FeatureValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1FeatureValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1FeatureValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1FeatureValue.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1FeatureValue>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1FeatureValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1FeatureValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1FeatureValue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1FeatureValue
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1FeatureValue
   */
  public static GoogleCloudAiplatformV1FeatureValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1FeatureValue.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1FeatureValue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

