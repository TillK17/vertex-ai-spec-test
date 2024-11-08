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
 * The metadata of Datasets that contain Video DataItems.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaVideoDatasetMetadata {
  public static final String SERIALIZED_NAME_GCS_BUCKET = "gcsBucket";
  @SerializedName(SERIALIZED_NAME_GCS_BUCKET)
  private String gcsBucket;

  public static final String SERIALIZED_NAME_DATA_ITEM_SCHEMA_URI = "dataItemSchemaUri";
  @SerializedName(SERIALIZED_NAME_DATA_ITEM_SCHEMA_URI)
  private String dataItemSchemaUri;

  public GoogleCloudAiplatformV1SchemaVideoDatasetMetadata() {
  }

  public GoogleCloudAiplatformV1SchemaVideoDatasetMetadata gcsBucket(String gcsBucket) {
    this.gcsBucket = gcsBucket;
    return this;
  }

  /**
   * Google Cloud Storage Bucket name that contains the blob data of this Dataset.
   * @return gcsBucket
   */
  @javax.annotation.Nullable
  public String getGcsBucket() {
    return gcsBucket;
  }

  public void setGcsBucket(String gcsBucket) {
    this.gcsBucket = gcsBucket;
  }


  public GoogleCloudAiplatformV1SchemaVideoDatasetMetadata dataItemSchemaUri(String dataItemSchemaUri) {
    this.dataItemSchemaUri = dataItemSchemaUri;
    return this;
  }

  /**
   * Points to a YAML file stored on Google Cloud Storage describing payload of the Video DataItems that belong to this Dataset.
   * @return dataItemSchemaUri
   */
  @javax.annotation.Nullable
  public String getDataItemSchemaUri() {
    return dataItemSchemaUri;
  }

  public void setDataItemSchemaUri(String dataItemSchemaUri) {
    this.dataItemSchemaUri = dataItemSchemaUri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaVideoDatasetMetadata googleCloudAiplatformV1SchemaVideoDatasetMetadata = (GoogleCloudAiplatformV1SchemaVideoDatasetMetadata) o;
    return Objects.equals(this.gcsBucket, googleCloudAiplatformV1SchemaVideoDatasetMetadata.gcsBucket) &&
        Objects.equals(this.dataItemSchemaUri, googleCloudAiplatformV1SchemaVideoDatasetMetadata.dataItemSchemaUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcsBucket, dataItemSchemaUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaVideoDatasetMetadata {\n");
    sb.append("    gcsBucket: ").append(toIndentedString(gcsBucket)).append("\n");
    sb.append("    dataItemSchemaUri: ").append(toIndentedString(dataItemSchemaUri)).append("\n");
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
    openapiFields.add("gcsBucket");
    openapiFields.add("dataItemSchemaUri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaVideoDatasetMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaVideoDatasetMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaVideoDatasetMetadata is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaVideoDatasetMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaVideoDatasetMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaVideoDatasetMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("gcsBucket") != null && !jsonObj.get("gcsBucket").isJsonNull()) && !jsonObj.get("gcsBucket").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gcsBucket` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gcsBucket").toString()));
      }
      if ((jsonObj.get("dataItemSchemaUri") != null && !jsonObj.get("dataItemSchemaUri").isJsonNull()) && !jsonObj.get("dataItemSchemaUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataItemSchemaUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataItemSchemaUri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaVideoDatasetMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaVideoDatasetMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaVideoDatasetMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaVideoDatasetMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaVideoDatasetMetadata>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaVideoDatasetMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaVideoDatasetMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaVideoDatasetMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaVideoDatasetMetadata
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaVideoDatasetMetadata
   */
  public static GoogleCloudAiplatformV1SchemaVideoDatasetMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaVideoDatasetMetadata.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaVideoDatasetMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

