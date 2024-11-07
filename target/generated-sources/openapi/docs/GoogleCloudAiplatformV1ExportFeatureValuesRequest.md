

# GoogleCloudAiplatformV1ExportFeatureValuesRequest

Request message for FeaturestoreService.ExportFeatureValues.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**snapshotExport** | [**GoogleCloudAiplatformV1ExportFeatureValuesRequestSnapshotExport**](GoogleCloudAiplatformV1ExportFeatureValuesRequestSnapshotExport.md) | Exports the latest Feature values of all entities of the EntityType within a time range. |  [optional] |
|**fullExport** | [**GoogleCloudAiplatformV1ExportFeatureValuesRequestFullExport**](GoogleCloudAiplatformV1ExportFeatureValuesRequestFullExport.md) | Exports all historical values of all entities of the EntityType within a time range |  [optional] |
|**featureSelector** | [**GoogleCloudAiplatformV1FeatureSelector**](GoogleCloudAiplatformV1FeatureSelector.md) | Required. Selects Features to export values of. |  [optional] |
|**destination** | [**GoogleCloudAiplatformV1FeatureValueDestination**](GoogleCloudAiplatformV1FeatureValueDestination.md) | Required. Specifies destination location and format. |  [optional] |
|**settings** | [**List&lt;GoogleCloudAiplatformV1DestinationFeatureSetting&gt;**](GoogleCloudAiplatformV1DestinationFeatureSetting.md) | Per-Feature export settings. |  [optional] |



