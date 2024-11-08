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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.GoogleCloudAiplatformV1StudySpec;

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
 * A wrapper class which contains the tunable parameters in an AutoML Image training job.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter {
  public static final String SERIALIZED_NAME_TRAINER_CONFIG = "trainerConfig";
  @SerializedName(SERIALIZED_NAME_TRAINER_CONFIG)
  private Map<String, String> trainerConfig = new HashMap<>();

  public static final String SERIALIZED_NAME_STUDY_SPEC = "studySpec";
  @SerializedName(SERIALIZED_NAME_STUDY_SPEC)
  private GoogleCloudAiplatformV1StudySpec studySpec;

  public static final String SERIALIZED_NAME_CHECKPOINT_NAME = "checkpointName";
  @SerializedName(SERIALIZED_NAME_CHECKPOINT_NAME)
  private String checkpointName;

  /**
   * Gets or Sets trainerType
   */
  @JsonAdapter(TrainerTypeEnum.Adapter.class)
  public enum TrainerTypeEnum {
    TRAINER_TYPE_UNSPECIFIED("TRAINER_TYPE_UNSPECIFIED"),
    
    AUTOML_TRAINER("AUTOML_TRAINER"),
    
    MODEL_GARDEN_TRAINER("MODEL_GARDEN_TRAINER");

    private String value;

    TrainerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TrainerTypeEnum fromValue(String value) {
      for (TrainerTypeEnum b : TrainerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TrainerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TrainerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TrainerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TrainerTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TrainerTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TRAINER_TYPE = "trainerType";
  @SerializedName(SERIALIZED_NAME_TRAINER_TYPE)
  private TrainerTypeEnum trainerType;

  public static final String SERIALIZED_NAME_DATASET_CONFIG = "datasetConfig";
  @SerializedName(SERIALIZED_NAME_DATASET_CONFIG)
  private Map<String, String> datasetConfig = new HashMap<>();

  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter() {
  }

  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter trainerConfig(Map<String, String> trainerConfig) {
    this.trainerConfig = trainerConfig;
    return this;
  }

  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter putTrainerConfigItem(String key, String trainerConfigItem) {
    if (this.trainerConfig == null) {
      this.trainerConfig = new HashMap<>();
    }
    this.trainerConfig.put(key, trainerConfigItem);
    return this;
  }

  /**
   * Customizable trainer settings, used in the &#x60;model_garden_trainer&#x60;.
   * @return trainerConfig
   */
  @javax.annotation.Nullable
  public Map<String, String> getTrainerConfig() {
    return trainerConfig;
  }

  public void setTrainerConfig(Map<String, String> trainerConfig) {
    this.trainerConfig = trainerConfig;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter studySpec(GoogleCloudAiplatformV1StudySpec studySpec) {
    this.studySpec = studySpec;
    return this;
  }

  /**
   * Optioinal. StudySpec of hyperparameter tuning job. Required for &#x60;model_garden_trainer&#x60;.
   * @return studySpec
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1StudySpec getStudySpec() {
    return studySpec;
  }

  public void setStudySpec(GoogleCloudAiplatformV1StudySpec studySpec) {
    this.studySpec = studySpec;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter checkpointName(String checkpointName) {
    this.checkpointName = checkpointName;
    return this;
  }

  /**
   * Optional. An unique name of pretrained model checkpoint provided in model garden, it will be mapped to a GCS location internally.
   * @return checkpointName
   */
  @javax.annotation.Nullable
  public String getCheckpointName() {
    return checkpointName;
  }

  public void setCheckpointName(String checkpointName) {
    this.checkpointName = checkpointName;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter trainerType(TrainerTypeEnum trainerType) {
    this.trainerType = trainerType;
    return this;
  }

  /**
   * Get trainerType
   * @return trainerType
   */
  @javax.annotation.Nullable
  public TrainerTypeEnum getTrainerType() {
    return trainerType;
  }

  public void setTrainerType(TrainerTypeEnum trainerType) {
    this.trainerType = trainerType;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter datasetConfig(Map<String, String> datasetConfig) {
    this.datasetConfig = datasetConfig;
    return this;
  }

  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter putDatasetConfigItem(String key, String datasetConfigItem) {
    if (this.datasetConfig == null) {
      this.datasetConfig = new HashMap<>();
    }
    this.datasetConfig.put(key, datasetConfigItem);
    return this;
  }

  /**
   * Customizable dataset settings, used in the &#x60;model_garden_trainer&#x60;.
   * @return datasetConfig
   */
  @javax.annotation.Nullable
  public Map<String, String> getDatasetConfig() {
    return datasetConfig;
  }

  public void setDatasetConfig(Map<String, String> datasetConfig) {
    this.datasetConfig = datasetConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter googleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter = (GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter) o;
    return Objects.equals(this.trainerConfig, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter.trainerConfig) &&
        Objects.equals(this.studySpec, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter.studySpec) &&
        Objects.equals(this.checkpointName, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter.checkpointName) &&
        Objects.equals(this.trainerType, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter.trainerType) &&
        Objects.equals(this.datasetConfig, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter.datasetConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainerConfig, studySpec, checkpointName, trainerType, datasetConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter {\n");
    sb.append("    trainerConfig: ").append(toIndentedString(trainerConfig)).append("\n");
    sb.append("    studySpec: ").append(toIndentedString(studySpec)).append("\n");
    sb.append("    checkpointName: ").append(toIndentedString(checkpointName)).append("\n");
    sb.append("    trainerType: ").append(toIndentedString(trainerType)).append("\n");
    sb.append("    datasetConfig: ").append(toIndentedString(datasetConfig)).append("\n");
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
    openapiFields.add("trainerConfig");
    openapiFields.add("studySpec");
    openapiFields.add("checkpointName");
    openapiFields.add("trainerType");
    openapiFields.add("datasetConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `studySpec`
      if (jsonObj.get("studySpec") != null && !jsonObj.get("studySpec").isJsonNull()) {
        GoogleCloudAiplatformV1StudySpec.validateJsonElement(jsonObj.get("studySpec"));
      }
      if ((jsonObj.get("checkpointName") != null && !jsonObj.get("checkpointName").isJsonNull()) && !jsonObj.get("checkpointName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkpointName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkpointName").toString()));
      }
      if ((jsonObj.get("trainerType") != null && !jsonObj.get("trainerType").isJsonNull()) && !jsonObj.get("trainerType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trainerType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trainerType").toString()));
      }
      // validate the optional field `trainerType`
      if (jsonObj.get("trainerType") != null && !jsonObj.get("trainerType").isJsonNull()) {
        TrainerTypeEnum.validateJsonElement(jsonObj.get("trainerType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter
   */
  public static GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutomlImageTrainingTunableParameter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

