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
import org.openapitools.client.model.GoogleCloudAiplatformV1ModelEvaluationSlice;

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
 * Response message for ModelService.ListModelEvaluationSlices.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse {
  public static final String SERIALIZED_NAME_MODEL_EVALUATION_SLICES = "modelEvaluationSlices";
  @SerializedName(SERIALIZED_NAME_MODEL_EVALUATION_SLICES)
  private List<GoogleCloudAiplatformV1ModelEvaluationSlice> modelEvaluationSlices = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse() {
  }

  public GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse modelEvaluationSlices(List<GoogleCloudAiplatformV1ModelEvaluationSlice> modelEvaluationSlices) {
    this.modelEvaluationSlices = modelEvaluationSlices;
    return this;
  }

  public GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse addModelEvaluationSlicesItem(GoogleCloudAiplatformV1ModelEvaluationSlice modelEvaluationSlicesItem) {
    if (this.modelEvaluationSlices == null) {
      this.modelEvaluationSlices = new ArrayList<>();
    }
    this.modelEvaluationSlices.add(modelEvaluationSlicesItem);
    return this;
  }

  /**
   * List of ModelEvaluations in the requested page.
   * @return modelEvaluationSlices
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1ModelEvaluationSlice> getModelEvaluationSlices() {
    return modelEvaluationSlices;
  }

  public void setModelEvaluationSlices(List<GoogleCloudAiplatformV1ModelEvaluationSlice> modelEvaluationSlices) {
    this.modelEvaluationSlices = modelEvaluationSlices;
  }


  public GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A token to retrieve next page of results. Pass to ListModelEvaluationSlicesRequest.page_token to obtain that page.
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse googleCloudAiplatformV1ListModelEvaluationSlicesResponse = (GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse) o;
    return Objects.equals(this.modelEvaluationSlices, googleCloudAiplatformV1ListModelEvaluationSlicesResponse.modelEvaluationSlices) &&
        Objects.equals(this.nextPageToken, googleCloudAiplatformV1ListModelEvaluationSlicesResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelEvaluationSlices, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse {\n");
    sb.append("    modelEvaluationSlices: ").append(toIndentedString(modelEvaluationSlices)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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
    openapiFields.add("modelEvaluationSlices");
    openapiFields.add("nextPageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse is not found in the empty JSON string", GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("modelEvaluationSlices") != null && !jsonObj.get("modelEvaluationSlices").isJsonNull()) {
        JsonArray jsonArraymodelEvaluationSlices = jsonObj.getAsJsonArray("modelEvaluationSlices");
        if (jsonArraymodelEvaluationSlices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("modelEvaluationSlices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `modelEvaluationSlices` to be an array in the JSON string but got `%s`", jsonObj.get("modelEvaluationSlices").toString()));
          }

          // validate the optional field `modelEvaluationSlices` (array)
          for (int i = 0; i < jsonArraymodelEvaluationSlices.size(); i++) {
            GoogleCloudAiplatformV1ModelEvaluationSlice.validateJsonElement(jsonArraymodelEvaluationSlices.get(i));
          };
        }
      }
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse
   */
  public static GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ListModelEvaluationSlicesResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

