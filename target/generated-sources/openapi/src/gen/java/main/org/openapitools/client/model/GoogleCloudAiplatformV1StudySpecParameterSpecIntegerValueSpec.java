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
 * Value specification for a parameter in &#x60;INTEGER&#x60; type.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec {
  public static final String SERIALIZED_NAME_MAX_VALUE = "maxValue";
  @SerializedName(SERIALIZED_NAME_MAX_VALUE)
  private String maxValue;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_MIN_VALUE = "minValue";
  @SerializedName(SERIALIZED_NAME_MIN_VALUE)
  private String minValue;

  public GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec() {
  }

  public GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec maxValue(String maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Required. Inclusive maximum value of the parameter.
   * @return maxValue
   */
  @javax.annotation.Nullable
  public String getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(String maxValue) {
    this.maxValue = maxValue;
  }


  public GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * A default value for an &#x60;INTEGER&#x60; parameter that is assumed to be a relatively good starting point. Unset value signals that there is no offered starting point. Currently only supported by the Vertex AI Vizier service. Not supported by HyperparameterTuningJob or TrainingPipeline.
   * @return defaultValue
   */
  @javax.annotation.Nullable
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec minValue(String minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Required. Inclusive minimum value of the parameter.
   * @return minValue
   */
  @javax.annotation.Nullable
  public String getMinValue() {
    return minValue;
  }

  public void setMinValue(String minValue) {
    this.minValue = minValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec googleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec = (GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec) o;
    return Objects.equals(this.maxValue, googleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec.maxValue) &&
        Objects.equals(this.defaultValue, googleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec.defaultValue) &&
        Objects.equals(this.minValue, googleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec.minValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxValue, defaultValue, minValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec {\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
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
    openapiFields.add("maxValue");
    openapiFields.add("defaultValue");
    openapiFields.add("minValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec is not found in the empty JSON string", GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("maxValue") != null && !jsonObj.get("maxValue").isJsonNull()) && !jsonObj.get("maxValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxValue").toString()));
      }
      if ((jsonObj.get("defaultValue") != null && !jsonObj.get("defaultValue").isJsonNull()) && !jsonObj.get("defaultValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultValue").toString()));
      }
      if ((jsonObj.get("minValue") != null && !jsonObj.get("minValue").isJsonNull()) && !jsonObj.get("minValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec
   */
  public static GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
