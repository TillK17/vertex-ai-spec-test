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
import org.openapitools.client.model.GoogleCloudAiplatformV1GenericOperationMetadata;

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
 * Metadata information for NotebookService.StartNotebookRuntime.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata {
  public static final String SERIALIZED_NAME_GENERIC_METADATA = "genericMetadata";
  @SerializedName(SERIALIZED_NAME_GENERIC_METADATA)
  private GoogleCloudAiplatformV1GenericOperationMetadata genericMetadata;

  public static final String SERIALIZED_NAME_PROGRESS_MESSAGE = "progressMessage";
  @SerializedName(SERIALIZED_NAME_PROGRESS_MESSAGE)
  private String progressMessage;

  public GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata() {
  }

  public GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata genericMetadata(GoogleCloudAiplatformV1GenericOperationMetadata genericMetadata) {
    this.genericMetadata = genericMetadata;
    return this;
  }

  /**
   * The operation generic information.
   * @return genericMetadata
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1GenericOperationMetadata getGenericMetadata() {
    return genericMetadata;
  }

  public void setGenericMetadata(GoogleCloudAiplatformV1GenericOperationMetadata genericMetadata) {
    this.genericMetadata = genericMetadata;
  }


  public GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata progressMessage(String progressMessage) {
    this.progressMessage = progressMessage;
    return this;
  }

  /**
   * A human-readable message that shows the intermediate progress details of NotebookRuntime.
   * @return progressMessage
   */
  @javax.annotation.Nullable
  public String getProgressMessage() {
    return progressMessage;
  }

  public void setProgressMessage(String progressMessage) {
    this.progressMessage = progressMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata googleCloudAiplatformV1StartNotebookRuntimeOperationMetadata = (GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata) o;
    return Objects.equals(this.genericMetadata, googleCloudAiplatformV1StartNotebookRuntimeOperationMetadata.genericMetadata) &&
        Objects.equals(this.progressMessage, googleCloudAiplatformV1StartNotebookRuntimeOperationMetadata.progressMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genericMetadata, progressMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata {\n");
    sb.append("    genericMetadata: ").append(toIndentedString(genericMetadata)).append("\n");
    sb.append("    progressMessage: ").append(toIndentedString(progressMessage)).append("\n");
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
    openapiFields.add("genericMetadata");
    openapiFields.add("progressMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata is not found in the empty JSON string", GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `genericMetadata`
      if (jsonObj.get("genericMetadata") != null && !jsonObj.get("genericMetadata").isJsonNull()) {
        GoogleCloudAiplatformV1GenericOperationMetadata.validateJsonElement(jsonObj.get("genericMetadata"));
      }
      if ((jsonObj.get("progressMessage") != null && !jsonObj.get("progressMessage").isJsonNull()) && !jsonObj.get("progressMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `progressMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("progressMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata
   */
  public static GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1StartNotebookRuntimeOperationMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
