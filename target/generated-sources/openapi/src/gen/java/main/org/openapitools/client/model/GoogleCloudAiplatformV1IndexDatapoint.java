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
import org.openapitools.client.model.GoogleCloudAiplatformV1IndexDatapointCrowdingTag;
import org.openapitools.client.model.GoogleCloudAiplatformV1IndexDatapointNumericRestriction;
import org.openapitools.client.model.GoogleCloudAiplatformV1IndexDatapointRestriction;
import org.openapitools.client.model.GoogleCloudAiplatformV1IndexDatapointSparseEmbedding;

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
 * A datapoint of Index.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1IndexDatapoint {
  public static final String SERIALIZED_NAME_SPARSE_EMBEDDING = "sparseEmbedding";
  @SerializedName(SERIALIZED_NAME_SPARSE_EMBEDDING)
  private GoogleCloudAiplatformV1IndexDatapointSparseEmbedding sparseEmbedding;

  public static final String SERIALIZED_NAME_NUMERIC_RESTRICTS = "numericRestricts";
  @SerializedName(SERIALIZED_NAME_NUMERIC_RESTRICTS)
  private List<GoogleCloudAiplatformV1IndexDatapointNumericRestriction> numericRestricts = new ArrayList<>();

  public static final String SERIALIZED_NAME_FEATURE_VECTOR = "featureVector";
  @SerializedName(SERIALIZED_NAME_FEATURE_VECTOR)
  private List<Float> featureVector = new ArrayList<>();

  public static final String SERIALIZED_NAME_CROWDING_TAG = "crowdingTag";
  @SerializedName(SERIALIZED_NAME_CROWDING_TAG)
  private GoogleCloudAiplatformV1IndexDatapointCrowdingTag crowdingTag;

  public static final String SERIALIZED_NAME_RESTRICTS = "restricts";
  @SerializedName(SERIALIZED_NAME_RESTRICTS)
  private List<GoogleCloudAiplatformV1IndexDatapointRestriction> restricts = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATAPOINT_ID = "datapointId";
  @SerializedName(SERIALIZED_NAME_DATAPOINT_ID)
  private String datapointId;

  public GoogleCloudAiplatformV1IndexDatapoint() {
  }

  public GoogleCloudAiplatformV1IndexDatapoint sparseEmbedding(GoogleCloudAiplatformV1IndexDatapointSparseEmbedding sparseEmbedding) {
    this.sparseEmbedding = sparseEmbedding;
    return this;
  }

  /**
   * Optional. Feature embedding vector for sparse index.
   * @return sparseEmbedding
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1IndexDatapointSparseEmbedding getSparseEmbedding() {
    return sparseEmbedding;
  }

  public void setSparseEmbedding(GoogleCloudAiplatformV1IndexDatapointSparseEmbedding sparseEmbedding) {
    this.sparseEmbedding = sparseEmbedding;
  }


  public GoogleCloudAiplatformV1IndexDatapoint numericRestricts(List<GoogleCloudAiplatformV1IndexDatapointNumericRestriction> numericRestricts) {
    this.numericRestricts = numericRestricts;
    return this;
  }

  public GoogleCloudAiplatformV1IndexDatapoint addNumericRestrictsItem(GoogleCloudAiplatformV1IndexDatapointNumericRestriction numericRestrictsItem) {
    if (this.numericRestricts == null) {
      this.numericRestricts = new ArrayList<>();
    }
    this.numericRestricts.add(numericRestrictsItem);
    return this;
  }

  /**
   * Optional. List of Restrict of the datapoint, used to perform \&quot;restricted searches\&quot; where boolean rule are used to filter the subset of the database eligible for matching. This uses numeric comparisons.
   * @return numericRestricts
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1IndexDatapointNumericRestriction> getNumericRestricts() {
    return numericRestricts;
  }

  public void setNumericRestricts(List<GoogleCloudAiplatformV1IndexDatapointNumericRestriction> numericRestricts) {
    this.numericRestricts = numericRestricts;
  }


  public GoogleCloudAiplatformV1IndexDatapoint featureVector(List<Float> featureVector) {
    this.featureVector = featureVector;
    return this;
  }

  public GoogleCloudAiplatformV1IndexDatapoint addFeatureVectorItem(Float featureVectorItem) {
    if (this.featureVector == null) {
      this.featureVector = new ArrayList<>();
    }
    this.featureVector.add(featureVectorItem);
    return this;
  }

  /**
   * Required. Feature embedding vector for dense index. An array of numbers with the length of [NearestNeighborSearchConfig.dimensions].
   * @return featureVector
   */
  @javax.annotation.Nullable
  public List<Float> getFeatureVector() {
    return featureVector;
  }

  public void setFeatureVector(List<Float> featureVector) {
    this.featureVector = featureVector;
  }


  public GoogleCloudAiplatformV1IndexDatapoint crowdingTag(GoogleCloudAiplatformV1IndexDatapointCrowdingTag crowdingTag) {
    this.crowdingTag = crowdingTag;
    return this;
  }

  /**
   * Optional. CrowdingTag of the datapoint, the number of neighbors to return in each crowding can be configured during query.
   * @return crowdingTag
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1IndexDatapointCrowdingTag getCrowdingTag() {
    return crowdingTag;
  }

  public void setCrowdingTag(GoogleCloudAiplatformV1IndexDatapointCrowdingTag crowdingTag) {
    this.crowdingTag = crowdingTag;
  }


  public GoogleCloudAiplatformV1IndexDatapoint restricts(List<GoogleCloudAiplatformV1IndexDatapointRestriction> restricts) {
    this.restricts = restricts;
    return this;
  }

  public GoogleCloudAiplatformV1IndexDatapoint addRestrictsItem(GoogleCloudAiplatformV1IndexDatapointRestriction restrictsItem) {
    if (this.restricts == null) {
      this.restricts = new ArrayList<>();
    }
    this.restricts.add(restrictsItem);
    return this;
  }

  /**
   * Optional. List of Restrict of the datapoint, used to perform \&quot;restricted searches\&quot; where boolean rule are used to filter the subset of the database eligible for matching. This uses categorical tokens. See: https://cloud.google.com/vertex-ai/docs/matching-engine/filtering
   * @return restricts
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1IndexDatapointRestriction> getRestricts() {
    return restricts;
  }

  public void setRestricts(List<GoogleCloudAiplatformV1IndexDatapointRestriction> restricts) {
    this.restricts = restricts;
  }


  public GoogleCloudAiplatformV1IndexDatapoint datapointId(String datapointId) {
    this.datapointId = datapointId;
    return this;
  }

  /**
   * Required. Unique identifier of the datapoint.
   * @return datapointId
   */
  @javax.annotation.Nullable
  public String getDatapointId() {
    return datapointId;
  }

  public void setDatapointId(String datapointId) {
    this.datapointId = datapointId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1IndexDatapoint googleCloudAiplatformV1IndexDatapoint = (GoogleCloudAiplatformV1IndexDatapoint) o;
    return Objects.equals(this.sparseEmbedding, googleCloudAiplatformV1IndexDatapoint.sparseEmbedding) &&
        Objects.equals(this.numericRestricts, googleCloudAiplatformV1IndexDatapoint.numericRestricts) &&
        Objects.equals(this.featureVector, googleCloudAiplatformV1IndexDatapoint.featureVector) &&
        Objects.equals(this.crowdingTag, googleCloudAiplatformV1IndexDatapoint.crowdingTag) &&
        Objects.equals(this.restricts, googleCloudAiplatformV1IndexDatapoint.restricts) &&
        Objects.equals(this.datapointId, googleCloudAiplatformV1IndexDatapoint.datapointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sparseEmbedding, numericRestricts, featureVector, crowdingTag, restricts, datapointId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1IndexDatapoint {\n");
    sb.append("    sparseEmbedding: ").append(toIndentedString(sparseEmbedding)).append("\n");
    sb.append("    numericRestricts: ").append(toIndentedString(numericRestricts)).append("\n");
    sb.append("    featureVector: ").append(toIndentedString(featureVector)).append("\n");
    sb.append("    crowdingTag: ").append(toIndentedString(crowdingTag)).append("\n");
    sb.append("    restricts: ").append(toIndentedString(restricts)).append("\n");
    sb.append("    datapointId: ").append(toIndentedString(datapointId)).append("\n");
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
    openapiFields.add("sparseEmbedding");
    openapiFields.add("numericRestricts");
    openapiFields.add("featureVector");
    openapiFields.add("crowdingTag");
    openapiFields.add("restricts");
    openapiFields.add("datapointId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1IndexDatapoint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1IndexDatapoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1IndexDatapoint is not found in the empty JSON string", GoogleCloudAiplatformV1IndexDatapoint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1IndexDatapoint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1IndexDatapoint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `sparseEmbedding`
      if (jsonObj.get("sparseEmbedding") != null && !jsonObj.get("sparseEmbedding").isJsonNull()) {
        GoogleCloudAiplatformV1IndexDatapointSparseEmbedding.validateJsonElement(jsonObj.get("sparseEmbedding"));
      }
      if (jsonObj.get("numericRestricts") != null && !jsonObj.get("numericRestricts").isJsonNull()) {
        JsonArray jsonArraynumericRestricts = jsonObj.getAsJsonArray("numericRestricts");
        if (jsonArraynumericRestricts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("numericRestricts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `numericRestricts` to be an array in the JSON string but got `%s`", jsonObj.get("numericRestricts").toString()));
          }

          // validate the optional field `numericRestricts` (array)
          for (int i = 0; i < jsonArraynumericRestricts.size(); i++) {
            GoogleCloudAiplatformV1IndexDatapointNumericRestriction.validateJsonElement(jsonArraynumericRestricts.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("featureVector") != null && !jsonObj.get("featureVector").isJsonNull() && !jsonObj.get("featureVector").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `featureVector` to be an array in the JSON string but got `%s`", jsonObj.get("featureVector").toString()));
      }
      // validate the optional field `crowdingTag`
      if (jsonObj.get("crowdingTag") != null && !jsonObj.get("crowdingTag").isJsonNull()) {
        GoogleCloudAiplatformV1IndexDatapointCrowdingTag.validateJsonElement(jsonObj.get("crowdingTag"));
      }
      if (jsonObj.get("restricts") != null && !jsonObj.get("restricts").isJsonNull()) {
        JsonArray jsonArrayrestricts = jsonObj.getAsJsonArray("restricts");
        if (jsonArrayrestricts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("restricts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `restricts` to be an array in the JSON string but got `%s`", jsonObj.get("restricts").toString()));
          }

          // validate the optional field `restricts` (array)
          for (int i = 0; i < jsonArrayrestricts.size(); i++) {
            GoogleCloudAiplatformV1IndexDatapointRestriction.validateJsonElement(jsonArrayrestricts.get(i));
          };
        }
      }
      if ((jsonObj.get("datapointId") != null && !jsonObj.get("datapointId").isJsonNull()) && !jsonObj.get("datapointId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datapointId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datapointId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1IndexDatapoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1IndexDatapoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1IndexDatapoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1IndexDatapoint.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1IndexDatapoint>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1IndexDatapoint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1IndexDatapoint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1IndexDatapoint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1IndexDatapoint
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1IndexDatapoint
   */
  public static GoogleCloudAiplatformV1IndexDatapoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1IndexDatapoint.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1IndexDatapoint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
