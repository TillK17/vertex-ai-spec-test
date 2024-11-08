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
import org.openapitools.client.model.GoogleCloudAiplatformV1ContainerRegistryDestination;
import org.openapitools.client.model.GoogleCloudAiplatformV1GcsDestination;

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
 * Output configuration for the Model export.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ExportModelRequestOutputConfig {
  public static final String SERIALIZED_NAME_EXPORT_FORMAT_ID = "exportFormatId";
  @SerializedName(SERIALIZED_NAME_EXPORT_FORMAT_ID)
  private String exportFormatId;

  public static final String SERIALIZED_NAME_IMAGE_DESTINATION = "imageDestination";
  @SerializedName(SERIALIZED_NAME_IMAGE_DESTINATION)
  private GoogleCloudAiplatformV1ContainerRegistryDestination imageDestination;

  public static final String SERIALIZED_NAME_ARTIFACT_DESTINATION = "artifactDestination";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_DESTINATION)
  private GoogleCloudAiplatformV1GcsDestination artifactDestination;

  public GoogleCloudAiplatformV1ExportModelRequestOutputConfig() {
  }

  public GoogleCloudAiplatformV1ExportModelRequestOutputConfig exportFormatId(String exportFormatId) {
    this.exportFormatId = exportFormatId;
    return this;
  }

  /**
   * The ID of the format in which the Model must be exported. Each Model lists the export formats it supports. If no value is provided here, then the first from the list of the Model&#39;s supported formats is used by default.
   * @return exportFormatId
   */
  @javax.annotation.Nullable
  public String getExportFormatId() {
    return exportFormatId;
  }

  public void setExportFormatId(String exportFormatId) {
    this.exportFormatId = exportFormatId;
  }


  public GoogleCloudAiplatformV1ExportModelRequestOutputConfig imageDestination(GoogleCloudAiplatformV1ContainerRegistryDestination imageDestination) {
    this.imageDestination = imageDestination;
    return this;
  }

  /**
   * The Google Container Registry or Artifact Registry uri where the Model container image will be copied to. This field should only be set when the &#x60;exportableContent&#x60; field of the [Model.supported_export_formats] object contains &#x60;IMAGE&#x60;.
   * @return imageDestination
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ContainerRegistryDestination getImageDestination() {
    return imageDestination;
  }

  public void setImageDestination(GoogleCloudAiplatformV1ContainerRegistryDestination imageDestination) {
    this.imageDestination = imageDestination;
  }


  public GoogleCloudAiplatformV1ExportModelRequestOutputConfig artifactDestination(GoogleCloudAiplatformV1GcsDestination artifactDestination) {
    this.artifactDestination = artifactDestination;
    return this;
  }

  /**
   * The Cloud Storage location where the Model artifact is to be written to. Under the directory given as the destination a new one with name \&quot;&#x60;model-export--&#x60;\&quot;, where timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format, will be created. Inside, the Model and any of its supporting files will be written. This field should only be set when the &#x60;exportableContent&#x60; field of the [Model.supported_export_formats] object contains &#x60;ARTIFACT&#x60;.
   * @return artifactDestination
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1GcsDestination getArtifactDestination() {
    return artifactDestination;
  }

  public void setArtifactDestination(GoogleCloudAiplatformV1GcsDestination artifactDestination) {
    this.artifactDestination = artifactDestination;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ExportModelRequestOutputConfig googleCloudAiplatformV1ExportModelRequestOutputConfig = (GoogleCloudAiplatformV1ExportModelRequestOutputConfig) o;
    return Objects.equals(this.exportFormatId, googleCloudAiplatformV1ExportModelRequestOutputConfig.exportFormatId) &&
        Objects.equals(this.imageDestination, googleCloudAiplatformV1ExportModelRequestOutputConfig.imageDestination) &&
        Objects.equals(this.artifactDestination, googleCloudAiplatformV1ExportModelRequestOutputConfig.artifactDestination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportFormatId, imageDestination, artifactDestination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ExportModelRequestOutputConfig {\n");
    sb.append("    exportFormatId: ").append(toIndentedString(exportFormatId)).append("\n");
    sb.append("    imageDestination: ").append(toIndentedString(imageDestination)).append("\n");
    sb.append("    artifactDestination: ").append(toIndentedString(artifactDestination)).append("\n");
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
    openapiFields.add("exportFormatId");
    openapiFields.add("imageDestination");
    openapiFields.add("artifactDestination");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ExportModelRequestOutputConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ExportModelRequestOutputConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ExportModelRequestOutputConfig is not found in the empty JSON string", GoogleCloudAiplatformV1ExportModelRequestOutputConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ExportModelRequestOutputConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ExportModelRequestOutputConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("exportFormatId") != null && !jsonObj.get("exportFormatId").isJsonNull()) && !jsonObj.get("exportFormatId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exportFormatId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exportFormatId").toString()));
      }
      // validate the optional field `imageDestination`
      if (jsonObj.get("imageDestination") != null && !jsonObj.get("imageDestination").isJsonNull()) {
        GoogleCloudAiplatformV1ContainerRegistryDestination.validateJsonElement(jsonObj.get("imageDestination"));
      }
      // validate the optional field `artifactDestination`
      if (jsonObj.get("artifactDestination") != null && !jsonObj.get("artifactDestination").isJsonNull()) {
        GoogleCloudAiplatformV1GcsDestination.validateJsonElement(jsonObj.get("artifactDestination"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ExportModelRequestOutputConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ExportModelRequestOutputConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ExportModelRequestOutputConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ExportModelRequestOutputConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ExportModelRequestOutputConfig>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ExportModelRequestOutputConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ExportModelRequestOutputConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ExportModelRequestOutputConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ExportModelRequestOutputConfig
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ExportModelRequestOutputConfig
   */
  public static GoogleCloudAiplatformV1ExportModelRequestOutputConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ExportModelRequestOutputConfig.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ExportModelRequestOutputConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

