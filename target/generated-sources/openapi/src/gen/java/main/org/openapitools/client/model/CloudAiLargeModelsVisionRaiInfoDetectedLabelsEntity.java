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
import org.openapitools.client.model.CloudAiLargeModelsVisionRaiInfoDetectedLabelsBoundingBox;

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
 * The properties for a detected entity from the rai signal.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity {
  public static final String SERIALIZED_NAME_IOU_SCORE = "iouScore";
  @SerializedName(SERIALIZED_NAME_IOU_SCORE)
  private Float iouScore;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MID = "mid";
  @SerializedName(SERIALIZED_NAME_MID)
  private String mid;

  public static final String SERIALIZED_NAME_BOUNDING_BOX = "boundingBox";
  @SerializedName(SERIALIZED_NAME_BOUNDING_BOX)
  private CloudAiLargeModelsVisionRaiInfoDetectedLabelsBoundingBox boundingBox;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Float score;

  public CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity() {
  }

  public CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity iouScore(Float iouScore) {
    this.iouScore = iouScore;
    return this;
  }

  /**
   * The intersection ratio between the detection bounding box and the mask.
   * @return iouScore
   */
  @javax.annotation.Nullable
  public Float getIouScore() {
    return iouScore;
  }

  public void setIouScore(Float iouScore) {
    this.iouScore = iouScore;
  }


  public CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the label
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity mid(String mid) {
    this.mid = mid;
    return this;
  }

  /**
   * MID of the label
   * @return mid
   */
  @javax.annotation.Nullable
  public String getMid() {
    return mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }


  public CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity boundingBox(CloudAiLargeModelsVisionRaiInfoDetectedLabelsBoundingBox boundingBox) {
    this.boundingBox = boundingBox;
    return this;
  }

  /**
   * Bounding box of the label
   * @return boundingBox
   */
  @javax.annotation.Nullable
  public CloudAiLargeModelsVisionRaiInfoDetectedLabelsBoundingBox getBoundingBox() {
    return boundingBox;
  }

  public void setBoundingBox(CloudAiLargeModelsVisionRaiInfoDetectedLabelsBoundingBox boundingBox) {
    this.boundingBox = boundingBox;
  }


  public CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity score(Float score) {
    this.score = score;
    return this;
  }

  /**
   * Confidence score of the label
   * @return score
   */
  @javax.annotation.Nullable
  public Float getScore() {
    return score;
  }

  public void setScore(Float score) {
    this.score = score;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity cloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity = (CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity) o;
    return Objects.equals(this.iouScore, cloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity.iouScore) &&
        Objects.equals(this.description, cloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity.description) &&
        Objects.equals(this.mid, cloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity.mid) &&
        Objects.equals(this.boundingBox, cloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity.boundingBox) &&
        Objects.equals(this.score, cloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iouScore, description, mid, boundingBox, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity {\n");
    sb.append("    iouScore: ").append(toIndentedString(iouScore)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
    openapiFields.add("iouScore");
    openapiFields.add("description");
    openapiFields.add("mid");
    openapiFields.add("boundingBox");
    openapiFields.add("score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity is not found in the empty JSON string", CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("mid") != null && !jsonObj.get("mid").isJsonNull()) && !jsonObj.get("mid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mid").toString()));
      }
      // validate the optional field `boundingBox`
      if (jsonObj.get("boundingBox") != null && !jsonObj.get("boundingBox").isJsonNull()) {
        CloudAiLargeModelsVisionRaiInfoDetectedLabelsBoundingBox.validateJsonElement(jsonObj.get("boundingBox"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity>() {
           @Override
           public void write(JsonWriter out, CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity
   * @throws IOException if the JSON string is invalid with respect to CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity
   */
  public static CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity.class);
  }

  /**
   * Convert an instance of CloudAiLargeModelsVisionRaiInfoDetectedLabelsEntity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
