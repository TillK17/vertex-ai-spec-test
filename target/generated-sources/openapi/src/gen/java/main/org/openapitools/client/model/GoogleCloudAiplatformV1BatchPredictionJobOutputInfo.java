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
 * Further describes this job&#39;s output. Supplements output_config.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1BatchPredictionJobOutputInfo {
  public static final String SERIALIZED_NAME_BIGQUERY_OUTPUT_TABLE = "bigqueryOutputTable";
  @SerializedName(SERIALIZED_NAME_BIGQUERY_OUTPUT_TABLE)
  private String bigqueryOutputTable;

  public static final String SERIALIZED_NAME_BIGQUERY_OUTPUT_DATASET = "bigqueryOutputDataset";
  @SerializedName(SERIALIZED_NAME_BIGQUERY_OUTPUT_DATASET)
  private String bigqueryOutputDataset;

  public static final String SERIALIZED_NAME_GCS_OUTPUT_DIRECTORY = "gcsOutputDirectory";
  @SerializedName(SERIALIZED_NAME_GCS_OUTPUT_DIRECTORY)
  private String gcsOutputDirectory;

  public GoogleCloudAiplatformV1BatchPredictionJobOutputInfo() {
  }

  public GoogleCloudAiplatformV1BatchPredictionJobOutputInfo(
     String bigqueryOutputTable, 
     String bigqueryOutputDataset, 
     String gcsOutputDirectory
  ) {
    this();
    this.bigqueryOutputTable = bigqueryOutputTable;
    this.bigqueryOutputDataset = bigqueryOutputDataset;
    this.gcsOutputDirectory = gcsOutputDirectory;
  }

  /**
   * Output only. The name of the BigQuery table created, in &#x60;predictions_&#x60; format, into which the prediction output is written. Can be used by UI to generate the BigQuery output path, for example.
   * @return bigqueryOutputTable
   */
  @javax.annotation.Nullable
  public String getBigqueryOutputTable() {
    return bigqueryOutputTable;
  }



  /**
   * Output only. The path of the BigQuery dataset created, in &#x60;bq://projectId.bqDatasetId&#x60; format, into which the prediction output is written.
   * @return bigqueryOutputDataset
   */
  @javax.annotation.Nullable
  public String getBigqueryOutputDataset() {
    return bigqueryOutputDataset;
  }



  /**
   * Output only. The full path of the Cloud Storage directory created, into which the prediction output is written.
   * @return gcsOutputDirectory
   */
  @javax.annotation.Nullable
  public String getGcsOutputDirectory() {
    return gcsOutputDirectory;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1BatchPredictionJobOutputInfo googleCloudAiplatformV1BatchPredictionJobOutputInfo = (GoogleCloudAiplatformV1BatchPredictionJobOutputInfo) o;
    return Objects.equals(this.bigqueryOutputTable, googleCloudAiplatformV1BatchPredictionJobOutputInfo.bigqueryOutputTable) &&
        Objects.equals(this.bigqueryOutputDataset, googleCloudAiplatformV1BatchPredictionJobOutputInfo.bigqueryOutputDataset) &&
        Objects.equals(this.gcsOutputDirectory, googleCloudAiplatformV1BatchPredictionJobOutputInfo.gcsOutputDirectory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bigqueryOutputTable, bigqueryOutputDataset, gcsOutputDirectory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1BatchPredictionJobOutputInfo {\n");
    sb.append("    bigqueryOutputTable: ").append(toIndentedString(bigqueryOutputTable)).append("\n");
    sb.append("    bigqueryOutputDataset: ").append(toIndentedString(bigqueryOutputDataset)).append("\n");
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
    openapiFields.add("bigqueryOutputTable");
    openapiFields.add("bigqueryOutputDataset");
    openapiFields.add("gcsOutputDirectory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1BatchPredictionJobOutputInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1BatchPredictionJobOutputInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1BatchPredictionJobOutputInfo is not found in the empty JSON string", GoogleCloudAiplatformV1BatchPredictionJobOutputInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1BatchPredictionJobOutputInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1BatchPredictionJobOutputInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bigqueryOutputTable") != null && !jsonObj.get("bigqueryOutputTable").isJsonNull()) && !jsonObj.get("bigqueryOutputTable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bigqueryOutputTable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bigqueryOutputTable").toString()));
      }
      if ((jsonObj.get("bigqueryOutputDataset") != null && !jsonObj.get("bigqueryOutputDataset").isJsonNull()) && !jsonObj.get("bigqueryOutputDataset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bigqueryOutputDataset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bigqueryOutputDataset").toString()));
      }
      if ((jsonObj.get("gcsOutputDirectory") != null && !jsonObj.get("gcsOutputDirectory").isJsonNull()) && !jsonObj.get("gcsOutputDirectory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gcsOutputDirectory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gcsOutputDirectory").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1BatchPredictionJobOutputInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1BatchPredictionJobOutputInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1BatchPredictionJobOutputInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1BatchPredictionJobOutputInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1BatchPredictionJobOutputInfo>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1BatchPredictionJobOutputInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1BatchPredictionJobOutputInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1BatchPredictionJobOutputInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1BatchPredictionJobOutputInfo
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1BatchPredictionJobOutputInfo
   */
  public static GoogleCloudAiplatformV1BatchPredictionJobOutputInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1BatchPredictionJobOutputInfo.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1BatchPredictionJobOutputInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
