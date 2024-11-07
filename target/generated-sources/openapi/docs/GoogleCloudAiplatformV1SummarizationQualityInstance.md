

# GoogleCloudAiplatformV1SummarizationQualityInstance

Spec for summarization quality instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instruction** | **String** | Required. Summarization prompt for LLM. |  [optional] |
|**reference** | **String** | Optional. Ground truth used to compare against the prediction. |  [optional] |
|**prediction** | **String** | Required. Output of the evaluated model. |  [optional] |
|**context** | **String** | Required. Text to be summarized. |  [optional] |



