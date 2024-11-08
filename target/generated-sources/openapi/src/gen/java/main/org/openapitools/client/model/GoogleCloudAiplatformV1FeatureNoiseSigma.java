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
import org.openapitools.client.model.GoogleCloudAiplatformV1FeatureNoiseSigmaNoiseSigmaForFeature;

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
 * Noise sigma by features. Noise sigma represents the standard deviation of the gaussian kernel that will be used to add noise to interpolated inputs prior to computing gradients.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1FeatureNoiseSigma {
  public static final String SERIALIZED_NAME_NOISE_SIGMA = "noiseSigma";
  @SerializedName(SERIALIZED_NAME_NOISE_SIGMA)
  private List<GoogleCloudAiplatformV1FeatureNoiseSigmaNoiseSigmaForFeature> noiseSigma = new ArrayList<>();

  public GoogleCloudAiplatformV1FeatureNoiseSigma() {
  }

  public GoogleCloudAiplatformV1FeatureNoiseSigma noiseSigma(List<GoogleCloudAiplatformV1FeatureNoiseSigmaNoiseSigmaForFeature> noiseSigma) {
    this.noiseSigma = noiseSigma;
    return this;
  }

  public GoogleCloudAiplatformV1FeatureNoiseSigma addNoiseSigmaItem(GoogleCloudAiplatformV1FeatureNoiseSigmaNoiseSigmaForFeature noiseSigmaItem) {
    if (this.noiseSigma == null) {
      this.noiseSigma = new ArrayList<>();
    }
    this.noiseSigma.add(noiseSigmaItem);
    return this;
  }

  /**
   * Noise sigma per feature. No noise is added to features that are not set.
   * @return noiseSigma
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1FeatureNoiseSigmaNoiseSigmaForFeature> getNoiseSigma() {
    return noiseSigma;
  }

  public void setNoiseSigma(List<GoogleCloudAiplatformV1FeatureNoiseSigmaNoiseSigmaForFeature> noiseSigma) {
    this.noiseSigma = noiseSigma;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1FeatureNoiseSigma googleCloudAiplatformV1FeatureNoiseSigma = (GoogleCloudAiplatformV1FeatureNoiseSigma) o;
    return Objects.equals(this.noiseSigma, googleCloudAiplatformV1FeatureNoiseSigma.noiseSigma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noiseSigma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1FeatureNoiseSigma {\n");
    sb.append("    noiseSigma: ").append(toIndentedString(noiseSigma)).append("\n");
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
    openapiFields.add("noiseSigma");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1FeatureNoiseSigma
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1FeatureNoiseSigma.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1FeatureNoiseSigma is not found in the empty JSON string", GoogleCloudAiplatformV1FeatureNoiseSigma.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1FeatureNoiseSigma.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1FeatureNoiseSigma` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("noiseSigma") != null && !jsonObj.get("noiseSigma").isJsonNull()) {
        JsonArray jsonArraynoiseSigma = jsonObj.getAsJsonArray("noiseSigma");
        if (jsonArraynoiseSigma != null) {
          // ensure the json data is an array
          if (!jsonObj.get("noiseSigma").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `noiseSigma` to be an array in the JSON string but got `%s`", jsonObj.get("noiseSigma").toString()));
          }

          // validate the optional field `noiseSigma` (array)
          for (int i = 0; i < jsonArraynoiseSigma.size(); i++) {
            GoogleCloudAiplatformV1FeatureNoiseSigmaNoiseSigmaForFeature.validateJsonElement(jsonArraynoiseSigma.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1FeatureNoiseSigma.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1FeatureNoiseSigma' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1FeatureNoiseSigma> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1FeatureNoiseSigma.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1FeatureNoiseSigma>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1FeatureNoiseSigma value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1FeatureNoiseSigma read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1FeatureNoiseSigma given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1FeatureNoiseSigma
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1FeatureNoiseSigma
   */
  public static GoogleCloudAiplatformV1FeatureNoiseSigma fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1FeatureNoiseSigma.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1FeatureNoiseSigma to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

