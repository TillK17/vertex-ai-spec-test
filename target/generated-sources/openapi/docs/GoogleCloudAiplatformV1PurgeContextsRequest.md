

# GoogleCloudAiplatformV1PurgeContextsRequest

Request message for MetadataService.PurgeContexts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**force** | **Boolean** | Optional. Flag to indicate to actually perform the purge. If &#x60;force&#x60; is set to false, the method will return a sample of Context names that would be deleted. |  [optional] |
|**filter** | **String** | Required. A required filter matching the Contexts to be purged. E.g., &#x60;update_time &lt;&#x3D; 2020-11-19T11:30:00-04:00&#x60;. |  [optional] |



