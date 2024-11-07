

# GoogleCloudAiplatformV1PairwiseSummarizationQualityResult

Spec for pairwise summarization quality result.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pairwiseChoice** | [**PairwiseChoiceEnum**](#PairwiseChoiceEnum) | Output only. Pairwise summarization prediction choice. |  [optional] [readonly] |
|**confidence** | **Float** | Output only. Confidence for summarization quality score. |  [optional] [readonly] |
|**explanation** | **String** | Output only. Explanation for summarization quality score. |  [optional] [readonly] |



## Enum: PairwiseChoiceEnum

| Name | Value |
|---- | -----|
| PAIRWISE_CHOICE_UNSPECIFIED | &quot;PAIRWISE_CHOICE_UNSPECIFIED&quot; |
| BASELINE | &quot;BASELINE&quot; |
| CANDIDATE | &quot;CANDIDATE&quot; |
| TIE | &quot;TIE&quot; |



