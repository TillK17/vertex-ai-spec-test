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
 * Represents one AnnotatedDataset in datalabeling.googleapis.com.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset {
  public static final String SERIALIZED_NAME_ANNOTATED_DATASET_DISPLAY_NAME = "annotatedDatasetDisplayName";
  @SerializedName(SERIALIZED_NAME_ANNOTATED_DATASET_DISPLAY_NAME)
  private String annotatedDatasetDisplayName;

  public static final String SERIALIZED_NAME_ANNOTATED_DATASET = "annotatedDataset";
  @SerializedName(SERIALIZED_NAME_ANNOTATED_DATASET)
  private String annotatedDataset;

  public GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset() {
  }

  public GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset annotatedDatasetDisplayName(String annotatedDatasetDisplayName) {
    this.annotatedDatasetDisplayName = annotatedDatasetDisplayName;
    return this;
  }

  /**
   * The AnnotatedDataset&#39;s display name in datalabeling.googleapis.com.
   * @return annotatedDatasetDisplayName
   */
  @javax.annotation.Nullable
  public String getAnnotatedDatasetDisplayName() {
    return annotatedDatasetDisplayName;
  }

  public void setAnnotatedDatasetDisplayName(String annotatedDatasetDisplayName) {
    this.annotatedDatasetDisplayName = annotatedDatasetDisplayName;
  }


  public GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset annotatedDataset(String annotatedDataset) {
    this.annotatedDataset = annotatedDataset;
    return this;
  }

  /**
   * Full resource name of data labeling AnnotatedDataset. Format: &#x60;projects/{project}/datasets/{dataset}/annotatedDatasets/{annotated_dataset}&#x60;.
   * @return annotatedDataset
   */
  @javax.annotation.Nullable
  public String getAnnotatedDataset() {
    return annotatedDataset;
  }

  public void setAnnotatedDataset(String annotatedDataset) {
    this.annotatedDataset = annotatedDataset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset googleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset = (GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset) o;
    return Objects.equals(this.annotatedDatasetDisplayName, googleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset.annotatedDatasetDisplayName) &&
        Objects.equals(this.annotatedDataset, googleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset.annotatedDataset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotatedDatasetDisplayName, annotatedDataset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset {\n");
    sb.append("    annotatedDatasetDisplayName: ").append(toIndentedString(annotatedDatasetDisplayName)).append("\n");
    sb.append("    annotatedDataset: ").append(toIndentedString(annotatedDataset)).append("\n");
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
    openapiFields.add("annotatedDatasetDisplayName");
    openapiFields.add("annotatedDataset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset is not found in the empty JSON string", GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("annotatedDatasetDisplayName") != null && !jsonObj.get("annotatedDatasetDisplayName").isJsonNull()) && !jsonObj.get("annotatedDatasetDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `annotatedDatasetDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("annotatedDatasetDisplayName").toString()));
      }
      if ((jsonObj.get("annotatedDataset") != null && !jsonObj.get("annotatedDataset").isJsonNull()) && !jsonObj.get("annotatedDataset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `annotatedDataset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("annotatedDataset").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset
   */
  public static GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1MigratableResourceDataLabelingDatasetDataLabelingAnnotatedDataset to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
