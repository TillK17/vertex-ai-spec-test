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
import org.openapitools.client.model.GoogleCloudAiplatformV1Feature;

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
 * Request message for FeaturestoreService.CreateFeature. Request message for FeatureRegistryService.CreateFeature.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1CreateFeatureRequest {
  public static final String SERIALIZED_NAME_FEATURE = "feature";
  @SerializedName(SERIALIZED_NAME_FEATURE)
  private GoogleCloudAiplatformV1Feature feature;

  public static final String SERIALIZED_NAME_FEATURE_ID = "featureId";
  @SerializedName(SERIALIZED_NAME_FEATURE_ID)
  private String featureId;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private String parent;

  public GoogleCloudAiplatformV1CreateFeatureRequest() {
  }

  public GoogleCloudAiplatformV1CreateFeatureRequest feature(GoogleCloudAiplatformV1Feature feature) {
    this.feature = feature;
    return this;
  }

  /**
   * Required. The Feature to create.
   * @return feature
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1Feature getFeature() {
    return feature;
  }

  public void setFeature(GoogleCloudAiplatformV1Feature feature) {
    this.feature = feature;
  }


  public GoogleCloudAiplatformV1CreateFeatureRequest featureId(String featureId) {
    this.featureId = featureId;
    return this;
  }

  /**
   * Required. The ID to use for the Feature, which will become the final component of the Feature&#39;s resource name. This value may be up to 128 characters, and valid characters are &#x60;[a-z0-9_]&#x60;. The first character cannot be a number. The value must be unique within an EntityType/FeatureGroup.
   * @return featureId
   */
  @javax.annotation.Nullable
  public String getFeatureId() {
    return featureId;
  }

  public void setFeatureId(String featureId) {
    this.featureId = featureId;
  }


  public GoogleCloudAiplatformV1CreateFeatureRequest parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Required. The resource name of the EntityType or FeatureGroup to create a Feature. Format for entity_type as parent: &#x60;projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}&#x60; Format for feature_group as parent: &#x60;projects/{project}/locations/{location}/featureGroups/{feature_group}&#x60;
   * @return parent
   */
  @javax.annotation.Nullable
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1CreateFeatureRequest googleCloudAiplatformV1CreateFeatureRequest = (GoogleCloudAiplatformV1CreateFeatureRequest) o;
    return Objects.equals(this.feature, googleCloudAiplatformV1CreateFeatureRequest.feature) &&
        Objects.equals(this.featureId, googleCloudAiplatformV1CreateFeatureRequest.featureId) &&
        Objects.equals(this.parent, googleCloudAiplatformV1CreateFeatureRequest.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feature, featureId, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1CreateFeatureRequest {\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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
    openapiFields.add("feature");
    openapiFields.add("featureId");
    openapiFields.add("parent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1CreateFeatureRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1CreateFeatureRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1CreateFeatureRequest is not found in the empty JSON string", GoogleCloudAiplatformV1CreateFeatureRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1CreateFeatureRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1CreateFeatureRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `feature`
      if (jsonObj.get("feature") != null && !jsonObj.get("feature").isJsonNull()) {
        GoogleCloudAiplatformV1Feature.validateJsonElement(jsonObj.get("feature"));
      }
      if ((jsonObj.get("featureId") != null && !jsonObj.get("featureId").isJsonNull()) && !jsonObj.get("featureId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `featureId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("featureId").toString()));
      }
      if ((jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) && !jsonObj.get("parent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1CreateFeatureRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1CreateFeatureRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1CreateFeatureRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1CreateFeatureRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1CreateFeatureRequest>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1CreateFeatureRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1CreateFeatureRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1CreateFeatureRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1CreateFeatureRequest
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1CreateFeatureRequest
   */
  public static GoogleCloudAiplatformV1CreateFeatureRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1CreateFeatureRequest.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1CreateFeatureRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
