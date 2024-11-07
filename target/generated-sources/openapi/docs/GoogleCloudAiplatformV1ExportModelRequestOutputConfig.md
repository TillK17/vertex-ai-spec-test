

# GoogleCloudAiplatformV1ExportModelRequestOutputConfig

Output configuration for the Model export.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exportFormatId** | **String** | The ID of the format in which the Model must be exported. Each Model lists the export formats it supports. If no value is provided here, then the first from the list of the Model&#39;s supported formats is used by default. |  [optional] |
|**imageDestination** | [**GoogleCloudAiplatformV1ContainerRegistryDestination**](GoogleCloudAiplatformV1ContainerRegistryDestination.md) | The Google Container Registry or Artifact Registry uri where the Model container image will be copied to. This field should only be set when the &#x60;exportableContent&#x60; field of the [Model.supported_export_formats] object contains &#x60;IMAGE&#x60;. |  [optional] |
|**artifactDestination** | [**GoogleCloudAiplatformV1GcsDestination**](GoogleCloudAiplatformV1GcsDestination.md) | The Cloud Storage location where the Model artifact is to be written to. Under the directory given as the destination a new one with name \&quot;&#x60;model-export--&#x60;\&quot;, where timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format, will be created. Inside, the Model and any of its supporting files will be written. This field should only be set when the &#x60;exportableContent&#x60; field of the [Model.supported_export_formats] object contains &#x60;ARTIFACT&#x60;. |  [optional] |



