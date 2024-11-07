

# GoogleCloudAiplatformV1FeaturestoreMonitoringConfig

Configuration of how features in Featurestore are monitored.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**numericalThresholdConfig** | [**GoogleCloudAiplatformV1FeaturestoreMonitoringConfigThresholdConfig**](GoogleCloudAiplatformV1FeaturestoreMonitoringConfigThresholdConfig.md) | Threshold for numerical features of anomaly detection. This is shared by all objectives of Featurestore Monitoring for numerical features (i.e. Features with type (Feature.ValueType) DOUBLE or INT64). |  [optional] |
|**categoricalThresholdConfig** | [**GoogleCloudAiplatformV1FeaturestoreMonitoringConfigThresholdConfig**](GoogleCloudAiplatformV1FeaturestoreMonitoringConfigThresholdConfig.md) | Threshold for categorical features of anomaly detection. This is shared by all types of Featurestore Monitoring for categorical features (i.e. Features with type (Feature.ValueType) BOOL or STRING). |  [optional] |
|**snapshotAnalysis** | [**GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis**](GoogleCloudAiplatformV1FeaturestoreMonitoringConfigSnapshotAnalysis.md) | The config for Snapshot Analysis Based Feature Monitoring. |  [optional] |
|**importFeaturesAnalysis** | [**GoogleCloudAiplatformV1FeaturestoreMonitoringConfigImportFeaturesAnalysis**](GoogleCloudAiplatformV1FeaturestoreMonitoringConfigImportFeaturesAnalysis.md) | The config for ImportFeatures Analysis Based Feature Monitoring. |  [optional] |



