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
import org.openapitools.client.model.GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityViewData;

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
 * Entity view with Feature values.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityViewData> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView() {
  }

  public GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView data(List<GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityViewData> data) {
    this.data = data;
    return this;
  }

  public GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView addDataItem(GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityViewData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Each piece of data holds the k requested values for one requested Feature. If no values for the requested Feature exist, the corresponding cell will be empty. This has the same size and is in the same order as the features from the header ReadFeatureValuesResponse.header.
   * @return data
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityViewData> getData() {
    return data;
  }

  public void setData(List<GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityViewData> data) {
    this.data = data;
  }


  public GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * ID of the requested entity.
   * @return entityId
   */
  @javax.annotation.Nullable
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView googleCloudAiplatformV1ReadFeatureValuesResponseEntityView = (GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView) o;
    return Objects.equals(this.data, googleCloudAiplatformV1ReadFeatureValuesResponseEntityView.data) &&
        Objects.equals(this.entityId, googleCloudAiplatformV1ReadFeatureValuesResponseEntityView.entityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, entityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("entityId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView is not found in the empty JSON string", GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityViewData.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
      if ((jsonObj.get("entityId") != null && !jsonObj.get("entityId").isJsonNull()) && !jsonObj.get("entityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView
   */
  public static GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityView to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
