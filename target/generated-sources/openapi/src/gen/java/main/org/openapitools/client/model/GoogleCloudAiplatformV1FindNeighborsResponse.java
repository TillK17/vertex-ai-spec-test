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
import org.openapitools.client.model.GoogleCloudAiplatformV1FindNeighborsResponseNearestNeighbors;

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
 * The response message for MatchService.FindNeighbors.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1FindNeighborsResponse {
  public static final String SERIALIZED_NAME_NEAREST_NEIGHBORS = "nearestNeighbors";
  @SerializedName(SERIALIZED_NAME_NEAREST_NEIGHBORS)
  private List<GoogleCloudAiplatformV1FindNeighborsResponseNearestNeighbors> nearestNeighbors = new ArrayList<>();

  public GoogleCloudAiplatformV1FindNeighborsResponse() {
  }

  public GoogleCloudAiplatformV1FindNeighborsResponse nearestNeighbors(List<GoogleCloudAiplatformV1FindNeighborsResponseNearestNeighbors> nearestNeighbors) {
    this.nearestNeighbors = nearestNeighbors;
    return this;
  }

  public GoogleCloudAiplatformV1FindNeighborsResponse addNearestNeighborsItem(GoogleCloudAiplatformV1FindNeighborsResponseNearestNeighbors nearestNeighborsItem) {
    if (this.nearestNeighbors == null) {
      this.nearestNeighbors = new ArrayList<>();
    }
    this.nearestNeighbors.add(nearestNeighborsItem);
    return this;
  }

  /**
   * The nearest neighbors of the query datapoints.
   * @return nearestNeighbors
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1FindNeighborsResponseNearestNeighbors> getNearestNeighbors() {
    return nearestNeighbors;
  }

  public void setNearestNeighbors(List<GoogleCloudAiplatformV1FindNeighborsResponseNearestNeighbors> nearestNeighbors) {
    this.nearestNeighbors = nearestNeighbors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1FindNeighborsResponse googleCloudAiplatformV1FindNeighborsResponse = (GoogleCloudAiplatformV1FindNeighborsResponse) o;
    return Objects.equals(this.nearestNeighbors, googleCloudAiplatformV1FindNeighborsResponse.nearestNeighbors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nearestNeighbors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1FindNeighborsResponse {\n");
    sb.append("    nearestNeighbors: ").append(toIndentedString(nearestNeighbors)).append("\n");
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
    openapiFields.add("nearestNeighbors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1FindNeighborsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1FindNeighborsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1FindNeighborsResponse is not found in the empty JSON string", GoogleCloudAiplatformV1FindNeighborsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1FindNeighborsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1FindNeighborsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("nearestNeighbors") != null && !jsonObj.get("nearestNeighbors").isJsonNull()) {
        JsonArray jsonArraynearestNeighbors = jsonObj.getAsJsonArray("nearestNeighbors");
        if (jsonArraynearestNeighbors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("nearestNeighbors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `nearestNeighbors` to be an array in the JSON string but got `%s`", jsonObj.get("nearestNeighbors").toString()));
          }

          // validate the optional field `nearestNeighbors` (array)
          for (int i = 0; i < jsonArraynearestNeighbors.size(); i++) {
            GoogleCloudAiplatformV1FindNeighborsResponseNearestNeighbors.validateJsonElement(jsonArraynearestNeighbors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1FindNeighborsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1FindNeighborsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1FindNeighborsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1FindNeighborsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1FindNeighborsResponse>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1FindNeighborsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1FindNeighborsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1FindNeighborsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1FindNeighborsResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1FindNeighborsResponse
   */
  public static GoogleCloudAiplatformV1FindNeighborsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1FindNeighborsResponse.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1FindNeighborsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
