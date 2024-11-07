

# GoogleCloudAiplatformV1QuestionAnsweringQualityInstance

Spec for question answering quality instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**context** | **String** | Required. Text to answer the question. |  [optional] |
|**reference** | **String** | Optional. Ground truth used to compare against the prediction. |  [optional] |
|**instruction** | **String** | Required. Question Answering prompt for LLM. |  [optional] |
|**prediction** | **String** | Required. Output of the evaluated model. |  [optional] |



