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
import java.util.List;
import org.openapitools.client.model.GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetrics;

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
 * Model evaluation metrics for video action recognition.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics {
  public static final String SERIALIZED_NAME_VIDEO_ACTION_METRICS = "videoActionMetrics";
  @SerializedName(SERIALIZED_NAME_VIDEO_ACTION_METRICS)
  private List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetrics> videoActionMetrics = new ArrayList<>();

  public static final String SERIALIZED_NAME_EVALUATED_ACTION_COUNT = "evaluatedActionCount";
  @SerializedName(SERIALIZED_NAME_EVALUATED_ACTION_COUNT)
  private Integer evaluatedActionCount;

  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics() {
  }

  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics videoActionMetrics(List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetrics> videoActionMetrics) {
    this.videoActionMetrics = videoActionMetrics;
    return this;
  }

  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics addVideoActionMetricsItem(GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetrics videoActionMetricsItem) {
    if (this.videoActionMetrics == null) {
      this.videoActionMetrics = new ArrayList<>();
    }
    this.videoActionMetrics.add(videoActionMetricsItem);
    return this;
  }

  /**
   * The metric entries for precision window lengths: 1s,2s,3s.
   * @return videoActionMetrics
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetrics> getVideoActionMetrics() {
    return videoActionMetrics;
  }

  public void setVideoActionMetrics(List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetrics> videoActionMetrics) {
    this.videoActionMetrics = videoActionMetrics;
  }


  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics evaluatedActionCount(Integer evaluatedActionCount) {
    this.evaluatedActionCount = evaluatedActionCount;
    return this;
  }

  /**
   * The number of ground truth actions used to create this evaluation.
   * @return evaluatedActionCount
   */
  @javax.annotation.Nullable
  public Integer getEvaluatedActionCount() {
    return evaluatedActionCount;
  }

  public void setEvaluatedActionCount(Integer evaluatedActionCount) {
    this.evaluatedActionCount = evaluatedActionCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics googleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics = (GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics) o;
    return Objects.equals(this.videoActionMetrics, googleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics.videoActionMetrics) &&
        Objects.equals(this.evaluatedActionCount, googleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics.evaluatedActionCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoActionMetrics, evaluatedActionCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics {\n");
    sb.append("    videoActionMetrics: ").append(toIndentedString(videoActionMetrics)).append("\n");
    sb.append("    evaluatedActionCount: ").append(toIndentedString(evaluatedActionCount)).append("\n");
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
    openapiFields.add("videoActionMetrics");
    openapiFields.add("evaluatedActionCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("videoActionMetrics") != null && !jsonObj.get("videoActionMetrics").isJsonNull()) {
        JsonArray jsonArrayvideoActionMetrics = jsonObj.getAsJsonArray("videoActionMetrics");
        if (jsonArrayvideoActionMetrics != null) {
          // ensure the json data is an array
          if (!jsonObj.get("videoActionMetrics").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `videoActionMetrics` to be an array in the JSON string but got `%s`", jsonObj.get("videoActionMetrics").toString()));
          }

          // validate the optional field `videoActionMetrics` (array)
          for (int i = 0; i < jsonArrayvideoActionMetrics.size(); i++) {
            GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetrics.validateJsonElement(jsonArrayvideoActionMetrics.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics
   */
  public static GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionRecognitionMetrics to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
