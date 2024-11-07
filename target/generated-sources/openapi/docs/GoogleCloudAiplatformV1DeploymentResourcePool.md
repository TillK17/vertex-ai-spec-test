

# GoogleCloudAiplatformV1DeploymentResourcePool

A description of resources that can be shared by multiple DeployedModels, whose underlying specification consists of a DedicatedResources.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**satisfiesPzi** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**satisfiesPzs** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**name** | **String** | Immutable. The resource name of the DeploymentResourcePool. Format: &#x60;projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}&#x60; |  [optional] |
|**serviceAccount** | **String** | The service account that the DeploymentResourcePool&#39;s container(s) run as. Specify the email address of the service account. If this service account is not specified, the container(s) run as a service account that doesn&#39;t have access to the resource project. Users deploying the Models to this DeploymentResourcePool must have the &#x60;iam.serviceAccounts.actAs&#x60; permission on this service account. |  [optional] |
|**disableContainerLogging** | **Boolean** | If the DeploymentResourcePool is deployed with custom-trained Models or AutoML Tabular Models, the container(s) of the DeploymentResourcePool will send &#x60;stderr&#x60; and &#x60;stdout&#x60; streams to Cloud Logging by default. Please note that the logs incur cost, which are subject to [Cloud Logging pricing](https://cloud.google.com/logging/pricing). User can disable container logging by setting this flag to true. |  [optional] |
|**encryptionSpec** | [**GoogleCloudAiplatformV1EncryptionSpec**](GoogleCloudAiplatformV1EncryptionSpec.md) | Customer-managed encryption key spec for a DeploymentResourcePool. If set, this DeploymentResourcePool will be secured by this key. Endpoints and the DeploymentResourcePool they deploy in need to have the same EncryptionSpec. |  [optional] |
|**dedicatedResources** | [**GoogleCloudAiplatformV1DedicatedResources**](GoogleCloudAiplatformV1DedicatedResources.md) | Required. The underlying DedicatedResources that the DeploymentResourcePool uses. |  [optional] |
|**createTime** | **String** | Output only. Timestamp when this DeploymentResourcePool was created. |  [optional] [readonly] |



