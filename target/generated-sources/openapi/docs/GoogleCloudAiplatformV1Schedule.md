

# GoogleCloudAiplatformV1Schedule

An instance of a Schedule periodically schedules runs to make API calls based on user specified time specification and API request type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastPauseTime** | **String** | Output only. Timestamp when this Schedule was last paused. Unset if never paused. |  [optional] [readonly] |
|**displayName** | **String** | Required. User provided name of the Schedule. The name can be up to 128 characters long and can consist of any UTF-8 characters. |  [optional] |
|**nextRunTime** | **String** | Output only. Timestamp when this Schedule should schedule the next run. Having a next_run_time in the past means the runs are being started behind schedule. |  [optional] [readonly] |
|**lastScheduledRunResponse** | [**GoogleCloudAiplatformV1ScheduleRunResponse**](GoogleCloudAiplatformV1ScheduleRunResponse.md) | Output only. Response of the last scheduled run. This is the response for starting the scheduled requests and not the execution of the operations/jobs created by the requests (if applicable). Unset if no run has been scheduled yet. |  [optional] [readonly] |
|**allowQueueing** | **Boolean** | Optional. Whether new scheduled runs can be queued when max_concurrent_runs limit is reached. If set to true, new runs will be queued instead of skipped. Default to false. |  [optional] |
|**createTime** | **String** | Output only. Timestamp when this Schedule was created. |  [optional] [readonly] |
|**startedRunCount** | **String** | Output only. The number of runs started by this schedule. |  [optional] [readonly] |
|**lastResumeTime** | **String** | Output only. Timestamp when this Schedule was last resumed. Unset if never resumed from pause. |  [optional] [readonly] |
|**cron** | **String** | Cron schedule (https://en.wikipedia.org/wiki/Cron) to launch scheduled runs. To explicitly set a timezone to the cron tab, apply a prefix in the cron tab: \&quot;CRON_TZ&#x3D;${IANA_TIME_ZONE}\&quot; or \&quot;TZ&#x3D;${IANA_TIME_ZONE}\&quot;. The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone database. For example, \&quot;CRON_TZ&#x3D;America/New_York 1 * * * *\&quot;, or \&quot;TZ&#x3D;America/New_York 1 * * * *\&quot;. |  [optional] |
|**endTime** | **String** | Optional. Timestamp after which no new runs can be scheduled. If specified, The schedule will be completed when either end_time is reached or when scheduled_run_count &gt;&#x3D; max_run_count. If not specified, new runs will keep getting scheduled until this Schedule is paused or deleted. Already scheduled runs will be allowed to complete. Unset if not specified. |  [optional] |
|**createNotebookExecutionJobRequest** | [**GoogleCloudAiplatformV1CreateNotebookExecutionJobRequest**](GoogleCloudAiplatformV1CreateNotebookExecutionJobRequest.md) | Request for NotebookService.CreateNotebookExecutionJob. |  [optional] |
|**catchUp** | **Boolean** | Output only. Whether to backfill missed runs when the schedule is resumed from PAUSED state. If set to true, all missed runs will be scheduled. New runs will be scheduled after the backfill is complete. Default to false. |  [optional] [readonly] |
|**maxConcurrentRunCount** | **String** | Required. Maximum number of runs that can be started concurrently for this Schedule. This is the limit for starting the scheduled requests and not the execution of the operations/jobs created by the requests (if applicable). |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Output only. The state of this Schedule. |  [optional] [readonly] |
|**maxRunCount** | **String** | Optional. Maximum run count of the schedule. If specified, The schedule will be completed when either started_run_count &gt;&#x3D; max_run_count or when end_time is reached. If not specified, new runs will keep getting scheduled until this Schedule is paused or deleted. Already scheduled runs will be allowed to complete. Unset if not specified. |  [optional] |
|**startTime** | **String** | Optional. Timestamp after which the first run can be scheduled. Default to Schedule create time if not specified. |  [optional] |
|**name** | **String** | Immutable. The resource name of the Schedule. |  [optional] |
|**createPipelineJobRequest** | [**GoogleCloudAiplatformV1CreatePipelineJobRequest**](GoogleCloudAiplatformV1CreatePipelineJobRequest.md) | Request for PipelineService.CreatePipelineJob. CreatePipelineJobRequest.parent field is required (format: projects/{project}/locations/{location}). |  [optional] |
|**updateTime** | **String** | Output only. Timestamp when this Schedule was updated. |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| PAUSED | &quot;PAUSED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |



