

# GoogleCloudAiplatformV1ModelEvaluation

A collection of metrics calculated by comparing Model's predictions on all of the test data against annotations from the test data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annotationSchemaUri** | **String** | Points to a YAML file stored on Google Cloud Storage describing EvaluatedDataItemView.predictions, EvaluatedDataItemView.ground_truths, EvaluatedAnnotation.predictions, and EvaluatedAnnotation.ground_truths. The schema is defined as an OpenAPI 3.0.2 [Schema Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject). This field is not populated if there are neither EvaluatedDataItemViews nor EvaluatedAnnotations under this ModelEvaluation. |  [optional] |
|**dataItemSchemaUri** | **String** | Points to a YAML file stored on Google Cloud Storage describing EvaluatedDataItemView.data_item_payload and EvaluatedAnnotation.data_item_payload. The schema is defined as an OpenAPI 3.0.2 [Schema Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject). This field is not populated if there are neither EvaluatedDataItemViews nor EvaluatedAnnotations under this ModelEvaluation. |  [optional] |
|**sliceDimensions** | **List&lt;String&gt;** | All possible dimensions of ModelEvaluationSlices. The dimensions can be used as the filter of the ModelService.ListModelEvaluationSlices request, in the form of &#x60;slice.dimension &#x3D; &#x60;. |  [optional] |
|**modelExplanation** | [**GoogleCloudAiplatformV1ModelExplanation**](GoogleCloudAiplatformV1ModelExplanation.md) | Aggregated explanation metrics for the Model&#39;s prediction output over the data this ModelEvaluation uses. This field is populated only if the Model is evaluated with explanations, and only for AutoML tabular Models.  |  [optional] |
|**metrics** | **Any** | Evaluation metrics of the Model. The schema of the metrics is stored in metrics_schema_uri |  [optional] |
|**name** | **String** | Output only. The resource name of the ModelEvaluation. |  [optional] [readonly] |
|**explanationSpecs** | [**List&lt;GoogleCloudAiplatformV1ModelEvaluationModelEvaluationExplanationSpec&gt;**](GoogleCloudAiplatformV1ModelEvaluationModelEvaluationExplanationSpec.md) | Describes the values of ExplanationSpec that are used for explaining the predicted values on the evaluated data. |  [optional] |
|**metadata** | **Any** | The metadata of the ModelEvaluation. For the ModelEvaluation uploaded from Managed Pipeline, metadata contains a structured value with keys of \&quot;pipeline_job_id\&quot;, \&quot;evaluation_dataset_type\&quot;, \&quot;evaluation_dataset_path\&quot;, \&quot;row_based_metrics_path\&quot;. |  [optional] |
|**createTime** | **String** | Output only. Timestamp when this ModelEvaluation was created. |  [optional] [readonly] |
|**displayName** | **String** | The display name of the ModelEvaluation. |  [optional] |
|**metricsSchemaUri** | **String** | Points to a YAML file stored on Google Cloud Storage describing the metrics of this ModelEvaluation. The schema is defined as an OpenAPI 3.0.2 [Schema Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject). |  [optional] |



