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
import org.openapitools.client.model.GoogleCloudAiplatformV1DeployedModel;
import org.openapitools.client.model.GoogleCloudAiplatformV1EncryptionSpec;
import org.openapitools.client.model.GoogleCloudAiplatformV1PredictRequestResponseLoggingConfig;
import org.openapitools.client.model.GoogleCloudAiplatformV1PrivateServiceConnectConfig;

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
 * Models are deployed into it, and afterwards Endpoint is called to obtain predictions and explanations.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1Endpoint {
  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_ENABLE_PRIVATE_SERVICE_CONNECT = "enablePrivateServiceConnect";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_ENABLE_PRIVATE_SERVICE_CONNECT)
  private Boolean enablePrivateServiceConnect;

  public static final String SERIALIZED_NAME_ENCRYPTION_SPEC = "encryptionSpec";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_SPEC)
  private GoogleCloudAiplatformV1EncryptionSpec encryptionSpec;

  public static final String SERIALIZED_NAME_SATISFIES_PZI = "satisfiesPzi";
  @SerializedName(SERIALIZED_NAME_SATISFIES_PZI)
  private Boolean satisfiesPzi;

  public static final String SERIALIZED_NAME_SATISFIES_PZS = "satisfiesPzs";
  @SerializedName(SERIALIZED_NAME_SATISFIES_PZS)
  private Boolean satisfiesPzs;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_PRIVATE_SERVICE_CONNECT_CONFIG = "privateServiceConnectConfig";
  @SerializedName(SERIALIZED_NAME_PRIVATE_SERVICE_CONNECT_CONFIG)
  private GoogleCloudAiplatformV1PrivateServiceConnectConfig privateServiceConnectConfig;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DEDICATED_ENDPOINT_DNS = "dedicatedEndpointDns";
  @SerializedName(SERIALIZED_NAME_DEDICATED_ENDPOINT_DNS)
  private String dedicatedEndpointDns;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DEDICATED_ENDPOINT_ENABLED = "dedicatedEndpointEnabled";
  @SerializedName(SERIALIZED_NAME_DEDICATED_ENDPOINT_ENABLED)
  private Boolean dedicatedEndpointEnabled;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_MODEL_DEPLOYMENT_MONITORING_JOB = "modelDeploymentMonitoringJob";
  @SerializedName(SERIALIZED_NAME_MODEL_DEPLOYMENT_MONITORING_JOB)
  private String modelDeploymentMonitoringJob;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TRAFFIC_SPLIT = "trafficSplit";
  @SerializedName(SERIALIZED_NAME_TRAFFIC_SPLIT)
  private Map<String, Integer> trafficSplit = new HashMap<>();

  public static final String SERIALIZED_NAME_DEPLOYED_MODELS = "deployedModels";
  @SerializedName(SERIALIZED_NAME_DEPLOYED_MODELS)
  private List<GoogleCloudAiplatformV1DeployedModel> deployedModels = new ArrayList<>();

  public static final String SERIALIZED_NAME_PREDICT_REQUEST_RESPONSE_LOGGING_CONFIG = "predictRequestResponseLoggingConfig";
  @SerializedName(SERIALIZED_NAME_PREDICT_REQUEST_RESPONSE_LOGGING_CONFIG)
  private GoogleCloudAiplatformV1PredictRequestResponseLoggingConfig predictRequestResponseLoggingConfig;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public GoogleCloudAiplatformV1Endpoint() {
  }

  public GoogleCloudAiplatformV1Endpoint(
     Boolean satisfiesPzi, 
     Boolean satisfiesPzs, 
     String dedicatedEndpointDns, 
     String updateTime, 
     String createTime, 
     String modelDeploymentMonitoringJob, 
     String name
  ) {
    this();
    this.satisfiesPzi = satisfiesPzi;
    this.satisfiesPzs = satisfiesPzs;
    this.dedicatedEndpointDns = dedicatedEndpointDns;
    this.updateTime = updateTime;
    this.createTime = createTime;
    this.modelDeploymentMonitoringJob = modelDeploymentMonitoringJob;
    this.name = name;
  }

  public GoogleCloudAiplatformV1Endpoint etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Used to perform consistent read-modify-write updates. If not set, a blind \&quot;overwrite\&quot; update happens.
   * @return etag
   */
  @javax.annotation.Nullable
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  @Deprecated
  public GoogleCloudAiplatformV1Endpoint enablePrivateServiceConnect(Boolean enablePrivateServiceConnect) {
    this.enablePrivateServiceConnect = enablePrivateServiceConnect;
    return this;
  }

  /**
   * Deprecated: If true, expose the Endpoint via private service connect. Only one of the fields, network or enable_private_service_connect, can be set.
   * @return enablePrivateServiceConnect
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public Boolean getEnablePrivateServiceConnect() {
    return enablePrivateServiceConnect;
  }

  @Deprecated
  public void setEnablePrivateServiceConnect(Boolean enablePrivateServiceConnect) {
    this.enablePrivateServiceConnect = enablePrivateServiceConnect;
  }


  public GoogleCloudAiplatformV1Endpoint encryptionSpec(GoogleCloudAiplatformV1EncryptionSpec encryptionSpec) {
    this.encryptionSpec = encryptionSpec;
    return this;
  }

  /**
   * Customer-managed encryption key spec for an Endpoint. If set, this Endpoint and all sub-resources of this Endpoint will be secured by this key.
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
   * @return satisfiesPzi
   */
  @javax.annotation.Nullable
  public Boolean getSatisfiesPzi() {
    return satisfiesPzi;
  }



  /**
   * Output only. Reserved for future use.
   * @return satisfiesPzs
   */
  @javax.annotation.Nullable
  public Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }



  public GoogleCloudAiplatformV1Endpoint network(String network) {
    this.network = network;
    return this;
  }

  /**
   * Optional. The full name of the Google Compute Engine [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks) to which the Endpoint should be peered. Private services access must already be configured for the network. If left unspecified, the Endpoint is not peered with any network. Only one of the fields, network or enable_private_service_connect, can be set. [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert): &#x60;projects/{project}/global/networks/{network}&#x60;. Where &#x60;{project}&#x60; is a project number, as in &#x60;12345&#x60;, and &#x60;{network}&#x60; is network name.
   * @return network
   */
  @javax.annotation.Nullable
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }


  public GoogleCloudAiplatformV1Endpoint privateServiceConnectConfig(GoogleCloudAiplatformV1PrivateServiceConnectConfig privateServiceConnectConfig) {
    this.privateServiceConnectConfig = privateServiceConnectConfig;
    return this;
  }

  /**
   * Optional. Configuration for private service connect. network and private_service_connect_config are mutually exclusive.
   * @return privateServiceConnectConfig
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1PrivateServiceConnectConfig getPrivateServiceConnectConfig() {
    return privateServiceConnectConfig;
  }

  public void setPrivateServiceConnectConfig(GoogleCloudAiplatformV1PrivateServiceConnectConfig privateServiceConnectConfig) {
    this.privateServiceConnectConfig = privateServiceConnectConfig;
  }


  public GoogleCloudAiplatformV1Endpoint displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. The display name of the Endpoint. The name can be up to 128 characters long and can consist of any UTF-8 characters.
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
   * Output only. DNS of the dedicated endpoint. Will only be populated if dedicated_endpoint_enabled is true. Format: &#x60;https://{endpoint_id}.{region}-{project_number}.prediction.vertexai.goog&#x60;.
   * @return dedicatedEndpointDns
   */
  @javax.annotation.Nullable
  public String getDedicatedEndpointDns() {
    return dedicatedEndpointDns;
  }



  /**
   * Output only. Timestamp when this Endpoint was last updated.
   * @return updateTime
   */
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }



  public GoogleCloudAiplatformV1Endpoint description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the Endpoint.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public GoogleCloudAiplatformV1Endpoint dedicatedEndpointEnabled(Boolean dedicatedEndpointEnabled) {
    this.dedicatedEndpointEnabled = dedicatedEndpointEnabled;
    return this;
  }

  /**
   * If true, the endpoint will be exposed through a dedicated DNS [Endpoint.dedicated_endpoint_dns]. Your request to the dedicated DNS will be isolated from other users&#39; traffic and will have better performance and reliability. Note: Once you enabled dedicated endpoint, you won&#39;t be able to send request to the shared DNS {region}-aiplatform.googleapis.com. The limitation will be removed soon.
   * @return dedicatedEndpointEnabled
   */
  @javax.annotation.Nullable
  public Boolean getDedicatedEndpointEnabled() {
    return dedicatedEndpointEnabled;
  }

  public void setDedicatedEndpointEnabled(Boolean dedicatedEndpointEnabled) {
    this.dedicatedEndpointEnabled = dedicatedEndpointEnabled;
  }


  /**
   * Output only. Timestamp when this Endpoint was created.
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }



  /**
   * Output only. Resource name of the Model Monitoring job associated with this Endpoint if monitoring is enabled by JobService.CreateModelDeploymentMonitoringJob. Format: &#x60;projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}&#x60;
   * @return modelDeploymentMonitoringJob
   */
  @javax.annotation.Nullable
  public String getModelDeploymentMonitoringJob() {
    return modelDeploymentMonitoringJob;
  }



  /**
   * Output only. The resource name of the Endpoint.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }



  public GoogleCloudAiplatformV1Endpoint trafficSplit(Map<String, Integer> trafficSplit) {
    this.trafficSplit = trafficSplit;
    return this;
  }

  public GoogleCloudAiplatformV1Endpoint putTrafficSplitItem(String key, Integer trafficSplitItem) {
    if (this.trafficSplit == null) {
      this.trafficSplit = new HashMap<>();
    }
    this.trafficSplit.put(key, trafficSplitItem);
    return this;
  }

  /**
   * A map from a DeployedModel&#39;s ID to the percentage of this Endpoint&#39;s traffic that should be forwarded to that DeployedModel. If a DeployedModel&#39;s ID is not listed in this map, then it receives no traffic. The traffic percentage values must add up to 100, or map must be empty if the Endpoint is to not accept any traffic at a moment.
   * @return trafficSplit
   */
  @javax.annotation.Nullable
  public Map<String, Integer> getTrafficSplit() {
    return trafficSplit;
  }

  public void setTrafficSplit(Map<String, Integer> trafficSplit) {
    this.trafficSplit = trafficSplit;
  }


  public GoogleCloudAiplatformV1Endpoint deployedModels(List<GoogleCloudAiplatformV1DeployedModel> deployedModels) {
    this.deployedModels = deployedModels;
    return this;
  }

  public GoogleCloudAiplatformV1Endpoint addDeployedModelsItem(GoogleCloudAiplatformV1DeployedModel deployedModelsItem) {
    if (this.deployedModels == null) {
      this.deployedModels = new ArrayList<>();
    }
    this.deployedModels.add(deployedModelsItem);
    return this;
  }

  /**
   * Output only. The models deployed in this Endpoint. To add or remove DeployedModels use EndpointService.DeployModel and EndpointService.UndeployModel respectively.
   * @return deployedModels
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1DeployedModel> getDeployedModels() {
    return deployedModels;
  }

  public void setDeployedModels(List<GoogleCloudAiplatformV1DeployedModel> deployedModels) {
    this.deployedModels = deployedModels;
  }


  public GoogleCloudAiplatformV1Endpoint predictRequestResponseLoggingConfig(GoogleCloudAiplatformV1PredictRequestResponseLoggingConfig predictRequestResponseLoggingConfig) {
    this.predictRequestResponseLoggingConfig = predictRequestResponseLoggingConfig;
    return this;
  }

  /**
   * Configures the request-response logging for online prediction.
   * @return predictRequestResponseLoggingConfig
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1PredictRequestResponseLoggingConfig getPredictRequestResponseLoggingConfig() {
    return predictRequestResponseLoggingConfig;
  }

  public void setPredictRequestResponseLoggingConfig(GoogleCloudAiplatformV1PredictRequestResponseLoggingConfig predictRequestResponseLoggingConfig) {
    this.predictRequestResponseLoggingConfig = predictRequestResponseLoggingConfig;
  }


  public GoogleCloudAiplatformV1Endpoint labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public GoogleCloudAiplatformV1Endpoint putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * The labels with user-defined metadata to organize your Endpoints. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels.
   * @return labels
   */
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1Endpoint googleCloudAiplatformV1Endpoint = (GoogleCloudAiplatformV1Endpoint) o;
    return Objects.equals(this.etag, googleCloudAiplatformV1Endpoint.etag) &&
        Objects.equals(this.enablePrivateServiceConnect, googleCloudAiplatformV1Endpoint.enablePrivateServiceConnect) &&
        Objects.equals(this.encryptionSpec, googleCloudAiplatformV1Endpoint.encryptionSpec) &&
        Objects.equals(this.satisfiesPzi, googleCloudAiplatformV1Endpoint.satisfiesPzi) &&
        Objects.equals(this.satisfiesPzs, googleCloudAiplatformV1Endpoint.satisfiesPzs) &&
        Objects.equals(this.network, googleCloudAiplatformV1Endpoint.network) &&
        Objects.equals(this.privateServiceConnectConfig, googleCloudAiplatformV1Endpoint.privateServiceConnectConfig) &&
        Objects.equals(this.displayName, googleCloudAiplatformV1Endpoint.displayName) &&
        Objects.equals(this.dedicatedEndpointDns, googleCloudAiplatformV1Endpoint.dedicatedEndpointDns) &&
        Objects.equals(this.updateTime, googleCloudAiplatformV1Endpoint.updateTime) &&
        Objects.equals(this.description, googleCloudAiplatformV1Endpoint.description) &&
        Objects.equals(this.dedicatedEndpointEnabled, googleCloudAiplatformV1Endpoint.dedicatedEndpointEnabled) &&
        Objects.equals(this.createTime, googleCloudAiplatformV1Endpoint.createTime) &&
        Objects.equals(this.modelDeploymentMonitoringJob, googleCloudAiplatformV1Endpoint.modelDeploymentMonitoringJob) &&
        Objects.equals(this.name, googleCloudAiplatformV1Endpoint.name) &&
        Objects.equals(this.trafficSplit, googleCloudAiplatformV1Endpoint.trafficSplit) &&
        Objects.equals(this.deployedModels, googleCloudAiplatformV1Endpoint.deployedModels) &&
        Objects.equals(this.predictRequestResponseLoggingConfig, googleCloudAiplatformV1Endpoint.predictRequestResponseLoggingConfig) &&
        Objects.equals(this.labels, googleCloudAiplatformV1Endpoint.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, enablePrivateServiceConnect, encryptionSpec, satisfiesPzi, satisfiesPzs, network, privateServiceConnectConfig, displayName, dedicatedEndpointDns, updateTime, description, dedicatedEndpointEnabled, createTime, modelDeploymentMonitoringJob, name, trafficSplit, deployedModels, predictRequestResponseLoggingConfig, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1Endpoint {\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    enablePrivateServiceConnect: ").append(toIndentedString(enablePrivateServiceConnect)).append("\n");
    sb.append("    encryptionSpec: ").append(toIndentedString(encryptionSpec)).append("\n");
    sb.append("    satisfiesPzi: ").append(toIndentedString(satisfiesPzi)).append("\n");
    sb.append("    satisfiesPzs: ").append(toIndentedString(satisfiesPzs)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    privateServiceConnectConfig: ").append(toIndentedString(privateServiceConnectConfig)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    dedicatedEndpointDns: ").append(toIndentedString(dedicatedEndpointDns)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dedicatedEndpointEnabled: ").append(toIndentedString(dedicatedEndpointEnabled)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    modelDeploymentMonitoringJob: ").append(toIndentedString(modelDeploymentMonitoringJob)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    trafficSplit: ").append(toIndentedString(trafficSplit)).append("\n");
    sb.append("    deployedModels: ").append(toIndentedString(deployedModels)).append("\n");
    sb.append("    predictRequestResponseLoggingConfig: ").append(toIndentedString(predictRequestResponseLoggingConfig)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
    openapiFields.add("etag");
    openapiFields.add("enablePrivateServiceConnect");
    openapiFields.add("encryptionSpec");
    openapiFields.add("satisfiesPzi");
    openapiFields.add("satisfiesPzs");
    openapiFields.add("network");
    openapiFields.add("privateServiceConnectConfig");
    openapiFields.add("displayName");
    openapiFields.add("dedicatedEndpointDns");
    openapiFields.add("updateTime");
    openapiFields.add("description");
    openapiFields.add("dedicatedEndpointEnabled");
    openapiFields.add("createTime");
    openapiFields.add("modelDeploymentMonitoringJob");
    openapiFields.add("name");
    openapiFields.add("trafficSplit");
    openapiFields.add("deployedModels");
    openapiFields.add("predictRequestResponseLoggingConfig");
    openapiFields.add("labels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1Endpoint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1Endpoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1Endpoint is not found in the empty JSON string", GoogleCloudAiplatformV1Endpoint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1Endpoint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1Endpoint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("etag") != null && !jsonObj.get("etag").isJsonNull()) && !jsonObj.get("etag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `etag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("etag").toString()));
      }
      // validate the optional field `encryptionSpec`
      if (jsonObj.get("encryptionSpec") != null && !jsonObj.get("encryptionSpec").isJsonNull()) {
        GoogleCloudAiplatformV1EncryptionSpec.validateJsonElement(jsonObj.get("encryptionSpec"));
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      // validate the optional field `privateServiceConnectConfig`
      if (jsonObj.get("privateServiceConnectConfig") != null && !jsonObj.get("privateServiceConnectConfig").isJsonNull()) {
        GoogleCloudAiplatformV1PrivateServiceConnectConfig.validateJsonElement(jsonObj.get("privateServiceConnectConfig"));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("dedicatedEndpointDns") != null && !jsonObj.get("dedicatedEndpointDns").isJsonNull()) && !jsonObj.get("dedicatedEndpointDns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dedicatedEndpointDns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dedicatedEndpointDns").toString()));
      }
      if ((jsonObj.get("updateTime") != null && !jsonObj.get("updateTime").isJsonNull()) && !jsonObj.get("updateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateTime").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      if ((jsonObj.get("modelDeploymentMonitoringJob") != null && !jsonObj.get("modelDeploymentMonitoringJob").isJsonNull()) && !jsonObj.get("modelDeploymentMonitoringJob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modelDeploymentMonitoringJob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modelDeploymentMonitoringJob").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("deployedModels") != null && !jsonObj.get("deployedModels").isJsonNull()) {
        JsonArray jsonArraydeployedModels = jsonObj.getAsJsonArray("deployedModels");
        if (jsonArraydeployedModels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("deployedModels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `deployedModels` to be an array in the JSON string but got `%s`", jsonObj.get("deployedModels").toString()));
          }

          // validate the optional field `deployedModels` (array)
          for (int i = 0; i < jsonArraydeployedModels.size(); i++) {
            GoogleCloudAiplatformV1DeployedModel.validateJsonElement(jsonArraydeployedModels.get(i));
          };
        }
      }
      // validate the optional field `predictRequestResponseLoggingConfig`
      if (jsonObj.get("predictRequestResponseLoggingConfig") != null && !jsonObj.get("predictRequestResponseLoggingConfig").isJsonNull()) {
        GoogleCloudAiplatformV1PredictRequestResponseLoggingConfig.validateJsonElement(jsonObj.get("predictRequestResponseLoggingConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1Endpoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1Endpoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1Endpoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1Endpoint.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1Endpoint>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1Endpoint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1Endpoint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1Endpoint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1Endpoint
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1Endpoint
   */
  public static GoogleCloudAiplatformV1Endpoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1Endpoint.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1Endpoint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

