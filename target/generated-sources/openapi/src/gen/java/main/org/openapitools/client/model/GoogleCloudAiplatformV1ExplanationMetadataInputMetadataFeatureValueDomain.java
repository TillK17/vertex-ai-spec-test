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
 * Domain details of the input feature value. Provides numeric information about the feature, such as its range (min, max). If the feature has been pre-processed, for example with z-scoring, then it provides information about how to recover the original feature. For example, if the input feature is an image and it has been pre-processed to obtain 0-mean and stddev &#x3D; 1 values, then original_mean, and original_stddev refer to the mean and stddev of the original feature (e.g. image tensor) from which input feature (with mean &#x3D; 0 and stddev &#x3D; 1) was obtained.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain {
  public static final String SERIALIZED_NAME_MIN_VALUE = "minValue";
  @SerializedName(SERIALIZED_NAME_MIN_VALUE)
  private Float minValue;

  public static final String SERIALIZED_NAME_ORIGINAL_STDDEV = "originalStddev";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_STDDEV)
  private Float originalStddev;

  public static final String SERIALIZED_NAME_ORIGINAL_MEAN = "originalMean";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_MEAN)
  private Float originalMean;

  public static final String SERIALIZED_NAME_MAX_VALUE = "maxValue";
  @SerializedName(SERIALIZED_NAME_MAX_VALUE)
  private Float maxValue;

  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain() {
  }

  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain minValue(Float minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * The minimum permissible value for this feature.
   * @return minValue
   */
  @javax.annotation.Nullable
  public Float getMinValue() {
    return minValue;
  }

  public void setMinValue(Float minValue) {
    this.minValue = minValue;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain originalStddev(Float originalStddev) {
    this.originalStddev = originalStddev;
    return this;
  }

  /**
   * If this input feature has been normalized to a standard deviation of 1.0, the original_stddev specifies the standard deviation of the domain prior to normalization.
   * @return originalStddev
   */
  @javax.annotation.Nullable
  public Float getOriginalStddev() {
    return originalStddev;
  }

  public void setOriginalStddev(Float originalStddev) {
    this.originalStddev = originalStddev;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain originalMean(Float originalMean) {
    this.originalMean = originalMean;
    return this;
  }

  /**
   * If this input feature has been normalized to a mean value of 0, the original_mean specifies the mean value of the domain prior to normalization.
   * @return originalMean
   */
  @javax.annotation.Nullable
  public Float getOriginalMean() {
    return originalMean;
  }

  public void setOriginalMean(Float originalMean) {
    this.originalMean = originalMean;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain maxValue(Float maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * The maximum permissible value for this feature.
   * @return maxValue
   */
  @javax.annotation.Nullable
  public Float getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Float maxValue) {
    this.maxValue = maxValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain googleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain = (GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain) o;
    return Objects.equals(this.minValue, googleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain.minValue) &&
        Objects.equals(this.originalStddev, googleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain.originalStddev) &&
        Objects.equals(this.originalMean, googleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain.originalMean) &&
        Objects.equals(this.maxValue, googleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain.maxValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minValue, originalStddev, originalMean, maxValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain {\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    originalStddev: ").append(toIndentedString(originalStddev)).append("\n");
    sb.append("    originalMean: ").append(toIndentedString(originalMean)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
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
    openapiFields.add("minValue");
    openapiFields.add("originalStddev");
    openapiFields.add("originalMean");
    openapiFields.add("maxValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain is not found in the empty JSON string", GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain
   */
  public static GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
