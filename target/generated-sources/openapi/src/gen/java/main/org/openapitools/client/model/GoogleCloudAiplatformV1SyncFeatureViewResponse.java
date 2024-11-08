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
 * Response message for FeatureOnlineStoreAdminService.SyncFeatureView.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SyncFeatureViewResponse {
  public static final String SERIALIZED_NAME_FEATURE_VIEW_SYNC = "featureViewSync";
  @SerializedName(SERIALIZED_NAME_FEATURE_VIEW_SYNC)
  private String featureViewSync;

  public GoogleCloudAiplatformV1SyncFeatureViewResponse() {
  }

  public GoogleCloudAiplatformV1SyncFeatureViewResponse featureViewSync(String featureViewSync) {
    this.featureViewSync = featureViewSync;
    return this;
  }

  /**
   * Format: &#x60;projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}/featureViews/{feature_view}/featureViewSyncs/{feature_view_sync}&#x60;
   * @return featureViewSync
   */
  @javax.annotation.Nullable
  public String getFeatureViewSync() {
    return featureViewSync;
  }

  public void setFeatureViewSync(String featureViewSync) {
    this.featureViewSync = featureViewSync;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SyncFeatureViewResponse googleCloudAiplatformV1SyncFeatureViewResponse = (GoogleCloudAiplatformV1SyncFeatureViewResponse) o;
    return Objects.equals(this.featureViewSync, googleCloudAiplatformV1SyncFeatureViewResponse.featureViewSync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureViewSync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SyncFeatureViewResponse {\n");
    sb.append("    featureViewSync: ").append(toIndentedString(featureViewSync)).append("\n");
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
    openapiFields.add("featureViewSync");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SyncFeatureViewResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SyncFeatureViewResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SyncFeatureViewResponse is not found in the empty JSON string", GoogleCloudAiplatformV1SyncFeatureViewResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SyncFeatureViewResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SyncFeatureViewResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("featureViewSync") != null && !jsonObj.get("featureViewSync").isJsonNull()) && !jsonObj.get("featureViewSync").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `featureViewSync` to be a primitive type in the JSON string but got `%s`", jsonObj.get("featureViewSync").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SyncFeatureViewResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SyncFeatureViewResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SyncFeatureViewResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SyncFeatureViewResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SyncFeatureViewResponse>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SyncFeatureViewResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SyncFeatureViewResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SyncFeatureViewResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SyncFeatureViewResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SyncFeatureViewResponse
   */
  public static GoogleCloudAiplatformV1SyncFeatureViewResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SyncFeatureViewResponse.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SyncFeatureViewResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

