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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.GoogleCloudAiplatformV1FeatureValue;

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
 * Contains Feature values to be written for a specific entity.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1WriteFeatureValuesPayload {
  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_FEATURE_VALUES = "featureValues";
  @SerializedName(SERIALIZED_NAME_FEATURE_VALUES)
  private Map<String, GoogleCloudAiplatformV1FeatureValue> featureValues = new HashMap<>();

  public GoogleCloudAiplatformV1WriteFeatureValuesPayload() {
  }

  public GoogleCloudAiplatformV1WriteFeatureValuesPayload entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Required. The ID of the entity.
   * @return entityId
   */
  @javax.annotation.Nullable
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public GoogleCloudAiplatformV1WriteFeatureValuesPayload featureValues(Map<String, GoogleCloudAiplatformV1FeatureValue> featureValues) {
    this.featureValues = featureValues;
    return this;
  }

  public GoogleCloudAiplatformV1WriteFeatureValuesPayload putFeatureValuesItem(String key, GoogleCloudAiplatformV1FeatureValue featureValuesItem) {
    if (this.featureValues == null) {
      this.featureValues = new HashMap<>();
    }
    this.featureValues.put(key, featureValuesItem);
    return this;
  }

  /**
   * Required. Feature values to be written, mapping from Feature ID to value. Up to 100,000 &#x60;feature_values&#x60; entries may be written across all payloads. The feature generation time, aligned by days, must be no older than five years (1825 days) and no later than one year (366 days) in the future.
   * @return featureValues
   */
  @javax.annotation.Nullable
  public Map<String, GoogleCloudAiplatformV1FeatureValue> getFeatureValues() {
    return featureValues;
  }

  public void setFeatureValues(Map<String, GoogleCloudAiplatformV1FeatureValue> featureValues) {
    this.featureValues = featureValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1WriteFeatureValuesPayload googleCloudAiplatformV1WriteFeatureValuesPayload = (GoogleCloudAiplatformV1WriteFeatureValuesPayload) o;
    return Objects.equals(this.entityId, googleCloudAiplatformV1WriteFeatureValuesPayload.entityId) &&
        Objects.equals(this.featureValues, googleCloudAiplatformV1WriteFeatureValuesPayload.featureValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, featureValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1WriteFeatureValuesPayload {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    featureValues: ").append(toIndentedString(featureValues)).append("\n");
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
    openapiFields.add("entityId");
    openapiFields.add("featureValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1WriteFeatureValuesPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1WriteFeatureValuesPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1WriteFeatureValuesPayload is not found in the empty JSON string", GoogleCloudAiplatformV1WriteFeatureValuesPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1WriteFeatureValuesPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1WriteFeatureValuesPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("entityId") != null && !jsonObj.get("entityId").isJsonNull()) && !jsonObj.get("entityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1WriteFeatureValuesPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1WriteFeatureValuesPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1WriteFeatureValuesPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1WriteFeatureValuesPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1WriteFeatureValuesPayload>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1WriteFeatureValuesPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1WriteFeatureValuesPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1WriteFeatureValuesPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1WriteFeatureValuesPayload
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1WriteFeatureValuesPayload
   */
  public static GoogleCloudAiplatformV1WriteFeatureValuesPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1WriteFeatureValuesPayload.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1WriteFeatureValuesPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
