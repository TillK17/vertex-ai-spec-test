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
import org.openapitools.client.model.GoogleCloudAiplatformV1FeaturestoreMonitoringConfig;

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
 * An entity type is a type of object in a system that needs to be modeled and have stored information about. For example, driver is an entity type, and driver0 is an instance of an entity type driver.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1EntityType {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_OFFLINE_STORAGE_TTL_DAYS = "offlineStorageTtlDays";
  @SerializedName(SERIALIZED_NAME_OFFLINE_STORAGE_TTL_DAYS)
  private Integer offlineStorageTtlDays;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_SATISFIES_PZS = "satisfiesPzs";
  @SerializedName(SERIALIZED_NAME_SATISFIES_PZS)
  private Boolean satisfiesPzs;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_SATISFIES_PZI = "satisfiesPzi";
  @SerializedName(SERIALIZED_NAME_SATISFIES_PZI)
  private Boolean satisfiesPzi;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MONITORING_CONFIG = "monitoringConfig";
  @SerializedName(SERIALIZED_NAME_MONITORING_CONFIG)
  private GoogleCloudAiplatformV1FeaturestoreMonitoringConfig monitoringConfig;

  public GoogleCloudAiplatformV1EntityType() {
  }

  public GoogleCloudAiplatformV1EntityType(
     String updateTime, 
     Boolean satisfiesPzs, 
     String createTime, 
     Boolean satisfiesPzi
  ) {
    this();
    this.updateTime = updateTime;
    this.satisfiesPzs = satisfiesPzs;
    this.createTime = createTime;
    this.satisfiesPzi = satisfiesPzi;
  }

  public GoogleCloudAiplatformV1EntityType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. Name of the EntityType. Format: &#x60;projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}&#x60; The last part entity_type is assigned by the client. The entity_type can be up to 64 characters long and can consist only of ASCII Latin letters A-Z and a-z and underscore(_), and ASCII digits 0-9 starting with a letter. The value will be unique given a featurestore.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  /**
   * Output only. Timestamp when this EntityType was most recently updated.
   * @return updateTime
   */
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }



  public GoogleCloudAiplatformV1EntityType etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Optional. Used to perform a consistent read-modify-write updates. If not set, a blind \&quot;overwrite\&quot; update happens.
   * @return etag
   */
  @javax.annotation.Nullable
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  public GoogleCloudAiplatformV1EntityType offlineStorageTtlDays(Integer offlineStorageTtlDays) {
    this.offlineStorageTtlDays = offlineStorageTtlDays;
    return this;
  }

  /**
   * Optional. Config for data retention policy in offline storage. TTL in days for feature values that will be stored in offline storage. The Feature Store offline storage periodically removes obsolete feature values older than &#x60;offline_storage_ttl_days&#x60; since the feature generation time. If unset (or explicitly set to 0), default to 4000 days TTL.
   * @return offlineStorageTtlDays
   */
  @javax.annotation.Nullable
  public Integer getOfflineStorageTtlDays() {
    return offlineStorageTtlDays;
  }

  public void setOfflineStorageTtlDays(Integer offlineStorageTtlDays) {
    this.offlineStorageTtlDays = offlineStorageTtlDays;
  }


  public GoogleCloudAiplatformV1EntityType labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public GoogleCloudAiplatformV1EntityType putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Optional. The labels with user-defined metadata to organize your EntityTypes. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information on and examples of labels. No more than 64 user labels can be associated with one EntityType (System labels are excluded).\&quot; System reserved label keys are prefixed with \&quot;aiplatform.googleapis.com/\&quot; and are immutable.
   * @return labels
   */
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  /**
   * Output only. Reserved for future use.
   * @return satisfiesPzs
   */
  @javax.annotation.Nullable
  public Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }



  /**
   * Output only. Timestamp when this EntityType was created.
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }



  /**
   * Output only. Reserved for future use.
   * @return satisfiesPzi
   */
  @javax.annotation.Nullable
  public Boolean getSatisfiesPzi() {
    return satisfiesPzi;
  }



  public GoogleCloudAiplatformV1EntityType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Description of the EntityType.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public GoogleCloudAiplatformV1EntityType monitoringConfig(GoogleCloudAiplatformV1FeaturestoreMonitoringConfig monitoringConfig) {
    this.monitoringConfig = monitoringConfig;
    return this;
  }

  /**
   * Optional. The default monitoring configuration for all Features with value type (Feature.ValueType) BOOL, STRING, DOUBLE or INT64 under this EntityType. If this is populated with [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is disabled.
   * @return monitoringConfig
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1FeaturestoreMonitoringConfig getMonitoringConfig() {
    return monitoringConfig;
  }

  public void setMonitoringConfig(GoogleCloudAiplatformV1FeaturestoreMonitoringConfig monitoringConfig) {
    this.monitoringConfig = monitoringConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1EntityType googleCloudAiplatformV1EntityType = (GoogleCloudAiplatformV1EntityType) o;
    return Objects.equals(this.name, googleCloudAiplatformV1EntityType.name) &&
        Objects.equals(this.updateTime, googleCloudAiplatformV1EntityType.updateTime) &&
        Objects.equals(this.etag, googleCloudAiplatformV1EntityType.etag) &&
        Objects.equals(this.offlineStorageTtlDays, googleCloudAiplatformV1EntityType.offlineStorageTtlDays) &&
        Objects.equals(this.labels, googleCloudAiplatformV1EntityType.labels) &&
        Objects.equals(this.satisfiesPzs, googleCloudAiplatformV1EntityType.satisfiesPzs) &&
        Objects.equals(this.createTime, googleCloudAiplatformV1EntityType.createTime) &&
        Objects.equals(this.satisfiesPzi, googleCloudAiplatformV1EntityType.satisfiesPzi) &&
        Objects.equals(this.description, googleCloudAiplatformV1EntityType.description) &&
        Objects.equals(this.monitoringConfig, googleCloudAiplatformV1EntityType.monitoringConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, updateTime, etag, offlineStorageTtlDays, labels, satisfiesPzs, createTime, satisfiesPzi, description, monitoringConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1EntityType {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    offlineStorageTtlDays: ").append(toIndentedString(offlineStorageTtlDays)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    satisfiesPzs: ").append(toIndentedString(satisfiesPzs)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    satisfiesPzi: ").append(toIndentedString(satisfiesPzi)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    monitoringConfig: ").append(toIndentedString(monitoringConfig)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("updateTime");
    openapiFields.add("etag");
    openapiFields.add("offlineStorageTtlDays");
    openapiFields.add("labels");
    openapiFields.add("satisfiesPzs");
    openapiFields.add("createTime");
    openapiFields.add("satisfiesPzi");
    openapiFields.add("description");
    openapiFields.add("monitoringConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1EntityType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1EntityType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1EntityType is not found in the empty JSON string", GoogleCloudAiplatformV1EntityType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1EntityType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1EntityType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("updateTime") != null && !jsonObj.get("updateTime").isJsonNull()) && !jsonObj.get("updateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateTime").toString()));
      }
      if ((jsonObj.get("etag") != null && !jsonObj.get("etag").isJsonNull()) && !jsonObj.get("etag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `etag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("etag").toString()));
      }
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `monitoringConfig`
      if (jsonObj.get("monitoringConfig") != null && !jsonObj.get("monitoringConfig").isJsonNull()) {
        GoogleCloudAiplatformV1FeaturestoreMonitoringConfig.validateJsonElement(jsonObj.get("monitoringConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1EntityType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1EntityType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1EntityType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1EntityType.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1EntityType>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1EntityType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1EntityType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1EntityType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1EntityType
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1EntityType
   */
  public static GoogleCloudAiplatformV1EntityType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1EntityType.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1EntityType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

