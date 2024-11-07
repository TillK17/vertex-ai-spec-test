

# GoogleCloudAiplatformV1DeployedModel

A deployment of a Model. Endpoints contain one or more DeployedModels.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | The display name of the DeployedModel. If not provided upon creation, the Model&#39;s display_name is used. |  [optional] |
|**modelVersionId** | **String** | Output only. The version ID of the model that is deployed. |  [optional] [readonly] |
|**model** | **String** | Required. The resource name of the Model that this is the deployment of. Note that the Model may be in a different location than the DeployedModel&#39;s Endpoint. The resource name may contain version id or version alias to specify the version. Example: &#x60;projects/{project}/locations/{location}/models/{model}@2&#x60; or &#x60;projects/{project}/locations/{location}/models/{model}@golden&#x60; if no version is specified, the default version will be deployed. |  [optional] |
|**createTime** | **String** | Output only. Timestamp when the DeployedModel was created. |  [optional] [readonly] |
|**disableExplanations** | **Boolean** | If true, deploy the model without explainable feature, regardless the existence of Model.explanation_spec or explanation_spec. |  [optional] |
|**privateEndpoints** | [**GoogleCloudAiplatformV1PrivateEndpoints**](GoogleCloudAiplatformV1PrivateEndpoints.md) | Output only. Provide paths for users to send predict/explain/health requests directly to the deployed model services running on Cloud via private services access. This field is populated if network is configured. |  [optional] [readonly] |
|**disableContainerLogging** | **Boolean** | For custom-trained Models and AutoML Tabular Models, the container of the DeployedModel instances will send &#x60;stderr&#x60; and &#x60;stdout&#x60; streams to Cloud Logging by default. Please note that the logs incur cost, which are subject to [Cloud Logging pricing](https://cloud.google.com/logging/pricing). User can disable container logging by setting this flag to true. |  [optional] |
|**explanationSpec** | [**GoogleCloudAiplatformV1ExplanationSpec**](GoogleCloudAiplatformV1ExplanationSpec.md) | Explanation configuration for this DeployedModel. When deploying a Model using EndpointService.DeployModel, this value overrides the value of Model.explanation_spec. All fields of explanation_spec are optional in the request. If a field of explanation_spec is not populated, the value of the same field of Model.explanation_spec is inherited. If the corresponding Model.explanation_spec is not populated, all fields of the explanation_spec will be used for the explanation configuration. |  [optional] |
|**automaticResources** | [**GoogleCloudAiplatformV1AutomaticResources**](GoogleCloudAiplatformV1AutomaticResources.md) | A description of resources that to large degree are decided by Vertex AI, and require only a modest additional configuration. |  [optional] |
|**enableAccessLogging** | **Boolean** | If true, online prediction access logs are sent to Cloud Logging. These logs are like standard server access logs, containing information like timestamp and latency for each prediction request. Note that logs may incur a cost, especially if your project receives prediction requests at a high queries per second rate (QPS). Estimate your costs before enabling this option. |  [optional] |
|**sharedResources** | **String** | The resource name of the shared DeploymentResourcePool to deploy on. Format: &#x60;projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}&#x60; |  [optional] |
|**serviceAccount** | **String** | The service account that the DeployedModel&#39;s container runs as. Specify the email address of the service account. If this service account is not specified, the container runs as a service account that doesn&#39;t have access to the resource project. Users deploying the Model must have the &#x60;iam.serviceAccounts.actAs&#x60; permission on this service account. |  [optional] |
|**id** | **String** | Immutable. The ID of the DeployedModel. If not provided upon deployment, Vertex AI will generate a value for this ID. This value should be 1-10 characters, and valid characters are &#x60;/[0-9]/&#x60;. |  [optional] |
|**dedicatedResources** | [**GoogleCloudAiplatformV1DedicatedResources**](GoogleCloudAiplatformV1DedicatedResources.md) | A description of resources that are dedicated to the DeployedModel, and that need a higher degree of manual configuration. |  [optional] |



