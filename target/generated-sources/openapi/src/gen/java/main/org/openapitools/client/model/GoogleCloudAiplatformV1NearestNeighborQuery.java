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
import org.openapitools.client.model.GoogleCloudAiplatformV1NearestNeighborQueryEmbedding;
import org.openapitools.client.model.GoogleCloudAiplatformV1NearestNeighborQueryNumericFilter;
import org.openapitools.client.model.GoogleCloudAiplatformV1NearestNeighborQueryParameters;
import org.openapitools.client.model.GoogleCloudAiplatformV1NearestNeighborQueryStringFilter;

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
 * A query to find a number of similar entities.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1NearestNeighborQuery {
  public static final String SERIALIZED_NAME_EMBEDDING = "embedding";
  @SerializedName(SERIALIZED_NAME_EMBEDDING)
  private GoogleCloudAiplatformV1NearestNeighborQueryEmbedding embedding;

  public static final String SERIALIZED_NAME_NEIGHBOR_COUNT = "neighborCount";
  @SerializedName(SERIALIZED_NAME_NEIGHBOR_COUNT)
  private Integer neighborCount;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private GoogleCloudAiplatformV1NearestNeighborQueryParameters parameters;

  public static final String SERIALIZED_NAME_PER_CROWDING_ATTRIBUTE_NEIGHBOR_COUNT = "perCrowdingAttributeNeighborCount";
  @SerializedName(SERIALIZED_NAME_PER_CROWDING_ATTRIBUTE_NEIGHBOR_COUNT)
  private Integer perCrowdingAttributeNeighborCount;

  public static final String SERIALIZED_NAME_STRING_FILTERS = "stringFilters";
  @SerializedName(SERIALIZED_NAME_STRING_FILTERS)
  private List<GoogleCloudAiplatformV1NearestNeighborQueryStringFilter> stringFilters = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_NUMERIC_FILTERS = "numericFilters";
  @SerializedName(SERIALIZED_NAME_NUMERIC_FILTERS)
  private List<GoogleCloudAiplatformV1NearestNeighborQueryNumericFilter> numericFilters = new ArrayList<>();

  public GoogleCloudAiplatformV1NearestNeighborQuery() {
  }

  public GoogleCloudAiplatformV1NearestNeighborQuery embedding(GoogleCloudAiplatformV1NearestNeighborQueryEmbedding embedding) {
    this.embedding = embedding;
    return this;
  }

  /**
   * Optional. The embedding vector that be used for similar search.
   * @return embedding
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1NearestNeighborQueryEmbedding getEmbedding() {
    return embedding;
  }

  public void setEmbedding(GoogleCloudAiplatformV1NearestNeighborQueryEmbedding embedding) {
    this.embedding = embedding;
  }


  public GoogleCloudAiplatformV1NearestNeighborQuery neighborCount(Integer neighborCount) {
    this.neighborCount = neighborCount;
    return this;
  }

  /**
   * Optional. The number of similar entities to be retrieved from feature view for each query.
   * @return neighborCount
   */
  @javax.annotation.Nullable
  public Integer getNeighborCount() {
    return neighborCount;
  }

  public void setNeighborCount(Integer neighborCount) {
    this.neighborCount = neighborCount;
  }


  public GoogleCloudAiplatformV1NearestNeighborQuery parameters(GoogleCloudAiplatformV1NearestNeighborQueryParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Optional. Parameters that can be set to tune query on the fly.
   * @return parameters
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1NearestNeighborQueryParameters getParameters() {
    return parameters;
  }

  public void setParameters(GoogleCloudAiplatformV1NearestNeighborQueryParameters parameters) {
    this.parameters = parameters;
  }


  public GoogleCloudAiplatformV1NearestNeighborQuery perCrowdingAttributeNeighborCount(Integer perCrowdingAttributeNeighborCount) {
    this.perCrowdingAttributeNeighborCount = perCrowdingAttributeNeighborCount;
    return this;
  }

  /**
   * Optional. Crowding is a constraint on a neighbor list produced by nearest neighbor search requiring that no more than sper_crowding_attribute_neighbor_count of the k neighbors returned have the same value of crowding_attribute. It&#39;s used for improving result diversity.
   * @return perCrowdingAttributeNeighborCount
   */
  @javax.annotation.Nullable
  public Integer getPerCrowdingAttributeNeighborCount() {
    return perCrowdingAttributeNeighborCount;
  }

  public void setPerCrowdingAttributeNeighborCount(Integer perCrowdingAttributeNeighborCount) {
    this.perCrowdingAttributeNeighborCount = perCrowdingAttributeNeighborCount;
  }


  public GoogleCloudAiplatformV1NearestNeighborQuery stringFilters(List<GoogleCloudAiplatformV1NearestNeighborQueryStringFilter> stringFilters) {
    this.stringFilters = stringFilters;
    return this;
  }

  public GoogleCloudAiplatformV1NearestNeighborQuery addStringFiltersItem(GoogleCloudAiplatformV1NearestNeighborQueryStringFilter stringFiltersItem) {
    if (this.stringFilters == null) {
      this.stringFilters = new ArrayList<>();
    }
    this.stringFilters.add(stringFiltersItem);
    return this;
  }

  /**
   * Optional. The list of string filters.
   * @return stringFilters
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1NearestNeighborQueryStringFilter> getStringFilters() {
    return stringFilters;
  }

  public void setStringFilters(List<GoogleCloudAiplatformV1NearestNeighborQueryStringFilter> stringFilters) {
    this.stringFilters = stringFilters;
  }


  public GoogleCloudAiplatformV1NearestNeighborQuery entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Optional. The entity id whose similar entities should be searched for. If embedding is set, search will use embedding instead of entity_id.
   * @return entityId
   */
  @javax.annotation.Nullable
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public GoogleCloudAiplatformV1NearestNeighborQuery numericFilters(List<GoogleCloudAiplatformV1NearestNeighborQueryNumericFilter> numericFilters) {
    this.numericFilters = numericFilters;
    return this;
  }

  public GoogleCloudAiplatformV1NearestNeighborQuery addNumericFiltersItem(GoogleCloudAiplatformV1NearestNeighborQueryNumericFilter numericFiltersItem) {
    if (this.numericFilters == null) {
      this.numericFilters = new ArrayList<>();
    }
    this.numericFilters.add(numericFiltersItem);
    return this;
  }

  /**
   * Optional. The list of numeric filters.
   * @return numericFilters
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1NearestNeighborQueryNumericFilter> getNumericFilters() {
    return numericFilters;
  }

  public void setNumericFilters(List<GoogleCloudAiplatformV1NearestNeighborQueryNumericFilter> numericFilters) {
    this.numericFilters = numericFilters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1NearestNeighborQuery googleCloudAiplatformV1NearestNeighborQuery = (GoogleCloudAiplatformV1NearestNeighborQuery) o;
    return Objects.equals(this.embedding, googleCloudAiplatformV1NearestNeighborQuery.embedding) &&
        Objects.equals(this.neighborCount, googleCloudAiplatformV1NearestNeighborQuery.neighborCount) &&
        Objects.equals(this.parameters, googleCloudAiplatformV1NearestNeighborQuery.parameters) &&
        Objects.equals(this.perCrowdingAttributeNeighborCount, googleCloudAiplatformV1NearestNeighborQuery.perCrowdingAttributeNeighborCount) &&
        Objects.equals(this.stringFilters, googleCloudAiplatformV1NearestNeighborQuery.stringFilters) &&
        Objects.equals(this.entityId, googleCloudAiplatformV1NearestNeighborQuery.entityId) &&
        Objects.equals(this.numericFilters, googleCloudAiplatformV1NearestNeighborQuery.numericFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedding, neighborCount, parameters, perCrowdingAttributeNeighborCount, stringFilters, entityId, numericFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1NearestNeighborQuery {\n");
    sb.append("    embedding: ").append(toIndentedString(embedding)).append("\n");
    sb.append("    neighborCount: ").append(toIndentedString(neighborCount)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    perCrowdingAttributeNeighborCount: ").append(toIndentedString(perCrowdingAttributeNeighborCount)).append("\n");
    sb.append("    stringFilters: ").append(toIndentedString(stringFilters)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    numericFilters: ").append(toIndentedString(numericFilters)).append("\n");
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
    openapiFields.add("embedding");
    openapiFields.add("neighborCount");
    openapiFields.add("parameters");
    openapiFields.add("perCrowdingAttributeNeighborCount");
    openapiFields.add("stringFilters");
    openapiFields.add("entityId");
    openapiFields.add("numericFilters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1NearestNeighborQuery
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1NearestNeighborQuery.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1NearestNeighborQuery is not found in the empty JSON string", GoogleCloudAiplatformV1NearestNeighborQuery.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1NearestNeighborQuery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1NearestNeighborQuery` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `embedding`
      if (jsonObj.get("embedding") != null && !jsonObj.get("embedding").isJsonNull()) {
        GoogleCloudAiplatformV1NearestNeighborQueryEmbedding.validateJsonElement(jsonObj.get("embedding"));
      }
      // validate the optional field `parameters`
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        GoogleCloudAiplatformV1NearestNeighborQueryParameters.validateJsonElement(jsonObj.get("parameters"));
      }
      if (jsonObj.get("stringFilters") != null && !jsonObj.get("stringFilters").isJsonNull()) {
        JsonArray jsonArraystringFilters = jsonObj.getAsJsonArray("stringFilters");
        if (jsonArraystringFilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("stringFilters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `stringFilters` to be an array in the JSON string but got `%s`", jsonObj.get("stringFilters").toString()));
          }

          // validate the optional field `stringFilters` (array)
          for (int i = 0; i < jsonArraystringFilters.size(); i++) {
            GoogleCloudAiplatformV1NearestNeighborQueryStringFilter.validateJsonElement(jsonArraystringFilters.get(i));
          };
        }
      }
      if ((jsonObj.get("entityId") != null && !jsonObj.get("entityId").isJsonNull()) && !jsonObj.get("entityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityId").toString()));
      }
      if (jsonObj.get("numericFilters") != null && !jsonObj.get("numericFilters").isJsonNull()) {
        JsonArray jsonArraynumericFilters = jsonObj.getAsJsonArray("numericFilters");
        if (jsonArraynumericFilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("numericFilters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `numericFilters` to be an array in the JSON string but got `%s`", jsonObj.get("numericFilters").toString()));
          }

          // validate the optional field `numericFilters` (array)
          for (int i = 0; i < jsonArraynumericFilters.size(); i++) {
            GoogleCloudAiplatformV1NearestNeighborQueryNumericFilter.validateJsonElement(jsonArraynumericFilters.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1NearestNeighborQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1NearestNeighborQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1NearestNeighborQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1NearestNeighborQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1NearestNeighborQuery>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1NearestNeighborQuery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1NearestNeighborQuery read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1NearestNeighborQuery given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1NearestNeighborQuery
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1NearestNeighborQuery
   */
  public static GoogleCloudAiplatformV1NearestNeighborQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1NearestNeighborQuery.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1NearestNeighborQuery to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

