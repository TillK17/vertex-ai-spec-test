

# GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec

Value specification for a parameter in `INTEGER` type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxValue** | **String** | Required. Inclusive maximum value of the parameter. |  [optional] |
|**defaultValue** | **String** | A default value for an &#x60;INTEGER&#x60; parameter that is assumed to be a relatively good starting point. Unset value signals that there is no offered starting point. Currently only supported by the Vertex AI Vizier service. Not supported by HyperparameterTuningJob or TrainingPipeline. |  [optional] |
|**minValue** | **String** | Required. Inclusive minimum value of the parameter. |  [optional] |



