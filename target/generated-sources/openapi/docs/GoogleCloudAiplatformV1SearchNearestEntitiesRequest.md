

# GoogleCloudAiplatformV1SearchNearestEntitiesRequest

The request message for FeatureOnlineStoreService.SearchNearestEntities.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**returnFullEntity** | **Boolean** | Optional. If set to true, the full entities (including all vector values and metadata) of the nearest neighbors are returned; otherwise only entity id of the nearest neighbors will be returned. Note that returning full entities will significantly increase the latency and cost of the query. |  [optional] |
|**query** | [**GoogleCloudAiplatformV1NearestNeighborQuery**](GoogleCloudAiplatformV1NearestNeighborQuery.md) | Required. The query. |  [optional] |



