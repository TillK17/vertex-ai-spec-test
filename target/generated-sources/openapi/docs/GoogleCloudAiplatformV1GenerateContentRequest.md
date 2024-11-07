

# GoogleCloudAiplatformV1GenerateContentRequest

Request message for [PredictionService.GenerateContent].

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**generationConfig** | [**GoogleCloudAiplatformV1GenerationConfig**](GoogleCloudAiplatformV1GenerationConfig.md) | Optional. Generation config. |  [optional] |
|**contents** | [**List&lt;GoogleCloudAiplatformV1Content&gt;**](GoogleCloudAiplatformV1Content.md) | Required. The content of the current conversation with the model. For single-turn queries, this is a single instance. For multi-turn queries, this is a repeated field that contains conversation history + latest request. |  [optional] |
|**safetySettings** | [**List&lt;GoogleCloudAiplatformV1SafetySetting&gt;**](GoogleCloudAiplatformV1SafetySetting.md) | Optional. Per request settings for blocking unsafe content. Enforced on GenerateContentResponse.candidates. |  [optional] |
|**toolConfig** | [**GoogleCloudAiplatformV1ToolConfig**](GoogleCloudAiplatformV1ToolConfig.md) | Optional. Tool config. This config is shared for all tools provided in the request. |  [optional] |
|**tools** | [**List&lt;GoogleCloudAiplatformV1Tool&gt;**](GoogleCloudAiplatformV1Tool.md) | Optional. A list of &#x60;Tools&#x60; the model may use to generate the next response. A &#x60;Tool&#x60; is a piece of code that enables the system to interact with external systems to perform an action, or set of actions, outside of knowledge and scope of the model. |  [optional] |
|**systemInstruction** | [**GoogleCloudAiplatformV1Content**](GoogleCloudAiplatformV1Content.md) | Optional. The user provided system instructions for the model. Note: only text should be used in parts and content in each part will be in a separate paragraph. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Optional. The labels with user-defined metadata for the request. It is used for billing and reporting only. Label keys and values can be no longer than 63 characters (Unicode codepoints) and can only contain lowercase letters, numeric characters, underscores, and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter. |  [optional] |



