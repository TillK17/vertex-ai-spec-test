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
 * An attribution method that approximates Shapley values for features that contribute to the label being predicted. A sampling strategy is used to approximate the value rather than considering all subsets of features.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SampledShapleyAttribution {
  public static final String SERIALIZED_NAME_PATH_COUNT = "pathCount";
  @SerializedName(SERIALIZED_NAME_PATH_COUNT)
  private Integer pathCount;

  public GoogleCloudAiplatformV1SampledShapleyAttribution() {
  }

  public GoogleCloudAiplatformV1SampledShapleyAttribution pathCount(Integer pathCount) {
    this.pathCount = pathCount;
    return this;
  }

  /**
   * Required. The number of feature permutations to consider when approximating the Shapley values. Valid range of its value is [1, 50], inclusively.
   * @return pathCount
   */
  @javax.annotation.Nullable
  public Integer getPathCount() {
    return pathCount;
  }

  public void setPathCount(Integer pathCount) {
    this.pathCount = pathCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SampledShapleyAttribution googleCloudAiplatformV1SampledShapleyAttribution = (GoogleCloudAiplatformV1SampledShapleyAttribution) o;
    return Objects.equals(this.pathCount, googleCloudAiplatformV1SampledShapleyAttribution.pathCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SampledShapleyAttribution {\n");
    sb.append("    pathCount: ").append(toIndentedString(pathCount)).append("\n");
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
    openapiFields.add("pathCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SampledShapleyAttribution
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SampledShapleyAttribution.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SampledShapleyAttribution is not found in the empty JSON string", GoogleCloudAiplatformV1SampledShapleyAttribution.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SampledShapleyAttribution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SampledShapleyAttribution` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SampledShapleyAttribution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SampledShapleyAttribution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SampledShapleyAttribution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SampledShapleyAttribution.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SampledShapleyAttribution>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SampledShapleyAttribution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SampledShapleyAttribution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SampledShapleyAttribution given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SampledShapleyAttribution
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SampledShapleyAttribution
   */
  public static GoogleCloudAiplatformV1SampledShapleyAttribution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SampledShapleyAttribution.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SampledShapleyAttribution to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
