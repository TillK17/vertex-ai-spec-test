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
import org.openapitools.client.model.GoogleCloudAiplatformV1CreateTensorboardTimeSeriesRequest;

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
 * Request message for TensorboardService.BatchCreateTensorboardTimeSeries.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest {
  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private List<GoogleCloudAiplatformV1CreateTensorboardTimeSeriesRequest> requests = new ArrayList<>();

  public GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest() {
  }

  public GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest requests(List<GoogleCloudAiplatformV1CreateTensorboardTimeSeriesRequest> requests) {
    this.requests = requests;
    return this;
  }

  public GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest addRequestsItem(GoogleCloudAiplatformV1CreateTensorboardTimeSeriesRequest requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

  /**
   * Required. The request message specifying the TensorboardTimeSeries to create. A maximum of 1000 TensorboardTimeSeries can be created in a batch.
   * @return requests
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1CreateTensorboardTimeSeriesRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<GoogleCloudAiplatformV1CreateTensorboardTimeSeriesRequest> requests) {
    this.requests = requests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest googleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest = (GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest) o;
    return Objects.equals(this.requests, googleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest {\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
    openapiFields.add("requests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest is not found in the empty JSON string", GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("requests") != null && !jsonObj.get("requests").isJsonNull()) {
        JsonArray jsonArrayrequests = jsonObj.getAsJsonArray("requests");
        if (jsonArrayrequests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requests` to be an array in the JSON string but got `%s`", jsonObj.get("requests").toString()));
          }

          // validate the optional field `requests` (array)
          for (int i = 0; i < jsonArrayrequests.size(); i++) {
            GoogleCloudAiplatformV1CreateTensorboardTimeSeriesRequest.validateJsonElement(jsonArrayrequests.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest
   */
  public static GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1BatchCreateTensorboardTimeSeriesRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
