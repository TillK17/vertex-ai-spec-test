

# GoogleCloudAiplatformV1FeatureValueDestination

A destination location for Feature values and format.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tfrecordDestination** | [**GoogleCloudAiplatformV1TFRecordDestination**](GoogleCloudAiplatformV1TFRecordDestination.md) | Output in TFRecord format. Below are the mapping from Feature value type in Featurestore to Feature value type in TFRecord: Value type in Featurestore | Value type in TFRecord DOUBLE, DOUBLE_ARRAY | FLOAT_LIST INT64, INT64_ARRAY | INT64_LIST STRING, STRING_ARRAY, BYTES | BYTES_LIST true -&gt; byte_string(\&quot;true\&quot;), false -&gt; byte_string(\&quot;false\&quot;) BOOL, BOOL_ARRAY (true, false) | BYTES_LIST |  [optional] |
|**bigqueryDestination** | [**GoogleCloudAiplatformV1BigQueryDestination**](GoogleCloudAiplatformV1BigQueryDestination.md) | Output in BigQuery format. BigQueryDestination.output_uri in FeatureValueDestination.bigquery_destination must refer to a table. |  [optional] |
|**csvDestination** | [**GoogleCloudAiplatformV1CsvDestination**](GoogleCloudAiplatformV1CsvDestination.md) | Output in CSV format. Array Feature value types are not allowed in CSV format. |  [optional] |



