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
 * Prediction output format for Video Classification.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult {
  public static final String SERIALIZED_NAME_TIME_SEGMENT_START = "timeSegmentStart";
  @SerializedName(SERIALIZED_NAME_TIME_SEGMENT_START)
  private String timeSegmentStart;

  public static final String SERIALIZED_NAME_TIME_SEGMENT_END = "timeSegmentEnd";
  @SerializedName(SERIALIZED_NAME_TIME_SEGMENT_END)
  private String timeSegmentEnd;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private Float confidence;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult() {
  }

  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult timeSegmentStart(String timeSegmentStart) {
    this.timeSegmentStart = timeSegmentStart;
    return this;
  }

  /**
   * The beginning, inclusive, of the video&#39;s time segment in which the AnnotationSpec has been identified. Expressed as a number of seconds as measured from the start of the video, with fractions up to a microsecond precision, and with \&quot;s\&quot; appended at the end. Note that for &#39;segment-classification&#39; prediction type, this equals the original &#39;timeSegmentStart&#39; from the input instance, for other types it is the start of a shot or a 1 second interval respectively.
   * @return timeSegmentStart
   */
  @javax.annotation.Nullable
  public String getTimeSegmentStart() {
    return timeSegmentStart;
  }

  public void setTimeSegmentStart(String timeSegmentStart) {
    this.timeSegmentStart = timeSegmentStart;
  }


  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult timeSegmentEnd(String timeSegmentEnd) {
    this.timeSegmentEnd = timeSegmentEnd;
    return this;
  }

  /**
   * The end, exclusive, of the video&#39;s time segment in which the AnnotationSpec has been identified. Expressed as a number of seconds as measured from the start of the video, with fractions up to a microsecond precision, and with \&quot;s\&quot; appended at the end. Note that for &#39;segment-classification&#39; prediction type, this equals the original &#39;timeSegmentEnd&#39; from the input instance, for other types it is the end of a shot or a 1 second interval respectively.
   * @return timeSegmentEnd
   */
  @javax.annotation.Nullable
  public String getTimeSegmentEnd() {
    return timeSegmentEnd;
  }

  public void setTimeSegmentEnd(String timeSegmentEnd) {
    this.timeSegmentEnd = timeSegmentEnd;
  }


  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the prediction. The requested types can be configured via parameters. This will be one of - segment-classification - shot-classification - one-sec-interval-classification
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult confidence(Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * The Model&#39;s confidence in correction of this prediction, higher value means higher confidence.
   * @return confidence
   */
  @javax.annotation.Nullable
  public Float getConfidence() {
    return confidence;
  }

  public void setConfidence(Float confidence) {
    this.confidence = confidence;
  }


  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the AnnotationSpec that had been identified.
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The resource ID of the AnnotationSpec that had been identified.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult googleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult = (GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult) o;
    return Objects.equals(this.timeSegmentStart, googleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult.timeSegmentStart) &&
        Objects.equals(this.timeSegmentEnd, googleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult.timeSegmentEnd) &&
        Objects.equals(this.type, googleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult.type) &&
        Objects.equals(this.confidence, googleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult.confidence) &&
        Objects.equals(this.displayName, googleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult.displayName) &&
        Objects.equals(this.id, googleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSegmentStart, timeSegmentEnd, type, confidence, displayName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult {\n");
    sb.append("    timeSegmentStart: ").append(toIndentedString(timeSegmentStart)).append("\n");
    sb.append("    timeSegmentEnd: ").append(toIndentedString(timeSegmentEnd)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("timeSegmentStart");
    openapiFields.add("timeSegmentEnd");
    openapiFields.add("type");
    openapiFields.add("confidence");
    openapiFields.add("displayName");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("timeSegmentStart") != null && !jsonObj.get("timeSegmentStart").isJsonNull()) && !jsonObj.get("timeSegmentStart").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeSegmentStart` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeSegmentStart").toString()));
      }
      if ((jsonObj.get("timeSegmentEnd") != null && !jsonObj.get("timeSegmentEnd").isJsonNull()) && !jsonObj.get("timeSegmentEnd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeSegmentEnd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeSegmentEnd").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult
   */
  public static GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

