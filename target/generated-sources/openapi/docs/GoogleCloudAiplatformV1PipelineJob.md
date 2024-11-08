

# GoogleCloudAiplatformV1PipelineJob

An instance of a machine learning PipelineJob.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pipelineSpec** | **Map&lt;String, Any&gt;** | The spec of the pipeline. |  [optional] |
|**displayName** | **String** | The display name of the Pipeline. The name can be up to 128 characters long and can consist of any UTF-8 characters. |  [optional] |
|**templateMetadata** | [**GoogleCloudAiplatformV1PipelineTemplateMetadata**](GoogleCloudAiplatformV1PipelineTemplateMetadata.md) | Output only. Pipeline template metadata. Will fill up fields if PipelineJob.template_uri is from supported template registry. |  [optional] [readonly] |
|**network** | **String** | The full name of the Compute Engine [network](/compute/docs/networks-and-firewalls#networks) to which the Pipeline Job&#39;s workload should be peered. For example, &#x60;projects/12345/global/networks/myVPC&#x60;. [Format](/compute/docs/reference/rest/v1/networks/insert) is of the form &#x60;projects/{project}/global/networks/{network}&#x60;. Where {project} is a project number, as in &#x60;12345&#x60;, and {network} is a network name. Private services access must already be configured for the network. Pipeline job will apply the network configuration to the Google Cloud resources being launched, if applied, such as Vertex AI Training or Dataflow job. If left unspecified, the workload is not peered with any network. |  [optional] |
|**preflightValidations** | **Boolean** | Optional. Whether to do component level validations before job creation. |  [optional] |
|**startTime** | **String** | Output only. Pipeline start time. |  [optional] [readonly] |
|**labels** | **Map&lt;String, String&gt;** | The labels with user-defined metadata to organize PipelineJob. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels. Note there is some reserved label key for Vertex AI Pipelines. - &#x60;vertex-ai-pipelines-run-billing-id&#x60;, user set value will get overrided. |  [optional] |
|**createTime** | **String** | Output only. Pipeline creation time. |  [optional] [readonly] |
|**updateTime** | **String** | Output only. Timestamp when this PipelineJob was most recently updated. |  [optional] [readonly] |
|**templateUri** | **String** | A template uri from where the PipelineJob.pipeline_spec, if empty, will be downloaded. Currently, only uri from Vertex Template Registry &amp; Gallery is supported. Reference to https://cloud.google.com/vertex-ai/docs/pipelines/create-pipeline-template. |  [optional] |
|**scheduleName** | **String** | Output only. The schedule resource name. Only returned if the Pipeline is created by Schedule API. |  [optional] [readonly] |
|**name** | **String** | Output only. The resource name of the PipelineJob. |  [optional] [readonly] |
|**error** | [**GoogleRpcStatus**](GoogleRpcStatus.md) | Output only. The error that occurred during pipeline execution. Only populated when the pipeline&#39;s state is FAILED or CANCELLED. |  [optional] [readonly] |
|**endTime** | **String** | Output only. Pipeline end time. |  [optional] [readonly] |
|**state** | [**StateEnum**](#StateEnum) | Output only. The detailed state of the job. |  [optional] [readonly] |
|**jobDetail** | [**GoogleCloudAiplatformV1PipelineJobDetail**](GoogleCloudAiplatformV1PipelineJobDetail.md) | Output only. The details of pipeline run. Not available in the list view. |  [optional] [readonly] |
|**serviceAccount** | **String** | The service account that the pipeline workload runs as. If not specified, the Compute Engine default service account in the project will be used. See https://cloud.google.com/compute/docs/access/service-accounts#default_service_account Users starting the pipeline must have the &#x60;iam.serviceAccounts.actAs&#x60; permission on this service account. |  [optional] |
|**reservedIpRanges** | **List&lt;String&gt;** | A list of names for the reserved ip ranges under the VPC network that can be used for this Pipeline Job&#39;s workload. If set, we will deploy the Pipeline Job&#39;s workload within the provided ip ranges. Otherwise, the job will be deployed to any ip ranges under the provided VPC network. Example: [&#39;vertex-ai-ip-range&#39;]. |  [optional] |
|**encryptionSpec** | [**GoogleCloudAiplatformV1EncryptionSpec**](GoogleCloudAiplatformV1EncryptionSpec.md) | Customer-managed encryption key spec for a pipelineJob. If set, this PipelineJob and all of its sub-resources will be secured by this key. |  [optional] |
|**runtimeConfig** | [**GoogleCloudAiplatformV1PipelineJobRuntimeConfig**](GoogleCloudAiplatformV1PipelineJobRuntimeConfig.md) | Runtime config of the pipeline. |  [optional] |



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



