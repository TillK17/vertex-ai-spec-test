

# GoogleCloudAiplatformV1SchemaModelevaluationMetricsTextSentimentEvaluationMetrics

Model evaluation metrics for text sentiment problems.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**meanAbsoluteError** | **Float** | Mean absolute error. Only set for ModelEvaluations, not for ModelEvaluationSlices. |  [optional] |
|**quadraticKappa** | **Float** | Quadratic weighted kappa. Only set for ModelEvaluations, not for ModelEvaluationSlices. |  [optional] |
|**linearKappa** | **Float** | Linear weighted kappa. Only set for ModelEvaluations, not for ModelEvaluationSlices. |  [optional] |
|**recall** | **Float** | Recall. |  [optional] |
|**meanSquaredError** | **Float** | Mean squared error. Only set for ModelEvaluations, not for ModelEvaluationSlices. |  [optional] |
|**precision** | **Float** | Precision. |  [optional] |
|**f1Score** | **Float** | The harmonic mean of recall and precision. |  [optional] |
|**confusionMatrix** | [**GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix**](GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix.md) | Confusion matrix of the evaluation. Only set for ModelEvaluations, not for ModelEvaluationSlices. |  [optional] |



