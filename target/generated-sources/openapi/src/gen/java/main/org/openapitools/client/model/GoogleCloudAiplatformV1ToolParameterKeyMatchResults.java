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
import org.openapitools.client.model.GoogleCloudAiplatformV1ToolParameterKeyMatchMetricValue;

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
 * Results for tool parameter key match metric.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ToolParameterKeyMatchResults {
  public static final String SERIALIZED_NAME_TOOL_PARAMETER_KEY_MATCH_METRIC_VALUES = "toolParameterKeyMatchMetricValues";
  @SerializedName(SERIALIZED_NAME_TOOL_PARAMETER_KEY_MATCH_METRIC_VALUES)
  private List<GoogleCloudAiplatformV1ToolParameterKeyMatchMetricValue> toolParameterKeyMatchMetricValues = new ArrayList<>();

  public GoogleCloudAiplatformV1ToolParameterKeyMatchResults() {
  }

  public GoogleCloudAiplatformV1ToolParameterKeyMatchResults toolParameterKeyMatchMetricValues(List<GoogleCloudAiplatformV1ToolParameterKeyMatchMetricValue> toolParameterKeyMatchMetricValues) {
    this.toolParameterKeyMatchMetricValues = toolParameterKeyMatchMetricValues;
    return this;
  }

  public GoogleCloudAiplatformV1ToolParameterKeyMatchResults addToolParameterKeyMatchMetricValuesItem(GoogleCloudAiplatformV1ToolParameterKeyMatchMetricValue toolParameterKeyMatchMetricValuesItem) {
    if (this.toolParameterKeyMatchMetricValues == null) {
      this.toolParameterKeyMatchMetricValues = new ArrayList<>();
    }
    this.toolParameterKeyMatchMetricValues.add(toolParameterKeyMatchMetricValuesItem);
    return this;
  }

  /**
   * Output only. Tool parameter key match metric values.
   * @return toolParameterKeyMatchMetricValues
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1ToolParameterKeyMatchMetricValue> getToolParameterKeyMatchMetricValues() {
    return toolParameterKeyMatchMetricValues;
  }

  public void setToolParameterKeyMatchMetricValues(List<GoogleCloudAiplatformV1ToolParameterKeyMatchMetricValue> toolParameterKeyMatchMetricValues) {
    this.toolParameterKeyMatchMetricValues = toolParameterKeyMatchMetricValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ToolParameterKeyMatchResults googleCloudAiplatformV1ToolParameterKeyMatchResults = (GoogleCloudAiplatformV1ToolParameterKeyMatchResults) o;
    return Objects.equals(this.toolParameterKeyMatchMetricValues, googleCloudAiplatformV1ToolParameterKeyMatchResults.toolParameterKeyMatchMetricValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolParameterKeyMatchMetricValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ToolParameterKeyMatchResults {\n");
    sb.append("    toolParameterKeyMatchMetricValues: ").append(toIndentedString(toolParameterKeyMatchMetricValues)).append("\n");
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
    openapiFields.add("toolParameterKeyMatchMetricValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ToolParameterKeyMatchResults
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ToolParameterKeyMatchResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ToolParameterKeyMatchResults is not found in the empty JSON string", GoogleCloudAiplatformV1ToolParameterKeyMatchResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ToolParameterKeyMatchResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ToolParameterKeyMatchResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("toolParameterKeyMatchMetricValues") != null && !jsonObj.get("toolParameterKeyMatchMetricValues").isJsonNull()) {
        JsonArray jsonArraytoolParameterKeyMatchMetricValues = jsonObj.getAsJsonArray("toolParameterKeyMatchMetricValues");
        if (jsonArraytoolParameterKeyMatchMetricValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("toolParameterKeyMatchMetricValues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `toolParameterKeyMatchMetricValues` to be an array in the JSON string but got `%s`", jsonObj.get("toolParameterKeyMatchMetricValues").toString()));
          }

          // validate the optional field `toolParameterKeyMatchMetricValues` (array)
          for (int i = 0; i < jsonArraytoolParameterKeyMatchMetricValues.size(); i++) {
            GoogleCloudAiplatformV1ToolParameterKeyMatchMetricValue.validateJsonElement(jsonArraytoolParameterKeyMatchMetricValues.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ToolParameterKeyMatchResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ToolParameterKeyMatchResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ToolParameterKeyMatchResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ToolParameterKeyMatchResults.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ToolParameterKeyMatchResults>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ToolParameterKeyMatchResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ToolParameterKeyMatchResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ToolParameterKeyMatchResults given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ToolParameterKeyMatchResults
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ToolParameterKeyMatchResults
   */
  public static GoogleCloudAiplatformV1ToolParameterKeyMatchResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ToolParameterKeyMatchResults.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ToolParameterKeyMatchResults to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
