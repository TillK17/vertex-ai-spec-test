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
import org.openapitools.client.model.GoogleCloudAiplatformV1Model;

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
 * Request message for ModelService.UploadModel.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1UploadModelRequest {
  public static final String SERIALIZED_NAME_PARENT_MODEL = "parentModel";
  @SerializedName(SERIALIZED_NAME_PARENT_MODEL)
  private String parentModel;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private GoogleCloudAiplatformV1Model model;

  public static final String SERIALIZED_NAME_MODEL_ID = "modelId";
  @SerializedName(SERIALIZED_NAME_MODEL_ID)
  private String modelId;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT = "serviceAccount";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT)
  private String serviceAccount;

  public GoogleCloudAiplatformV1UploadModelRequest() {
  }

  public GoogleCloudAiplatformV1UploadModelRequest parentModel(String parentModel) {
    this.parentModel = parentModel;
    return this;
  }

  /**
   * Optional. The resource name of the model into which to upload the version. Only specify this field when uploading a new version.
   * @return parentModel
   */
  @javax.annotation.Nullable
  public String getParentModel() {
    return parentModel;
  }

  public void setParentModel(String parentModel) {
    this.parentModel = parentModel;
  }


  public GoogleCloudAiplatformV1UploadModelRequest model(GoogleCloudAiplatformV1Model model) {
    this.model = model;
    return this;
  }

  /**
   * Required. The Model to create.
   * @return model
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1Model getModel() {
    return model;
  }

  public void setModel(GoogleCloudAiplatformV1Model model) {
    this.model = model;
  }


  public GoogleCloudAiplatformV1UploadModelRequest modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * Optional. The ID to use for the uploaded Model, which will become the final component of the model resource name. This value may be up to 63 characters, and valid characters are &#x60;[a-z0-9_-]&#x60;. The first character cannot be a number or hyphen.
   * @return modelId
   */
  @javax.annotation.Nullable
  public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }


  public GoogleCloudAiplatformV1UploadModelRequest serviceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Optional. The user-provided custom service account to use to do the model upload. If empty, [Vertex AI Service Agent](https://cloud.google.com/vertex-ai/docs/general/access-control#service-agents) will be used to access resources needed to upload the model. This account must belong to the target project where the model is uploaded to, i.e., the project specified in the &#x60;parent&#x60; field of this request and have necessary read permissions (to Google Cloud Storage, Artifact Registry, etc.).
   * @return serviceAccount
   */
  @javax.annotation.Nullable
  public String getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1UploadModelRequest googleCloudAiplatformV1UploadModelRequest = (GoogleCloudAiplatformV1UploadModelRequest) o;
    return Objects.equals(this.parentModel, googleCloudAiplatformV1UploadModelRequest.parentModel) &&
        Objects.equals(this.model, googleCloudAiplatformV1UploadModelRequest.model) &&
        Objects.equals(this.modelId, googleCloudAiplatformV1UploadModelRequest.modelId) &&
        Objects.equals(this.serviceAccount, googleCloudAiplatformV1UploadModelRequest.serviceAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentModel, model, modelId, serviceAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1UploadModelRequest {\n");
    sb.append("    parentModel: ").append(toIndentedString(parentModel)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
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
    openapiFields.add("parentModel");
    openapiFields.add("model");
    openapiFields.add("modelId");
    openapiFields.add("serviceAccount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1UploadModelRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1UploadModelRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1UploadModelRequest is not found in the empty JSON string", GoogleCloudAiplatformV1UploadModelRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1UploadModelRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1UploadModelRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("parentModel") != null && !jsonObj.get("parentModel").isJsonNull()) && !jsonObj.get("parentModel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentModel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentModel").toString()));
      }
      // validate the optional field `model`
      if (jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) {
        GoogleCloudAiplatformV1Model.validateJsonElement(jsonObj.get("model"));
      }
      if ((jsonObj.get("modelId") != null && !jsonObj.get("modelId").isJsonNull()) && !jsonObj.get("modelId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modelId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modelId").toString()));
      }
      if ((jsonObj.get("serviceAccount") != null && !jsonObj.get("serviceAccount").isJsonNull()) && !jsonObj.get("serviceAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceAccount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1UploadModelRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1UploadModelRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1UploadModelRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1UploadModelRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1UploadModelRequest>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1UploadModelRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1UploadModelRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1UploadModelRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1UploadModelRequest
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1UploadModelRequest
   */
  public static GoogleCloudAiplatformV1UploadModelRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1UploadModelRequest.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1UploadModelRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
