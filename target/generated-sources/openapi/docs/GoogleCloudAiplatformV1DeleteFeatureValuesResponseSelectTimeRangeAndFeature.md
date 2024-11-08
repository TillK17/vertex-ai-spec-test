

# GoogleCloudAiplatformV1DeleteFeatureValuesResponseSelectTimeRangeAndFeature

Response message if the request uses the SelectTimeRangeAndFeature option.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**offlineStorageModifiedEntityRowCount** | **String** | The count of modified entity rows in the offline storage. Each row corresponds to the combination of an entity ID and a timestamp. One entity ID can have multiple rows in the offline storage. Within each row, only the features specified in the request are deleted. |  [optional] |
|**impactedFeatureCount** | **String** | The count of the features or columns impacted. This is the same as the feature count in the request. |  [optional] |
|**onlineStorageModifiedEntityCount** | **String** | The count of modified entities in the online storage. Each entity ID corresponds to one entity. Within each entity, only the features specified in the request are deleted. |  [optional] |



