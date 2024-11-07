

# GoogleCloudAiplatformV1PairwiseQuestionAnsweringQualityInstance

Spec for pairwise question answering quality instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baselinePrediction** | **String** | Required. Output of the baseline model. |  [optional] |
|**instruction** | **String** | Required. Question Answering prompt for LLM. |  [optional] |
|**context** | **String** | Required. Text to answer the question. |  [optional] |
|**reference** | **String** | Optional. Ground truth used to compare against the prediction. |  [optional] |
|**prediction** | **String** | Required. Output of the candidate model. |  [optional] |



