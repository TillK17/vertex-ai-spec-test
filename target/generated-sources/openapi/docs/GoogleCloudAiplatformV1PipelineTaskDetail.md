

# GoogleCloudAiplatformV1PipelineTaskDetail

The runtime detail of a task execution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**executorDetail** | [**GoogleCloudAiplatformV1PipelineTaskExecutorDetail**](GoogleCloudAiplatformV1PipelineTaskExecutorDetail.md) | Output only. The detailed execution info. |  [optional] [readonly] |
|**inputs** | [**Map&lt;String, GoogleCloudAiplatformV1PipelineTaskDetailArtifactList&gt;**](GoogleCloudAiplatformV1PipelineTaskDetailArtifactList.md) | Output only. The runtime input artifacts of the task. |  [optional] [readonly] |
|**execution** | [**GoogleCloudAiplatformV1Execution**](GoogleCloudAiplatformV1Execution.md) | Output only. The execution metadata of the task. |  [optional] [readonly] |
|**pipelineTaskStatus** | [**List&lt;GoogleCloudAiplatformV1PipelineTaskDetailPipelineTaskStatus&gt;**](GoogleCloudAiplatformV1PipelineTaskDetailPipelineTaskStatus.md) | Output only. A list of task status. This field keeps a record of task status evolving over time. |  [optional] |
|**taskName** | **String** | Output only. The user specified name of the task that is defined in pipeline_spec. |  [optional] [readonly] |
|**error** | [**GoogleRpcStatus**](GoogleRpcStatus.md) | Output only. The error that occurred during task execution. Only populated when the task&#39;s state is FAILED or CANCELLED. |  [optional] [readonly] |
|**createTime** | **String** | Output only. Task create time. |  [optional] [readonly] |
|**outputs** | [**Map&lt;String, GoogleCloudAiplatformV1PipelineTaskDetailArtifactList&gt;**](GoogleCloudAiplatformV1PipelineTaskDetailArtifactList.md) | Output only. The runtime output artifacts of the task. |  [optional] [readonly] |
|**endTime** | **String** | Output only. Task end time. |  [optional] [readonly] |
|**parentTaskId** | **String** | Output only. The id of the parent task if the task is within a component scope. Empty if the task is at the root level. |  [optional] [readonly] |
|**state** | [**StateEnum**](#StateEnum) | Output only. State of the task. |  [optional] [readonly] |
|**startTime** | **String** | Output only. Task start time. |  [optional] [readonly] |
|**taskId** | **String** | Output only. The system generated ID of the task. |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| CANCEL_PENDING | &quot;CANCEL_PENDING&quot; |
| CANCELLING | &quot;CANCELLING&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| FAILED | &quot;FAILED&quot; |
| SKIPPED | &quot;SKIPPED&quot; |
| NOT_TRIGGERED | &quot;NOT_TRIGGERED&quot; |



