

# GoogleCloudAiplatformV1ModelMonitoringObjectiveConfig

The objective configuration for model monitoring, including the information needed to detect anomalies for one particular model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**trainingDataset** | [**GoogleCloudAiplatformV1ModelMonitoringObjectiveConfigTrainingDataset**](GoogleCloudAiplatformV1ModelMonitoringObjectiveConfigTrainingDataset.md) | Training dataset for models. This field has to be set only if TrainingPredictionSkewDetectionConfig is specified. |  [optional] |
|**explanationConfig** | [**GoogleCloudAiplatformV1ModelMonitoringObjectiveConfigExplanationConfig**](GoogleCloudAiplatformV1ModelMonitoringObjectiveConfigExplanationConfig.md) | The config for integrating with Vertex Explainable AI. |  [optional] |
|**trainingPredictionSkewDetectionConfig** | [**GoogleCloudAiplatformV1ModelMonitoringObjectiveConfigTrainingPredictionSkewDetectionConfig**](GoogleCloudAiplatformV1ModelMonitoringObjectiveConfigTrainingPredictionSkewDetectionConfig.md) | The config for skew between training data and prediction data. |  [optional] |
|**predictionDriftDetectionConfig** | [**GoogleCloudAiplatformV1ModelMonitoringObjectiveConfigPredictionDriftDetectionConfig**](GoogleCloudAiplatformV1ModelMonitoringObjectiveConfigPredictionDriftDetectionConfig.md) | The config for drift of prediction data. |  [optional] |



