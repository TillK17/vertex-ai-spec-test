

# GoogleCloudAiplatformV1GenerateContentResponse

Response message for [PredictionService.GenerateContent].

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**usageMetadata** | [**GoogleCloudAiplatformV1GenerateContentResponseUsageMetadata**](GoogleCloudAiplatformV1GenerateContentResponseUsageMetadata.md) | Usage metadata about the response(s). |  [optional] |
|**candidates** | [**List&lt;GoogleCloudAiplatformV1Candidate&gt;**](GoogleCloudAiplatformV1Candidate.md) | Output only. Generated candidates. |  [optional] |
|**promptFeedback** | [**GoogleCloudAiplatformV1GenerateContentResponsePromptFeedback**](GoogleCloudAiplatformV1GenerateContentResponsePromptFeedback.md) | Output only. Content filter results for a prompt sent in the request. Note: Sent only in the first stream chunk. Only happens when no candidates were generated due to content violations. |  [optional] [readonly] |



