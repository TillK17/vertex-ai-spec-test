

# GoogleCloudAiplatformV1ModelEvaluationSliceSlice

Definition of a slice.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sliceSpec** | [**GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpec**](GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpec.md) | Output only. Specification for how the data was sliced. |  [optional] [readonly] |
|**dimension** | **String** | Output only. The dimension of the slice. Well-known dimensions are: * &#x60;annotationSpec&#x60;: This slice is on the test data that has either ground truth or prediction with AnnotationSpec.display_name equals to value. * &#x60;slice&#x60;: This slice is a user customized slice defined by its SliceSpec. |  [optional] [readonly] |
|**value** | **String** | Output only. The value of the dimension in this slice. |  [optional] [readonly] |



