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
 * The text segment inside of DataItem.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaTextSegment {
  public static final String SERIALIZED_NAME_START_OFFSET = "startOffset";
  @SerializedName(SERIALIZED_NAME_START_OFFSET)
  private String startOffset;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_END_OFFSET = "endOffset";
  @SerializedName(SERIALIZED_NAME_END_OFFSET)
  private String endOffset;

  public GoogleCloudAiplatformV1SchemaTextSegment() {
  }

  public GoogleCloudAiplatformV1SchemaTextSegment startOffset(String startOffset) {
    this.startOffset = startOffset;
    return this;
  }

  /**
   * Zero-based character index of the first character of the text segment (counting characters from the beginning of the text).
   * @return startOffset
   */
  @javax.annotation.Nullable
  public String getStartOffset() {
    return startOffset;
  }

  public void setStartOffset(String startOffset) {
    this.startOffset = startOffset;
  }


  public GoogleCloudAiplatformV1SchemaTextSegment content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The text content in the segment for output only.
   * @return content
   */
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public GoogleCloudAiplatformV1SchemaTextSegment endOffset(String endOffset) {
    this.endOffset = endOffset;
    return this;
  }

  /**
   * Zero-based character index of the first character past the end of the text segment (counting character from the beginning of the text). The character at the end_offset is NOT included in the text segment.
   * @return endOffset
   */
  @javax.annotation.Nullable
  public String getEndOffset() {
    return endOffset;
  }

  public void setEndOffset(String endOffset) {
    this.endOffset = endOffset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaTextSegment googleCloudAiplatformV1SchemaTextSegment = (GoogleCloudAiplatformV1SchemaTextSegment) o;
    return Objects.equals(this.startOffset, googleCloudAiplatformV1SchemaTextSegment.startOffset) &&
        Objects.equals(this.content, googleCloudAiplatformV1SchemaTextSegment.content) &&
        Objects.equals(this.endOffset, googleCloudAiplatformV1SchemaTextSegment.endOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startOffset, content, endOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaTextSegment {\n");
    sb.append("    startOffset: ").append(toIndentedString(startOffset)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    endOffset: ").append(toIndentedString(endOffset)).append("\n");
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
    openapiFields.add("startOffset");
    openapiFields.add("content");
    openapiFields.add("endOffset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaTextSegment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaTextSegment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaTextSegment is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaTextSegment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaTextSegment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaTextSegment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("startOffset") != null && !jsonObj.get("startOffset").isJsonNull()) && !jsonObj.get("startOffset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startOffset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startOffset").toString()));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("endOffset") != null && !jsonObj.get("endOffset").isJsonNull()) && !jsonObj.get("endOffset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endOffset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endOffset").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaTextSegment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaTextSegment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaTextSegment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaTextSegment.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaTextSegment>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaTextSegment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaTextSegment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaTextSegment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaTextSegment
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaTextSegment
   */
  public static GoogleCloudAiplatformV1SchemaTextSegment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaTextSegment.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaTextSegment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
