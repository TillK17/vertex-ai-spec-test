

# GoogleCloudAiplatformV1FeatureViewIndexConfig

Configuration for vector indexing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**treeAhConfig** | [**GoogleCloudAiplatformV1FeatureViewIndexConfigTreeAHConfig**](GoogleCloudAiplatformV1FeatureViewIndexConfigTreeAHConfig.md) | Optional. Configuration options for the tree-AH algorithm (Shallow tree + Asymmetric Hashing). Please refer to this paper for more details: https://arxiv.org/abs/1908.10396 |  [optional] |
|**crowdingColumn** | **String** | Optional. Column of crowding. This column contains crowding attribute which is a constraint on a neighbor list produced by FeatureOnlineStoreService.SearchNearestEntities to diversify search results. If NearestNeighborQuery.per_crowding_attribute_neighbor_count is set to K in SearchNearestEntitiesRequest, it&#39;s guaranteed that no more than K entities of the same crowding attribute are returned in the response. |  [optional] |
|**bruteForceConfig** | **Object** | Configuration options for using brute force search. |  [optional] |
|**distanceMeasureType** | [**DistanceMeasureTypeEnum**](#DistanceMeasureTypeEnum) | Optional. The distance measure used in nearest neighbor search. |  [optional] |
|**embeddingDimension** | **Integer** | Optional. The number of dimensions of the input embedding. |  [optional] |
|**embeddingColumn** | **String** | Optional. Column of embedding. This column contains the source data to create index for vector search. embedding_column must be set when using vector search. |  [optional] |
|**filterColumns** | **List&lt;String&gt;** | Optional. Columns of features that&#39;re used to filter vector search results. |  [optional] |



## Enum: DistanceMeasureTypeEnum

| Name | Value |
|---- | -----|
| DISTANCE_MEASURE_TYPE_UNSPECIFIED | &quot;DISTANCE_MEASURE_TYPE_UNSPECIFIED&quot; |
| SQUARED_L2_DISTANCE | &quot;SQUARED_L2_DISTANCE&quot; |
| COSINE_DISTANCE | &quot;COSINE_DISTANCE&quot; |
| DOT_PRODUCT_DISTANCE | &quot;DOT_PRODUCT_DISTANCE&quot; |



