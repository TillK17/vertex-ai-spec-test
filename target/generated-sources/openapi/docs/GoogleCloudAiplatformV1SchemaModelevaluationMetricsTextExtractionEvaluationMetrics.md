

# GoogleCloudAiplatformV1SchemaModelevaluationMetricsTextExtractionEvaluationMetrics

Metrics for text extraction evaluation results.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**confidenceMetrics** | [**List&lt;GoogleCloudAiplatformV1SchemaModelevaluationMetricsTextExtractionEvaluationMetricsConfidenceMetrics&gt;**](GoogleCloudAiplatformV1SchemaModelevaluationMetricsTextExtractionEvaluationMetricsConfidenceMetrics.md) | Metrics that have confidence thresholds. Precision-recall curve can be derived from them. |  [optional] |
|**confusionMatrix** | [**GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix**](GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix.md) | Confusion matrix of the evaluation. Only set for Models where number of AnnotationSpecs is no more than 10. Only set for ModelEvaluations, not for ModelEvaluationSlices. |  [optional] |



