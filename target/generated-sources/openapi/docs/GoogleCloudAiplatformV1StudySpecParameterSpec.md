

# GoogleCloudAiplatformV1StudySpecParameterSpec

Represents a single parameter to optimize.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**discreteValueSpec** | [**GoogleCloudAiplatformV1StudySpecParameterSpecDiscreteValueSpec**](GoogleCloudAiplatformV1StudySpecParameterSpecDiscreteValueSpec.md) | The value spec for a &#39;DISCRETE&#39; parameter. |  [optional] |
|**categoricalValueSpec** | [**GoogleCloudAiplatformV1StudySpecParameterSpecCategoricalValueSpec**](GoogleCloudAiplatformV1StudySpecParameterSpecCategoricalValueSpec.md) | The value spec for a &#39;CATEGORICAL&#39; parameter. |  [optional] |
|**conditionalParameterSpecs** | [**List&lt;GoogleCloudAiplatformV1StudySpecParameterSpecConditionalParameterSpec&gt;**](GoogleCloudAiplatformV1StudySpecParameterSpecConditionalParameterSpec.md) | A conditional parameter node is active if the parameter&#39;s value matches the conditional node&#39;s parent_value_condition. If two items in conditional_parameter_specs have the same name, they must have disjoint parent_value_condition. |  [optional] |
|**scaleType** | [**ScaleTypeEnum**](#ScaleTypeEnum) | How the parameter should be scaled. Leave unset for &#x60;CATEGORICAL&#x60; parameters. |  [optional] |
|**integerValueSpec** | [**GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec**](GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec.md) | The value spec for an &#39;INTEGER&#39; parameter. |  [optional] |
|**parameterId** | **String** | Required. The ID of the parameter. Must not contain whitespaces and must be unique amongst all ParameterSpecs. |  [optional] |
|**doubleValueSpec** | [**GoogleCloudAiplatformV1StudySpecParameterSpecDoubleValueSpec**](GoogleCloudAiplatformV1StudySpecParameterSpecDoubleValueSpec.md) | The value spec for a &#39;DOUBLE&#39; parameter. |  [optional] |



## Enum: ScaleTypeEnum

| Name | Value |
|---- | -----|
| SCALE_TYPE_UNSPECIFIED | &quot;SCALE_TYPE_UNSPECIFIED&quot; |
| UNIT_LINEAR_SCALE | &quot;UNIT_LINEAR_SCALE&quot; |
| UNIT_LOG_SCALE | &quot;UNIT_LOG_SCALE&quot; |
| UNIT_REVERSE_LOG_SCALE | &quot;UNIT_REVERSE_LOG_SCALE&quot; |



