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
import org.openapitools.client.model.GoogleCloudAiplatformV1VertexRagStoreRagResource;

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
 * Retrieve from Vertex RAG Store for grounding.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1VertexRagStore {
  public static final String SERIALIZED_NAME_SIMILARITY_TOP_K = "similarityTopK";
  @SerializedName(SERIALIZED_NAME_SIMILARITY_TOP_K)
  private Integer similarityTopK;

  public static final String SERIALIZED_NAME_RAG_RESOURCES = "ragResources";
  @SerializedName(SERIALIZED_NAME_RAG_RESOURCES)
  private List<GoogleCloudAiplatformV1VertexRagStoreRagResource> ragResources = new ArrayList<>();

  public static final String SERIALIZED_NAME_VECTOR_DISTANCE_THRESHOLD = "vectorDistanceThreshold";
  @SerializedName(SERIALIZED_NAME_VECTOR_DISTANCE_THRESHOLD)
  private Double vectorDistanceThreshold;

  public static final String SERIALIZED_NAME_RAG_CORPORA = "ragCorpora";
  @SerializedName(SERIALIZED_NAME_RAG_CORPORA)
  private List<String> ragCorpora = new ArrayList<>();

  public GoogleCloudAiplatformV1VertexRagStore() {
  }

  public GoogleCloudAiplatformV1VertexRagStore similarityTopK(Integer similarityTopK) {
    this.similarityTopK = similarityTopK;
    return this;
  }

  /**
   * Optional. Number of top k results to return from the selected corpora.
   * @return similarityTopK
   */
  @javax.annotation.Nullable
  public Integer getSimilarityTopK() {
    return similarityTopK;
  }

  public void setSimilarityTopK(Integer similarityTopK) {
    this.similarityTopK = similarityTopK;
  }


  public GoogleCloudAiplatformV1VertexRagStore ragResources(List<GoogleCloudAiplatformV1VertexRagStoreRagResource> ragResources) {
    this.ragResources = ragResources;
    return this;
  }

  public GoogleCloudAiplatformV1VertexRagStore addRagResourcesItem(GoogleCloudAiplatformV1VertexRagStoreRagResource ragResourcesItem) {
    if (this.ragResources == null) {
      this.ragResources = new ArrayList<>();
    }
    this.ragResources.add(ragResourcesItem);
    return this;
  }

  /**
   * Optional. The representation of the rag source. It can be used to specify corpus only or ragfiles. Currently only support one corpus or multiple files from one corpus. In the future we may open up multiple corpora support.
   * @return ragResources
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1VertexRagStoreRagResource> getRagResources() {
    return ragResources;
  }

  public void setRagResources(List<GoogleCloudAiplatformV1VertexRagStoreRagResource> ragResources) {
    this.ragResources = ragResources;
  }


  public GoogleCloudAiplatformV1VertexRagStore vectorDistanceThreshold(Double vectorDistanceThreshold) {
    this.vectorDistanceThreshold = vectorDistanceThreshold;
    return this;
  }

  /**
   * Optional. Only return results with vector distance smaller than the threshold.
   * @return vectorDistanceThreshold
   */
  @javax.annotation.Nullable
  public Double getVectorDistanceThreshold() {
    return vectorDistanceThreshold;
  }

  public void setVectorDistanceThreshold(Double vectorDistanceThreshold) {
    this.vectorDistanceThreshold = vectorDistanceThreshold;
  }


  public GoogleCloudAiplatformV1VertexRagStore ragCorpora(List<String> ragCorpora) {
    this.ragCorpora = ragCorpora;
    return this;
  }

  public GoogleCloudAiplatformV1VertexRagStore addRagCorporaItem(String ragCorporaItem) {
    if (this.ragCorpora == null) {
      this.ragCorpora = new ArrayList<>();
    }
    this.ragCorpora.add(ragCorporaItem);
    return this;
  }

  /**
   * Optional. Deprecated. Please use rag_resources instead.
   * @return ragCorpora
   */
  @javax.annotation.Nullable
  public List<String> getRagCorpora() {
    return ragCorpora;
  }

  public void setRagCorpora(List<String> ragCorpora) {
    this.ragCorpora = ragCorpora;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1VertexRagStore googleCloudAiplatformV1VertexRagStore = (GoogleCloudAiplatformV1VertexRagStore) o;
    return Objects.equals(this.similarityTopK, googleCloudAiplatformV1VertexRagStore.similarityTopK) &&
        Objects.equals(this.ragResources, googleCloudAiplatformV1VertexRagStore.ragResources) &&
        Objects.equals(this.vectorDistanceThreshold, googleCloudAiplatformV1VertexRagStore.vectorDistanceThreshold) &&
        Objects.equals(this.ragCorpora, googleCloudAiplatformV1VertexRagStore.ragCorpora);
  }

  @Override
  public int hashCode() {
    return Objects.hash(similarityTopK, ragResources, vectorDistanceThreshold, ragCorpora);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1VertexRagStore {\n");
    sb.append("    similarityTopK: ").append(toIndentedString(similarityTopK)).append("\n");
    sb.append("    ragResources: ").append(toIndentedString(ragResources)).append("\n");
    sb.append("    vectorDistanceThreshold: ").append(toIndentedString(vectorDistanceThreshold)).append("\n");
    sb.append("    ragCorpora: ").append(toIndentedString(ragCorpora)).append("\n");
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
    openapiFields.add("similarityTopK");
    openapiFields.add("ragResources");
    openapiFields.add("vectorDistanceThreshold");
    openapiFields.add("ragCorpora");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1VertexRagStore
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1VertexRagStore.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1VertexRagStore is not found in the empty JSON string", GoogleCloudAiplatformV1VertexRagStore.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1VertexRagStore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1VertexRagStore` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("ragResources") != null && !jsonObj.get("ragResources").isJsonNull()) {
        JsonArray jsonArrayragResources = jsonObj.getAsJsonArray("ragResources");
        if (jsonArrayragResources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ragResources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ragResources` to be an array in the JSON string but got `%s`", jsonObj.get("ragResources").toString()));
          }

          // validate the optional field `ragResources` (array)
          for (int i = 0; i < jsonArrayragResources.size(); i++) {
            GoogleCloudAiplatformV1VertexRagStoreRagResource.validateJsonElement(jsonArrayragResources.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ragCorpora") != null && !jsonObj.get("ragCorpora").isJsonNull() && !jsonObj.get("ragCorpora").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ragCorpora` to be an array in the JSON string but got `%s`", jsonObj.get("ragCorpora").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1VertexRagStore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1VertexRagStore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1VertexRagStore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1VertexRagStore.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1VertexRagStore>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1VertexRagStore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1VertexRagStore read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1VertexRagStore given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1VertexRagStore
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1VertexRagStore
   */
  public static GoogleCloudAiplatformV1VertexRagStore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1VertexRagStore.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1VertexRagStore to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
