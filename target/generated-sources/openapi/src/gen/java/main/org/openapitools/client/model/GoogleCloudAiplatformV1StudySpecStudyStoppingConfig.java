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
import org.openapitools.client.model.GoogleCloudAiplatformV1StudyTimeConstraint;

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
 * The configuration (stopping conditions) for automated stopping of a Study. Conditions include trial budgets, time budgets, and convergence detection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1StudySpecStudyStoppingConfig {
  public static final String SERIALIZED_NAME_MAX_NUM_TRIALS = "maxNumTrials";
  @SerializedName(SERIALIZED_NAME_MAX_NUM_TRIALS)
  private Integer maxNumTrials;

  public static final String SERIALIZED_NAME_MAX_NUM_TRIALS_NO_PROGRESS = "maxNumTrialsNoProgress";
  @SerializedName(SERIALIZED_NAME_MAX_NUM_TRIALS_NO_PROGRESS)
  private Integer maxNumTrialsNoProgress;

  public static final String SERIALIZED_NAME_SHOULD_STOP_ASAP = "shouldStopAsap";
  @SerializedName(SERIALIZED_NAME_SHOULD_STOP_ASAP)
  private Boolean shouldStopAsap;

  public static final String SERIALIZED_NAME_MAXIMUM_RUNTIME_CONSTRAINT = "maximumRuntimeConstraint";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_RUNTIME_CONSTRAINT)
  private GoogleCloudAiplatformV1StudyTimeConstraint maximumRuntimeConstraint;

  public static final String SERIALIZED_NAME_MINIMUM_RUNTIME_CONSTRAINT = "minimumRuntimeConstraint";
  @SerializedName(SERIALIZED_NAME_MINIMUM_RUNTIME_CONSTRAINT)
  private GoogleCloudAiplatformV1StudyTimeConstraint minimumRuntimeConstraint;

  public static final String SERIALIZED_NAME_MIN_NUM_TRIALS = "minNumTrials";
  @SerializedName(SERIALIZED_NAME_MIN_NUM_TRIALS)
  private Integer minNumTrials;

  public static final String SERIALIZED_NAME_MAX_DURATION_NO_PROGRESS = "maxDurationNoProgress";
  @SerializedName(SERIALIZED_NAME_MAX_DURATION_NO_PROGRESS)
  private String maxDurationNoProgress;

  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig() {
  }

  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig maxNumTrials(Integer maxNumTrials) {
    this.maxNumTrials = maxNumTrials;
    return this;
  }

  /**
   * If there are more than this many trials, stop the study.
   * @return maxNumTrials
   */
  @javax.annotation.Nullable
  public Integer getMaxNumTrials() {
    return maxNumTrials;
  }

  public void setMaxNumTrials(Integer maxNumTrials) {
    this.maxNumTrials = maxNumTrials;
  }


  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig maxNumTrialsNoProgress(Integer maxNumTrialsNoProgress) {
    this.maxNumTrialsNoProgress = maxNumTrialsNoProgress;
    return this;
  }

  /**
   * If the objective value has not improved for this many consecutive trials, stop the study. WARNING: Effective only for single-objective studies.
   * @return maxNumTrialsNoProgress
   */
  @javax.annotation.Nullable
  public Integer getMaxNumTrialsNoProgress() {
    return maxNumTrialsNoProgress;
  }

  public void setMaxNumTrialsNoProgress(Integer maxNumTrialsNoProgress) {
    this.maxNumTrialsNoProgress = maxNumTrialsNoProgress;
  }


  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig shouldStopAsap(Boolean shouldStopAsap) {
    this.shouldStopAsap = shouldStopAsap;
    return this;
  }

  /**
   * If true, a Study enters STOPPING_ASAP whenever it would normally enters STOPPING state. The bottom line is: set to true if you want to interrupt on-going evaluations of Trials as soon as the study stopping condition is met. (Please see Study.State documentation for the source of truth).
   * @return shouldStopAsap
   */
  @javax.annotation.Nullable
  public Boolean getShouldStopAsap() {
    return shouldStopAsap;
  }

  public void setShouldStopAsap(Boolean shouldStopAsap) {
    this.shouldStopAsap = shouldStopAsap;
  }


  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig maximumRuntimeConstraint(GoogleCloudAiplatformV1StudyTimeConstraint maximumRuntimeConstraint) {
    this.maximumRuntimeConstraint = maximumRuntimeConstraint;
    return this;
  }

  /**
   * If the specified time or duration has passed, stop the study.
   * @return maximumRuntimeConstraint
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1StudyTimeConstraint getMaximumRuntimeConstraint() {
    return maximumRuntimeConstraint;
  }

  public void setMaximumRuntimeConstraint(GoogleCloudAiplatformV1StudyTimeConstraint maximumRuntimeConstraint) {
    this.maximumRuntimeConstraint = maximumRuntimeConstraint;
  }


  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig minimumRuntimeConstraint(GoogleCloudAiplatformV1StudyTimeConstraint minimumRuntimeConstraint) {
    this.minimumRuntimeConstraint = minimumRuntimeConstraint;
    return this;
  }

  /**
   * Each \&quot;stopping rule\&quot; in this proto specifies an \&quot;if\&quot; condition. Before Vizier would generate a new suggestion, it first checks each specified stopping rule, from top to bottom in this list. Note that the first few rules (e.g. minimum_runtime_constraint, min_num_trials) will prevent other stopping rules from being evaluated until they are met. For example, setting &#x60;min_num_trials&#x3D;5&#x60; and &#x60;always_stop_after&#x3D; 1 hour&#x60; means that the Study will ONLY stop after it has 5 COMPLETED trials, even if more than an hour has passed since its creation. It follows the first applicable rule (whose \&quot;if\&quot; condition is satisfied) to make a stopping decision. If none of the specified rules are applicable, then Vizier decides that the study should not stop. If Vizier decides that the study should stop, the study enters STOPPING state (or STOPPING_ASAP if should_stop_asap &#x3D; true). IMPORTANT: The automatic study state transition happens precisely as described above; that is, deleting trials or updating StudyConfig NEVER automatically moves the study state back to ACTIVE. If you want to _resume_ a Study that was stopped, 1) change the stopping conditions if necessary, 2) activate the study, and then 3) ask for suggestions. If the specified time or duration has not passed, do not stop the study.
   * @return minimumRuntimeConstraint
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1StudyTimeConstraint getMinimumRuntimeConstraint() {
    return minimumRuntimeConstraint;
  }

  public void setMinimumRuntimeConstraint(GoogleCloudAiplatformV1StudyTimeConstraint minimumRuntimeConstraint) {
    this.minimumRuntimeConstraint = minimumRuntimeConstraint;
  }


  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig minNumTrials(Integer minNumTrials) {
    this.minNumTrials = minNumTrials;
    return this;
  }

  /**
   * If there are fewer than this many COMPLETED trials, do not stop the study.
   * @return minNumTrials
   */
  @javax.annotation.Nullable
  public Integer getMinNumTrials() {
    return minNumTrials;
  }

  public void setMinNumTrials(Integer minNumTrials) {
    this.minNumTrials = minNumTrials;
  }


  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig maxDurationNoProgress(String maxDurationNoProgress) {
    this.maxDurationNoProgress = maxDurationNoProgress;
    return this;
  }

  /**
   * If the objective value has not improved for this much time, stop the study. WARNING: Effective only for single-objective studies.
   * @return maxDurationNoProgress
   */
  @javax.annotation.Nullable
  public String getMaxDurationNoProgress() {
    return maxDurationNoProgress;
  }

  public void setMaxDurationNoProgress(String maxDurationNoProgress) {
    this.maxDurationNoProgress = maxDurationNoProgress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1StudySpecStudyStoppingConfig googleCloudAiplatformV1StudySpecStudyStoppingConfig = (GoogleCloudAiplatformV1StudySpecStudyStoppingConfig) o;
    return Objects.equals(this.maxNumTrials, googleCloudAiplatformV1StudySpecStudyStoppingConfig.maxNumTrials) &&
        Objects.equals(this.maxNumTrialsNoProgress, googleCloudAiplatformV1StudySpecStudyStoppingConfig.maxNumTrialsNoProgress) &&
        Objects.equals(this.shouldStopAsap, googleCloudAiplatformV1StudySpecStudyStoppingConfig.shouldStopAsap) &&
        Objects.equals(this.maximumRuntimeConstraint, googleCloudAiplatformV1StudySpecStudyStoppingConfig.maximumRuntimeConstraint) &&
        Objects.equals(this.minimumRuntimeConstraint, googleCloudAiplatformV1StudySpecStudyStoppingConfig.minimumRuntimeConstraint) &&
        Objects.equals(this.minNumTrials, googleCloudAiplatformV1StudySpecStudyStoppingConfig.minNumTrials) &&
        Objects.equals(this.maxDurationNoProgress, googleCloudAiplatformV1StudySpecStudyStoppingConfig.maxDurationNoProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxNumTrials, maxNumTrialsNoProgress, shouldStopAsap, maximumRuntimeConstraint, minimumRuntimeConstraint, minNumTrials, maxDurationNoProgress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1StudySpecStudyStoppingConfig {\n");
    sb.append("    maxNumTrials: ").append(toIndentedString(maxNumTrials)).append("\n");
    sb.append("    maxNumTrialsNoProgress: ").append(toIndentedString(maxNumTrialsNoProgress)).append("\n");
    sb.append("    shouldStopAsap: ").append(toIndentedString(shouldStopAsap)).append("\n");
    sb.append("    maximumRuntimeConstraint: ").append(toIndentedString(maximumRuntimeConstraint)).append("\n");
    sb.append("    minimumRuntimeConstraint: ").append(toIndentedString(minimumRuntimeConstraint)).append("\n");
    sb.append("    minNumTrials: ").append(toIndentedString(minNumTrials)).append("\n");
    sb.append("    maxDurationNoProgress: ").append(toIndentedString(maxDurationNoProgress)).append("\n");
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
    openapiFields.add("maxNumTrials");
    openapiFields.add("maxNumTrialsNoProgress");
    openapiFields.add("shouldStopAsap");
    openapiFields.add("maximumRuntimeConstraint");
    openapiFields.add("minimumRuntimeConstraint");
    openapiFields.add("minNumTrials");
    openapiFields.add("maxDurationNoProgress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1StudySpecStudyStoppingConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1StudySpecStudyStoppingConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1StudySpecStudyStoppingConfig is not found in the empty JSON string", GoogleCloudAiplatformV1StudySpecStudyStoppingConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1StudySpecStudyStoppingConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1StudySpecStudyStoppingConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `maximumRuntimeConstraint`
      if (jsonObj.get("maximumRuntimeConstraint") != null && !jsonObj.get("maximumRuntimeConstraint").isJsonNull()) {
        GoogleCloudAiplatformV1StudyTimeConstraint.validateJsonElement(jsonObj.get("maximumRuntimeConstraint"));
      }
      // validate the optional field `minimumRuntimeConstraint`
      if (jsonObj.get("minimumRuntimeConstraint") != null && !jsonObj.get("minimumRuntimeConstraint").isJsonNull()) {
        GoogleCloudAiplatformV1StudyTimeConstraint.validateJsonElement(jsonObj.get("minimumRuntimeConstraint"));
      }
      if ((jsonObj.get("maxDurationNoProgress") != null && !jsonObj.get("maxDurationNoProgress").isJsonNull()) && !jsonObj.get("maxDurationNoProgress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxDurationNoProgress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxDurationNoProgress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1StudySpecStudyStoppingConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1StudySpecStudyStoppingConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1StudySpecStudyStoppingConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1StudySpecStudyStoppingConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1StudySpecStudyStoppingConfig>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1StudySpecStudyStoppingConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1StudySpecStudyStoppingConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1StudySpecStudyStoppingConfig
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1StudySpecStudyStoppingConfig
   */
  public static GoogleCloudAiplatformV1StudySpecStudyStoppingConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1StudySpecStudyStoppingConfig.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1StudySpecStudyStoppingConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
