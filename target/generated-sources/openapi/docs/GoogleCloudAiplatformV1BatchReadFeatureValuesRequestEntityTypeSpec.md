

# GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec

Selects Features of an EntityType to read values of and specifies read settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**featureSelector** | [**GoogleCloudAiplatformV1FeatureSelector**](GoogleCloudAiplatformV1FeatureSelector.md) | Required. Selectors choosing which Feature values to read from the EntityType. |  [optional] |
|**entityTypeId** | **String** | Required. ID of the EntityType to select Features. The EntityType id is the entity_type_id specified during EntityType creation. |  [optional] |
|**settings** | [**List&lt;GoogleCloudAiplatformV1DestinationFeatureSetting&gt;**](GoogleCloudAiplatformV1DestinationFeatureSetting.md) | Per-Feature settings for the batch read. |  [optional] |



