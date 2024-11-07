

# GoogleCloudAiplatformV1PredictRequestResponseLoggingConfig

Configuration for logging request-response to a BigQuery table.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**samplingRate** | **Double** | Percentage of requests to be logged, expressed as a fraction in range(0,1]. |  [optional] |
|**enabled** | **Boolean** | If logging is enabled or not. |  [optional] |
|**bigqueryDestination** | [**GoogleCloudAiplatformV1BigQueryDestination**](GoogleCloudAiplatformV1BigQueryDestination.md) | BigQuery table for logging. If only given a project, a new dataset will be created with name &#x60;logging__&#x60; where will be made BigQuery-dataset-name compatible (e.g. most special characters will become underscores). If no table name is given, a new table will be created with name &#x60;request_response_logging&#x60; |  [optional] |



