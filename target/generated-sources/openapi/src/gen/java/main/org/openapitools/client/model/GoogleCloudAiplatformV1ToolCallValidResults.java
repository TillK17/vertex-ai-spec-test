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
import org.openapitools.client.model.GoogleCloudAiplatformV1ToolCallValidMetricValue;

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
 * Results for tool call valid metric.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ToolCallValidResults {
  public static final String SERIALIZED_NAME_TOOL_CALL_VALID_METRIC_VALUES = "toolCallValidMetricValues";
  @SerializedName(SERIALIZED_NAME_TOOL_CALL_VALID_METRIC_VALUES)
  private List<GoogleCloudAiplatformV1ToolCallValidMetricValue> toolCallValidMetricValues = new ArrayList<>();

  public GoogleCloudAiplatformV1ToolCallValidResults() {
  }

  public GoogleCloudAiplatformV1ToolCallValidResults toolCallValidMetricValues(List<GoogleCloudAiplatformV1ToolCallValidMetricValue> toolCallValidMetricValues) {
    this.toolCallValidMetricValues = toolCallValidMetricValues;
    return this;
  }

  public GoogleCloudAiplatformV1ToolCallValidResults addToolCallValidMetricValuesItem(GoogleCloudAiplatformV1ToolCallValidMetricValue toolCallValidMetricValuesItem) {
    if (this.toolCallValidMetricValues == null) {
      this.toolCallValidMetricValues = new ArrayList<>();
    }
    this.toolCallValidMetricValues.add(toolCallValidMetricValuesItem);
    return this;
  }

  /**
   * Output only. Tool call valid metric values.
   * @return toolCallValidMetricValues
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1ToolCallValidMetricValue> getToolCallValidMetricValues() {
    return toolCallValidMetricValues;
  }

  public void setToolCallValidMetricValues(List<GoogleCloudAiplatformV1ToolCallValidMetricValue> toolCallValidMetricValues) {
    this.toolCallValidMetricValues = toolCallValidMetricValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ToolCallValidResults googleCloudAiplatformV1ToolCallValidResults = (GoogleCloudAiplatformV1ToolCallValidResults) o;
    return Objects.equals(this.toolCallValidMetricValues, googleCloudAiplatformV1ToolCallValidResults.toolCallValidMetricValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolCallValidMetricValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ToolCallValidResults {\n");
    sb.append("    toolCallValidMetricValues: ").append(toIndentedString(toolCallValidMetricValues)).append("\n");
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
    openapiFields.add("toolCallValidMetricValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ToolCallValidResults
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ToolCallValidResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ToolCallValidResults is not found in the empty JSON string", GoogleCloudAiplatformV1ToolCallValidResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ToolCallValidResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ToolCallValidResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("toolCallValidMetricValues") != null && !jsonObj.get("toolCallValidMetricValues").isJsonNull()) {
        JsonArray jsonArraytoolCallValidMetricValues = jsonObj.getAsJsonArray("toolCallValidMetricValues");
        if (jsonArraytoolCallValidMetricValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("toolCallValidMetricValues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `toolCallValidMetricValues` to be an array in the JSON string but got `%s`", jsonObj.get("toolCallValidMetricValues").toString()));
          }

          // validate the optional field `toolCallValidMetricValues` (array)
          for (int i = 0; i < jsonArraytoolCallValidMetricValues.size(); i++) {
            GoogleCloudAiplatformV1ToolCallValidMetricValue.validateJsonElement(jsonArraytoolCallValidMetricValues.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ToolCallValidResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ToolCallValidResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ToolCallValidResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ToolCallValidResults.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ToolCallValidResults>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ToolCallValidResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ToolCallValidResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ToolCallValidResults given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ToolCallValidResults
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ToolCallValidResults
   */
  public static GoogleCloudAiplatformV1ToolCallValidResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ToolCallValidResults.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ToolCallValidResults to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

