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
import org.openapitools.client.model.GoogleCloudAiplatformV1Trial;

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
 * Response message for VizierService.SuggestTrials.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SuggestTrialsResponse {
  public static final String SERIALIZED_NAME_TRIALS = "trials";
  @SerializedName(SERIALIZED_NAME_TRIALS)
  private List<GoogleCloudAiplatformV1Trial> trials = new ArrayList<>();

  /**
   * The state of the Study.
   */
  @JsonAdapter(StudyStateEnum.Adapter.class)
  public enum StudyStateEnum {
    STATE_UNSPECIFIED("STATE_UNSPECIFIED"),
    
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE"),
    
    COMPLETED("COMPLETED");

    private String value;

    StudyStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StudyStateEnum fromValue(String value) {
      for (StudyStateEnum b : StudyStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StudyStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StudyStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StudyStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StudyStateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StudyStateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STUDY_STATE = "studyState";
  @SerializedName(SERIALIZED_NAME_STUDY_STATE)
  private StudyStateEnum studyState;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public GoogleCloudAiplatformV1SuggestTrialsResponse() {
  }

  public GoogleCloudAiplatformV1SuggestTrialsResponse trials(List<GoogleCloudAiplatformV1Trial> trials) {
    this.trials = trials;
    return this;
  }

  public GoogleCloudAiplatformV1SuggestTrialsResponse addTrialsItem(GoogleCloudAiplatformV1Trial trialsItem) {
    if (this.trials == null) {
      this.trials = new ArrayList<>();
    }
    this.trials.add(trialsItem);
    return this;
  }

  /**
   * A list of Trials.
   * @return trials
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1Trial> getTrials() {
    return trials;
  }

  public void setTrials(List<GoogleCloudAiplatformV1Trial> trials) {
    this.trials = trials;
  }


  public GoogleCloudAiplatformV1SuggestTrialsResponse studyState(StudyStateEnum studyState) {
    this.studyState = studyState;
    return this;
  }

  /**
   * The state of the Study.
   * @return studyState
   */
  @javax.annotation.Nullable
  public StudyStateEnum getStudyState() {
    return studyState;
  }

  public void setStudyState(StudyStateEnum studyState) {
    this.studyState = studyState;
  }


  public GoogleCloudAiplatformV1SuggestTrialsResponse endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The time at which operation processing completed.
   * @return endTime
   */
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public GoogleCloudAiplatformV1SuggestTrialsResponse startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The time at which the operation was started.
   * @return startTime
   */
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SuggestTrialsResponse googleCloudAiplatformV1SuggestTrialsResponse = (GoogleCloudAiplatformV1SuggestTrialsResponse) o;
    return Objects.equals(this.trials, googleCloudAiplatformV1SuggestTrialsResponse.trials) &&
        Objects.equals(this.studyState, googleCloudAiplatformV1SuggestTrialsResponse.studyState) &&
        Objects.equals(this.endTime, googleCloudAiplatformV1SuggestTrialsResponse.endTime) &&
        Objects.equals(this.startTime, googleCloudAiplatformV1SuggestTrialsResponse.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trials, studyState, endTime, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SuggestTrialsResponse {\n");
    sb.append("    trials: ").append(toIndentedString(trials)).append("\n");
    sb.append("    studyState: ").append(toIndentedString(studyState)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("trials");
    openapiFields.add("studyState");
    openapiFields.add("endTime");
    openapiFields.add("startTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SuggestTrialsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SuggestTrialsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SuggestTrialsResponse is not found in the empty JSON string", GoogleCloudAiplatformV1SuggestTrialsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SuggestTrialsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SuggestTrialsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("trials") != null && !jsonObj.get("trials").isJsonNull()) {
        JsonArray jsonArraytrials = jsonObj.getAsJsonArray("trials");
        if (jsonArraytrials != null) {
          // ensure the json data is an array
          if (!jsonObj.get("trials").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `trials` to be an array in the JSON string but got `%s`", jsonObj.get("trials").toString()));
          }

          // validate the optional field `trials` (array)
          for (int i = 0; i < jsonArraytrials.size(); i++) {
            GoogleCloudAiplatformV1Trial.validateJsonElement(jsonArraytrials.get(i));
          };
        }
      }
      if ((jsonObj.get("studyState") != null && !jsonObj.get("studyState").isJsonNull()) && !jsonObj.get("studyState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `studyState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("studyState").toString()));
      }
      // validate the optional field `studyState`
      if (jsonObj.get("studyState") != null && !jsonObj.get("studyState").isJsonNull()) {
        StudyStateEnum.validateJsonElement(jsonObj.get("studyState"));
      }
      if ((jsonObj.get("endTime") != null && !jsonObj.get("endTime").isJsonNull()) && !jsonObj.get("endTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endTime").toString()));
      }
      if ((jsonObj.get("startTime") != null && !jsonObj.get("startTime").isJsonNull()) && !jsonObj.get("startTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SuggestTrialsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SuggestTrialsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SuggestTrialsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SuggestTrialsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SuggestTrialsResponse>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SuggestTrialsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SuggestTrialsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SuggestTrialsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SuggestTrialsResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SuggestTrialsResponse
   */
  public static GoogleCloudAiplatformV1SuggestTrialsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SuggestTrialsResponse.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SuggestTrialsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

