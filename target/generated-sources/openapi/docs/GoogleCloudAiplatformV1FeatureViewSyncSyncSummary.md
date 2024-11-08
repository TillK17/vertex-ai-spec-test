

# GoogleCloudAiplatformV1FeatureViewSyncSyncSummary

Summary from the Sync job. For continuous syncs, the summary is updated periodically. For batch syncs, it gets updated on completion of the sync.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rowSynced** | **String** | Output only. Total number of rows synced. |  [optional] [readonly] |
|**systemWatermarkTime** | **String** | Lower bound of the system time watermark for the sync job. This is only set for continuously syncing feature views. |  [optional] |
|**totalSlot** | **String** | Output only. BigQuery slot milliseconds consumed for the sync job. |  [optional] [readonly] |



