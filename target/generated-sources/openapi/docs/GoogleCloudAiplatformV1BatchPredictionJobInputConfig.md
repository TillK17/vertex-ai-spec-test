

# GoogleCloudAiplatformV1BatchPredictionJobInputConfig

Configures the input to BatchPredictionJob. See Model.supported_input_storage_formats for Model's supported input formats, and how instances should be expressed via any of them.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instancesFormat** | **String** | Required. The format in which instances are given, must be one of the Model&#39;s supported_input_storage_formats. |  [optional] |
|**gcsSource** | [**GoogleCloudAiplatformV1GcsSource**](GoogleCloudAiplatformV1GcsSource.md) | The Cloud Storage location for the input instances. |  [optional] |
|**bigquerySource** | [**GoogleCloudAiplatformV1BigQuerySource**](GoogleCloudAiplatformV1BigQuerySource.md) | The BigQuery location of the input table. The schema of the table should be in the format described by the given context OpenAPI Schema, if one is provided. The table may contain additional columns that are not described by the schema, and they will be ignored. |  [optional] |



