

# GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataContentValidationStats


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**validRecordCount** | **String** | Number of records in this file that were successfully processed. |  [optional] |
|**validSparseRecordCount** | **String** | Number of sparse records in this file that were successfully processed. |  [optional] |
|**sourceGcsUri** | **String** | Cloud Storage URI pointing to the original file in user&#39;s bucket. |  [optional] |
|**invalidSparseRecordCount** | **String** | Number of sparse records in this file we skipped due to validate errors. |  [optional] |
|**partialErrors** | [**List&lt;GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError&gt;**](GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataRecordError.md) | The detail information of the partial failures encountered for those invalid records that couldn&#39;t be parsed. Up to 50 partial errors will be reported. |  [optional] |
|**invalidRecordCount** | **String** | Number of records in this file we skipped due to validate errors. |  [optional] |



