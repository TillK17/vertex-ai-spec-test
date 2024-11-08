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
import org.openapitools.client.model.GoogleCloudAiplatformV1EncryptionSpec;
import org.openapitools.client.model.GoogleCloudAiplatformV1MetadataStoreDataplexConfig;
import org.openapitools.client.model.GoogleCloudAiplatformV1MetadataStoreMetadataStoreState;

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
 * Instance of a metadata store. Contains a set of metadata that can be queried.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1MetadataStore {
  public static final String SERIALIZED_NAME_DATAPLEX_CONFIG = "dataplexConfig";
  @SerializedName(SERIALIZED_NAME_DATAPLEX_CONFIG)
  private GoogleCloudAiplatformV1MetadataStoreDataplexConfig dataplexConfig;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENCRYPTION_SPEC = "encryptionSpec";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_SPEC)
  private GoogleCloudAiplatformV1EncryptionSpec encryptionSpec;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private GoogleCloudAiplatformV1MetadataStoreMetadataStoreState state;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public GoogleCloudAiplatformV1MetadataStore() {
  }

  public GoogleCloudAiplatformV1MetadataStore(
     String name, 
     String updateTime, 
     GoogleCloudAiplatformV1MetadataStoreMetadataStoreState state, 
     String createTime
  ) {
    this();
    this.name = name;
    this.updateTime = updateTime;
    this.state = state;
    this.createTime = createTime;
  }

  public GoogleCloudAiplatformV1MetadataStore dataplexConfig(GoogleCloudAiplatformV1MetadataStoreDataplexConfig dataplexConfig) {
    this.dataplexConfig = dataplexConfig;
    return this;
  }

  /**
   * Optional. Dataplex integration settings.
   * @return dataplexConfig
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1MetadataStoreDataplexConfig getDataplexConfig() {
    return dataplexConfig;
  }

  public void setDataplexConfig(GoogleCloudAiplatformV1MetadataStoreDataplexConfig dataplexConfig) {
    this.dataplexConfig = dataplexConfig;
  }


  /**
   * Output only. The resource name of the MetadataStore instance.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }



  public GoogleCloudAiplatformV1MetadataStore encryptionSpec(GoogleCloudAiplatformV1EncryptionSpec encryptionSpec) {
    this.encryptionSpec = encryptionSpec;
    return this;
  }

  /**
   * Customer-managed encryption key spec for a Metadata Store. If set, this Metadata Store and all sub-resources of this Metadata Store are secured using this key.
   * @return encryptionSpec
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1EncryptionSpec getEncryptionSpec() {
    return encryptionSpec;
  }

  public void setEncryptionSpec(GoogleCloudAiplatformV1EncryptionSpec encryptionSpec) {
    this.encryptionSpec = encryptionSpec;
  }


  /**
   * Output only. Timestamp when this MetadataStore was last updated.
   * @return updateTime
   */
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }



  /**
   * Output only. State information of the MetadataStore.
   * @return state
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1MetadataStoreMetadataStoreState getState() {
    return state;
  }



  /**
   * Output only. Timestamp when this MetadataStore was created.
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }



  public GoogleCloudAiplatformV1MetadataStore description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the MetadataStore.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1MetadataStore googleCloudAiplatformV1MetadataStore = (GoogleCloudAiplatformV1MetadataStore) o;
    return Objects.equals(this.dataplexConfig, googleCloudAiplatformV1MetadataStore.dataplexConfig) &&
        Objects.equals(this.name, googleCloudAiplatformV1MetadataStore.name) &&
        Objects.equals(this.encryptionSpec, googleCloudAiplatformV1MetadataStore.encryptionSpec) &&
        Objects.equals(this.updateTime, googleCloudAiplatformV1MetadataStore.updateTime) &&
        Objects.equals(this.state, googleCloudAiplatformV1MetadataStore.state) &&
        Objects.equals(this.createTime, googleCloudAiplatformV1MetadataStore.createTime) &&
        Objects.equals(this.description, googleCloudAiplatformV1MetadataStore.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataplexConfig, name, encryptionSpec, updateTime, state, createTime, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1MetadataStore {\n");
    sb.append("    dataplexConfig: ").append(toIndentedString(dataplexConfig)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    encryptionSpec: ").append(toIndentedString(encryptionSpec)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("dataplexConfig");
    openapiFields.add("name");
    openapiFields.add("encryptionSpec");
    openapiFields.add("updateTime");
    openapiFields.add("state");
    openapiFields.add("createTime");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1MetadataStore
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1MetadataStore.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1MetadataStore is not found in the empty JSON string", GoogleCloudAiplatformV1MetadataStore.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1MetadataStore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1MetadataStore` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `dataplexConfig`
      if (jsonObj.get("dataplexConfig") != null && !jsonObj.get("dataplexConfig").isJsonNull()) {
        GoogleCloudAiplatformV1MetadataStoreDataplexConfig.validateJsonElement(jsonObj.get("dataplexConfig"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `encryptionSpec`
      if (jsonObj.get("encryptionSpec") != null && !jsonObj.get("encryptionSpec").isJsonNull()) {
        GoogleCloudAiplatformV1EncryptionSpec.validateJsonElement(jsonObj.get("encryptionSpec"));
      }
      if ((jsonObj.get("updateTime") != null && !jsonObj.get("updateTime").isJsonNull()) && !jsonObj.get("updateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateTime").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        GoogleCloudAiplatformV1MetadataStoreMetadataStoreState.validateJsonElement(jsonObj.get("state"));
      }
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1MetadataStore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1MetadataStore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1MetadataStore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1MetadataStore.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1MetadataStore>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1MetadataStore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1MetadataStore read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1MetadataStore given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1MetadataStore
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1MetadataStore
   */
  public static GoogleCloudAiplatformV1MetadataStore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1MetadataStore.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1MetadataStore to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

