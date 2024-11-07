

# GoogleCloudAiplatformV1NasJobSpecMultiTrialAlgorithmSpecTrainTrialSpec

Represent spec for train trials.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**trainTrialJobSpec** | [**GoogleCloudAiplatformV1CustomJobSpec**](GoogleCloudAiplatformV1CustomJobSpec.md) | Required. The spec of a train trial job. The same spec applies to all train trials. |  [optional] |
|**maxParallelTrialCount** | **Integer** | Required. The maximum number of trials to run in parallel. |  [optional] |
|**frequency** | **Integer** | Required. Frequency of search trials to start train stage. Top N [TrainTrialSpec.max_parallel_trial_count] search trials will be trained for every M [TrainTrialSpec.frequency] trials searched. |  [optional] |



