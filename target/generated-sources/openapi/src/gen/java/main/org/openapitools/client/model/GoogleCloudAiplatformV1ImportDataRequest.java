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
import org.openapitools.client.model.GoogleCloudAiplatformV1ImportDataConfig;

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
 * Request message for DatasetService.ImportData.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ImportDataRequest {
  public static final String SERIALIZED_NAME_IMPORT_CONFIGS = "importConfigs";
  @SerializedName(SERIALIZED_NAME_IMPORT_CONFIGS)
  private List<GoogleCloudAiplatformV1ImportDataConfig> importConfigs = new ArrayList<>();

  public GoogleCloudAiplatformV1ImportDataRequest() {
  }

  public GoogleCloudAiplatformV1ImportDataRequest importConfigs(List<GoogleCloudAiplatformV1ImportDataConfig> importConfigs) {
    this.importConfigs = importConfigs;
    return this;
  }

  public GoogleCloudAiplatformV1ImportDataRequest addImportConfigsItem(GoogleCloudAiplatformV1ImportDataConfig importConfigsItem) {
    if (this.importConfigs == null) {
      this.importConfigs = new ArrayList<>();
    }
    this.importConfigs.add(importConfigsItem);
    return this;
  }

  /**
   * Required. The desired input locations. The contents of all input locations will be imported in one batch.
   * @return importConfigs
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1ImportDataConfig> getImportConfigs() {
    return importConfigs;
  }

  public void setImportConfigs(List<GoogleCloudAiplatformV1ImportDataConfig> importConfigs) {
    this.importConfigs = importConfigs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ImportDataRequest googleCloudAiplatformV1ImportDataRequest = (GoogleCloudAiplatformV1ImportDataRequest) o;
    return Objects.equals(this.importConfigs, googleCloudAiplatformV1ImportDataRequest.importConfigs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importConfigs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ImportDataRequest {\n");
    sb.append("    importConfigs: ").append(toIndentedString(importConfigs)).append("\n");
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
    openapiFields.add("importConfigs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ImportDataRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ImportDataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ImportDataRequest is not found in the empty JSON string", GoogleCloudAiplatformV1ImportDataRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ImportDataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ImportDataRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("importConfigs") != null && !jsonObj.get("importConfigs").isJsonNull()) {
        JsonArray jsonArrayimportConfigs = jsonObj.getAsJsonArray("importConfigs");
        if (jsonArrayimportConfigs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("importConfigs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `importConfigs` to be an array in the JSON string but got `%s`", jsonObj.get("importConfigs").toString()));
          }

          // validate the optional field `importConfigs` (array)
          for (int i = 0; i < jsonArrayimportConfigs.size(); i++) {
            GoogleCloudAiplatformV1ImportDataConfig.validateJsonElement(jsonArrayimportConfigs.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ImportDataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ImportDataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ImportDataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ImportDataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ImportDataRequest>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ImportDataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ImportDataRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ImportDataRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ImportDataRequest
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ImportDataRequest
   */
  public static GoogleCloudAiplatformV1ImportDataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ImportDataRequest.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ImportDataRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
