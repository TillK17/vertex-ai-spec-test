

# GoogleCloudAiplatformV1StudySpec

Represents specification of a Study.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parameters** | [**List&lt;GoogleCloudAiplatformV1StudySpecParameterSpec&gt;**](GoogleCloudAiplatformV1StudySpecParameterSpec.md) | Required. The set of parameters to tune. |  [optional] |
|**decayCurveStoppingSpec** | [**GoogleCloudAiplatformV1StudySpecDecayCurveAutomatedStoppingSpec**](GoogleCloudAiplatformV1StudySpecDecayCurveAutomatedStoppingSpec.md) | The automated early stopping spec using decay curve rule. |  [optional] |
|**observationNoise** | [**ObservationNoiseEnum**](#ObservationNoiseEnum) | The observation noise level of the study. Currently only supported by the Vertex AI Vizier service. Not supported by HyperparameterTuningJob or TrainingPipeline. |  [optional] |
|**measurementSelectionType** | [**MeasurementSelectionTypeEnum**](#MeasurementSelectionTypeEnum) | Describe which measurement selection type will be used |  [optional] |
|**medianAutomatedStoppingSpec** | [**GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec**](GoogleCloudAiplatformV1StudySpecMedianAutomatedStoppingSpec.md) | The automated early stopping spec using median rule. |  [optional] |
|**convexAutomatedStoppingSpec** | [**GoogleCloudAiplatformV1StudySpecConvexAutomatedStoppingSpec**](GoogleCloudAiplatformV1StudySpecConvexAutomatedStoppingSpec.md) | The automated early stopping spec using convex stopping rule. |  [optional] |
|**metrics** | [**List&lt;GoogleCloudAiplatformV1StudySpecMetricSpec&gt;**](GoogleCloudAiplatformV1StudySpecMetricSpec.md) | Required. Metric specs for the Study. |  [optional] |
|**studyStoppingConfig** | [**GoogleCloudAiplatformV1StudySpecStudyStoppingConfig**](GoogleCloudAiplatformV1StudySpecStudyStoppingConfig.md) | Conditions for automated stopping of a Study. Enable automated stopping by configuring at least one condition. |  [optional] |
|**algorithm** | [**AlgorithmEnum**](#AlgorithmEnum) | The search algorithm specified for the Study. |  [optional] |



## Enum: ObservationNoiseEnum

| Name | Value |
|---- | -----|
| OBSERVATION_NOISE_UNSPECIFIED | &quot;OBSERVATION_NOISE_UNSPECIFIED&quot; |
| LOW | &quot;LOW&quot; |
| HIGH | &quot;HIGH&quot; |



## Enum: MeasurementSelectionTypeEnum

| Name | Value |
|---- | -----|
| MEASUREMENT_SELECTION_TYPE_UNSPECIFIED | &quot;MEASUREMENT_SELECTION_TYPE_UNSPECIFIED&quot; |
| LAST_MEASUREMENT | &quot;LAST_MEASUREMENT&quot; |
| BEST_MEASUREMENT | &quot;BEST_MEASUREMENT&quot; |



## Enum: AlgorithmEnum

| Name | Value |
|---- | -----|
| ALGORITHM_UNSPECIFIED | &quot;ALGORITHM_UNSPECIFIED&quot; |
| GRID_SEARCH | &quot;GRID_SEARCH&quot; |
| RANDOM_SEARCH | &quot;RANDOM_SEARCH&quot; |



