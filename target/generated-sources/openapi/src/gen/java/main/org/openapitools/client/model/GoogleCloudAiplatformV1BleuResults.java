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
import org.openapitools.client.model.GoogleCloudAiplatformV1BleuMetricValue;

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
 * Results for bleu metric.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1BleuResults {
  public static final String SERIALIZED_NAME_BLEU_METRIC_VALUES = "bleuMetricValues";
  @SerializedName(SERIALIZED_NAME_BLEU_METRIC_VALUES)
  private List<GoogleCloudAiplatformV1BleuMetricValue> bleuMetricValues = new ArrayList<>();

  public GoogleCloudAiplatformV1BleuResults() {
  }

  public GoogleCloudAiplatformV1BleuResults bleuMetricValues(List<GoogleCloudAiplatformV1BleuMetricValue> bleuMetricValues) {
    this.bleuMetricValues = bleuMetricValues;
    return this;
  }

  public GoogleCloudAiplatformV1BleuResults addBleuMetricValuesItem(GoogleCloudAiplatformV1BleuMetricValue bleuMetricValuesItem) {
    if (this.bleuMetricValues == null) {
      this.bleuMetricValues = new ArrayList<>();
    }
    this.bleuMetricValues.add(bleuMetricValuesItem);
    return this;
  }

  /**
   * Output only. Bleu metric values.
   * @return bleuMetricValues
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1BleuMetricValue> getBleuMetricValues() {
    return bleuMetricValues;
  }

  public void setBleuMetricValues(List<GoogleCloudAiplatformV1BleuMetricValue> bleuMetricValues) {
    this.bleuMetricValues = bleuMetricValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1BleuResults googleCloudAiplatformV1BleuResults = (GoogleCloudAiplatformV1BleuResults) o;
    return Objects.equals(this.bleuMetricValues, googleCloudAiplatformV1BleuResults.bleuMetricValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bleuMetricValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1BleuResults {\n");
    sb.append("    bleuMetricValues: ").append(toIndentedString(bleuMetricValues)).append("\n");
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
    openapiFields.add("bleuMetricValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1BleuResults
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1BleuResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1BleuResults is not found in the empty JSON string", GoogleCloudAiplatformV1BleuResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1BleuResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1BleuResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("bleuMetricValues") != null && !jsonObj.get("bleuMetricValues").isJsonNull()) {
        JsonArray jsonArraybleuMetricValues = jsonObj.getAsJsonArray("bleuMetricValues");
        if (jsonArraybleuMetricValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("bleuMetricValues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `bleuMetricValues` to be an array in the JSON string but got `%s`", jsonObj.get("bleuMetricValues").toString()));
          }

          // validate the optional field `bleuMetricValues` (array)
          for (int i = 0; i < jsonArraybleuMetricValues.size(); i++) {
            GoogleCloudAiplatformV1BleuMetricValue.validateJsonElement(jsonArraybleuMetricValues.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1BleuResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1BleuResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1BleuResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1BleuResults.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1BleuResults>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1BleuResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1BleuResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1BleuResults given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1BleuResults
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1BleuResults
   */
  public static GoogleCloudAiplatformV1BleuResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1BleuResults.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1BleuResults to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

