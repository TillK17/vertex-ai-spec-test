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
 * Request message for MetadataService.DeleteContextChildrenRequest.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1RemoveContextChildrenRequest {
  public static final String SERIALIZED_NAME_CHILD_CONTEXTS = "childContexts";
  @SerializedName(SERIALIZED_NAME_CHILD_CONTEXTS)
  private List<String> childContexts = new ArrayList<>();

  public GoogleCloudAiplatformV1RemoveContextChildrenRequest() {
  }

  public GoogleCloudAiplatformV1RemoveContextChildrenRequest childContexts(List<String> childContexts) {
    this.childContexts = childContexts;
    return this;
  }

  public GoogleCloudAiplatformV1RemoveContextChildrenRequest addChildContextsItem(String childContextsItem) {
    if (this.childContexts == null) {
      this.childContexts = new ArrayList<>();
    }
    this.childContexts.add(childContextsItem);
    return this;
  }

  /**
   * The resource names of the child Contexts.
   * @return childContexts
   */
  @javax.annotation.Nullable
  public List<String> getChildContexts() {
    return childContexts;
  }

  public void setChildContexts(List<String> childContexts) {
    this.childContexts = childContexts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1RemoveContextChildrenRequest googleCloudAiplatformV1RemoveContextChildrenRequest = (GoogleCloudAiplatformV1RemoveContextChildrenRequest) o;
    return Objects.equals(this.childContexts, googleCloudAiplatformV1RemoveContextChildrenRequest.childContexts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childContexts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1RemoveContextChildrenRequest {\n");
    sb.append("    childContexts: ").append(toIndentedString(childContexts)).append("\n");
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
    openapiFields.add("childContexts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1RemoveContextChildrenRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1RemoveContextChildrenRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1RemoveContextChildrenRequest is not found in the empty JSON string", GoogleCloudAiplatformV1RemoveContextChildrenRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1RemoveContextChildrenRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1RemoveContextChildrenRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("childContexts") != null && !jsonObj.get("childContexts").isJsonNull() && !jsonObj.get("childContexts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `childContexts` to be an array in the JSON string but got `%s`", jsonObj.get("childContexts").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1RemoveContextChildrenRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1RemoveContextChildrenRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1RemoveContextChildrenRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1RemoveContextChildrenRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1RemoveContextChildrenRequest>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1RemoveContextChildrenRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1RemoveContextChildrenRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1RemoveContextChildrenRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1RemoveContextChildrenRequest
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1RemoveContextChildrenRequest
   */
  public static GoogleCloudAiplatformV1RemoveContextChildrenRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1RemoveContextChildrenRequest.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1RemoveContextChildrenRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

