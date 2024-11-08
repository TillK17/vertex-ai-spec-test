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
 * GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata {
  /**
   * For successful job completions, this is the reason why the job has finished.
   */
  @JsonAdapter(SuccessfulStopReasonEnum.Adapter.class)
  public enum SuccessfulStopReasonEnum {
    SUCCESSFUL_STOP_REASON_UNSPECIFIED("SUCCESSFUL_STOP_REASON_UNSPECIFIED"),
    
    BUDGET_REACHED("BUDGET_REACHED"),
    
    MODEL_CONVERGED("MODEL_CONVERGED");

    private String value;

    SuccessfulStopReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SuccessfulStopReasonEnum fromValue(String value) {
      for (SuccessfulStopReasonEnum b : SuccessfulStopReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SuccessfulStopReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SuccessfulStopReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SuccessfulStopReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SuccessfulStopReasonEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SuccessfulStopReasonEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SUCCESSFUL_STOP_REASON = "successfulStopReason";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL_STOP_REASON)
  private SuccessfulStopReasonEnum successfulStopReason;

  public static final String SERIALIZED_NAME_COST_MILLI_NODE_HOURS = "costMilliNodeHours";
  @SerializedName(SERIALIZED_NAME_COST_MILLI_NODE_HOURS)
  private String costMilliNodeHours;

  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata() {
  }

  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata successfulStopReason(SuccessfulStopReasonEnum successfulStopReason) {
    this.successfulStopReason = successfulStopReason;
    return this;
  }

  /**
   * For successful job completions, this is the reason why the job has finished.
   * @return successfulStopReason
   */
  @javax.annotation.Nullable
  public SuccessfulStopReasonEnum getSuccessfulStopReason() {
    return successfulStopReason;
  }

  public void setSuccessfulStopReason(SuccessfulStopReasonEnum successfulStopReason) {
    this.successfulStopReason = successfulStopReason;
  }


  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata costMilliNodeHours(String costMilliNodeHours) {
    this.costMilliNodeHours = costMilliNodeHours;
    return this;
  }

  /**
   * The actual training cost of creating this model, expressed in milli node hours, i.e. 1,000 value in this field means 1 node hour. Guaranteed to not exceed inputs.budgetMilliNodeHours.
   * @return costMilliNodeHours
   */
  @javax.annotation.Nullable
  public String getCostMilliNodeHours() {
    return costMilliNodeHours;
  }

  public void setCostMilliNodeHours(String costMilliNodeHours) {
    this.costMilliNodeHours = costMilliNodeHours;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata = (GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata) o;
    return Objects.equals(this.successfulStopReason, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata.successfulStopReason) &&
        Objects.equals(this.costMilliNodeHours, googleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata.costMilliNodeHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successfulStopReason, costMilliNodeHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata {\n");
    sb.append("    successfulStopReason: ").append(toIndentedString(successfulStopReason)).append("\n");
    sb.append("    costMilliNodeHours: ").append(toIndentedString(costMilliNodeHours)).append("\n");
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
    openapiFields.add("successfulStopReason");
    openapiFields.add("costMilliNodeHours");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("successfulStopReason") != null && !jsonObj.get("successfulStopReason").isJsonNull()) && !jsonObj.get("successfulStopReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `successfulStopReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("successfulStopReason").toString()));
      }
      // validate the optional field `successfulStopReason`
      if (jsonObj.get("successfulStopReason") != null && !jsonObj.get("successfulStopReason").isJsonNull()) {
        SuccessfulStopReasonEnum.validateJsonElement(jsonObj.get("successfulStopReason"));
      }
      if ((jsonObj.get("costMilliNodeHours") != null && !jsonObj.get("costMilliNodeHours").isJsonNull()) && !jsonObj.get("costMilliNodeHours").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `costMilliNodeHours` to be a primitive type in the JSON string but got `%s`", jsonObj.get("costMilliNodeHours").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata
   */
  public static GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlImageObjectDetectionMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

