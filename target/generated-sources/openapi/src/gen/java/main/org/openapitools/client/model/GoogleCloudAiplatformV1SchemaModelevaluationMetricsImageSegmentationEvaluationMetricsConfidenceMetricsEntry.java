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
import org.openapitools.client.model.GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix;

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
 * GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry {
  public static final String SERIALIZED_NAME_CONFUSION_MATRIX = "confusionMatrix";
  @SerializedName(SERIALIZED_NAME_CONFUSION_MATRIX)
  private GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix confusionMatrix;

  public static final String SERIALIZED_NAME_IOU_SCORE = "iouScore";
  @SerializedName(SERIALIZED_NAME_IOU_SCORE)
  private Float iouScore;

  public static final String SERIALIZED_NAME_PRECISION = "precision";
  @SerializedName(SERIALIZED_NAME_PRECISION)
  private Float precision;

  public static final String SERIALIZED_NAME_RECALL = "recall";
  @SerializedName(SERIALIZED_NAME_RECALL)
  private Float recall;

  public static final String SERIALIZED_NAME_CONFIDENCE_THRESHOLD = "confidenceThreshold";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE_THRESHOLD)
  private Float confidenceThreshold;

  public static final String SERIALIZED_NAME_DICE_SCORE_COEFFICIENT = "diceScoreCoefficient";
  @SerializedName(SERIALIZED_NAME_DICE_SCORE_COEFFICIENT)
  private Float diceScoreCoefficient;

  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry() {
  }

  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry confusionMatrix(GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix confusionMatrix) {
    this.confusionMatrix = confusionMatrix;
    return this;
  }

  /**
   * Confusion matrix for the given confidence threshold.
   * @return confusionMatrix
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix getConfusionMatrix() {
    return confusionMatrix;
  }

  public void setConfusionMatrix(GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix confusionMatrix) {
    this.confusionMatrix = confusionMatrix;
  }


  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry iouScore(Float iouScore) {
    this.iouScore = iouScore;
    return this;
  }

  /**
   * The intersection-over-union score. The measure of overlap of the annotation&#39;s category mask with ground truth category mask on the DataItem.
   * @return iouScore
   */
  @javax.annotation.Nullable
  public Float getIouScore() {
    return iouScore;
  }

  public void setIouScore(Float iouScore) {
    this.iouScore = iouScore;
  }


  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry precision(Float precision) {
    this.precision = precision;
    return this;
  }

  /**
   * Precision for the given confidence threshold.
   * @return precision
   */
  @javax.annotation.Nullable
  public Float getPrecision() {
    return precision;
  }

  public void setPrecision(Float precision) {
    this.precision = precision;
  }


  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry recall(Float recall) {
    this.recall = recall;
    return this;
  }

  /**
   * Recall (True Positive Rate) for the given confidence threshold.
   * @return recall
   */
  @javax.annotation.Nullable
  public Float getRecall() {
    return recall;
  }

  public void setRecall(Float recall) {
    this.recall = recall;
  }


  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry confidenceThreshold(Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }

  /**
   * Metrics are computed with an assumption that the model never returns predictions with score lower than this value.
   * @return confidenceThreshold
   */
  @javax.annotation.Nullable
  public Float getConfidenceThreshold() {
    return confidenceThreshold;
  }

  public void setConfidenceThreshold(Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
  }


  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry diceScoreCoefficient(Float diceScoreCoefficient) {
    this.diceScoreCoefficient = diceScoreCoefficient;
    return this;
  }

  /**
   * DSC or the F1 score, The harmonic mean of recall and precision.
   * @return diceScoreCoefficient
   */
  @javax.annotation.Nullable
  public Float getDiceScoreCoefficient() {
    return diceScoreCoefficient;
  }

  public void setDiceScoreCoefficient(Float diceScoreCoefficient) {
    this.diceScoreCoefficient = diceScoreCoefficient;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry googleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry = (GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry) o;
    return Objects.equals(this.confusionMatrix, googleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry.confusionMatrix) &&
        Objects.equals(this.iouScore, googleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry.iouScore) &&
        Objects.equals(this.precision, googleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry.precision) &&
        Objects.equals(this.recall, googleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry.recall) &&
        Objects.equals(this.confidenceThreshold, googleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry.confidenceThreshold) &&
        Objects.equals(this.diceScoreCoefficient, googleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry.diceScoreCoefficient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confusionMatrix, iouScore, precision, recall, confidenceThreshold, diceScoreCoefficient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry {\n");
    sb.append("    confusionMatrix: ").append(toIndentedString(confusionMatrix)).append("\n");
    sb.append("    iouScore: ").append(toIndentedString(iouScore)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    recall: ").append(toIndentedString(recall)).append("\n");
    sb.append("    confidenceThreshold: ").append(toIndentedString(confidenceThreshold)).append("\n");
    sb.append("    diceScoreCoefficient: ").append(toIndentedString(diceScoreCoefficient)).append("\n");
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
    openapiFields.add("confusionMatrix");
    openapiFields.add("iouScore");
    openapiFields.add("precision");
    openapiFields.add("recall");
    openapiFields.add("confidenceThreshold");
    openapiFields.add("diceScoreCoefficient");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `confusionMatrix`
      if (jsonObj.get("confusionMatrix") != null && !jsonObj.get("confusionMatrix").isJsonNull()) {
        GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix.validateJsonElement(jsonObj.get("confusionMatrix"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry
   */
  public static GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
