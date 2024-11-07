

# GoogleCloudAiplatformV1ModelMonitoringObjectiveConfigPredictionDriftDetectionConfig

The config for Prediction data drift detection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributionScoreDriftThresholds** | [**Map&lt;String, GoogleCloudAiplatformV1ThresholdConfig&gt;**](GoogleCloudAiplatformV1ThresholdConfig.md) | Key is the feature name and value is the threshold. The threshold here is against attribution score distance between different time windows. |  [optional] |
|**driftThresholds** | [**Map&lt;String, GoogleCloudAiplatformV1ThresholdConfig&gt;**](GoogleCloudAiplatformV1ThresholdConfig.md) | Key is the feature name and value is the threshold. If a feature needs to be monitored for drift, a value threshold must be configured for that feature. The threshold here is against feature distribution distance between different time windws. |  [optional] |
|**defaultDriftThreshold** | [**GoogleCloudAiplatformV1ThresholdConfig**](GoogleCloudAiplatformV1ThresholdConfig.md) | Drift anomaly detection threshold used by all features. When the per-feature thresholds are not set, this field can be used to specify a threshold for all features. |  [optional] |



