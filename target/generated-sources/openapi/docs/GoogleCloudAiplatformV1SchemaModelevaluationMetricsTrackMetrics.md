

# GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics

UNIMPLEMENTED. Track matching model metrics for a single track match threshold and multiple label match confidence thresholds.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**meanTrackingAveragePrecision** | **Float** | The mean average precision over all confidence thresholds. |  [optional] |
|**iouThreshold** | **Float** | The intersection-over-union threshold value between bounding boxes across frames used to compute this metric entry. |  [optional] |
|**meanMismatchRate** | **Float** | The mean mismatch rate over all confidence thresholds. |  [optional] |
|**confidenceMetrics** | [**List&lt;GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics&gt;**](GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics.md) | Metrics for each label-match &#x60;confidenceThreshold&#x60; from 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99. Precision-recall curve is derived from them. |  [optional] |
|**meanBoundingBoxIou** | **Float** | The mean bounding box iou over all confidence thresholds. |  [optional] |



