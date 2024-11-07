

# GoogleCloudAiplatformV1FeatureGroupBigQuery

Input source type for BigQuery Tables and Views.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dense** | **Boolean** | Optional. If set, all feature values will be fetched from a single row per unique entityId including nulls. If not set, will collapse all rows for each unique entityId into a singe row with any non-null values if present, if no non-null values are present will sync null. ex: If source has schema &#x60;(entity_id, feature_timestamp, f0, f1)&#x60; and the following rows: &#x60;(e1, 2020-01-01T10:00:00.123Z, 10, 15)&#x60; &#x60;(e1, 2020-02-01T10:00:00.123Z, 20, null)&#x60; If dense is set, &#x60;(e1, 20, null)&#x60; is synced to online stores. If dense is not set, &#x60;(e1, 20, 15)&#x60; is synced to online stores. |  [optional] |
|**entityIdColumns** | **List&lt;String&gt;** | Optional. Columns to construct entity_id / row keys. If not provided defaults to &#x60;entity_id&#x60;. |  [optional] |
|**staticDataSource** | **Boolean** | Optional. Set if the data source is not a time-series. |  [optional] |
|**timeSeries** | [**GoogleCloudAiplatformV1FeatureGroupBigQueryTimeSeries**](GoogleCloudAiplatformV1FeatureGroupBigQueryTimeSeries.md) | Optional. If the source is a time-series source, this can be set to control how downstream sources (ex: FeatureView ) will treat time-series sources. If not set, will treat the source as a time-series source with &#x60;feature_timestamp&#x60; as timestamp column and no scan boundary. |  [optional] |
|**bigQuerySource** | [**GoogleCloudAiplatformV1BigQuerySource**](GoogleCloudAiplatformV1BigQuerySource.md) | Required. Immutable. The BigQuery source URI that points to either a BigQuery Table or View. |  [optional] |



