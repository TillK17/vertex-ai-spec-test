

# GoogleCloudAiplatformV1QuestionAnsweringCorrectnessInstance

Spec for question answering correctness instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reference** | **String** | Optional. Ground truth used to compare against the prediction. |  [optional] |
|**prediction** | **String** | Required. Output of the evaluated model. |  [optional] |
|**context** | **String** | Optional. Text provided as context to answer the question. |  [optional] |
|**instruction** | **String** | Required. The question asked and other instruction in the inference prompt. |  [optional] |



