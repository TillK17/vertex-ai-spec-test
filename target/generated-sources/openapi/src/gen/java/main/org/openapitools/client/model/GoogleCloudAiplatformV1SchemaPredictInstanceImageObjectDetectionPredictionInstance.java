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
 * Prediction input format for Image Object Detection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance() {
  }

  public GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The image bytes or Cloud Storage URI to make the prediction on.
   * @return content
   */
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The MIME type of the content of the image. Only the images in below listed MIME types are supported. - image/jpeg - image/gif - image/png - image/webp - image/bmp - image/tiff - image/vnd.microsoft.icon
   * @return mimeType
   */
  @javax.annotation.Nullable
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance googleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance = (GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance) o;
    return Objects.equals(this.content, googleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance.content) &&
        Objects.equals(this.mimeType, googleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, mimeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("mimeType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("mimeType") != null && !jsonObj.get("mimeType").isJsonNull()) && !jsonObj.get("mimeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mimeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mimeType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance
   */
  public static GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaPredictInstanceImageObjectDetectionPredictionInstance to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

