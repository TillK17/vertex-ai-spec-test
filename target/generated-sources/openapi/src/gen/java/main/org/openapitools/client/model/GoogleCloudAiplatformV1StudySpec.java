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
import org.openapitools.client.model.GoogleCloudAiplatformV1StudySpecConvexAutomatedStoppingSpec;
import org.openapitools.client.model.GoogleCloudAiplatformV1StudySpecDecayCurveAutomatedStoppingSpec;
import org.openapitools.client.model.GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec;
import org.openapitools.client.model.GoogleCloudAiplatformV1StudySpecMetricSpec;
import org.openapitools.client.model.GoogleCloudAiplatformV1StudySpecParameterSpec;
import org.openapitools.client.model.GoogleCloudAiplatformV1StudySpecStudyStoppingConfig;

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
 * Represents specification of a Study.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1StudySpec {
  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<GoogleCloudAiplatformV1StudySpecParameterSpec> parameters = new ArrayList<>();

  public static final String SERIALIZED_NAME_DECAY_CURVE_STOPPING_SPEC = "decayCurveStoppingSpec";
  @SerializedName(SERIALIZED_NAME_DECAY_CURVE_STOPPING_SPEC)
  private GoogleCloudAiplatformV1StudySpecDecayCurveAutomatedStoppingSpec decayCurveStoppingSpec;

  /**
   * The observation noise level of the study. Currently only supported by the Vertex AI Vizier service. Not supported by HyperparameterTuningJob or TrainingPipeline.
   */
  @JsonAdapter(ObservationNoiseEnum.Adapter.class)
  public enum ObservationNoiseEnum {
    OBSERVATION_NOISE_UNSPECIFIED("OBSERVATION_NOISE_UNSPECIFIED"),
    
    LOW("LOW"),
    
    HIGH("HIGH");

    private String value;

    ObservationNoiseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObservationNoiseEnum fromValue(String value) {
      for (ObservationNoiseEnum b : ObservationNoiseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObservationNoiseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObservationNoiseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObservationNoiseEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObservationNoiseEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ObservationNoiseEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OBSERVATION_NOISE = "observationNoise";
  @SerializedName(SERIALIZED_NAME_OBSERVATION_NOISE)
  private ObservationNoiseEnum observationNoise;

  /**
   * Describe which measurement selection type will be used
   */
  @JsonAdapter(MeasurementSelectionTypeEnum.Adapter.class)
  public enum MeasurementSelectionTypeEnum {
    MEASUREMENT_SELECTION_TYPE_UNSPECIFIED("MEASUREMENT_SELECTION_TYPE_UNSPECIFIED"),
    
    LAST_MEASUREMENT("LAST_MEASUREMENT"),
    
    BEST_MEASUREMENT("BEST_MEASUREMENT");

    private String value;

    MeasurementSelectionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MeasurementSelectionTypeEnum fromValue(String value) {
      for (MeasurementSelectionTypeEnum b : MeasurementSelectionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MeasurementSelectionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MeasurementSelectionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MeasurementSelectionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MeasurementSelectionTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MeasurementSelectionTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MEASUREMENT_SELECTION_TYPE = "measurementSelectionType";
  @SerializedName(SERIALIZED_NAME_MEASUREMENT_SELECTION_TYPE)
  private MeasurementSelectionTypeEnum measurementSelectionType;

  public static final String SERIALIZED_NAME_MEDIAN_AUTOMATED_STOPPING_SPEC = "medianAutomatedStoppingSpec";
  @SerializedName(SERIALIZED_NAME_MEDIAN_AUTOMATED_STOPPING_SPEC)
  private GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec medianAutomatedStoppingSpec;

  public static final String SERIALIZED_NAME_CONVEX_AUTOMATED_STOPPING_SPEC = "convexAutomatedStoppingSpec";
  @SerializedName(SERIALIZED_NAME_CONVEX_AUTOMATED_STOPPING_SPEC)
  private GoogleCloudAiplatformV1StudySpecConvexAutomatedStoppingSpec convexAutomatedStoppingSpec;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<GoogleCloudAiplatformV1StudySpecMetricSpec> metrics = new ArrayList<>();

  public static final String SERIALIZED_NAME_STUDY_STOPPING_CONFIG = "studyStoppingConfig";
  @SerializedName(SERIALIZED_NAME_STUDY_STOPPING_CONFIG)
  private GoogleCloudAiplatformV1StudySpecStudyStoppingConfig studyStoppingConfig;

  /**
   * The search algorithm specified for the Study.
   */
  @JsonAdapter(AlgorithmEnum.Adapter.class)
  public enum AlgorithmEnum {
    ALGORITHM_UNSPECIFIED("ALGORITHM_UNSPECIFIED"),
    
    GRID_SEARCH("GRID_SEARCH"),
    
    RANDOM_SEARCH("RANDOM_SEARCH");

    private String value;

    AlgorithmEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlgorithmEnum fromValue(String value) {
      for (AlgorithmEnum b : AlgorithmEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AlgorithmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlgorithmEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlgorithmEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AlgorithmEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AlgorithmEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ALGORITHM = "algorithm";
  @SerializedName(SERIALIZED_NAME_ALGORITHM)
  private AlgorithmEnum algorithm;

  public GoogleCloudAiplatformV1StudySpec() {
  }

  public GoogleCloudAiplatformV1StudySpec parameters(List<GoogleCloudAiplatformV1StudySpecParameterSpec> parameters) {
    this.parameters = parameters;
    return this;
  }

  public GoogleCloudAiplatformV1StudySpec addParametersItem(GoogleCloudAiplatformV1StudySpecParameterSpec parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Required. The set of parameters to tune.
   * @return parameters
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1StudySpecParameterSpec> getParameters() {
    return parameters;
  }

  public void setParameters(List<GoogleCloudAiplatformV1StudySpecParameterSpec> parameters) {
    this.parameters = parameters;
  }


  public GoogleCloudAiplatformV1StudySpec decayCurveStoppingSpec(GoogleCloudAiplatformV1StudySpecDecayCurveAutomatedStoppingSpec decayCurveStoppingSpec) {
    this.decayCurveStoppingSpec = decayCurveStoppingSpec;
    return this;
  }

  /**
   * The automated early stopping spec using decay curve rule.
   * @return decayCurveStoppingSpec
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1StudySpecDecayCurveAutomatedStoppingSpec getDecayCurveStoppingSpec() {
    return decayCurveStoppingSpec;
  }

  public void setDecayCurveStoppingSpec(GoogleCloudAiplatformV1StudySpecDecayCurveAutomatedStoppingSpec decayCurveStoppingSpec) {
    this.decayCurveStoppingSpec = decayCurveStoppingSpec;
  }


  public GoogleCloudAiplatformV1StudySpec observationNoise(ObservationNoiseEnum observationNoise) {
    this.observationNoise = observationNoise;
    return this;
  }

  /**
   * The observation noise level of the study. Currently only supported by the Vertex AI Vizier service. Not supported by HyperparameterTuningJob or TrainingPipeline.
   * @return observationNoise
   */
  @javax.annotation.Nullable
  public ObservationNoiseEnum getObservationNoise() {
    return observationNoise;
  }

  public void setObservationNoise(ObservationNoiseEnum observationNoise) {
    this.observationNoise = observationNoise;
  }


  public GoogleCloudAiplatformV1StudySpec measurementSelectionType(MeasurementSelectionTypeEnum measurementSelectionType) {
    this.measurementSelectionType = measurementSelectionType;
    return this;
  }

  /**
   * Describe which measurement selection type will be used
   * @return measurementSelectionType
   */
  @javax.annotation.Nullable
  public MeasurementSelectionTypeEnum getMeasurementSelectionType() {
    return measurementSelectionType;
  }

  public void setMeasurementSelectionType(MeasurementSelectionTypeEnum measurementSelectionType) {
    this.measurementSelectionType = measurementSelectionType;
  }


  public GoogleCloudAiplatformV1StudySpec medianAutomatedStoppingSpec(GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec medianAutomatedStoppingSpec) {
    this.medianAutomatedStoppingSpec = medianAutomatedStoppingSpec;
    return this;
  }

  /**
   * The automated early stopping spec using median rule.
   * @return medianAutomatedStoppingSpec
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec getMedianAutomatedStoppingSpec() {
    return medianAutomatedStoppingSpec;
  }

  public void setMedianAutomatedStoppingSpec(GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec medianAutomatedStoppingSpec) {
    this.medianAutomatedStoppingSpec = medianAutomatedStoppingSpec;
  }


  public GoogleCloudAiplatformV1StudySpec convexAutomatedStoppingSpec(GoogleCloudAiplatformV1StudySpecConvexAutomatedStoppingSpec convexAutomatedStoppingSpec) {
    this.convexAutomatedStoppingSpec = convexAutomatedStoppingSpec;
    return this;
  }

  /**
   * The automated early stopping spec using convex stopping rule.
   * @return convexAutomatedStoppingSpec
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1StudySpecConvexAutomatedStoppingSpec getConvexAutomatedStoppingSpec() {
    return convexAutomatedStoppingSpec;
  }

  public void setConvexAutomatedStoppingSpec(GoogleCloudAiplatformV1StudySpecConvexAutomatedStoppingSpec convexAutomatedStoppingSpec) {
    this.convexAutomatedStoppingSpec = convexAutomatedStoppingSpec;
  }


  public GoogleCloudAiplatformV1StudySpec metrics(List<GoogleCloudAiplatformV1StudySpecMetricSpec> metrics) {
    this.metrics = metrics;
    return this;
  }

  public GoogleCloudAiplatformV1StudySpec addMetricsItem(GoogleCloudAiplatformV1StudySpecMetricSpec metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

  /**
   * Required. Metric specs for the Study.
   * @return metrics
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1StudySpecMetricSpec> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<GoogleCloudAiplatformV1StudySpecMetricSpec> metrics) {
    this.metrics = metrics;
  }


  public GoogleCloudAiplatformV1StudySpec studyStoppingConfig(GoogleCloudAiplatformV1StudySpecStudyStoppingConfig studyStoppingConfig) {
    this.studyStoppingConfig = studyStoppingConfig;
    return this;
  }

  /**
   * Conditions for automated stopping of a Study. Enable automated stopping by configuring at least one condition.
   * @return studyStoppingConfig
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig getStudyStoppingConfig() {
    return studyStoppingConfig;
  }

  public void setStudyStoppingConfig(GoogleCloudAiplatformV1StudySpecStudyStoppingConfig studyStoppingConfig) {
    this.studyStoppingConfig = studyStoppingConfig;
  }


  public GoogleCloudAiplatformV1StudySpec algorithm(AlgorithmEnum algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * The search algorithm specified for the Study.
   * @return algorithm
   */
  @javax.annotation.Nullable
  public AlgorithmEnum getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(AlgorithmEnum algorithm) {
    this.algorithm = algorithm;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1StudySpec googleCloudAiplatformV1StudySpec = (GoogleCloudAiplatformV1StudySpec) o;
    return Objects.equals(this.parameters, googleCloudAiplatformV1StudySpec.parameters) &&
        Objects.equals(this.decayCurveStoppingSpec, googleCloudAiplatformV1StudySpec.decayCurveStoppingSpec) &&
        Objects.equals(this.observationNoise, googleCloudAiplatformV1StudySpec.observationNoise) &&
        Objects.equals(this.measurementSelectionType, googleCloudAiplatformV1StudySpec.measurementSelectionType) &&
        Objects.equals(this.medianAutomatedStoppingSpec, googleCloudAiplatformV1StudySpec.medianAutomatedStoppingSpec) &&
        Objects.equals(this.convexAutomatedStoppingSpec, googleCloudAiplatformV1StudySpec.convexAutomatedStoppingSpec) &&
        Objects.equals(this.metrics, googleCloudAiplatformV1StudySpec.metrics) &&
        Objects.equals(this.studyStoppingConfig, googleCloudAiplatformV1StudySpec.studyStoppingConfig) &&
        Objects.equals(this.algorithm, googleCloudAiplatformV1StudySpec.algorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, decayCurveStoppingSpec, observationNoise, measurementSelectionType, medianAutomatedStoppingSpec, convexAutomatedStoppingSpec, metrics, studyStoppingConfig, algorithm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1StudySpec {\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    decayCurveStoppingSpec: ").append(toIndentedString(decayCurveStoppingSpec)).append("\n");
    sb.append("    observationNoise: ").append(toIndentedString(observationNoise)).append("\n");
    sb.append("    measurementSelectionType: ").append(toIndentedString(measurementSelectionType)).append("\n");
    sb.append("    medianAutomatedStoppingSpec: ").append(toIndentedString(medianAutomatedStoppingSpec)).append("\n");
    sb.append("    convexAutomatedStoppingSpec: ").append(toIndentedString(convexAutomatedStoppingSpec)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    studyStoppingConfig: ").append(toIndentedString(studyStoppingConfig)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
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
    openapiFields.add("parameters");
    openapiFields.add("decayCurveStoppingSpec");
    openapiFields.add("observationNoise");
    openapiFields.add("measurementSelectionType");
    openapiFields.add("medianAutomatedStoppingSpec");
    openapiFields.add("convexAutomatedStoppingSpec");
    openapiFields.add("metrics");
    openapiFields.add("studyStoppingConfig");
    openapiFields.add("algorithm");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1StudySpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1StudySpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1StudySpec is not found in the empty JSON string", GoogleCloudAiplatformV1StudySpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1StudySpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1StudySpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        JsonArray jsonArrayparameters = jsonObj.getAsJsonArray("parameters");
        if (jsonArrayparameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
          }

          // validate the optional field `parameters` (array)
          for (int i = 0; i < jsonArrayparameters.size(); i++) {
            GoogleCloudAiplatformV1StudySpecParameterSpec.validateJsonElement(jsonArrayparameters.get(i));
          };
        }
      }
      // validate the optional field `decayCurveStoppingSpec`
      if (jsonObj.get("decayCurveStoppingSpec") != null && !jsonObj.get("decayCurveStoppingSpec").isJsonNull()) {
        GoogleCloudAiplatformV1StudySpecDecayCurveAutomatedStoppingSpec.validateJsonElement(jsonObj.get("decayCurveStoppingSpec"));
      }
      if ((jsonObj.get("observationNoise") != null && !jsonObj.get("observationNoise").isJsonNull()) && !jsonObj.get("observationNoise").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `observationNoise` to be a primitive type in the JSON string but got `%s`", jsonObj.get("observationNoise").toString()));
      }
      // validate the optional field `observationNoise`
      if (jsonObj.get("observationNoise") != null && !jsonObj.get("observationNoise").isJsonNull()) {
        ObservationNoiseEnum.validateJsonElement(jsonObj.get("observationNoise"));
      }
      if ((jsonObj.get("measurementSelectionType") != null && !jsonObj.get("measurementSelectionType").isJsonNull()) && !jsonObj.get("measurementSelectionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `measurementSelectionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("measurementSelectionType").toString()));
      }
      // validate the optional field `measurementSelectionType`
      if (jsonObj.get("measurementSelectionType") != null && !jsonObj.get("measurementSelectionType").isJsonNull()) {
        MeasurementSelectionTypeEnum.validateJsonElement(jsonObj.get("measurementSelectionType"));
      }
      // validate the optional field `medianAutomatedStoppingSpec`
      if (jsonObj.get("medianAutomatedStoppingSpec") != null && !jsonObj.get("medianAutomatedStoppingSpec").isJsonNull()) {
        GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec.validateJsonElement(jsonObj.get("medianAutomatedStoppingSpec"));
      }
      // validate the optional field `convexAutomatedStoppingSpec`
      if (jsonObj.get("convexAutomatedStoppingSpec") != null && !jsonObj.get("convexAutomatedStoppingSpec").isJsonNull()) {
        GoogleCloudAiplatformV1StudySpecConvexAutomatedStoppingSpec.validateJsonElement(jsonObj.get("convexAutomatedStoppingSpec"));
      }
      if (jsonObj.get("metrics") != null && !jsonObj.get("metrics").isJsonNull()) {
        JsonArray jsonArraymetrics = jsonObj.getAsJsonArray("metrics");
        if (jsonArraymetrics != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metrics").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metrics` to be an array in the JSON string but got `%s`", jsonObj.get("metrics").toString()));
          }

          // validate the optional field `metrics` (array)
          for (int i = 0; i < jsonArraymetrics.size(); i++) {
            GoogleCloudAiplatformV1StudySpecMetricSpec.validateJsonElement(jsonArraymetrics.get(i));
          };
        }
      }
      // validate the optional field `studyStoppingConfig`
      if (jsonObj.get("studyStoppingConfig") != null && !jsonObj.get("studyStoppingConfig").isJsonNull()) {
        GoogleCloudAiplatformV1StudySpecStudyStoppingConfig.validateJsonElement(jsonObj.get("studyStoppingConfig"));
      }
      if ((jsonObj.get("algorithm") != null && !jsonObj.get("algorithm").isJsonNull()) && !jsonObj.get("algorithm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `algorithm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("algorithm").toString()));
      }
      // validate the optional field `algorithm`
      if (jsonObj.get("algorithm") != null && !jsonObj.get("algorithm").isJsonNull()) {
        AlgorithmEnum.validateJsonElement(jsonObj.get("algorithm"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1StudySpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1StudySpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1StudySpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1StudySpec.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1StudySpec>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1StudySpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1StudySpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1StudySpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1StudySpec
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1StudySpec
   */
  public static GoogleCloudAiplatformV1StudySpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1StudySpec.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1StudySpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
