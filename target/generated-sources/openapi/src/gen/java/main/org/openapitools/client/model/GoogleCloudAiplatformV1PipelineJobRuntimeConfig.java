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
import org.openapitools.client.model.Any;
import org.openapitools.client.model.GoogleCloudAiplatformV1PipelineJobRuntimeConfigInputArtifact;
import org.openapitools.client.model.GoogleCloudAiplatformV1Value;

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
 * The runtime config of a PipelineJob.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1PipelineJobRuntimeConfig {
  /**
   * Represents the failure policy of a pipeline. Currently, the default of a pipeline is that the pipeline will continue to run until no more tasks can be executed, also known as PIPELINE_FAILURE_POLICY_FAIL_SLOW. However, if a pipeline is set to PIPELINE_FAILURE_POLICY_FAIL_FAST, it will stop scheduling any new tasks when a task has failed. Any scheduled tasks will continue to completion.
   */
  @JsonAdapter(FailurePolicyEnum.Adapter.class)
  public enum FailurePolicyEnum {
    UNSPECIFIED("PIPELINE_FAILURE_POLICY_UNSPECIFIED"),
    
    FAIL_SLOW("PIPELINE_FAILURE_POLICY_FAIL_SLOW"),
    
    FAIL_FAST("PIPELINE_FAILURE_POLICY_FAIL_FAST");

    private String value;

    FailurePolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FailurePolicyEnum fromValue(String value) {
      for (FailurePolicyEnum b : FailurePolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FailurePolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FailurePolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FailurePolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FailurePolicyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FailurePolicyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FAILURE_POLICY = "failurePolicy";
  @SerializedName(SERIALIZED_NAME_FAILURE_POLICY)
  private FailurePolicyEnum failurePolicy;

  public static final String SERIALIZED_NAME_INPUT_ARTIFACTS = "inputArtifacts";
  @SerializedName(SERIALIZED_NAME_INPUT_ARTIFACTS)
  private Map<String, GoogleCloudAiplatformV1PipelineJobRuntimeConfigInputArtifact> inputArtifacts = new HashMap<>();

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, GoogleCloudAiplatformV1Value> parameters = new HashMap<>();

  public static final String SERIALIZED_NAME_PARAMETER_VALUES = "parameterValues";
  @SerializedName(SERIALIZED_NAME_PARAMETER_VALUES)
  private Map<String, Any> parameterValues = new HashMap<>();

  public static final String SERIALIZED_NAME_GCS_OUTPUT_DIRECTORY = "gcsOutputDirectory";
  @SerializedName(SERIALIZED_NAME_GCS_OUTPUT_DIRECTORY)
  private String gcsOutputDirectory;

  public GoogleCloudAiplatformV1PipelineJobRuntimeConfig() {
  }

  public GoogleCloudAiplatformV1PipelineJobRuntimeConfig failurePolicy(FailurePolicyEnum failurePolicy) {
    this.failurePolicy = failurePolicy;
    return this;
  }

  /**
   * Represents the failure policy of a pipeline. Currently, the default of a pipeline is that the pipeline will continue to run until no more tasks can be executed, also known as PIPELINE_FAILURE_POLICY_FAIL_SLOW. However, if a pipeline is set to PIPELINE_FAILURE_POLICY_FAIL_FAST, it will stop scheduling any new tasks when a task has failed. Any scheduled tasks will continue to completion.
   * @return failurePolicy
   */
  @javax.annotation.Nullable
  public FailurePolicyEnum getFailurePolicy() {
    return failurePolicy;
  }

  public void setFailurePolicy(FailurePolicyEnum failurePolicy) {
    this.failurePolicy = failurePolicy;
  }


  public GoogleCloudAiplatformV1PipelineJobRuntimeConfig inputArtifacts(Map<String, GoogleCloudAiplatformV1PipelineJobRuntimeConfigInputArtifact> inputArtifacts) {
    this.inputArtifacts = inputArtifacts;
    return this;
  }

  public GoogleCloudAiplatformV1PipelineJobRuntimeConfig putInputArtifactsItem(String key, GoogleCloudAiplatformV1PipelineJobRuntimeConfigInputArtifact inputArtifactsItem) {
    if (this.inputArtifacts == null) {
      this.inputArtifacts = new HashMap<>();
    }
    this.inputArtifacts.put(key, inputArtifactsItem);
    return this;
  }

  /**
   * The runtime artifacts of the PipelineJob. The key will be the input artifact name and the value would be one of the InputArtifact.
   * @return inputArtifacts
   */
  @javax.annotation.Nullable
  public Map<String, GoogleCloudAiplatformV1PipelineJobRuntimeConfigInputArtifact> getInputArtifacts() {
    return inputArtifacts;
  }

  public void setInputArtifacts(Map<String, GoogleCloudAiplatformV1PipelineJobRuntimeConfigInputArtifact> inputArtifacts) {
    this.inputArtifacts = inputArtifacts;
  }


  @Deprecated
  public GoogleCloudAiplatformV1PipelineJobRuntimeConfig parameters(Map<String, GoogleCloudAiplatformV1Value> parameters) {
    this.parameters = parameters;
    return this;
  }

  public GoogleCloudAiplatformV1PipelineJobRuntimeConfig putParametersItem(String key, GoogleCloudAiplatformV1Value parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

  /**
   * Deprecated. Use RuntimeConfig.parameter_values instead. The runtime parameters of the PipelineJob. The parameters will be passed into PipelineJob.pipeline_spec to replace the placeholders at runtime. This field is used by pipelines built using &#x60;PipelineJob.pipeline_spec.schema_version&#x60; 2.0.0 or lower, such as pipelines built using Kubeflow Pipelines SDK 1.8 or lower.
   * @return parameters
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public Map<String, GoogleCloudAiplatformV1Value> getParameters() {
    return parameters;
  }

  @Deprecated
  public void setParameters(Map<String, GoogleCloudAiplatformV1Value> parameters) {
    this.parameters = parameters;
  }


  public GoogleCloudAiplatformV1PipelineJobRuntimeConfig parameterValues(Map<String, Any> parameterValues) {
    this.parameterValues = parameterValues;
    return this;
  }

  public GoogleCloudAiplatformV1PipelineJobRuntimeConfig putParameterValuesItem(String key, Any parameterValuesItem) {
    if (this.parameterValues == null) {
      this.parameterValues = new HashMap<>();
    }
    this.parameterValues.put(key, parameterValuesItem);
    return this;
  }

  /**
   * The runtime parameters of the PipelineJob. The parameters will be passed into PipelineJob.pipeline_spec to replace the placeholders at runtime. This field is used by pipelines built using &#x60;PipelineJob.pipeline_spec.schema_version&#x60; 2.1.0, such as pipelines built using Kubeflow Pipelines SDK 1.9 or higher and the v2 DSL.
   * @return parameterValues
   */
  @javax.annotation.Nullable
  public Map<String, Any> getParameterValues() {
    return parameterValues;
  }

  public void setParameterValues(Map<String, Any> parameterValues) {
    this.parameterValues = parameterValues;
  }


  public GoogleCloudAiplatformV1PipelineJobRuntimeConfig gcsOutputDirectory(String gcsOutputDirectory) {
    this.gcsOutputDirectory = gcsOutputDirectory;
    return this;
  }

  /**
   * Required. A path in a Cloud Storage bucket, which will be treated as the root output directory of the pipeline. It is used by the system to generate the paths of output artifacts. The artifact paths are generated with a sub-path pattern &#x60;{job_id}/{task_id}/{output_key}&#x60; under the specified output directory. The service account specified in this pipeline must have the &#x60;storage.objects.get&#x60; and &#x60;storage.objects.create&#x60; permissions for this bucket.
   * @return gcsOutputDirectory
   */
  @javax.annotation.Nullable
  public String getGcsOutputDirectory() {
    return gcsOutputDirectory;
  }

  public void setGcsOutputDirectory(String gcsOutputDirectory) {
    this.gcsOutputDirectory = gcsOutputDirectory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1PipelineJobRuntimeConfig googleCloudAiplatformV1PipelineJobRuntimeConfig = (GoogleCloudAiplatformV1PipelineJobRuntimeConfig) o;
    return Objects.equals(this.failurePolicy, googleCloudAiplatformV1PipelineJobRuntimeConfig.failurePolicy) &&
        Objects.equals(this.inputArtifacts, googleCloudAiplatformV1PipelineJobRuntimeConfig.inputArtifacts) &&
        Objects.equals(this.parameters, googleCloudAiplatformV1PipelineJobRuntimeConfig.parameters) &&
        Objects.equals(this.parameterValues, googleCloudAiplatformV1PipelineJobRuntimeConfig.parameterValues) &&
        Objects.equals(this.gcsOutputDirectory, googleCloudAiplatformV1PipelineJobRuntimeConfig.gcsOutputDirectory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failurePolicy, inputArtifacts, parameters, parameterValues, gcsOutputDirectory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1PipelineJobRuntimeConfig {\n");
    sb.append("    failurePolicy: ").append(toIndentedString(failurePolicy)).append("\n");
    sb.append("    inputArtifacts: ").append(toIndentedString(inputArtifacts)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
    sb.append("    gcsOutputDirectory: ").append(toIndentedString(gcsOutputDirectory)).append("\n");
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
    openapiFields.add("failurePolicy");
    openapiFields.add("inputArtifacts");
    openapiFields.add("parameters");
    openapiFields.add("parameterValues");
    openapiFields.add("gcsOutputDirectory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1PipelineJobRuntimeConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1PipelineJobRuntimeConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1PipelineJobRuntimeConfig is not found in the empty JSON string", GoogleCloudAiplatformV1PipelineJobRuntimeConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1PipelineJobRuntimeConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1PipelineJobRuntimeConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("failurePolicy") != null && !jsonObj.get("failurePolicy").isJsonNull()) && !jsonObj.get("failurePolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failurePolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failurePolicy").toString()));
      }
      // validate the optional field `failurePolicy`
      if (jsonObj.get("failurePolicy") != null && !jsonObj.get("failurePolicy").isJsonNull()) {
        FailurePolicyEnum.validateJsonElement(jsonObj.get("failurePolicy"));
      }
      if ((jsonObj.get("gcsOutputDirectory") != null && !jsonObj.get("gcsOutputDirectory").isJsonNull()) && !jsonObj.get("gcsOutputDirectory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gcsOutputDirectory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gcsOutputDirectory").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1PipelineJobRuntimeConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1PipelineJobRuntimeConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1PipelineJobRuntimeConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1PipelineJobRuntimeConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1PipelineJobRuntimeConfig>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1PipelineJobRuntimeConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1PipelineJobRuntimeConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1PipelineJobRuntimeConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1PipelineJobRuntimeConfig
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1PipelineJobRuntimeConfig
   */
  public static GoogleCloudAiplatformV1PipelineJobRuntimeConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1PipelineJobRuntimeConfig.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1PipelineJobRuntimeConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
