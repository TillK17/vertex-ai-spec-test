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
import org.openapitools.client.model.GoogleCloudAiplatformV1TensorboardRun;

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
 * Response message for TensorboardService.ListTensorboardRuns.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ListTensorboardRunsResponse {
  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_TENSORBOARD_RUNS = "tensorboardRuns";
  @SerializedName(SERIALIZED_NAME_TENSORBOARD_RUNS)
  private List<GoogleCloudAiplatformV1TensorboardRun> tensorboardRuns = new ArrayList<>();

  public GoogleCloudAiplatformV1ListTensorboardRunsResponse() {
  }

  public GoogleCloudAiplatformV1ListTensorboardRunsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A token, which can be sent as ListTensorboardRunsRequest.page_token to retrieve the next page. If this field is omitted, there are no subsequent pages.
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public GoogleCloudAiplatformV1ListTensorboardRunsResponse tensorboardRuns(List<GoogleCloudAiplatformV1TensorboardRun> tensorboardRuns) {
    this.tensorboardRuns = tensorboardRuns;
    return this;
  }

  public GoogleCloudAiplatformV1ListTensorboardRunsResponse addTensorboardRunsItem(GoogleCloudAiplatformV1TensorboardRun tensorboardRunsItem) {
    if (this.tensorboardRuns == null) {
      this.tensorboardRuns = new ArrayList<>();
    }
    this.tensorboardRuns.add(tensorboardRunsItem);
    return this;
  }

  /**
   * The TensorboardRuns mathching the request.
   * @return tensorboardRuns
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1TensorboardRun> getTensorboardRuns() {
    return tensorboardRuns;
  }

  public void setTensorboardRuns(List<GoogleCloudAiplatformV1TensorboardRun> tensorboardRuns) {
    this.tensorboardRuns = tensorboardRuns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ListTensorboardRunsResponse googleCloudAiplatformV1ListTensorboardRunsResponse = (GoogleCloudAiplatformV1ListTensorboardRunsResponse) o;
    return Objects.equals(this.nextPageToken, googleCloudAiplatformV1ListTensorboardRunsResponse.nextPageToken) &&
        Objects.equals(this.tensorboardRuns, googleCloudAiplatformV1ListTensorboardRunsResponse.tensorboardRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, tensorboardRuns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ListTensorboardRunsResponse {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    tensorboardRuns: ").append(toIndentedString(tensorboardRuns)).append("\n");
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
    openapiFields.add("nextPageToken");
    openapiFields.add("tensorboardRuns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ListTensorboardRunsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ListTensorboardRunsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ListTensorboardRunsResponse is not found in the empty JSON string", GoogleCloudAiplatformV1ListTensorboardRunsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ListTensorboardRunsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ListTensorboardRunsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
      if (jsonObj.get("tensorboardRuns") != null && !jsonObj.get("tensorboardRuns").isJsonNull()) {
        JsonArray jsonArraytensorboardRuns = jsonObj.getAsJsonArray("tensorboardRuns");
        if (jsonArraytensorboardRuns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tensorboardRuns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tensorboardRuns` to be an array in the JSON string but got `%s`", jsonObj.get("tensorboardRuns").toString()));
          }

          // validate the optional field `tensorboardRuns` (array)
          for (int i = 0; i < jsonArraytensorboardRuns.size(); i++) {
            GoogleCloudAiplatformV1TensorboardRun.validateJsonElement(jsonArraytensorboardRuns.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ListTensorboardRunsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ListTensorboardRunsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ListTensorboardRunsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ListTensorboardRunsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ListTensorboardRunsResponse>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ListTensorboardRunsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ListTensorboardRunsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ListTensorboardRunsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ListTensorboardRunsResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ListTensorboardRunsResponse
   */
  public static GoogleCloudAiplatformV1ListTensorboardRunsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ListTensorboardRunsResponse.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ListTensorboardRunsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

