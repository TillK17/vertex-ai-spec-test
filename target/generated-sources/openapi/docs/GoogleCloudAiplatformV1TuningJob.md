

# GoogleCloudAiplatformV1TuningJob

Represents a TuningJob that runs with Google owned models.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | [**StateEnum**](#StateEnum) | Output only. The detailed state of the job. |  [optional] [readonly] |
|**tunedModel** | [**GoogleCloudAiplatformV1TunedModel**](GoogleCloudAiplatformV1TunedModel.md) | Output only. The tuned model resources assiociated with this TuningJob. |  [optional] [readonly] |
|**endTime** | **String** | Output only. Time when the TuningJob entered any of the following JobStates: &#x60;JOB_STATE_SUCCEEDED&#x60;, &#x60;JOB_STATE_FAILED&#x60;, &#x60;JOB_STATE_CANCELLED&#x60;, &#x60;JOB_STATE_EXPIRED&#x60;. |  [optional] [readonly] |
|**baseModel** | **String** | The base model that is being tuned, e.g., \&quot;gemini-1.0-pro-002\&quot;. |  [optional] |
|**tuningDataStats** | [**GoogleCloudAiplatformV1TuningDataStats**](GoogleCloudAiplatformV1TuningDataStats.md) | Output only. The tuning data statistics associated with this TuningJob. |  [optional] [readonly] |
|**createTime** | **String** | Output only. Time when the TuningJob was created. |  [optional] [readonly] |
|**error** | [**GoogleRpcStatus**](GoogleRpcStatus.md) | Output only. Only populated when job&#39;s state is &#x60;JOB_STATE_FAILED&#x60; or &#x60;JOB_STATE_CANCELLED&#x60;. |  [optional] [readonly] |
|**encryptionSpec** | [**GoogleCloudAiplatformV1EncryptionSpec**](GoogleCloudAiplatformV1EncryptionSpec.md) | Customer-managed encryption key options for a TuningJob. If this is set, then all resources created by the TuningJob will be encrypted with the provided encryption key. |  [optional] |
|**startTime** | **String** | Output only. Time when the TuningJob for the first time entered the &#x60;JOB_STATE_RUNNING&#x60; state. |  [optional] [readonly] |
|**supervisedTuningSpec** | [**GoogleCloudAiplatformV1SupervisedTuningSpec**](GoogleCloudAiplatformV1SupervisedTuningSpec.md) | Tuning Spec for Supervised Fine Tuning. |  [optional] |
|**name** | **String** | Output only. Identifier. Resource name of a TuningJob. Format: &#x60;projects/{project}/locations/{location}/tuningJobs/{tuning_job}&#x60; |  [optional] [readonly] |
|**description** | **String** | Optional. The description of the TuningJob. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Optional. The labels with user-defined metadata to organize TuningJob and generated resources such as Model and Endpoint. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels. |  [optional] |
|**updateTime** | **String** | Output only. Time when the TuningJob was most recently updated. |  [optional] [readonly] |
|**experiment** | **String** | Output only. The Experiment associated with this TuningJob. |  [optional] [readonly] |
|**tunedModelDisplayName** | **String** | Optional. The display name of the TunedModel. The name can be up to 128 characters long and can consist of any UTF-8 characters. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;JOB_STATE_UNSPECIFIED&quot; |
| QUEUED | &quot;JOB_STATE_QUEUED&quot; |
| PENDING | &quot;JOB_STATE_PENDING&quot; |
| RUNNING | &quot;JOB_STATE_RUNNING&quot; |
| SUCCEEDED | &quot;JOB_STATE_SUCCEEDED&quot; |
| FAILED | &quot;JOB_STATE_FAILED&quot; |
| CANCELLING | &quot;JOB_STATE_CANCELLING&quot; |
| CANCELLED | &quot;JOB_STATE_CANCELLED&quot; |
| PAUSED | &quot;JOB_STATE_PAUSED&quot; |
| EXPIRED | &quot;JOB_STATE_EXPIRED&quot; |
| UPDATING | &quot;JOB_STATE_UPDATING&quot; |
| PARTIALLY_SUCCEEDED | &quot;JOB_STATE_PARTIALLY_SUCCEEDED&quot; |



