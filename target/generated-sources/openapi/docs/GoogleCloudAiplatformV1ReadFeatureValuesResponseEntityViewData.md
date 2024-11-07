

# GoogleCloudAiplatformV1ReadFeatureValuesResponseEntityViewData

Container to hold value(s), successive in time, for one Feature from the request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | [**GoogleCloudAiplatformV1FeatureValue**](GoogleCloudAiplatformV1FeatureValue.md) | Feature value if a single value is requested. |  [optional] |
|**values** | [**GoogleCloudAiplatformV1FeatureValueList**](GoogleCloudAiplatformV1FeatureValueList.md) | Feature values list if values, successive in time, are requested. If the requested number of values is greater than the number of existing Feature values, nonexistent values are omitted instead of being returned as empty. |  [optional] |



