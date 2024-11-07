

# GoogleCloudAiplatformV1PublisherModelCallToActionDeploy

Model metadata that is needed for UploadModel or DeployModel/CreateEndpoint requests.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**largeModelReference** | [**GoogleCloudAiplatformV1LargeModelReference**](GoogleCloudAiplatformV1LargeModelReference.md) | Optional. Large model reference. When this is set, model_artifact_spec is not needed. |  [optional] |
|**title** | **String** | Required. The title of the regional resource reference. |  [optional] |
|**artifactUri** | **String** | Optional. The path to the directory containing the Model artifact and any of its supporting files. |  [optional] |
|**modelDisplayName** | **String** | Optional. Default model display name. |  [optional] |
|**sharedResources** | **String** | The resource name of the shared DeploymentResourcePool to deploy on. Format: &#x60;projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}&#x60; |  [optional] |
|**automaticResources** | [**GoogleCloudAiplatformV1AutomaticResources**](GoogleCloudAiplatformV1AutomaticResources.md) | A description of resources that to large degree are decided by Vertex AI, and require only a modest additional configuration. |  [optional] |
|**dedicatedResources** | [**GoogleCloudAiplatformV1DedicatedResources**](GoogleCloudAiplatformV1DedicatedResources.md) | A description of resources that are dedicated to the DeployedModel, and that need a higher degree of manual configuration. |  [optional] |
|**containerSpec** | [**GoogleCloudAiplatformV1ModelContainerSpec**](GoogleCloudAiplatformV1ModelContainerSpec.md) | Optional. The specification of the container that is to be used when deploying this Model in Vertex AI. Not present for Large Models. |  [optional] |
|**deployTaskName** | **String** | Optional. The name of the deploy task (e.g., \&quot;text to image generation\&quot;). |  [optional] |
|**publicArtifactUri** | **String** | Optional. The signed URI for ephemeral Cloud Storage access to model artifact. |  [optional] |
|**deployMetadata** | [**GoogleCloudAiplatformV1PublisherModelCallToActionDeployDeployMetadata**](GoogleCloudAiplatformV1PublisherModelCallToActionDeployDeployMetadata.md) | Optional. Metadata information about this deployment config. |  [optional] |



