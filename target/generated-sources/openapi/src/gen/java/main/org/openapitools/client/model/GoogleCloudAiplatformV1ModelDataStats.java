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
 * Stats of data used for train or evaluate the Model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ModelDataStats {
  public static final String SERIALIZED_NAME_VALIDATION_DATA_ITEMS_COUNT = "validationDataItemsCount";
  @SerializedName(SERIALIZED_NAME_VALIDATION_DATA_ITEMS_COUNT)
  private String validationDataItemsCount;

  public static final String SERIALIZED_NAME_TEST_DATA_ITEMS_COUNT = "testDataItemsCount";
  @SerializedName(SERIALIZED_NAME_TEST_DATA_ITEMS_COUNT)
  private String testDataItemsCount;

  public static final String SERIALIZED_NAME_VALIDATION_ANNOTATIONS_COUNT = "validationAnnotationsCount";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ANNOTATIONS_COUNT)
  private String validationAnnotationsCount;

  public static final String SERIALIZED_NAME_TEST_ANNOTATIONS_COUNT = "testAnnotationsCount";
  @SerializedName(SERIALIZED_NAME_TEST_ANNOTATIONS_COUNT)
  private String testAnnotationsCount;

  public static final String SERIALIZED_NAME_TRAINING_DATA_ITEMS_COUNT = "trainingDataItemsCount";
  @SerializedName(SERIALIZED_NAME_TRAINING_DATA_ITEMS_COUNT)
  private String trainingDataItemsCount;

  public static final String SERIALIZED_NAME_TRAINING_ANNOTATIONS_COUNT = "trainingAnnotationsCount";
  @SerializedName(SERIALIZED_NAME_TRAINING_ANNOTATIONS_COUNT)
  private String trainingAnnotationsCount;

  public GoogleCloudAiplatformV1ModelDataStats() {
  }

  public GoogleCloudAiplatformV1ModelDataStats validationDataItemsCount(String validationDataItemsCount) {
    this.validationDataItemsCount = validationDataItemsCount;
    return this;
  }

  /**
   * Number of DataItems that were used for validating this Model during training.
   * @return validationDataItemsCount
   */
  @javax.annotation.Nullable
  public String getValidationDataItemsCount() {
    return validationDataItemsCount;
  }

  public void setValidationDataItemsCount(String validationDataItemsCount) {
    this.validationDataItemsCount = validationDataItemsCount;
  }


  public GoogleCloudAiplatformV1ModelDataStats testDataItemsCount(String testDataItemsCount) {
    this.testDataItemsCount = testDataItemsCount;
    return this;
  }

  /**
   * Number of DataItems that were used for evaluating this Model. If the Model is evaluated multiple times, this will be the number of test DataItems used by the first evaluation. If the Model is not evaluated, the number is 0.
   * @return testDataItemsCount
   */
  @javax.annotation.Nullable
  public String getTestDataItemsCount() {
    return testDataItemsCount;
  }

  public void setTestDataItemsCount(String testDataItemsCount) {
    this.testDataItemsCount = testDataItemsCount;
  }


  public GoogleCloudAiplatformV1ModelDataStats validationAnnotationsCount(String validationAnnotationsCount) {
    this.validationAnnotationsCount = validationAnnotationsCount;
    return this;
  }

  /**
   * Number of Annotations that are used for validating this Model during training.
   * @return validationAnnotationsCount
   */
  @javax.annotation.Nullable
  public String getValidationAnnotationsCount() {
    return validationAnnotationsCount;
  }

  public void setValidationAnnotationsCount(String validationAnnotationsCount) {
    this.validationAnnotationsCount = validationAnnotationsCount;
  }


  public GoogleCloudAiplatformV1ModelDataStats testAnnotationsCount(String testAnnotationsCount) {
    this.testAnnotationsCount = testAnnotationsCount;
    return this;
  }

  /**
   * Number of Annotations that are used for evaluating this Model. If the Model is evaluated multiple times, this will be the number of test Annotations used by the first evaluation. If the Model is not evaluated, the number is 0.
   * @return testAnnotationsCount
   */
  @javax.annotation.Nullable
  public String getTestAnnotationsCount() {
    return testAnnotationsCount;
  }

  public void setTestAnnotationsCount(String testAnnotationsCount) {
    this.testAnnotationsCount = testAnnotationsCount;
  }


  public GoogleCloudAiplatformV1ModelDataStats trainingDataItemsCount(String trainingDataItemsCount) {
    this.trainingDataItemsCount = trainingDataItemsCount;
    return this;
  }

  /**
   * Number of DataItems that were used for training this Model.
   * @return trainingDataItemsCount
   */
  @javax.annotation.Nullable
  public String getTrainingDataItemsCount() {
    return trainingDataItemsCount;
  }

  public void setTrainingDataItemsCount(String trainingDataItemsCount) {
    this.trainingDataItemsCount = trainingDataItemsCount;
  }


  public GoogleCloudAiplatformV1ModelDataStats trainingAnnotationsCount(String trainingAnnotationsCount) {
    this.trainingAnnotationsCount = trainingAnnotationsCount;
    return this;
  }

  /**
   * Number of Annotations that are used for training this Model.
   * @return trainingAnnotationsCount
   */
  @javax.annotation.Nullable
  public String getTrainingAnnotationsCount() {
    return trainingAnnotationsCount;
  }

  public void setTrainingAnnotationsCount(String trainingAnnotationsCount) {
    this.trainingAnnotationsCount = trainingAnnotationsCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ModelDataStats googleCloudAiplatformV1ModelDataStats = (GoogleCloudAiplatformV1ModelDataStats) o;
    return Objects.equals(this.validationDataItemsCount, googleCloudAiplatformV1ModelDataStats.validationDataItemsCount) &&
        Objects.equals(this.testDataItemsCount, googleCloudAiplatformV1ModelDataStats.testDataItemsCount) &&
        Objects.equals(this.validationAnnotationsCount, googleCloudAiplatformV1ModelDataStats.validationAnnotationsCount) &&
        Objects.equals(this.testAnnotationsCount, googleCloudAiplatformV1ModelDataStats.testAnnotationsCount) &&
        Objects.equals(this.trainingDataItemsCount, googleCloudAiplatformV1ModelDataStats.trainingDataItemsCount) &&
        Objects.equals(this.trainingAnnotationsCount, googleCloudAiplatformV1ModelDataStats.trainingAnnotationsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationDataItemsCount, testDataItemsCount, validationAnnotationsCount, testAnnotationsCount, trainingDataItemsCount, trainingAnnotationsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ModelDataStats {\n");
    sb.append("    validationDataItemsCount: ").append(toIndentedString(validationDataItemsCount)).append("\n");
    sb.append("    testDataItemsCount: ").append(toIndentedString(testDataItemsCount)).append("\n");
    sb.append("    validationAnnotationsCount: ").append(toIndentedString(validationAnnotationsCount)).append("\n");
    sb.append("    testAnnotationsCount: ").append(toIndentedString(testAnnotationsCount)).append("\n");
    sb.append("    trainingDataItemsCount: ").append(toIndentedString(trainingDataItemsCount)).append("\n");
    sb.append("    trainingAnnotationsCount: ").append(toIndentedString(trainingAnnotationsCount)).append("\n");
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
    openapiFields.add("validationDataItemsCount");
    openapiFields.add("testDataItemsCount");
    openapiFields.add("validationAnnotationsCount");
    openapiFields.add("testAnnotationsCount");
    openapiFields.add("trainingDataItemsCount");
    openapiFields.add("trainingAnnotationsCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ModelDataStats
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ModelDataStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ModelDataStats is not found in the empty JSON string", GoogleCloudAiplatformV1ModelDataStats.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ModelDataStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ModelDataStats` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("validationDataItemsCount") != null && !jsonObj.get("validationDataItemsCount").isJsonNull()) && !jsonObj.get("validationDataItemsCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validationDataItemsCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validationDataItemsCount").toString()));
      }
      if ((jsonObj.get("testDataItemsCount") != null && !jsonObj.get("testDataItemsCount").isJsonNull()) && !jsonObj.get("testDataItemsCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testDataItemsCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testDataItemsCount").toString()));
      }
      if ((jsonObj.get("validationAnnotationsCount") != null && !jsonObj.get("validationAnnotationsCount").isJsonNull()) && !jsonObj.get("validationAnnotationsCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validationAnnotationsCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validationAnnotationsCount").toString()));
      }
      if ((jsonObj.get("testAnnotationsCount") != null && !jsonObj.get("testAnnotationsCount").isJsonNull()) && !jsonObj.get("testAnnotationsCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testAnnotationsCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testAnnotationsCount").toString()));
      }
      if ((jsonObj.get("trainingDataItemsCount") != null && !jsonObj.get("trainingDataItemsCount").isJsonNull()) && !jsonObj.get("trainingDataItemsCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trainingDataItemsCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trainingDataItemsCount").toString()));
      }
      if ((jsonObj.get("trainingAnnotationsCount") != null && !jsonObj.get("trainingAnnotationsCount").isJsonNull()) && !jsonObj.get("trainingAnnotationsCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trainingAnnotationsCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trainingAnnotationsCount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ModelDataStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ModelDataStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ModelDataStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ModelDataStats.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ModelDataStats>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ModelDataStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ModelDataStats read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ModelDataStats given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ModelDataStats
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ModelDataStats
   */
  public static GoogleCloudAiplatformV1ModelDataStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ModelDataStats.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ModelDataStats to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

