

# GoogleCloudAiplatformV1ServiceAccountSpec

Configuration for the use of custom service account to run the workloads.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serviceAccount** | **String** | Optional. Required when all below conditions are met * &#x60;enable_custom_service_account&#x60; is true; * any runtime is specified via &#x60;ResourceRuntimeSpec&#x60; on creation time, for example, Ray The users must have &#x60;iam.serviceAccounts.actAs&#x60; permission on this service account and then the specified runtime containers will run as it. Do not set this field if you want to submit jobs using custom service account to this PersistentResource after creation, but only specify the &#x60;service_account&#x60; inside the job. |  [optional] |
|**enableCustomServiceAccount** | **Boolean** | Required. If true, custom user-managed service account is enforced to run any workloads (for example, Vertex Jobs) on the resource. Otherwise, uses the [Vertex AI Custom Code Service Agent](https://cloud.google.com/vertex-ai/docs/general/access-control#service-agents). |  [optional] |



