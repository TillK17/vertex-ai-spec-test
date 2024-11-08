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
import org.openapitools.client.model.GoogleCloudAiplatformV1FindNeighborsRequestQueryRRF;
import org.openapitools.client.model.GoogleCloudAiplatformV1IndexDatapoint;

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
 * A query to find a number of the nearest neighbors (most similar vectors) of a vector.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1FindNeighborsRequestQuery {
  public static final String SERIALIZED_NAME_DATAPOINT = "datapoint";
  @SerializedName(SERIALIZED_NAME_DATAPOINT)
  private GoogleCloudAiplatformV1IndexDatapoint datapoint;

  public static final String SERIALIZED_NAME_PER_CROWDING_ATTRIBUTE_NEIGHBOR_COUNT = "perCrowdingAttributeNeighborCount";
  @SerializedName(SERIALIZED_NAME_PER_CROWDING_ATTRIBUTE_NEIGHBOR_COUNT)
  private Integer perCrowdingAttributeNeighborCount;

  public static final String SERIALIZED_NAME_FRACTION_LEAF_NODES_TO_SEARCH_OVERRIDE = "fractionLeafNodesToSearchOverride";
  @SerializedName(SERIALIZED_NAME_FRACTION_LEAF_NODES_TO_SEARCH_OVERRIDE)
  private Double fractionLeafNodesToSearchOverride;

  public static final String SERIALIZED_NAME_APPROXIMATE_NEIGHBOR_COUNT = "approximateNeighborCount";
  @SerializedName(SERIALIZED_NAME_APPROXIMATE_NEIGHBOR_COUNT)
  private Integer approximateNeighborCount;

  public static final String SERIALIZED_NAME_NEIGHBOR_COUNT = "neighborCount";
  @SerializedName(SERIALIZED_NAME_NEIGHBOR_COUNT)
  private Integer neighborCount;

  public static final String SERIALIZED_NAME_RRF = "rrf";
  @SerializedName(SERIALIZED_NAME_RRF)
  private GoogleCloudAiplatformV1FindNeighborsRequestQueryRRF rrf;

  public GoogleCloudAiplatformV1FindNeighborsRequestQuery() {
  }

  public GoogleCloudAiplatformV1FindNeighborsRequestQuery datapoint(GoogleCloudAiplatformV1IndexDatapoint datapoint) {
    this.datapoint = datapoint;
    return this;
  }

  /**
   * Required. The datapoint/vector whose nearest neighbors should be searched for.
   * @return datapoint
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1IndexDatapoint getDatapoint() {
    return datapoint;
  }

  public void setDatapoint(GoogleCloudAiplatformV1IndexDatapoint datapoint) {
    this.datapoint = datapoint;
  }


  public GoogleCloudAiplatformV1FindNeighborsRequestQuery perCrowdingAttributeNeighborCount(Integer perCrowdingAttributeNeighborCount) {
    this.perCrowdingAttributeNeighborCount = perCrowdingAttributeNeighborCount;
    return this;
  }

  /**
   * Crowding is a constraint on a neighbor list produced by nearest neighbor search requiring that no more than some value k&#39; of the k neighbors returned have the same value of crowding_attribute. It&#39;s used for improving result diversity. This field is the maximum number of matches with the same crowding tag.
   * @return perCrowdingAttributeNeighborCount
   */
  @javax.annotation.Nullable
  public Integer getPerCrowdingAttributeNeighborCount() {
    return perCrowdingAttributeNeighborCount;
  }

  public void setPerCrowdingAttributeNeighborCount(Integer perCrowdingAttributeNeighborCount) {
    this.perCrowdingAttributeNeighborCount = perCrowdingAttributeNeighborCount;
  }


  public GoogleCloudAiplatformV1FindNeighborsRequestQuery fractionLeafNodesToSearchOverride(Double fractionLeafNodesToSearchOverride) {
    this.fractionLeafNodesToSearchOverride = fractionLeafNodesToSearchOverride;
    return this;
  }

  /**
   * The fraction of the number of leaves to search, set at query time allows user to tune search performance. This value increase result in both search accuracy and latency increase. The value should be between 0.0 and 1.0. If not set or set to 0.0, query uses the default value specified in NearestNeighborSearchConfig.TreeAHConfig.fraction_leaf_nodes_to_search.
   * @return fractionLeafNodesToSearchOverride
   */
  @javax.annotation.Nullable
  public Double getFractionLeafNodesToSearchOverride() {
    return fractionLeafNodesToSearchOverride;
  }

  public void setFractionLeafNodesToSearchOverride(Double fractionLeafNodesToSearchOverride) {
    this.fractionLeafNodesToSearchOverride = fractionLeafNodesToSearchOverride;
  }


  public GoogleCloudAiplatformV1FindNeighborsRequestQuery approximateNeighborCount(Integer approximateNeighborCount) {
    this.approximateNeighborCount = approximateNeighborCount;
    return this;
  }

  /**
   * The number of neighbors to find via approximate search before exact reordering is performed. If not set, the default value from scam config is used; if set, this value must be &gt; 0.
   * @return approximateNeighborCount
   */
  @javax.annotation.Nullable
  public Integer getApproximateNeighborCount() {
    return approximateNeighborCount;
  }

  public void setApproximateNeighborCount(Integer approximateNeighborCount) {
    this.approximateNeighborCount = approximateNeighborCount;
  }


  public GoogleCloudAiplatformV1FindNeighborsRequestQuery neighborCount(Integer neighborCount) {
    this.neighborCount = neighborCount;
    return this;
  }

  /**
   * The number of nearest neighbors to be retrieved from database for each query. If not set, will use the default from the service configuration (https://cloud.google.com/vertex-ai/docs/matching-engine/configuring-indexes#nearest-neighbor-search-config).
   * @return neighborCount
   */
  @javax.annotation.Nullable
  public Integer getNeighborCount() {
    return neighborCount;
  }

  public void setNeighborCount(Integer neighborCount) {
    this.neighborCount = neighborCount;
  }


  public GoogleCloudAiplatformV1FindNeighborsRequestQuery rrf(GoogleCloudAiplatformV1FindNeighborsRequestQueryRRF rrf) {
    this.rrf = rrf;
    return this;
  }

  /**
   * Optional. Represents RRF algorithm that combines search results.
   * @return rrf
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1FindNeighborsRequestQueryRRF getRrf() {
    return rrf;
  }

  public void setRrf(GoogleCloudAiplatformV1FindNeighborsRequestQueryRRF rrf) {
    this.rrf = rrf;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1FindNeighborsRequestQuery googleCloudAiplatformV1FindNeighborsRequestQuery = (GoogleCloudAiplatformV1FindNeighborsRequestQuery) o;
    return Objects.equals(this.datapoint, googleCloudAiplatformV1FindNeighborsRequestQuery.datapoint) &&
        Objects.equals(this.perCrowdingAttributeNeighborCount, googleCloudAiplatformV1FindNeighborsRequestQuery.perCrowdingAttributeNeighborCount) &&
        Objects.equals(this.fractionLeafNodesToSearchOverride, googleCloudAiplatformV1FindNeighborsRequestQuery.fractionLeafNodesToSearchOverride) &&
        Objects.equals(this.approximateNeighborCount, googleCloudAiplatformV1FindNeighborsRequestQuery.approximateNeighborCount) &&
        Objects.equals(this.neighborCount, googleCloudAiplatformV1FindNeighborsRequestQuery.neighborCount) &&
        Objects.equals(this.rrf, googleCloudAiplatformV1FindNeighborsRequestQuery.rrf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datapoint, perCrowdingAttributeNeighborCount, fractionLeafNodesToSearchOverride, approximateNeighborCount, neighborCount, rrf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1FindNeighborsRequestQuery {\n");
    sb.append("    datapoint: ").append(toIndentedString(datapoint)).append("\n");
    sb.append("    perCrowdingAttributeNeighborCount: ").append(toIndentedString(perCrowdingAttributeNeighborCount)).append("\n");
    sb.append("    fractionLeafNodesToSearchOverride: ").append(toIndentedString(fractionLeafNodesToSearchOverride)).append("\n");
    sb.append("    approximateNeighborCount: ").append(toIndentedString(approximateNeighborCount)).append("\n");
    sb.append("    neighborCount: ").append(toIndentedString(neighborCount)).append("\n");
    sb.append("    rrf: ").append(toIndentedString(rrf)).append("\n");
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
    openapiFields.add("datapoint");
    openapiFields.add("perCrowdingAttributeNeighborCount");
    openapiFields.add("fractionLeafNodesToSearchOverride");
    openapiFields.add("approximateNeighborCount");
    openapiFields.add("neighborCount");
    openapiFields.add("rrf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1FindNeighborsRequestQuery
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1FindNeighborsRequestQuery.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1FindNeighborsRequestQuery is not found in the empty JSON string", GoogleCloudAiplatformV1FindNeighborsRequestQuery.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1FindNeighborsRequestQuery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1FindNeighborsRequestQuery` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `datapoint`
      if (jsonObj.get("datapoint") != null && !jsonObj.get("datapoint").isJsonNull()) {
        GoogleCloudAiplatformV1IndexDatapoint.validateJsonElement(jsonObj.get("datapoint"));
      }
      // validate the optional field `rrf`
      if (jsonObj.get("rrf") != null && !jsonObj.get("rrf").isJsonNull()) {
        GoogleCloudAiplatformV1FindNeighborsRequestQueryRRF.validateJsonElement(jsonObj.get("rrf"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1FindNeighborsRequestQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1FindNeighborsRequestQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1FindNeighborsRequestQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1FindNeighborsRequestQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1FindNeighborsRequestQuery>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1FindNeighborsRequestQuery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1FindNeighborsRequestQuery read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1FindNeighborsRequestQuery given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1FindNeighborsRequestQuery
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1FindNeighborsRequestQuery
   */
  public static GoogleCloudAiplatformV1FindNeighborsRequestQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1FindNeighborsRequestQuery.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1FindNeighborsRequestQuery to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

