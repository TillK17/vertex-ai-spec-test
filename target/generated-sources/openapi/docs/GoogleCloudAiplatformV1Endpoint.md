

# GoogleCloudAiplatformV1Endpoint

Models are deployed into it, and afterwards Endpoint is called to obtain predictions and explanations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**etag** | **String** | Used to perform consistent read-modify-write updates. If not set, a blind \&quot;overwrite\&quot; update happens. |  [optional] |
|**enablePrivateServiceConnect** | **Boolean** | Deprecated: If true, expose the Endpoint via private service connect. Only one of the fields, network or enable_private_service_connect, can be set. |  [optional] |
|**encryptionSpec** | [**GoogleCloudAiplatformV1EncryptionSpec**](GoogleCloudAiplatformV1EncryptionSpec.md) | Customer-managed encryption key spec for an Endpoint. If set, this Endpoint and all sub-resources of this Endpoint will be secured by this key. |  [optional] |
|**satisfiesPzi** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**satisfiesPzs** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**network** | **String** | Optional. The full name of the Google Compute Engine [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks) to which the Endpoint should be peered. Private services access must already be configured for the network. If left unspecified, the Endpoint is not peered with any network. Only one of the fields, network or enable_private_service_connect, can be set. [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert): &#x60;projects/{project}/global/networks/{network}&#x60;. Where &#x60;{project}&#x60; is a project number, as in &#x60;12345&#x60;, and &#x60;{network}&#x60; is network name. |  [optional] |
|**privateServiceConnectConfig** | [**GoogleCloudAiplatformV1PrivateServiceConnectConfig**](GoogleCloudAiplatformV1PrivateServiceConnectConfig.md) | Optional. Configuration for private service connect. network and private_service_connect_config are mutually exclusive. |  [optional] |
|**displayName** | **String** | Required. The display name of the Endpoint. The name can be up to 128 characters long and can consist of any UTF-8 characters. |  [optional] |
|**dedicatedEndpointDns** | **String** | Output only. DNS of the dedicated endpoint. Will only be populated if dedicated_endpoint_enabled is true. Format: &#x60;https://{endpoint_id}.{region}-{project_number}.prediction.vertexai.goog&#x60;. |  [optional] [readonly] |
|**updateTime** | **String** | Output only. Timestamp when this Endpoint was last updated. |  [optional] [readonly] |
|**description** | **String** | The description of the Endpoint. |  [optional] |
|**dedicatedEndpointEnabled** | **Boolean** | If true, the endpoint will be exposed through a dedicated DNS [Endpoint.dedicated_endpoint_dns]. Your request to the dedicated DNS will be isolated from other users&#39; traffic and will have better performance and reliability. Note: Once you enabled dedicated endpoint, you won&#39;t be able to send request to the shared DNS {region}-aiplatform.googleapis.com. The limitation will be removed soon. |  [optional] |
|**createTime** | **String** | Output only. Timestamp when this Endpoint was created. |  [optional] [readonly] |
|**modelDeploymentMonitoringJob** | **String** | Output only. Resource name of the Model Monitoring job associated with this Endpoint if monitoring is enabled by JobService.CreateModelDeploymentMonitoringJob. Format: &#x60;projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}&#x60; |  [optional] [readonly] |
|**name** | **String** | Output only. The resource name of the Endpoint. |  [optional] [readonly] |
|**trafficSplit** | **Map&lt;String, Integer&gt;** | A map from a DeployedModel&#39;s ID to the percentage of this Endpoint&#39;s traffic that should be forwarded to that DeployedModel. If a DeployedModel&#39;s ID is not listed in this map, then it receives no traffic. The traffic percentage values must add up to 100, or map must be empty if the Endpoint is to not accept any traffic at a moment. |  [optional] |
|**deployedModels** | [**List&lt;GoogleCloudAiplatformV1DeployedModel&gt;**](GoogleCloudAiplatformV1DeployedModel.md) | Output only. The models deployed in this Endpoint. To add or remove DeployedModels use EndpointService.DeployModel and EndpointService.UndeployModel respectively. |  [optional] |
|**predictRequestResponseLoggingConfig** | [**GoogleCloudAiplatformV1PredictRequestResponseLoggingConfig**](GoogleCloudAiplatformV1PredictRequestResponseLoggingConfig.md) | Configures the request-response logging for online prediction. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | The labels with user-defined metadata to organize your Endpoints. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels. |  [optional] |



