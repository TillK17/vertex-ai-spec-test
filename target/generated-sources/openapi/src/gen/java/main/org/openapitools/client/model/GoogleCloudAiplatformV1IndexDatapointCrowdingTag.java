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
 * Crowding tag is a constraint on a neighbor list produced by nearest neighbor search requiring that no more than some value k&#39; of the k neighbors returned have the same value of crowding_attribute.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1IndexDatapointCrowdingTag {
  public static final String SERIALIZED_NAME_CROWDING_ATTRIBUTE = "crowdingAttribute";
  @SerializedName(SERIALIZED_NAME_CROWDING_ATTRIBUTE)
  private String crowdingAttribute;

  public GoogleCloudAiplatformV1IndexDatapointCrowdingTag() {
  }

  public GoogleCloudAiplatformV1IndexDatapointCrowdingTag crowdingAttribute(String crowdingAttribute) {
    this.crowdingAttribute = crowdingAttribute;
    return this;
  }

  /**
   * The attribute value used for crowding. The maximum number of neighbors to return per crowding attribute value (per_crowding_attribute_num_neighbors) is configured per-query. This field is ignored if per_crowding_attribute_num_neighbors is larger than the total number of neighbors to return for a given query.
   * @return crowdingAttribute
   */
  @javax.annotation.Nullable
  public String getCrowdingAttribute() {
    return crowdingAttribute;
  }

  public void setCrowdingAttribute(String crowdingAttribute) {
    this.crowdingAttribute = crowdingAttribute;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1IndexDatapointCrowdingTag googleCloudAiplatformV1IndexDatapointCrowdingTag = (GoogleCloudAiplatformV1IndexDatapointCrowdingTag) o;
    return Objects.equals(this.crowdingAttribute, googleCloudAiplatformV1IndexDatapointCrowdingTag.crowdingAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crowdingAttribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1IndexDatapointCrowdingTag {\n");
    sb.append("    crowdingAttribute: ").append(toIndentedString(crowdingAttribute)).append("\n");
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
    openapiFields.add("crowdingAttribute");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1IndexDatapointCrowdingTag
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1IndexDatapointCrowdingTag.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1IndexDatapointCrowdingTag is not found in the empty JSON string", GoogleCloudAiplatformV1IndexDatapointCrowdingTag.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1IndexDatapointCrowdingTag.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1IndexDatapointCrowdingTag` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("crowdingAttribute") != null && !jsonObj.get("crowdingAttribute").isJsonNull()) && !jsonObj.get("crowdingAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crowdingAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crowdingAttribute").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1IndexDatapointCrowdingTag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1IndexDatapointCrowdingTag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1IndexDatapointCrowdingTag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1IndexDatapointCrowdingTag.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1IndexDatapointCrowdingTag>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1IndexDatapointCrowdingTag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1IndexDatapointCrowdingTag read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1IndexDatapointCrowdingTag given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1IndexDatapointCrowdingTag
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1IndexDatapointCrowdingTag
   */
  public static GoogleCloudAiplatformV1IndexDatapointCrowdingTag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1IndexDatapointCrowdingTag.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1IndexDatapointCrowdingTag to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
