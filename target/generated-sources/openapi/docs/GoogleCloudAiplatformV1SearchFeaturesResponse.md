

# GoogleCloudAiplatformV1SearchFeaturesResponse

Response message for FeaturestoreService.SearchFeatures.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextPageToken** | **String** | A token, which can be sent as SearchFeaturesRequest.page_token to retrieve the next page. If this field is omitted, there are no subsequent pages. |  [optional] |
|**features** | [**List&lt;GoogleCloudAiplatformV1Feature&gt;**](GoogleCloudAiplatformV1Feature.md) | The Features matching the request. Fields returned: * &#x60;name&#x60; * &#x60;description&#x60; * &#x60;labels&#x60; * &#x60;create_time&#x60; * &#x60;update_time&#x60; |  [optional] |



