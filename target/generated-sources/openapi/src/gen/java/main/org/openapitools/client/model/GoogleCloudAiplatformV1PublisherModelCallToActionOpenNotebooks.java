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
import org.openapitools.client.model.GoogleCloudAiplatformV1PublisherModelCallToActionRegionalResourceReferences;

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
 * Open notebooks.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks {
  public static final String SERIALIZED_NAME_NOTEBOOKS = "notebooks";
  @SerializedName(SERIALIZED_NAME_NOTEBOOKS)
  private List<GoogleCloudAiplatformV1PublisherModelCallToActionRegionalResourceReferences> notebooks = new ArrayList<>();

  public GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks() {
  }

  public GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks notebooks(List<GoogleCloudAiplatformV1PublisherModelCallToActionRegionalResourceReferences> notebooks) {
    this.notebooks = notebooks;
    return this;
  }

  public GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks addNotebooksItem(GoogleCloudAiplatformV1PublisherModelCallToActionRegionalResourceReferences notebooksItem) {
    if (this.notebooks == null) {
      this.notebooks = new ArrayList<>();
    }
    this.notebooks.add(notebooksItem);
    return this;
  }

  /**
   * Required. Regional resource references to notebooks.
   * @return notebooks
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1PublisherModelCallToActionRegionalResourceReferences> getNotebooks() {
    return notebooks;
  }

  public void setNotebooks(List<GoogleCloudAiplatformV1PublisherModelCallToActionRegionalResourceReferences> notebooks) {
    this.notebooks = notebooks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks googleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks = (GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks) o;
    return Objects.equals(this.notebooks, googleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks.notebooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notebooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks {\n");
    sb.append("    notebooks: ").append(toIndentedString(notebooks)).append("\n");
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
    openapiFields.add("notebooks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks is not found in the empty JSON string", GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("notebooks") != null && !jsonObj.get("notebooks").isJsonNull()) {
        JsonArray jsonArraynotebooks = jsonObj.getAsJsonArray("notebooks");
        if (jsonArraynotebooks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notebooks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notebooks` to be an array in the JSON string but got `%s`", jsonObj.get("notebooks").toString()));
          }

          // validate the optional field `notebooks` (array)
          for (int i = 0; i < jsonArraynotebooks.size(); i++) {
            GoogleCloudAiplatformV1PublisherModelCallToActionRegionalResourceReferences.validateJsonElement(jsonArraynotebooks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks
   */
  public static GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1PublisherModelCallToActionOpenNotebooks to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
