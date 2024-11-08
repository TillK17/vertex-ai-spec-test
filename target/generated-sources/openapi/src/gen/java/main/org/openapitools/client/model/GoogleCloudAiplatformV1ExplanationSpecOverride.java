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
import org.openapitools.client.model.GoogleCloudAiplatformV1ExamplesOverride;
import org.openapitools.client.model.GoogleCloudAiplatformV1ExplanationMetadataOverride;
import org.openapitools.client.model.GoogleCloudAiplatformV1ExplanationParameters;

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
 * The ExplanationSpec entries that can be overridden at online explanation time.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ExplanationSpecOverride {
  public static final String SERIALIZED_NAME_EXAMPLES_OVERRIDE = "examplesOverride";
  @SerializedName(SERIALIZED_NAME_EXAMPLES_OVERRIDE)
  private GoogleCloudAiplatformV1ExamplesOverride examplesOverride;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private GoogleCloudAiplatformV1ExplanationParameters parameters;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private GoogleCloudAiplatformV1ExplanationMetadataOverride metadata;

  public GoogleCloudAiplatformV1ExplanationSpecOverride() {
  }

  public GoogleCloudAiplatformV1ExplanationSpecOverride examplesOverride(GoogleCloudAiplatformV1ExamplesOverride examplesOverride) {
    this.examplesOverride = examplesOverride;
    return this;
  }

  /**
   * The example-based explanations parameter overrides.
   * @return examplesOverride
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ExamplesOverride getExamplesOverride() {
    return examplesOverride;
  }

  public void setExamplesOverride(GoogleCloudAiplatformV1ExamplesOverride examplesOverride) {
    this.examplesOverride = examplesOverride;
  }


  public GoogleCloudAiplatformV1ExplanationSpecOverride parameters(GoogleCloudAiplatformV1ExplanationParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * The parameters to be overridden. Note that the attribution method cannot be changed. If not specified, no parameter is overridden.
   * @return parameters
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ExplanationParameters getParameters() {
    return parameters;
  }

  public void setParameters(GoogleCloudAiplatformV1ExplanationParameters parameters) {
    this.parameters = parameters;
  }


  public GoogleCloudAiplatformV1ExplanationSpecOverride metadata(GoogleCloudAiplatformV1ExplanationMetadataOverride metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The metadata to be overridden. If not specified, no metadata is overridden.
   * @return metadata
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ExplanationMetadataOverride getMetadata() {
    return metadata;
  }

  public void setMetadata(GoogleCloudAiplatformV1ExplanationMetadataOverride metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ExplanationSpecOverride googleCloudAiplatformV1ExplanationSpecOverride = (GoogleCloudAiplatformV1ExplanationSpecOverride) o;
    return Objects.equals(this.examplesOverride, googleCloudAiplatformV1ExplanationSpecOverride.examplesOverride) &&
        Objects.equals(this.parameters, googleCloudAiplatformV1ExplanationSpecOverride.parameters) &&
        Objects.equals(this.metadata, googleCloudAiplatformV1ExplanationSpecOverride.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(examplesOverride, parameters, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ExplanationSpecOverride {\n");
    sb.append("    examplesOverride: ").append(toIndentedString(examplesOverride)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("examplesOverride");
    openapiFields.add("parameters");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ExplanationSpecOverride
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ExplanationSpecOverride.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ExplanationSpecOverride is not found in the empty JSON string", GoogleCloudAiplatformV1ExplanationSpecOverride.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ExplanationSpecOverride.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ExplanationSpecOverride` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `examplesOverride`
      if (jsonObj.get("examplesOverride") != null && !jsonObj.get("examplesOverride").isJsonNull()) {
        GoogleCloudAiplatformV1ExamplesOverride.validateJsonElement(jsonObj.get("examplesOverride"));
      }
      // validate the optional field `parameters`
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        GoogleCloudAiplatformV1ExplanationParameters.validateJsonElement(jsonObj.get("parameters"));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        GoogleCloudAiplatformV1ExplanationMetadataOverride.validateJsonElement(jsonObj.get("metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ExplanationSpecOverride.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ExplanationSpecOverride' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ExplanationSpecOverride> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ExplanationSpecOverride.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ExplanationSpecOverride>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ExplanationSpecOverride value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ExplanationSpecOverride read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ExplanationSpecOverride given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ExplanationSpecOverride
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ExplanationSpecOverride
   */
  public static GoogleCloudAiplatformV1ExplanationSpecOverride fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ExplanationSpecOverride.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ExplanationSpecOverride to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

