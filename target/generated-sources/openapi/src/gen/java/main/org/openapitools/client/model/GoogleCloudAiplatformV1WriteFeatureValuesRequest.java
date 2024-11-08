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
import org.openapitools.client.model.GoogleCloudAiplatformV1WriteFeatureValuesPayload;

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
 * Request message for FeaturestoreOnlineServingService.WriteFeatureValues.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1WriteFeatureValuesRequest {
  public static final String SERIALIZED_NAME_PAYLOADS = "payloads";
  @SerializedName(SERIALIZED_NAME_PAYLOADS)
  private List<GoogleCloudAiplatformV1WriteFeatureValuesPayload> payloads = new ArrayList<>();

  public GoogleCloudAiplatformV1WriteFeatureValuesRequest() {
  }

  public GoogleCloudAiplatformV1WriteFeatureValuesRequest payloads(List<GoogleCloudAiplatformV1WriteFeatureValuesPayload> payloads) {
    this.payloads = payloads;
    return this;
  }

  public GoogleCloudAiplatformV1WriteFeatureValuesRequest addPayloadsItem(GoogleCloudAiplatformV1WriteFeatureValuesPayload payloadsItem) {
    if (this.payloads == null) {
      this.payloads = new ArrayList<>();
    }
    this.payloads.add(payloadsItem);
    return this;
  }

  /**
   * Required. The entities to be written. Up to 100,000 feature values can be written across all &#x60;payloads&#x60;.
   * @return payloads
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1WriteFeatureValuesPayload> getPayloads() {
    return payloads;
  }

  public void setPayloads(List<GoogleCloudAiplatformV1WriteFeatureValuesPayload> payloads) {
    this.payloads = payloads;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1WriteFeatureValuesRequest googleCloudAiplatformV1WriteFeatureValuesRequest = (GoogleCloudAiplatformV1WriteFeatureValuesRequest) o;
    return Objects.equals(this.payloads, googleCloudAiplatformV1WriteFeatureValuesRequest.payloads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payloads);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1WriteFeatureValuesRequest {\n");
    sb.append("    payloads: ").append(toIndentedString(payloads)).append("\n");
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
    openapiFields.add("payloads");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1WriteFeatureValuesRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1WriteFeatureValuesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1WriteFeatureValuesRequest is not found in the empty JSON string", GoogleCloudAiplatformV1WriteFeatureValuesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1WriteFeatureValuesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1WriteFeatureValuesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("payloads") != null && !jsonObj.get("payloads").isJsonNull()) {
        JsonArray jsonArraypayloads = jsonObj.getAsJsonArray("payloads");
        if (jsonArraypayloads != null) {
          // ensure the json data is an array
          if (!jsonObj.get("payloads").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `payloads` to be an array in the JSON string but got `%s`", jsonObj.get("payloads").toString()));
          }

          // validate the optional field `payloads` (array)
          for (int i = 0; i < jsonArraypayloads.size(); i++) {
            GoogleCloudAiplatformV1WriteFeatureValuesPayload.validateJsonElement(jsonArraypayloads.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1WriteFeatureValuesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1WriteFeatureValuesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1WriteFeatureValuesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1WriteFeatureValuesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1WriteFeatureValuesRequest>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1WriteFeatureValuesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1WriteFeatureValuesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1WriteFeatureValuesRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1WriteFeatureValuesRequest
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1WriteFeatureValuesRequest
   */
  public static GoogleCloudAiplatformV1WriteFeatureValuesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1WriteFeatureValuesRequest.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1WriteFeatureValuesRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

