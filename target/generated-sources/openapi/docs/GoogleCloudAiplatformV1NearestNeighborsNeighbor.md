

# GoogleCloudAiplatformV1NearestNeighborsNeighbor

A neighbor of the query vector.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityKeyValues** | [**GoogleCloudAiplatformV1FetchFeatureValuesResponse**](GoogleCloudAiplatformV1FetchFeatureValuesResponse.md) | The attributes of the neighbor, e.g. filters, crowding and metadata Note that full entities are returned only when \&quot;return_full_entity\&quot; is set to true. Otherwise, only the \&quot;entity_id\&quot; and \&quot;distance\&quot; fields are populated. |  [optional] |
|**distance** | **Double** | The distance between the neighbor and the query vector. |  [optional] |
|**entityId** | **String** | The id of the similar entity. |  [optional] |



