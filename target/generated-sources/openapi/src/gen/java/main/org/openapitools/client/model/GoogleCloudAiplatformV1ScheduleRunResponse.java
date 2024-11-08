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
 * Status of a scheduled run.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ScheduleRunResponse {
  public static final String SERIALIZED_NAME_RUN_RESPONSE = "runResponse";
  @SerializedName(SERIALIZED_NAME_RUN_RESPONSE)
  private String runResponse;

  public static final String SERIALIZED_NAME_SCHEDULED_RUN_TIME = "scheduledRunTime";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_RUN_TIME)
  private String scheduledRunTime;

  public GoogleCloudAiplatformV1ScheduleRunResponse() {
  }

  public GoogleCloudAiplatformV1ScheduleRunResponse runResponse(String runResponse) {
    this.runResponse = runResponse;
    return this;
  }

  /**
   * The response of the scheduled run.
   * @return runResponse
   */
  @javax.annotation.Nullable
  public String getRunResponse() {
    return runResponse;
  }

  public void setRunResponse(String runResponse) {
    this.runResponse = runResponse;
  }


  public GoogleCloudAiplatformV1ScheduleRunResponse scheduledRunTime(String scheduledRunTime) {
    this.scheduledRunTime = scheduledRunTime;
    return this;
  }

  /**
   * The scheduled run time based on the user-specified schedule.
   * @return scheduledRunTime
   */
  @javax.annotation.Nullable
  public String getScheduledRunTime() {
    return scheduledRunTime;
  }

  public void setScheduledRunTime(String scheduledRunTime) {
    this.scheduledRunTime = scheduledRunTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ScheduleRunResponse googleCloudAiplatformV1ScheduleRunResponse = (GoogleCloudAiplatformV1ScheduleRunResponse) o;
    return Objects.equals(this.runResponse, googleCloudAiplatformV1ScheduleRunResponse.runResponse) &&
        Objects.equals(this.scheduledRunTime, googleCloudAiplatformV1ScheduleRunResponse.scheduledRunTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runResponse, scheduledRunTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ScheduleRunResponse {\n");
    sb.append("    runResponse: ").append(toIndentedString(runResponse)).append("\n");
    sb.append("    scheduledRunTime: ").append(toIndentedString(scheduledRunTime)).append("\n");
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
    openapiFields.add("runResponse");
    openapiFields.add("scheduledRunTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ScheduleRunResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ScheduleRunResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ScheduleRunResponse is not found in the empty JSON string", GoogleCloudAiplatformV1ScheduleRunResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ScheduleRunResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ScheduleRunResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("runResponse") != null && !jsonObj.get("runResponse").isJsonNull()) && !jsonObj.get("runResponse").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runResponse` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runResponse").toString()));
      }
      if ((jsonObj.get("scheduledRunTime") != null && !jsonObj.get("scheduledRunTime").isJsonNull()) && !jsonObj.get("scheduledRunTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduledRunTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduledRunTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ScheduleRunResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ScheduleRunResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ScheduleRunResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ScheduleRunResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ScheduleRunResponse>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ScheduleRunResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ScheduleRunResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ScheduleRunResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ScheduleRunResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ScheduleRunResponse
   */
  public static GoogleCloudAiplatformV1ScheduleRunResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ScheduleRunResponse.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ScheduleRunResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

