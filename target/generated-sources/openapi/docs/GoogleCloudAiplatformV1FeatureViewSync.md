

# GoogleCloudAiplatformV1FeatureViewSync

FeatureViewSync is a representation of sync operation which copies data from data source to Feature View in Online Store.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createTime** | **String** | Output only. Time when this FeatureViewSync is created. Creation of a FeatureViewSync means that the job is pending / waiting for sufficient resources but may not have started the actual data transfer yet. |  [optional] [readonly] |
|**satisfiesPzs** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**syncSummary** | [**GoogleCloudAiplatformV1FeatureViewSyncSyncSummary**](GoogleCloudAiplatformV1FeatureViewSyncSyncSummary.md) | Output only. Summary of the sync job. |  [optional] [readonly] |
|**finalStatus** | [**GoogleRpcStatus**](GoogleRpcStatus.md) | Output only. Final status of the FeatureViewSync. |  [optional] [readonly] |
|**satisfiesPzi** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**runTime** | [**GoogleTypeInterval**](GoogleTypeInterval.md) | Output only. Time when this FeatureViewSync is finished. |  [optional] [readonly] |
|**name** | **String** | Identifier. Name of the FeatureViewSync. Format: &#x60;projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}/featureViews/{feature_view}/featureViewSyncs/{feature_view_sync}&#x60; |  [optional] |



