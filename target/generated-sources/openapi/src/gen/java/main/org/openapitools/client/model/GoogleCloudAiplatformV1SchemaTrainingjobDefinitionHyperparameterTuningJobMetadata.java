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
 * GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata {
  public static final String SERIALIZED_NAME_BEST_TRIAL_BACKING_CUSTOM_JOB = "bestTrialBackingCustomJob";
  @SerializedName(SERIALIZED_NAME_BEST_TRIAL_BACKING_CUSTOM_JOB)
  private String bestTrialBackingCustomJob;

  public static final String SERIALIZED_NAME_BACKING_HYPERPARAMETER_TUNING_JOB = "backingHyperparameterTuningJob";
  @SerializedName(SERIALIZED_NAME_BACKING_HYPERPARAMETER_TUNING_JOB)
  private String backingHyperparameterTuningJob;

  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata() {
  }

  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata bestTrialBackingCustomJob(String bestTrialBackingCustomJob) {
    this.bestTrialBackingCustomJob = bestTrialBackingCustomJob;
    return this;
  }

  /**
   * The resource name of the CustomJob that has been created to run the best Trial of this HyperparameterTuning task.
   * @return bestTrialBackingCustomJob
   */
  @javax.annotation.Nullable
  public String getBestTrialBackingCustomJob() {
    return bestTrialBackingCustomJob;
  }

  public void setBestTrialBackingCustomJob(String bestTrialBackingCustomJob) {
    this.bestTrialBackingCustomJob = bestTrialBackingCustomJob;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata backingHyperparameterTuningJob(String backingHyperparameterTuningJob) {
    this.backingHyperparameterTuningJob = backingHyperparameterTuningJob;
    return this;
  }

  /**
   * The resource name of the HyperparameterTuningJob that has been created to carry out this HyperparameterTuning task.
   * @return backingHyperparameterTuningJob
   */
  @javax.annotation.Nullable
  public String getBackingHyperparameterTuningJob() {
    return backingHyperparameterTuningJob;
  }

  public void setBackingHyperparameterTuningJob(String backingHyperparameterTuningJob) {
    this.backingHyperparameterTuningJob = backingHyperparameterTuningJob;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata googleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata = (GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata) o;
    return Objects.equals(this.bestTrialBackingCustomJob, googleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata.bestTrialBackingCustomJob) &&
        Objects.equals(this.backingHyperparameterTuningJob, googleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata.backingHyperparameterTuningJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bestTrialBackingCustomJob, backingHyperparameterTuningJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata {\n");
    sb.append("    bestTrialBackingCustomJob: ").append(toIndentedString(bestTrialBackingCustomJob)).append("\n");
    sb.append("    backingHyperparameterTuningJob: ").append(toIndentedString(backingHyperparameterTuningJob)).append("\n");
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
    openapiFields.add("bestTrialBackingCustomJob");
    openapiFields.add("backingHyperparameterTuningJob");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bestTrialBackingCustomJob") != null && !jsonObj.get("bestTrialBackingCustomJob").isJsonNull()) && !jsonObj.get("bestTrialBackingCustomJob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bestTrialBackingCustomJob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bestTrialBackingCustomJob").toString()));
      }
      if ((jsonObj.get("backingHyperparameterTuningJob") != null && !jsonObj.get("backingHyperparameterTuningJob").isJsonNull()) && !jsonObj.get("backingHyperparameterTuningJob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backingHyperparameterTuningJob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backingHyperparameterTuningJob").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata
   */
  public static GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
