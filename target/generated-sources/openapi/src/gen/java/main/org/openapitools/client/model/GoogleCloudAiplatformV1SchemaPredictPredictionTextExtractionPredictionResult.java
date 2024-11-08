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
 * Prediction output format for Text Extraction.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult {
  public static final String SERIALIZED_NAME_TEXT_SEGMENT_END_OFFSETS = "textSegmentEndOffsets";
  @SerializedName(SERIALIZED_NAME_TEXT_SEGMENT_END_OFFSETS)
  private List<String> textSegmentEndOffsets = new ArrayList<>();

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<String> ids = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONFIDENCES = "confidences";
  @SerializedName(SERIALIZED_NAME_CONFIDENCES)
  private List<Float> confidences = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEXT_SEGMENT_START_OFFSETS = "textSegmentStartOffsets";
  @SerializedName(SERIALIZED_NAME_TEXT_SEGMENT_START_OFFSETS)
  private List<String> textSegmentStartOffsets = new ArrayList<>();

  public static final String SERIALIZED_NAME_DISPLAY_NAMES = "displayNames";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAMES)
  private List<String> displayNames = new ArrayList<>();

  public GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult() {
  }

  public GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult textSegmentEndOffsets(List<String> textSegmentEndOffsets) {
    this.textSegmentEndOffsets = textSegmentEndOffsets;
    return this;
  }

  public GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult addTextSegmentEndOffsetsItem(String textSegmentEndOffsetsItem) {
    if (this.textSegmentEndOffsets == null) {
      this.textSegmentEndOffsets = new ArrayList<>();
    }
    this.textSegmentEndOffsets.add(textSegmentEndOffsetsItem);
    return this;
  }

  /**
   * The end offsets, inclusive, of the text segment in which the AnnotationSpec has been identified. Expressed as a zero-based number of characters as measured from the start of the text snippet.
   * @return textSegmentEndOffsets
   */
  @javax.annotation.Nullable
  public List<String> getTextSegmentEndOffsets() {
    return textSegmentEndOffsets;
  }

  public void setTextSegmentEndOffsets(List<String> textSegmentEndOffsets) {
    this.textSegmentEndOffsets = textSegmentEndOffsets;
  }


  public GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * The resource IDs of the AnnotationSpecs that had been identified, ordered by the confidence score descendingly.
   * @return ids
   */
  @javax.annotation.Nullable
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  public GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult confidences(List<Float> confidences) {
    this.confidences = confidences;
    return this;
  }

  public GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult addConfidencesItem(Float confidencesItem) {
    if (this.confidences == null) {
      this.confidences = new ArrayList<>();
    }
    this.confidences.add(confidencesItem);
    return this;
  }

  /**
   * The Model&#39;s confidences in correctness of the predicted IDs, higher value means higher confidence. Order matches the Ids.
   * @return confidences
   */
  @javax.annotation.Nullable
  public List<Float> getConfidences() {
    return confidences;
  }

  public void setConfidences(List<Float> confidences) {
    this.confidences = confidences;
  }


  public GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult textSegmentStartOffsets(List<String> textSegmentStartOffsets) {
    this.textSegmentStartOffsets = textSegmentStartOffsets;
    return this;
  }

  public GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult addTextSegmentStartOffsetsItem(String textSegmentStartOffsetsItem) {
    if (this.textSegmentStartOffsets == null) {
      this.textSegmentStartOffsets = new ArrayList<>();
    }
    this.textSegmentStartOffsets.add(textSegmentStartOffsetsItem);
    return this;
  }

  /**
   * The start offsets, inclusive, of the text segment in which the AnnotationSpec has been identified. Expressed as a zero-based number of characters as measured from the start of the text snippet.
   * @return textSegmentStartOffsets
   */
  @javax.annotation.Nullable
  public List<String> getTextSegmentStartOffsets() {
    return textSegmentStartOffsets;
  }

  public void setTextSegmentStartOffsets(List<String> textSegmentStartOffsets) {
    this.textSegmentStartOffsets = textSegmentStartOffsets;
  }


  public GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult displayNames(List<String> displayNames) {
    this.displayNames = displayNames;
    return this;
  }

  public GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult addDisplayNamesItem(String displayNamesItem) {
    if (this.displayNames == null) {
      this.displayNames = new ArrayList<>();
    }
    this.displayNames.add(displayNamesItem);
    return this;
  }

  /**
   * The display names of the AnnotationSpecs that had been identified, order matches the IDs.
   * @return displayNames
   */
  @javax.annotation.Nullable
  public List<String> getDisplayNames() {
    return displayNames;
  }

  public void setDisplayNames(List<String> displayNames) {
    this.displayNames = displayNames;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult googleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult = (GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult) o;
    return Objects.equals(this.textSegmentEndOffsets, googleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult.textSegmentEndOffsets) &&
        Objects.equals(this.ids, googleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult.ids) &&
        Objects.equals(this.confidences, googleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult.confidences) &&
        Objects.equals(this.textSegmentStartOffsets, googleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult.textSegmentStartOffsets) &&
        Objects.equals(this.displayNames, googleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult.displayNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textSegmentEndOffsets, ids, confidences, textSegmentStartOffsets, displayNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult {\n");
    sb.append("    textSegmentEndOffsets: ").append(toIndentedString(textSegmentEndOffsets)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    confidences: ").append(toIndentedString(confidences)).append("\n");
    sb.append("    textSegmentStartOffsets: ").append(toIndentedString(textSegmentStartOffsets)).append("\n");
    sb.append("    displayNames: ").append(toIndentedString(displayNames)).append("\n");
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
    openapiFields.add("textSegmentEndOffsets");
    openapiFields.add("ids");
    openapiFields.add("confidences");
    openapiFields.add("textSegmentStartOffsets");
    openapiFields.add("displayNames");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("textSegmentEndOffsets") != null && !jsonObj.get("textSegmentEndOffsets").isJsonNull() && !jsonObj.get("textSegmentEndOffsets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `textSegmentEndOffsets` to be an array in the JSON string but got `%s`", jsonObj.get("textSegmentEndOffsets").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ids") != null && !jsonObj.get("ids").isJsonNull() && !jsonObj.get("ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids` to be an array in the JSON string but got `%s`", jsonObj.get("ids").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("confidences") != null && !jsonObj.get("confidences").isJsonNull() && !jsonObj.get("confidences").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `confidences` to be an array in the JSON string but got `%s`", jsonObj.get("confidences").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("textSegmentStartOffsets") != null && !jsonObj.get("textSegmentStartOffsets").isJsonNull() && !jsonObj.get("textSegmentStartOffsets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `textSegmentStartOffsets` to be an array in the JSON string but got `%s`", jsonObj.get("textSegmentStartOffsets").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("displayNames") != null && !jsonObj.get("displayNames").isJsonNull() && !jsonObj.get("displayNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayNames` to be an array in the JSON string but got `%s`", jsonObj.get("displayNames").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult
   */
  public static GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaPredictPredictionTextExtractionPredictionResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

