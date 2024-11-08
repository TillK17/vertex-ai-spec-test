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
import org.openapitools.client.model.GoogleCloudAiplatformV1DestinationFeatureSetting;
import org.openapitools.client.model.GoogleCloudAiplatformV1FeatureSelector;

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
 * Selects Features of an EntityType to read values of and specifies read settings.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec {
  public static final String SERIALIZED_NAME_FEATURE_SELECTOR = "featureSelector";
  @SerializedName(SERIALIZED_NAME_FEATURE_SELECTOR)
  private GoogleCloudAiplatformV1FeatureSelector featureSelector;

  public static final String SERIALIZED_NAME_ENTITY_TYPE_ID = "entityTypeId";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE_ID)
  private String entityTypeId;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private List<GoogleCloudAiplatformV1DestinationFeatureSetting> settings = new ArrayList<>();

  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec() {
  }

  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec featureSelector(GoogleCloudAiplatformV1FeatureSelector featureSelector) {
    this.featureSelector = featureSelector;
    return this;
  }

  /**
   * Required. Selectors choosing which Feature values to read from the EntityType.
   * @return featureSelector
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1FeatureSelector getFeatureSelector() {
    return featureSelector;
  }

  public void setFeatureSelector(GoogleCloudAiplatformV1FeatureSelector featureSelector) {
    this.featureSelector = featureSelector;
  }


  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec entityTypeId(String entityTypeId) {
    this.entityTypeId = entityTypeId;
    return this;
  }

  /**
   * Required. ID of the EntityType to select Features. The EntityType id is the entity_type_id specified during EntityType creation.
   * @return entityTypeId
   */
  @javax.annotation.Nullable
  public String getEntityTypeId() {
    return entityTypeId;
  }

  public void setEntityTypeId(String entityTypeId) {
    this.entityTypeId = entityTypeId;
  }


  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec settings(List<GoogleCloudAiplatformV1DestinationFeatureSetting> settings) {
    this.settings = settings;
    return this;
  }

  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec addSettingsItem(GoogleCloudAiplatformV1DestinationFeatureSetting settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<>();
    }
    this.settings.add(settingsItem);
    return this;
  }

  /**
   * Per-Feature settings for the batch read.
   * @return settings
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1DestinationFeatureSetting> getSettings() {
    return settings;
  }

  public void setSettings(List<GoogleCloudAiplatformV1DestinationFeatureSetting> settings) {
    this.settings = settings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec googleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec = (GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec) o;
    return Objects.equals(this.featureSelector, googleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec.featureSelector) &&
        Objects.equals(this.entityTypeId, googleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec.entityTypeId) &&
        Objects.equals(this.settings, googleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureSelector, entityTypeId, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec {\n");
    sb.append("    featureSelector: ").append(toIndentedString(featureSelector)).append("\n");
    sb.append("    entityTypeId: ").append(toIndentedString(entityTypeId)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
    openapiFields.add("featureSelector");
    openapiFields.add("entityTypeId");
    openapiFields.add("settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec is not found in the empty JSON string", GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `featureSelector`
      if (jsonObj.get("featureSelector") != null && !jsonObj.get("featureSelector").isJsonNull()) {
        GoogleCloudAiplatformV1FeatureSelector.validateJsonElement(jsonObj.get("featureSelector"));
      }
      if ((jsonObj.get("entityTypeId") != null && !jsonObj.get("entityTypeId").isJsonNull()) && !jsonObj.get("entityTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityTypeId").toString()));
      }
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        JsonArray jsonArraysettings = jsonObj.getAsJsonArray("settings");
        if (jsonArraysettings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("settings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `settings` to be an array in the JSON string but got `%s`", jsonObj.get("settings").toString()));
          }

          // validate the optional field `settings` (array)
          for (int i = 0; i < jsonArraysettings.size(); i++) {
            GoogleCloudAiplatformV1DestinationFeatureSetting.validateJsonElement(jsonArraysettings.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec
   */
  public static GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

