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
import org.openapitools.client.model.CloudAiLargeModelsVisionImage;
import org.openapitools.client.model.CloudAiLargeModelsVisionVideo;

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
 * Media.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class CloudAiLargeModelsVisionMedia {
  public static final String SERIALIZED_NAME_VIDEO = "video";
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private CloudAiLargeModelsVisionVideo video;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private CloudAiLargeModelsVisionImage image;

  public CloudAiLargeModelsVisionMedia() {
  }

  public CloudAiLargeModelsVisionMedia video(CloudAiLargeModelsVisionVideo video) {
    this.video = video;
    return this;
  }

  /**
   * Video
   * @return video
   */
  @javax.annotation.Nullable
  public CloudAiLargeModelsVisionVideo getVideo() {
    return video;
  }

  public void setVideo(CloudAiLargeModelsVisionVideo video) {
    this.video = video;
  }


  public CloudAiLargeModelsVisionMedia image(CloudAiLargeModelsVisionImage image) {
    this.image = image;
    return this;
  }

  /**
   * Image.
   * @return image
   */
  @javax.annotation.Nullable
  public CloudAiLargeModelsVisionImage getImage() {
    return image;
  }

  public void setImage(CloudAiLargeModelsVisionImage image) {
    this.image = image;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAiLargeModelsVisionMedia cloudAiLargeModelsVisionMedia = (CloudAiLargeModelsVisionMedia) o;
    return Objects.equals(this.video, cloudAiLargeModelsVisionMedia.video) &&
        Objects.equals(this.image, cloudAiLargeModelsVisionMedia.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(video, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAiLargeModelsVisionMedia {\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
    openapiFields.add("video");
    openapiFields.add("image");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloudAiLargeModelsVisionMedia
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudAiLargeModelsVisionMedia.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudAiLargeModelsVisionMedia is not found in the empty JSON string", CloudAiLargeModelsVisionMedia.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudAiLargeModelsVisionMedia.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudAiLargeModelsVisionMedia` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `video`
      if (jsonObj.get("video") != null && !jsonObj.get("video").isJsonNull()) {
        CloudAiLargeModelsVisionVideo.validateJsonElement(jsonObj.get("video"));
      }
      // validate the optional field `image`
      if (jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) {
        CloudAiLargeModelsVisionImage.validateJsonElement(jsonObj.get("image"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudAiLargeModelsVisionMedia.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudAiLargeModelsVisionMedia' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudAiLargeModelsVisionMedia> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudAiLargeModelsVisionMedia.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudAiLargeModelsVisionMedia>() {
           @Override
           public void write(JsonWriter out, CloudAiLargeModelsVisionMedia value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudAiLargeModelsVisionMedia read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CloudAiLargeModelsVisionMedia given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloudAiLargeModelsVisionMedia
   * @throws IOException if the JSON string is invalid with respect to CloudAiLargeModelsVisionMedia
   */
  public static CloudAiLargeModelsVisionMedia fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudAiLargeModelsVisionMedia.class);
  }

  /**
   * Convert an instance of CloudAiLargeModelsVisionMedia to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
