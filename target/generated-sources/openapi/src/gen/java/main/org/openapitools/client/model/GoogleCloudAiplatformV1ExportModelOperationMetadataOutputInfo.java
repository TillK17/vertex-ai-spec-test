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
 * Further describes the output of the ExportModel. Supplements ExportModelRequest.OutputConfig.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo {
  public static final String SERIALIZED_NAME_IMAGE_OUTPUT_URI = "imageOutputUri";
  @SerializedName(SERIALIZED_NAME_IMAGE_OUTPUT_URI)
  private String imageOutputUri;

  public static final String SERIALIZED_NAME_ARTIFACT_OUTPUT_URI = "artifactOutputUri";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_OUTPUT_URI)
  private String artifactOutputUri;

  public GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo() {
  }

  public GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo(
     String imageOutputUri, 
     String artifactOutputUri
  ) {
    this();
    this.imageOutputUri = imageOutputUri;
    this.artifactOutputUri = artifactOutputUri;
  }

  /**
   * Output only. If the Model image is being exported to Google Container Registry or Artifact Registry this is the full path of the image created.
   * @return imageOutputUri
   */
  @javax.annotation.Nullable
  public String getImageOutputUri() {
    return imageOutputUri;
  }



  /**
   * Output only. If the Model artifact is being exported to Google Cloud Storage this is the full path of the directory created, into which the Model files are being written to.
   * @return artifactOutputUri
   */
  @javax.annotation.Nullable
  public String getArtifactOutputUri() {
    return artifactOutputUri;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo googleCloudAiplatformV1ExportModelOperationMetadataOutputInfo = (GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo) o;
    return Objects.equals(this.imageOutputUri, googleCloudAiplatformV1ExportModelOperationMetadataOutputInfo.imageOutputUri) &&
        Objects.equals(this.artifactOutputUri, googleCloudAiplatformV1ExportModelOperationMetadataOutputInfo.artifactOutputUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageOutputUri, artifactOutputUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo {\n");
    sb.append("    imageOutputUri: ").append(toIndentedString(imageOutputUri)).append("\n");
    sb.append("    artifactOutputUri: ").append(toIndentedString(artifactOutputUri)).append("\n");
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
    openapiFields.add("imageOutputUri");
    openapiFields.add("artifactOutputUri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo is not found in the empty JSON string", GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("imageOutputUri") != null && !jsonObj.get("imageOutputUri").isJsonNull()) && !jsonObj.get("imageOutputUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageOutputUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageOutputUri").toString()));
      }
      if ((jsonObj.get("artifactOutputUri") != null && !jsonObj.get("artifactOutputUri").isJsonNull()) && !jsonObj.get("artifactOutputUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artifactOutputUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artifactOutputUri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo
   */
  public static GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ExportModelOperationMetadataOutputInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
