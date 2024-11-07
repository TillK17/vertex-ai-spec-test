

# GoogleCloudAiplatformV1ExamplesExampleGcsSource

The Cloud Storage input instances.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gcsSource** | [**GoogleCloudAiplatformV1GcsSource**](GoogleCloudAiplatformV1GcsSource.md) | The Cloud Storage location for the input instances. |  [optional] |
|**dataFormat** | [**DataFormatEnum**](#DataFormatEnum) | The format in which instances are given, if not specified, assume it&#39;s JSONL format. Currently only JSONL format is supported. |  [optional] |



## Enum: DataFormatEnum

| Name | Value |
|---- | -----|
| DATA_FORMAT_UNSPECIFIED | &quot;DATA_FORMAT_UNSPECIFIED&quot; |
| JSONL | &quot;JSONL&quot; |



