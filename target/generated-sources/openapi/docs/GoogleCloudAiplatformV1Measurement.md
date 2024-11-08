

# GoogleCloudAiplatformV1Measurement

A message representing a Measurement of a Trial. A Measurement contains the Metrics got by executing a Trial using suggested hyperparameter values.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stepCount** | **String** | Output only. The number of steps the machine learning model has been trained for. Must be non-negative. |  [optional] [readonly] |
|**elapsedDuration** | **String** | Output only. Time that the Trial has been running at the point of this Measurement. |  [optional] [readonly] |
|**metrics** | [**List&lt;GoogleCloudAiplatformV1MeasurementMetric&gt;**](GoogleCloudAiplatformV1MeasurementMetric.md) | Output only. A list of metrics got by evaluating the objective functions using suggested Parameter values. |  [optional] |



