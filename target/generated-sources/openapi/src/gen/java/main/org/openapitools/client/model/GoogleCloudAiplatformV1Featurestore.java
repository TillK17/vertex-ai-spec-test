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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.GoogleCloudAiplatformV1EncryptionSpec;
import org.openapitools.client.model.GoogleCloudAiplatformV1FeaturestoreOnlineServingConfig;

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
 * Vertex AI Feature Store provides a centralized repository for organizing, storing, and serving ML features. The Featurestore is a top-level container for your features and their values.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1Featurestore {
  public static final String SERIALIZED_NAME_ONLINE_STORAGE_TTL_DAYS = "onlineStorageTtlDays";
  @SerializedName(SERIALIZED_NAME_ONLINE_STORAGE_TTL_DAYS)
  private Integer onlineStorageTtlDays;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public static final String SERIALIZED_NAME_SATISFIES_PZS = "satisfiesPzs";
  @SerializedName(SERIALIZED_NAME_SATISFIES_PZS)
  private Boolean satisfiesPzs;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_ENCRYPTION_SPEC = "encryptionSpec";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_SPEC)
  private GoogleCloudAiplatformV1EncryptionSpec encryptionSpec;

  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_SATISFIES_PZI = "satisfiesPzi";
  @SerializedName(SERIALIZED_NAME_SATISFIES_PZI)
  private Boolean satisfiesPzi;

  /**
   * Output only. State of the featurestore.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    STATE_UNSPECIFIED("STATE_UNSPECIFIED"),
    
    STABLE("STABLE"),
    
    UPDATING("UPDATING");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ONLINE_SERVING_CONFIG = "onlineServingConfig";
  @SerializedName(SERIALIZED_NAME_ONLINE_SERVING_CONFIG)
  private GoogleCloudAiplatformV1FeaturestoreOnlineServingConfig onlineServingConfig;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public GoogleCloudAiplatformV1Featurestore() {
  }

  public GoogleCloudAiplatformV1Featurestore(
     String updateTime, 
     Boolean satisfiesPzs, 
     Boolean satisfiesPzi, 
     StateEnum state, 
     String name, 
     String createTime
  ) {
    this();
    this.updateTime = updateTime;
    this.satisfiesPzs = satisfiesPzs;
    this.satisfiesPzi = satisfiesPzi;
    this.state = state;
    this.name = name;
    this.createTime = createTime;
  }

  public GoogleCloudAiplatformV1Featurestore onlineStorageTtlDays(Integer onlineStorageTtlDays) {
    this.onlineStorageTtlDays = onlineStorageTtlDays;
    return this;
  }

  /**
   * Optional. TTL in days for feature values that will be stored in online serving storage. The Feature Store online storage periodically removes obsolete feature values older than &#x60;online_storage_ttl_days&#x60; since the feature generation time. Note that &#x60;online_storage_ttl_days&#x60; should be less than or equal to &#x60;offline_storage_ttl_days&#x60; for each EntityType under a featurestore. If not set, default to 4000 days
   * @return onlineStorageTtlDays
   */
  @javax.annotation.Nullable
  public Integer getOnlineStorageTtlDays() {
    return onlineStorageTtlDays;
  }

  public void setOnlineStorageTtlDays(Integer onlineStorageTtlDays) {
    this.onlineStorageTtlDays = onlineStorageTtlDays;
  }


  /**
   * Output only. Timestamp when this Featurestore was last updated.
   * @return updateTime
   */
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }



  /**
   * Output only. Reserved for future use.
   * @return satisfiesPzs
   */
  @javax.annotation.Nullable
  public Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }



  public GoogleCloudAiplatformV1Featurestore labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public GoogleCloudAiplatformV1Featurestore putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Optional. The labels with user-defined metadata to organize your Featurestore. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information on and examples of labels. No more than 64 user labels can be associated with one Featurestore(System labels are excluded).\&quot; System reserved label keys are prefixed with \&quot;aiplatform.googleapis.com/\&quot; and are immutable.
   * @return labels
   */
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public GoogleCloudAiplatformV1Featurestore encryptionSpec(GoogleCloudAiplatformV1EncryptionSpec encryptionSpec) {
    this.encryptionSpec = encryptionSpec;
    return this;
  }

  /**
   * Optional. Customer-managed encryption key spec for data storage. If set, both of the online and offline data storage will be secured by this key.
   * @return encryptionSpec
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1EncryptionSpec getEncryptionSpec() {
    return encryptionSpec;
  }

  public void setEncryptionSpec(GoogleCloudAiplatformV1EncryptionSpec encryptionSpec) {
    this.encryptionSpec = encryptionSpec;
  }


  public GoogleCloudAiplatformV1Featurestore etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Optional. Used to perform consistent read-modify-write updates. If not set, a blind \&quot;overwrite\&quot; update happens.
   * @return etag
   */
  @javax.annotation.Nullable
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  /**
   * Output only. Reserved for future use.
   * @return satisfiesPzi
   */
  @javax.annotation.Nullable
  public Boolean getSatisfiesPzi() {
    return satisfiesPzi;
  }



  /**
   * Output only. State of the featurestore.
   * @return state
   */
  @javax.annotation.Nullable
  public StateEnum getState() {
    return state;
  }



  /**
   * Output only. Name of the Featurestore. Format: &#x60;projects/{project}/locations/{location}/featurestores/{featurestore}&#x60;
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }



  public GoogleCloudAiplatformV1Featurestore onlineServingConfig(GoogleCloudAiplatformV1FeaturestoreOnlineServingConfig onlineServingConfig) {
    this.onlineServingConfig = onlineServingConfig;
    return this;
  }

  /**
   * Optional. Config for online storage resources. The field should not co-exist with the field of &#x60;OnlineStoreReplicationConfig&#x60;. If both of it and OnlineStoreReplicationConfig are unset, the feature store will not have an online store and cannot be used for online serving.
   * @return onlineServingConfig
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1FeaturestoreOnlineServingConfig getOnlineServingConfig() {
    return onlineServingConfig;
  }

  public void setOnlineServingConfig(GoogleCloudAiplatformV1FeaturestoreOnlineServingConfig onlineServingConfig) {
    this.onlineServingConfig = onlineServingConfig;
  }


  /**
   * Output only. Timestamp when this Featurestore was created.
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1Featurestore googleCloudAiplatformV1Featurestore = (GoogleCloudAiplatformV1Featurestore) o;
    return Objects.equals(this.onlineStorageTtlDays, googleCloudAiplatformV1Featurestore.onlineStorageTtlDays) &&
        Objects.equals(this.updateTime, googleCloudAiplatformV1Featurestore.updateTime) &&
        Objects.equals(this.satisfiesPzs, googleCloudAiplatformV1Featurestore.satisfiesPzs) &&
        Objects.equals(this.labels, googleCloudAiplatformV1Featurestore.labels) &&
        Objects.equals(this.encryptionSpec, googleCloudAiplatformV1Featurestore.encryptionSpec) &&
        Objects.equals(this.etag, googleCloudAiplatformV1Featurestore.etag) &&
        Objects.equals(this.satisfiesPzi, googleCloudAiplatformV1Featurestore.satisfiesPzi) &&
        Objects.equals(this.state, googleCloudAiplatformV1Featurestore.state) &&
        Objects.equals(this.name, googleCloudAiplatformV1Featurestore.name) &&
        Objects.equals(this.onlineServingConfig, googleCloudAiplatformV1Featurestore.onlineServingConfig) &&
        Objects.equals(this.createTime, googleCloudAiplatformV1Featurestore.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineStorageTtlDays, updateTime, satisfiesPzs, labels, encryptionSpec, etag, satisfiesPzi, state, name, onlineServingConfig, createTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1Featurestore {\n");
    sb.append("    onlineStorageTtlDays: ").append(toIndentedString(onlineStorageTtlDays)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    satisfiesPzs: ").append(toIndentedString(satisfiesPzs)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    encryptionSpec: ").append(toIndentedString(encryptionSpec)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    satisfiesPzi: ").append(toIndentedString(satisfiesPzi)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onlineServingConfig: ").append(toIndentedString(onlineServingConfig)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
    openapiFields.add("onlineStorageTtlDays");
    openapiFields.add("updateTime");
    openapiFields.add("satisfiesPzs");
    openapiFields.add("labels");
    openapiFields.add("encryptionSpec");
    openapiFields.add("etag");
    openapiFields.add("satisfiesPzi");
    openapiFields.add("state");
    openapiFields.add("name");
    openapiFields.add("onlineServingConfig");
    openapiFields.add("createTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1Featurestore
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1Featurestore.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1Featurestore is not found in the empty JSON string", GoogleCloudAiplatformV1Featurestore.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1Featurestore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1Featurestore` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("updateTime") != null && !jsonObj.get("updateTime").isJsonNull()) && !jsonObj.get("updateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateTime").toString()));
      }
      // validate the optional field `encryptionSpec`
      if (jsonObj.get("encryptionSpec") != null && !jsonObj.get("encryptionSpec").isJsonNull()) {
        GoogleCloudAiplatformV1EncryptionSpec.validateJsonElement(jsonObj.get("encryptionSpec"));
      }
      if ((jsonObj.get("etag") != null && !jsonObj.get("etag").isJsonNull()) && !jsonObj.get("etag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `etag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("etag").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        StateEnum.validateJsonElement(jsonObj.get("state"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `onlineServingConfig`
      if (jsonObj.get("onlineServingConfig") != null && !jsonObj.get("onlineServingConfig").isJsonNull()) {
        GoogleCloudAiplatformV1FeaturestoreOnlineServingConfig.validateJsonElement(jsonObj.get("onlineServingConfig"));
      }
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1Featurestore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1Featurestore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1Featurestore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1Featurestore.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1Featurestore>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1Featurestore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1Featurestore read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1Featurestore given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1Featurestore
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1Featurestore
   */
  public static GoogleCloudAiplatformV1Featurestore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1Featurestore.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1Featurestore to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
