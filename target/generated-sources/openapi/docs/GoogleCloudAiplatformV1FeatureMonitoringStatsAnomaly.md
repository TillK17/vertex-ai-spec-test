

# GoogleCloudAiplatformV1FeatureMonitoringStatsAnomaly

A list of historical SnapshotAnalysis or ImportFeaturesAnalysis stats requested by user, sorted by FeatureStatsAnomaly.start_time descending.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**featureStatsAnomaly** | [**GoogleCloudAiplatformV1FeatureStatsAnomaly**](GoogleCloudAiplatformV1FeatureStatsAnomaly.md) | Output only. The stats and anomalies generated at specific timestamp. |  [optional] [readonly] |
|**objective** | [**ObjectiveEnum**](#ObjectiveEnum) | Output only. The objective for each stats. |  [optional] [readonly] |



## Enum: ObjectiveEnum

| Name | Value |
|---- | -----|
| OBJECTIVE_UNSPECIFIED | &quot;OBJECTIVE_UNSPECIFIED&quot; |
| IMPORT_FEATURE_ANALYSIS | &quot;IMPORT_FEATURE_ANALYSIS&quot; |
| SNAPSHOT_ANALYSIS | &quot;SNAPSHOT_ANALYSIS&quot; |



