

# GoogleCloudAiplatformV1MigratableResource

Represents one resource that exists in automl.googleapis.com, datalabeling.googleapis.com or ml.googleapis.com.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataLabelingDataset** | [**GoogleCloudAiplatformV1MigratableResourceDataLabelingDataset**](GoogleCloudAiplatformV1MigratableResourceDataLabelingDataset.md) | Output only. Represents one Dataset in datalabeling.googleapis.com. |  [optional] [readonly] |
|**mlEngineModelVersion** | [**GoogleCloudAiplatformV1MigratableResourceMlEngineModelVersion**](GoogleCloudAiplatformV1MigratableResourceMlEngineModelVersion.md) | Output only. Represents one Version in ml.googleapis.com. |  [optional] [readonly] |
|**automlModel** | [**GoogleCloudAiplatformV1MigratableResourceAutomlModel**](GoogleCloudAiplatformV1MigratableResourceAutomlModel.md) | Output only. Represents one Model in automl.googleapis.com. |  [optional] [readonly] |
|**lastMigrateTime** | **String** | Output only. Timestamp when the last migration attempt on this MigratableResource started. Will not be set if there&#39;s no migration attempt on this MigratableResource. |  [optional] [readonly] |
|**lastUpdateTime** | **String** | Output only. Timestamp when this MigratableResource was last updated. |  [optional] [readonly] |
|**automlDataset** | [**GoogleCloudAiplatformV1MigratableResourceAutomlDataset**](GoogleCloudAiplatformV1MigratableResourceAutomlDataset.md) | Output only. Represents one Dataset in automl.googleapis.com. |  [optional] [readonly] |



