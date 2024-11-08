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
import org.openapitools.client.model.GoogleCloudAiplatformV1ResourcePool;
import org.openapitools.client.model.GoogleCloudAiplatformV1ResourceRuntime;
import org.openapitools.client.model.GoogleCloudAiplatformV1ResourceRuntimeSpec;
import org.openapitools.client.model.GoogleRpcStatus;

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
 * Represents long-lasting resources that are dedicated to users to runs custom workloads. A PersistentResource can have multiple node pools and each node pool can have its own machine spec.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1PersistentResource {
  /**
   * Output only. The detailed state of a Study.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    STATE_UNSPECIFIED("STATE_UNSPECIFIED"),
    
    PROVISIONING("PROVISIONING"),
    
    RUNNING("RUNNING"),
    
    STOPPING("STOPPING"),
    
    ERROR("ERROR"),
    
    REBOOTING("REBOOTING"),
    
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

  public static final String SERIALIZED_NAME_ENCRYPTION_SPEC = "encryptionSpec";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_SPEC)
  private GoogleCloudAiplatformV1EncryptionSpec encryptionSpec;

  public static final String SERIALIZED_NAME_SATISFIES_PZS = "satisfiesPzs";
  @SerializedName(SERIALIZED_NAME_SATISFIES_PZS)
  private Boolean satisfiesPzs;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private GoogleRpcStatus error;

  public static final String SERIALIZED_NAME_SATISFIES_PZI = "satisfiesPzi";
  @SerializedName(SERIALIZED_NAME_SATISFIES_PZI)
  private Boolean satisfiesPzi;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_RESOURCE_RUNTIME_SPEC = "resourceRuntimeSpec";
  @SerializedName(SERIALIZED_NAME_RESOURCE_RUNTIME_SPEC)
  private GoogleCloudAiplatformV1ResourceRuntimeSpec resourceRuntimeSpec;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RESERVED_IP_RANGES = "reservedIpRanges";
  @SerializedName(SERIALIZED_NAME_RESERVED_IP_RANGES)
  private List<String> reservedIpRanges = new ArrayList<>();

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_RESOURCE_POOLS = "resourcePools";
  @SerializedName(SERIALIZED_NAME_RESOURCE_POOLS)
  private List<GoogleCloudAiplatformV1ResourcePool> resourcePools = new ArrayList<>();

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_RESOURCE_RUNTIME = "resourceRuntime";
  @SerializedName(SERIALIZED_NAME_RESOURCE_RUNTIME)
  private GoogleCloudAiplatformV1ResourceRuntime resourceRuntime;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public GoogleCloudAiplatformV1PersistentResource() {
  }

  public GoogleCloudAiplatformV1PersistentResource(
     StateEnum state, 
     Boolean satisfiesPzs, 
     GoogleRpcStatus error, 
     Boolean satisfiesPzi, 
     String createTime, 
     String startTime, 
     GoogleCloudAiplatformV1ResourceRuntime resourceRuntime, 
     String updateTime
  ) {
    this();
    this.state = state;
    this.satisfiesPzs = satisfiesPzs;
    this.error = error;
    this.satisfiesPzi = satisfiesPzi;
    this.createTime = createTime;
    this.startTime = startTime;
    this.resourceRuntime = resourceRuntime;
    this.updateTime = updateTime;
  }

  /**
   * Output only. The detailed state of a Study.
   * @return state
   */
  @javax.annotation.Nullable
  public StateEnum getState() {
    return state;
  }



  public GoogleCloudAiplatformV1PersistentResource encryptionSpec(GoogleCloudAiplatformV1EncryptionSpec encryptionSpec) {
    this.encryptionSpec = encryptionSpec;
    return this;
  }

  /**
   * Optional. Customer-managed encryption key spec for a PersistentResource. If set, this PersistentResource and all sub-resources of this PersistentResource will be secured by this key.
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
   * Output only. Reserved for future use.
   * @return satisfiesPzs
   */
  @javax.annotation.Nullable
  public Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }



  /**
   * Output only. Only populated when persistent resource&#39;s state is &#x60;STOPPING&#x60; or &#x60;ERROR&#x60;.
   * @return error
   */
  @javax.annotation.Nullable
  public GoogleRpcStatus getError() {
    return error;
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
   * Output only. Time when the PersistentResource was created.
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }



  public GoogleCloudAiplatformV1PersistentResource labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public GoogleCloudAiplatformV1PersistentResource putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Optional. The labels with user-defined metadata to organize PersistentResource. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels.
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
   * Output only. Time when the PersistentResource for the first time entered the &#x60;RUNNING&#x60; state.
   * @return startTime
   */
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }



  public GoogleCloudAiplatformV1PersistentResource resourceRuntimeSpec(GoogleCloudAiplatformV1ResourceRuntimeSpec resourceRuntimeSpec) {
    this.resourceRuntimeSpec = resourceRuntimeSpec;
    return this;
  }

  /**
   * Optional. Persistent Resource runtime spec. For example, used for Ray cluster configuration.
   * @return resourceRuntimeSpec
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ResourceRuntimeSpec getResourceRuntimeSpec() {
    return resourceRuntimeSpec;
  }

  public void setResourceRuntimeSpec(GoogleCloudAiplatformV1ResourceRuntimeSpec resourceRuntimeSpec) {
    this.resourceRuntimeSpec = resourceRuntimeSpec;
  }


  public GoogleCloudAiplatformV1PersistentResource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. Resource name of a PersistentResource.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public GoogleCloudAiplatformV1PersistentResource reservedIpRanges(List<String> reservedIpRanges) {
    this.reservedIpRanges = reservedIpRanges;
    return this;
  }

  public GoogleCloudAiplatformV1PersistentResource addReservedIpRangesItem(String reservedIpRangesItem) {
    if (this.reservedIpRanges == null) {
      this.reservedIpRanges = new ArrayList<>();
    }
    this.reservedIpRanges.add(reservedIpRangesItem);
    return this;
  }

  /**
   * Optional. A list of names for the reserved IP ranges under the VPC network that can be used for this persistent resource. If set, we will deploy the persistent resource within the provided IP ranges. Otherwise, the persistent resource is deployed to any IP ranges under the provided VPC network. Example: [&#39;vertex-ai-ip-range&#39;].
   * @return reservedIpRanges
   */
  @javax.annotation.Nullable
  public List<String> getReservedIpRanges() {
    return reservedIpRanges;
  }

  public void setReservedIpRanges(List<String> reservedIpRanges) {
    this.reservedIpRanges = reservedIpRanges;
  }


  public GoogleCloudAiplatformV1PersistentResource network(String network) {
    this.network = network;
    return this;
  }

  /**
   * Optional. The full name of the Compute Engine [network](/compute/docs/networks-and-firewalls#networks) to peered with Vertex AI to host the persistent resources. For example, &#x60;projects/12345/global/networks/myVPC&#x60;. [Format](/compute/docs/reference/rest/v1/networks/insert) is of the form &#x60;projects/{project}/global/networks/{network}&#x60;. Where {project} is a project number, as in &#x60;12345&#x60;, and {network} is a network name. To specify this field, you must have already [configured VPC Network Peering for Vertex AI](https://cloud.google.com/vertex-ai/docs/general/vpc-peering). If this field is left unspecified, the resources aren&#39;t peered with any network.
   * @return network
   */
  @javax.annotation.Nullable
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }


  public GoogleCloudAiplatformV1PersistentResource resourcePools(List<GoogleCloudAiplatformV1ResourcePool> resourcePools) {
    this.resourcePools = resourcePools;
    return this;
  }

  public GoogleCloudAiplatformV1PersistentResource addResourcePoolsItem(GoogleCloudAiplatformV1ResourcePool resourcePoolsItem) {
    if (this.resourcePools == null) {
      this.resourcePools = new ArrayList<>();
    }
    this.resourcePools.add(resourcePoolsItem);
    return this;
  }

  /**
   * Required. The spec of the pools of different resources.
   * @return resourcePools
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1ResourcePool> getResourcePools() {
    return resourcePools;
  }

  public void setResourcePools(List<GoogleCloudAiplatformV1ResourcePool> resourcePools) {
    this.resourcePools = resourcePools;
  }


  public GoogleCloudAiplatformV1PersistentResource displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. The display name of the PersistentResource. The name can be up to 128 characters long and can consist of any UTF-8 characters.
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
   * Output only. Runtime information of the Persistent Resource.
   * @return resourceRuntime
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ResourceRuntime getResourceRuntime() {
    return resourceRuntime;
  }



  /**
   * Output only. Time when the PersistentResource was most recently updated.
   * @return updateTime
   */
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1PersistentResource googleCloudAiplatformV1PersistentResource = (GoogleCloudAiplatformV1PersistentResource) o;
    return Objects.equals(this.state, googleCloudAiplatformV1PersistentResource.state) &&
        Objects.equals(this.encryptionSpec, googleCloudAiplatformV1PersistentResource.encryptionSpec) &&
        Objects.equals(this.satisfiesPzs, googleCloudAiplatformV1PersistentResource.satisfiesPzs) &&
        Objects.equals(this.error, googleCloudAiplatformV1PersistentResource.error) &&
        Objects.equals(this.satisfiesPzi, googleCloudAiplatformV1PersistentResource.satisfiesPzi) &&
        Objects.equals(this.createTime, googleCloudAiplatformV1PersistentResource.createTime) &&
        Objects.equals(this.labels, googleCloudAiplatformV1PersistentResource.labels) &&
        Objects.equals(this.startTime, googleCloudAiplatformV1PersistentResource.startTime) &&
        Objects.equals(this.resourceRuntimeSpec, googleCloudAiplatformV1PersistentResource.resourceRuntimeSpec) &&
        Objects.equals(this.name, googleCloudAiplatformV1PersistentResource.name) &&
        Objects.equals(this.reservedIpRanges, googleCloudAiplatformV1PersistentResource.reservedIpRanges) &&
        Objects.equals(this.network, googleCloudAiplatformV1PersistentResource.network) &&
        Objects.equals(this.resourcePools, googleCloudAiplatformV1PersistentResource.resourcePools) &&
        Objects.equals(this.displayName, googleCloudAiplatformV1PersistentResource.displayName) &&
        Objects.equals(this.resourceRuntime, googleCloudAiplatformV1PersistentResource.resourceRuntime) &&
        Objects.equals(this.updateTime, googleCloudAiplatformV1PersistentResource.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, encryptionSpec, satisfiesPzs, error, satisfiesPzi, createTime, labels, startTime, resourceRuntimeSpec, name, reservedIpRanges, network, resourcePools, displayName, resourceRuntime, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1PersistentResource {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    encryptionSpec: ").append(toIndentedString(encryptionSpec)).append("\n");
    sb.append("    satisfiesPzs: ").append(toIndentedString(satisfiesPzs)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    satisfiesPzi: ").append(toIndentedString(satisfiesPzi)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    resourceRuntimeSpec: ").append(toIndentedString(resourceRuntimeSpec)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reservedIpRanges: ").append(toIndentedString(reservedIpRanges)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    resourcePools: ").append(toIndentedString(resourcePools)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    resourceRuntime: ").append(toIndentedString(resourceRuntime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("state");
    openapiFields.add("encryptionSpec");
    openapiFields.add("satisfiesPzs");
    openapiFields.add("error");
    openapiFields.add("satisfiesPzi");
    openapiFields.add("createTime");
    openapiFields.add("labels");
    openapiFields.add("startTime");
    openapiFields.add("resourceRuntimeSpec");
    openapiFields.add("name");
    openapiFields.add("reservedIpRanges");
    openapiFields.add("network");
    openapiFields.add("resourcePools");
    openapiFields.add("displayName");
    openapiFields.add("resourceRuntime");
    openapiFields.add("updateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1PersistentResource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1PersistentResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1PersistentResource is not found in the empty JSON string", GoogleCloudAiplatformV1PersistentResource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1PersistentResource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1PersistentResource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        StateEnum.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `encryptionSpec`
      if (jsonObj.get("encryptionSpec") != null && !jsonObj.get("encryptionSpec").isJsonNull()) {
        GoogleCloudAiplatformV1EncryptionSpec.validateJsonElement(jsonObj.get("encryptionSpec"));
      }
      // validate the optional field `error`
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) {
        GoogleRpcStatus.validateJsonElement(jsonObj.get("error"));
      }
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      if ((jsonObj.get("startTime") != null && !jsonObj.get("startTime").isJsonNull()) && !jsonObj.get("startTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startTime").toString()));
      }
      // validate the optional field `resourceRuntimeSpec`
      if (jsonObj.get("resourceRuntimeSpec") != null && !jsonObj.get("resourceRuntimeSpec").isJsonNull()) {
        GoogleCloudAiplatformV1ResourceRuntimeSpec.validateJsonElement(jsonObj.get("resourceRuntimeSpec"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("reservedIpRanges") != null && !jsonObj.get("reservedIpRanges").isJsonNull() && !jsonObj.get("reservedIpRanges").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reservedIpRanges` to be an array in the JSON string but got `%s`", jsonObj.get("reservedIpRanges").toString()));
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      if (jsonObj.get("resourcePools") != null && !jsonObj.get("resourcePools").isJsonNull()) {
        JsonArray jsonArrayresourcePools = jsonObj.getAsJsonArray("resourcePools");
        if (jsonArrayresourcePools != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resourcePools").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resourcePools` to be an array in the JSON string but got `%s`", jsonObj.get("resourcePools").toString()));
          }

          // validate the optional field `resourcePools` (array)
          for (int i = 0; i < jsonArrayresourcePools.size(); i++) {
            GoogleCloudAiplatformV1ResourcePool.validateJsonElement(jsonArrayresourcePools.get(i));
          };
        }
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      // validate the optional field `resourceRuntime`
      if (jsonObj.get("resourceRuntime") != null && !jsonObj.get("resourceRuntime").isJsonNull()) {
        GoogleCloudAiplatformV1ResourceRuntime.validateJsonElement(jsonObj.get("resourceRuntime"));
      }
      if ((jsonObj.get("updateTime") != null && !jsonObj.get("updateTime").isJsonNull()) && !jsonObj.get("updateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1PersistentResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1PersistentResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1PersistentResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1PersistentResource.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1PersistentResource>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1PersistentResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1PersistentResource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1PersistentResource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1PersistentResource
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1PersistentResource
   */
  public static GoogleCloudAiplatformV1PersistentResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1PersistentResource.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1PersistentResource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

