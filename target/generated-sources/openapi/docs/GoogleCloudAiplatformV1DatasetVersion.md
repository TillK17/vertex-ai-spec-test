

# GoogleCloudAiplatformV1DatasetVersion

Describes the dataset version.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**satisfiesPzs** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**etag** | **String** | Used to perform consistent read-modify-write updates. If not set, a blind \&quot;overwrite\&quot; update happens. |  [optional] |
|**modelReference** | **String** | Output only. Reference to the public base model last used by the dataset version. Only set for prompt dataset versions. |  [optional] [readonly] |
|**metadata** | **Any** | Required. Output only. Additional information about the DatasetVersion. |  [optional] [readonly] |
|**updateTime** | **String** | Output only. Timestamp when this DatasetVersion was last updated. |  [optional] [readonly] |
|**bigQueryDatasetName** | **String** | Output only. Name of the associated BigQuery dataset. |  [optional] [readonly] |
|**displayName** | **String** | The user-defined name of the DatasetVersion. The name can be up to 128 characters long and can consist of any UTF-8 characters. |  [optional] |
|**satisfiesPzi** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**name** | **String** | Output only. Identifier. The resource name of the DatasetVersion. |  [optional] [readonly] |
|**createTime** | **String** | Output only. Timestamp when this DatasetVersion was created. |  [optional] [readonly] |



