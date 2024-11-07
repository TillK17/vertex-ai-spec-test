

# GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpec

The spec of multi-trial Neural Architecture Search (NAS).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**multiTrialAlgorithm** | [**MultiTrialAlgorithmEnum**](#MultiTrialAlgorithmEnum) | The multi-trial Neural Architecture Search (NAS) algorithm type. Defaults to &#x60;REINFORCEMENT_LEARNING&#x60;. |  [optional] |
|**trainTrialSpec** | [**GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecTrainTrialSpec**](GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecTrainTrialSpec.md) | Spec for train trials. Top N [TrainTrialSpec.max_parallel_trial_count] search trials will be trained for every M [TrainTrialSpec.frequency] trials searched. |  [optional] |
|**searchTrialSpec** | [**GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecSearchTrialSpec**](GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecSearchTrialSpec.md) | Required. Spec for search trials. |  [optional] |
|**metric** | [**GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecMetricSpec**](GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecMetricSpec.md) | Metric specs for the NAS job. Validation for this field is done at &#x60;multi_trial_algorithm_spec&#x60; field. |  [optional] |



## Enum: MultiTrialAlgorithmEnum

| Name | Value |
|---- | -----|
| MULTI_TRIAL_ALGORITHM_UNSPECIFIED | &quot;MULTI_TRIAL_ALGORITHM_UNSPECIFIED&quot; |
| REINFORCEMENT_LEARNING | &quot;REINFORCEMENT_LEARNING&quot; |
| GRID_SEARCH | &quot;GRID_SEARCH&quot; |



