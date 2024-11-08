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
import org.openapitools.client.model.GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfigMigrateDataLabelingAnnotatedDatasetConfig;

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
 * Config for migrating Dataset in datalabeling.googleapis.com to Vertex AI&#39;s Dataset.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig {
  public static final String SERIALIZED_NAME_MIGRATE_DATA_LABELING_ANNOTATED_DATASET_CONFIGS = "migrateDataLabelingAnnotatedDatasetConfigs";
  @SerializedName(SERIALIZED_NAME_MIGRATE_DATA_LABELING_ANNOTATED_DATASET_CONFIGS)
  private List<GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfigMigrateDataLabelingAnnotatedDatasetConfig> migrateDataLabelingAnnotatedDatasetConfigs = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATASET = "dataset";
  @SerializedName(SERIALIZED_NAME_DATASET)
  private String dataset;

  public static final String SERIALIZED_NAME_DATASET_DISPLAY_NAME = "datasetDisplayName";
  @SerializedName(SERIALIZED_NAME_DATASET_DISPLAY_NAME)
  private String datasetDisplayName;

  public GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig() {
  }

  public GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig migrateDataLabelingAnnotatedDatasetConfigs(List<GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfigMigrateDataLabelingAnnotatedDatasetConfig> migrateDataLabelingAnnotatedDatasetConfigs) {
    this.migrateDataLabelingAnnotatedDatasetConfigs = migrateDataLabelingAnnotatedDatasetConfigs;
    return this;
  }

  public GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig addMigrateDataLabelingAnnotatedDatasetConfigsItem(GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfigMigrateDataLabelingAnnotatedDatasetConfig migrateDataLabelingAnnotatedDatasetConfigsItem) {
    if (this.migrateDataLabelingAnnotatedDatasetConfigs == null) {
      this.migrateDataLabelingAnnotatedDatasetConfigs = new ArrayList<>();
    }
    this.migrateDataLabelingAnnotatedDatasetConfigs.add(migrateDataLabelingAnnotatedDatasetConfigsItem);
    return this;
  }

  /**
   * Optional. Configs for migrating AnnotatedDataset in datalabeling.googleapis.com to Vertex AI&#39;s SavedQuery. The specified AnnotatedDatasets have to belong to the datalabeling Dataset.
   * @return migrateDataLabelingAnnotatedDatasetConfigs
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfigMigrateDataLabelingAnnotatedDatasetConfig> getMigrateDataLabelingAnnotatedDatasetConfigs() {
    return migrateDataLabelingAnnotatedDatasetConfigs;
  }

  public void setMigrateDataLabelingAnnotatedDatasetConfigs(List<GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfigMigrateDataLabelingAnnotatedDatasetConfig> migrateDataLabelingAnnotatedDatasetConfigs) {
    this.migrateDataLabelingAnnotatedDatasetConfigs = migrateDataLabelingAnnotatedDatasetConfigs;
  }


  public GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * Required. Full resource name of data labeling Dataset. Format: &#x60;projects/{project}/datasets/{dataset}&#x60;.
   * @return dataset
   */
  @javax.annotation.Nullable
  public String getDataset() {
    return dataset;
  }

  public void setDataset(String dataset) {
    this.dataset = dataset;
  }


  public GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig datasetDisplayName(String datasetDisplayName) {
    this.datasetDisplayName = datasetDisplayName;
    return this;
  }

  /**
   * Optional. Display name of the Dataset in Vertex AI. System will pick a display name if unspecified.
   * @return datasetDisplayName
   */
  @javax.annotation.Nullable
  public String getDatasetDisplayName() {
    return datasetDisplayName;
  }

  public void setDatasetDisplayName(String datasetDisplayName) {
    this.datasetDisplayName = datasetDisplayName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig googleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig = (GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig) o;
    return Objects.equals(this.migrateDataLabelingAnnotatedDatasetConfigs, googleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig.migrateDataLabelingAnnotatedDatasetConfigs) &&
        Objects.equals(this.dataset, googleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig.dataset) &&
        Objects.equals(this.datasetDisplayName, googleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig.datasetDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migrateDataLabelingAnnotatedDatasetConfigs, dataset, datasetDisplayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig {\n");
    sb.append("    migrateDataLabelingAnnotatedDatasetConfigs: ").append(toIndentedString(migrateDataLabelingAnnotatedDatasetConfigs)).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    datasetDisplayName: ").append(toIndentedString(datasetDisplayName)).append("\n");
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
    openapiFields.add("migrateDataLabelingAnnotatedDatasetConfigs");
    openapiFields.add("dataset");
    openapiFields.add("datasetDisplayName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig is not found in the empty JSON string", GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("migrateDataLabelingAnnotatedDatasetConfigs") != null && !jsonObj.get("migrateDataLabelingAnnotatedDatasetConfigs").isJsonNull()) {
        JsonArray jsonArraymigrateDataLabelingAnnotatedDatasetConfigs = jsonObj.getAsJsonArray("migrateDataLabelingAnnotatedDatasetConfigs");
        if (jsonArraymigrateDataLabelingAnnotatedDatasetConfigs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("migrateDataLabelingAnnotatedDatasetConfigs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `migrateDataLabelingAnnotatedDatasetConfigs` to be an array in the JSON string but got `%s`", jsonObj.get("migrateDataLabelingAnnotatedDatasetConfigs").toString()));
          }

          // validate the optional field `migrateDataLabelingAnnotatedDatasetConfigs` (array)
          for (int i = 0; i < jsonArraymigrateDataLabelingAnnotatedDatasetConfigs.size(); i++) {
            GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfigMigrateDataLabelingAnnotatedDatasetConfig.validateJsonElement(jsonArraymigrateDataLabelingAnnotatedDatasetConfigs.get(i));
          };
        }
      }
      if ((jsonObj.get("dataset") != null && !jsonObj.get("dataset").isJsonNull()) && !jsonObj.get("dataset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataset").toString()));
      }
      if ((jsonObj.get("datasetDisplayName") != null && !jsonObj.get("datasetDisplayName").isJsonNull()) && !jsonObj.get("datasetDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetDisplayName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig
   */
  public static GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1MigrateResourceRequestMigrateDataLabelingDatasetConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

