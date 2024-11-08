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
import org.openapitools.client.model.CloudAiLargeModelsVisionMedia;

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
 * Generate video response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class CloudAiLargeModelsVisionGenerateVideoResponse {
  public static final String SERIALIZED_NAME_RAI_MEDIA_FILTERED_REASONS = "raiMediaFilteredReasons";
  @SerializedName(SERIALIZED_NAME_RAI_MEDIA_FILTERED_REASONS)
  private List<String> raiMediaFilteredReasons = new ArrayList<>();

  public static final String SERIALIZED_NAME_RAI_MEDIA_FILTERED_COUNT = "raiMediaFilteredCount";
  @SerializedName(SERIALIZED_NAME_RAI_MEDIA_FILTERED_COUNT)
  private Integer raiMediaFilteredCount;

  public static final String SERIALIZED_NAME_GENERATED_SAMPLES = "generatedSamples";
  @SerializedName(SERIALIZED_NAME_GENERATED_SAMPLES)
  private List<CloudAiLargeModelsVisionMedia> generatedSamples = new ArrayList<>();

  public CloudAiLargeModelsVisionGenerateVideoResponse() {
  }

  public CloudAiLargeModelsVisionGenerateVideoResponse raiMediaFilteredReasons(List<String> raiMediaFilteredReasons) {
    this.raiMediaFilteredReasons = raiMediaFilteredReasons;
    return this;
  }

  public CloudAiLargeModelsVisionGenerateVideoResponse addRaiMediaFilteredReasonsItem(String raiMediaFilteredReasonsItem) {
    if (this.raiMediaFilteredReasons == null) {
      this.raiMediaFilteredReasons = new ArrayList<>();
    }
    this.raiMediaFilteredReasons.add(raiMediaFilteredReasonsItem);
    return this;
  }

  /**
   * Returns rai failure reasons if any.
   * @return raiMediaFilteredReasons
   */
  @javax.annotation.Nullable
  public List<String> getRaiMediaFilteredReasons() {
    return raiMediaFilteredReasons;
  }

  public void setRaiMediaFilteredReasons(List<String> raiMediaFilteredReasons) {
    this.raiMediaFilteredReasons = raiMediaFilteredReasons;
  }


  public CloudAiLargeModelsVisionGenerateVideoResponse raiMediaFilteredCount(Integer raiMediaFilteredCount) {
    this.raiMediaFilteredCount = raiMediaFilteredCount;
    return this;
  }

  /**
   * Returns if any videos were filtered due to RAI policies.
   * @return raiMediaFilteredCount
   */
  @javax.annotation.Nullable
  public Integer getRaiMediaFilteredCount() {
    return raiMediaFilteredCount;
  }

  public void setRaiMediaFilteredCount(Integer raiMediaFilteredCount) {
    this.raiMediaFilteredCount = raiMediaFilteredCount;
  }


  public CloudAiLargeModelsVisionGenerateVideoResponse generatedSamples(List<CloudAiLargeModelsVisionMedia> generatedSamples) {
    this.generatedSamples = generatedSamples;
    return this;
  }

  public CloudAiLargeModelsVisionGenerateVideoResponse addGeneratedSamplesItem(CloudAiLargeModelsVisionMedia generatedSamplesItem) {
    if (this.generatedSamples == null) {
      this.generatedSamples = new ArrayList<>();
    }
    this.generatedSamples.add(generatedSamplesItem);
    return this;
  }

  /**
   * The generates samples.
   * @return generatedSamples
   */
  @javax.annotation.Nullable
  public List<CloudAiLargeModelsVisionMedia> getGeneratedSamples() {
    return generatedSamples;
  }

  public void setGeneratedSamples(List<CloudAiLargeModelsVisionMedia> generatedSamples) {
    this.generatedSamples = generatedSamples;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAiLargeModelsVisionGenerateVideoResponse cloudAiLargeModelsVisionGenerateVideoResponse = (CloudAiLargeModelsVisionGenerateVideoResponse) o;
    return Objects.equals(this.raiMediaFilteredReasons, cloudAiLargeModelsVisionGenerateVideoResponse.raiMediaFilteredReasons) &&
        Objects.equals(this.raiMediaFilteredCount, cloudAiLargeModelsVisionGenerateVideoResponse.raiMediaFilteredCount) &&
        Objects.equals(this.generatedSamples, cloudAiLargeModelsVisionGenerateVideoResponse.generatedSamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raiMediaFilteredReasons, raiMediaFilteredCount, generatedSamples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAiLargeModelsVisionGenerateVideoResponse {\n");
    sb.append("    raiMediaFilteredReasons: ").append(toIndentedString(raiMediaFilteredReasons)).append("\n");
    sb.append("    raiMediaFilteredCount: ").append(toIndentedString(raiMediaFilteredCount)).append("\n");
    sb.append("    generatedSamples: ").append(toIndentedString(generatedSamples)).append("\n");
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
    openapiFields.add("raiMediaFilteredReasons");
    openapiFields.add("raiMediaFilteredCount");
    openapiFields.add("generatedSamples");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloudAiLargeModelsVisionGenerateVideoResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudAiLargeModelsVisionGenerateVideoResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudAiLargeModelsVisionGenerateVideoResponse is not found in the empty JSON string", CloudAiLargeModelsVisionGenerateVideoResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudAiLargeModelsVisionGenerateVideoResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudAiLargeModelsVisionGenerateVideoResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("raiMediaFilteredReasons") != null && !jsonObj.get("raiMediaFilteredReasons").isJsonNull() && !jsonObj.get("raiMediaFilteredReasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `raiMediaFilteredReasons` to be an array in the JSON string but got `%s`", jsonObj.get("raiMediaFilteredReasons").toString()));
      }
      if (jsonObj.get("generatedSamples") != null && !jsonObj.get("generatedSamples").isJsonNull()) {
        JsonArray jsonArraygeneratedSamples = jsonObj.getAsJsonArray("generatedSamples");
        if (jsonArraygeneratedSamples != null) {
          // ensure the json data is an array
          if (!jsonObj.get("generatedSamples").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `generatedSamples` to be an array in the JSON string but got `%s`", jsonObj.get("generatedSamples").toString()));
          }

          // validate the optional field `generatedSamples` (array)
          for (int i = 0; i < jsonArraygeneratedSamples.size(); i++) {
            CloudAiLargeModelsVisionMedia.validateJsonElement(jsonArraygeneratedSamples.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudAiLargeModelsVisionGenerateVideoResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudAiLargeModelsVisionGenerateVideoResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudAiLargeModelsVisionGenerateVideoResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudAiLargeModelsVisionGenerateVideoResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudAiLargeModelsVisionGenerateVideoResponse>() {
           @Override
           public void write(JsonWriter out, CloudAiLargeModelsVisionGenerateVideoResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudAiLargeModelsVisionGenerateVideoResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CloudAiLargeModelsVisionGenerateVideoResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloudAiLargeModelsVisionGenerateVideoResponse
   * @throws IOException if the JSON string is invalid with respect to CloudAiLargeModelsVisionGenerateVideoResponse
   */
  public static CloudAiLargeModelsVisionGenerateVideoResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudAiLargeModelsVisionGenerateVideoResponse.class);
  }

  /**
   * Convert an instance of CloudAiLargeModelsVisionGenerateVideoResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

