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
 * Spec for question answering quality score metric.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1QuestionAnsweringQualitySpec {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_USE_REFERENCE = "useReference";
  @SerializedName(SERIALIZED_NAME_USE_REFERENCE)
  private Boolean useReference;

  public GoogleCloudAiplatformV1QuestionAnsweringQualitySpec() {
  }

  public GoogleCloudAiplatformV1QuestionAnsweringQualitySpec version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Optional. Which version to use for evaluation.
   * @return version
   */
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  public GoogleCloudAiplatformV1QuestionAnsweringQualitySpec useReference(Boolean useReference) {
    this.useReference = useReference;
    return this;
  }

  /**
   * Optional. Whether to use instance.reference to compute question answering quality.
   * @return useReference
   */
  @javax.annotation.Nullable
  public Boolean getUseReference() {
    return useReference;
  }

  public void setUseReference(Boolean useReference) {
    this.useReference = useReference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1QuestionAnsweringQualitySpec googleCloudAiplatformV1QuestionAnsweringQualitySpec = (GoogleCloudAiplatformV1QuestionAnsweringQualitySpec) o;
    return Objects.equals(this.version, googleCloudAiplatformV1QuestionAnsweringQualitySpec.version) &&
        Objects.equals(this.useReference, googleCloudAiplatformV1QuestionAnsweringQualitySpec.useReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, useReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1QuestionAnsweringQualitySpec {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    useReference: ").append(toIndentedString(useReference)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("useReference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1QuestionAnsweringQualitySpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1QuestionAnsweringQualitySpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1QuestionAnsweringQualitySpec is not found in the empty JSON string", GoogleCloudAiplatformV1QuestionAnsweringQualitySpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1QuestionAnsweringQualitySpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1QuestionAnsweringQualitySpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1QuestionAnsweringQualitySpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1QuestionAnsweringQualitySpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1QuestionAnsweringQualitySpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1QuestionAnsweringQualitySpec.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1QuestionAnsweringQualitySpec>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1QuestionAnsweringQualitySpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1QuestionAnsweringQualitySpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1QuestionAnsweringQualitySpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1QuestionAnsweringQualitySpec
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1QuestionAnsweringQualitySpec
   */
  public static GoogleCloudAiplatformV1QuestionAnsweringQualitySpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1QuestionAnsweringQualitySpec.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1QuestionAnsweringQualitySpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
