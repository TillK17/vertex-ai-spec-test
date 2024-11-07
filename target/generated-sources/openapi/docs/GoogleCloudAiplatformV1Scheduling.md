

# GoogleCloudAiplatformV1Scheduling

All parameters related to queuing and scheduling of custom jobs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**restartJobOnWorkerRestart** | **Boolean** | Restarts the entire CustomJob if a worker gets restarted. This feature can be used by distributed training jobs that are not resilient to workers leaving and joining a job. |  [optional] |
|**timeout** | **String** | The maximum job running time. The default is 7 days. |  [optional] |
|**strategy** | [**StrategyEnum**](#StrategyEnum) | Optional. This determines which type of scheduling strategy to use. |  [optional] |
|**disableRetries** | **Boolean** | Optional. Indicates if the job should retry for internal errors after the job starts running. If true, overrides &#x60;Scheduling.restart_job_on_worker_restart&#x60; to false. |  [optional] |
|**maxWaitDuration** | **String** | Optional. This is the maximum duration that a job will wait for the requested resources to be provisioned if the scheduling strategy is set to [Strategy.DWS_FLEX_START]. If set to 0, the job will wait indefinitely. The default is 24 hours. |  [optional] |



## Enum: StrategyEnum

| Name | Value |
|---- | -----|
| STRATEGY_UNSPECIFIED | &quot;STRATEGY_UNSPECIFIED&quot; |
| ON_DEMAND | &quot;ON_DEMAND&quot; |
| LOW_COST | &quot;LOW_COST&quot; |
| STANDARD | &quot;STANDARD&quot; |
| SPOT | &quot;SPOT&quot; |
| FLEX_START | &quot;FLEX_START&quot; |



