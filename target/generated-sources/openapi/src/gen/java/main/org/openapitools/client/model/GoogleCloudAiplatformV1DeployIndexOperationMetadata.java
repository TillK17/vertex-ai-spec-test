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
import org.openapitools.client.model.GoogleCloudAiplatformV1GenericOperationMetadata;

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
 * Runtime operation information for IndexEndpointService.DeployIndex.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1DeployIndexOperationMetadata {
  public static final String SERIALIZED_NAME_DEPLOYED_INDEX_ID = "deployedIndexId";
  @SerializedName(SERIALIZED_NAME_DEPLOYED_INDEX_ID)
  private String deployedIndexId;

  public static final String SERIALIZED_NAME_GENERIC_METADATA = "genericMetadata";
  @SerializedName(SERIALIZED_NAME_GENERIC_METADATA)
  private GoogleCloudAiplatformV1GenericOperationMetadata genericMetadata;

  public GoogleCloudAiplatformV1DeployIndexOperationMetadata() {
  }

  public GoogleCloudAiplatformV1DeployIndexOperationMetadata deployedIndexId(String deployedIndexId) {
    this.deployedIndexId = deployedIndexId;
    return this;
  }

  /**
   * The unique index id specified by user
   * @return deployedIndexId
   */
  @javax.annotation.Nullable
  public String getDeployedIndexId() {
    return deployedIndexId;
  }

  public void setDeployedIndexId(String deployedIndexId) {
    this.deployedIndexId = deployedIndexId;
  }


  public GoogleCloudAiplatformV1DeployIndexOperationMetadata genericMetadata(GoogleCloudAiplatformV1GenericOperationMetadata genericMetadata) {
    this.genericMetadata = genericMetadata;
    return this;
  }

  /**
   * The operation generic information.
   * @return genericMetadata
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1GenericOperationMetadata getGenericMetadata() {
    return genericMetadata;
  }

  public void setGenericMetadata(GoogleCloudAiplatformV1GenericOperationMetadata genericMetadata) {
    this.genericMetadata = genericMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1DeployIndexOperationMetadata googleCloudAiplatformV1DeployIndexOperationMetadata = (GoogleCloudAiplatformV1DeployIndexOperationMetadata) o;
    return Objects.equals(this.deployedIndexId, googleCloudAiplatformV1DeployIndexOperationMetadata.deployedIndexId) &&
        Objects.equals(this.genericMetadata, googleCloudAiplatformV1DeployIndexOperationMetadata.genericMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployedIndexId, genericMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1DeployIndexOperationMetadata {\n");
    sb.append("    deployedIndexId: ").append(toIndentedString(deployedIndexId)).append("\n");
    sb.append("    genericMetadata: ").append(toIndentedString(genericMetadata)).append("\n");
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
    openapiFields.add("deployedIndexId");
    openapiFields.add("genericMetadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1DeployIndexOperationMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1DeployIndexOperationMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1DeployIndexOperationMetadata is not found in the empty JSON string", GoogleCloudAiplatformV1DeployIndexOperationMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1DeployIndexOperationMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1DeployIndexOperationMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("deployedIndexId") != null && !jsonObj.get("deployedIndexId").isJsonNull()) && !jsonObj.get("deployedIndexId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deployedIndexId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deployedIndexId").toString()));
      }
      // validate the optional field `genericMetadata`
      if (jsonObj.get("genericMetadata") != null && !jsonObj.get("genericMetadata").isJsonNull()) {
        GoogleCloudAiplatformV1GenericOperationMetadata.validateJsonElement(jsonObj.get("genericMetadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1DeployIndexOperationMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1DeployIndexOperationMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1DeployIndexOperationMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1DeployIndexOperationMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1DeployIndexOperationMetadata>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1DeployIndexOperationMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1DeployIndexOperationMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1DeployIndexOperationMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1DeployIndexOperationMetadata
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1DeployIndexOperationMetadata
   */
  public static GoogleCloudAiplatformV1DeployIndexOperationMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1DeployIndexOperationMetadata.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1DeployIndexOperationMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
