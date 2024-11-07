

# GoogleCloudAiplatformV1HyperparameterTuningJob

Represents a HyperparameterTuningJob. A HyperparameterTuningJob has a Study specification and multiple CustomJobs with identical CustomJob specification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | Required. The display name of the HyperparameterTuningJob. The name can be up to 128 characters long and can consist of any UTF-8 characters. |  [optional] |
|**createTime** | **String** | Output only. Time when the HyperparameterTuningJob was created. |  [optional] [readonly] |
|**studySpec** | [**GoogleCloudAiplatformV1StudySpec**](GoogleCloudAiplatformV1StudySpec.md) | Required. Study configuration of the HyperparameterTuningJob. |  [optional] |
|**maxFailedTrialCount** | **Integer** | The number of failed Trials that need to be seen before failing the HyperparameterTuningJob. If set to 0, Vertex AI decides how many Trials must fail before the whole job fails. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Output only. The detailed state of the job. |  [optional] [readonly] |
|**trialJobSpec** | [**GoogleCloudAiplatformV1CustomJobSpec**](GoogleCloudAiplatformV1CustomJobSpec.md) | Required. The spec of a trial job. The same spec applies to the CustomJobs created in all the trials. |  [optional] |
|**maxTrialCount** | **Integer** | Required. The desired total number of Trials. |  [optional] |
|**endTime** | **String** | Output only. Time when the HyperparameterTuningJob entered any of the following states: &#x60;JOB_STATE_SUCCEEDED&#x60;, &#x60;JOB_STATE_FAILED&#x60;, &#x60;JOB_STATE_CANCELLED&#x60;. |  [optional] [readonly] |
|**name** | **String** | Output only. Resource name of the HyperparameterTuningJob. |  [optional] [readonly] |
|**satisfiesPzi** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**encryptionSpec** | [**GoogleCloudAiplatformV1EncryptionSpec**](GoogleCloudAiplatformV1EncryptionSpec.md) | Customer-managed encryption key options for a HyperparameterTuningJob. If this is set, then all resources created by the HyperparameterTuningJob will be encrypted with the provided encryption key. |  [optional] |
|**error** | [**GoogleRpcStatus**](GoogleRpcStatus.md) | Output only. Only populated when job&#39;s state is JOB_STATE_FAILED or JOB_STATE_CANCELLED. |  [optional] [readonly] |
|**parallelTrialCount** | **Integer** | Required. The desired number of Trials to run in parallel. |  [optional] |
|**startTime** | **String** | Output only. Time when the HyperparameterTuningJob for the first time entered the &#x60;JOB_STATE_RUNNING&#x60; state. |  [optional] [readonly] |
|**trials** | [**List&lt;GoogleCloudAiplatformV1Trial&gt;**](GoogleCloudAiplatformV1Trial.md) | Output only. Trials of the HyperparameterTuningJob. |  [optional] |
|**updateTime** | **String** | Output only. Time when the HyperparameterTuningJob was most recently updated. |  [optional] [readonly] |
|**labels** | **Map&lt;String, String&gt;** | The labels with user-defined metadata to organize HyperparameterTuningJobs. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels. |  [optional] |
|**satisfiesPzs** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |



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



