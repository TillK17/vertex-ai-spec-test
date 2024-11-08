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
import org.openapitools.client.model.GoogleCloudAiplatformV1MigrateResourceResponse;

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
 * Response message for MigrationService.BatchMigrateResources.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1BatchMigrateResourcesResponse {
  public static final String SERIALIZED_NAME_MIGRATE_RESOURCE_RESPONSES = "migrateResourceResponses";
  @SerializedName(SERIALIZED_NAME_MIGRATE_RESOURCE_RESPONSES)
  private List<GoogleCloudAiplatformV1MigrateResourceResponse> migrateResourceResponses = new ArrayList<>();

  public GoogleCloudAiplatformV1BatchMigrateResourcesResponse() {
  }

  public GoogleCloudAiplatformV1BatchMigrateResourcesResponse migrateResourceResponses(List<GoogleCloudAiplatformV1MigrateResourceResponse> migrateResourceResponses) {
    this.migrateResourceResponses = migrateResourceResponses;
    return this;
  }

  public GoogleCloudAiplatformV1BatchMigrateResourcesResponse addMigrateResourceResponsesItem(GoogleCloudAiplatformV1MigrateResourceResponse migrateResourceResponsesItem) {
    if (this.migrateResourceResponses == null) {
      this.migrateResourceResponses = new ArrayList<>();
    }
    this.migrateResourceResponses.add(migrateResourceResponsesItem);
    return this;
  }

  /**
   * Successfully migrated resources.
   * @return migrateResourceResponses
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1MigrateResourceResponse> getMigrateResourceResponses() {
    return migrateResourceResponses;
  }

  public void setMigrateResourceResponses(List<GoogleCloudAiplatformV1MigrateResourceResponse> migrateResourceResponses) {
    this.migrateResourceResponses = migrateResourceResponses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1BatchMigrateResourcesResponse googleCloudAiplatformV1BatchMigrateResourcesResponse = (GoogleCloudAiplatformV1BatchMigrateResourcesResponse) o;
    return Objects.equals(this.migrateResourceResponses, googleCloudAiplatformV1BatchMigrateResourcesResponse.migrateResourceResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migrateResourceResponses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1BatchMigrateResourcesResponse {\n");
    sb.append("    migrateResourceResponses: ").append(toIndentedString(migrateResourceResponses)).append("\n");
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
    openapiFields.add("migrateResourceResponses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1BatchMigrateResourcesResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1BatchMigrateResourcesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1BatchMigrateResourcesResponse is not found in the empty JSON string", GoogleCloudAiplatformV1BatchMigrateResourcesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1BatchMigrateResourcesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1BatchMigrateResourcesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("migrateResourceResponses") != null && !jsonObj.get("migrateResourceResponses").isJsonNull()) {
        JsonArray jsonArraymigrateResourceResponses = jsonObj.getAsJsonArray("migrateResourceResponses");
        if (jsonArraymigrateResourceResponses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("migrateResourceResponses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `migrateResourceResponses` to be an array in the JSON string but got `%s`", jsonObj.get("migrateResourceResponses").toString()));
          }

          // validate the optional field `migrateResourceResponses` (array)
          for (int i = 0; i < jsonArraymigrateResourceResponses.size(); i++) {
            GoogleCloudAiplatformV1MigrateResourceResponse.validateJsonElement(jsonArraymigrateResourceResponses.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1BatchMigrateResourcesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1BatchMigrateResourcesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1BatchMigrateResourcesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1BatchMigrateResourcesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1BatchMigrateResourcesResponse>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1BatchMigrateResourcesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1BatchMigrateResourcesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1BatchMigrateResourcesResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1BatchMigrateResourcesResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1BatchMigrateResourcesResponse
   */
  public static GoogleCloudAiplatformV1BatchMigrateResourcesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1BatchMigrateResourcesResponse.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1BatchMigrateResourcesResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

