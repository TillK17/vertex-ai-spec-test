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
 * The median automated stopping rule stops a pending Trial if the Trial&#39;s best objective_value is strictly below the median &#39;performance&#39; of all completed Trials reported up to the Trial&#39;s last measurement. Currently, &#39;performance&#39; refers to the running average of the objective values reported by the Trial in each measurement.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec {
  public static final String SERIALIZED_NAME_USE_ELAPSED_DURATION = "useElapsedDuration";
  @SerializedName(SERIALIZED_NAME_USE_ELAPSED_DURATION)
  private Boolean useElapsedDuration;

  public GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec() {
  }

  public GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec useElapsedDuration(Boolean useElapsedDuration) {
    this.useElapsedDuration = useElapsedDuration;
    return this;
  }

  /**
   * True if median automated stopping rule applies on Measurement.elapsed_duration. It means that elapsed_duration field of latest measurement of current Trial is used to compute median objective value for each completed Trials.
   * @return useElapsedDuration
   */
  @javax.annotation.Nullable
  public Boolean getUseElapsedDuration() {
    return useElapsedDuration;
  }

  public void setUseElapsedDuration(Boolean useElapsedDuration) {
    this.useElapsedDuration = useElapsedDuration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec googleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec = (GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec) o;
    return Objects.equals(this.useElapsedDuration, googleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec.useElapsedDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useElapsedDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec {\n");
    sb.append("    useElapsedDuration: ").append(toIndentedString(useElapsedDuration)).append("\n");
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
    openapiFields.add("useElapsedDuration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec is not found in the empty JSON string", GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec
   */
  public static GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
