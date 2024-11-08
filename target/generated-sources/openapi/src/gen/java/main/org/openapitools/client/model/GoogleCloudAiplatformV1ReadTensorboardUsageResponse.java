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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.GoogleCloudAiplatformV1ReadTensorboardUsageResponsePerMonthUsageData;

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
 * Response message for TensorboardService.ReadTensorboardUsage.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ReadTensorboardUsageResponse {
  public static final String SERIALIZED_NAME_MONTHLY_USAGE_DATA = "monthlyUsageData";
  @SerializedName(SERIALIZED_NAME_MONTHLY_USAGE_DATA)
  private Map<String, GoogleCloudAiplatformV1ReadTensorboardUsageResponsePerMonthUsageData> monthlyUsageData = new HashMap<>();

  public GoogleCloudAiplatformV1ReadTensorboardUsageResponse() {
  }

  public GoogleCloudAiplatformV1ReadTensorboardUsageResponse monthlyUsageData(Map<String, GoogleCloudAiplatformV1ReadTensorboardUsageResponsePerMonthUsageData> monthlyUsageData) {
    this.monthlyUsageData = monthlyUsageData;
    return this;
  }

  public GoogleCloudAiplatformV1ReadTensorboardUsageResponse putMonthlyUsageDataItem(String key, GoogleCloudAiplatformV1ReadTensorboardUsageResponsePerMonthUsageData monthlyUsageDataItem) {
    if (this.monthlyUsageData == null) {
      this.monthlyUsageData = new HashMap<>();
    }
    this.monthlyUsageData.put(key, monthlyUsageDataItem);
    return this;
  }

  /**
   * Maps year-month (YYYYMM) string to per month usage data.
   * @return monthlyUsageData
   */
  @javax.annotation.Nullable
  public Map<String, GoogleCloudAiplatformV1ReadTensorboardUsageResponsePerMonthUsageData> getMonthlyUsageData() {
    return monthlyUsageData;
  }

  public void setMonthlyUsageData(Map<String, GoogleCloudAiplatformV1ReadTensorboardUsageResponsePerMonthUsageData> monthlyUsageData) {
    this.monthlyUsageData = monthlyUsageData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ReadTensorboardUsageResponse googleCloudAiplatformV1ReadTensorboardUsageResponse = (GoogleCloudAiplatformV1ReadTensorboardUsageResponse) o;
    return Objects.equals(this.monthlyUsageData, googleCloudAiplatformV1ReadTensorboardUsageResponse.monthlyUsageData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthlyUsageData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ReadTensorboardUsageResponse {\n");
    sb.append("    monthlyUsageData: ").append(toIndentedString(monthlyUsageData)).append("\n");
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
    openapiFields.add("monthlyUsageData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ReadTensorboardUsageResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ReadTensorboardUsageResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ReadTensorboardUsageResponse is not found in the empty JSON string", GoogleCloudAiplatformV1ReadTensorboardUsageResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ReadTensorboardUsageResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ReadTensorboardUsageResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ReadTensorboardUsageResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ReadTensorboardUsageResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ReadTensorboardUsageResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ReadTensorboardUsageResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ReadTensorboardUsageResponse>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ReadTensorboardUsageResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ReadTensorboardUsageResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ReadTensorboardUsageResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ReadTensorboardUsageResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ReadTensorboardUsageResponse
   */
  public static GoogleCloudAiplatformV1ReadTensorboardUsageResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ReadTensorboardUsageResponse.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ReadTensorboardUsageResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

