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
import org.openapitools.client.model.GoogleCloudAiplatformV1Segment;

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
 * Grounding support.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1GroundingSupport {
  public static final String SERIALIZED_NAME_CONFIDENCE_SCORES = "confidenceScores";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE_SCORES)
  private List<Float> confidenceScores = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUNDING_CHUNK_INDICES = "groundingChunkIndices";
  @SerializedName(SERIALIZED_NAME_GROUNDING_CHUNK_INDICES)
  private List<Integer> groundingChunkIndices = new ArrayList<>();

  public static final String SERIALIZED_NAME_SEGMENT = "segment";
  @SerializedName(SERIALIZED_NAME_SEGMENT)
  private GoogleCloudAiplatformV1Segment segment;

  public GoogleCloudAiplatformV1GroundingSupport() {
  }

  public GoogleCloudAiplatformV1GroundingSupport confidenceScores(List<Float> confidenceScores) {
    this.confidenceScores = confidenceScores;
    return this;
  }

  public GoogleCloudAiplatformV1GroundingSupport addConfidenceScoresItem(Float confidenceScoresItem) {
    if (this.confidenceScores == null) {
      this.confidenceScores = new ArrayList<>();
    }
    this.confidenceScores.add(confidenceScoresItem);
    return this;
  }

  /**
   * Confidence score of the support references. Ranges from 0 to 1. 1 is the most confident. This list must have the same size as the grounding_chunk_indices.
   * @return confidenceScores
   */
  @javax.annotation.Nullable
  public List<Float> getConfidenceScores() {
    return confidenceScores;
  }

  public void setConfidenceScores(List<Float> confidenceScores) {
    this.confidenceScores = confidenceScores;
  }


  public GoogleCloudAiplatformV1GroundingSupport groundingChunkIndices(List<Integer> groundingChunkIndices) {
    this.groundingChunkIndices = groundingChunkIndices;
    return this;
  }

  public GoogleCloudAiplatformV1GroundingSupport addGroundingChunkIndicesItem(Integer groundingChunkIndicesItem) {
    if (this.groundingChunkIndices == null) {
      this.groundingChunkIndices = new ArrayList<>();
    }
    this.groundingChunkIndices.add(groundingChunkIndicesItem);
    return this;
  }

  /**
   * A list of indices (into &#39;grounding_chunk&#39;) specifying the citations associated with the claim. For instance [1,3,4] means that grounding_chunk[1], grounding_chunk[3], grounding_chunk[4] are the retrieved content attributed to the claim.
   * @return groundingChunkIndices
   */
  @javax.annotation.Nullable
  public List<Integer> getGroundingChunkIndices() {
    return groundingChunkIndices;
  }

  public void setGroundingChunkIndices(List<Integer> groundingChunkIndices) {
    this.groundingChunkIndices = groundingChunkIndices;
  }


  public GoogleCloudAiplatformV1GroundingSupport segment(GoogleCloudAiplatformV1Segment segment) {
    this.segment = segment;
    return this;
  }

  /**
   * Segment of the content this support belongs to.
   * @return segment
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1Segment getSegment() {
    return segment;
  }

  public void setSegment(GoogleCloudAiplatformV1Segment segment) {
    this.segment = segment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1GroundingSupport googleCloudAiplatformV1GroundingSupport = (GoogleCloudAiplatformV1GroundingSupport) o;
    return Objects.equals(this.confidenceScores, googleCloudAiplatformV1GroundingSupport.confidenceScores) &&
        Objects.equals(this.groundingChunkIndices, googleCloudAiplatformV1GroundingSupport.groundingChunkIndices) &&
        Objects.equals(this.segment, googleCloudAiplatformV1GroundingSupport.segment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidenceScores, groundingChunkIndices, segment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1GroundingSupport {\n");
    sb.append("    confidenceScores: ").append(toIndentedString(confidenceScores)).append("\n");
    sb.append("    groundingChunkIndices: ").append(toIndentedString(groundingChunkIndices)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
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
    openapiFields.add("confidenceScores");
    openapiFields.add("groundingChunkIndices");
    openapiFields.add("segment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1GroundingSupport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1GroundingSupport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1GroundingSupport is not found in the empty JSON string", GoogleCloudAiplatformV1GroundingSupport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1GroundingSupport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1GroundingSupport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("confidenceScores") != null && !jsonObj.get("confidenceScores").isJsonNull() && !jsonObj.get("confidenceScores").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `confidenceScores` to be an array in the JSON string but got `%s`", jsonObj.get("confidenceScores").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groundingChunkIndices") != null && !jsonObj.get("groundingChunkIndices").isJsonNull() && !jsonObj.get("groundingChunkIndices").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groundingChunkIndices` to be an array in the JSON string but got `%s`", jsonObj.get("groundingChunkIndices").toString()));
      }
      // validate the optional field `segment`
      if (jsonObj.get("segment") != null && !jsonObj.get("segment").isJsonNull()) {
        GoogleCloudAiplatformV1Segment.validateJsonElement(jsonObj.get("segment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1GroundingSupport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1GroundingSupport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1GroundingSupport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1GroundingSupport.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1GroundingSupport>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1GroundingSupport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1GroundingSupport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1GroundingSupport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1GroundingSupport
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1GroundingSupport
   */
  public static GoogleCloudAiplatformV1GroundingSupport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1GroundingSupport.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1GroundingSupport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
