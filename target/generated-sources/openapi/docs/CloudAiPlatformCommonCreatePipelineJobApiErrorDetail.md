

# CloudAiPlatformCommonCreatePipelineJobApiErrorDetail

Create API error message for Vertex Pipeline. Next Id: 3.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**publicMessage** | **String** | Public messages contains actionable items for the error cause. |  [optional] |
|**errorCause** | [**ErrorCauseEnum**](#ErrorCauseEnum) | The error root cause returned by CreatePipelineJob API. |  [optional] |



## Enum: ErrorCauseEnum

| Name | Value |
|---- | -----|
| ERROR_CAUSE_UNSPECIFIED | &quot;ERROR_CAUSE_UNSPECIFIED&quot; |
| INVALID_PIPELINE_SPEC_FORMAT | &quot;INVALID_PIPELINE_SPEC_FORMAT&quot; |
| INVALID_PIPELINE_SPEC | &quot;INVALID_PIPELINE_SPEC&quot; |
| INVALID_DEPLOYMENT_CONFIG | &quot;INVALID_DEPLOYMENT_CONFIG&quot; |
| INVALID_DEPLOYMENT_SPEC | &quot;INVALID_DEPLOYMENT_SPEC&quot; |
| INVALID_INSTANCE_SCHEMA | &quot;INVALID_INSTANCE_SCHEMA&quot; |
| INVALID_CUSTOM_JOB | &quot;INVALID_CUSTOM_JOB&quot; |
| INVALID_CONTAINER_SPEC | &quot;INVALID_CONTAINER_SPEC&quot; |
| INVALID_NOTIFICATION_EMAIL_SETUP | &quot;INVALID_NOTIFICATION_EMAIL_SETUP&quot; |
| INVALID_SERVICE_ACCOUNT_SETUP | &quot;INVALID_SERVICE_ACCOUNT_SETUP&quot; |
| INVALID_KMS_SETUP | &quot;INVALID_KMS_SETUP&quot; |
| INVALID_NETWORK_SETUP | &quot;INVALID_NETWORK_SETUP&quot; |
| INVALID_PIPELINE_TASK_SPEC | &quot;INVALID_PIPELINE_TASK_SPEC&quot; |
| INVALID_PIPELINE_TASK_ARTIFACT | &quot;INVALID_PIPELINE_TASK_ARTIFACT&quot; |
| INVALID_IMPORTER_SPEC | &quot;INVALID_IMPORTER_SPEC&quot; |
| INVALID_RESOLVER_SPEC | &quot;INVALID_RESOLVER_SPEC&quot; |
| INVALID_RUNTIME_PARAMETERS | &quot;INVALID_RUNTIME_PARAMETERS&quot; |
| CLOUD_API_NOT_ENABLED | &quot;CLOUD_API_NOT_ENABLED&quot; |
| INVALID_GCS_INPUT_URI | &quot;INVALID_GCS_INPUT_URI&quot; |
| INVALID_GCS_OUTPUT_URI | &quot;INVALID_GCS_OUTPUT_URI&quot; |
| INVALID_COMPONENT_SPEC | &quot;INVALID_COMPONENT_SPEC&quot; |
| INVALID_DAG_OUTPUTS_SPEC | &quot;INVALID_DAG_OUTPUTS_SPEC&quot; |
| INVALID_DAG_SPEC | &quot;INVALID_DAG_SPEC&quot; |
| INSUFFICIENT_QUOTA | &quot;INSUFFICIENT_QUOTA&quot; |
| INTERNAL | &quot;INTERNAL&quot; |



