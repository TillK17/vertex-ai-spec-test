

# GoogleCloudAiplatformV1UnmanagedContainerModel

Contains model information necessary to perform batch prediction without requiring a full model import.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**artifactUri** | **String** | The path to the directory containing the Model artifact and any of its supporting files. |  [optional] |
|**containerSpec** | [**GoogleCloudAiplatformV1ModelContainerSpec**](GoogleCloudAiplatformV1ModelContainerSpec.md) | Input only. The specification of the container that is to be used when deploying this Model. |  [optional] |
|**predictSchemata** | [**GoogleCloudAiplatformV1PredictSchemata**](GoogleCloudAiplatformV1PredictSchemata.md) | Contains the schemata used in Model&#39;s predictions and explanations |  [optional] |



