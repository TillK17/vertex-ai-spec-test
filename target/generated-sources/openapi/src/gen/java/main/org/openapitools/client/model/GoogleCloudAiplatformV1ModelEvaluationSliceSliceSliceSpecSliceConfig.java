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
import org.openapitools.client.model.GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecRange;
import org.openapitools.client.model.GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecValue;

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
 * Specification message containing the config for this SliceSpec. When &#x60;kind&#x60; is selected as &#x60;value&#x60; and/or &#x60;range&#x60;, only a single slice will be computed. When &#x60;all_values&#x60; is present, a separate slice will be computed for each possible label/value for the corresponding key in &#x60;config&#x60;. Examples, with feature zip_code with values 12345, 23334, 88888 and feature country with values \&quot;US\&quot;, \&quot;Canada\&quot;, \&quot;Mexico\&quot; in the dataset: Example 1: { \&quot;zip_code\&quot;: { \&quot;value\&quot;: { \&quot;float_value\&quot;: 12345.0 } } } A single slice for any data with zip_code 12345 in the dataset. Example 2: { \&quot;zip_code\&quot;: { \&quot;range\&quot;: { \&quot;low\&quot;: 12345, \&quot;high\&quot;: 20000 } } } A single slice containing data where the zip_codes between 12345 and 20000 For this example, data with the zip_code of 12345 will be in this slice. Example 3: { \&quot;zip_code\&quot;: { \&quot;range\&quot;: { \&quot;low\&quot;: 10000, \&quot;high\&quot;: 20000 } }, \&quot;country\&quot;: { \&quot;value\&quot;: { \&quot;string_value\&quot;: \&quot;US\&quot; } } } A single slice containing data where the zip_codes between 10000 and 20000 has the country \&quot;US\&quot;. For this example, data with the zip_code of 12345 and country \&quot;US\&quot; will be in this slice. Example 4: { \&quot;country\&quot;: {\&quot;all_values\&quot;: { \&quot;value\&quot;: true } } } Three slices are computed, one for each unique country in the dataset. Example 5: { \&quot;country\&quot;: { \&quot;all_values\&quot;: { \&quot;value\&quot;: true } }, \&quot;zip_code\&quot;: { \&quot;value\&quot;: { \&quot;float_value\&quot;: 12345.0 } } } Three slices are computed, one for each unique country in the dataset where the zip_code is also 12345. For this example, data with zip_code 12345 and country \&quot;US\&quot; will be in one slice, zip_code 12345 and country \&quot;Canada\&quot; in another slice, and zip_code 12345 and country \&quot;Mexico\&quot; in another slice, totaling 3 slices.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecValue value;

  public static final String SERIALIZED_NAME_ALL_VALUES = "allValues";
  @SerializedName(SERIALIZED_NAME_ALL_VALUES)
  private Boolean allValues;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecRange range;

  public GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig() {
  }

  public GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig value(GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecValue value) {
    this.value = value;
    return this;
  }

  /**
   * A unique specific value for a given feature. Example: &#x60;{ \&quot;value\&quot;: { \&quot;string_value\&quot;: \&quot;12345\&quot; } }&#x60;
   * @return value
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecValue getValue() {
    return value;
  }

  public void setValue(GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecValue value) {
    this.value = value;
  }


  public GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig allValues(Boolean allValues) {
    this.allValues = allValues;
    return this;
  }

  /**
   * If all_values is set to true, then all possible labels of the keyed feature will have another slice computed. Example: &#x60;{\&quot;all_values\&quot;:{\&quot;value\&quot;:true}}&#x60;
   * @return allValues
   */
  @javax.annotation.Nullable
  public Boolean getAllValues() {
    return allValues;
  }

  public void setAllValues(Boolean allValues) {
    this.allValues = allValues;
  }


  public GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig range(GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecRange range) {
    this.range = range;
    return this;
  }

  /**
   * A range of values for a numerical feature. Example: &#x60;{\&quot;range\&quot;:{\&quot;low\&quot;:10000.0,\&quot;high\&quot;:50000.0}}&#x60; will capture 12345 and 23334 in the slice.
   * @return range
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecRange getRange() {
    return range;
  }

  public void setRange(GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecRange range) {
    this.range = range;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig googleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig = (GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig) o;
    return Objects.equals(this.value, googleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig.value) &&
        Objects.equals(this.allValues, googleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig.allValues) &&
        Objects.equals(this.range, googleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, allValues, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    allValues: ").append(toIndentedString(allValues)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("allValues");
    openapiFields.add("range");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig is not found in the empty JSON string", GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `value`
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) {
        GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecValue.validateJsonElement(jsonObj.get("value"));
      }
      // validate the optional field `range`
      if (jsonObj.get("range") != null && !jsonObj.get("range").isJsonNull()) {
        GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecRange.validateJsonElement(jsonObj.get("range"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig
   */
  public static GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpecSliceConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

