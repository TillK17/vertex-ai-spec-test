

# GoogleCloudAiplatformV1GenericOperationMetadata

Generic Metadata shared by all operations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updateTime** | **String** | Output only. Time when the operation was updated for the last time. If the operation has finished (successfully or not), this is the finish time. |  [optional] [readonly] |
|**createTime** | **String** | Output only. Time when the operation was created. |  [optional] [readonly] |
|**partialFailures** | [**List&lt;GoogleRpcStatus&gt;**](GoogleRpcStatus.md) | Output only. Partial failures encountered. E.g. single files that couldn&#39;t be read. This field should never exceed 20 entries. Status details field will contain standard Google Cloud error details. |  [optional] |



