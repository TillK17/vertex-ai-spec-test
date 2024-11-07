

# GoogleCloudAiplatformV1ActiveLearningConfig

Parameters that configure the active learning pipeline. Active learning will label the data incrementally by several iterations. For every iteration, it will select a batch of data based on the sampling strategy.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxDataItemPercentage** | **Integer** | Max percent of total DataItems for human labeling. |  [optional] |
|**trainingConfig** | [**GoogleCloudAiplatformV1TrainingConfig**](GoogleCloudAiplatformV1TrainingConfig.md) | CMLE training config. For every active learning labeling iteration, system will train a machine learning model on CMLE. The trained model will be used by data sampling algorithm to select DataItems. |  [optional] |
|**maxDataItemCount** | **String** | Max number of human labeled DataItems. |  [optional] |
|**sampleConfig** | [**GoogleCloudAiplatformV1SampleConfig**](GoogleCloudAiplatformV1SampleConfig.md) | Active learning data sampling config. For every active learning labeling iteration, it will select a batch of data based on the sampling strategy. |  [optional] |



