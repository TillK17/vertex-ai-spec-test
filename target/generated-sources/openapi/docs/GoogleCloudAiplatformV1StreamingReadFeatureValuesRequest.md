

# GoogleCloudAiplatformV1StreamingReadFeatureValuesRequest

Request message for FeaturestoreOnlineServingService.StreamingFeatureValuesRead.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**featureSelector** | [**GoogleCloudAiplatformV1FeatureSelector**](GoogleCloudAiplatformV1FeatureSelector.md) | Required. Selector choosing Features of the target EntityType. Feature IDs will be deduplicated. |  [optional] |
|**entityIds** | **List&lt;String&gt;** | Required. IDs of entities to read Feature values of. The maximum number of IDs is 100. For example, for a machine learning model predicting user clicks on a website, an entity ID could be &#x60;user_123&#x60;. |  [optional] |



