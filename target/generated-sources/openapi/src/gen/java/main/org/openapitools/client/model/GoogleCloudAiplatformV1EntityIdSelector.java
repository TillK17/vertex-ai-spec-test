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
import org.openapitools.client.model.GoogleCloudAiplatformV1CsvSource;

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
 * Selector for entityId. Getting ids from the given source.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1EntityIdSelector {
  public static final String SERIALIZED_NAME_ENTITY_ID_FIELD = "entityIdField";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID_FIELD)
  private String entityIdField;

  public static final String SERIALIZED_NAME_CSV_SOURCE = "csvSource";
  @SerializedName(SERIALIZED_NAME_CSV_SOURCE)
  private GoogleCloudAiplatformV1CsvSource csvSource;

  public GoogleCloudAiplatformV1EntityIdSelector() {
  }

  public GoogleCloudAiplatformV1EntityIdSelector entityIdField(String entityIdField) {
    this.entityIdField = entityIdField;
    return this;
  }

  /**
   * Source column that holds entity IDs. If not provided, entity IDs are extracted from the column named entity_id.
   * @return entityIdField
   */
  @javax.annotation.Nullable
  public String getEntityIdField() {
    return entityIdField;
  }

  public void setEntityIdField(String entityIdField) {
    this.entityIdField = entityIdField;
  }


  public GoogleCloudAiplatformV1EntityIdSelector csvSource(GoogleCloudAiplatformV1CsvSource csvSource) {
    this.csvSource = csvSource;
    return this;
  }

  /**
   * Source of Csv
   * @return csvSource
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1CsvSource getCsvSource() {
    return csvSource;
  }

  public void setCsvSource(GoogleCloudAiplatformV1CsvSource csvSource) {
    this.csvSource = csvSource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1EntityIdSelector googleCloudAiplatformV1EntityIdSelector = (GoogleCloudAiplatformV1EntityIdSelector) o;
    return Objects.equals(this.entityIdField, googleCloudAiplatformV1EntityIdSelector.entityIdField) &&
        Objects.equals(this.csvSource, googleCloudAiplatformV1EntityIdSelector.csvSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityIdField, csvSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1EntityIdSelector {\n");
    sb.append("    entityIdField: ").append(toIndentedString(entityIdField)).append("\n");
    sb.append("    csvSource: ").append(toIndentedString(csvSource)).append("\n");
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
    openapiFields.add("entityIdField");
    openapiFields.add("csvSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1EntityIdSelector
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1EntityIdSelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1EntityIdSelector is not found in the empty JSON string", GoogleCloudAiplatformV1EntityIdSelector.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1EntityIdSelector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1EntityIdSelector` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("entityIdField") != null && !jsonObj.get("entityIdField").isJsonNull()) && !jsonObj.get("entityIdField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityIdField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityIdField").toString()));
      }
      // validate the optional field `csvSource`
      if (jsonObj.get("csvSource") != null && !jsonObj.get("csvSource").isJsonNull()) {
        GoogleCloudAiplatformV1CsvSource.validateJsonElement(jsonObj.get("csvSource"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1EntityIdSelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1EntityIdSelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1EntityIdSelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1EntityIdSelector.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1EntityIdSelector>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1EntityIdSelector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1EntityIdSelector read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1EntityIdSelector given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1EntityIdSelector
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1EntityIdSelector
   */
  public static GoogleCloudAiplatformV1EntityIdSelector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1EntityIdSelector.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1EntityIdSelector to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
