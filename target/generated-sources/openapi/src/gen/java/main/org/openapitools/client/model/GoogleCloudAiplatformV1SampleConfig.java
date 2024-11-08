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
 * Active learning data sampling config. For every active learning labeling iteration, it will select a batch of data based on the sampling strategy.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SampleConfig {
  /**
   * Field to choose sampling strategy. Sampling strategy will decide which data should be selected for human labeling in every batch.
   */
  @JsonAdapter(SampleStrategyEnum.Adapter.class)
  public enum SampleStrategyEnum {
    SAMPLE_STRATEGY_UNSPECIFIED("SAMPLE_STRATEGY_UNSPECIFIED"),
    
    UNCERTAINTY("UNCERTAINTY");

    private String value;

    SampleStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SampleStrategyEnum fromValue(String value) {
      for (SampleStrategyEnum b : SampleStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SampleStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SampleStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SampleStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SampleStrategyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SampleStrategyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SAMPLE_STRATEGY = "sampleStrategy";
  @SerializedName(SERIALIZED_NAME_SAMPLE_STRATEGY)
  private SampleStrategyEnum sampleStrategy;

  public static final String SERIALIZED_NAME_FOLLOWING_BATCH_SAMPLE_PERCENTAGE = "followingBatchSamplePercentage";
  @SerializedName(SERIALIZED_NAME_FOLLOWING_BATCH_SAMPLE_PERCENTAGE)
  private Integer followingBatchSamplePercentage;

  public static final String SERIALIZED_NAME_INITIAL_BATCH_SAMPLE_PERCENTAGE = "initialBatchSamplePercentage";
  @SerializedName(SERIALIZED_NAME_INITIAL_BATCH_SAMPLE_PERCENTAGE)
  private Integer initialBatchSamplePercentage;

  public GoogleCloudAiplatformV1SampleConfig() {
  }

  public GoogleCloudAiplatformV1SampleConfig sampleStrategy(SampleStrategyEnum sampleStrategy) {
    this.sampleStrategy = sampleStrategy;
    return this;
  }

  /**
   * Field to choose sampling strategy. Sampling strategy will decide which data should be selected for human labeling in every batch.
   * @return sampleStrategy
   */
  @javax.annotation.Nullable
  public SampleStrategyEnum getSampleStrategy() {
    return sampleStrategy;
  }

  public void setSampleStrategy(SampleStrategyEnum sampleStrategy) {
    this.sampleStrategy = sampleStrategy;
  }


  public GoogleCloudAiplatformV1SampleConfig followingBatchSamplePercentage(Integer followingBatchSamplePercentage) {
    this.followingBatchSamplePercentage = followingBatchSamplePercentage;
    return this;
  }

  /**
   * The percentage of data needed to be labeled in each following batch (except the first batch).
   * @return followingBatchSamplePercentage
   */
  @javax.annotation.Nullable
  public Integer getFollowingBatchSamplePercentage() {
    return followingBatchSamplePercentage;
  }

  public void setFollowingBatchSamplePercentage(Integer followingBatchSamplePercentage) {
    this.followingBatchSamplePercentage = followingBatchSamplePercentage;
  }


  public GoogleCloudAiplatformV1SampleConfig initialBatchSamplePercentage(Integer initialBatchSamplePercentage) {
    this.initialBatchSamplePercentage = initialBatchSamplePercentage;
    return this;
  }

  /**
   * The percentage of data needed to be labeled in the first batch.
   * @return initialBatchSamplePercentage
   */
  @javax.annotation.Nullable
  public Integer getInitialBatchSamplePercentage() {
    return initialBatchSamplePercentage;
  }

  public void setInitialBatchSamplePercentage(Integer initialBatchSamplePercentage) {
    this.initialBatchSamplePercentage = initialBatchSamplePercentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SampleConfig googleCloudAiplatformV1SampleConfig = (GoogleCloudAiplatformV1SampleConfig) o;
    return Objects.equals(this.sampleStrategy, googleCloudAiplatformV1SampleConfig.sampleStrategy) &&
        Objects.equals(this.followingBatchSamplePercentage, googleCloudAiplatformV1SampleConfig.followingBatchSamplePercentage) &&
        Objects.equals(this.initialBatchSamplePercentage, googleCloudAiplatformV1SampleConfig.initialBatchSamplePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sampleStrategy, followingBatchSamplePercentage, initialBatchSamplePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SampleConfig {\n");
    sb.append("    sampleStrategy: ").append(toIndentedString(sampleStrategy)).append("\n");
    sb.append("    followingBatchSamplePercentage: ").append(toIndentedString(followingBatchSamplePercentage)).append("\n");
    sb.append("    initialBatchSamplePercentage: ").append(toIndentedString(initialBatchSamplePercentage)).append("\n");
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
    openapiFields.add("sampleStrategy");
    openapiFields.add("followingBatchSamplePercentage");
    openapiFields.add("initialBatchSamplePercentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SampleConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SampleConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SampleConfig is not found in the empty JSON string", GoogleCloudAiplatformV1SampleConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SampleConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SampleConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sampleStrategy") != null && !jsonObj.get("sampleStrategy").isJsonNull()) && !jsonObj.get("sampleStrategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sampleStrategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sampleStrategy").toString()));
      }
      // validate the optional field `sampleStrategy`
      if (jsonObj.get("sampleStrategy") != null && !jsonObj.get("sampleStrategy").isJsonNull()) {
        SampleStrategyEnum.validateJsonElement(jsonObj.get("sampleStrategy"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SampleConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SampleConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SampleConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SampleConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SampleConfig>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SampleConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SampleConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SampleConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SampleConfig
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SampleConfig
   */
  public static GoogleCloudAiplatformV1SampleConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SampleConfig.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SampleConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

