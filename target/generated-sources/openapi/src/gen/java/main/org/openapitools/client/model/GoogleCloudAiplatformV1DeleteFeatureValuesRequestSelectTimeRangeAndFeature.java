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
import org.openapitools.client.model.GoogleCloudAiplatformV1FeatureSelector;
import org.openapitools.client.model.GoogleTypeInterval;

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
 * Message to select time range and feature. Values of the selected feature generated within an inclusive time range will be deleted. Using this option permanently deletes the feature values from the specified feature IDs within the specified time range. This might include data from the online storage. If you want to retain any deleted historical data in the online storage, you must re-ingest it.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature {
  public static final String SERIALIZED_NAME_TIME_RANGE = "timeRange";
  @SerializedName(SERIALIZED_NAME_TIME_RANGE)
  private GoogleTypeInterval timeRange;

  public static final String SERIALIZED_NAME_SKIP_ONLINE_STORAGE_DELETE = "skipOnlineStorageDelete";
  @SerializedName(SERIALIZED_NAME_SKIP_ONLINE_STORAGE_DELETE)
  private Boolean skipOnlineStorageDelete;

  public static final String SERIALIZED_NAME_FEATURE_SELECTOR = "featureSelector";
  @SerializedName(SERIALIZED_NAME_FEATURE_SELECTOR)
  private GoogleCloudAiplatformV1FeatureSelector featureSelector;

  public GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature() {
  }

  public GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature timeRange(GoogleTypeInterval timeRange) {
    this.timeRange = timeRange;
    return this;
  }

  /**
   * Required. Select feature generated within a half-inclusive time range. The time range is lower inclusive and upper exclusive.
   * @return timeRange
   */
  @javax.annotation.Nullable
  public GoogleTypeInterval getTimeRange() {
    return timeRange;
  }

  public void setTimeRange(GoogleTypeInterval timeRange) {
    this.timeRange = timeRange;
  }


  public GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature skipOnlineStorageDelete(Boolean skipOnlineStorageDelete) {
    this.skipOnlineStorageDelete = skipOnlineStorageDelete;
    return this;
  }

  /**
   * If set, data will not be deleted from online storage. When time range is older than the data in online storage, setting this to be true will make the deletion have no impact on online serving.
   * @return skipOnlineStorageDelete
   */
  @javax.annotation.Nullable
  public Boolean getSkipOnlineStorageDelete() {
    return skipOnlineStorageDelete;
  }

  public void setSkipOnlineStorageDelete(Boolean skipOnlineStorageDelete) {
    this.skipOnlineStorageDelete = skipOnlineStorageDelete;
  }


  public GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature featureSelector(GoogleCloudAiplatformV1FeatureSelector featureSelector) {
    this.featureSelector = featureSelector;
    return this;
  }

  /**
   * Required. Selectors choosing which feature values to be deleted from the EntityType.
   * @return featureSelector
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1FeatureSelector getFeatureSelector() {
    return featureSelector;
  }

  public void setFeatureSelector(GoogleCloudAiplatformV1FeatureSelector featureSelector) {
    this.featureSelector = featureSelector;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature googleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature = (GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature) o;
    return Objects.equals(this.timeRange, googleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature.timeRange) &&
        Objects.equals(this.skipOnlineStorageDelete, googleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature.skipOnlineStorageDelete) &&
        Objects.equals(this.featureSelector, googleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature.featureSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeRange, skipOnlineStorageDelete, featureSelector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature {\n");
    sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
    sb.append("    skipOnlineStorageDelete: ").append(toIndentedString(skipOnlineStorageDelete)).append("\n");
    sb.append("    featureSelector: ").append(toIndentedString(featureSelector)).append("\n");
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
    openapiFields.add("timeRange");
    openapiFields.add("skipOnlineStorageDelete");
    openapiFields.add("featureSelector");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature is not found in the empty JSON string", GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `timeRange`
      if (jsonObj.get("timeRange") != null && !jsonObj.get("timeRange").isJsonNull()) {
        GoogleTypeInterval.validateJsonElement(jsonObj.get("timeRange"));
      }
      // validate the optional field `featureSelector`
      if (jsonObj.get("featureSelector") != null && !jsonObj.get("featureSelector").isJsonNull()) {
        GoogleCloudAiplatformV1FeatureSelector.validateJsonElement(jsonObj.get("featureSelector"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature
   */
  public static GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

