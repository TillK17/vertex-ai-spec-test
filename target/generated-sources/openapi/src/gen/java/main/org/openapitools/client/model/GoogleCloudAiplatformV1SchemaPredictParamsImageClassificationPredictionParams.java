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
 * Prediction model parameters for Image Classification.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams {
  public static final String SERIALIZED_NAME_CONFIDENCE_THRESHOLD = "confidenceThreshold";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE_THRESHOLD)
  private Float confidenceThreshold;

  public static final String SERIALIZED_NAME_MAX_PREDICTIONS = "maxPredictions";
  @SerializedName(SERIALIZED_NAME_MAX_PREDICTIONS)
  private Integer maxPredictions;

  public GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams() {
  }

  public GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams confidenceThreshold(Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }

  /**
   * The Model only returns predictions with at least this confidence score. Default value is 0.0
   * @return confidenceThreshold
   */
  @javax.annotation.Nullable
  public Float getConfidenceThreshold() {
    return confidenceThreshold;
  }

  public void setConfidenceThreshold(Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
  }


  public GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams maxPredictions(Integer maxPredictions) {
    this.maxPredictions = maxPredictions;
    return this;
  }

  /**
   * The Model only returns up to that many top, by confidence score, predictions per instance. If this number is very high, the Model may return fewer predictions. Default value is 10.
   * @return maxPredictions
   */
  @javax.annotation.Nullable
  public Integer getMaxPredictions() {
    return maxPredictions;
  }

  public void setMaxPredictions(Integer maxPredictions) {
    this.maxPredictions = maxPredictions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams googleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams = (GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams) o;
    return Objects.equals(this.confidenceThreshold, googleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams.confidenceThreshold) &&
        Objects.equals(this.maxPredictions, googleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams.maxPredictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidenceThreshold, maxPredictions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams {\n");
    sb.append("    confidenceThreshold: ").append(toIndentedString(confidenceThreshold)).append("\n");
    sb.append("    maxPredictions: ").append(toIndentedString(maxPredictions)).append("\n");
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
    openapiFields.add("confidenceThreshold");
    openapiFields.add("maxPredictions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams
   */
  public static GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaPredictParamsImageClassificationPredictionParams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
