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
 * Model metadata specific to AutoML Tables.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata {
  public static final String SERIALIZED_NAME_EVALUATED_DATA_ITEMS_BIGQUERY_URI = "evaluatedDataItemsBigqueryUri";
  @SerializedName(SERIALIZED_NAME_EVALUATED_DATA_ITEMS_BIGQUERY_URI)
  private String evaluatedDataItemsBigqueryUri;

  public static final String SERIALIZED_NAME_TRAIN_COST_MILLI_NODE_HOURS = "trainCostMilliNodeHours";
  @SerializedName(SERIALIZED_NAME_TRAIN_COST_MILLI_NODE_HOURS)
  private String trainCostMilliNodeHours;

  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata() {
  }

  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata evaluatedDataItemsBigqueryUri(String evaluatedDataItemsBigqueryUri) {
    this.evaluatedDataItemsBigqueryUri = evaluatedDataItemsBigqueryUri;
    return this;
  }

  /**
   * BigQuery destination uri for exported evaluated examples.
   * @return evaluatedDataItemsBigqueryUri
   */
  @javax.annotation.Nullable
  public String getEvaluatedDataItemsBigqueryUri() {
    return evaluatedDataItemsBigqueryUri;
  }

  public void setEvaluatedDataItemsBigqueryUri(String evaluatedDataItemsBigqueryUri) {
    this.evaluatedDataItemsBigqueryUri = evaluatedDataItemsBigqueryUri;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata trainCostMilliNodeHours(String trainCostMilliNodeHours) {
    this.trainCostMilliNodeHours = trainCostMilliNodeHours;
    return this;
  }

  /**
   * Output only. The actual training cost of the model, expressed in milli node hours, i.e. 1,000 value in this field means 1 node hour. Guaranteed to not exceed the train budget.
   * @return trainCostMilliNodeHours
   */
  @javax.annotation.Nullable
  public String getTrainCostMilliNodeHours() {
    return trainCostMilliNodeHours;
  }

  public void setTrainCostMilliNodeHours(String trainCostMilliNodeHours) {
    this.trainCostMilliNodeHours = trainCostMilliNodeHours;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata = (GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata) o;
    return Objects.equals(this.evaluatedDataItemsBigqueryUri, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata.evaluatedDataItemsBigqueryUri) &&
        Objects.equals(this.trainCostMilliNodeHours, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata.trainCostMilliNodeHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluatedDataItemsBigqueryUri, trainCostMilliNodeHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata {\n");
    sb.append("    evaluatedDataItemsBigqueryUri: ").append(toIndentedString(evaluatedDataItemsBigqueryUri)).append("\n");
    sb.append("    trainCostMilliNodeHours: ").append(toIndentedString(trainCostMilliNodeHours)).append("\n");
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
    openapiFields.add("evaluatedDataItemsBigqueryUri");
    openapiFields.add("trainCostMilliNodeHours");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("evaluatedDataItemsBigqueryUri") != null && !jsonObj.get("evaluatedDataItemsBigqueryUri").isJsonNull()) && !jsonObj.get("evaluatedDataItemsBigqueryUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `evaluatedDataItemsBigqueryUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("evaluatedDataItemsBigqueryUri").toString()));
      }
      if ((jsonObj.get("trainCostMilliNodeHours") != null && !jsonObj.get("trainCostMilliNodeHours").isJsonNull()) && !jsonObj.get("trainCostMilliNodeHours").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trainCostMilliNodeHours` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trainCostMilliNodeHours").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata
   */
  public static GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

