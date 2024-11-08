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
 * GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError {
  /**
   * The error type of this record.
   */
  @JsonAdapter(ErrorTypeEnum.Adapter.class)
  public enum ErrorTypeEnum {
    ERROR_TYPE_UNSPECIFIED("ERROR_TYPE_UNSPECIFIED"),
    
    EMPTY_LINE("EMPTY_LINE"),
    
    INVALID_JSON_SYNTAX("INVALID_JSON_SYNTAX"),
    
    INVALID_CSV_SYNTAX("INVALID_CSV_SYNTAX"),
    
    INVALID_AVRO_SYNTAX("INVALID_AVRO_SYNTAX"),
    
    INVALID_EMBEDDING_ID("INVALID_EMBEDDING_ID"),
    
    EMBEDDING_SIZE_MISMATCH("EMBEDDING_SIZE_MISMATCH"),
    
    NAMESPACE_MISSING("NAMESPACE_MISSING"),
    
    PARSING_ERROR("PARSING_ERROR"),
    
    DUPLICATE_NAMESPACE("DUPLICATE_NAMESPACE"),
    
    OP_IN_DATAPOINT("OP_IN_DATAPOINT"),
    
    MULTIPLE_VALUES("MULTIPLE_VALUES"),
    
    INVALID_NUMERIC_VALUE("INVALID_NUMERIC_VALUE"),
    
    INVALID_ENCODING("INVALID_ENCODING"),
    
    INVALID_SPARSE_DIMENSIONS("INVALID_SPARSE_DIMENSIONS"),
    
    INVALID_TOKEN_VALUE("INVALID_TOKEN_VALUE"),
    
    INVALID_SPARSE_EMBEDDING("INVALID_SPARSE_EMBEDDING"),
    
    INVALID_EMBEDDING("INVALID_EMBEDDING");

    private String value;

    ErrorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorTypeEnum fromValue(String value) {
      for (ErrorTypeEnum b : ErrorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ErrorTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ERROR_TYPE = "errorType";
  @SerializedName(SERIALIZED_NAME_ERROR_TYPE)
  private ErrorTypeEnum errorType;

  public static final String SERIALIZED_NAME_EMBEDDING_ID = "embeddingId";
  @SerializedName(SERIALIZED_NAME_EMBEDDING_ID)
  private String embeddingId;

  public static final String SERIALIZED_NAME_SOURCE_GCS_URI = "sourceGcsUri";
  @SerializedName(SERIALIZED_NAME_SOURCE_GCS_URI)
  private String sourceGcsUri;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_RAW_RECORD = "rawRecord";
  @SerializedName(SERIALIZED_NAME_RAW_RECORD)
  private String rawRecord;

  public GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError() {
  }

  public GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError errorType(ErrorTypeEnum errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * The error type of this record.
   * @return errorType
   */
  @javax.annotation.Nullable
  public ErrorTypeEnum getErrorType() {
    return errorType;
  }

  public void setErrorType(ErrorTypeEnum errorType) {
    this.errorType = errorType;
  }


  public GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError embeddingId(String embeddingId) {
    this.embeddingId = embeddingId;
    return this;
  }

  /**
   * Empty if the embedding id is failed to parse.
   * @return embeddingId
   */
  @javax.annotation.Nullable
  public String getEmbeddingId() {
    return embeddingId;
  }

  public void setEmbeddingId(String embeddingId) {
    this.embeddingId = embeddingId;
  }


  public GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError sourceGcsUri(String sourceGcsUri) {
    this.sourceGcsUri = sourceGcsUri;
    return this;
  }

  /**
   * Cloud Storage URI pointing to the original file in user&#39;s bucket.
   * @return sourceGcsUri
   */
  @javax.annotation.Nullable
  public String getSourceGcsUri() {
    return sourceGcsUri;
  }

  public void setSourceGcsUri(String sourceGcsUri) {
    this.sourceGcsUri = sourceGcsUri;
  }


  public GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * A human-readable message that is shown to the user to help them fix the error. Note that this message may change from time to time, your code should check against error_type as the source of truth.
   * @return errorMessage
   */
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError rawRecord(String rawRecord) {
    this.rawRecord = rawRecord;
    return this;
  }

  /**
   * The original content of this record.
   * @return rawRecord
   */
  @javax.annotation.Nullable
  public String getRawRecord() {
    return rawRecord;
  }

  public void setRawRecord(String rawRecord) {
    this.rawRecord = rawRecord;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError googleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError = (GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError) o;
    return Objects.equals(this.errorType, googleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError.errorType) &&
        Objects.equals(this.embeddingId, googleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError.embeddingId) &&
        Objects.equals(this.sourceGcsUri, googleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError.sourceGcsUri) &&
        Objects.equals(this.errorMessage, googleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError.errorMessage) &&
        Objects.equals(this.rawRecord, googleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError.rawRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorType, embeddingId, sourceGcsUri, errorMessage, rawRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError {\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    embeddingId: ").append(toIndentedString(embeddingId)).append("\n");
    sb.append("    sourceGcsUri: ").append(toIndentedString(sourceGcsUri)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    rawRecord: ").append(toIndentedString(rawRecord)).append("\n");
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
    openapiFields.add("errorType");
    openapiFields.add("embeddingId");
    openapiFields.add("sourceGcsUri");
    openapiFields.add("errorMessage");
    openapiFields.add("rawRecord");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError is not found in the empty JSON string", GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("errorType") != null && !jsonObj.get("errorType").isJsonNull()) && !jsonObj.get("errorType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorType").toString()));
      }
      // validate the optional field `errorType`
      if (jsonObj.get("errorType") != null && !jsonObj.get("errorType").isJsonNull()) {
        ErrorTypeEnum.validateJsonElement(jsonObj.get("errorType"));
      }
      if ((jsonObj.get("embeddingId") != null && !jsonObj.get("embeddingId").isJsonNull()) && !jsonObj.get("embeddingId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `embeddingId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("embeddingId").toString()));
      }
      if ((jsonObj.get("sourceGcsUri") != null && !jsonObj.get("sourceGcsUri").isJsonNull()) && !jsonObj.get("sourceGcsUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceGcsUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceGcsUri").toString()));
      }
      if ((jsonObj.get("errorMessage") != null && !jsonObj.get("errorMessage").isJsonNull()) && !jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
      if ((jsonObj.get("rawRecord") != null && !jsonObj.get("rawRecord").isJsonNull()) && !jsonObj.get("rawRecord").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rawRecord` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rawRecord").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError
   */
  public static GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

