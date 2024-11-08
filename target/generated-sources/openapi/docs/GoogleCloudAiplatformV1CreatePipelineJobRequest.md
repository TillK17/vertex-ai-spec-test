

# GoogleCloudAiplatformV1CreatePipelineJobRequest

Request message for PipelineService.CreatePipelineJob.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pipelineJobId** | **String** | The ID to use for the PipelineJob, which will become the final component of the PipelineJob name. If not provided, an ID will be automatically generated. This value should be less than 128 characters, and valid characters are &#x60;/a-z-/&#x60;. |  [optional] |
|**parent** | **String** | Required. The resource name of the Location to create the PipelineJob in. Format: &#x60;projects/{project}/locations/{location}&#x60; |  [optional] |
|**pipelineJob** | [**GoogleCloudAiplatformV1PipelineJob**](GoogleCloudAiplatformV1PipelineJob.md) | Required. The PipelineJob to create. |  [optional] |



