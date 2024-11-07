

# GoogleCloudAiplatformV1SupervisedTuningDataStats

Tuning data statistics for Supervised Tuning.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalTruncatedExampleCount** | **String** | The number of examples in the dataset that have been truncated by any amount. |  [optional] |
|**totalTuningCharacterCount** | **String** | Output only. Number of tuning characters in the tuning dataset. |  [optional] [readonly] |
|**totalBillableTokenCount** | **String** | Output only. Number of billable tokens in the tuning dataset. |  [optional] [readonly] |
|**truncatedExampleIndices** | **List&lt;String&gt;** | A partial sample of the indices (starting from 1) of the truncated examples. |  [optional] |
|**tuningStepCount** | **String** | Output only. Number of tuning steps for this Tuning Job. |  [optional] [readonly] |
|**userMessagePerExampleDistribution** | [**GoogleCloudAiplatformV1SupervisedTuningDatasetDistribution**](GoogleCloudAiplatformV1SupervisedTuningDatasetDistribution.md) | Output only. Dataset distributions for the messages per example. |  [optional] [readonly] |
|**userDatasetExamples** | [**List&lt;GoogleCloudAiplatformV1Content&gt;**](GoogleCloudAiplatformV1Content.md) | Output only. Sample user messages in the training dataset uri. |  [optional] |
|**tuningDatasetExampleCount** | **String** | Output only. Number of examples in the tuning dataset. |  [optional] [readonly] |
|**userOutputTokenDistribution** | [**GoogleCloudAiplatformV1SupervisedTuningDatasetDistribution**](GoogleCloudAiplatformV1SupervisedTuningDatasetDistribution.md) | Output only. Dataset distributions for the user output tokens. |  [optional] [readonly] |
|**totalBillableCharacterCount** | **String** | Output only. Number of billable characters in the tuning dataset. |  [optional] [readonly] |
|**userInputTokenDistribution** | [**GoogleCloudAiplatformV1SupervisedTuningDatasetDistribution**](GoogleCloudAiplatformV1SupervisedTuningDatasetDistribution.md) | Output only. Dataset distributions for the user input tokens. |  [optional] [readonly] |



