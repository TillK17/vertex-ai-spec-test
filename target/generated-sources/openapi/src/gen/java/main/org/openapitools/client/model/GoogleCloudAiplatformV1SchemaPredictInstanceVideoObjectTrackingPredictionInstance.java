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
 * Prediction input format for Video Object Tracking.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance {
  public static final String SERIALIZED_NAME_TIME_SEGMENT_START = "timeSegmentStart";
  @SerializedName(SERIALIZED_NAME_TIME_SEGMENT_START)
  private String timeSegmentStart;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public static final String SERIALIZED_NAME_TIME_SEGMENT_END = "timeSegmentEnd";
  @SerializedName(SERIALIZED_NAME_TIME_SEGMENT_END)
  private String timeSegmentEnd;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance() {
  }

  public GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance timeSegmentStart(String timeSegmentStart) {
    this.timeSegmentStart = timeSegmentStart;
    return this;
  }

  /**
   * The beginning, inclusive, of the video&#39;s time segment on which to perform the prediction. Expressed as a number of seconds as measured from the start of the video, with \&quot;s\&quot; appended at the end. Fractions are allowed, up to a microsecond precision.
   * @return timeSegmentStart
   */
  @javax.annotation.Nullable
  public String getTimeSegmentStart() {
    return timeSegmentStart;
  }

  public void setTimeSegmentStart(String timeSegmentStart) {
    this.timeSegmentStart = timeSegmentStart;
  }


  public GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The MIME type of the content of the video. Only the following are supported: video/mp4 video/avi video/quicktime
   * @return mimeType
   */
  @javax.annotation.Nullable
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance timeSegmentEnd(String timeSegmentEnd) {
    this.timeSegmentEnd = timeSegmentEnd;
    return this;
  }

  /**
   * The end, exclusive, of the video&#39;s time segment on which to perform the prediction. Expressed as a number of seconds as measured from the start of the video, with \&quot;s\&quot; appended at the end. Fractions are allowed, up to a microsecond precision, and \&quot;inf\&quot; or \&quot;Infinity\&quot; is allowed, which means the end of the video.
   * @return timeSegmentEnd
   */
  @javax.annotation.Nullable
  public String getTimeSegmentEnd() {
    return timeSegmentEnd;
  }

  public void setTimeSegmentEnd(String timeSegmentEnd) {
    this.timeSegmentEnd = timeSegmentEnd;
  }


  public GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The Google Cloud Storage location of the video on which to perform the prediction.
   * @return content
   */
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance googleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance = (GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance) o;
    return Objects.equals(this.timeSegmentStart, googleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance.timeSegmentStart) &&
        Objects.equals(this.mimeType, googleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance.mimeType) &&
        Objects.equals(this.timeSegmentEnd, googleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance.timeSegmentEnd) &&
        Objects.equals(this.content, googleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSegmentStart, mimeType, timeSegmentEnd, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance {\n");
    sb.append("    timeSegmentStart: ").append(toIndentedString(timeSegmentStart)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    timeSegmentEnd: ").append(toIndentedString(timeSegmentEnd)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
    openapiFields.add("mimeType");
    openapiFields.add("timeSegmentEnd");
    openapiFields.add("content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("timeSegmentStart") != null && !jsonObj.get("timeSegmentStart").isJsonNull()) && !jsonObj.get("timeSegmentStart").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeSegmentStart` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeSegmentStart").toString()));
      }
      if ((jsonObj.get("mimeType") != null && !jsonObj.get("mimeType").isJsonNull()) && !jsonObj.get("mimeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mimeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mimeType").toString()));
      }
      if ((jsonObj.get("timeSegmentEnd") != null && !jsonObj.get("timeSegmentEnd").isJsonNull()) && !jsonObj.get("timeSegmentEnd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeSegmentEnd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeSegmentEnd").toString()));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance
   */
  public static GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaPredictInstanceVideoObjectTrackingPredictionInstance to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
