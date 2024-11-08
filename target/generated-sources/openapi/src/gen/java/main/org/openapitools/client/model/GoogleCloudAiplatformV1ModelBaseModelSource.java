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
import org.openapitools.client.model.GoogleCloudAiplatformV1GenieSource;
import org.openapitools.client.model.GoogleCloudAiplatformV1ModelGardenSource;

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
 * User input field to specify the base model source. Currently it only supports specifing the Model Garden models and Genie models.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ModelBaseModelSource {
  public static final String SERIALIZED_NAME_GENIE_SOURCE = "genieSource";
  @SerializedName(SERIALIZED_NAME_GENIE_SOURCE)
  private GoogleCloudAiplatformV1GenieSource genieSource;

  public static final String SERIALIZED_NAME_MODEL_GARDEN_SOURCE = "modelGardenSource";
  @SerializedName(SERIALIZED_NAME_MODEL_GARDEN_SOURCE)
  private GoogleCloudAiplatformV1ModelGardenSource modelGardenSource;

  public GoogleCloudAiplatformV1ModelBaseModelSource() {
  }

  public GoogleCloudAiplatformV1ModelBaseModelSource genieSource(GoogleCloudAiplatformV1GenieSource genieSource) {
    this.genieSource = genieSource;
    return this;
  }

  /**
   * Information about the base model of Genie models.
   * @return genieSource
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1GenieSource getGenieSource() {
    return genieSource;
  }

  public void setGenieSource(GoogleCloudAiplatformV1GenieSource genieSource) {
    this.genieSource = genieSource;
  }


  public GoogleCloudAiplatformV1ModelBaseModelSource modelGardenSource(GoogleCloudAiplatformV1ModelGardenSource modelGardenSource) {
    this.modelGardenSource = modelGardenSource;
    return this;
  }

  /**
   * Source information of Model Garden models.
   * @return modelGardenSource
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ModelGardenSource getModelGardenSource() {
    return modelGardenSource;
  }

  public void setModelGardenSource(GoogleCloudAiplatformV1ModelGardenSource modelGardenSource) {
    this.modelGardenSource = modelGardenSource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ModelBaseModelSource googleCloudAiplatformV1ModelBaseModelSource = (GoogleCloudAiplatformV1ModelBaseModelSource) o;
    return Objects.equals(this.genieSource, googleCloudAiplatformV1ModelBaseModelSource.genieSource) &&
        Objects.equals(this.modelGardenSource, googleCloudAiplatformV1ModelBaseModelSource.modelGardenSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genieSource, modelGardenSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ModelBaseModelSource {\n");
    sb.append("    genieSource: ").append(toIndentedString(genieSource)).append("\n");
    sb.append("    modelGardenSource: ").append(toIndentedString(modelGardenSource)).append("\n");
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
    openapiFields.add("genieSource");
    openapiFields.add("modelGardenSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ModelBaseModelSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ModelBaseModelSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ModelBaseModelSource is not found in the empty JSON string", GoogleCloudAiplatformV1ModelBaseModelSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ModelBaseModelSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ModelBaseModelSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `genieSource`
      if (jsonObj.get("genieSource") != null && !jsonObj.get("genieSource").isJsonNull()) {
        GoogleCloudAiplatformV1GenieSource.validateJsonElement(jsonObj.get("genieSource"));
      }
      // validate the optional field `modelGardenSource`
      if (jsonObj.get("modelGardenSource") != null && !jsonObj.get("modelGardenSource").isJsonNull()) {
        GoogleCloudAiplatformV1ModelGardenSource.validateJsonElement(jsonObj.get("modelGardenSource"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ModelBaseModelSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ModelBaseModelSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ModelBaseModelSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ModelBaseModelSource.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ModelBaseModelSource>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ModelBaseModelSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ModelBaseModelSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ModelBaseModelSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ModelBaseModelSource
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ModelBaseModelSource
   */
  public static GoogleCloudAiplatformV1ModelBaseModelSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ModelBaseModelSource.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ModelBaseModelSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

