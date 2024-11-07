

# GoogleCloudAiplatformV1SchemaModelevaluationMetricsPairwiseTextGenerationEvaluationMetrics

Metrics for general pairwise text generation evaluation results.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**humanPreferenceModelWinRate** | **Float** | Percentage of time humans decided the model had the better response. |  [optional] |
|**precision** | **Float** | Fraction of cases where the autorater and humans thought the model had a better response out of all cases where the autorater thought the model had a better response. True positive divided by all positive. |  [optional] |
|**falsePositiveCount** | **String** | Number of examples where the autorater chose the model, but humans preferred the baseline model. |  [optional] |
|**trueNegativeCount** | **String** | Number of examples where both the autorater and humans decided that the model had the worse response. |  [optional] |
|**modelWinRate** | **Float** | Percentage of time the autorater decided the model had the better response. |  [optional] |
|**humanPreferenceBaselineModelWinRate** | **Float** | Percentage of time humans decided the baseline model had the better response. |  [optional] |
|**f1Score** | **Float** | Harmonic mean of precision and recall. |  [optional] |
|**accuracy** | **Float** | Fraction of cases where the autorater agreed with the human raters. |  [optional] |
|**baselineModelWinRate** | **Float** | Percentage of time the autorater decided the baseline model had the better response. |  [optional] |
|**recall** | **Float** | Fraction of cases where the autorater and humans thought the model had a better response out of all cases where the humans thought the model had a better response. |  [optional] |
|**cohensKappa** | **Float** | A measurement of agreement between the autorater and human raters that takes the likelihood of random agreement into account. |  [optional] |
|**truePositiveCount** | **String** | Number of examples where both the autorater and humans decided that the model had the better response. |  [optional] |
|**falseNegativeCount** | **String** | Number of examples where the autorater chose the baseline model, but humans preferred the model. |  [optional] |



