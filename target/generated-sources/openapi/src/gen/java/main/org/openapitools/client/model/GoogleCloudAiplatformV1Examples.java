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
import org.openapitools.client.model.Any;
import org.openapitools.client.model.GoogleCloudAiplatformV1ExamplesExampleGcsSource;
import org.openapitools.client.model.GoogleCloudAiplatformV1Presets;

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
 * Example-based explainability that returns the nearest neighbors from the provided dataset.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1Examples {
  public static final String SERIALIZED_NAME_NEAREST_NEIGHBOR_SEARCH_CONFIG = "nearestNeighborSearchConfig";
  @SerializedName(SERIALIZED_NAME_NEAREST_NEIGHBOR_SEARCH_CONFIG)
  private Any nearestNeighborSearchConfig = null;

  public static final String SERIALIZED_NAME_NEIGHBOR_COUNT = "neighborCount";
  @SerializedName(SERIALIZED_NAME_NEIGHBOR_COUNT)
  private Integer neighborCount;

  public static final String SERIALIZED_NAME_EXAMPLE_GCS_SOURCE = "exampleGcsSource";
  @SerializedName(SERIALIZED_NAME_EXAMPLE_GCS_SOURCE)
  private GoogleCloudAiplatformV1ExamplesExampleGcsSource exampleGcsSource;

  public static final String SERIALIZED_NAME_PRESETS = "presets";
  @SerializedName(SERIALIZED_NAME_PRESETS)
  private GoogleCloudAiplatformV1Presets presets;

  public GoogleCloudAiplatformV1Examples() {
  }

  public GoogleCloudAiplatformV1Examples nearestNeighborSearchConfig(Any nearestNeighborSearchConfig) {
    this.nearestNeighborSearchConfig = nearestNeighborSearchConfig;
    return this;
  }

  /**
   * The full configuration for the generated index, the semantics are the same as metadata and should match [NearestNeighborSearchConfig](https://cloud.google.com/vertex-ai/docs/explainable-ai/configuring-explanations-example-based#nearest-neighbor-search-config).
   * @return nearestNeighborSearchConfig
   */
  @javax.annotation.Nullable
  public Any getNearestNeighborSearchConfig() {
    return nearestNeighborSearchConfig;
  }

  public void setNearestNeighborSearchConfig(Any nearestNeighborSearchConfig) {
    this.nearestNeighborSearchConfig = nearestNeighborSearchConfig;
  }


  public GoogleCloudAiplatformV1Examples neighborCount(Integer neighborCount) {
    this.neighborCount = neighborCount;
    return this;
  }

  /**
   * The number of neighbors to return when querying for examples.
   * @return neighborCount
   */
  @javax.annotation.Nullable
  public Integer getNeighborCount() {
    return neighborCount;
  }

  public void setNeighborCount(Integer neighborCount) {
    this.neighborCount = neighborCount;
  }


  public GoogleCloudAiplatformV1Examples exampleGcsSource(GoogleCloudAiplatformV1ExamplesExampleGcsSource exampleGcsSource) {
    this.exampleGcsSource = exampleGcsSource;
    return this;
  }

  /**
   * The Cloud Storage input instances.
   * @return exampleGcsSource
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ExamplesExampleGcsSource getExampleGcsSource() {
    return exampleGcsSource;
  }

  public void setExampleGcsSource(GoogleCloudAiplatformV1ExamplesExampleGcsSource exampleGcsSource) {
    this.exampleGcsSource = exampleGcsSource;
  }


  public GoogleCloudAiplatformV1Examples presets(GoogleCloudAiplatformV1Presets presets) {
    this.presets = presets;
    return this;
  }

  /**
   * Simplified preset configuration, which automatically sets configuration values based on the desired query speed-precision trade-off and modality.
   * @return presets
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1Presets getPresets() {
    return presets;
  }

  public void setPresets(GoogleCloudAiplatformV1Presets presets) {
    this.presets = presets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1Examples googleCloudAiplatformV1Examples = (GoogleCloudAiplatformV1Examples) o;
    return Objects.equals(this.nearestNeighborSearchConfig, googleCloudAiplatformV1Examples.nearestNeighborSearchConfig) &&
        Objects.equals(this.neighborCount, googleCloudAiplatformV1Examples.neighborCount) &&
        Objects.equals(this.exampleGcsSource, googleCloudAiplatformV1Examples.exampleGcsSource) &&
        Objects.equals(this.presets, googleCloudAiplatformV1Examples.presets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nearestNeighborSearchConfig, neighborCount, exampleGcsSource, presets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1Examples {\n");
    sb.append("    nearestNeighborSearchConfig: ").append(toIndentedString(nearestNeighborSearchConfig)).append("\n");
    sb.append("    neighborCount: ").append(toIndentedString(neighborCount)).append("\n");
    sb.append("    exampleGcsSource: ").append(toIndentedString(exampleGcsSource)).append("\n");
    sb.append("    presets: ").append(toIndentedString(presets)).append("\n");
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
    openapiFields.add("nearestNeighborSearchConfig");
    openapiFields.add("neighborCount");
    openapiFields.add("exampleGcsSource");
    openapiFields.add("presets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1Examples
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1Examples.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1Examples is not found in the empty JSON string", GoogleCloudAiplatformV1Examples.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1Examples.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1Examples` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `exampleGcsSource`
      if (jsonObj.get("exampleGcsSource") != null && !jsonObj.get("exampleGcsSource").isJsonNull()) {
        GoogleCloudAiplatformV1ExamplesExampleGcsSource.validateJsonElement(jsonObj.get("exampleGcsSource"));
      }
      // validate the optional field `presets`
      if (jsonObj.get("presets") != null && !jsonObj.get("presets").isJsonNull()) {
        GoogleCloudAiplatformV1Presets.validateJsonElement(jsonObj.get("presets"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1Examples.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1Examples' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1Examples> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1Examples.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1Examples>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1Examples value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1Examples read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1Examples given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1Examples
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1Examples
   */
  public static GoogleCloudAiplatformV1Examples fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1Examples.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1Examples to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
