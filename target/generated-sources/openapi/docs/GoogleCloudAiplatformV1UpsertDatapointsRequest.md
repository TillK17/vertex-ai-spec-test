

# GoogleCloudAiplatformV1UpsertDatapointsRequest

Request message for IndexService.UpsertDatapoints

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updateMask** | **String** | Optional. Update mask is used to specify the fields to be overwritten in the datapoints by the update. The fields specified in the update_mask are relative to each IndexDatapoint inside datapoints, not the full request. Updatable fields: * Use &#x60;all_restricts&#x60; to update both restricts and numeric_restricts. |  [optional] |
|**datapoints** | [**List&lt;GoogleCloudAiplatformV1IndexDatapoint&gt;**](GoogleCloudAiplatformV1IndexDatapoint.md) | A list of datapoints to be created/updated. |  [optional] |



