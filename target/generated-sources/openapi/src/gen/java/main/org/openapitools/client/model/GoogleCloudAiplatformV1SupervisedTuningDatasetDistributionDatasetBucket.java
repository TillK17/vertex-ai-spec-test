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
 * Dataset bucket used to create a histogram for the distribution given a population of values.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket {
  public static final String SERIALIZED_NAME_LEFT = "left";
  @SerializedName(SERIALIZED_NAME_LEFT)
  private Double left;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Double count;

  public static final String SERIALIZED_NAME_RIGHT = "right";
  @SerializedName(SERIALIZED_NAME_RIGHT)
  private Double right;

  public GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket() {
  }

  public GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket(
     Double left, 
     Double count, 
     Double right
  ) {
    this();
    this.left = left;
    this.count = count;
    this.right = right;
  }

  /**
   * Output only. Left bound of the bucket.
   * @return left
   */
  @javax.annotation.Nullable
  public Double getLeft() {
    return left;
  }



  /**
   * Output only. Number of values in the bucket.
   * @return count
   */
  @javax.annotation.Nullable
  public Double getCount() {
    return count;
  }



  /**
   * Output only. Right bound of the bucket.
   * @return right
   */
  @javax.annotation.Nullable
  public Double getRight() {
    return right;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket googleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket = (GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket) o;
    return Objects.equals(this.left, googleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket.left) &&
        Objects.equals(this.count, googleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket.count) &&
        Objects.equals(this.right, googleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, count, right);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket {\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
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
    openapiFields.add("left");
    openapiFields.add("count");
    openapiFields.add("right");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket is not found in the empty JSON string", GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket
   */
  public static GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SupervisedTuningDatasetDistributionDatasetBucket to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
