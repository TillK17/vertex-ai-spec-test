

# GoogleCloudAiplatformV1ImportFeatureValuesOperationMetadata

Details of operations that perform import Feature values.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**importedFeatureValueCount** | **String** | Number of Feature values that have been imported by the operation. |  [optional] |
|**blockingOperationIds** | **List&lt;String&gt;** | List of ImportFeatureValues operations running under a single EntityType that are blocking this operation. |  [optional] |
|**genericMetadata** | [**GoogleCloudAiplatformV1GenericOperationMetadata**](GoogleCloudAiplatformV1GenericOperationMetadata.md) | Operation metadata for Featurestore import Feature values. |  [optional] |
|**importedEntityCount** | **String** | Number of entities that have been imported by the operation. |  [optional] |
|**sourceUris** | **List&lt;String&gt;** | The source URI from where Feature values are imported. |  [optional] |
|**timestampOutsideRetentionRowsCount** | **String** | The number rows that weren&#39;t ingested due to having timestamps outside the retention boundary. |  [optional] |
|**invalidRowCount** | **String** | The number of rows in input source that weren&#39;t imported due to either * Not having any featureValues. * Having a null entityId. * Having a null timestamp. * Not being parsable (applicable for CSV sources). |  [optional] |



