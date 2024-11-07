

# GoogleCloudAiplatformV1ModelMonitoringObjectiveConfigExplanationConfigExplanationBaseline

Output from BatchPredictionJob for Model Monitoring baseline dataset, which can be used to generate baseline attribution scores.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gcs** | [**GoogleCloudAiplatformV1GcsDestination**](GoogleCloudAiplatformV1GcsDestination.md) | Cloud Storage location for BatchExplain output. |  [optional] |
|**bigquery** | [**GoogleCloudAiplatformV1BigQueryDestination**](GoogleCloudAiplatformV1BigQueryDestination.md) | BigQuery location for BatchExplain output. |  [optional] |
|**predictionFormat** | [**PredictionFormatEnum**](#PredictionFormatEnum) | The storage format of the predictions generated BatchPrediction job. |  [optional] |



## Enum: PredictionFormatEnum

| Name | Value |
|---- | -----|
| PREDICTION_FORMAT_UNSPECIFIED | &quot;PREDICTION_FORMAT_UNSPECIFIED&quot; |
| JSONL | &quot;JSONL&quot; |
| BIGQUERY | &quot;BIGQUERY&quot; |



