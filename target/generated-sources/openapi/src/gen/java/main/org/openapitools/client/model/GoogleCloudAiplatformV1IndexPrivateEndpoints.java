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
import org.openapitools.client.model.GoogleCloudAiplatformV1PscAutomatedEndpoints;

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
 * IndexPrivateEndpoints proto is used to provide paths for users to send requests via private endpoints (e.g. private service access, private service connect). To send request via private service access, use match_grpc_address. To send request via private service connect, use service_attachment.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1IndexPrivateEndpoints {
  public static final String SERIALIZED_NAME_MATCH_GRPC_ADDRESS = "matchGrpcAddress";
  @SerializedName(SERIALIZED_NAME_MATCH_GRPC_ADDRESS)
  private String matchGrpcAddress;

  public static final String SERIALIZED_NAME_PSC_AUTOMATED_ENDPOINTS = "pscAutomatedEndpoints";
  @SerializedName(SERIALIZED_NAME_PSC_AUTOMATED_ENDPOINTS)
  private List<GoogleCloudAiplatformV1PscAutomatedEndpoints> pscAutomatedEndpoints = new ArrayList<>();

  public static final String SERIALIZED_NAME_SERVICE_ATTACHMENT = "serviceAttachment";
  @SerializedName(SERIALIZED_NAME_SERVICE_ATTACHMENT)
  private String serviceAttachment;

  public GoogleCloudAiplatformV1IndexPrivateEndpoints() {
  }

  public GoogleCloudAiplatformV1IndexPrivateEndpoints(
     String matchGrpcAddress, 
     String serviceAttachment
  ) {
    this();
    this.matchGrpcAddress = matchGrpcAddress;
    this.serviceAttachment = serviceAttachment;
  }

  /**
   * Output only. The ip address used to send match gRPC requests.
   * @return matchGrpcAddress
   */
  @javax.annotation.Nullable
  public String getMatchGrpcAddress() {
    return matchGrpcAddress;
  }



  public GoogleCloudAiplatformV1IndexPrivateEndpoints pscAutomatedEndpoints(List<GoogleCloudAiplatformV1PscAutomatedEndpoints> pscAutomatedEndpoints) {
    this.pscAutomatedEndpoints = pscAutomatedEndpoints;
    return this;
  }

  public GoogleCloudAiplatformV1IndexPrivateEndpoints addPscAutomatedEndpointsItem(GoogleCloudAiplatformV1PscAutomatedEndpoints pscAutomatedEndpointsItem) {
    if (this.pscAutomatedEndpoints == null) {
      this.pscAutomatedEndpoints = new ArrayList<>();
    }
    this.pscAutomatedEndpoints.add(pscAutomatedEndpointsItem);
    return this;
  }

  /**
   * Output only. PscAutomatedEndpoints is populated if private service connect is enabled if PscAutomatedConfig is set.
   * @return pscAutomatedEndpoints
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1PscAutomatedEndpoints> getPscAutomatedEndpoints() {
    return pscAutomatedEndpoints;
  }

  public void setPscAutomatedEndpoints(List<GoogleCloudAiplatformV1PscAutomatedEndpoints> pscAutomatedEndpoints) {
    this.pscAutomatedEndpoints = pscAutomatedEndpoints;
  }


  /**
   * Output only. The name of the service attachment resource. Populated if private service connect is enabled.
   * @return serviceAttachment
   */
  @javax.annotation.Nullable
  public String getServiceAttachment() {
    return serviceAttachment;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1IndexPrivateEndpoints googleCloudAiplatformV1IndexPrivateEndpoints = (GoogleCloudAiplatformV1IndexPrivateEndpoints) o;
    return Objects.equals(this.matchGrpcAddress, googleCloudAiplatformV1IndexPrivateEndpoints.matchGrpcAddress) &&
        Objects.equals(this.pscAutomatedEndpoints, googleCloudAiplatformV1IndexPrivateEndpoints.pscAutomatedEndpoints) &&
        Objects.equals(this.serviceAttachment, googleCloudAiplatformV1IndexPrivateEndpoints.serviceAttachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchGrpcAddress, pscAutomatedEndpoints, serviceAttachment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1IndexPrivateEndpoints {\n");
    sb.append("    matchGrpcAddress: ").append(toIndentedString(matchGrpcAddress)).append("\n");
    sb.append("    pscAutomatedEndpoints: ").append(toIndentedString(pscAutomatedEndpoints)).append("\n");
    sb.append("    serviceAttachment: ").append(toIndentedString(serviceAttachment)).append("\n");
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
    openapiFields.add("matchGrpcAddress");
    openapiFields.add("pscAutomatedEndpoints");
    openapiFields.add("serviceAttachment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1IndexPrivateEndpoints
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1IndexPrivateEndpoints.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1IndexPrivateEndpoints is not found in the empty JSON string", GoogleCloudAiplatformV1IndexPrivateEndpoints.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1IndexPrivateEndpoints.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1IndexPrivateEndpoints` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("matchGrpcAddress") != null && !jsonObj.get("matchGrpcAddress").isJsonNull()) && !jsonObj.get("matchGrpcAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchGrpcAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchGrpcAddress").toString()));
      }
      if (jsonObj.get("pscAutomatedEndpoints") != null && !jsonObj.get("pscAutomatedEndpoints").isJsonNull()) {
        JsonArray jsonArraypscAutomatedEndpoints = jsonObj.getAsJsonArray("pscAutomatedEndpoints");
        if (jsonArraypscAutomatedEndpoints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pscAutomatedEndpoints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pscAutomatedEndpoints` to be an array in the JSON string but got `%s`", jsonObj.get("pscAutomatedEndpoints").toString()));
          }

          // validate the optional field `pscAutomatedEndpoints` (array)
          for (int i = 0; i < jsonArraypscAutomatedEndpoints.size(); i++) {
            GoogleCloudAiplatformV1PscAutomatedEndpoints.validateJsonElement(jsonArraypscAutomatedEndpoints.get(i));
          };
        }
      }
      if ((jsonObj.get("serviceAttachment") != null && !jsonObj.get("serviceAttachment").isJsonNull()) && !jsonObj.get("serviceAttachment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceAttachment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceAttachment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1IndexPrivateEndpoints.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1IndexPrivateEndpoints' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1IndexPrivateEndpoints> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1IndexPrivateEndpoints.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1IndexPrivateEndpoints>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1IndexPrivateEndpoints value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1IndexPrivateEndpoints read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1IndexPrivateEndpoints given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1IndexPrivateEndpoints
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1IndexPrivateEndpoints
   */
  public static GoogleCloudAiplatformV1IndexPrivateEndpoints fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1IndexPrivateEndpoints.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1IndexPrivateEndpoints to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
