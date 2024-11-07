

# GoogleCloudAiplatformV1Examples

Example-based explainability that returns the nearest neighbors from the provided dataset.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nearestNeighborSearchConfig** | **Any** | The full configuration for the generated index, the semantics are the same as metadata and should match [NearestNeighborSearchConfig](https://cloud.google.com/vertex-ai/docs/explainable-ai/configuring-explanations-example-based#nearest-neighbor-search-config). |  [optional] |
|**neighborCount** | **Integer** | The number of neighbors to return when querying for examples. |  [optional] |
|**exampleGcsSource** | [**GoogleCloudAiplatformV1ExamplesExampleGcsSource**](GoogleCloudAiplatformV1ExamplesExampleGcsSource.md) | The Cloud Storage input instances. |  [optional] |
|**presets** | [**GoogleCloudAiplatformV1Presets**](GoogleCloudAiplatformV1Presets.md) | Simplified preset configuration, which automatically sets configuration values based on the desired query speed-precision trade-off and modality. |  [optional] |



