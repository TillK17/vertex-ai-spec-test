

# GoogleCloudAiplatformV1StudySpecParameterSpecConditionalParameterSpec

Represents a parameter spec with condition from its parent parameter.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parentCategoricalValues** | [**GoogleCloudAiplatformV1StudySpecParameterSpecConditionalParameterSpecCategoricalValueCondition**](GoogleCloudAiplatformV1StudySpecParameterSpecConditionalParameterSpecCategoricalValueCondition.md) | The spec for matching values from a parent parameter of &#x60;CATEGORICAL&#x60; type. |  [optional] |
|**parentDiscreteValues** | [**GoogleCloudAiplatformV1StudySpecParameterSpecConditionalParameterSpecDiscreteValueCondition**](GoogleCloudAiplatformV1StudySpecParameterSpecConditionalParameterSpecDiscreteValueCondition.md) | The spec for matching values from a parent parameter of &#x60;DISCRETE&#x60; type. |  [optional] |
|**parameterSpec** | [**GoogleCloudAiplatformV1StudySpecParameterSpec**](GoogleCloudAiplatformV1StudySpecParameterSpec.md) | Required. The spec for a conditional parameter. |  [optional] |
|**parentIntValues** | [**GoogleCloudAiplatformV1StudySpecParameterSpecConditionalParameterSpecIntValueCondition**](GoogleCloudAiplatformV1StudySpecParameterSpecConditionalParameterSpecIntValueCondition.md) | The spec for matching values from a parent parameter of &#x60;INTEGER&#x60; type. |  [optional] |



