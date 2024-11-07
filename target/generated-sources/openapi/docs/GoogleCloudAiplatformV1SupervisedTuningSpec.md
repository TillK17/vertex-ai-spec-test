

# GoogleCloudAiplatformV1SupervisedTuningSpec

Tuning Spec for Supervised Tuning for first party models.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hyperParameters** | [**GoogleCloudAiplatformV1SupervisedHyperParameters**](GoogleCloudAiplatformV1SupervisedHyperParameters.md) | Optional. Hyperparameters for SFT. |  [optional] |
|**validationDatasetUri** | **String** | Optional. Cloud Storage path to file containing validation dataset for tuning. The dataset must be formatted as a JSONL file. |  [optional] |
|**trainingDatasetUri** | **String** | Required. Cloud Storage path to file containing training dataset for tuning. The dataset must be formatted as a JSONL file. |  [optional] |



