

# GoogleCloudAiplatformV1Trial

A message representing a Trial. A Trial contains a unique set of Parameters that has been or will be evaluated, along with the objective metrics got by running the Trial.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Output only. The identifier of the Trial assigned by the service. |  [optional] [readonly] |
|**clientId** | **String** | Output only. The identifier of the client that originally requested this Trial. Each client is identified by a unique client_id. When a client asks for a suggestion, Vertex AI Vizier will assign it a Trial. The client should evaluate the Trial, complete it, and report back to Vertex AI Vizier. If suggestion is asked again by same client_id before the Trial is completed, the same Trial will be returned. Multiple clients with different client_ids can ask for suggestions simultaneously, each of them will get their own Trial. |  [optional] [readonly] |
|**name** | **String** | Output only. Resource name of the Trial assigned by the service. |  [optional] [readonly] |
|**customJob** | **String** | Output only. The CustomJob name linked to the Trial. It&#39;s set for a HyperparameterTuningJob&#39;s Trial. |  [optional] [readonly] |
|**finalMeasurement** | [**GoogleCloudAiplatformV1Measurement**](GoogleCloudAiplatformV1Measurement.md) | Output only. The final measurement containing the objective value. |  [optional] [readonly] |
|**startTime** | **String** | Output only. Time when the Trial was started. |  [optional] [readonly] |
|**measurements** | [**List&lt;GoogleCloudAiplatformV1Measurement&gt;**](GoogleCloudAiplatformV1Measurement.md) | Output only. A list of measurements that are strictly lexicographically ordered by their induced tuples (steps, elapsed_duration). These are used for early stopping computations. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Output only. The detailed state of the Trial. |  [optional] [readonly] |
|**endTime** | **String** | Output only. Time when the Trial&#39;s status changed to &#x60;SUCCEEDED&#x60; or &#x60;INFEASIBLE&#x60;. |  [optional] [readonly] |
|**webAccessUris** | **Map&lt;String, String&gt;** | Output only. URIs for accessing [interactive shells](https://cloud.google.com/vertex-ai/docs/training/monitor-debug-interactive-shell) (one URI for each training node). Only available if this trial is part of a HyperparameterTuningJob and the job&#39;s trial_job_spec.enable_web_access field is &#x60;true&#x60;. The keys are names of each node used for the trial; for example, &#x60;workerpool0-0&#x60; for the primary node, &#x60;workerpool1-0&#x60; for the first node in the second worker pool, and &#x60;workerpool1-1&#x60; for the second node in the second worker pool. The values are the URIs for each node&#39;s interactive shell. |  [optional] [readonly] |
|**parameters** | [**List&lt;GoogleCloudAiplatformV1TrialParameter&gt;**](GoogleCloudAiplatformV1TrialParameter.md) | Output only. The parameters of the Trial. |  [optional] |
|**infeasibleReason** | **String** | Output only. A human readable string describing why the Trial is infeasible. This is set only if Trial state is &#x60;INFEASIBLE&#x60;. |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| REQUESTED | &quot;REQUESTED&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| STOPPING | &quot;STOPPING&quot; |
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| INFEASIBLE | &quot;INFEASIBLE&quot; |



