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
import org.openapitools.client.model.GoogleCloudAiplatformV1NasJob;

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
 * Response message for JobService.ListNasJobs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ListNasJobsResponse {
  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_NAS_JOBS = "nasJobs";
  @SerializedName(SERIALIZED_NAME_NAS_JOBS)
  private List<GoogleCloudAiplatformV1NasJob> nasJobs = new ArrayList<>();

  public GoogleCloudAiplatformV1ListNasJobsResponse() {
  }

  public GoogleCloudAiplatformV1ListNasJobsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A token to retrieve the next page of results. Pass to ListNasJobsRequest.page_token to obtain that page.
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public GoogleCloudAiplatformV1ListNasJobsResponse nasJobs(List<GoogleCloudAiplatformV1NasJob> nasJobs) {
    this.nasJobs = nasJobs;
    return this;
  }

  public GoogleCloudAiplatformV1ListNasJobsResponse addNasJobsItem(GoogleCloudAiplatformV1NasJob nasJobsItem) {
    if (this.nasJobs == null) {
      this.nasJobs = new ArrayList<>();
    }
    this.nasJobs.add(nasJobsItem);
    return this;
  }

  /**
   * List of NasJobs in the requested page. NasJob.nas_job_output of the jobs will not be returned.
   * @return nasJobs
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1NasJob> getNasJobs() {
    return nasJobs;
  }

  public void setNasJobs(List<GoogleCloudAiplatformV1NasJob> nasJobs) {
    this.nasJobs = nasJobs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ListNasJobsResponse googleCloudAiplatformV1ListNasJobsResponse = (GoogleCloudAiplatformV1ListNasJobsResponse) o;
    return Objects.equals(this.nextPageToken, googleCloudAiplatformV1ListNasJobsResponse.nextPageToken) &&
        Objects.equals(this.nasJobs, googleCloudAiplatformV1ListNasJobsResponse.nasJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, nasJobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ListNasJobsResponse {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    nasJobs: ").append(toIndentedString(nasJobs)).append("\n");
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
    openapiFields.add("nasJobs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ListNasJobsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ListNasJobsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ListNasJobsResponse is not found in the empty JSON string", GoogleCloudAiplatformV1ListNasJobsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ListNasJobsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ListNasJobsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
      if (jsonObj.get("nasJobs") != null && !jsonObj.get("nasJobs").isJsonNull()) {
        JsonArray jsonArraynasJobs = jsonObj.getAsJsonArray("nasJobs");
        if (jsonArraynasJobs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("nasJobs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `nasJobs` to be an array in the JSON string but got `%s`", jsonObj.get("nasJobs").toString()));
          }

          // validate the optional field `nasJobs` (array)
          for (int i = 0; i < jsonArraynasJobs.size(); i++) {
            GoogleCloudAiplatformV1NasJob.validateJsonElement(jsonArraynasJobs.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ListNasJobsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ListNasJobsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ListNasJobsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ListNasJobsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ListNasJobsResponse>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ListNasJobsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ListNasJobsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ListNasJobsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ListNasJobsResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ListNasJobsResponse
   */
  public static GoogleCloudAiplatformV1ListNasJobsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ListNasJobsResponse.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ListNasJobsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

