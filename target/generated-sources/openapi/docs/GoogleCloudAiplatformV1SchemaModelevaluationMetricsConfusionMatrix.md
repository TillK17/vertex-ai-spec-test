

# GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annotationSpecs** | [**List&lt;GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrixAnnotationSpecRef&gt;**](GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrixAnnotationSpecRef.md) | AnnotationSpecs used in the confusion matrix. For AutoML Text Extraction, a special negative AnnotationSpec with empty &#x60;id&#x60; and &#x60;displayName&#x60; of \&quot;NULL\&quot; will be added as the last element. |  [optional] |
|**rows** | **List&lt;List&lt;Any&gt;&gt;** | Rows in the confusion matrix. The number of rows is equal to the size of &#x60;annotationSpecs&#x60;. &#x60;rowsi&#x60; is the number of DataItems that have ground truth of the &#x60;annotationSpecs[i]&#x60; and are predicted as &#x60;annotationSpecs[j]&#x60; by the Model being evaluated. For Text Extraction, when &#x60;annotationSpecs[i]&#x60; is the last element in &#x60;annotationSpecs&#x60;, i.e. the special negative AnnotationSpec, &#x60;rowsi&#x60; is the number of predicted entities of &#x60;annoatationSpec[j]&#x60; that are not labeled as any of the ground truth AnnotationSpec. When annotationSpecs[j] is the special negative AnnotationSpec, &#x60;rowsi&#x60; is the number of entities have ground truth of &#x60;annotationSpec[i]&#x60; that are not predicted as an entity by the Model. The value of the last cell, i.e. &#x60;rowi&#x60; where i &#x3D;&#x3D; j and &#x60;annotationSpec[i]&#x60; is the special negative AnnotationSpec, is always 0. |  [optional] |



