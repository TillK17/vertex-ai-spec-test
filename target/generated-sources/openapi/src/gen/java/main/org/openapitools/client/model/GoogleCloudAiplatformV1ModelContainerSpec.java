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
import org.openapitools.client.model.GoogleCloudAiplatformV1EnvVar;
import org.openapitools.client.model.GoogleCloudAiplatformV1Port;
import org.openapitools.client.model.GoogleCloudAiplatformV1Probe;

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
 * Specification of a container for serving predictions. Some fields in this message correspond to fields in the [Kubernetes Container v1 core specification](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#container-v1-core).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ModelContainerSpec {
  public static final String SERIALIZED_NAME_IMAGE_URI = "imageUri";
  @SerializedName(SERIALIZED_NAME_IMAGE_URI)
  private String imageUri;

  public static final String SERIALIZED_NAME_HEALTH_ROUTE = "healthRoute";
  @SerializedName(SERIALIZED_NAME_HEALTH_ROUTE)
  private String healthRoute;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<GoogleCloudAiplatformV1EnvVar> env = new ArrayList<>();

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<GoogleCloudAiplatformV1Port> ports = new ArrayList<>();

  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private List<String> command = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEPLOYMENT_TIMEOUT = "deploymentTimeout";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_TIMEOUT)
  private String deploymentTimeout;

  public static final String SERIALIZED_NAME_STARTUP_PROBE = "startupProbe";
  @SerializedName(SERIALIZED_NAME_STARTUP_PROBE)
  private GoogleCloudAiplatformV1Probe startupProbe;

  public static final String SERIALIZED_NAME_HEALTH_PROBE = "healthProbe";
  @SerializedName(SERIALIZED_NAME_HEALTH_PROBE)
  private GoogleCloudAiplatformV1Probe healthProbe;

  public static final String SERIALIZED_NAME_GRPC_PORTS = "grpcPorts";
  @SerializedName(SERIALIZED_NAME_GRPC_PORTS)
  private List<GoogleCloudAiplatformV1Port> grpcPorts = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHARED_MEMORY_SIZE_MB = "sharedMemorySizeMb";
  @SerializedName(SERIALIZED_NAME_SHARED_MEMORY_SIZE_MB)
  private String sharedMemorySizeMb;

  public static final String SERIALIZED_NAME_PREDICT_ROUTE = "predictRoute";
  @SerializedName(SERIALIZED_NAME_PREDICT_ROUTE)
  private String predictRoute;

  public GoogleCloudAiplatformV1ModelContainerSpec() {
  }

  public GoogleCloudAiplatformV1ModelContainerSpec imageUri(String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

  /**
   * Required. Immutable. URI of the Docker image to be used as the custom container for serving predictions. This URI must identify an image in Artifact Registry or Container Registry. Learn more about the [container publishing requirements](https://cloud.google.com/vertex-ai/docs/predictions/custom-container-requirements#publishing), including permissions requirements for the Vertex AI Service Agent. The container image is ingested upon ModelService.UploadModel, stored internally, and this original path is afterwards not used. To learn about the requirements for the Docker image itself, see [Custom container requirements](https://cloud.google.com/vertex-ai/docs/predictions/custom-container-requirements#). You can use the URI to one of Vertex AI&#39;s [pre-built container images for prediction](https://cloud.google.com/vertex-ai/docs/predictions/pre-built-containers) in this field.
   * @return imageUri
   */
  @javax.annotation.Nullable
  public String getImageUri() {
    return imageUri;
  }

  public void setImageUri(String imageUri) {
    this.imageUri = imageUri;
  }


  public GoogleCloudAiplatformV1ModelContainerSpec healthRoute(String healthRoute) {
    this.healthRoute = healthRoute;
    return this;
  }

  /**
   * Immutable. HTTP path on the container to send health checks to. Vertex AI intermittently sends GET requests to this path on the container&#39;s IP address and port to check that the container is healthy. Read more about [health checks](https://cloud.google.com/vertex-ai/docs/predictions/custom-container-requirements#health). For example, if you set this field to &#x60;/bar&#x60;, then Vertex AI intermittently sends a GET request to the &#x60;/bar&#x60; path on the port of your container specified by the first value of this &#x60;ModelContainerSpec&#x60;&#39;s ports field. If you don&#39;t specify this field, it defaults to the following value when you deploy this Model to an Endpoint: /v1/endpoints/ENDPOINT/deployedModels/ DEPLOYED_MODEL:predict The placeholders in this value are replaced as follows: * ENDPOINT: The last segment (following &#x60;endpoints/&#x60;)of the Endpoint.name][] field of the Endpoint where this Model has been deployed. (Vertex AI makes this value available to your container code as the [&#x60;AIP_ENDPOINT_ID&#x60; environment variable](https://cloud.google.com/vertex-ai/docs/predictions/custom-container-requirements#aip-variables).) * DEPLOYED_MODEL: DeployedModel.id of the &#x60;DeployedModel&#x60;. (Vertex AI makes this value available to your container code as the [&#x60;AIP_DEPLOYED_MODEL_ID&#x60; environment variable](https://cloud.google.com/vertex-ai/docs/predictions/custom-container-requirements#aip-variables).)
   * @return healthRoute
   */
  @javax.annotation.Nullable
  public String getHealthRoute() {
    return healthRoute;
  }

  public void setHealthRoute(String healthRoute) {
    this.healthRoute = healthRoute;
  }


  public GoogleCloudAiplatformV1ModelContainerSpec env(List<GoogleCloudAiplatformV1EnvVar> env) {
    this.env = env;
    return this;
  }

  public GoogleCloudAiplatformV1ModelContainerSpec addEnvItem(GoogleCloudAiplatformV1EnvVar envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * Immutable. List of environment variables to set in the container. After the container starts running, code running in the container can read these environment variables. Additionally, the command and args fields can reference these variables. Later entries in this list can also reference earlier entries. For example, the following example sets the variable &#x60;VAR_2&#x60; to have the value &#x60;foo bar&#x60;: &#x60;&#x60;&#x60;json [ { \&quot;name\&quot;: \&quot;VAR_1\&quot;, \&quot;value\&quot;: \&quot;foo\&quot; }, { \&quot;name\&quot;: \&quot;VAR_2\&quot;, \&quot;value\&quot;: \&quot;$(VAR_1) bar\&quot; } ] &#x60;&#x60;&#x60; If you switch the order of the variables in the example, then the expansion does not occur. This field corresponds to the &#x60;env&#x60; field of the Kubernetes Containers [v1 core API](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#container-v1-core).
   * @return env
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1EnvVar> getEnv() {
    return env;
  }

  public void setEnv(List<GoogleCloudAiplatformV1EnvVar> env) {
    this.env = env;
  }


  public GoogleCloudAiplatformV1ModelContainerSpec ports(List<GoogleCloudAiplatformV1Port> ports) {
    this.ports = ports;
    return this;
  }

  public GoogleCloudAiplatformV1ModelContainerSpec addPortsItem(GoogleCloudAiplatformV1Port portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * Immutable. List of ports to expose from the container. Vertex AI sends any prediction requests that it receives to the first port on this list. Vertex AI also sends [liveness and health checks](https://cloud.google.com/vertex-ai/docs/predictions/custom-container-requirements#liveness) to this port. If you do not specify this field, it defaults to following value: &#x60;&#x60;&#x60;json [ { \&quot;containerPort\&quot;: 8080 } ] &#x60;&#x60;&#x60; Vertex AI does not use ports other than the first one listed. This field corresponds to the &#x60;ports&#x60; field of the Kubernetes Containers [v1 core API](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#container-v1-core).
   * @return ports
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1Port> getPorts() {
    return ports;
  }

  public void setPorts(List<GoogleCloudAiplatformV1Port> ports) {
    this.ports = ports;
  }


  public GoogleCloudAiplatformV1ModelContainerSpec args(List<String> args) {
    this.args = args;
    return this;
  }

  public GoogleCloudAiplatformV1ModelContainerSpec addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * Immutable. Specifies arguments for the command that runs when the container starts. This overrides the container&#39;s [&#x60;CMD&#x60;](https://docs.docker.com/engine/reference/builder/#cmd). Specify this field as an array of executable and arguments, similar to a Docker &#x60;CMD&#x60;&#39;s \&quot;default parameters\&quot; form. If you don&#39;t specify this field but do specify the command field, then the command from the &#x60;command&#x60; field runs without any additional arguments. See the [Kubernetes documentation about how the &#x60;command&#x60; and &#x60;args&#x60; fields interact with a container&#39;s &#x60;ENTRYPOINT&#x60; and &#x60;CMD&#x60;](https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#notes). If you don&#39;t specify this field and don&#39;t specify the &#x60;command&#x60; field, then the container&#39;s [&#x60;ENTRYPOINT&#x60;](https://docs.docker.com/engine/reference/builder/#cmd) and &#x60;CMD&#x60; determine what runs based on their default behavior. See the Docker documentation about [how &#x60;CMD&#x60; and &#x60;ENTRYPOINT&#x60; interact](https://docs.docker.com/engine/reference/builder/#understand-how-cmd-and-entrypoint-interact). In this field, you can reference [environment variables set by Vertex AI](https://cloud.google.com/vertex-ai/docs/predictions/custom-container-requirements#aip-variables) and environment variables set in the env field. You cannot reference environment variables set in the Docker image. In order for environment variables to be expanded, reference them by using the following syntax: $( VARIABLE_NAME) Note that this differs from Bash variable expansion, which does not use parentheses. If a variable cannot be resolved, the reference in the input string is used unchanged. To avoid variable expansion, you can escape this syntax with &#x60;$$&#x60;; for example: $$(VARIABLE_NAME) This field corresponds to the &#x60;args&#x60; field of the Kubernetes Containers [v1 core API](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#container-v1-core).
   * @return args
   */
  @javax.annotation.Nullable
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }


  public GoogleCloudAiplatformV1ModelContainerSpec command(List<String> command) {
    this.command = command;
    return this;
  }

  public GoogleCloudAiplatformV1ModelContainerSpec addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

  /**
   * Immutable. Specifies the command that runs when the container starts. This overrides the container&#39;s [ENTRYPOINT](https://docs.docker.com/engine/reference/builder/#entrypoint). Specify this field as an array of executable and arguments, similar to a Docker &#x60;ENTRYPOINT&#x60;&#39;s \&quot;exec\&quot; form, not its \&quot;shell\&quot; form. If you do not specify this field, then the container&#39;s &#x60;ENTRYPOINT&#x60; runs, in conjunction with the args field or the container&#39;s [&#x60;CMD&#x60;](https://docs.docker.com/engine/reference/builder/#cmd), if either exists. If this field is not specified and the container does not have an &#x60;ENTRYPOINT&#x60;, then refer to the Docker documentation about [how &#x60;CMD&#x60; and &#x60;ENTRYPOINT&#x60; interact](https://docs.docker.com/engine/reference/builder/#understand-how-cmd-and-entrypoint-interact). If you specify this field, then you can also specify the &#x60;args&#x60; field to provide additional arguments for this command. However, if you specify this field, then the container&#39;s &#x60;CMD&#x60; is ignored. See the [Kubernetes documentation about how the &#x60;command&#x60; and &#x60;args&#x60; fields interact with a container&#39;s &#x60;ENTRYPOINT&#x60; and &#x60;CMD&#x60;](https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#notes). In this field, you can reference [environment variables set by Vertex AI](https://cloud.google.com/vertex-ai/docs/predictions/custom-container-requirements#aip-variables) and environment variables set in the env field. You cannot reference environment variables set in the Docker image. In order for environment variables to be expanded, reference them by using the following syntax: $( VARIABLE_NAME) Note that this differs from Bash variable expansion, which does not use parentheses. If a variable cannot be resolved, the reference in the input string is used unchanged. To avoid variable expansion, you can escape this syntax with &#x60;$$&#x60;; for example: $$(VARIABLE_NAME) This field corresponds to the &#x60;command&#x60; field of the Kubernetes Containers [v1 core API](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#container-v1-core).
   * @return command
   */
  @javax.annotation.Nullable
  public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }


  public GoogleCloudAiplatformV1ModelContainerSpec deploymentTimeout(String deploymentTimeout) {
    this.deploymentTimeout = deploymentTimeout;
    return this;
  }

  /**
   * Immutable. Deployment timeout. Limit for deployment timeout is 2 hours.
   * @return deploymentTimeout
   */
  @javax.annotation.Nullable
  public String getDeploymentTimeout() {
    return deploymentTimeout;
  }

  public void setDeploymentTimeout(String deploymentTimeout) {
    this.deploymentTimeout = deploymentTimeout;
  }


  public GoogleCloudAiplatformV1ModelContainerSpec startupProbe(GoogleCloudAiplatformV1Probe startupProbe) {
    this.startupProbe = startupProbe;
    return this;
  }

  /**
   * Immutable. Specification for Kubernetes startup probe.
   * @return startupProbe
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1Probe getStartupProbe() {
    return startupProbe;
  }

  public void setStartupProbe(GoogleCloudAiplatformV1Probe startupProbe) {
    this.startupProbe = startupProbe;
  }


  public GoogleCloudAiplatformV1ModelContainerSpec healthProbe(GoogleCloudAiplatformV1Probe healthProbe) {
    this.healthProbe = healthProbe;
    return this;
  }

  /**
   * Immutable. Specification for Kubernetes readiness probe.
   * @return healthProbe
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1Probe getHealthProbe() {
    return healthProbe;
  }

  public void setHealthProbe(GoogleCloudAiplatformV1Probe healthProbe) {
    this.healthProbe = healthProbe;
  }


  public GoogleCloudAiplatformV1ModelContainerSpec grpcPorts(List<GoogleCloudAiplatformV1Port> grpcPorts) {
    this.grpcPorts = grpcPorts;
    return this;
  }

  public GoogleCloudAiplatformV1ModelContainerSpec addGrpcPortsItem(GoogleCloudAiplatformV1Port grpcPortsItem) {
    if (this.grpcPorts == null) {
      this.grpcPorts = new ArrayList<>();
    }
    this.grpcPorts.add(grpcPortsItem);
    return this;
  }

  /**
   * Immutable. List of ports to expose from the container. Vertex AI sends gRPC prediction requests that it receives to the first port on this list. Vertex AI also sends liveness and health checks to this port. If you do not specify this field, gRPC requests to the container will be disabled. Vertex AI does not use ports other than the first one listed. This field corresponds to the &#x60;ports&#x60; field of the Kubernetes Containers v1 core API.
   * @return grpcPorts
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1Port> getGrpcPorts() {
    return grpcPorts;
  }

  public void setGrpcPorts(List<GoogleCloudAiplatformV1Port> grpcPorts) {
    this.grpcPorts = grpcPorts;
  }


  public GoogleCloudAiplatformV1ModelContainerSpec sharedMemorySizeMb(String sharedMemorySizeMb) {
    this.sharedMemorySizeMb = sharedMemorySizeMb;
    return this;
  }

  /**
   * Immutable. The amount of the VM memory to reserve as the shared memory for the model in megabytes.
   * @return sharedMemorySizeMb
   */
  @javax.annotation.Nullable
  public String getSharedMemorySizeMb() {
    return sharedMemorySizeMb;
  }

  public void setSharedMemorySizeMb(String sharedMemorySizeMb) {
    this.sharedMemorySizeMb = sharedMemorySizeMb;
  }


  public GoogleCloudAiplatformV1ModelContainerSpec predictRoute(String predictRoute) {
    this.predictRoute = predictRoute;
    return this;
  }

  /**
   * Immutable. HTTP path on the container to send prediction requests to. Vertex AI forwards requests sent using projects.locations.endpoints.predict to this path on the container&#39;s IP address and port. Vertex AI then returns the container&#39;s response in the API response. For example, if you set this field to &#x60;/foo&#x60;, then when Vertex AI receives a prediction request, it forwards the request body in a POST request to the &#x60;/foo&#x60; path on the port of your container specified by the first value of this &#x60;ModelContainerSpec&#x60;&#39;s ports field. If you don&#39;t specify this field, it defaults to the following value when you deploy this Model to an Endpoint: /v1/endpoints/ENDPOINT/deployedModels/DEPLOYED_MODEL:predict The placeholders in this value are replaced as follows: * ENDPOINT: The last segment (following &#x60;endpoints/&#x60;)of the Endpoint.name][] field of the Endpoint where this Model has been deployed. (Vertex AI makes this value available to your container code as the [&#x60;AIP_ENDPOINT_ID&#x60; environment variable](https://cloud.google.com/vertex-ai/docs/predictions/custom-container-requirements#aip-variables).) * DEPLOYED_MODEL: DeployedModel.id of the &#x60;DeployedModel&#x60;. (Vertex AI makes this value available to your container code as the [&#x60;AIP_DEPLOYED_MODEL_ID&#x60; environment variable](https://cloud.google.com/vertex-ai/docs/predictions/custom-container-requirements#aip-variables).)
   * @return predictRoute
   */
  @javax.annotation.Nullable
  public String getPredictRoute() {
    return predictRoute;
  }

  public void setPredictRoute(String predictRoute) {
    this.predictRoute = predictRoute;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ModelContainerSpec googleCloudAiplatformV1ModelContainerSpec = (GoogleCloudAiplatformV1ModelContainerSpec) o;
    return Objects.equals(this.imageUri, googleCloudAiplatformV1ModelContainerSpec.imageUri) &&
        Objects.equals(this.healthRoute, googleCloudAiplatformV1ModelContainerSpec.healthRoute) &&
        Objects.equals(this.env, googleCloudAiplatformV1ModelContainerSpec.env) &&
        Objects.equals(this.ports, googleCloudAiplatformV1ModelContainerSpec.ports) &&
        Objects.equals(this.args, googleCloudAiplatformV1ModelContainerSpec.args) &&
        Objects.equals(this.command, googleCloudAiplatformV1ModelContainerSpec.command) &&
        Objects.equals(this.deploymentTimeout, googleCloudAiplatformV1ModelContainerSpec.deploymentTimeout) &&
        Objects.equals(this.startupProbe, googleCloudAiplatformV1ModelContainerSpec.startupProbe) &&
        Objects.equals(this.healthProbe, googleCloudAiplatformV1ModelContainerSpec.healthProbe) &&
        Objects.equals(this.grpcPorts, googleCloudAiplatformV1ModelContainerSpec.grpcPorts) &&
        Objects.equals(this.sharedMemorySizeMb, googleCloudAiplatformV1ModelContainerSpec.sharedMemorySizeMb) &&
        Objects.equals(this.predictRoute, googleCloudAiplatformV1ModelContainerSpec.predictRoute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUri, healthRoute, env, ports, args, command, deploymentTimeout, startupProbe, healthProbe, grpcPorts, sharedMemorySizeMb, predictRoute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ModelContainerSpec {\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
    sb.append("    healthRoute: ").append(toIndentedString(healthRoute)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    deploymentTimeout: ").append(toIndentedString(deploymentTimeout)).append("\n");
    sb.append("    startupProbe: ").append(toIndentedString(startupProbe)).append("\n");
    sb.append("    healthProbe: ").append(toIndentedString(healthProbe)).append("\n");
    sb.append("    grpcPorts: ").append(toIndentedString(grpcPorts)).append("\n");
    sb.append("    sharedMemorySizeMb: ").append(toIndentedString(sharedMemorySizeMb)).append("\n");
    sb.append("    predictRoute: ").append(toIndentedString(predictRoute)).append("\n");
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
    openapiFields.add("imageUri");
    openapiFields.add("healthRoute");
    openapiFields.add("env");
    openapiFields.add("ports");
    openapiFields.add("args");
    openapiFields.add("command");
    openapiFields.add("deploymentTimeout");
    openapiFields.add("startupProbe");
    openapiFields.add("healthProbe");
    openapiFields.add("grpcPorts");
    openapiFields.add("sharedMemorySizeMb");
    openapiFields.add("predictRoute");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ModelContainerSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ModelContainerSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ModelContainerSpec is not found in the empty JSON string", GoogleCloudAiplatformV1ModelContainerSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ModelContainerSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ModelContainerSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("imageUri") != null && !jsonObj.get("imageUri").isJsonNull()) && !jsonObj.get("imageUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUri").toString()));
      }
      if ((jsonObj.get("healthRoute") != null && !jsonObj.get("healthRoute").isJsonNull()) && !jsonObj.get("healthRoute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `healthRoute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("healthRoute").toString()));
      }
      if (jsonObj.get("env") != null && !jsonObj.get("env").isJsonNull()) {
        JsonArray jsonArrayenv = jsonObj.getAsJsonArray("env");
        if (jsonArrayenv != null) {
          // ensure the json data is an array
          if (!jsonObj.get("env").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `env` to be an array in the JSON string but got `%s`", jsonObj.get("env").toString()));
          }

          // validate the optional field `env` (array)
          for (int i = 0; i < jsonArrayenv.size(); i++) {
            GoogleCloudAiplatformV1EnvVar.validateJsonElement(jsonArrayenv.get(i));
          };
        }
      }
      if (jsonObj.get("ports") != null && !jsonObj.get("ports").isJsonNull()) {
        JsonArray jsonArrayports = jsonObj.getAsJsonArray("ports");
        if (jsonArrayports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ports` to be an array in the JSON string but got `%s`", jsonObj.get("ports").toString()));
          }

          // validate the optional field `ports` (array)
          for (int i = 0; i < jsonArrayports.size(); i++) {
            GoogleCloudAiplatformV1Port.validateJsonElement(jsonArrayports.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("args") != null && !jsonObj.get("args").isJsonNull() && !jsonObj.get("args").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `args` to be an array in the JSON string but got `%s`", jsonObj.get("args").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("command") != null && !jsonObj.get("command").isJsonNull() && !jsonObj.get("command").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `command` to be an array in the JSON string but got `%s`", jsonObj.get("command").toString()));
      }
      if ((jsonObj.get("deploymentTimeout") != null && !jsonObj.get("deploymentTimeout").isJsonNull()) && !jsonObj.get("deploymentTimeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deploymentTimeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deploymentTimeout").toString()));
      }
      // validate the optional field `startupProbe`
      if (jsonObj.get("startupProbe") != null && !jsonObj.get("startupProbe").isJsonNull()) {
        GoogleCloudAiplatformV1Probe.validateJsonElement(jsonObj.get("startupProbe"));
      }
      // validate the optional field `healthProbe`
      if (jsonObj.get("healthProbe") != null && !jsonObj.get("healthProbe").isJsonNull()) {
        GoogleCloudAiplatformV1Probe.validateJsonElement(jsonObj.get("healthProbe"));
      }
      if (jsonObj.get("grpcPorts") != null && !jsonObj.get("grpcPorts").isJsonNull()) {
        JsonArray jsonArraygrpcPorts = jsonObj.getAsJsonArray("grpcPorts");
        if (jsonArraygrpcPorts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("grpcPorts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `grpcPorts` to be an array in the JSON string but got `%s`", jsonObj.get("grpcPorts").toString()));
          }

          // validate the optional field `grpcPorts` (array)
          for (int i = 0; i < jsonArraygrpcPorts.size(); i++) {
            GoogleCloudAiplatformV1Port.validateJsonElement(jsonArraygrpcPorts.get(i));
          };
        }
      }
      if ((jsonObj.get("sharedMemorySizeMb") != null && !jsonObj.get("sharedMemorySizeMb").isJsonNull()) && !jsonObj.get("sharedMemorySizeMb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedMemorySizeMb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sharedMemorySizeMb").toString()));
      }
      if ((jsonObj.get("predictRoute") != null && !jsonObj.get("predictRoute").isJsonNull()) && !jsonObj.get("predictRoute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `predictRoute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("predictRoute").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ModelContainerSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ModelContainerSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ModelContainerSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ModelContainerSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ModelContainerSpec>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ModelContainerSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ModelContainerSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ModelContainerSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ModelContainerSpec
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ModelContainerSpec
   */
  public static GoogleCloudAiplatformV1ModelContainerSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ModelContainerSpec.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ModelContainerSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
