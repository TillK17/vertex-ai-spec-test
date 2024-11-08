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
import org.openapitools.client.model.GoogleCloudAiplatformV1ModelDeploymentMonitoringJob;

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
 * Response message for JobService.ListModelDeploymentMonitoringJobs.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse {
  public static final String SERIALIZED_NAME_MODEL_DEPLOYMENT_MONITORING_JOBS = "modelDeploymentMonitoringJobs";
  @SerializedName(SERIALIZED_NAME_MODEL_DEPLOYMENT_MONITORING_JOBS)
  private List<GoogleCloudAiplatformV1ModelDeploymentMonitoringJob> modelDeploymentMonitoringJobs = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse() {
  }

  public GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse modelDeploymentMonitoringJobs(List<GoogleCloudAiplatformV1ModelDeploymentMonitoringJob> modelDeploymentMonitoringJobs) {
    this.modelDeploymentMonitoringJobs = modelDeploymentMonitoringJobs;
    return this;
  }

  public GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse addModelDeploymentMonitoringJobsItem(GoogleCloudAiplatformV1ModelDeploymentMonitoringJob modelDeploymentMonitoringJobsItem) {
    if (this.modelDeploymentMonitoringJobs == null) {
      this.modelDeploymentMonitoringJobs = new ArrayList<>();
    }
    this.modelDeploymentMonitoringJobs.add(modelDeploymentMonitoringJobsItem);
    return this;
  }

  /**
   * A list of ModelDeploymentMonitoringJobs that matches the specified filter in the request.
   * @return modelDeploymentMonitoringJobs
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1ModelDeploymentMonitoringJob> getModelDeploymentMonitoringJobs() {
    return modelDeploymentMonitoringJobs;
  }

  public void setModelDeploymentMonitoringJobs(List<GoogleCloudAiplatformV1ModelDeploymentMonitoringJob> modelDeploymentMonitoringJobs) {
    this.modelDeploymentMonitoringJobs = modelDeploymentMonitoringJobs;
  }


  public GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The standard List next-page token.
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
    GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse googleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse = (GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse) o;
    return Objects.equals(this.modelDeploymentMonitoringJobs, googleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse.modelDeploymentMonitoringJobs) &&
        Objects.equals(this.nextPageToken, googleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelDeploymentMonitoringJobs, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse {\n");
    sb.append("    modelDeploymentMonitoringJobs: ").append(toIndentedString(modelDeploymentMonitoringJobs)).append("\n");
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
    openapiFields.add("modelDeploymentMonitoringJobs");
    openapiFields.add("nextPageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse is not found in the empty JSON string", GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("modelDeploymentMonitoringJobs") != null && !jsonObj.get("modelDeploymentMonitoringJobs").isJsonNull()) {
        JsonArray jsonArraymodelDeploymentMonitoringJobs = jsonObj.getAsJsonArray("modelDeploymentMonitoringJobs");
        if (jsonArraymodelDeploymentMonitoringJobs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("modelDeploymentMonitoringJobs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `modelDeploymentMonitoringJobs` to be an array in the JSON string but got `%s`", jsonObj.get("modelDeploymentMonitoringJobs").toString()));
          }

          // validate the optional field `modelDeploymentMonitoringJobs` (array)
          for (int i = 0; i < jsonArraymodelDeploymentMonitoringJobs.size(); i++) {
            GoogleCloudAiplatformV1ModelDeploymentMonitoringJob.validateJsonElement(jsonArraymodelDeploymentMonitoringJobs.get(i));
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
       if (!GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse
   */
  public static GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ListModelDeploymentMonitoringJobsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

