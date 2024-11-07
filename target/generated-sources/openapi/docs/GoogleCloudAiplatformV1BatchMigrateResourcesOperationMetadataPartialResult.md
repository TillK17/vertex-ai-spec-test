

# GoogleCloudAiplatformV1BatchMigrateResourcesOperationMetadataPartialResult

Represents a partial result in batch migration operation for one MigrateResourceRequest.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | **String** | Migrated model resource name. |  [optional] |
|**dataset** | **String** | Migrated dataset resource name. |  [optional] |
|**request** | [**GoogleCloudAiplatformV1MigrateResourceRequest**](GoogleCloudAiplatformV1MigrateResourceRequest.md) | It&#39;s the same as the value in MigrateResourceRequest.migrate_resource_requests. |  [optional] |
|**error** | [**GoogleRpcStatus**](GoogleRpcStatus.md) | The error result of the migration request in case of failure. |  [optional] |



