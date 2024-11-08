

# GoogleCloudAiplatformV1PipelineTaskExecutorDetailContainerDetail

The detail of a container execution. It contains the job names of the lifecycle of a container execution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**failedPreCachingCheckJobs** | **List&lt;String&gt;** | Output only. The names of the previously failed CustomJob for the pre-caching-check container executions. This job will be available if the PipelineJob.pipeline_spec specifies the &#x60;pre_caching_check&#x60; hook in the lifecycle events. The list includes the all attempts in chronological order. |  [optional] |
|**mainJob** | **String** | Output only. The name of the CustomJob for the main container execution. |  [optional] [readonly] |
|**preCachingCheckJob** | **String** | Output only. The name of the CustomJob for the pre-caching-check container execution. This job will be available if the PipelineJob.pipeline_spec specifies the &#x60;pre_caching_check&#x60; hook in the lifecycle events. |  [optional] [readonly] |
|**failedMainJobs** | **List&lt;String&gt;** | Output only. The names of the previously failed CustomJob for the main container executions. The list includes the all attempts in chronological order. |  [optional] |



