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
import org.openapitools.client.model.GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation;
import org.openapitools.client.model.GoogleCloudAiplatformV1SchemaTrainingjobDefinitionExportEvaluatedDataItemsConfig;

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
 * GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs {
  public static final String SERIALIZED_NAME_OPTIMIZATION_OBJECTIVE_RECALL_VALUE = "optimizationObjectiveRecallValue";
  @SerializedName(SERIALIZED_NAME_OPTIMIZATION_OBJECTIVE_RECALL_VALUE)
  private Float optimizationObjectiveRecallValue;

  public static final String SERIALIZED_NAME_EXPORT_EVALUATED_DATA_ITEMS_CONFIG = "exportEvaluatedDataItemsConfig";
  @SerializedName(SERIALIZED_NAME_EXPORT_EVALUATED_DATA_ITEMS_CONFIG)
  private GoogleCloudAiplatformV1SchemaTrainingjobDefinitionExportEvaluatedDataItemsConfig exportEvaluatedDataItemsConfig;

  public static final String SERIALIZED_NAME_DISABLE_EARLY_STOPPING = "disableEarlyStopping";
  @SerializedName(SERIALIZED_NAME_DISABLE_EARLY_STOPPING)
  private Boolean disableEarlyStopping;

  public static final String SERIALIZED_NAME_TARGET_COLUMN = "targetColumn";
  @SerializedName(SERIALIZED_NAME_TARGET_COLUMN)
  private String targetColumn;

  public static final String SERIALIZED_NAME_ADDITIONAL_EXPERIMENTS = "additionalExperiments";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_EXPERIMENTS)
  private List<String> additionalExperiments = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRAIN_BUDGET_MILLI_NODE_HOURS = "trainBudgetMilliNodeHours";
  @SerializedName(SERIALIZED_NAME_TRAIN_BUDGET_MILLI_NODE_HOURS)
  private String trainBudgetMilliNodeHours;

  public static final String SERIALIZED_NAME_TRANSFORMATIONS = "transformations";
  @SerializedName(SERIALIZED_NAME_TRANSFORMATIONS)
  private List<GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation> transformations = new ArrayList<>();

  public static final String SERIALIZED_NAME_PREDICTION_TYPE = "predictionType";
  @SerializedName(SERIALIZED_NAME_PREDICTION_TYPE)
  private String predictionType;

  public static final String SERIALIZED_NAME_WEIGHT_COLUMN_NAME = "weightColumnName";
  @SerializedName(SERIALIZED_NAME_WEIGHT_COLUMN_NAME)
  private String weightColumnName;

  public static final String SERIALIZED_NAME_OPTIMIZATION_OBJECTIVE_PRECISION_VALUE = "optimizationObjectivePrecisionValue";
  @SerializedName(SERIALIZED_NAME_OPTIMIZATION_OBJECTIVE_PRECISION_VALUE)
  private Float optimizationObjectivePrecisionValue;

  public static final String SERIALIZED_NAME_OPTIMIZATION_OBJECTIVE = "optimizationObjective";
  @SerializedName(SERIALIZED_NAME_OPTIMIZATION_OBJECTIVE)
  private String optimizationObjective;

  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs() {
  }

  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs optimizationObjectiveRecallValue(Float optimizationObjectiveRecallValue) {
    this.optimizationObjectiveRecallValue = optimizationObjectiveRecallValue;
    return this;
  }

  /**
   * Required when optimization_objective is \&quot;maximize-precision-at-recall\&quot;. Must be between 0 and 1, inclusive.
   * @return optimizationObjectiveRecallValue
   */
  @javax.annotation.Nullable
  public Float getOptimizationObjectiveRecallValue() {
    return optimizationObjectiveRecallValue;
  }

  public void setOptimizationObjectiveRecallValue(Float optimizationObjectiveRecallValue) {
    this.optimizationObjectiveRecallValue = optimizationObjectiveRecallValue;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs exportEvaluatedDataItemsConfig(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionExportEvaluatedDataItemsConfig exportEvaluatedDataItemsConfig) {
    this.exportEvaluatedDataItemsConfig = exportEvaluatedDataItemsConfig;
    return this;
  }

  /**
   * Configuration for exporting test set predictions to a BigQuery table. If this configuration is absent, then the export is not performed.
   * @return exportEvaluatedDataItemsConfig
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionExportEvaluatedDataItemsConfig getExportEvaluatedDataItemsConfig() {
    return exportEvaluatedDataItemsConfig;
  }

  public void setExportEvaluatedDataItemsConfig(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionExportEvaluatedDataItemsConfig exportEvaluatedDataItemsConfig) {
    this.exportEvaluatedDataItemsConfig = exportEvaluatedDataItemsConfig;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs disableEarlyStopping(Boolean disableEarlyStopping) {
    this.disableEarlyStopping = disableEarlyStopping;
    return this;
  }

  /**
   * Use the entire training budget. This disables the early stopping feature. By default, the early stopping feature is enabled, which means that AutoML Tables might stop training before the entire training budget has been used.
   * @return disableEarlyStopping
   */
  @javax.annotation.Nullable
  public Boolean getDisableEarlyStopping() {
    return disableEarlyStopping;
  }

  public void setDisableEarlyStopping(Boolean disableEarlyStopping) {
    this.disableEarlyStopping = disableEarlyStopping;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs targetColumn(String targetColumn) {
    this.targetColumn = targetColumn;
    return this;
  }

  /**
   * The column name of the target column that the model is to predict.
   * @return targetColumn
   */
  @javax.annotation.Nullable
  public String getTargetColumn() {
    return targetColumn;
  }

  public void setTargetColumn(String targetColumn) {
    this.targetColumn = targetColumn;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs additionalExperiments(List<String> additionalExperiments) {
    this.additionalExperiments = additionalExperiments;
    return this;
  }

  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs addAdditionalExperimentsItem(String additionalExperimentsItem) {
    if (this.additionalExperiments == null) {
      this.additionalExperiments = new ArrayList<>();
    }
    this.additionalExperiments.add(additionalExperimentsItem);
    return this;
  }

  /**
   * Additional experiment flags for the Tables training pipeline.
   * @return additionalExperiments
   */
  @javax.annotation.Nullable
  public List<String> getAdditionalExperiments() {
    return additionalExperiments;
  }

  public void setAdditionalExperiments(List<String> additionalExperiments) {
    this.additionalExperiments = additionalExperiments;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs trainBudgetMilliNodeHours(String trainBudgetMilliNodeHours) {
    this.trainBudgetMilliNodeHours = trainBudgetMilliNodeHours;
    return this;
  }

  /**
   * Required. The train budget of creating this model, expressed in milli node hours i.e. 1,000 value in this field means 1 node hour. The training cost of the model will not exceed this budget. The final cost will be attempted to be close to the budget, though may end up being (even) noticeably smaller - at the backend&#39;s discretion. This especially may happen when further model training ceases to provide any improvements. If the budget is set to a value known to be insufficient to train a model for the given dataset, the training won&#39;t be attempted and will error. The train budget must be between 1,000 and 72,000 milli node hours, inclusive.
   * @return trainBudgetMilliNodeHours
   */
  @javax.annotation.Nullable
  public String getTrainBudgetMilliNodeHours() {
    return trainBudgetMilliNodeHours;
  }

  public void setTrainBudgetMilliNodeHours(String trainBudgetMilliNodeHours) {
    this.trainBudgetMilliNodeHours = trainBudgetMilliNodeHours;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs transformations(List<GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation> transformations) {
    this.transformations = transformations;
    return this;
  }

  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs addTransformationsItem(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation transformationsItem) {
    if (this.transformations == null) {
      this.transformations = new ArrayList<>();
    }
    this.transformations.add(transformationsItem);
    return this;
  }

  /**
   * Each transformation will apply transform function to given input column. And the result will be used for training. When creating transformation for BigQuery Struct column, the column should be flattened using \&quot;.\&quot; as the delimiter.
   * @return transformations
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation> getTransformations() {
    return transformations;
  }

  public void setTransformations(List<GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation> transformations) {
    this.transformations = transformations;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs predictionType(String predictionType) {
    this.predictionType = predictionType;
    return this;
  }

  /**
   * The type of prediction the Model is to produce. \&quot;classification\&quot; - Predict one out of multiple target values is picked for each row. \&quot;regression\&quot; - Predict a value based on its relation to other values. This type is available only to columns that contain semantically numeric values, i.e. integers or floating point number, even if stored as e.g. strings.
   * @return predictionType
   */
  @javax.annotation.Nullable
  public String getPredictionType() {
    return predictionType;
  }

  public void setPredictionType(String predictionType) {
    this.predictionType = predictionType;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs weightColumnName(String weightColumnName) {
    this.weightColumnName = weightColumnName;
    return this;
  }

  /**
   * Column name that should be used as the weight column. Higher values in this column give more importance to the row during model training. The column must have numeric values between 0 and 10000 inclusively; 0 means the row is ignored for training. If weight column field is not set, then all rows are assumed to have equal weight of 1.
   * @return weightColumnName
   */
  @javax.annotation.Nullable
  public String getWeightColumnName() {
    return weightColumnName;
  }

  public void setWeightColumnName(String weightColumnName) {
    this.weightColumnName = weightColumnName;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs optimizationObjectivePrecisionValue(Float optimizationObjectivePrecisionValue) {
    this.optimizationObjectivePrecisionValue = optimizationObjectivePrecisionValue;
    return this;
  }

  /**
   * Required when optimization_objective is \&quot;maximize-recall-at-precision\&quot;. Must be between 0 and 1, inclusive.
   * @return optimizationObjectivePrecisionValue
   */
  @javax.annotation.Nullable
  public Float getOptimizationObjectivePrecisionValue() {
    return optimizationObjectivePrecisionValue;
  }

  public void setOptimizationObjectivePrecisionValue(Float optimizationObjectivePrecisionValue) {
    this.optimizationObjectivePrecisionValue = optimizationObjectivePrecisionValue;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs optimizationObjective(String optimizationObjective) {
    this.optimizationObjective = optimizationObjective;
    return this;
  }

  /**
   * Objective function the model is optimizing towards. The training process creates a model that maximizes/minimizes the value of the objective function over the validation set. The supported optimization objectives depend on the prediction type. If the field is not set, a default objective function is used. classification (binary): \&quot;maximize-au-roc\&quot; (default) - Maximize the area under the receiver operating characteristic (ROC) curve. \&quot;minimize-log-loss\&quot; - Minimize log loss. \&quot;maximize-au-prc\&quot; - Maximize the area under the precision-recall curve. \&quot;maximize-precision-at-recall\&quot; - Maximize precision for a specified recall value. \&quot;maximize-recall-at-precision\&quot; - Maximize recall for a specified precision value. classification (multi-class): \&quot;minimize-log-loss\&quot; (default) - Minimize log loss. regression: \&quot;minimize-rmse\&quot; (default) - Minimize root-mean-squared error (RMSE). \&quot;minimize-mae\&quot; - Minimize mean-absolute error (MAE). \&quot;minimize-rmsle\&quot; - Minimize root-mean-squared log error (RMSLE).
   * @return optimizationObjective
   */
  @javax.annotation.Nullable
  public String getOptimizationObjective() {
    return optimizationObjective;
  }

  public void setOptimizationObjective(String optimizationObjective) {
    this.optimizationObjective = optimizationObjective;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs = (GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs) o;
    return Objects.equals(this.optimizationObjectiveRecallValue, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.optimizationObjectiveRecallValue) &&
        Objects.equals(this.exportEvaluatedDataItemsConfig, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.exportEvaluatedDataItemsConfig) &&
        Objects.equals(this.disableEarlyStopping, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.disableEarlyStopping) &&
        Objects.equals(this.targetColumn, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.targetColumn) &&
        Objects.equals(this.additionalExperiments, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.additionalExperiments) &&
        Objects.equals(this.trainBudgetMilliNodeHours, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.trainBudgetMilliNodeHours) &&
        Objects.equals(this.transformations, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.transformations) &&
        Objects.equals(this.predictionType, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.predictionType) &&
        Objects.equals(this.weightColumnName, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.weightColumnName) &&
        Objects.equals(this.optimizationObjectivePrecisionValue, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.optimizationObjectivePrecisionValue) &&
        Objects.equals(this.optimizationObjective, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.optimizationObjective);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optimizationObjectiveRecallValue, exportEvaluatedDataItemsConfig, disableEarlyStopping, targetColumn, additionalExperiments, trainBudgetMilliNodeHours, transformations, predictionType, weightColumnName, optimizationObjectivePrecisionValue, optimizationObjective);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs {\n");
    sb.append("    optimizationObjectiveRecallValue: ").append(toIndentedString(optimizationObjectiveRecallValue)).append("\n");
    sb.append("    exportEvaluatedDataItemsConfig: ").append(toIndentedString(exportEvaluatedDataItemsConfig)).append("\n");
    sb.append("    disableEarlyStopping: ").append(toIndentedString(disableEarlyStopping)).append("\n");
    sb.append("    targetColumn: ").append(toIndentedString(targetColumn)).append("\n");
    sb.append("    additionalExperiments: ").append(toIndentedString(additionalExperiments)).append("\n");
    sb.append("    trainBudgetMilliNodeHours: ").append(toIndentedString(trainBudgetMilliNodeHours)).append("\n");
    sb.append("    transformations: ").append(toIndentedString(transformations)).append("\n");
    sb.append("    predictionType: ").append(toIndentedString(predictionType)).append("\n");
    sb.append("    weightColumnName: ").append(toIndentedString(weightColumnName)).append("\n");
    sb.append("    optimizationObjectivePrecisionValue: ").append(toIndentedString(optimizationObjectivePrecisionValue)).append("\n");
    sb.append("    optimizationObjective: ").append(toIndentedString(optimizationObjective)).append("\n");
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
    openapiFields.add("optimizationObjectiveRecallValue");
    openapiFields.add("exportEvaluatedDataItemsConfig");
    openapiFields.add("disableEarlyStopping");
    openapiFields.add("targetColumn");
    openapiFields.add("additionalExperiments");
    openapiFields.add("trainBudgetMilliNodeHours");
    openapiFields.add("transformations");
    openapiFields.add("predictionType");
    openapiFields.add("weightColumnName");
    openapiFields.add("optimizationObjectivePrecisionValue");
    openapiFields.add("optimizationObjective");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `exportEvaluatedDataItemsConfig`
      if (jsonObj.get("exportEvaluatedDataItemsConfig") != null && !jsonObj.get("exportEvaluatedDataItemsConfig").isJsonNull()) {
        GoogleCloudAiplatformV1SchemaTrainingjobDefinitionExportEvaluatedDataItemsConfig.validateJsonElement(jsonObj.get("exportEvaluatedDataItemsConfig"));
      }
      if ((jsonObj.get("targetColumn") != null && !jsonObj.get("targetColumn").isJsonNull()) && !jsonObj.get("targetColumn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetColumn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetColumn").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("additionalExperiments") != null && !jsonObj.get("additionalExperiments").isJsonNull() && !jsonObj.get("additionalExperiments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalExperiments` to be an array in the JSON string but got `%s`", jsonObj.get("additionalExperiments").toString()));
      }
      if ((jsonObj.get("trainBudgetMilliNodeHours") != null && !jsonObj.get("trainBudgetMilliNodeHours").isJsonNull()) && !jsonObj.get("trainBudgetMilliNodeHours").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trainBudgetMilliNodeHours` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trainBudgetMilliNodeHours").toString()));
      }
      if (jsonObj.get("transformations") != null && !jsonObj.get("transformations").isJsonNull()) {
        JsonArray jsonArraytransformations = jsonObj.getAsJsonArray("transformations");
        if (jsonArraytransformations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("transformations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `transformations` to be an array in the JSON string but got `%s`", jsonObj.get("transformations").toString()));
          }

          // validate the optional field `transformations` (array)
          for (int i = 0; i < jsonArraytransformations.size(); i++) {
            GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation.validateJsonElement(jsonArraytransformations.get(i));
          };
        }
      }
      if ((jsonObj.get("predictionType") != null && !jsonObj.get("predictionType").isJsonNull()) && !jsonObj.get("predictionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `predictionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("predictionType").toString()));
      }
      if ((jsonObj.get("weightColumnName") != null && !jsonObj.get("weightColumnName").isJsonNull()) && !jsonObj.get("weightColumnName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `weightColumnName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("weightColumnName").toString()));
      }
      if ((jsonObj.get("optimizationObjective") != null && !jsonObj.get("optimizationObjective").isJsonNull()) && !jsonObj.get("optimizationObjective").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `optimizationObjective` to be a primitive type in the JSON string but got `%s`", jsonObj.get("optimizationObjective").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs
   */
  public static GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputs to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

