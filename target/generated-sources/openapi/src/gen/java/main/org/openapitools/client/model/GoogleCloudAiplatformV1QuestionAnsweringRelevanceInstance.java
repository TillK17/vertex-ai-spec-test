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
 * Spec for question answering relevance instance.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance {
  public static final String SERIALIZED_NAME_INSTRUCTION = "instruction";
  @SerializedName(SERIALIZED_NAME_INSTRUCTION)
  private String instruction;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private String context;

  public static final String SERIALIZED_NAME_PREDICTION = "prediction";
  @SerializedName(SERIALIZED_NAME_PREDICTION)
  private String prediction;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance() {
  }

  public GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

  /**
   * Required. The question asked and other instruction in the inference prompt.
   * @return instruction
   */
  @javax.annotation.Nullable
  public String getInstruction() {
    return instruction;
  }

  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }


  public GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance context(String context) {
    this.context = context;
    return this;
  }

  /**
   * Optional. Text provided as context to answer the question.
   * @return context
   */
  @javax.annotation.Nullable
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }


  public GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance prediction(String prediction) {
    this.prediction = prediction;
    return this;
  }

  /**
   * Required. Output of the evaluated model.
   * @return prediction
   */
  @javax.annotation.Nullable
  public String getPrediction() {
    return prediction;
  }

  public void setPrediction(String prediction) {
    this.prediction = prediction;
  }


  public GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Optional. Ground truth used to compare against the prediction.
   * @return reference
   */
  @javax.annotation.Nullable
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance googleCloudAiplatformV1QuestionAnsweringRelevanceInstance = (GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance) o;
    return Objects.equals(this.instruction, googleCloudAiplatformV1QuestionAnsweringRelevanceInstance.instruction) &&
        Objects.equals(this.context, googleCloudAiplatformV1QuestionAnsweringRelevanceInstance.context) &&
        Objects.equals(this.prediction, googleCloudAiplatformV1QuestionAnsweringRelevanceInstance.prediction) &&
        Objects.equals(this.reference, googleCloudAiplatformV1QuestionAnsweringRelevanceInstance.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instruction, context, prediction, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance {\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    prediction: ").append(toIndentedString(prediction)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
    openapiFields.add("instruction");
    openapiFields.add("context");
    openapiFields.add("prediction");
    openapiFields.add("reference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance is not found in the empty JSON string", GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("instruction") != null && !jsonObj.get("instruction").isJsonNull()) && !jsonObj.get("instruction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instruction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instruction").toString()));
      }
      if ((jsonObj.get("context") != null && !jsonObj.get("context").isJsonNull()) && !jsonObj.get("context").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `context` to be a primitive type in the JSON string but got `%s`", jsonObj.get("context").toString()));
      }
      if ((jsonObj.get("prediction") != null && !jsonObj.get("prediction").isJsonNull()) && !jsonObj.get("prediction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prediction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prediction").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance
   */
  public static GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1QuestionAnsweringRelevanceInstance to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

