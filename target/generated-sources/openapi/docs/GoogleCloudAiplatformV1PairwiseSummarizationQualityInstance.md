

# GoogleCloudAiplatformV1PairwiseSummarizationQualityInstance

Spec for pairwise summarization quality instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reference** | **String** | Optional. Ground truth used to compare against the prediction. |  [optional] |
|**instruction** | **String** | Required. Summarization prompt for LLM. |  [optional] |
|**prediction** | **String** | Required. Output of the candidate model. |  [optional] |
|**context** | **String** | Required. Text to be summarized. |  [optional] |
|**baselinePrediction** | **String** | Required. Output of the baseline model. |  [optional] |



