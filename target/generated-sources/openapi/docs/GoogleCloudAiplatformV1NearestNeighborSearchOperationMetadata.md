

# GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadata

Runtime operation metadata with regard to Matching Engine Index.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataBytesCount** | **String** | The ingested data size in bytes. |  [optional] |
|**contentValidationStats** | [**List&lt;GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataContentValidationStats&gt;**](GoogleCloudAiplatformV1NearestNeighborSearchOperationMetadataContentValidationStats.md) | The validation stats of the content (per file) to be inserted or updated on the Matching Engine Index resource. Populated if contentsDeltaUri is provided as part of Index.metadata. Please note that, currently for those files that are broken or has unsupported file format, we will not have the stats for those files. |  [optional] |


