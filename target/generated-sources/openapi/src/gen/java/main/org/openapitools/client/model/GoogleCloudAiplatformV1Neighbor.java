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
 * Neighbors for example-based explanations.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1Neighbor {
  public static final String SERIALIZED_NAME_NEIGHBOR_ID = "neighborId";
  @SerializedName(SERIALIZED_NAME_NEIGHBOR_ID)
  private String neighborId;

  public static final String SERIALIZED_NAME_NEIGHBOR_DISTANCE = "neighborDistance";
  @SerializedName(SERIALIZED_NAME_NEIGHBOR_DISTANCE)
  private Double neighborDistance;

  public GoogleCloudAiplatformV1Neighbor() {
  }

  public GoogleCloudAiplatformV1Neighbor(
     String neighborId, 
     Double neighborDistance
  ) {
    this();
    this.neighborId = neighborId;
    this.neighborDistance = neighborDistance;
  }

  /**
   * Output only. The neighbor id.
   * @return neighborId
   */
  @javax.annotation.Nullable
  public String getNeighborId() {
    return neighborId;
  }



  /**
   * Output only. The neighbor distance.
   * @return neighborDistance
   */
  @javax.annotation.Nullable
  public Double getNeighborDistance() {
    return neighborDistance;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1Neighbor googleCloudAiplatformV1Neighbor = (GoogleCloudAiplatformV1Neighbor) o;
    return Objects.equals(this.neighborId, googleCloudAiplatformV1Neighbor.neighborId) &&
        Objects.equals(this.neighborDistance, googleCloudAiplatformV1Neighbor.neighborDistance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(neighborId, neighborDistance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1Neighbor {\n");
    sb.append("    neighborId: ").append(toIndentedString(neighborId)).append("\n");
    sb.append("    neighborDistance: ").append(toIndentedString(neighborDistance)).append("\n");
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
    openapiFields.add("neighborId");
    openapiFields.add("neighborDistance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1Neighbor
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1Neighbor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1Neighbor is not found in the empty JSON string", GoogleCloudAiplatformV1Neighbor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1Neighbor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1Neighbor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("neighborId") != null && !jsonObj.get("neighborId").isJsonNull()) && !jsonObj.get("neighborId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `neighborId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("neighborId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1Neighbor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1Neighbor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1Neighbor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1Neighbor.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1Neighbor>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1Neighbor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1Neighbor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1Neighbor given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1Neighbor
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1Neighbor
   */
  public static GoogleCloudAiplatformV1Neighbor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1Neighbor.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1Neighbor to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
