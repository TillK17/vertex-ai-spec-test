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
 * ID that is comprised from several parts (columns).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey {
  public static final String SERIALIZED_NAME_PARTS = "parts";
  @SerializedName(SERIALIZED_NAME_PARTS)
  private List<String> parts = new ArrayList<>();

  public GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey() {
  }

  public GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey parts(List<String> parts) {
    this.parts = parts;
    return this;
  }

  public GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey addPartsItem(String partsItem) {
    if (this.parts == null) {
      this.parts = new ArrayList<>();
    }
    this.parts.add(partsItem);
    return this;
  }

  /**
   * Parts to construct Entity ID. Should match with the same ID columns as defined in FeatureView in the same order.
   * @return parts
   */
  @javax.annotation.Nullable
  public List<String> getParts() {
    return parts;
  }

  public void setParts(List<String> parts) {
    this.parts = parts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey googleCloudAiplatformV1FeatureViewDataKeyCompositeKey = (GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey) o;
    return Objects.equals(this.parts, googleCloudAiplatformV1FeatureViewDataKeyCompositeKey.parts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey {\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
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
    openapiFields.add("parts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey is not found in the empty JSON string", GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("parts") != null && !jsonObj.get("parts").isJsonNull() && !jsonObj.get("parts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `parts` to be an array in the JSON string but got `%s`", jsonObj.get("parts").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey
   */
  public static GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1FeatureViewDataKeyCompositeKey to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
