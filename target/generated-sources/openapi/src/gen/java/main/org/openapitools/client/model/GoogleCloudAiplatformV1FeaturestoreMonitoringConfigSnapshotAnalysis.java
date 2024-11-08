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
 * Configuration of the Featurestore&#39;s Snapshot Analysis Based Monitoring. This type of analysis generates statistics for each Feature based on a snapshot of the latest feature value of each entities every monitoring_interval.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis {
  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_MONITORING_INTERVAL_DAYS = "monitoringIntervalDays";
  @SerializedName(SERIALIZED_NAME_MONITORING_INTERVAL_DAYS)
  private Integer monitoringIntervalDays;

  public static final String SERIALIZED_NAME_STALENESS_DAYS = "stalenessDays";
  @SerializedName(SERIALIZED_NAME_STALENESS_DAYS)
  private Integer stalenessDays;

  public GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis() {
  }

  public GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * The monitoring schedule for snapshot analysis. For EntityType-level config: unset / disabled &#x3D; true indicates disabled by default for Features under it; otherwise by default enable snapshot analysis monitoring with monitoring_interval for Features under it. Feature-level config: disabled &#x3D; true indicates disabled regardless of the EntityType-level config; unset monitoring_interval indicates going with EntityType-level config; otherwise run snapshot analysis monitoring with monitoring_interval regardless of the EntityType-level config. Explicitly Disable the snapshot analysis based monitoring.
   * @return disabled
   */
  @javax.annotation.Nullable
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis monitoringIntervalDays(Integer monitoringIntervalDays) {
    this.monitoringIntervalDays = monitoringIntervalDays;
    return this;
  }

  /**
   * Configuration of the snapshot analysis based monitoring pipeline running interval. The value indicates number of days.
   * @return monitoringIntervalDays
   */
  @javax.annotation.Nullable
  public Integer getMonitoringIntervalDays() {
    return monitoringIntervalDays;
  }

  public void setMonitoringIntervalDays(Integer monitoringIntervalDays) {
    this.monitoringIntervalDays = monitoringIntervalDays;
  }


  public GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis stalenessDays(Integer stalenessDays) {
    this.stalenessDays = stalenessDays;
    return this;
  }

  /**
   * Customized export features time window for snapshot analysis. Unit is one day. Default value is 3 weeks. Minimum value is 1 day. Maximum value is 4000 days.
   * @return stalenessDays
   */
  @javax.annotation.Nullable
  public Integer getStalenessDays() {
    return stalenessDays;
  }

  public void setStalenessDays(Integer stalenessDays) {
    this.stalenessDays = stalenessDays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis googleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis = (GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis) o;
    return Objects.equals(this.disabled, googleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis.disabled) &&
        Objects.equals(this.monitoringIntervalDays, googleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis.monitoringIntervalDays) &&
        Objects.equals(this.stalenessDays, googleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis.stalenessDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, monitoringIntervalDays, stalenessDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    monitoringIntervalDays: ").append(toIndentedString(monitoringIntervalDays)).append("\n");
    sb.append("    stalenessDays: ").append(toIndentedString(stalenessDays)).append("\n");
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
    openapiFields.add("disabled");
    openapiFields.add("monitoringIntervalDays");
    openapiFields.add("stalenessDays");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis is not found in the empty JSON string", GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis
   */
  public static GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

