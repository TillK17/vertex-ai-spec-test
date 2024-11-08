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
 * The Dataform Repository containing the input notebook.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource {
  public static final String SERIALIZED_NAME_COMMIT_SHA = "commitSha";
  @SerializedName(SERIALIZED_NAME_COMMIT_SHA)
  private String commitSha;

  public static final String SERIALIZED_NAME_DATAFORM_REPOSITORY_RESOURCE_NAME = "dataformRepositoryResourceName";
  @SerializedName(SERIALIZED_NAME_DATAFORM_REPOSITORY_RESOURCE_NAME)
  private String dataformRepositoryResourceName;

  public GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource() {
  }

  public GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource commitSha(String commitSha) {
    this.commitSha = commitSha;
    return this;
  }

  /**
   * The commit SHA to read repository with. If unset, the file will be read at HEAD.
   * @return commitSha
   */
  @javax.annotation.Nullable
  public String getCommitSha() {
    return commitSha;
  }

  public void setCommitSha(String commitSha) {
    this.commitSha = commitSha;
  }


  public GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource dataformRepositoryResourceName(String dataformRepositoryResourceName) {
    this.dataformRepositoryResourceName = dataformRepositoryResourceName;
    return this;
  }

  /**
   * The resource name of the Dataform Repository. Format: &#x60;projects/{project_id}/locations/{location}/repositories/{repository_id}&#x60;
   * @return dataformRepositoryResourceName
   */
  @javax.annotation.Nullable
  public String getDataformRepositoryResourceName() {
    return dataformRepositoryResourceName;
  }

  public void setDataformRepositoryResourceName(String dataformRepositoryResourceName) {
    this.dataformRepositoryResourceName = dataformRepositoryResourceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource googleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource = (GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource) o;
    return Objects.equals(this.commitSha, googleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource.commitSha) &&
        Objects.equals(this.dataformRepositoryResourceName, googleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource.dataformRepositoryResourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitSha, dataformRepositoryResourceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource {\n");
    sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
    sb.append("    dataformRepositoryResourceName: ").append(toIndentedString(dataformRepositoryResourceName)).append("\n");
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
    openapiFields.add("commitSha");
    openapiFields.add("dataformRepositoryResourceName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource is not found in the empty JSON string", GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("commitSha") != null && !jsonObj.get("commitSha").isJsonNull()) && !jsonObj.get("commitSha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commitSha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commitSha").toString()));
      }
      if ((jsonObj.get("dataformRepositoryResourceName") != null && !jsonObj.get("dataformRepositoryResourceName").isJsonNull()) && !jsonObj.get("dataformRepositoryResourceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataformRepositoryResourceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataformRepositoryResourceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource
   */
  public static GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

