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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.GoogleCloudAiplatformV1ModelMonitoringStatsAnomaliesFeatureHistoricStatsAnomalies;

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
 * Statistics and anomalies generated by Model Monitoring.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies {
  public static final String SERIALIZED_NAME_DEPLOYED_MODEL_ID = "deployedModelId";
  @SerializedName(SERIALIZED_NAME_DEPLOYED_MODEL_ID)
  private String deployedModelId;

  public static final String SERIALIZED_NAME_FEATURE_STATS = "featureStats";
  @SerializedName(SERIALIZED_NAME_FEATURE_STATS)
  private List<GoogleCloudAiplatformV1ModelMonitoringStatsAnomaliesFeatureHistoricStatsAnomalies> featureStats = new ArrayList<>();

  /**
   * Model Monitoring Objective those stats and anomalies belonging to.
   */
  @JsonAdapter(ObjectiveEnum.Adapter.class)
  public enum ObjectiveEnum {
    MODEL_DEPLOYMENT_MONITORING_OBJECTIVE_TYPE_UNSPECIFIED("MODEL_DEPLOYMENT_MONITORING_OBJECTIVE_TYPE_UNSPECIFIED"),
    
    RAW_FEATURE_SKEW("RAW_FEATURE_SKEW"),
    
    RAW_FEATURE_DRIFT("RAW_FEATURE_DRIFT"),
    
    FEATURE_ATTRIBUTION_SKEW("FEATURE_ATTRIBUTION_SKEW"),
    
    FEATURE_ATTRIBUTION_DRIFT("FEATURE_ATTRIBUTION_DRIFT");

    private String value;

    ObjectiveEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectiveEnum fromValue(String value) {
      for (ObjectiveEnum b : ObjectiveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectiveEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectiveEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectiveEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectiveEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ObjectiveEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OBJECTIVE = "objective";
  @SerializedName(SERIALIZED_NAME_OBJECTIVE)
  private ObjectiveEnum objective;

  public static final String SERIALIZED_NAME_ANOMALY_COUNT = "anomalyCount";
  @SerializedName(SERIALIZED_NAME_ANOMALY_COUNT)
  private Integer anomalyCount;

  public GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies() {
  }

  public GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies deployedModelId(String deployedModelId) {
    this.deployedModelId = deployedModelId;
    return this;
  }

  /**
   * Deployed Model ID.
   * @return deployedModelId
   */
  @javax.annotation.Nullable
  public String getDeployedModelId() {
    return deployedModelId;
  }

  public void setDeployedModelId(String deployedModelId) {
    this.deployedModelId = deployedModelId;
  }


  public GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies featureStats(List<GoogleCloudAiplatformV1ModelMonitoringStatsAnomaliesFeatureHistoricStatsAnomalies> featureStats) {
    this.featureStats = featureStats;
    return this;
  }

  public GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies addFeatureStatsItem(GoogleCloudAiplatformV1ModelMonitoringStatsAnomaliesFeatureHistoricStatsAnomalies featureStatsItem) {
    if (this.featureStats == null) {
      this.featureStats = new ArrayList<>();
    }
    this.featureStats.add(featureStatsItem);
    return this;
  }

  /**
   * A list of historical Stats and Anomalies generated for all Features.
   * @return featureStats
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1ModelMonitoringStatsAnomaliesFeatureHistoricStatsAnomalies> getFeatureStats() {
    return featureStats;
  }

  public void setFeatureStats(List<GoogleCloudAiplatformV1ModelMonitoringStatsAnomaliesFeatureHistoricStatsAnomalies> featureStats) {
    this.featureStats = featureStats;
  }


  public GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies objective(ObjectiveEnum objective) {
    this.objective = objective;
    return this;
  }

  /**
   * Model Monitoring Objective those stats and anomalies belonging to.
   * @return objective
   */
  @javax.annotation.Nullable
  public ObjectiveEnum getObjective() {
    return objective;
  }

  public void setObjective(ObjectiveEnum objective) {
    this.objective = objective;
  }


  public GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies anomalyCount(Integer anomalyCount) {
    this.anomalyCount = anomalyCount;
    return this;
  }

  /**
   * Number of anomalies within all stats.
   * @return anomalyCount
   */
  @javax.annotation.Nullable
  public Integer getAnomalyCount() {
    return anomalyCount;
  }

  public void setAnomalyCount(Integer anomalyCount) {
    this.anomalyCount = anomalyCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies googleCloudAiplatformV1ModelMonitoringStatsAnomalies = (GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies) o;
    return Objects.equals(this.deployedModelId, googleCloudAiplatformV1ModelMonitoringStatsAnomalies.deployedModelId) &&
        Objects.equals(this.featureStats, googleCloudAiplatformV1ModelMonitoringStatsAnomalies.featureStats) &&
        Objects.equals(this.objective, googleCloudAiplatformV1ModelMonitoringStatsAnomalies.objective) &&
        Objects.equals(this.anomalyCount, googleCloudAiplatformV1ModelMonitoringStatsAnomalies.anomalyCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployedModelId, featureStats, objective, anomalyCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies {\n");
    sb.append("    deployedModelId: ").append(toIndentedString(deployedModelId)).append("\n");
    sb.append("    featureStats: ").append(toIndentedString(featureStats)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    anomalyCount: ").append(toIndentedString(anomalyCount)).append("\n");
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
    openapiFields.add("deployedModelId");
    openapiFields.add("featureStats");
    openapiFields.add("objective");
    openapiFields.add("anomalyCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies is not found in the empty JSON string", GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("deployedModelId") != null && !jsonObj.get("deployedModelId").isJsonNull()) && !jsonObj.get("deployedModelId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deployedModelId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deployedModelId").toString()));
      }
      if (jsonObj.get("featureStats") != null && !jsonObj.get("featureStats").isJsonNull()) {
        JsonArray jsonArrayfeatureStats = jsonObj.getAsJsonArray("featureStats");
        if (jsonArrayfeatureStats != null) {
          // ensure the json data is an array
          if (!jsonObj.get("featureStats").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `featureStats` to be an array in the JSON string but got `%s`", jsonObj.get("featureStats").toString()));
          }

          // validate the optional field `featureStats` (array)
          for (int i = 0; i < jsonArrayfeatureStats.size(); i++) {
            GoogleCloudAiplatformV1ModelMonitoringStatsAnomaliesFeatureHistoricStatsAnomalies.validateJsonElement(jsonArrayfeatureStats.get(i));
          };
        }
      }
      if ((jsonObj.get("objective") != null && !jsonObj.get("objective").isJsonNull()) && !jsonObj.get("objective").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objective` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objective").toString()));
      }
      // validate the optional field `objective`
      if (jsonObj.get("objective") != null && !jsonObj.get("objective").isJsonNull()) {
        ObjectiveEnum.validateJsonElement(jsonObj.get("objective"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies
   */
  public static GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ModelMonitoringStatsAnomalies to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
