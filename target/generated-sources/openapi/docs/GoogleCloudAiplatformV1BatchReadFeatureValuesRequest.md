

# GoogleCloudAiplatformV1BatchReadFeatureValuesRequest

Request message for FeaturestoreService.BatchReadFeatureValues.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**passThroughFields** | [**List&lt;GoogleCloudAiplatformV1BatchReadFeatureValuesRequestPassThroughField&gt;**](GoogleCloudAiplatformV1BatchReadFeatureValuesRequestPassThroughField.md) | When not empty, the specified fields in the *_read_instances source will be joined as-is in the output, in addition to those fields from the Featurestore Entity. For BigQuery source, the type of the pass-through values will be automatically inferred. For CSV source, the pass-through values will be passed as opaque bytes. |  [optional] |
|**entityTypeSpecs** | [**List&lt;GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec&gt;**](GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec.md) | Required. Specifies EntityType grouping Features to read values of and settings. |  [optional] |
|**bigqueryReadInstances** | [**GoogleCloudAiplatformV1BigQuerySource**](GoogleCloudAiplatformV1BigQuerySource.md) | Similar to csv_read_instances, but from BigQuery source. |  [optional] |
|**destination** | [**GoogleCloudAiplatformV1FeatureValueDestination**](GoogleCloudAiplatformV1FeatureValueDestination.md) | Required. Specifies output location and format. |  [optional] |
|**startTime** | **String** | Optional. Excludes Feature values with feature generation timestamp before this timestamp. If not set, retrieve oldest values kept in Feature Store. Timestamp, if present, must not have higher than millisecond precision. |  [optional] |
|**csvReadInstances** | [**GoogleCloudAiplatformV1CsvSource**](GoogleCloudAiplatformV1CsvSource.md) | Each read instance consists of exactly one read timestamp and one or more entity IDs identifying entities of the corresponding EntityTypes whose Features are requested. Each output instance contains Feature values of requested entities concatenated together as of the read time. An example read instance may be &#x60;foo_entity_id, bar_entity_id, 2020-01-01T10:00:00.123Z&#x60;. An example output instance may be &#x60;foo_entity_id, bar_entity_id, 2020-01-01T10:00:00.123Z, foo_entity_feature1_value, bar_entity_feature2_value&#x60;. Timestamp in each read instance must be millisecond-aligned. &#x60;csv_read_instances&#x60; are read instances stored in a plain-text CSV file. The header should be: [ENTITY_TYPE_ID1], [ENTITY_TYPE_ID2], ..., timestamp The columns can be in any order. Values in the timestamp column must use the RFC 3339 format, e.g. &#x60;2012-07-30T10:43:17.123Z&#x60;. |  [optional] |



