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
import org.openapitools.client.model.GoogleCloudAiplatformV1AvroSource;
import org.openapitools.client.model.GoogleCloudAiplatformV1BigQuerySource;
import org.openapitools.client.model.GoogleCloudAiplatformV1CsvSource;
import org.openapitools.client.model.GoogleCloudAiplatformV1ImportFeatureValuesRequestFeatureSpec;

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
 * Request message for FeaturestoreService.ImportFeatureValues.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ImportFeatureValuesRequest {
  public static final String SERIALIZED_NAME_FEATURE_SPECS = "featureSpecs";
  @SerializedName(SERIALIZED_NAME_FEATURE_SPECS)
  private List<GoogleCloudAiplatformV1ImportFeatureValuesRequestFeatureSpec> featureSpecs = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENTITY_ID_FIELD = "entityIdField";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID_FIELD)
  private String entityIdField;

  public static final String SERIALIZED_NAME_FEATURE_TIME = "featureTime";
  @SerializedName(SERIALIZED_NAME_FEATURE_TIME)
  private String featureTime;

  public static final String SERIALIZED_NAME_FEATURE_TIME_FIELD = "featureTimeField";
  @SerializedName(SERIALIZED_NAME_FEATURE_TIME_FIELD)
  private String featureTimeField;

  public static final String SERIALIZED_NAME_DISABLE_ONLINE_SERVING = "disableOnlineServing";
  @SerializedName(SERIALIZED_NAME_DISABLE_ONLINE_SERVING)
  private Boolean disableOnlineServing;

  public static final String SERIALIZED_NAME_WORKER_COUNT = "workerCount";
  @SerializedName(SERIALIZED_NAME_WORKER_COUNT)
  private Integer workerCount;

  public static final String SERIALIZED_NAME_CSV_SOURCE = "csvSource";
  @SerializedName(SERIALIZED_NAME_CSV_SOURCE)
  private GoogleCloudAiplatformV1CsvSource csvSource;

  public static final String SERIALIZED_NAME_DISABLE_INGESTION_ANALYSIS = "disableIngestionAnalysis";
  @SerializedName(SERIALIZED_NAME_DISABLE_INGESTION_ANALYSIS)
  private Boolean disableIngestionAnalysis;

  public static final String SERIALIZED_NAME_BIGQUERY_SOURCE = "bigquerySource";
  @SerializedName(SERIALIZED_NAME_BIGQUERY_SOURCE)
  private GoogleCloudAiplatformV1BigQuerySource bigquerySource;

  public static final String SERIALIZED_NAME_AVRO_SOURCE = "avroSource";
  @SerializedName(SERIALIZED_NAME_AVRO_SOURCE)
  private GoogleCloudAiplatformV1AvroSource avroSource;

  public GoogleCloudAiplatformV1ImportFeatureValuesRequest() {
  }

  public GoogleCloudAiplatformV1ImportFeatureValuesRequest featureSpecs(List<GoogleCloudAiplatformV1ImportFeatureValuesRequestFeatureSpec> featureSpecs) {
    this.featureSpecs = featureSpecs;
    return this;
  }

  public GoogleCloudAiplatformV1ImportFeatureValuesRequest addFeatureSpecsItem(GoogleCloudAiplatformV1ImportFeatureValuesRequestFeatureSpec featureSpecsItem) {
    if (this.featureSpecs == null) {
      this.featureSpecs = new ArrayList<>();
    }
    this.featureSpecs.add(featureSpecsItem);
    return this;
  }

  /**
   * Required. Specifications defining which Feature values to import from the entity. The request fails if no feature_specs are provided, and having multiple feature_specs for one Feature is not allowed.
   * @return featureSpecs
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1ImportFeatureValuesRequestFeatureSpec> getFeatureSpecs() {
    return featureSpecs;
  }

  public void setFeatureSpecs(List<GoogleCloudAiplatformV1ImportFeatureValuesRequestFeatureSpec> featureSpecs) {
    this.featureSpecs = featureSpecs;
  }


  public GoogleCloudAiplatformV1ImportFeatureValuesRequest entityIdField(String entityIdField) {
    this.entityIdField = entityIdField;
    return this;
  }

  /**
   * Source column that holds entity IDs. If not provided, entity IDs are extracted from the column named entity_id.
   * @return entityIdField
   */
  @javax.annotation.Nullable
  public String getEntityIdField() {
    return entityIdField;
  }

  public void setEntityIdField(String entityIdField) {
    this.entityIdField = entityIdField;
  }


  public GoogleCloudAiplatformV1ImportFeatureValuesRequest featureTime(String featureTime) {
    this.featureTime = featureTime;
    return this;
  }

  /**
   * Single Feature timestamp for all entities being imported. The timestamp must not have higher than millisecond precision.
   * @return featureTime
   */
  @javax.annotation.Nullable
  public String getFeatureTime() {
    return featureTime;
  }

  public void setFeatureTime(String featureTime) {
    this.featureTime = featureTime;
  }


  public GoogleCloudAiplatformV1ImportFeatureValuesRequest featureTimeField(String featureTimeField) {
    this.featureTimeField = featureTimeField;
    return this;
  }

  /**
   * Source column that holds the Feature timestamp for all Feature values in each entity.
   * @return featureTimeField
   */
  @javax.annotation.Nullable
  public String getFeatureTimeField() {
    return featureTimeField;
  }

  public void setFeatureTimeField(String featureTimeField) {
    this.featureTimeField = featureTimeField;
  }


  public GoogleCloudAiplatformV1ImportFeatureValuesRequest disableOnlineServing(Boolean disableOnlineServing) {
    this.disableOnlineServing = disableOnlineServing;
    return this;
  }

  /**
   * If set, data will not be imported for online serving. This is typically used for backfilling, where Feature generation timestamps are not in the timestamp range needed for online serving.
   * @return disableOnlineServing
   */
  @javax.annotation.Nullable
  public Boolean getDisableOnlineServing() {
    return disableOnlineServing;
  }

  public void setDisableOnlineServing(Boolean disableOnlineServing) {
    this.disableOnlineServing = disableOnlineServing;
  }


  public GoogleCloudAiplatformV1ImportFeatureValuesRequest workerCount(Integer workerCount) {
    this.workerCount = workerCount;
    return this;
  }

  /**
   * Specifies the number of workers that are used to write data to the Featurestore. Consider the online serving capacity that you require to achieve the desired import throughput without interfering with online serving. The value must be positive, and less than or equal to 100. If not set, defaults to using 1 worker. The low count ensures minimal impact on online serving performance.
   * @return workerCount
   */
  @javax.annotation.Nullable
  public Integer getWorkerCount() {
    return workerCount;
  }

  public void setWorkerCount(Integer workerCount) {
    this.workerCount = workerCount;
  }


  public GoogleCloudAiplatformV1ImportFeatureValuesRequest csvSource(GoogleCloudAiplatformV1CsvSource csvSource) {
    this.csvSource = csvSource;
    return this;
  }

  /**
   * Get csvSource
   * @return csvSource
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1CsvSource getCsvSource() {
    return csvSource;
  }

  public void setCsvSource(GoogleCloudAiplatformV1CsvSource csvSource) {
    this.csvSource = csvSource;
  }


  public GoogleCloudAiplatformV1ImportFeatureValuesRequest disableIngestionAnalysis(Boolean disableIngestionAnalysis) {
    this.disableIngestionAnalysis = disableIngestionAnalysis;
    return this;
  }

  /**
   * If true, API doesn&#39;t start ingestion analysis pipeline.
   * @return disableIngestionAnalysis
   */
  @javax.annotation.Nullable
  public Boolean getDisableIngestionAnalysis() {
    return disableIngestionAnalysis;
  }

  public void setDisableIngestionAnalysis(Boolean disableIngestionAnalysis) {
    this.disableIngestionAnalysis = disableIngestionAnalysis;
  }


  public GoogleCloudAiplatformV1ImportFeatureValuesRequest bigquerySource(GoogleCloudAiplatformV1BigQuerySource bigquerySource) {
    this.bigquerySource = bigquerySource;
    return this;
  }

  /**
   * Get bigquerySource
   * @return bigquerySource
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1BigQuerySource getBigquerySource() {
    return bigquerySource;
  }

  public void setBigquerySource(GoogleCloudAiplatformV1BigQuerySource bigquerySource) {
    this.bigquerySource = bigquerySource;
  }


  public GoogleCloudAiplatformV1ImportFeatureValuesRequest avroSource(GoogleCloudAiplatformV1AvroSource avroSource) {
    this.avroSource = avroSource;
    return this;
  }

  /**
   * Get avroSource
   * @return avroSource
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1AvroSource getAvroSource() {
    return avroSource;
  }

  public void setAvroSource(GoogleCloudAiplatformV1AvroSource avroSource) {
    this.avroSource = avroSource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ImportFeatureValuesRequest googleCloudAiplatformV1ImportFeatureValuesRequest = (GoogleCloudAiplatformV1ImportFeatureValuesRequest) o;
    return Objects.equals(this.featureSpecs, googleCloudAiplatformV1ImportFeatureValuesRequest.featureSpecs) &&
        Objects.equals(this.entityIdField, googleCloudAiplatformV1ImportFeatureValuesRequest.entityIdField) &&
        Objects.equals(this.featureTime, googleCloudAiplatformV1ImportFeatureValuesRequest.featureTime) &&
        Objects.equals(this.featureTimeField, googleCloudAiplatformV1ImportFeatureValuesRequest.featureTimeField) &&
        Objects.equals(this.disableOnlineServing, googleCloudAiplatformV1ImportFeatureValuesRequest.disableOnlineServing) &&
        Objects.equals(this.workerCount, googleCloudAiplatformV1ImportFeatureValuesRequest.workerCount) &&
        Objects.equals(this.csvSource, googleCloudAiplatformV1ImportFeatureValuesRequest.csvSource) &&
        Objects.equals(this.disableIngestionAnalysis, googleCloudAiplatformV1ImportFeatureValuesRequest.disableIngestionAnalysis) &&
        Objects.equals(this.bigquerySource, googleCloudAiplatformV1ImportFeatureValuesRequest.bigquerySource) &&
        Objects.equals(this.avroSource, googleCloudAiplatformV1ImportFeatureValuesRequest.avroSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureSpecs, entityIdField, featureTime, featureTimeField, disableOnlineServing, workerCount, csvSource, disableIngestionAnalysis, bigquerySource, avroSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ImportFeatureValuesRequest {\n");
    sb.append("    featureSpecs: ").append(toIndentedString(featureSpecs)).append("\n");
    sb.append("    entityIdField: ").append(toIndentedString(entityIdField)).append("\n");
    sb.append("    featureTime: ").append(toIndentedString(featureTime)).append("\n");
    sb.append("    featureTimeField: ").append(toIndentedString(featureTimeField)).append("\n");
    sb.append("    disableOnlineServing: ").append(toIndentedString(disableOnlineServing)).append("\n");
    sb.append("    workerCount: ").append(toIndentedString(workerCount)).append("\n");
    sb.append("    csvSource: ").append(toIndentedString(csvSource)).append("\n");
    sb.append("    disableIngestionAnalysis: ").append(toIndentedString(disableIngestionAnalysis)).append("\n");
    sb.append("    bigquerySource: ").append(toIndentedString(bigquerySource)).append("\n");
    sb.append("    avroSource: ").append(toIndentedString(avroSource)).append("\n");
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
    openapiFields.add("featureSpecs");
    openapiFields.add("entityIdField");
    openapiFields.add("featureTime");
    openapiFields.add("featureTimeField");
    openapiFields.add("disableOnlineServing");
    openapiFields.add("workerCount");
    openapiFields.add("csvSource");
    openapiFields.add("disableIngestionAnalysis");
    openapiFields.add("bigquerySource");
    openapiFields.add("avroSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ImportFeatureValuesRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ImportFeatureValuesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ImportFeatureValuesRequest is not found in the empty JSON string", GoogleCloudAiplatformV1ImportFeatureValuesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ImportFeatureValuesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ImportFeatureValuesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("featureSpecs") != null && !jsonObj.get("featureSpecs").isJsonNull()) {
        JsonArray jsonArrayfeatureSpecs = jsonObj.getAsJsonArray("featureSpecs");
        if (jsonArrayfeatureSpecs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("featureSpecs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `featureSpecs` to be an array in the JSON string but got `%s`", jsonObj.get("featureSpecs").toString()));
          }

          // validate the optional field `featureSpecs` (array)
          for (int i = 0; i < jsonArrayfeatureSpecs.size(); i++) {
            GoogleCloudAiplatformV1ImportFeatureValuesRequestFeatureSpec.validateJsonElement(jsonArrayfeatureSpecs.get(i));
          };
        }
      }
      if ((jsonObj.get("entityIdField") != null && !jsonObj.get("entityIdField").isJsonNull()) && !jsonObj.get("entityIdField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityIdField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityIdField").toString()));
      }
      if ((jsonObj.get("featureTime") != null && !jsonObj.get("featureTime").isJsonNull()) && !jsonObj.get("featureTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `featureTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("featureTime").toString()));
      }
      if ((jsonObj.get("featureTimeField") != null && !jsonObj.get("featureTimeField").isJsonNull()) && !jsonObj.get("featureTimeField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `featureTimeField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("featureTimeField").toString()));
      }
      // validate the optional field `csvSource`
      if (jsonObj.get("csvSource") != null && !jsonObj.get("csvSource").isJsonNull()) {
        GoogleCloudAiplatformV1CsvSource.validateJsonElement(jsonObj.get("csvSource"));
      }
      // validate the optional field `bigquerySource`
      if (jsonObj.get("bigquerySource") != null && !jsonObj.get("bigquerySource").isJsonNull()) {
        GoogleCloudAiplatformV1BigQuerySource.validateJsonElement(jsonObj.get("bigquerySource"));
      }
      // validate the optional field `avroSource`
      if (jsonObj.get("avroSource") != null && !jsonObj.get("avroSource").isJsonNull()) {
        GoogleCloudAiplatformV1AvroSource.validateJsonElement(jsonObj.get("avroSource"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ImportFeatureValuesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ImportFeatureValuesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ImportFeatureValuesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ImportFeatureValuesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ImportFeatureValuesRequest>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ImportFeatureValuesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ImportFeatureValuesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ImportFeatureValuesRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ImportFeatureValuesRequest
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ImportFeatureValuesRequest
   */
  public static GoogleCloudAiplatformV1ImportFeatureValuesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ImportFeatureValuesRequest.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ImportFeatureValuesRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

