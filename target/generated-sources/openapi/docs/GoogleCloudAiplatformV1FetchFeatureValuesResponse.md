

# GoogleCloudAiplatformV1FetchFeatureValuesResponse

Response message for FeatureOnlineStoreService.FetchFeatureValues

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyValues** | [**GoogleCloudAiplatformV1FetchFeatureValuesResponseFeatureNameValuePairList**](GoogleCloudAiplatformV1FetchFeatureValuesResponseFeatureNameValuePairList.md) | Feature values in KeyValue format. |  [optional] |
|**dataKey** | [**GoogleCloudAiplatformV1FeatureViewDataKey**](GoogleCloudAiplatformV1FeatureViewDataKey.md) | The data key associated with this response. Will only be populated for FeatureOnlineStoreService.StreamingFetchFeatureValues RPCs. |  [optional] |
|**protoStruct** | **Map&lt;String, Any&gt;** | Feature values in proto Struct format. |  [optional] |



