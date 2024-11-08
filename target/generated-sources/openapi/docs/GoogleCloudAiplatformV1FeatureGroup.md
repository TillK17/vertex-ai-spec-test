

# GoogleCloudAiplatformV1FeatureGroup

Vertex AI Feature Group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bigQuery** | [**GoogleCloudAiplatformV1FeatureGroupBigQuery**](GoogleCloudAiplatformV1FeatureGroupBigQuery.md) | Indicates that features for this group come from BigQuery Table/View. By default treats the source as a sparse time series source. The BigQuery source table or view must have at least one entity ID column and a column named &#x60;feature_timestamp&#x60;. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Optional. The labels with user-defined metadata to organize your FeatureGroup. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information on and examples of labels. No more than 64 user labels can be associated with one FeatureGroup(System labels are excluded).\&quot; System reserved label keys are prefixed with \&quot;aiplatform.googleapis.com/\&quot; and are immutable. |  [optional] |
|**etag** | **String** | Optional. Used to perform consistent read-modify-write updates. If not set, a blind \&quot;overwrite\&quot; update happens. |  [optional] |
|**createTime** | **String** | Output only. Timestamp when this FeatureGroup was created. |  [optional] [readonly] |
|**description** | **String** | Optional. Description of the FeatureGroup. |  [optional] |
|**name** | **String** | Identifier. Name of the FeatureGroup. Format: &#x60;projects/{project}/locations/{location}/featureGroups/{featureGroup}&#x60; |  [optional] |
|**updateTime** | **String** | Output only. Timestamp when this FeatureGroup was last updated. |  [optional] [readonly] |



