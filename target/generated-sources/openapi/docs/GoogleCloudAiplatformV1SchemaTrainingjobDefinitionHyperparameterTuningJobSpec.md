

# GoogleCloudAiplatformV1SchemaTrainingjobDefinitionHyperparameterTuningJobSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**trialJobSpec** | [**GoogleCloudAiplatformV1CustomJobSpec**](GoogleCloudAiplatformV1CustomJobSpec.md) | The spec of a trial job. The same spec applies to the CustomJobs created in all the trials. |  [optional] |
|**maxTrialCount** | **Integer** | The desired total number of Trials. |  [optional] |
|**parallelTrialCount** | **Integer** | The desired number of Trials to run in parallel. |  [optional] |
|**studySpec** | [**GoogleCloudAiplatformV1StudySpec**](GoogleCloudAiplatformV1StudySpec.md) | Study configuration of the HyperparameterTuningJob. |  [optional] |
|**maxFailedTrialCount** | **Integer** | The number of failed Trials that need to be seen before failing the HyperparameterTuningJob. If set to 0, Vertex AI decides how many Trials must fail before the whole job fails. |  [optional] |



