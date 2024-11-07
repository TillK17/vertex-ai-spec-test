

# GoogleCloudAiplatformV1BatchPredictionJob

A job that uses a Model to produce predictions on multiple input instances. If predictions for significant portion of the instances fail, the job may finish without attempting predictions for all remaining instances.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**labels** | **Map&lt;String, String&gt;** | The labels with user-defined metadata to organize BatchPredictionJobs. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels. |  [optional] |
|**generateExplanation** | **Boolean** | Generate explanation with the batch prediction results. When set to &#x60;true&#x60;, the batch prediction output changes based on the &#x60;predictions_format&#x60; field of the BatchPredictionJob.output_config object: * &#x60;bigquery&#x60;: output includes a column named &#x60;explanation&#x60;. The value is a struct that conforms to the Explanation object. * &#x60;jsonl&#x60;: The JSON objects on each line include an additional entry keyed &#x60;explanation&#x60;. The value of the entry is a JSON object that conforms to the Explanation object. * &#x60;csv&#x60;: Generating explanations for CSV format is not supported. If this field is set to true, either the Model.explanation_spec or explanation_spec must be populated. |  [optional] |
|**updateTime** | **String** | Output only. Time when the BatchPredictionJob was most recently updated. |  [optional] [readonly] |
|**state** | [**StateEnum**](#StateEnum) | Output only. The detailed state of the job. |  [optional] [readonly] |
|**startTime** | **String** | Output only. Time when the BatchPredictionJob for the first time entered the &#x60;JOB_STATE_RUNNING&#x60; state. |  [optional] [readonly] |
|**dedicatedResources** | [**GoogleCloudAiplatformV1BatchDedicatedResources**](GoogleCloudAiplatformV1BatchDedicatedResources.md) | The config of resources used by the Model during the batch prediction. If the Model supports DEDICATED_RESOURCES this config may be provided (and the job will use these resources), if the Model doesn&#39;t support AUTOMATIC_RESOURCES, this config must be provided. |  [optional] |
|**satisfiesPzi** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**resourcesConsumed** | [**GoogleCloudAiplatformV1ResourcesConsumed**](GoogleCloudAiplatformV1ResourcesConsumed.md) | Output only. Information about resources that had been consumed by this job. Provided in real time at best effort basis, as well as a final value once the job completes. Note: This field currently may be not populated for batch predictions that use AutoML Models. |  [optional] [readonly] |
|**createTime** | **String** | Output only. Time when the BatchPredictionJob was created. |  [optional] [readonly] |
|**completionStats** | [**GoogleCloudAiplatformV1CompletionStats**](GoogleCloudAiplatformV1CompletionStats.md) | Output only. Statistics on completed and failed prediction instances. |  [optional] [readonly] |
|**explanationSpec** | [**GoogleCloudAiplatformV1ExplanationSpec**](GoogleCloudAiplatformV1ExplanationSpec.md) | Explanation configuration for this BatchPredictionJob. Can be specified only if generate_explanation is set to &#x60;true&#x60;. This value overrides the value of Model.explanation_spec. All fields of explanation_spec are optional in the request. If a field of the explanation_spec object is not populated, the corresponding field of the Model.explanation_spec object is inherited. |  [optional] |
|**error** | [**GoogleRpcStatus**](GoogleRpcStatus.md) | Output only. Only populated when the job&#39;s state is JOB_STATE_FAILED or JOB_STATE_CANCELLED. |  [optional] [readonly] |
|**inputConfig** | [**GoogleCloudAiplatformV1BatchPredictionJobInputConfig**](GoogleCloudAiplatformV1BatchPredictionJobInputConfig.md) | Required. Input configuration of the instances on which predictions are performed. The schema of any single instance may be specified via the Model&#39;s PredictSchemata&#39;s instance_schema_uri. |  [optional] |
|**instanceConfig** | [**GoogleCloudAiplatformV1BatchPredictionJobInstanceConfig**](GoogleCloudAiplatformV1BatchPredictionJobInstanceConfig.md) | Configuration for how to convert batch prediction input instances to the prediction instances that are sent to the Model. |  [optional] |
|**outputConfig** | [**GoogleCloudAiplatformV1BatchPredictionJobOutputConfig**](GoogleCloudAiplatformV1BatchPredictionJobOutputConfig.md) | Required. The Configuration specifying where output predictions should be written. The schema of any single prediction may be specified as a concatenation of Model&#39;s PredictSchemata&#39;s instance_schema_uri and prediction_schema_uri. |  [optional] |
|**encryptionSpec** | [**GoogleCloudAiplatformV1EncryptionSpec**](GoogleCloudAiplatformV1EncryptionSpec.md) | Customer-managed encryption key options for a BatchPredictionJob. If this is set, then all resources created by the BatchPredictionJob will be encrypted with the provided encryption key. |  [optional] |
|**endTime** | **String** | Output only. Time when the BatchPredictionJob entered any of the following states: &#x60;JOB_STATE_SUCCEEDED&#x60;, &#x60;JOB_STATE_FAILED&#x60;, &#x60;JOB_STATE_CANCELLED&#x60;. |  [optional] [readonly] |
|**disableContainerLogging** | **Boolean** | For custom-trained Models and AutoML Tabular Models, the container of the DeployedModel instances will send &#x60;stderr&#x60; and &#x60;stdout&#x60; streams to Cloud Logging by default. Please note that the logs incur cost, which are subject to [Cloud Logging pricing](https://cloud.google.com/logging/pricing). User can disable container logging by setting this flag to true. |  [optional] |
|**displayName** | **String** | Required. The user-defined name of this BatchPredictionJob. |  [optional] |
|**modelParameters** | **Any** | The parameters that govern the predictions. The schema of the parameters may be specified via the Model&#39;s PredictSchemata&#39;s parameters_schema_uri. |  [optional] |
|**serviceAccount** | **String** | The service account that the DeployedModel&#39;s container runs as. If not specified, a system generated one will be used, which has minimal permissions and the custom container, if used, may not have enough permission to access other Google Cloud resources. Users deploying the Model must have the &#x60;iam.serviceAccounts.actAs&#x60; permission on this service account. |  [optional] |
|**partialFailures** | [**List&lt;GoogleRpcStatus&gt;**](GoogleRpcStatus.md) | Output only. Partial failures encountered. For example, single files that can&#39;t be read. This field never exceeds 20 entries. Status details fields contain standard Google Cloud error details. |  [optional] |
|**manualBatchTuningParameters** | [**GoogleCloudAiplatformV1ManualBatchTuningParameters**](GoogleCloudAiplatformV1ManualBatchTuningParameters.md) | Immutable. Parameters configuring the batch behavior. Currently only applicable when dedicated_resources are used (in other cases Vertex AI does the tuning itself). |  [optional] |
|**outputInfo** | [**GoogleCloudAiplatformV1BatchPredictionJobOutputInfo**](GoogleCloudAiplatformV1BatchPredictionJobOutputInfo.md) | Output only. Information further describing the output of this job. |  [optional] [readonly] |
|**name** | **String** | Output only. Resource name of the BatchPredictionJob. |  [optional] [readonly] |
|**unmanagedContainerModel** | [**GoogleCloudAiplatformV1UnmanagedContainerModel**](GoogleCloudAiplatformV1UnmanagedContainerModel.md) | Contains model information necessary to perform batch prediction without requiring uploading to model registry. Exactly one of model and unmanaged_container_model must be set. |  [optional] |
|**model** | **String** | The name of the Model resource that produces the predictions via this job, must share the same ancestor Location. Starting this job has no impact on any existing deployments of the Model and their resources. Exactly one of model and unmanaged_container_model must be set. The model resource name may contain version id or version alias to specify the version. Example: &#x60;projects/{project}/locations/{location}/models/{model}@2&#x60; or &#x60;projects/{project}/locations/{location}/models/{model}@golden&#x60; if no version is specified, the default version will be deployed. The model resource could also be a publisher model. Example: &#x60;publishers/{publisher}/models/{model}&#x60; or &#x60;projects/{project}/locations/{location}/publishers/{publisher}/models/{model}&#x60; |  [optional] |
|**satisfiesPzs** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**modelVersionId** | **String** | Output only. The version ID of the Model that produces the predictions via this job. |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;JOB_STATE_UNSPECIFIED&quot; |
| QUEUED | &quot;JOB_STATE_QUEUED&quot; |
| PENDING | &quot;JOB_STATE_PENDING&quot; |
| RUNNING | &quot;JOB_STATE_RUNNING&quot; |
| SUCCEEDED | &quot;JOB_STATE_SUCCEEDED&quot; |
| FAILED | &quot;JOB_STATE_FAILED&quot; |
| CANCELLING | &quot;JOB_STATE_CANCELLING&quot; |
| CANCELLED | &quot;JOB_STATE_CANCELLED&quot; |
| PAUSED | &quot;JOB_STATE_PAUSED&quot; |
| EXPIRED | &quot;JOB_STATE_EXPIRED&quot; |
| UPDATING | &quot;JOB_STATE_UPDATING&quot; |
| PARTIALLY_SUCCEEDED | &quot;JOB_STATE_PARTIALLY_SUCCEEDED&quot; |



