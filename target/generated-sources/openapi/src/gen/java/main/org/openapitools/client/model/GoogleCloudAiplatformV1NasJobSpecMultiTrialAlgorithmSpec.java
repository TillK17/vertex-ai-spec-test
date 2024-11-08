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
import org.openapitools.client.model.GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecMetricSpec;
import org.openapitools.client.model.GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecSearchTrialSpec;
import org.openapitools.client.model.GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecTrainTrialSpec;

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
 * The spec of multi-trial Neural Architecture Search (NAS).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec {
  /**
   * The multi-trial Neural Architecture Search (NAS) algorithm type. Defaults to &#x60;REINFORCEMENT_LEARNING&#x60;.
   */
  @JsonAdapter(MultiTrialAlgorithmEnum.Adapter.class)
  public enum MultiTrialAlgorithmEnum {
    MULTI_TRIAL_ALGORITHM_UNSPECIFIED("MULTI_TRIAL_ALGORITHM_UNSPECIFIED"),
    
    REINFORCEMENT_LEARNING("REINFORCEMENT_LEARNING"),
    
    GRID_SEARCH("GRID_SEARCH");

    private String value;

    MultiTrialAlgorithmEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MultiTrialAlgorithmEnum fromValue(String value) {
      for (MultiTrialAlgorithmEnum b : MultiTrialAlgorithmEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MultiTrialAlgorithmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MultiTrialAlgorithmEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MultiTrialAlgorithmEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MultiTrialAlgorithmEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MultiTrialAlgorithmEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MULTI_TRIAL_ALGORITHM = "multiTrialAlgorithm";
  @SerializedName(SERIALIZED_NAME_MULTI_TRIAL_ALGORITHM)
  private MultiTrialAlgorithmEnum multiTrialAlgorithm;

  public static final String SERIALIZED_NAME_TRAIN_TRIAL_SPEC = "trainTrialSpec";
  @SerializedName(SERIALIZED_NAME_TRAIN_TRIAL_SPEC)
  private GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecTrainTrialSpec trainTrialSpec;

  public static final String SERIALIZED_NAME_SEARCH_TRIAL_SPEC = "searchTrialSpec";
  @SerializedName(SERIALIZED_NAME_SEARCH_TRIAL_SPEC)
  private GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecSearchTrialSpec searchTrialSpec;

  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecMetricSpec metric;

  public GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec() {
  }

  public GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec multiTrialAlgorithm(MultiTrialAlgorithmEnum multiTrialAlgorithm) {
    this.multiTrialAlgorithm = multiTrialAlgorithm;
    return this;
  }

  /**
   * The multi-trial Neural Architecture Search (NAS) algorithm type. Defaults to &#x60;REINFORCEMENT_LEARNING&#x60;.
   * @return multiTrialAlgorithm
   */
  @javax.annotation.Nullable
  public MultiTrialAlgorithmEnum getMultiTrialAlgorithm() {
    return multiTrialAlgorithm;
  }

  public void setMultiTrialAlgorithm(MultiTrialAlgorithmEnum multiTrialAlgorithm) {
    this.multiTrialAlgorithm = multiTrialAlgorithm;
  }


  public GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec trainTrialSpec(GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecTrainTrialSpec trainTrialSpec) {
    this.trainTrialSpec = trainTrialSpec;
    return this;
  }

  /**
   * Spec for train trials. Top N [TrainTrialSpec.max_parallel_trial_count] search trials will be trained for every M [TrainTrialSpec.frequency] trials searched.
   * @return trainTrialSpec
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecTrainTrialSpec getTrainTrialSpec() {
    return trainTrialSpec;
  }

  public void setTrainTrialSpec(GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecTrainTrialSpec trainTrialSpec) {
    this.trainTrialSpec = trainTrialSpec;
  }


  public GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec searchTrialSpec(GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecSearchTrialSpec searchTrialSpec) {
    this.searchTrialSpec = searchTrialSpec;
    return this;
  }

  /**
   * Required. Spec for search trials.
   * @return searchTrialSpec
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecSearchTrialSpec getSearchTrialSpec() {
    return searchTrialSpec;
  }

  public void setSearchTrialSpec(GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecSearchTrialSpec searchTrialSpec) {
    this.searchTrialSpec = searchTrialSpec;
  }


  public GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec metric(GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecMetricSpec metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Metric specs for the NAS job. Validation for this field is done at &#x60;multi_trial_algorithm_spec&#x60; field.
   * @return metric
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecMetricSpec getMetric() {
    return metric;
  }

  public void setMetric(GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecMetricSpec metric) {
    this.metric = metric;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec googleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec = (GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec) o;
    return Objects.equals(this.multiTrialAlgorithm, googleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec.multiTrialAlgorithm) &&
        Objects.equals(this.trainTrialSpec, googleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec.trainTrialSpec) &&
        Objects.equals(this.searchTrialSpec, googleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec.searchTrialSpec) &&
        Objects.equals(this.metric, googleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multiTrialAlgorithm, trainTrialSpec, searchTrialSpec, metric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec {\n");
    sb.append("    multiTrialAlgorithm: ").append(toIndentedString(multiTrialAlgorithm)).append("\n");
    sb.append("    trainTrialSpec: ").append(toIndentedString(trainTrialSpec)).append("\n");
    sb.append("    searchTrialSpec: ").append(toIndentedString(searchTrialSpec)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
    openapiFields.add("multiTrialAlgorithm");
    openapiFields.add("trainTrialSpec");
    openapiFields.add("searchTrialSpec");
    openapiFields.add("metric");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec is not found in the empty JSON string", GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("multiTrialAlgorithm") != null && !jsonObj.get("multiTrialAlgorithm").isJsonNull()) && !jsonObj.get("multiTrialAlgorithm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `multiTrialAlgorithm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("multiTrialAlgorithm").toString()));
      }
      // validate the optional field `multiTrialAlgorithm`
      if (jsonObj.get("multiTrialAlgorithm") != null && !jsonObj.get("multiTrialAlgorithm").isJsonNull()) {
        MultiTrialAlgorithmEnum.validateJsonElement(jsonObj.get("multiTrialAlgorithm"));
      }
      // validate the optional field `trainTrialSpec`
      if (jsonObj.get("trainTrialSpec") != null && !jsonObj.get("trainTrialSpec").isJsonNull()) {
        GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecTrainTrialSpec.validateJsonElement(jsonObj.get("trainTrialSpec"));
      }
      // validate the optional field `searchTrialSpec`
      if (jsonObj.get("searchTrialSpec") != null && !jsonObj.get("searchTrialSpec").isJsonNull()) {
        GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecSearchTrialSpec.validateJsonElement(jsonObj.get("searchTrialSpec"));
      }
      // validate the optional field `metric`
      if (jsonObj.get("metric") != null && !jsonObj.get("metric").isJsonNull()) {
        GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecMetricSpec.validateJsonElement(jsonObj.get("metric"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec
   */
  public static GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

