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
 * CloudAiLargeModelsVisionNamedBoundingBox
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class CloudAiLargeModelsVisionNamedBoundingBox {
  public static final String SERIALIZED_NAME_Y2 = "y2";
  @SerializedName(SERIALIZED_NAME_Y2)
  private Float y2;

  public static final String SERIALIZED_NAME_Y1 = "y1";
  @SerializedName(SERIALIZED_NAME_Y1)
  private Float y1;

  public static final String SERIALIZED_NAME_CLASSES = "classes";
  @SerializedName(SERIALIZED_NAME_CLASSES)
  private List<String> classes = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCORES = "scores";
  @SerializedName(SERIALIZED_NAME_SCORES)
  private List<Float> scores = new ArrayList<>();

  public static final String SERIALIZED_NAME_X1 = "x1";
  @SerializedName(SERIALIZED_NAME_X1)
  private Float x1;

  public static final String SERIALIZED_NAME_ENTITIES = "entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private List<String> entities = new ArrayList<>();

  public static final String SERIALIZED_NAME_X2 = "x2";
  @SerializedName(SERIALIZED_NAME_X2)
  private Float x2;

  public CloudAiLargeModelsVisionNamedBoundingBox() {
  }

  public CloudAiLargeModelsVisionNamedBoundingBox y2(Float y2) {
    this.y2 = y2;
    return this;
  }

  /**
   * Get y2
   * @return y2
   */
  @javax.annotation.Nullable
  public Float getY2() {
    return y2;
  }

  public void setY2(Float y2) {
    this.y2 = y2;
  }


  public CloudAiLargeModelsVisionNamedBoundingBox y1(Float y1) {
    this.y1 = y1;
    return this;
  }

  /**
   * Get y1
   * @return y1
   */
  @javax.annotation.Nullable
  public Float getY1() {
    return y1;
  }

  public void setY1(Float y1) {
    this.y1 = y1;
  }


  public CloudAiLargeModelsVisionNamedBoundingBox classes(List<String> classes) {
    this.classes = classes;
    return this;
  }

  public CloudAiLargeModelsVisionNamedBoundingBox addClassesItem(String classesItem) {
    if (this.classes == null) {
      this.classes = new ArrayList<>();
    }
    this.classes.add(classesItem);
    return this;
  }

  /**
   * Get classes
   * @return classes
   */
  @javax.annotation.Nullable
  public List<String> getClasses() {
    return classes;
  }

  public void setClasses(List<String> classes) {
    this.classes = classes;
  }


  public CloudAiLargeModelsVisionNamedBoundingBox scores(List<Float> scores) {
    this.scores = scores;
    return this;
  }

  public CloudAiLargeModelsVisionNamedBoundingBox addScoresItem(Float scoresItem) {
    if (this.scores == null) {
      this.scores = new ArrayList<>();
    }
    this.scores.add(scoresItem);
    return this;
  }

  /**
   * Get scores
   * @return scores
   */
  @javax.annotation.Nullable
  public List<Float> getScores() {
    return scores;
  }

  public void setScores(List<Float> scores) {
    this.scores = scores;
  }


  public CloudAiLargeModelsVisionNamedBoundingBox x1(Float x1) {
    this.x1 = x1;
    return this;
  }

  /**
   * Get x1
   * @return x1
   */
  @javax.annotation.Nullable
  public Float getX1() {
    return x1;
  }

  public void setX1(Float x1) {
    this.x1 = x1;
  }


  public CloudAiLargeModelsVisionNamedBoundingBox entities(List<String> entities) {
    this.entities = entities;
    return this;
  }

  public CloudAiLargeModelsVisionNamedBoundingBox addEntitiesItem(String entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * Get entities
   * @return entities
   */
  @javax.annotation.Nullable
  public List<String> getEntities() {
    return entities;
  }

  public void setEntities(List<String> entities) {
    this.entities = entities;
  }


  public CloudAiLargeModelsVisionNamedBoundingBox x2(Float x2) {
    this.x2 = x2;
    return this;
  }

  /**
   * Get x2
   * @return x2
   */
  @javax.annotation.Nullable
  public Float getX2() {
    return x2;
  }

  public void setX2(Float x2) {
    this.x2 = x2;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAiLargeModelsVisionNamedBoundingBox cloudAiLargeModelsVisionNamedBoundingBox = (CloudAiLargeModelsVisionNamedBoundingBox) o;
    return Objects.equals(this.y2, cloudAiLargeModelsVisionNamedBoundingBox.y2) &&
        Objects.equals(this.y1, cloudAiLargeModelsVisionNamedBoundingBox.y1) &&
        Objects.equals(this.classes, cloudAiLargeModelsVisionNamedBoundingBox.classes) &&
        Objects.equals(this.scores, cloudAiLargeModelsVisionNamedBoundingBox.scores) &&
        Objects.equals(this.x1, cloudAiLargeModelsVisionNamedBoundingBox.x1) &&
        Objects.equals(this.entities, cloudAiLargeModelsVisionNamedBoundingBox.entities) &&
        Objects.equals(this.x2, cloudAiLargeModelsVisionNamedBoundingBox.x2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(y2, y1, classes, scores, x1, entities, x2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAiLargeModelsVisionNamedBoundingBox {\n");
    sb.append("    y2: ").append(toIndentedString(y2)).append("\n");
    sb.append("    y1: ").append(toIndentedString(y1)).append("\n");
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
    sb.append("    x1: ").append(toIndentedString(x1)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    x2: ").append(toIndentedString(x2)).append("\n");
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
    openapiFields.add("y2");
    openapiFields.add("y1");
    openapiFields.add("classes");
    openapiFields.add("scores");
    openapiFields.add("x1");
    openapiFields.add("entities");
    openapiFields.add("x2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloudAiLargeModelsVisionNamedBoundingBox
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudAiLargeModelsVisionNamedBoundingBox.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudAiLargeModelsVisionNamedBoundingBox is not found in the empty JSON string", CloudAiLargeModelsVisionNamedBoundingBox.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudAiLargeModelsVisionNamedBoundingBox.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudAiLargeModelsVisionNamedBoundingBox` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("classes") != null && !jsonObj.get("classes").isJsonNull() && !jsonObj.get("classes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `classes` to be an array in the JSON string but got `%s`", jsonObj.get("classes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("scores") != null && !jsonObj.get("scores").isJsonNull() && !jsonObj.get("scores").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scores` to be an array in the JSON string but got `%s`", jsonObj.get("scores").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("entities") != null && !jsonObj.get("entities").isJsonNull() && !jsonObj.get("entities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `entities` to be an array in the JSON string but got `%s`", jsonObj.get("entities").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudAiLargeModelsVisionNamedBoundingBox.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudAiLargeModelsVisionNamedBoundingBox' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudAiLargeModelsVisionNamedBoundingBox> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudAiLargeModelsVisionNamedBoundingBox.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudAiLargeModelsVisionNamedBoundingBox>() {
           @Override
           public void write(JsonWriter out, CloudAiLargeModelsVisionNamedBoundingBox value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudAiLargeModelsVisionNamedBoundingBox read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CloudAiLargeModelsVisionNamedBoundingBox given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloudAiLargeModelsVisionNamedBoundingBox
   * @throws IOException if the JSON string is invalid with respect to CloudAiLargeModelsVisionNamedBoundingBox
   */
  public static CloudAiLargeModelsVisionNamedBoundingBox fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudAiLargeModelsVisionNamedBoundingBox.class);
  }

  /**
   * Convert an instance of CloudAiLargeModelsVisionNamedBoundingBox to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
