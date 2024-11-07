

# GoogleCloudAiplatformV1TrainingPipeline

The TrainingPipeline orchestrates tasks associated with training a Model. It always executes the training task, and optionally may also export data from Vertex AI's Dataset which becomes the training input, upload the Model to Vertex AI, and evaluate the Model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | Required. The user-defined name of this TrainingPipeline. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Output only. The detailed state of the pipeline. |  [optional] [readonly] |
|**labels** | **Map&lt;String, String&gt;** | The labels with user-defined metadata to organize TrainingPipelines. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels. |  [optional] |
|**modelId** | **String** | Optional. The ID to use for the uploaded Model, which will become the final component of the model resource name. This value may be up to 63 characters, and valid characters are &#x60;[a-z0-9_-]&#x60;. The first character cannot be a number or hyphen. |  [optional] |
|**updateTime** | **String** | Output only. Time when the TrainingPipeline was most recently updated. |  [optional] [readonly] |
|**error** | [**GoogleRpcStatus**](GoogleRpcStatus.md) | Output only. Only populated when the pipeline&#39;s state is &#x60;PIPELINE_STATE_FAILED&#x60; or &#x60;PIPELINE_STATE_CANCELLED&#x60;. |  [optional] [readonly] |
|**createTime** | **String** | Output only. Time when the TrainingPipeline was created. |  [optional] [readonly] |
|**trainingTaskMetadata** | **Any** | Output only. The metadata information as specified in the training_task_definition&#39;s &#x60;metadata&#x60;. This metadata is an auxiliary runtime and final information about the training task. While the pipeline is running this information is populated only at a best effort basis. Only present if the pipeline&#39;s training_task_definition contains &#x60;metadata&#x60; object. |  [optional] [readonly] |
|**modelToUpload** | [**GoogleCloudAiplatformV1Model**](GoogleCloudAiplatformV1Model.md) | Describes the Model that may be uploaded (via ModelService.UploadModel) by this TrainingPipeline. The TrainingPipeline&#39;s training_task_definition should make clear whether this Model description should be populated, and if there are any special requirements regarding how it should be filled. If nothing is mentioned in the training_task_definition, then it should be assumed that this field should not be filled and the training task either uploads the Model without a need of this information, or that training task does not support uploading a Model as part of the pipeline. When the Pipeline&#39;s state becomes &#x60;PIPELINE_STATE_SUCCEEDED&#x60; and the trained Model had been uploaded into Vertex AI, then the model_to_upload&#39;s resource name is populated. The Model is always uploaded into the Project and Location in which this pipeline is. |  [optional] |
|**name** | **String** | Output only. Resource name of the TrainingPipeline. |  [optional] [readonly] |
|**encryptionSpec** | [**GoogleCloudAiplatformV1EncryptionSpec**](GoogleCloudAiplatformV1EncryptionSpec.md) | Customer-managed encryption key spec for a TrainingPipeline. If set, this TrainingPipeline will be secured by this key. Note: Model trained by this TrainingPipeline is also secured by this key if model_to_upload is not set separately. |  [optional] |
|**inputDataConfig** | [**GoogleCloudAiplatformV1InputDataConfig**](GoogleCloudAiplatformV1InputDataConfig.md) | Specifies Vertex AI owned input data that may be used for training the Model. The TrainingPipeline&#39;s training_task_definition should make clear whether this config is used and if there are any special requirements on how it should be filled. If nothing about this config is mentioned in the training_task_definition, then it should be assumed that the TrainingPipeline does not depend on this configuration. |  [optional] |
|**startTime** | **String** | Output only. Time when the TrainingPipeline for the first time entered the &#x60;PIPELINE_STATE_RUNNING&#x60; state. |  [optional] [readonly] |
|**trainingTaskDefinition** | **String** | Required. A Google Cloud Storage path to the YAML file that defines the training task which is responsible for producing the model artifact, and may also include additional auxiliary work. The definition files that can be used here are found in gs://google-cloud-aiplatform/schema/trainingjob/definition/. Note: The URI given on output will be immutable and probably different, including the URI scheme, than the one given on input. The output URI will point to a location where the user only has a read access. |  [optional] |
|**endTime** | **String** | Output only. Time when the TrainingPipeline entered any of the following states: &#x60;PIPELINE_STATE_SUCCEEDED&#x60;, &#x60;PIPELINE_STATE_FAILED&#x60;, &#x60;PIPELINE_STATE_CANCELLED&#x60;. |  [optional] [readonly] |
|**parentModel** | **String** | Optional. When specify this field, the &#x60;model_to_upload&#x60; will not be uploaded as a new model, instead, it will become a new version of this &#x60;parent_model&#x60;. |  [optional] |
|**trainingTaskInputs** | **Any** | Required. The training task&#39;s parameter(s), as specified in the training_task_definition&#39;s &#x60;inputs&#x60;. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;PIPELINE_STATE_UNSPECIFIED&quot; |
| QUEUED | &quot;PIPELINE_STATE_QUEUED&quot; |
| PENDING | &quot;PIPELINE_STATE_PENDING&quot; |
| RUNNING | &quot;PIPELINE_STATE_RUNNING&quot; |
| SUCCEEDED | &quot;PIPELINE_STATE_SUCCEEDED&quot; |
| FAILED | &quot;PIPELINE_STATE_FAILED&quot; |
| CANCELLING | &quot;PIPELINE_STATE_CANCELLING&quot; |
| CANCELLED | &quot;PIPELINE_STATE_CANCELLED&quot; |
| PAUSED | &quot;PIPELINE_STATE_PAUSED&quot; |



