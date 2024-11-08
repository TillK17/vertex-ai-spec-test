

# GoogleCloudAiplatformV1ExportDataResponse

Response message for DatasetService.ExportData.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataStats** | [**GoogleCloudAiplatformV1ModelDataStats**](GoogleCloudAiplatformV1ModelDataStats.md) | Only present for custom code training export use case. Records data stats, i.e., train/validation/test item/annotation counts calculated during the export operation. |  [optional] |
|**exportedFiles** | **List&lt;String&gt;** | All of the files that are exported in this export operation. For custom code training export, only three (training, validation and test) Cloud Storage paths in wildcard format are populated (for example, gs://.../training-*). |  [optional] |



