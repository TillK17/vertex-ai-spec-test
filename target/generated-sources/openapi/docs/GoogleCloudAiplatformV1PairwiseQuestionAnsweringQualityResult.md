

# GoogleCloudAiplatformV1PairwiseQuestionAnsweringQualityResult

Spec for pairwise question answering quality result.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**explanation** | **String** | Output only. Explanation for question answering quality score. |  [optional] [readonly] |
|**confidence** | **Float** | Output only. Confidence for question answering quality score. |  [optional] [readonly] |
|**pairwiseChoice** | [**PairwiseChoiceEnum**](#PairwiseChoiceEnum) | Output only. Pairwise question answering prediction choice. |  [optional] [readonly] |



## Enum: PairwiseChoiceEnum

| Name | Value |
|---- | -----|
| PAIRWISE_CHOICE_UNSPECIFIED | &quot;PAIRWISE_CHOICE_UNSPECIFIED&quot; |
| BASELINE | &quot;BASELINE&quot; |
| CANDIDATE | &quot;CANDIDATE&quot; |
| TIE | &quot;TIE&quot; |



