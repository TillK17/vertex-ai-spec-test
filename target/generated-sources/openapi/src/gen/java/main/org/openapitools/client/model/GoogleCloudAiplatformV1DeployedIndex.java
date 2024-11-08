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
import org.openapitools.client.model.GoogleCloudAiplatformV1AutomaticResources;
import org.openapitools.client.model.GoogleCloudAiplatformV1DedicatedResources;
import org.openapitools.client.model.GoogleCloudAiplatformV1DeployedIndexAuthConfig;
import org.openapitools.client.model.GoogleCloudAiplatformV1IndexPrivateEndpoints;
import org.openapitools.client.model.GoogleCloudAiplatformV1PSCAutomationConfig;

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
 * A deployment of an Index. IndexEndpoints contain one or more DeployedIndexes.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1DeployedIndex {
  public static final String SERIALIZED_NAME_DEPLOYMENT_GROUP = "deploymentGroup";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_GROUP)
  private String deploymentGroup;

  public static final String SERIALIZED_NAME_PRIVATE_ENDPOINTS = "privateEndpoints";
  @SerializedName(SERIALIZED_NAME_PRIVATE_ENDPOINTS)
  private GoogleCloudAiplatformV1IndexPrivateEndpoints privateEndpoints;

  public static final String SERIALIZED_NAME_DEPLOYED_INDEX_AUTH_CONFIG = "deployedIndexAuthConfig";
  @SerializedName(SERIALIZED_NAME_DEPLOYED_INDEX_AUTH_CONFIG)
  private GoogleCloudAiplatformV1DeployedIndexAuthConfig deployedIndexAuthConfig;

  public static final String SERIALIZED_NAME_INDEX_SYNC_TIME = "indexSyncTime";
  @SerializedName(SERIALIZED_NAME_INDEX_SYNC_TIME)
  private String indexSyncTime;

  public static final String SERIALIZED_NAME_ENABLE_ACCESS_LOGGING = "enableAccessLogging";
  @SerializedName(SERIALIZED_NAME_ENABLE_ACCESS_LOGGING)
  private Boolean enableAccessLogging;

  public static final String SERIALIZED_NAME_DEDICATED_RESOURCES = "dedicatedResources";
  @SerializedName(SERIALIZED_NAME_DEDICATED_RESOURCES)
  private GoogleCloudAiplatformV1DedicatedResources dedicatedResources;

  public static final String SERIALIZED_NAME_RESERVED_IP_RANGES = "reservedIpRanges";
  @SerializedName(SERIALIZED_NAME_RESERVED_IP_RANGES)
  private List<String> reservedIpRanges = new ArrayList<>();

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_PSC_AUTOMATION_CONFIGS = "pscAutomationConfigs";
  @SerializedName(SERIALIZED_NAME_PSC_AUTOMATION_CONFIGS)
  private List<GoogleCloudAiplatformV1PSCAutomationConfig> pscAutomationConfigs = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private String index;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_AUTOMATIC_RESOURCES = "automaticResources";
  @SerializedName(SERIALIZED_NAME_AUTOMATIC_RESOURCES)
  private GoogleCloudAiplatformV1AutomaticResources automaticResources;

  public GoogleCloudAiplatformV1DeployedIndex() {
  }

  public GoogleCloudAiplatformV1DeployedIndex(
     GoogleCloudAiplatformV1IndexPrivateEndpoints privateEndpoints, 
     String indexSyncTime, 
     String createTime
  ) {
    this();
    this.privateEndpoints = privateEndpoints;
    this.indexSyncTime = indexSyncTime;
    this.createTime = createTime;
  }

  public GoogleCloudAiplatformV1DeployedIndex deploymentGroup(String deploymentGroup) {
    this.deploymentGroup = deploymentGroup;
    return this;
  }

  /**
   * Optional. The deployment group can be no longer than 64 characters (eg: &#39;test&#39;, &#39;prod&#39;). If not set, we will use the &#39;default&#39; deployment group. Creating &#x60;deployment_groups&#x60; with &#x60;reserved_ip_ranges&#x60; is a recommended practice when the peered network has multiple peering ranges. This creates your deployments from predictable IP spaces for easier traffic administration. Also, one deployment_group (except &#39;default&#39;) can only be used with the same reserved_ip_ranges which means if the deployment_group has been used with reserved_ip_ranges: [a, b, c], using it with [a, b] or [d, e] is disallowed. Note: we only support up to 5 deployment groups(not including &#39;default&#39;).
   * @return deploymentGroup
   */
  @javax.annotation.Nullable
  public String getDeploymentGroup() {
    return deploymentGroup;
  }

  public void setDeploymentGroup(String deploymentGroup) {
    this.deploymentGroup = deploymentGroup;
  }


  /**
   * Output only. Provides paths for users to send requests directly to the deployed index services running on Cloud via private services access. This field is populated if network is configured.
   * @return privateEndpoints
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1IndexPrivateEndpoints getPrivateEndpoints() {
    return privateEndpoints;
  }



  public GoogleCloudAiplatformV1DeployedIndex deployedIndexAuthConfig(GoogleCloudAiplatformV1DeployedIndexAuthConfig deployedIndexAuthConfig) {
    this.deployedIndexAuthConfig = deployedIndexAuthConfig;
    return this;
  }

  /**
   * Optional. If set, the authentication is enabled for the private endpoint.
   * @return deployedIndexAuthConfig
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1DeployedIndexAuthConfig getDeployedIndexAuthConfig() {
    return deployedIndexAuthConfig;
  }

  public void setDeployedIndexAuthConfig(GoogleCloudAiplatformV1DeployedIndexAuthConfig deployedIndexAuthConfig) {
    this.deployedIndexAuthConfig = deployedIndexAuthConfig;
  }


  /**
   * Output only. The DeployedIndex may depend on various data on its original Index. Additionally when certain changes to the original Index are being done (e.g. when what the Index contains is being changed) the DeployedIndex may be asynchronously updated in the background to reflect these changes. If this timestamp&#39;s value is at least the Index.update_time of the original Index, it means that this DeployedIndex and the original Index are in sync. If this timestamp is older, then to see which updates this DeployedIndex already contains (and which it does not), one must list the operations that are running on the original Index. Only the successfully completed Operations with update_time equal or before this sync time are contained in this DeployedIndex.
   * @return indexSyncTime
   */
  @javax.annotation.Nullable
  public String getIndexSyncTime() {
    return indexSyncTime;
  }



  public GoogleCloudAiplatformV1DeployedIndex enableAccessLogging(Boolean enableAccessLogging) {
    this.enableAccessLogging = enableAccessLogging;
    return this;
  }

  /**
   * Optional. If true, private endpoint&#39;s access logs are sent to Cloud Logging. These logs are like standard server access logs, containing information like timestamp and latency for each MatchRequest. Note that logs may incur a cost, especially if the deployed index receives a high queries per second rate (QPS). Estimate your costs before enabling this option.
   * @return enableAccessLogging
   */
  @javax.annotation.Nullable
  public Boolean getEnableAccessLogging() {
    return enableAccessLogging;
  }

  public void setEnableAccessLogging(Boolean enableAccessLogging) {
    this.enableAccessLogging = enableAccessLogging;
  }


  public GoogleCloudAiplatformV1DeployedIndex dedicatedResources(GoogleCloudAiplatformV1DedicatedResources dedicatedResources) {
    this.dedicatedResources = dedicatedResources;
    return this;
  }

  /**
   * Optional. A description of resources that are dedicated to the DeployedIndex, and that need a higher degree of manual configuration. The field min_replica_count must be set to a value strictly greater than 0, or else validation will fail. We don&#39;t provide SLA when min_replica_count&#x3D;1. If max_replica_count is not set, the default value is min_replica_count. The max allowed replica count is 1000. Available machine types for SMALL shard: e2-standard-2 and all machine types available for MEDIUM and LARGE shard. Available machine types for MEDIUM shard: e2-standard-16 and all machine types available for LARGE shard. Available machine types for LARGE shard: e2-highmem-16, n2d-standard-32. n1-standard-16 and n1-standard-32 are still available, but we recommend e2-standard-16 and e2-highmem-16 for cost efficiency.
   * @return dedicatedResources
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1DedicatedResources getDedicatedResources() {
    return dedicatedResources;
  }

  public void setDedicatedResources(GoogleCloudAiplatformV1DedicatedResources dedicatedResources) {
    this.dedicatedResources = dedicatedResources;
  }


  public GoogleCloudAiplatformV1DeployedIndex reservedIpRanges(List<String> reservedIpRanges) {
    this.reservedIpRanges = reservedIpRanges;
    return this;
  }

  public GoogleCloudAiplatformV1DeployedIndex addReservedIpRangesItem(String reservedIpRangesItem) {
    if (this.reservedIpRanges == null) {
      this.reservedIpRanges = new ArrayList<>();
    }
    this.reservedIpRanges.add(reservedIpRangesItem);
    return this;
  }

  /**
   * Optional. A list of reserved ip ranges under the VPC network that can be used for this DeployedIndex. If set, we will deploy the index within the provided ip ranges. Otherwise, the index might be deployed to any ip ranges under the provided VPC network. The value should be the name of the address (https://cloud.google.com/compute/docs/reference/rest/v1/addresses) Example: [&#39;vertex-ai-ip-range&#39;]. For more information about subnets and network IP ranges, please see https://cloud.google.com/vpc/docs/subnets#manually_created_subnet_ip_ranges.
   * @return reservedIpRanges
   */
  @javax.annotation.Nullable
  public List<String> getReservedIpRanges() {
    return reservedIpRanges;
  }

  public void setReservedIpRanges(List<String> reservedIpRanges) {
    this.reservedIpRanges = reservedIpRanges;
  }


  public GoogleCloudAiplatformV1DeployedIndex displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the DeployedIndex. If not provided upon creation, the Index&#39;s display_name is used.
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public GoogleCloudAiplatformV1DeployedIndex pscAutomationConfigs(List<GoogleCloudAiplatformV1PSCAutomationConfig> pscAutomationConfigs) {
    this.pscAutomationConfigs = pscAutomationConfigs;
    return this;
  }

  public GoogleCloudAiplatformV1DeployedIndex addPscAutomationConfigsItem(GoogleCloudAiplatformV1PSCAutomationConfig pscAutomationConfigsItem) {
    if (this.pscAutomationConfigs == null) {
      this.pscAutomationConfigs = new ArrayList<>();
    }
    this.pscAutomationConfigs.add(pscAutomationConfigsItem);
    return this;
  }

  /**
   * Optional. If set for PSC deployed index, PSC connection will be automatically created after deployment is done and the endpoint information is populated in private_endpoints.psc_automated_endpoints.
   * @return pscAutomationConfigs
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1PSCAutomationConfig> getPscAutomationConfigs() {
    return pscAutomationConfigs;
  }

  public void setPscAutomationConfigs(List<GoogleCloudAiplatformV1PSCAutomationConfig> pscAutomationConfigs) {
    this.pscAutomationConfigs = pscAutomationConfigs;
  }


  public GoogleCloudAiplatformV1DeployedIndex id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Required. The user specified ID of the DeployedIndex. The ID can be up to 128 characters long and must start with a letter and only contain letters, numbers, and underscores. The ID must be unique within the project it is created in.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public GoogleCloudAiplatformV1DeployedIndex index(String index) {
    this.index = index;
    return this;
  }

  /**
   * Required. The name of the Index this is the deployment of. We may refer to this Index as the DeployedIndex&#39;s \&quot;original\&quot; Index.
   * @return index
   */
  @javax.annotation.Nullable
  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }


  /**
   * Output only. Timestamp when the DeployedIndex was created.
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }



  public GoogleCloudAiplatformV1DeployedIndex automaticResources(GoogleCloudAiplatformV1AutomaticResources automaticResources) {
    this.automaticResources = automaticResources;
    return this;
  }

  /**
   * Optional. A description of resources that the DeployedIndex uses, which to large degree are decided by Vertex AI, and optionally allows only a modest additional configuration. If min_replica_count is not set, the default value is 2 (we don&#39;t provide SLA when min_replica_count&#x3D;1). If max_replica_count is not set, the default value is min_replica_count. The max allowed replica count is 1000.
   * @return automaticResources
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1AutomaticResources getAutomaticResources() {
    return automaticResources;
  }

  public void setAutomaticResources(GoogleCloudAiplatformV1AutomaticResources automaticResources) {
    this.automaticResources = automaticResources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1DeployedIndex googleCloudAiplatformV1DeployedIndex = (GoogleCloudAiplatformV1DeployedIndex) o;
    return Objects.equals(this.deploymentGroup, googleCloudAiplatformV1DeployedIndex.deploymentGroup) &&
        Objects.equals(this.privateEndpoints, googleCloudAiplatformV1DeployedIndex.privateEndpoints) &&
        Objects.equals(this.deployedIndexAuthConfig, googleCloudAiplatformV1DeployedIndex.deployedIndexAuthConfig) &&
        Objects.equals(this.indexSyncTime, googleCloudAiplatformV1DeployedIndex.indexSyncTime) &&
        Objects.equals(this.enableAccessLogging, googleCloudAiplatformV1DeployedIndex.enableAccessLogging) &&
        Objects.equals(this.dedicatedResources, googleCloudAiplatformV1DeployedIndex.dedicatedResources) &&
        Objects.equals(this.reservedIpRanges, googleCloudAiplatformV1DeployedIndex.reservedIpRanges) &&
        Objects.equals(this.displayName, googleCloudAiplatformV1DeployedIndex.displayName) &&
        Objects.equals(this.pscAutomationConfigs, googleCloudAiplatformV1DeployedIndex.pscAutomationConfigs) &&
        Objects.equals(this.id, googleCloudAiplatformV1DeployedIndex.id) &&
        Objects.equals(this.index, googleCloudAiplatformV1DeployedIndex.index) &&
        Objects.equals(this.createTime, googleCloudAiplatformV1DeployedIndex.createTime) &&
        Objects.equals(this.automaticResources, googleCloudAiplatformV1DeployedIndex.automaticResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentGroup, privateEndpoints, deployedIndexAuthConfig, indexSyncTime, enableAccessLogging, dedicatedResources, reservedIpRanges, displayName, pscAutomationConfigs, id, index, createTime, automaticResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1DeployedIndex {\n");
    sb.append("    deploymentGroup: ").append(toIndentedString(deploymentGroup)).append("\n");
    sb.append("    privateEndpoints: ").append(toIndentedString(privateEndpoints)).append("\n");
    sb.append("    deployedIndexAuthConfig: ").append(toIndentedString(deployedIndexAuthConfig)).append("\n");
    sb.append("    indexSyncTime: ").append(toIndentedString(indexSyncTime)).append("\n");
    sb.append("    enableAccessLogging: ").append(toIndentedString(enableAccessLogging)).append("\n");
    sb.append("    dedicatedResources: ").append(toIndentedString(dedicatedResources)).append("\n");
    sb.append("    reservedIpRanges: ").append(toIndentedString(reservedIpRanges)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    pscAutomationConfigs: ").append(toIndentedString(pscAutomationConfigs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    automaticResources: ").append(toIndentedString(automaticResources)).append("\n");
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
    openapiFields.add("deploymentGroup");
    openapiFields.add("privateEndpoints");
    openapiFields.add("deployedIndexAuthConfig");
    openapiFields.add("indexSyncTime");
    openapiFields.add("enableAccessLogging");
    openapiFields.add("dedicatedResources");
    openapiFields.add("reservedIpRanges");
    openapiFields.add("displayName");
    openapiFields.add("pscAutomationConfigs");
    openapiFields.add("id");
    openapiFields.add("index");
    openapiFields.add("createTime");
    openapiFields.add("automaticResources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1DeployedIndex
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1DeployedIndex.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1DeployedIndex is not found in the empty JSON string", GoogleCloudAiplatformV1DeployedIndex.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1DeployedIndex.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1DeployedIndex` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("deploymentGroup") != null && !jsonObj.get("deploymentGroup").isJsonNull()) && !jsonObj.get("deploymentGroup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deploymentGroup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deploymentGroup").toString()));
      }
      // validate the optional field `privateEndpoints`
      if (jsonObj.get("privateEndpoints") != null && !jsonObj.get("privateEndpoints").isJsonNull()) {
        GoogleCloudAiplatformV1IndexPrivateEndpoints.validateJsonElement(jsonObj.get("privateEndpoints"));
      }
      // validate the optional field `deployedIndexAuthConfig`
      if (jsonObj.get("deployedIndexAuthConfig") != null && !jsonObj.get("deployedIndexAuthConfig").isJsonNull()) {
        GoogleCloudAiplatformV1DeployedIndexAuthConfig.validateJsonElement(jsonObj.get("deployedIndexAuthConfig"));
      }
      if ((jsonObj.get("indexSyncTime") != null && !jsonObj.get("indexSyncTime").isJsonNull()) && !jsonObj.get("indexSyncTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `indexSyncTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("indexSyncTime").toString()));
      }
      // validate the optional field `dedicatedResources`
      if (jsonObj.get("dedicatedResources") != null && !jsonObj.get("dedicatedResources").isJsonNull()) {
        GoogleCloudAiplatformV1DedicatedResources.validateJsonElement(jsonObj.get("dedicatedResources"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("reservedIpRanges") != null && !jsonObj.get("reservedIpRanges").isJsonNull() && !jsonObj.get("reservedIpRanges").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reservedIpRanges` to be an array in the JSON string but got `%s`", jsonObj.get("reservedIpRanges").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (jsonObj.get("pscAutomationConfigs") != null && !jsonObj.get("pscAutomationConfigs").isJsonNull()) {
        JsonArray jsonArraypscAutomationConfigs = jsonObj.getAsJsonArray("pscAutomationConfigs");
        if (jsonArraypscAutomationConfigs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pscAutomationConfigs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pscAutomationConfigs` to be an array in the JSON string but got `%s`", jsonObj.get("pscAutomationConfigs").toString()));
          }

          // validate the optional field `pscAutomationConfigs` (array)
          for (int i = 0; i < jsonArraypscAutomationConfigs.size(); i++) {
            GoogleCloudAiplatformV1PSCAutomationConfig.validateJsonElement(jsonArraypscAutomationConfigs.get(i));
          };
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("index") != null && !jsonObj.get("index").isJsonNull()) && !jsonObj.get("index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("index").toString()));
      }
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      // validate the optional field `automaticResources`
      if (jsonObj.get("automaticResources") != null && !jsonObj.get("automaticResources").isJsonNull()) {
        GoogleCloudAiplatformV1AutomaticResources.validateJsonElement(jsonObj.get("automaticResources"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1DeployedIndex.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1DeployedIndex' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1DeployedIndex> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1DeployedIndex.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1DeployedIndex>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1DeployedIndex value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1DeployedIndex read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1DeployedIndex given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1DeployedIndex
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1DeployedIndex
   */
  public static GoogleCloudAiplatformV1DeployedIndex fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1DeployedIndex.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1DeployedIndex to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

