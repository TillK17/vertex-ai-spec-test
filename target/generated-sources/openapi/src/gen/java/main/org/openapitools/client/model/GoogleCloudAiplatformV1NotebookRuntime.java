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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.GoogleCloudAiplatformV1EncryptionSpec;
import org.openapitools.client.model.GoogleCloudAiplatformV1NotebookIdleShutdownConfig;
import org.openapitools.client.model.GoogleCloudAiplatformV1NotebookRuntimeTemplateRef;

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
 * A runtime is a virtual machine allocated to a particular user for a particular Notebook file on temporary basis with lifetime limited to 24 hours.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1NotebookRuntime {
  public static final String SERIALIZED_NAME_RUNTIME_USER = "runtimeUser";
  @SerializedName(SERIALIZED_NAME_RUNTIME_USER)
  private String runtimeUser;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_NOTEBOOK_RUNTIME_TEMPLATE_REF = "notebookRuntimeTemplateRef";
  @SerializedName(SERIALIZED_NAME_NOTEBOOK_RUNTIME_TEMPLATE_REF)
  private GoogleCloudAiplatformV1NotebookRuntimeTemplateRef notebookRuntimeTemplateRef;

  public static final String SERIALIZED_NAME_IDLE_SHUTDOWN_CONFIG = "idleShutdownConfig";
  @SerializedName(SERIALIZED_NAME_IDLE_SHUTDOWN_CONFIG)
  private GoogleCloudAiplatformV1NotebookIdleShutdownConfig idleShutdownConfig;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SATISFIES_PZI = "satisfiesPzi";
  @SerializedName(SERIALIZED_NAME_SATISFIES_PZI)
  private Boolean satisfiesPzi;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  /**
   * Output only. The type of the notebook runtime.
   */
  @JsonAdapter(NotebookRuntimeTypeEnum.Adapter.class)
  public enum NotebookRuntimeTypeEnum {
    NOTEBOOK_RUNTIME_TYPE_UNSPECIFIED("NOTEBOOK_RUNTIME_TYPE_UNSPECIFIED"),
    
    USER_DEFINED("USER_DEFINED"),
    
    ONE_CLICK("ONE_CLICK");

    private String value;

    NotebookRuntimeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotebookRuntimeTypeEnum fromValue(String value) {
      for (NotebookRuntimeTypeEnum b : NotebookRuntimeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NotebookRuntimeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotebookRuntimeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotebookRuntimeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NotebookRuntimeTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NotebookRuntimeTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NOTEBOOK_RUNTIME_TYPE = "notebookRuntimeType";
  @SerializedName(SERIALIZED_NAME_NOTEBOOK_RUNTIME_TYPE)
  private NotebookRuntimeTypeEnum notebookRuntimeType;

  public static final String SERIALIZED_NAME_SATISFIES_PZS = "satisfiesPzs";
  @SerializedName(SERIALIZED_NAME_SATISFIES_PZS)
  private Boolean satisfiesPzs;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_ENCRYPTION_SPEC = "encryptionSpec";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_SPEC)
  private GoogleCloudAiplatformV1EncryptionSpec encryptionSpec;

  /**
   * Output only. The health state of the NotebookRuntime.
   */
  @JsonAdapter(HealthStateEnum.Adapter.class)
  public enum HealthStateEnum {
    HEALTH_STATE_UNSPECIFIED("HEALTH_STATE_UNSPECIFIED"),
    
    HEALTHY("HEALTHY"),
    
    UNHEALTHY("UNHEALTHY");

    private String value;

    HealthStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HealthStateEnum fromValue(String value) {
      for (HealthStateEnum b : HealthStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HealthStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HealthStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HealthStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HealthStateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      HealthStateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_HEALTH_STATE = "healthState";
  @SerializedName(SERIALIZED_NAME_HEALTH_STATE)
  private HealthStateEnum healthState;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT = "serviceAccount";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT)
  private String serviceAccount;

  /**
   * Output only. The runtime (instance) state of the NotebookRuntime.
   */
  @JsonAdapter(RuntimeStateEnum.Adapter.class)
  public enum RuntimeStateEnum {
    RUNTIME_STATE_UNSPECIFIED("RUNTIME_STATE_UNSPECIFIED"),
    
    RUNNING("RUNNING"),
    
    BEING_STARTED("BEING_STARTED"),
    
    BEING_STOPPED("BEING_STOPPED"),
    
    STOPPED("STOPPED"),
    
    BEING_UPGRADED("BEING_UPGRADED"),
    
    ERROR("ERROR"),
    
    INVALID("INVALID");

    private String value;

    RuntimeStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RuntimeStateEnum fromValue(String value) {
      for (RuntimeStateEnum b : RuntimeStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RuntimeStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RuntimeStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RuntimeStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RuntimeStateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RuntimeStateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RUNTIME_STATE = "runtimeState";
  @SerializedName(SERIALIZED_NAME_RUNTIME_STATE)
  private RuntimeStateEnum runtimeState;

  public static final String SERIALIZED_NAME_NETWORK_TAGS = "networkTags";
  @SerializedName(SERIALIZED_NAME_NETWORK_TAGS)
  private List<String> networkTags = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_UPGRADABLE = "isUpgradable";
  @SerializedName(SERIALIZED_NAME_IS_UPGRADABLE)
  private Boolean isUpgradable;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME = "expirationTime";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME)
  private String expirationTime;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public static final String SERIALIZED_NAME_PROXY_URI = "proxyUri";
  @SerializedName(SERIALIZED_NAME_PROXY_URI)
  private String proxyUri;

  public GoogleCloudAiplatformV1NotebookRuntime() {
  }

  public GoogleCloudAiplatformV1NotebookRuntime(
     String createTime, 
     GoogleCloudAiplatformV1NotebookRuntimeTemplateRef notebookRuntimeTemplateRef, 
     GoogleCloudAiplatformV1NotebookIdleShutdownConfig idleShutdownConfig, 
     Boolean satisfiesPzi, 
     NotebookRuntimeTypeEnum notebookRuntimeType, 
     Boolean satisfiesPzs, 
     String version, 
     GoogleCloudAiplatformV1EncryptionSpec encryptionSpec, 
     HealthStateEnum healthState, 
     String serviceAccount, 
     RuntimeStateEnum runtimeState, 
     Boolean isUpgradable, 
     String expirationTime, 
     String name, 
     String updateTime, 
     String proxyUri
  ) {
    this();
    this.createTime = createTime;
    this.notebookRuntimeTemplateRef = notebookRuntimeTemplateRef;
    this.idleShutdownConfig = idleShutdownConfig;
    this.satisfiesPzi = satisfiesPzi;
    this.notebookRuntimeType = notebookRuntimeType;
    this.satisfiesPzs = satisfiesPzs;
    this.version = version;
    this.encryptionSpec = encryptionSpec;
    this.healthState = healthState;
    this.serviceAccount = serviceAccount;
    this.runtimeState = runtimeState;
    this.isUpgradable = isUpgradable;
    this.expirationTime = expirationTime;
    this.name = name;
    this.updateTime = updateTime;
    this.proxyUri = proxyUri;
  }

  public GoogleCloudAiplatformV1NotebookRuntime runtimeUser(String runtimeUser) {
    this.runtimeUser = runtimeUser;
    return this;
  }

  /**
   * Required. The user email of the NotebookRuntime.
   * @return runtimeUser
   */
  @javax.annotation.Nullable
  public String getRuntimeUser() {
    return runtimeUser;
  }

  public void setRuntimeUser(String runtimeUser) {
    this.runtimeUser = runtimeUser;
  }


  /**
   * Output only. Timestamp when this NotebookRuntime was created.
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }



  /**
   * Output only. The pointer to NotebookRuntimeTemplate this NotebookRuntime is created from.
   * @return notebookRuntimeTemplateRef
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1NotebookRuntimeTemplateRef getNotebookRuntimeTemplateRef() {
    return notebookRuntimeTemplateRef;
  }



  /**
   * Output only. The idle shutdown configuration of the notebook runtime.
   * @return idleShutdownConfig
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1NotebookIdleShutdownConfig getIdleShutdownConfig() {
    return idleShutdownConfig;
  }



  public GoogleCloudAiplatformV1NotebookRuntime description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the NotebookRuntime.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Output only. Reserved for future use.
   * @return satisfiesPzi
   */
  @javax.annotation.Nullable
  public Boolean getSatisfiesPzi() {
    return satisfiesPzi;
  }



  public GoogleCloudAiplatformV1NotebookRuntime displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. The display name of the NotebookRuntime. The name can be up to 128 characters long and can consist of any UTF-8 characters.
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * Output only. The type of the notebook runtime.
   * @return notebookRuntimeType
   */
  @javax.annotation.Nullable
  public NotebookRuntimeTypeEnum getNotebookRuntimeType() {
    return notebookRuntimeType;
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
   * Output only. The VM os image version of NotebookRuntime.
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }



  public GoogleCloudAiplatformV1NotebookRuntime labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public GoogleCloudAiplatformV1NotebookRuntime putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * The labels with user-defined metadata to organize your NotebookRuntime. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one NotebookRuntime (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with \&quot;aiplatform.googleapis.com/\&quot; and are immutable. Following system labels exist for NotebookRuntime: * \&quot;aiplatform.googleapis.com/notebook_runtime_gce_instance_id\&quot;: output only, its value is the Compute Engine instance id. * \&quot;aiplatform.googleapis.com/colab_enterprise_entry_service\&quot;: its value is either \&quot;bigquery\&quot; or \&quot;vertex\&quot;; if absent, it should be \&quot;vertex\&quot;. This is to describe the entry service, either BigQuery or Vertex.
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
   * Output only. Customer-managed encryption key spec for the notebook runtime.
   * @return encryptionSpec
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1EncryptionSpec getEncryptionSpec() {
    return encryptionSpec;
  }



  /**
   * Output only. The health state of the NotebookRuntime.
   * @return healthState
   */
  @javax.annotation.Nullable
  public HealthStateEnum getHealthState() {
    return healthState;
  }



  /**
   * Output only. The service account that the NotebookRuntime workload runs as.
   * @return serviceAccount
   */
  @javax.annotation.Nullable
  public String getServiceAccount() {
    return serviceAccount;
  }



  /**
   * Output only. The runtime (instance) state of the NotebookRuntime.
   * @return runtimeState
   */
  @javax.annotation.Nullable
  public RuntimeStateEnum getRuntimeState() {
    return runtimeState;
  }



  public GoogleCloudAiplatformV1NotebookRuntime networkTags(List<String> networkTags) {
    this.networkTags = networkTags;
    return this;
  }

  public GoogleCloudAiplatformV1NotebookRuntime addNetworkTagsItem(String networkTagsItem) {
    if (this.networkTags == null) {
      this.networkTags = new ArrayList<>();
    }
    this.networkTags.add(networkTagsItem);
    return this;
  }

  /**
   * Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/vpc/docs/add-remove-network-tags)).
   * @return networkTags
   */
  @javax.annotation.Nullable
  public List<String> getNetworkTags() {
    return networkTags;
  }

  public void setNetworkTags(List<String> networkTags) {
    this.networkTags = networkTags;
  }


  /**
   * Output only. Whether NotebookRuntime is upgradable.
   * @return isUpgradable
   */
  @javax.annotation.Nullable
  public Boolean getIsUpgradable() {
    return isUpgradable;
  }



  /**
   * Output only. Timestamp when this NotebookRuntime will be expired: 1. System Predefined NotebookRuntime: 24 hours after creation. After expiration, system predifined runtime will be deleted. 2. User created NotebookRuntime: 6 months after last upgrade. After expiration, user created runtime will be stopped and allowed for upgrade.
   * @return expirationTime
   */
  @javax.annotation.Nullable
  public String getExpirationTime() {
    return expirationTime;
  }



  /**
   * Output only. The resource name of the NotebookRuntime.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }



  /**
   * Output only. Timestamp when this NotebookRuntime was most recently updated.
   * @return updateTime
   */
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }



  /**
   * Output only. The proxy endpoint used to access the NotebookRuntime.
   * @return proxyUri
   */
  @javax.annotation.Nullable
  public String getProxyUri() {
    return proxyUri;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1NotebookRuntime googleCloudAiplatformV1NotebookRuntime = (GoogleCloudAiplatformV1NotebookRuntime) o;
    return Objects.equals(this.runtimeUser, googleCloudAiplatformV1NotebookRuntime.runtimeUser) &&
        Objects.equals(this.createTime, googleCloudAiplatformV1NotebookRuntime.createTime) &&
        Objects.equals(this.notebookRuntimeTemplateRef, googleCloudAiplatformV1NotebookRuntime.notebookRuntimeTemplateRef) &&
        Objects.equals(this.idleShutdownConfig, googleCloudAiplatformV1NotebookRuntime.idleShutdownConfig) &&
        Objects.equals(this.description, googleCloudAiplatformV1NotebookRuntime.description) &&
        Objects.equals(this.satisfiesPzi, googleCloudAiplatformV1NotebookRuntime.satisfiesPzi) &&
        Objects.equals(this.displayName, googleCloudAiplatformV1NotebookRuntime.displayName) &&
        Objects.equals(this.notebookRuntimeType, googleCloudAiplatformV1NotebookRuntime.notebookRuntimeType) &&
        Objects.equals(this.satisfiesPzs, googleCloudAiplatformV1NotebookRuntime.satisfiesPzs) &&
        Objects.equals(this.version, googleCloudAiplatformV1NotebookRuntime.version) &&
        Objects.equals(this.labels, googleCloudAiplatformV1NotebookRuntime.labels) &&
        Objects.equals(this.encryptionSpec, googleCloudAiplatformV1NotebookRuntime.encryptionSpec) &&
        Objects.equals(this.healthState, googleCloudAiplatformV1NotebookRuntime.healthState) &&
        Objects.equals(this.serviceAccount, googleCloudAiplatformV1NotebookRuntime.serviceAccount) &&
        Objects.equals(this.runtimeState, googleCloudAiplatformV1NotebookRuntime.runtimeState) &&
        Objects.equals(this.networkTags, googleCloudAiplatformV1NotebookRuntime.networkTags) &&
        Objects.equals(this.isUpgradable, googleCloudAiplatformV1NotebookRuntime.isUpgradable) &&
        Objects.equals(this.expirationTime, googleCloudAiplatformV1NotebookRuntime.expirationTime) &&
        Objects.equals(this.name, googleCloudAiplatformV1NotebookRuntime.name) &&
        Objects.equals(this.updateTime, googleCloudAiplatformV1NotebookRuntime.updateTime) &&
        Objects.equals(this.proxyUri, googleCloudAiplatformV1NotebookRuntime.proxyUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runtimeUser, createTime, notebookRuntimeTemplateRef, idleShutdownConfig, description, satisfiesPzi, displayName, notebookRuntimeType, satisfiesPzs, version, labels, encryptionSpec, healthState, serviceAccount, runtimeState, networkTags, isUpgradable, expirationTime, name, updateTime, proxyUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1NotebookRuntime {\n");
    sb.append("    runtimeUser: ").append(toIndentedString(runtimeUser)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    notebookRuntimeTemplateRef: ").append(toIndentedString(notebookRuntimeTemplateRef)).append("\n");
    sb.append("    idleShutdownConfig: ").append(toIndentedString(idleShutdownConfig)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    satisfiesPzi: ").append(toIndentedString(satisfiesPzi)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    notebookRuntimeType: ").append(toIndentedString(notebookRuntimeType)).append("\n");
    sb.append("    satisfiesPzs: ").append(toIndentedString(satisfiesPzs)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    encryptionSpec: ").append(toIndentedString(encryptionSpec)).append("\n");
    sb.append("    healthState: ").append(toIndentedString(healthState)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    runtimeState: ").append(toIndentedString(runtimeState)).append("\n");
    sb.append("    networkTags: ").append(toIndentedString(networkTags)).append("\n");
    sb.append("    isUpgradable: ").append(toIndentedString(isUpgradable)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    proxyUri: ").append(toIndentedString(proxyUri)).append("\n");
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
    openapiFields.add("runtimeUser");
    openapiFields.add("createTime");
    openapiFields.add("notebookRuntimeTemplateRef");
    openapiFields.add("idleShutdownConfig");
    openapiFields.add("description");
    openapiFields.add("satisfiesPzi");
    openapiFields.add("displayName");
    openapiFields.add("notebookRuntimeType");
    openapiFields.add("satisfiesPzs");
    openapiFields.add("version");
    openapiFields.add("labels");
    openapiFields.add("encryptionSpec");
    openapiFields.add("healthState");
    openapiFields.add("serviceAccount");
    openapiFields.add("runtimeState");
    openapiFields.add("networkTags");
    openapiFields.add("isUpgradable");
    openapiFields.add("expirationTime");
    openapiFields.add("name");
    openapiFields.add("updateTime");
    openapiFields.add("proxyUri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1NotebookRuntime
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1NotebookRuntime.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1NotebookRuntime is not found in the empty JSON string", GoogleCloudAiplatformV1NotebookRuntime.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1NotebookRuntime.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1NotebookRuntime` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("runtimeUser") != null && !jsonObj.get("runtimeUser").isJsonNull()) && !jsonObj.get("runtimeUser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runtimeUser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runtimeUser").toString()));
      }
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      // validate the optional field `notebookRuntimeTemplateRef`
      if (jsonObj.get("notebookRuntimeTemplateRef") != null && !jsonObj.get("notebookRuntimeTemplateRef").isJsonNull()) {
        GoogleCloudAiplatformV1NotebookRuntimeTemplateRef.validateJsonElement(jsonObj.get("notebookRuntimeTemplateRef"));
      }
      // validate the optional field `idleShutdownConfig`
      if (jsonObj.get("idleShutdownConfig") != null && !jsonObj.get("idleShutdownConfig").isJsonNull()) {
        GoogleCloudAiplatformV1NotebookIdleShutdownConfig.validateJsonElement(jsonObj.get("idleShutdownConfig"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("notebookRuntimeType") != null && !jsonObj.get("notebookRuntimeType").isJsonNull()) && !jsonObj.get("notebookRuntimeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notebookRuntimeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notebookRuntimeType").toString()));
      }
      // validate the optional field `notebookRuntimeType`
      if (jsonObj.get("notebookRuntimeType") != null && !jsonObj.get("notebookRuntimeType").isJsonNull()) {
        NotebookRuntimeTypeEnum.validateJsonElement(jsonObj.get("notebookRuntimeType"));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      // validate the optional field `encryptionSpec`
      if (jsonObj.get("encryptionSpec") != null && !jsonObj.get("encryptionSpec").isJsonNull()) {
        GoogleCloudAiplatformV1EncryptionSpec.validateJsonElement(jsonObj.get("encryptionSpec"));
      }
      if ((jsonObj.get("healthState") != null && !jsonObj.get("healthState").isJsonNull()) && !jsonObj.get("healthState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `healthState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("healthState").toString()));
      }
      // validate the optional field `healthState`
      if (jsonObj.get("healthState") != null && !jsonObj.get("healthState").isJsonNull()) {
        HealthStateEnum.validateJsonElement(jsonObj.get("healthState"));
      }
      if ((jsonObj.get("serviceAccount") != null && !jsonObj.get("serviceAccount").isJsonNull()) && !jsonObj.get("serviceAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceAccount").toString()));
      }
      if ((jsonObj.get("runtimeState") != null && !jsonObj.get("runtimeState").isJsonNull()) && !jsonObj.get("runtimeState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runtimeState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runtimeState").toString()));
      }
      // validate the optional field `runtimeState`
      if (jsonObj.get("runtimeState") != null && !jsonObj.get("runtimeState").isJsonNull()) {
        RuntimeStateEnum.validateJsonElement(jsonObj.get("runtimeState"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("networkTags") != null && !jsonObj.get("networkTags").isJsonNull() && !jsonObj.get("networkTags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkTags` to be an array in the JSON string but got `%s`", jsonObj.get("networkTags").toString()));
      }
      if ((jsonObj.get("expirationTime") != null && !jsonObj.get("expirationTime").isJsonNull()) && !jsonObj.get("expirationTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expirationTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expirationTime").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("updateTime") != null && !jsonObj.get("updateTime").isJsonNull()) && !jsonObj.get("updateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateTime").toString()));
      }
      if ((jsonObj.get("proxyUri") != null && !jsonObj.get("proxyUri").isJsonNull()) && !jsonObj.get("proxyUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proxyUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proxyUri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1NotebookRuntime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1NotebookRuntime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1NotebookRuntime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1NotebookRuntime.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1NotebookRuntime>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1NotebookRuntime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1NotebookRuntime read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1NotebookRuntime given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1NotebookRuntime
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1NotebookRuntime
   */
  public static GoogleCloudAiplatformV1NotebookRuntime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1NotebookRuntime.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1NotebookRuntime to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
