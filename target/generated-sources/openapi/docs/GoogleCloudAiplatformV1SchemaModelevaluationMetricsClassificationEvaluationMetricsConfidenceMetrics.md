

# GoogleCloudAiplatformV1SchemaModelevaluationMetricsClassificationEvaluationMetricsConfidenceMetrics


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**truePositiveCount** | **String** | The number of Model created labels that match a ground truth label. |  [optional] |
|**precision** | **Float** | Precision for the given confidence threshold. |  [optional] |
|**maxPredictions** | **Integer** | Metrics are computed with an assumption that the Model always returns at most this many predictions (ordered by their score, descendingly), but they all still need to meet the &#x60;confidenceThreshold&#x60;. |  [optional] |
|**recall** | **Float** | Recall (True Positive Rate) for the given confidence threshold. |  [optional] |
|**falsePositiveRate** | **Float** | False Positive Rate for the given confidence threshold. |  [optional] |
|**f1ScoreMicro** | **Float** | Micro-averaged F1 Score. |  [optional] |
|**confidenceThreshold** | **Float** | Metrics are computed with an assumption that the Model never returns predictions with score lower than this value. |  [optional] |
|**falsePositiveCount** | **String** | The number of Model created labels that do not match a ground truth label. |  [optional] |
|**confusionMatrix** | [**GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix**](GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix.md) | Confusion matrix of the evaluation for this confidence_threshold. |  [optional] |
|**falsePositiveRateAt1** | **Float** | The False Positive Rate when only considering the label that has the highest prediction score and not below the confidence threshold for each DataItem. |  [optional] |
|**f1ScoreMacro** | **Float** | Macro-averaged F1 Score. |  [optional] |
|**f1Score** | **Float** | The harmonic mean of recall and precision. For summary metrics, it computes the micro-averaged F1 score. |  [optional] |
|**recallAt1** | **Float** | The Recall (True Positive Rate) when only considering the label that has the highest prediction score and not below the confidence threshold for each DataItem. |  [optional] |
|**precisionAt1** | **Float** | The precision when only considering the label that has the highest prediction score and not below the confidence threshold for each DataItem. |  [optional] |
|**falseNegativeCount** | **String** | The number of ground truth labels that are not matched by a Model created label. |  [optional] |
|**f1ScoreAt1** | **Float** | The harmonic mean of recallAt1 and precisionAt1. |  [optional] |
|**trueNegativeCount** | **String** | The number of labels that were not created by the Model, but if they would, they would not match a ground truth label. |  [optional] |



