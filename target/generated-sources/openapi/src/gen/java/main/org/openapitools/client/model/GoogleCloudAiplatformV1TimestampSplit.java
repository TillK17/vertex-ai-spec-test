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
 * Assigns input data to training, validation, and test sets based on a provided timestamps. The youngest data pieces are assigned to training set, next to validation set, and the oldest to the test set. Supported only for tabular Datasets.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1TimestampSplit {
  public static final String SERIALIZED_NAME_TRAINING_FRACTION = "trainingFraction";
  @SerializedName(SERIALIZED_NAME_TRAINING_FRACTION)
  private Double trainingFraction;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALIDATION_FRACTION = "validationFraction";
  @SerializedName(SERIALIZED_NAME_VALIDATION_FRACTION)
  private Double validationFraction;

  public static final String SERIALIZED_NAME_TEST_FRACTION = "testFraction";
  @SerializedName(SERIALIZED_NAME_TEST_FRACTION)
  private Double testFraction;

  public GoogleCloudAiplatformV1TimestampSplit() {
  }

  public GoogleCloudAiplatformV1TimestampSplit trainingFraction(Double trainingFraction) {
    this.trainingFraction = trainingFraction;
    return this;
  }

  /**
   * The fraction of the input data that is to be used to train the Model.
   * @return trainingFraction
   */
  @javax.annotation.Nullable
  public Double getTrainingFraction() {
    return trainingFraction;
  }

  public void setTrainingFraction(Double trainingFraction) {
    this.trainingFraction = trainingFraction;
  }


  public GoogleCloudAiplatformV1TimestampSplit key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Required. The key is a name of one of the Dataset&#39;s data columns. The values of the key (the values in the column) must be in RFC 3339 &#x60;date-time&#x60; format, where &#x60;time-offset&#x60; &#x3D; &#x60;\&quot;Z\&quot;&#x60; (e.g. 1985-04-12T23:20:50.52Z). If for a piece of data the key is not present or has an invalid value, that piece is ignored by the pipeline.
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public GoogleCloudAiplatformV1TimestampSplit validationFraction(Double validationFraction) {
    this.validationFraction = validationFraction;
    return this;
  }

  /**
   * The fraction of the input data that is to be used to validate the Model.
   * @return validationFraction
   */
  @javax.annotation.Nullable
  public Double getValidationFraction() {
    return validationFraction;
  }

  public void setValidationFraction(Double validationFraction) {
    this.validationFraction = validationFraction;
  }


  public GoogleCloudAiplatformV1TimestampSplit testFraction(Double testFraction) {
    this.testFraction = testFraction;
    return this;
  }

  /**
   * The fraction of the input data that is to be used to evaluate the Model.
   * @return testFraction
   */
  @javax.annotation.Nullable
  public Double getTestFraction() {
    return testFraction;
  }

  public void setTestFraction(Double testFraction) {
    this.testFraction = testFraction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1TimestampSplit googleCloudAiplatformV1TimestampSplit = (GoogleCloudAiplatformV1TimestampSplit) o;
    return Objects.equals(this.trainingFraction, googleCloudAiplatformV1TimestampSplit.trainingFraction) &&
        Objects.equals(this.key, googleCloudAiplatformV1TimestampSplit.key) &&
        Objects.equals(this.validationFraction, googleCloudAiplatformV1TimestampSplit.validationFraction) &&
        Objects.equals(this.testFraction, googleCloudAiplatformV1TimestampSplit.testFraction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainingFraction, key, validationFraction, testFraction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1TimestampSplit {\n");
    sb.append("    trainingFraction: ").append(toIndentedString(trainingFraction)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    validationFraction: ").append(toIndentedString(validationFraction)).append("\n");
    sb.append("    testFraction: ").append(toIndentedString(testFraction)).append("\n");
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
    openapiFields.add("trainingFraction");
    openapiFields.add("key");
    openapiFields.add("validationFraction");
    openapiFields.add("testFraction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1TimestampSplit
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1TimestampSplit.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1TimestampSplit is not found in the empty JSON string", GoogleCloudAiplatformV1TimestampSplit.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1TimestampSplit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1TimestampSplit` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1TimestampSplit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1TimestampSplit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1TimestampSplit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1TimestampSplit.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1TimestampSplit>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1TimestampSplit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1TimestampSplit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1TimestampSplit given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1TimestampSplit
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1TimestampSplit
   */
  public static GoogleCloudAiplatformV1TimestampSplit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1TimestampSplit.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1TimestampSplit to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
