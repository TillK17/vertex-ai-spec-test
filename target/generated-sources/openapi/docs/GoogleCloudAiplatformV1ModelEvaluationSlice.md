

# GoogleCloudAiplatformV1ModelEvaluationSlice

A collection of metrics calculated by comparing Model's predictions on a slice of the test data against ground truth annotations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metrics** | **Any** | Output only. Sliced evaluation metrics of the Model. The schema of the metrics is stored in metrics_schema_uri |  [optional] [readonly] |
|**createTime** | **String** | Output only. Timestamp when this ModelEvaluationSlice was created. |  [optional] [readonly] |
|**metricsSchemaUri** | **String** | Output only. Points to a YAML file stored on Google Cloud Storage describing the metrics of this ModelEvaluationSlice. The schema is defined as an OpenAPI 3.0.2 [Schema Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject). |  [optional] [readonly] |
|**name** | **String** | Output only. The resource name of the ModelEvaluationSlice. |  [optional] [readonly] |
|**modelExplanation** | [**GoogleCloudAiplatformV1ModelExplanation**](GoogleCloudAiplatformV1ModelExplanation.md) | Output only. Aggregated explanation metrics for the Model&#39;s prediction output over the data this ModelEvaluation uses. This field is populated only if the Model is evaluated with explanations, and only for tabular Models. |  [optional] [readonly] |
|**slice** | [**GoogleCloudAiplatformV1ModelEvaluationSliceSlice**](GoogleCloudAiplatformV1ModelEvaluationSliceSlice.md) | Output only. The slice of the test data that is used to evaluate the Model. |  [optional] [readonly] |



