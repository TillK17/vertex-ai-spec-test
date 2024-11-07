

# GoogleCloudAiplatformV1FeatureView

FeatureView is representation of values that the FeatureOnlineStore will serve based on its syncConfig.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bigQuerySource** | [**GoogleCloudAiplatformV1FeatureViewBigQuerySource**](GoogleCloudAiplatformV1FeatureViewBigQuerySource.md) | Optional. Configures how data is supposed to be extracted from a BigQuery source to be loaded onto the FeatureOnlineStore. |  [optional] |
|**indexConfig** | [**GoogleCloudAiplatformV1FeatureViewIndexConfig**](GoogleCloudAiplatformV1FeatureViewIndexConfig.md) | Optional. Configuration for index preparation for vector search. It contains the required configurations to create an index from source data, so that approximate nearest neighbor (a.k.a ANN) algorithms search can be performed during online serving. |  [optional] |
|**name** | **String** | Identifier. Name of the FeatureView. Format: &#x60;projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}/featureViews/{feature_view}&#x60; |  [optional] |
|**etag** | **String** | Optional. Used to perform consistent read-modify-write updates. If not set, a blind \&quot;overwrite\&quot; update happens. |  [optional] |
|**satisfiesPzi** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**vertexRagSource** | [**GoogleCloudAiplatformV1FeatureViewVertexRagSource**](GoogleCloudAiplatformV1FeatureViewVertexRagSource.md) | Optional. The Vertex RAG Source that the FeatureView is linked to. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Optional. The labels with user-defined metadata to organize your FeatureViews. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information on and examples of labels. No more than 64 user labels can be associated with one FeatureOnlineStore(System labels are excluded).\&quot; System reserved label keys are prefixed with \&quot;aiplatform.googleapis.com/\&quot; and are immutable. |  [optional] |
|**updateTime** | **String** | Output only. Timestamp when this FeatureView was last updated. |  [optional] [readonly] |
|**satisfiesPzs** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**featureRegistrySource** | [**GoogleCloudAiplatformV1FeatureViewFeatureRegistrySource**](GoogleCloudAiplatformV1FeatureViewFeatureRegistrySource.md) | Optional. Configures the features from a Feature Registry source that need to be loaded onto the FeatureOnlineStore. |  [optional] |
|**syncConfig** | [**GoogleCloudAiplatformV1FeatureViewSyncConfig**](GoogleCloudAiplatformV1FeatureViewSyncConfig.md) | Configures when data is to be synced/updated for this FeatureView. At the end of the sync the latest featureValues for each entityId of this FeatureView are made ready for online serving. |  [optional] |
|**createTime** | **String** | Output only. Timestamp when this FeatureView was created. |  [optional] [readonly] |



