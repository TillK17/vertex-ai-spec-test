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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.Any;
import org.openapitools.client.model.GoogleCloudAiplatformV1ActiveLearningConfig;
import org.openapitools.client.model.GoogleCloudAiplatformV1EncryptionSpec;
import org.openapitools.client.model.GoogleRpcStatus;
import org.openapitools.client.model.GoogleTypeMoney;

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
 * DataLabelingJob is used to trigger a human labeling job on unlabeled data from the following Dataset:
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1DataLabelingJob {
  public static final String SERIALIZED_NAME_DATASETS = "datasets";
  @SerializedName(SERIALIZED_NAME_DATASETS)
  private List<String> datasets = new ArrayList<>();

  public static final String SERIALIZED_NAME_LABELER_COUNT = "labelerCount";
  @SerializedName(SERIALIZED_NAME_LABELER_COUNT)
  private Integer labelerCount;

  public static final String SERIALIZED_NAME_INSTRUCTION_URI = "instructionUri";
  @SerializedName(SERIALIZED_NAME_INSTRUCTION_URI)
  private String instructionUri;

  public static final String SERIALIZED_NAME_ACTIVE_LEARNING_CONFIG = "activeLearningConfig";
  @SerializedName(SERIALIZED_NAME_ACTIVE_LEARNING_CONFIG)
  private GoogleCloudAiplatformV1ActiveLearningConfig activeLearningConfig;

  public static final String SERIALIZED_NAME_INPUTS_SCHEMA_URI = "inputsSchemaUri";
  @SerializedName(SERIALIZED_NAME_INPUTS_SCHEMA_URI)
  private String inputsSchemaUri;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  private Any inputs = null;

  public static final String SERIALIZED_NAME_ENCRYPTION_SPEC = "encryptionSpec";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_SPEC)
  private GoogleCloudAiplatformV1EncryptionSpec encryptionSpec;

  public static final String SERIALIZED_NAME_ANNOTATION_LABELS = "annotationLabels";
  @SerializedName(SERIALIZED_NAME_ANNOTATION_LABELS)
  private Map<String, String> annotationLabels = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CURRENT_SPEND = "currentSpend";
  @SerializedName(SERIALIZED_NAME_CURRENT_SPEND)
  private GoogleTypeMoney currentSpend;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  /**
   * Output only. The detailed state of the job.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    UNSPECIFIED("JOB_STATE_UNSPECIFIED"),
    
    QUEUED("JOB_STATE_QUEUED"),
    
    PENDING("JOB_STATE_PENDING"),
    
    RUNNING("JOB_STATE_RUNNING"),
    
    SUCCEEDED("JOB_STATE_SUCCEEDED"),
    
    FAILED("JOB_STATE_FAILED"),
    
    CANCELLING("JOB_STATE_CANCELLING"),
    
    CANCELLED("JOB_STATE_CANCELLED"),
    
    PAUSED("JOB_STATE_PAUSED"),
    
    EXPIRED("JOB_STATE_EXPIRED"),
    
    UPDATING("JOB_STATE_UPDATING"),
    
    PARTIALLY_SUCCEEDED("JOB_STATE_PARTIALLY_SUCCEEDED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_SPECIALIST_POOLS = "specialistPools";
  @SerializedName(SERIALIZED_NAME_SPECIALIST_POOLS)
  private List<String> specialistPools = new ArrayList<>();

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private GoogleRpcStatus error;

  public static final String SERIALIZED_NAME_LABELING_PROGRESS = "labelingProgress";
  @SerializedName(SERIALIZED_NAME_LABELING_PROGRESS)
  private Integer labelingProgress;

  public GoogleCloudAiplatformV1DataLabelingJob() {
  }

  public GoogleCloudAiplatformV1DataLabelingJob(
     String name, 
     GoogleTypeMoney currentSpend, 
     String updateTime, 
     StateEnum state, 
     String createTime, 
     GoogleRpcStatus error, 
     Integer labelingProgress
  ) {
    this();
    this.name = name;
    this.currentSpend = currentSpend;
    this.updateTime = updateTime;
    this.state = state;
    this.createTime = createTime;
    this.error = error;
    this.labelingProgress = labelingProgress;
  }

  public GoogleCloudAiplatformV1DataLabelingJob datasets(List<String> datasets) {
    this.datasets = datasets;
    return this;
  }

  public GoogleCloudAiplatformV1DataLabelingJob addDatasetsItem(String datasetsItem) {
    if (this.datasets == null) {
      this.datasets = new ArrayList<>();
    }
    this.datasets.add(datasetsItem);
    return this;
  }

  /**
   * Required. Dataset resource names. Right now we only support labeling from a single Dataset. Format: &#x60;projects/{project}/locations/{location}/datasets/{dataset}&#x60;
   * @return datasets
   */
  @javax.annotation.Nullable
  public List<String> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<String> datasets) {
    this.datasets = datasets;
  }


  public GoogleCloudAiplatformV1DataLabelingJob labelerCount(Integer labelerCount) {
    this.labelerCount = labelerCount;
    return this;
  }

  /**
   * Required. Number of labelers to work on each DataItem.
   * @return labelerCount
   */
  @javax.annotation.Nullable
  public Integer getLabelerCount() {
    return labelerCount;
  }

  public void setLabelerCount(Integer labelerCount) {
    this.labelerCount = labelerCount;
  }


  public GoogleCloudAiplatformV1DataLabelingJob instructionUri(String instructionUri) {
    this.instructionUri = instructionUri;
    return this;
  }

  /**
   * Required. The Google Cloud Storage location of the instruction pdf. This pdf is shared with labelers, and provides detailed description on how to label DataItems in Datasets.
   * @return instructionUri
   */
  @javax.annotation.Nullable
  public String getInstructionUri() {
    return instructionUri;
  }

  public void setInstructionUri(String instructionUri) {
    this.instructionUri = instructionUri;
  }


  public GoogleCloudAiplatformV1DataLabelingJob activeLearningConfig(GoogleCloudAiplatformV1ActiveLearningConfig activeLearningConfig) {
    this.activeLearningConfig = activeLearningConfig;
    return this;
  }

  /**
   * Parameters that configure the active learning pipeline. Active learning will label the data incrementally via several iterations. For every iteration, it will select a batch of data based on the sampling strategy.
   * @return activeLearningConfig
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ActiveLearningConfig getActiveLearningConfig() {
    return activeLearningConfig;
  }

  public void setActiveLearningConfig(GoogleCloudAiplatformV1ActiveLearningConfig activeLearningConfig) {
    this.activeLearningConfig = activeLearningConfig;
  }


  public GoogleCloudAiplatformV1DataLabelingJob inputsSchemaUri(String inputsSchemaUri) {
    this.inputsSchemaUri = inputsSchemaUri;
    return this;
  }

  /**
   * Required. Points to a YAML file stored on Google Cloud Storage describing the config for a specific type of DataLabelingJob. The schema files that can be used here are found in the https://storage.googleapis.com/google-cloud-aiplatform bucket in the /schema/datalabelingjob/inputs/ folder.
   * @return inputsSchemaUri
   */
  @javax.annotation.Nullable
  public String getInputsSchemaUri() {
    return inputsSchemaUri;
  }

  public void setInputsSchemaUri(String inputsSchemaUri) {
    this.inputsSchemaUri = inputsSchemaUri;
  }


  public GoogleCloudAiplatformV1DataLabelingJob inputs(Any inputs) {
    this.inputs = inputs;
    return this;
  }

  /**
   * Required. Input config parameters for the DataLabelingJob.
   * @return inputs
   */
  @javax.annotation.Nullable
  public Any getInputs() {
    return inputs;
  }

  public void setInputs(Any inputs) {
    this.inputs = inputs;
  }


  public GoogleCloudAiplatformV1DataLabelingJob encryptionSpec(GoogleCloudAiplatformV1EncryptionSpec encryptionSpec) {
    this.encryptionSpec = encryptionSpec;
    return this;
  }

  /**
   * Customer-managed encryption key spec for a DataLabelingJob. If set, this DataLabelingJob will be secured by this key. Note: Annotations created in the DataLabelingJob are associated with the EncryptionSpec of the Dataset they are exported to.
   * @return encryptionSpec
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1EncryptionSpec getEncryptionSpec() {
    return encryptionSpec;
  }

  public void setEncryptionSpec(GoogleCloudAiplatformV1EncryptionSpec encryptionSpec) {
    this.encryptionSpec = encryptionSpec;
  }


  public GoogleCloudAiplatformV1DataLabelingJob annotationLabels(Map<String, String> annotationLabels) {
    this.annotationLabels = annotationLabels;
    return this;
  }

  public GoogleCloudAiplatformV1DataLabelingJob putAnnotationLabelsItem(String key, String annotationLabelsItem) {
    if (this.annotationLabels == null) {
      this.annotationLabels = new HashMap<>();
    }
    this.annotationLabels.put(key, annotationLabelsItem);
    return this;
  }

  /**
   * Labels to assign to annotations generated by this DataLabelingJob. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with \&quot;aiplatform.googleapis.com/\&quot; and are immutable.
   * @return annotationLabels
   */
  @javax.annotation.Nullable
  public Map<String, String> getAnnotationLabels() {
    return annotationLabels;
  }

  public void setAnnotationLabels(Map<String, String> annotationLabels) {
    this.annotationLabels = annotationLabels;
  }


  /**
   * Output only. Resource name of the DataLabelingJob.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }



  /**
   * Output only. Estimated cost(in US dollars) that the DataLabelingJob has incurred to date.
   * @return currentSpend
   */
  @javax.annotation.Nullable
  public GoogleTypeMoney getCurrentSpend() {
    return currentSpend;
  }



  public GoogleCloudAiplatformV1DataLabelingJob displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. The user-defined name of the DataLabelingJob. The name can be up to 128 characters long and can consist of any UTF-8 characters. Display name of a DataLabelingJob.
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * Output only. Timestamp when this DataLabelingJob was updated most recently.
   * @return updateTime
   */
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }



  /**
   * Output only. The detailed state of the job.
   * @return state
   */
  @javax.annotation.Nullable
  public StateEnum getState() {
    return state;
  }



  public GoogleCloudAiplatformV1DataLabelingJob labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public GoogleCloudAiplatformV1DataLabelingJob putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * The labels with user-defined metadata to organize your DataLabelingJobs. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with \&quot;aiplatform.googleapis.com/\&quot; and are immutable. Following system labels exist for each DataLabelingJob: * \&quot;aiplatform.googleapis.com/schema\&quot;: output only, its value is the inputs_schema&#39;s title.
   * @return labels
   */
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  /**
   * Output only. Timestamp when this DataLabelingJob was created.
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }



  public GoogleCloudAiplatformV1DataLabelingJob specialistPools(List<String> specialistPools) {
    this.specialistPools = specialistPools;
    return this;
  }

  public GoogleCloudAiplatformV1DataLabelingJob addSpecialistPoolsItem(String specialistPoolsItem) {
    if (this.specialistPools == null) {
      this.specialistPools = new ArrayList<>();
    }
    this.specialistPools.add(specialistPoolsItem);
    return this;
  }

  /**
   * The SpecialistPools&#39; resource names associated with this job.
   * @return specialistPools
   */
  @javax.annotation.Nullable
  public List<String> getSpecialistPools() {
    return specialistPools;
  }

  public void setSpecialistPools(List<String> specialistPools) {
    this.specialistPools = specialistPools;
  }


  /**
   * Output only. DataLabelingJob errors. It is only populated when job&#39;s state is &#x60;JOB_STATE_FAILED&#x60; or &#x60;JOB_STATE_CANCELLED&#x60;.
   * @return error
   */
  @javax.annotation.Nullable
  public GoogleRpcStatus getError() {
    return error;
  }



  /**
   * Output only. Current labeling job progress percentage scaled in interval [0, 100], indicating the percentage of DataItems that has been finished.
   * @return labelingProgress
   */
  @javax.annotation.Nullable
  public Integer getLabelingProgress() {
    return labelingProgress;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1DataLabelingJob googleCloudAiplatformV1DataLabelingJob = (GoogleCloudAiplatformV1DataLabelingJob) o;
    return Objects.equals(this.datasets, googleCloudAiplatformV1DataLabelingJob.datasets) &&
        Objects.equals(this.labelerCount, googleCloudAiplatformV1DataLabelingJob.labelerCount) &&
        Objects.equals(this.instructionUri, googleCloudAiplatformV1DataLabelingJob.instructionUri) &&
        Objects.equals(this.activeLearningConfig, googleCloudAiplatformV1DataLabelingJob.activeLearningConfig) &&
        Objects.equals(this.inputsSchemaUri, googleCloudAiplatformV1DataLabelingJob.inputsSchemaUri) &&
        Objects.equals(this.inputs, googleCloudAiplatformV1DataLabelingJob.inputs) &&
        Objects.equals(this.encryptionSpec, googleCloudAiplatformV1DataLabelingJob.encryptionSpec) &&
        Objects.equals(this.annotationLabels, googleCloudAiplatformV1DataLabelingJob.annotationLabels) &&
        Objects.equals(this.name, googleCloudAiplatformV1DataLabelingJob.name) &&
        Objects.equals(this.currentSpend, googleCloudAiplatformV1DataLabelingJob.currentSpend) &&
        Objects.equals(this.displayName, googleCloudAiplatformV1DataLabelingJob.displayName) &&
        Objects.equals(this.updateTime, googleCloudAiplatformV1DataLabelingJob.updateTime) &&
        Objects.equals(this.state, googleCloudAiplatformV1DataLabelingJob.state) &&
        Objects.equals(this.labels, googleCloudAiplatformV1DataLabelingJob.labels) &&
        Objects.equals(this.createTime, googleCloudAiplatformV1DataLabelingJob.createTime) &&
        Objects.equals(this.specialistPools, googleCloudAiplatformV1DataLabelingJob.specialistPools) &&
        Objects.equals(this.error, googleCloudAiplatformV1DataLabelingJob.error) &&
        Objects.equals(this.labelingProgress, googleCloudAiplatformV1DataLabelingJob.labelingProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasets, labelerCount, instructionUri, activeLearningConfig, inputsSchemaUri, inputs, encryptionSpec, annotationLabels, name, currentSpend, displayName, updateTime, state, labels, createTime, specialistPools, error, labelingProgress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1DataLabelingJob {\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    labelerCount: ").append(toIndentedString(labelerCount)).append("\n");
    sb.append("    instructionUri: ").append(toIndentedString(instructionUri)).append("\n");
    sb.append("    activeLearningConfig: ").append(toIndentedString(activeLearningConfig)).append("\n");
    sb.append("    inputsSchemaUri: ").append(toIndentedString(inputsSchemaUri)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    encryptionSpec: ").append(toIndentedString(encryptionSpec)).append("\n");
    sb.append("    annotationLabels: ").append(toIndentedString(annotationLabels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currentSpend: ").append(toIndentedString(currentSpend)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    specialistPools: ").append(toIndentedString(specialistPools)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    labelingProgress: ").append(toIndentedString(labelingProgress)).append("\n");
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
    openapiFields.add("datasets");
    openapiFields.add("labelerCount");
    openapiFields.add("instructionUri");
    openapiFields.add("activeLearningConfig");
    openapiFields.add("inputsSchemaUri");
    openapiFields.add("inputs");
    openapiFields.add("encryptionSpec");
    openapiFields.add("annotationLabels");
    openapiFields.add("name");
    openapiFields.add("currentSpend");
    openapiFields.add("displayName");
    openapiFields.add("updateTime");
    openapiFields.add("state");
    openapiFields.add("labels");
    openapiFields.add("createTime");
    openapiFields.add("specialistPools");
    openapiFields.add("error");
    openapiFields.add("labelingProgress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1DataLabelingJob
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1DataLabelingJob.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1DataLabelingJob is not found in the empty JSON string", GoogleCloudAiplatformV1DataLabelingJob.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1DataLabelingJob.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1DataLabelingJob` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("datasets") != null && !jsonObj.get("datasets").isJsonNull() && !jsonObj.get("datasets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasets` to be an array in the JSON string but got `%s`", jsonObj.get("datasets").toString()));
      }
      if ((jsonObj.get("instructionUri") != null && !jsonObj.get("instructionUri").isJsonNull()) && !jsonObj.get("instructionUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructionUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructionUri").toString()));
      }
      // validate the optional field `activeLearningConfig`
      if (jsonObj.get("activeLearningConfig") != null && !jsonObj.get("activeLearningConfig").isJsonNull()) {
        GoogleCloudAiplatformV1ActiveLearningConfig.validateJsonElement(jsonObj.get("activeLearningConfig"));
      }
      if ((jsonObj.get("inputsSchemaUri") != null && !jsonObj.get("inputsSchemaUri").isJsonNull()) && !jsonObj.get("inputsSchemaUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inputsSchemaUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inputsSchemaUri").toString()));
      }
      // validate the optional field `encryptionSpec`
      if (jsonObj.get("encryptionSpec") != null && !jsonObj.get("encryptionSpec").isJsonNull()) {
        GoogleCloudAiplatformV1EncryptionSpec.validateJsonElement(jsonObj.get("encryptionSpec"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `currentSpend`
      if (jsonObj.get("currentSpend") != null && !jsonObj.get("currentSpend").isJsonNull()) {
        GoogleTypeMoney.validateJsonElement(jsonObj.get("currentSpend"));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("updateTime") != null && !jsonObj.get("updateTime").isJsonNull()) && !jsonObj.get("updateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateTime").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        StateEnum.validateJsonElement(jsonObj.get("state"));
      }
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("specialistPools") != null && !jsonObj.get("specialistPools").isJsonNull() && !jsonObj.get("specialistPools").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialistPools` to be an array in the JSON string but got `%s`", jsonObj.get("specialistPools").toString()));
      }
      // validate the optional field `error`
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) {
        GoogleRpcStatus.validateJsonElement(jsonObj.get("error"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1DataLabelingJob.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1DataLabelingJob' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1DataLabelingJob> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1DataLabelingJob.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1DataLabelingJob>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1DataLabelingJob value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1DataLabelingJob read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1DataLabelingJob given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1DataLabelingJob
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1DataLabelingJob
   */
  public static GoogleCloudAiplatformV1DataLabelingJob fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1DataLabelingJob.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1DataLabelingJob to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

