

# GoogleCloudAiplatformV1StreamingPredictRequest

Request message for PredictionService.StreamingPredict. The first message must contain endpoint field and optionally input. The subsequent messages must contain input.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parameters** | [**GoogleCloudAiplatformV1Tensor**](GoogleCloudAiplatformV1Tensor.md) | The parameters that govern the prediction. |  [optional] |
|**inputs** | [**List&lt;GoogleCloudAiplatformV1Tensor&gt;**](GoogleCloudAiplatformV1Tensor.md) | The prediction input. |  [optional] |



