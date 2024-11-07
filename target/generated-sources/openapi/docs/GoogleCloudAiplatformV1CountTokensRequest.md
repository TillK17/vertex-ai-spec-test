

# GoogleCloudAiplatformV1CountTokensRequest

Request message for PredictionService.CountTokens.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**systemInstruction** | [**GoogleCloudAiplatformV1Content**](GoogleCloudAiplatformV1Content.md) | Optional. The user provided system instructions for the model. Note: only text should be used in parts and content in each part will be in a separate paragraph. |  [optional] |
|**generationConfig** | [**GoogleCloudAiplatformV1GenerationConfig**](GoogleCloudAiplatformV1GenerationConfig.md) | Optional. Generation config that the model will use to generate the response. |  [optional] |
|**contents** | [**List&lt;GoogleCloudAiplatformV1Content&gt;**](GoogleCloudAiplatformV1Content.md) | Optional. Input content. |  [optional] |
|**tools** | [**List&lt;GoogleCloudAiplatformV1Tool&gt;**](GoogleCloudAiplatformV1Tool.md) | Optional. A list of &#x60;Tools&#x60; the model may use to generate the next response. A &#x60;Tool&#x60; is a piece of code that enables the system to interact with external systems to perform an action, or set of actions, outside of knowledge and scope of the model. |  [optional] |
|**model** | **String** | Optional. The name of the publisher model requested to serve the prediction. Format: &#x60;projects/{project}/locations/{location}/publishers/_*_/models/_*&#x60; |  [optional] |
|**instances** | **List&lt;Any&gt;** | Optional. The instances that are the input to token counting call. Schema is identical to the prediction schema of the underlying model. |  [optional] |



