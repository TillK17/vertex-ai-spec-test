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
import org.openapitools.client.model.GoogleCloudAiplatformV1PipelineJob;

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
 * Request message for PipelineService.CreatePipelineJob.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1CreatePipelineJobRequest {
  public static final String SERIALIZED_NAME_PIPELINE_JOB_ID = "pipelineJobId";
  @SerializedName(SERIALIZED_NAME_PIPELINE_JOB_ID)
  private String pipelineJobId;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private String parent;

  public static final String SERIALIZED_NAME_PIPELINE_JOB = "pipelineJob";
  @SerializedName(SERIALIZED_NAME_PIPELINE_JOB)
  private GoogleCloudAiplatformV1PipelineJob pipelineJob;

  public GoogleCloudAiplatformV1CreatePipelineJobRequest() {
  }

  public GoogleCloudAiplatformV1CreatePipelineJobRequest pipelineJobId(String pipelineJobId) {
    this.pipelineJobId = pipelineJobId;
    return this;
  }

  /**
   * The ID to use for the PipelineJob, which will become the final component of the PipelineJob name. If not provided, an ID will be automatically generated. This value should be less than 128 characters, and valid characters are &#x60;/a-z-/&#x60;.
   * @return pipelineJobId
   */
  @javax.annotation.Nullable
  public String getPipelineJobId() {
    return pipelineJobId;
  }

  public void setPipelineJobId(String pipelineJobId) {
    this.pipelineJobId = pipelineJobId;
  }


  public GoogleCloudAiplatformV1CreatePipelineJobRequest parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Required. The resource name of the Location to create the PipelineJob in. Format: &#x60;projects/{project}/locations/{location}&#x60;
   * @return parent
   */
  @javax.annotation.Nullable
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }


  public GoogleCloudAiplatformV1CreatePipelineJobRequest pipelineJob(GoogleCloudAiplatformV1PipelineJob pipelineJob) {
    this.pipelineJob = pipelineJob;
    return this;
  }

  /**
   * Required. The PipelineJob to create.
   * @return pipelineJob
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1PipelineJob getPipelineJob() {
    return pipelineJob;
  }

  public void setPipelineJob(GoogleCloudAiplatformV1PipelineJob pipelineJob) {
    this.pipelineJob = pipelineJob;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1CreatePipelineJobRequest googleCloudAiplatformV1CreatePipelineJobRequest = (GoogleCloudAiplatformV1CreatePipelineJobRequest) o;
    return Objects.equals(this.pipelineJobId, googleCloudAiplatformV1CreatePipelineJobRequest.pipelineJobId) &&
        Objects.equals(this.parent, googleCloudAiplatformV1CreatePipelineJobRequest.parent) &&
        Objects.equals(this.pipelineJob, googleCloudAiplatformV1CreatePipelineJobRequest.pipelineJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineJobId, parent, pipelineJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1CreatePipelineJobRequest {\n");
    sb.append("    pipelineJobId: ").append(toIndentedString(pipelineJobId)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    pipelineJob: ").append(toIndentedString(pipelineJob)).append("\n");
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
    openapiFields.add("pipelineJobId");
    openapiFields.add("parent");
    openapiFields.add("pipelineJob");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1CreatePipelineJobRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1CreatePipelineJobRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1CreatePipelineJobRequest is not found in the empty JSON string", GoogleCloudAiplatformV1CreatePipelineJobRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1CreatePipelineJobRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1CreatePipelineJobRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("pipelineJobId") != null && !jsonObj.get("pipelineJobId").isJsonNull()) && !jsonObj.get("pipelineJobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pipelineJobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pipelineJobId").toString()));
      }
      if ((jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) && !jsonObj.get("parent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent").toString()));
      }
      // validate the optional field `pipelineJob`
      if (jsonObj.get("pipelineJob") != null && !jsonObj.get("pipelineJob").isJsonNull()) {
        GoogleCloudAiplatformV1PipelineJob.validateJsonElement(jsonObj.get("pipelineJob"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1CreatePipelineJobRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1CreatePipelineJobRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1CreatePipelineJobRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1CreatePipelineJobRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1CreatePipelineJobRequest>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1CreatePipelineJobRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1CreatePipelineJobRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1CreatePipelineJobRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1CreatePipelineJobRequest
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1CreatePipelineJobRequest
   */
  public static GoogleCloudAiplatformV1CreatePipelineJobRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1CreatePipelineJobRequest.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1CreatePipelineJobRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
