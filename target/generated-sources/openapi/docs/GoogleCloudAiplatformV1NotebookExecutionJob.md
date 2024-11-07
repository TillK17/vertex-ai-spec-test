

# GoogleCloudAiplatformV1NotebookExecutionJob

NotebookExecutionJob represents an instance of a notebook execution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scheduleResourceName** | **String** | Output only. The Schedule resource name if this job is triggered by one. Format: &#x60;projects/{project_id}/locations/{location}/schedules/{schedule_id}&#x60; |  [optional] [readonly] |
|**executionTimeout** | **String** | Max running time of the execution job in seconds (default 86400s / 24 hrs). |  [optional] |
|**notebookRuntimeTemplateResourceName** | **String** | The NotebookRuntimeTemplate to source compute configuration from. |  [optional] |
|**createTime** | **String** | Output only. Timestamp when this NotebookExecutionJob was created. |  [optional] [readonly] |
|**labels** | **Map&lt;String, String&gt;** | The labels with user-defined metadata to organize NotebookExecutionJobs. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with \&quot;aiplatform.googleapis.com/\&quot; and are immutable. |  [optional] |
|**directNotebookSource** | [**GoogleCloudAiplatformV1NotebookExecutionJobDirectNotebookSource**](GoogleCloudAiplatformV1NotebookExecutionJobDirectNotebookSource.md) | The contents of an input notebook file. |  [optional] |
|**name** | **String** | Output only. The resource name of this NotebookExecutionJob. Format: &#x60;projects/{project_id}/locations/{location}/notebookExecutionJobs/{job_id}&#x60; |  [optional] [readonly] |
|**displayName** | **String** | The display name of the NotebookExecutionJob. The name can be up to 128 characters long and can consist of any UTF-8 characters. |  [optional] |
|**updateTime** | **String** | Output only. Timestamp when this NotebookExecutionJob was most recently updated. |  [optional] [readonly] |
|**serviceAccount** | **String** | The service account to run the execution as. |  [optional] |
|**status** | [**GoogleRpcStatus**](GoogleRpcStatus.md) | Output only. Populated when the NotebookExecutionJob is completed. When there is an error during notebook execution, the error details are populated. |  [optional] [readonly] |
|**jobState** | [**JobStateEnum**](#JobStateEnum) | Output only. The state of the NotebookExecutionJob. |  [optional] [readonly] |
|**gcsNotebookSource** | [**GoogleCloudAiplatformV1NotebookExecutionJobGcsNotebookSource**](GoogleCloudAiplatformV1NotebookExecutionJobGcsNotebookSource.md) | The Cloud Storage url pointing to the ipynb file. Format: &#x60;gs://bucket/notebook_file.ipynb&#x60; |  [optional] |
|**executionUser** | **String** | The user email to run the execution as. Only supported by Colab runtimes. |  [optional] |
|**gcsOutputUri** | **String** | The Cloud Storage location to upload the result to. Format: &#x60;gs://bucket-name&#x60; |  [optional] |
|**encryptionSpec** | [**GoogleCloudAiplatformV1EncryptionSpec**](GoogleCloudAiplatformV1EncryptionSpec.md) | Customer-managed encryption key spec for the notebook execution job. This field is auto-populated if the NotebookService.NotebookRuntimeTemplate has an encryption spec. |  [optional] |
|**dataformRepositorySource** | [**GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource**](GoogleCloudAiplatformV1NotebookExecutionJobDataformRepositorySource.md) | The Dataform Repository pointing to a single file notebook repository. |  [optional] |



## Enum: JobStateEnum

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



