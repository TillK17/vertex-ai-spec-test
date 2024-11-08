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
import org.openapitools.client.model.GoogleCloudAiplatformV1NotebookRuntime;

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
 * Request message for NotebookService.AssignNotebookRuntime.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1AssignNotebookRuntimeRequest {
  public static final String SERIALIZED_NAME_NOTEBOOK_RUNTIME = "notebookRuntime";
  @SerializedName(SERIALIZED_NAME_NOTEBOOK_RUNTIME)
  private GoogleCloudAiplatformV1NotebookRuntime notebookRuntime;

  public static final String SERIALIZED_NAME_NOTEBOOK_RUNTIME_TEMPLATE = "notebookRuntimeTemplate";
  @SerializedName(SERIALIZED_NAME_NOTEBOOK_RUNTIME_TEMPLATE)
  private String notebookRuntimeTemplate;

  public static final String SERIALIZED_NAME_NOTEBOOK_RUNTIME_ID = "notebookRuntimeId";
  @SerializedName(SERIALIZED_NAME_NOTEBOOK_RUNTIME_ID)
  private String notebookRuntimeId;

  public GoogleCloudAiplatformV1AssignNotebookRuntimeRequest() {
  }

  public GoogleCloudAiplatformV1AssignNotebookRuntimeRequest notebookRuntime(GoogleCloudAiplatformV1NotebookRuntime notebookRuntime) {
    this.notebookRuntime = notebookRuntime;
    return this;
  }

  /**
   * Required. Provide runtime specific information (e.g. runtime owner, notebook id) used for NotebookRuntime assignment.
   * @return notebookRuntime
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1NotebookRuntime getNotebookRuntime() {
    return notebookRuntime;
  }

  public void setNotebookRuntime(GoogleCloudAiplatformV1NotebookRuntime notebookRuntime) {
    this.notebookRuntime = notebookRuntime;
  }


  public GoogleCloudAiplatformV1AssignNotebookRuntimeRequest notebookRuntimeTemplate(String notebookRuntimeTemplate) {
    this.notebookRuntimeTemplate = notebookRuntimeTemplate;
    return this;
  }

  /**
   * Required. The resource name of the NotebookRuntimeTemplate based on which a NotebookRuntime will be assigned (reuse or create a new one).
   * @return notebookRuntimeTemplate
   */
  @javax.annotation.Nullable
  public String getNotebookRuntimeTemplate() {
    return notebookRuntimeTemplate;
  }

  public void setNotebookRuntimeTemplate(String notebookRuntimeTemplate) {
    this.notebookRuntimeTemplate = notebookRuntimeTemplate;
  }


  public GoogleCloudAiplatformV1AssignNotebookRuntimeRequest notebookRuntimeId(String notebookRuntimeId) {
    this.notebookRuntimeId = notebookRuntimeId;
    return this;
  }

  /**
   * Optional. User specified ID for the notebook runtime.
   * @return notebookRuntimeId
   */
  @javax.annotation.Nullable
  public String getNotebookRuntimeId() {
    return notebookRuntimeId;
  }

  public void setNotebookRuntimeId(String notebookRuntimeId) {
    this.notebookRuntimeId = notebookRuntimeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1AssignNotebookRuntimeRequest googleCloudAiplatformV1AssignNotebookRuntimeRequest = (GoogleCloudAiplatformV1AssignNotebookRuntimeRequest) o;
    return Objects.equals(this.notebookRuntime, googleCloudAiplatformV1AssignNotebookRuntimeRequest.notebookRuntime) &&
        Objects.equals(this.notebookRuntimeTemplate, googleCloudAiplatformV1AssignNotebookRuntimeRequest.notebookRuntimeTemplate) &&
        Objects.equals(this.notebookRuntimeId, googleCloudAiplatformV1AssignNotebookRuntimeRequest.notebookRuntimeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notebookRuntime, notebookRuntimeTemplate, notebookRuntimeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1AssignNotebookRuntimeRequest {\n");
    sb.append("    notebookRuntime: ").append(toIndentedString(notebookRuntime)).append("\n");
    sb.append("    notebookRuntimeTemplate: ").append(toIndentedString(notebookRuntimeTemplate)).append("\n");
    sb.append("    notebookRuntimeId: ").append(toIndentedString(notebookRuntimeId)).append("\n");
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
    openapiFields.add("notebookRuntime");
    openapiFields.add("notebookRuntimeTemplate");
    openapiFields.add("notebookRuntimeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1AssignNotebookRuntimeRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1AssignNotebookRuntimeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1AssignNotebookRuntimeRequest is not found in the empty JSON string", GoogleCloudAiplatformV1AssignNotebookRuntimeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1AssignNotebookRuntimeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1AssignNotebookRuntimeRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `notebookRuntime`
      if (jsonObj.get("notebookRuntime") != null && !jsonObj.get("notebookRuntime").isJsonNull()) {
        GoogleCloudAiplatformV1NotebookRuntime.validateJsonElement(jsonObj.get("notebookRuntime"));
      }
      if ((jsonObj.get("notebookRuntimeTemplate") != null && !jsonObj.get("notebookRuntimeTemplate").isJsonNull()) && !jsonObj.get("notebookRuntimeTemplate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notebookRuntimeTemplate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notebookRuntimeTemplate").toString()));
      }
      if ((jsonObj.get("notebookRuntimeId") != null && !jsonObj.get("notebookRuntimeId").isJsonNull()) && !jsonObj.get("notebookRuntimeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notebookRuntimeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notebookRuntimeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1AssignNotebookRuntimeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1AssignNotebookRuntimeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1AssignNotebookRuntimeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1AssignNotebookRuntimeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1AssignNotebookRuntimeRequest>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1AssignNotebookRuntimeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1AssignNotebookRuntimeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1AssignNotebookRuntimeRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1AssignNotebookRuntimeRequest
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1AssignNotebookRuntimeRequest
   */
  public static GoogleCloudAiplatformV1AssignNotebookRuntimeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1AssignNotebookRuntimeRequest.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1AssignNotebookRuntimeRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

