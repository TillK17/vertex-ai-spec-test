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
import org.openapitools.client.model.GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec;
import org.openapitools.client.model.GoogleCloudAiplatformV1BatchReadFeatureValuesRequestPassThroughField;
import org.openapitools.client.model.GoogleCloudAiplatformV1BigQuerySource;
import org.openapitools.client.model.GoogleCloudAiplatformV1CsvSource;
import org.openapitools.client.model.GoogleCloudAiplatformV1FeatureValueDestination;

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
 * Request message for FeaturestoreService.BatchReadFeatureValues.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1BatchReadFeatureValuesRequest {
  public static final String SERIALIZED_NAME_PASS_THROUGH_FIELDS = "passThroughFields";
  @SerializedName(SERIALIZED_NAME_PASS_THROUGH_FIELDS)
  private List<GoogleCloudAiplatformV1BatchReadFeatureValuesRequestPassThroughField> passThroughFields = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENTITY_TYPE_SPECS = "entityTypeSpecs";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE_SPECS)
  private List<GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec> entityTypeSpecs = new ArrayList<>();

  public static final String SERIALIZED_NAME_BIGQUERY_READ_INSTANCES = "bigqueryReadInstances";
  @SerializedName(SERIALIZED_NAME_BIGQUERY_READ_INSTANCES)
  private GoogleCloudAiplatformV1BigQuerySource bigqueryReadInstances;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private GoogleCloudAiplatformV1FeatureValueDestination destination;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_CSV_READ_INSTANCES = "csvReadInstances";
  @SerializedName(SERIALIZED_NAME_CSV_READ_INSTANCES)
  private GoogleCloudAiplatformV1CsvSource csvReadInstances;

  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequest() {
  }

  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequest passThroughFields(List<GoogleCloudAiplatformV1BatchReadFeatureValuesRequestPassThroughField> passThroughFields) {
    this.passThroughFields = passThroughFields;
    return this;
  }

  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequest addPassThroughFieldsItem(GoogleCloudAiplatformV1BatchReadFeatureValuesRequestPassThroughField passThroughFieldsItem) {
    if (this.passThroughFields == null) {
      this.passThroughFields = new ArrayList<>();
    }
    this.passThroughFields.add(passThroughFieldsItem);
    return this;
  }

  /**
   * When not empty, the specified fields in the *_read_instances source will be joined as-is in the output, in addition to those fields from the Featurestore Entity. For BigQuery source, the type of the pass-through values will be automatically inferred. For CSV source, the pass-through values will be passed as opaque bytes.
   * @return passThroughFields
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1BatchReadFeatureValuesRequestPassThroughField> getPassThroughFields() {
    return passThroughFields;
  }

  public void setPassThroughFields(List<GoogleCloudAiplatformV1BatchReadFeatureValuesRequestPassThroughField> passThroughFields) {
    this.passThroughFields = passThroughFields;
  }


  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequest entityTypeSpecs(List<GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec> entityTypeSpecs) {
    this.entityTypeSpecs = entityTypeSpecs;
    return this;
  }

  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequest addEntityTypeSpecsItem(GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec entityTypeSpecsItem) {
    if (this.entityTypeSpecs == null) {
      this.entityTypeSpecs = new ArrayList<>();
    }
    this.entityTypeSpecs.add(entityTypeSpecsItem);
    return this;
  }

  /**
   * Required. Specifies EntityType grouping Features to read values of and settings.
   * @return entityTypeSpecs
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec> getEntityTypeSpecs() {
    return entityTypeSpecs;
  }

  public void setEntityTypeSpecs(List<GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec> entityTypeSpecs) {
    this.entityTypeSpecs = entityTypeSpecs;
  }


  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequest bigqueryReadInstances(GoogleCloudAiplatformV1BigQuerySource bigqueryReadInstances) {
    this.bigqueryReadInstances = bigqueryReadInstances;
    return this;
  }

  /**
   * Similar to csv_read_instances, but from BigQuery source.
   * @return bigqueryReadInstances
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1BigQuerySource getBigqueryReadInstances() {
    return bigqueryReadInstances;
  }

  public void setBigqueryReadInstances(GoogleCloudAiplatformV1BigQuerySource bigqueryReadInstances) {
    this.bigqueryReadInstances = bigqueryReadInstances;
  }


  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequest destination(GoogleCloudAiplatformV1FeatureValueDestination destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Required. Specifies output location and format.
   * @return destination
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1FeatureValueDestination getDestination() {
    return destination;
  }

  public void setDestination(GoogleCloudAiplatformV1FeatureValueDestination destination) {
    this.destination = destination;
  }


  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequest startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Optional. Excludes Feature values with feature generation timestamp before this timestamp. If not set, retrieve oldest values kept in Feature Store. Timestamp, if present, must not have higher than millisecond precision.
   * @return startTime
   */
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequest csvReadInstances(GoogleCloudAiplatformV1CsvSource csvReadInstances) {
    this.csvReadInstances = csvReadInstances;
    return this;
  }

  /**
   * Each read instance consists of exactly one read timestamp and one or more entity IDs identifying entities of the corresponding EntityTypes whose Features are requested. Each output instance contains Feature values of requested entities concatenated together as of the read time. An example read instance may be &#x60;foo_entity_id, bar_entity_id, 2020-01-01T10:00:00.123Z&#x60;. An example output instance may be &#x60;foo_entity_id, bar_entity_id, 2020-01-01T10:00:00.123Z, foo_entity_feature1_value, bar_entity_feature2_value&#x60;. Timestamp in each read instance must be millisecond-aligned. &#x60;csv_read_instances&#x60; are read instances stored in a plain-text CSV file. The header should be: [ENTITY_TYPE_ID1], [ENTITY_TYPE_ID2], ..., timestamp The columns can be in any order. Values in the timestamp column must use the RFC 3339 format, e.g. &#x60;2012-07-30T10:43:17.123Z&#x60;.
   * @return csvReadInstances
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1CsvSource getCsvReadInstances() {
    return csvReadInstances;
  }

  public void setCsvReadInstances(GoogleCloudAiplatformV1CsvSource csvReadInstances) {
    this.csvReadInstances = csvReadInstances;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1BatchReadFeatureValuesRequest googleCloudAiplatformV1BatchReadFeatureValuesRequest = (GoogleCloudAiplatformV1BatchReadFeatureValuesRequest) o;
    return Objects.equals(this.passThroughFields, googleCloudAiplatformV1BatchReadFeatureValuesRequest.passThroughFields) &&
        Objects.equals(this.entityTypeSpecs, googleCloudAiplatformV1BatchReadFeatureValuesRequest.entityTypeSpecs) &&
        Objects.equals(this.bigqueryReadInstances, googleCloudAiplatformV1BatchReadFeatureValuesRequest.bigqueryReadInstances) &&
        Objects.equals(this.destination, googleCloudAiplatformV1BatchReadFeatureValuesRequest.destination) &&
        Objects.equals(this.startTime, googleCloudAiplatformV1BatchReadFeatureValuesRequest.startTime) &&
        Objects.equals(this.csvReadInstances, googleCloudAiplatformV1BatchReadFeatureValuesRequest.csvReadInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passThroughFields, entityTypeSpecs, bigqueryReadInstances, destination, startTime, csvReadInstances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1BatchReadFeatureValuesRequest {\n");
    sb.append("    passThroughFields: ").append(toIndentedString(passThroughFields)).append("\n");
    sb.append("    entityTypeSpecs: ").append(toIndentedString(entityTypeSpecs)).append("\n");
    sb.append("    bigqueryReadInstances: ").append(toIndentedString(bigqueryReadInstances)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    csvReadInstances: ").append(toIndentedString(csvReadInstances)).append("\n");
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
    openapiFields.add("passThroughFields");
    openapiFields.add("entityTypeSpecs");
    openapiFields.add("bigqueryReadInstances");
    openapiFields.add("destination");
    openapiFields.add("startTime");
    openapiFields.add("csvReadInstances");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1BatchReadFeatureValuesRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1BatchReadFeatureValuesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1BatchReadFeatureValuesRequest is not found in the empty JSON string", GoogleCloudAiplatformV1BatchReadFeatureValuesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1BatchReadFeatureValuesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1BatchReadFeatureValuesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("passThroughFields") != null && !jsonObj.get("passThroughFields").isJsonNull()) {
        JsonArray jsonArraypassThroughFields = jsonObj.getAsJsonArray("passThroughFields");
        if (jsonArraypassThroughFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("passThroughFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `passThroughFields` to be an array in the JSON string but got `%s`", jsonObj.get("passThroughFields").toString()));
          }

          // validate the optional field `passThroughFields` (array)
          for (int i = 0; i < jsonArraypassThroughFields.size(); i++) {
            GoogleCloudAiplatformV1BatchReadFeatureValuesRequestPassThroughField.validateJsonElement(jsonArraypassThroughFields.get(i));
          };
        }
      }
      if (jsonObj.get("entityTypeSpecs") != null && !jsonObj.get("entityTypeSpecs").isJsonNull()) {
        JsonArray jsonArrayentityTypeSpecs = jsonObj.getAsJsonArray("entityTypeSpecs");
        if (jsonArrayentityTypeSpecs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entityTypeSpecs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entityTypeSpecs` to be an array in the JSON string but got `%s`", jsonObj.get("entityTypeSpecs").toString()));
          }

          // validate the optional field `entityTypeSpecs` (array)
          for (int i = 0; i < jsonArrayentityTypeSpecs.size(); i++) {
            GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec.validateJsonElement(jsonArrayentityTypeSpecs.get(i));
          };
        }
      }
      // validate the optional field `bigqueryReadInstances`
      if (jsonObj.get("bigqueryReadInstances") != null && !jsonObj.get("bigqueryReadInstances").isJsonNull()) {
        GoogleCloudAiplatformV1BigQuerySource.validateJsonElement(jsonObj.get("bigqueryReadInstances"));
      }
      // validate the optional field `destination`
      if (jsonObj.get("destination") != null && !jsonObj.get("destination").isJsonNull()) {
        GoogleCloudAiplatformV1FeatureValueDestination.validateJsonElement(jsonObj.get("destination"));
      }
      if ((jsonObj.get("startTime") != null && !jsonObj.get("startTime").isJsonNull()) && !jsonObj.get("startTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startTime").toString()));
      }
      // validate the optional field `csvReadInstances`
      if (jsonObj.get("csvReadInstances") != null && !jsonObj.get("csvReadInstances").isJsonNull()) {
        GoogleCloudAiplatformV1CsvSource.validateJsonElement(jsonObj.get("csvReadInstances"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1BatchReadFeatureValuesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1BatchReadFeatureValuesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1BatchReadFeatureValuesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1BatchReadFeatureValuesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1BatchReadFeatureValuesRequest>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1BatchReadFeatureValuesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1BatchReadFeatureValuesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1BatchReadFeatureValuesRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1BatchReadFeatureValuesRequest
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1BatchReadFeatureValuesRequest
   */
  public static GoogleCloudAiplatformV1BatchReadFeatureValuesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1BatchReadFeatureValuesRequest.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1BatchReadFeatureValuesRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

