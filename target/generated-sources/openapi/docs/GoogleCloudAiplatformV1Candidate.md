

# GoogleCloudAiplatformV1Candidate

A response candidate generated from the model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | [**GoogleCloudAiplatformV1Content**](GoogleCloudAiplatformV1Content.md) | Output only. Content parts of the candidate. |  [optional] [readonly] |
|**safetyRatings** | [**List&lt;GoogleCloudAiplatformV1SafetyRating&gt;**](GoogleCloudAiplatformV1SafetyRating.md) | Output only. List of ratings for the safety of a response candidate. There is at most one rating per category. |  [optional] |
|**finishMessage** | **String** | Output only. Describes the reason the mode stopped generating tokens in more detail. This is only filled when &#x60;finish_reason&#x60; is set. |  [optional] [readonly] |
|**index** | **Integer** | Output only. Index of the candidate. |  [optional] [readonly] |
|**citationMetadata** | [**GoogleCloudAiplatformV1CitationMetadata**](GoogleCloudAiplatformV1CitationMetadata.md) | Output only. Source attribution of the generated content. |  [optional] [readonly] |
|**avgLogprobs** | **Double** | Output only. Average log probability score of the candidate. |  [optional] [readonly] |
|**finishReason** | [**FinishReasonEnum**](#FinishReasonEnum) | Output only. The reason why the model stopped generating tokens. If empty, the model has not stopped generating the tokens. |  [optional] [readonly] |
|**groundingMetadata** | [**GoogleCloudAiplatformV1GroundingMetadata**](GoogleCloudAiplatformV1GroundingMetadata.md) | Output only. Metadata specifies sources used to ground generated content. |  [optional] [readonly] |



## Enum: FinishReasonEnum

| Name | Value |
|---- | -----|
| FINISH_REASON_UNSPECIFIED | &quot;FINISH_REASON_UNSPECIFIED&quot; |
| STOP | &quot;STOP&quot; |
| MAX_TOKENS | &quot;MAX_TOKENS&quot; |
| SAFETY | &quot;SAFETY&quot; |
| RECITATION | &quot;RECITATION&quot; |
| OTHER | &quot;OTHER&quot; |
| BLOCKLIST | &quot;BLOCKLIST&quot; |
| PROHIBITED_CONTENT | &quot;PROHIBITED_CONTENT&quot; |
| SPII | &quot;SPII&quot; |
| MALFORMED_FUNCTION_CALL | &quot;MALFORMED_FUNCTION_CALL&quot; |



