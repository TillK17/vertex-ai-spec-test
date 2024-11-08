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
import org.openapitools.client.model.GoogleCloudAiplatformV1Scalar;
import org.openapitools.client.model.GoogleCloudAiplatformV1TensorboardBlobSequence;
import org.openapitools.client.model.GoogleCloudAiplatformV1TensorboardTensor;

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
 * A TensorboardTimeSeries data point.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1TimeSeriesDataPoint {
  public static final String SERIALIZED_NAME_STEP = "step";
  @SerializedName(SERIALIZED_NAME_STEP)
  private String step;

  public static final String SERIALIZED_NAME_TENSOR = "tensor";
  @SerializedName(SERIALIZED_NAME_TENSOR)
  private GoogleCloudAiplatformV1TensorboardTensor tensor;

  public static final String SERIALIZED_NAME_SCALAR = "scalar";
  @SerializedName(SERIALIZED_NAME_SCALAR)
  private GoogleCloudAiplatformV1Scalar scalar;

  public static final String SERIALIZED_NAME_BLOBS = "blobs";
  @SerializedName(SERIALIZED_NAME_BLOBS)
  private GoogleCloudAiplatformV1TensorboardBlobSequence blobs;

  public static final String SERIALIZED_NAME_WALL_TIME = "wallTime";
  @SerializedName(SERIALIZED_NAME_WALL_TIME)
  private String wallTime;

  public GoogleCloudAiplatformV1TimeSeriesDataPoint() {
  }

  public GoogleCloudAiplatformV1TimeSeriesDataPoint step(String step) {
    this.step = step;
    return this;
  }

  /**
   * Step index of this data point within the run.
   * @return step
   */
  @javax.annotation.Nullable
  public String getStep() {
    return step;
  }

  public void setStep(String step) {
    this.step = step;
  }


  public GoogleCloudAiplatformV1TimeSeriesDataPoint tensor(GoogleCloudAiplatformV1TensorboardTensor tensor) {
    this.tensor = tensor;
    return this;
  }

  /**
   * A tensor value.
   * @return tensor
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1TensorboardTensor getTensor() {
    return tensor;
  }

  public void setTensor(GoogleCloudAiplatformV1TensorboardTensor tensor) {
    this.tensor = tensor;
  }


  public GoogleCloudAiplatformV1TimeSeriesDataPoint scalar(GoogleCloudAiplatformV1Scalar scalar) {
    this.scalar = scalar;
    return this;
  }

  /**
   * A scalar value.
   * @return scalar
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1Scalar getScalar() {
    return scalar;
  }

  public void setScalar(GoogleCloudAiplatformV1Scalar scalar) {
    this.scalar = scalar;
  }


  public GoogleCloudAiplatformV1TimeSeriesDataPoint blobs(GoogleCloudAiplatformV1TensorboardBlobSequence blobs) {
    this.blobs = blobs;
    return this;
  }

  /**
   * A blob sequence value.
   * @return blobs
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1TensorboardBlobSequence getBlobs() {
    return blobs;
  }

  public void setBlobs(GoogleCloudAiplatformV1TensorboardBlobSequence blobs) {
    this.blobs = blobs;
  }


  public GoogleCloudAiplatformV1TimeSeriesDataPoint wallTime(String wallTime) {
    this.wallTime = wallTime;
    return this;
  }

  /**
   * Wall clock timestamp when this data point is generated by the end user.
   * @return wallTime
   */
  @javax.annotation.Nullable
  public String getWallTime() {
    return wallTime;
  }

  public void setWallTime(String wallTime) {
    this.wallTime = wallTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1TimeSeriesDataPoint googleCloudAiplatformV1TimeSeriesDataPoint = (GoogleCloudAiplatformV1TimeSeriesDataPoint) o;
    return Objects.equals(this.step, googleCloudAiplatformV1TimeSeriesDataPoint.step) &&
        Objects.equals(this.tensor, googleCloudAiplatformV1TimeSeriesDataPoint.tensor) &&
        Objects.equals(this.scalar, googleCloudAiplatformV1TimeSeriesDataPoint.scalar) &&
        Objects.equals(this.blobs, googleCloudAiplatformV1TimeSeriesDataPoint.blobs) &&
        Objects.equals(this.wallTime, googleCloudAiplatformV1TimeSeriesDataPoint.wallTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(step, tensor, scalar, blobs, wallTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1TimeSeriesDataPoint {\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    tensor: ").append(toIndentedString(tensor)).append("\n");
    sb.append("    scalar: ").append(toIndentedString(scalar)).append("\n");
    sb.append("    blobs: ").append(toIndentedString(blobs)).append("\n");
    sb.append("    wallTime: ").append(toIndentedString(wallTime)).append("\n");
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
    openapiFields.add("step");
    openapiFields.add("tensor");
    openapiFields.add("scalar");
    openapiFields.add("blobs");
    openapiFields.add("wallTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1TimeSeriesDataPoint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1TimeSeriesDataPoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1TimeSeriesDataPoint is not found in the empty JSON string", GoogleCloudAiplatformV1TimeSeriesDataPoint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1TimeSeriesDataPoint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1TimeSeriesDataPoint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("step") != null && !jsonObj.get("step").isJsonNull()) && !jsonObj.get("step").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `step` to be a primitive type in the JSON string but got `%s`", jsonObj.get("step").toString()));
      }
      // validate the optional field `tensor`
      if (jsonObj.get("tensor") != null && !jsonObj.get("tensor").isJsonNull()) {
        GoogleCloudAiplatformV1TensorboardTensor.validateJsonElement(jsonObj.get("tensor"));
      }
      // validate the optional field `scalar`
      if (jsonObj.get("scalar") != null && !jsonObj.get("scalar").isJsonNull()) {
        GoogleCloudAiplatformV1Scalar.validateJsonElement(jsonObj.get("scalar"));
      }
      // validate the optional field `blobs`
      if (jsonObj.get("blobs") != null && !jsonObj.get("blobs").isJsonNull()) {
        GoogleCloudAiplatformV1TensorboardBlobSequence.validateJsonElement(jsonObj.get("blobs"));
      }
      if ((jsonObj.get("wallTime") != null && !jsonObj.get("wallTime").isJsonNull()) && !jsonObj.get("wallTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wallTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wallTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1TimeSeriesDataPoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1TimeSeriesDataPoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1TimeSeriesDataPoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1TimeSeriesDataPoint.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1TimeSeriesDataPoint>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1TimeSeriesDataPoint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1TimeSeriesDataPoint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1TimeSeriesDataPoint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1TimeSeriesDataPoint
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1TimeSeriesDataPoint
   */
  public static GoogleCloudAiplatformV1TimeSeriesDataPoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1TimeSeriesDataPoint.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1TimeSeriesDataPoint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

