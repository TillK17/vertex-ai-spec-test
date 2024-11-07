

# GoogleCloudAiplatformV1StudySpecStudyStoppingConfig

The configuration (stopping conditions) for automated stopping of a Study. Conditions include trial budgets, time budgets, and convergence detection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxNumTrials** | **Integer** | If there are more than this many trials, stop the study. |  [optional] |
|**maxNumTrialsNoProgress** | **Integer** | If the objective value has not improved for this many consecutive trials, stop the study. WARNING: Effective only for single-objective studies. |  [optional] |
|**shouldStopAsap** | **Boolean** | If true, a Study enters STOPPING_ASAP whenever it would normally enters STOPPING state. The bottom line is: set to true if you want to interrupt on-going evaluations of Trials as soon as the study stopping condition is met. (Please see Study.State documentation for the source of truth). |  [optional] |
|**maximumRuntimeConstraint** | [**GoogleCloudAiplatformV1StudyTimeConstraint**](GoogleCloudAiplatformV1StudyTimeConstraint.md) | If the specified time or duration has passed, stop the study. |  [optional] |
|**minimumRuntimeConstraint** | [**GoogleCloudAiplatformV1StudyTimeConstraint**](GoogleCloudAiplatformV1StudyTimeConstraint.md) | Each \&quot;stopping rule\&quot; in this proto specifies an \&quot;if\&quot; condition. Before Vizier would generate a new suggestion, it first checks each specified stopping rule, from top to bottom in this list. Note that the first few rules (e.g. minimum_runtime_constraint, min_num_trials) will prevent other stopping rules from being evaluated until they are met. For example, setting &#x60;min_num_trials&#x3D;5&#x60; and &#x60;always_stop_after&#x3D; 1 hour&#x60; means that the Study will ONLY stop after it has 5 COMPLETED trials, even if more than an hour has passed since its creation. It follows the first applicable rule (whose \&quot;if\&quot; condition is satisfied) to make a stopping decision. If none of the specified rules are applicable, then Vizier decides that the study should not stop. If Vizier decides that the study should stop, the study enters STOPPING state (or STOPPING_ASAP if should_stop_asap &#x3D; true). IMPORTANT: The automatic study state transition happens precisely as described above; that is, deleting trials or updating StudyConfig NEVER automatically moves the study state back to ACTIVE. If you want to _resume_ a Study that was stopped, 1) change the stopping conditions if necessary, 2) activate the study, and then 3) ask for suggestions. If the specified time or duration has not passed, do not stop the study. |  [optional] |
|**minNumTrials** | **Integer** | If there are fewer than this many COMPLETED trials, do not stop the study. |  [optional] |
|**maxDurationNoProgress** | **String** | If the objective value has not improved for this much time, stop the study. WARNING: Effective only for single-objective studies. |  [optional] |



