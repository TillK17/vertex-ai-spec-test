

# GoogleCloudAiplatformV1NotebookRuntimeTemplate

A template that specifies runtime configurations such as machine type, runtime version, network configurations, etc. Multiple runtimes can be created from a runtime template.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serviceAccount** | **String** | The service account that the runtime workload runs as. You can use any service account within the same project, but you must have the service account user permission to use the instance. If not specified, the [Compute Engine default service account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used. |  [optional] |
|**encryptionSpec** | [**GoogleCloudAiplatformV1EncryptionSpec**](GoogleCloudAiplatformV1EncryptionSpec.md) | Customer-managed encryption key spec for the notebook runtime. |  [optional] |
|**name** | **String** | The resource name of the NotebookRuntimeTemplate. |  [optional] |
|**dataPersistentDiskSpec** | [**GoogleCloudAiplatformV1PersistentDiskSpec**](GoogleCloudAiplatformV1PersistentDiskSpec.md) | Optional. The specification of persistent disk attached to the runtime as data disk storage. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | The labels with user-defined metadata to organize the NotebookRuntimeTemplates. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels. |  [optional] |
|**shieldedVmConfig** | [**GoogleCloudAiplatformV1ShieldedVmConfig**](GoogleCloudAiplatformV1ShieldedVmConfig.md) | Optional. Immutable. Runtime Shielded VM spec. |  [optional] |
|**displayName** | **String** | Required. The display name of the NotebookRuntimeTemplate. The name can be up to 128 characters long and can consist of any UTF-8 characters. |  [optional] |
|**networkTags** | **List&lt;String&gt;** | Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/vpc/docs/add-remove-network-tags)). |  [optional] |
|**machineSpec** | [**GoogleCloudAiplatformV1MachineSpec**](GoogleCloudAiplatformV1MachineSpec.md) | Optional. Immutable. The specification of a single machine for the template. |  [optional] |
|**description** | **String** | The description of the NotebookRuntimeTemplate. |  [optional] |
|**networkSpec** | [**GoogleCloudAiplatformV1NetworkSpec**](GoogleCloudAiplatformV1NetworkSpec.md) | Optional. Network spec. |  [optional] |
|**updateTime** | **String** | Output only. Timestamp when this NotebookRuntimeTemplate was most recently updated. |  [optional] [readonly] |
|**idleShutdownConfig** | [**GoogleCloudAiplatformV1NotebookIdleShutdownConfig**](GoogleCloudAiplatformV1NotebookIdleShutdownConfig.md) | The idle shutdown configuration of NotebookRuntimeTemplate. This config will only be set when idle shutdown is enabled. |  [optional] |
|**notebookRuntimeType** | [**NotebookRuntimeTypeEnum**](#NotebookRuntimeTypeEnum) | Optional. Immutable. The type of the notebook runtime template. |  [optional] |
|**isDefault** | **Boolean** | Output only. The default template to use if not specified. |  [optional] [readonly] |
|**etag** | **String** | Used to perform consistent read-modify-write updates. If not set, a blind \&quot;overwrite\&quot; update happens. |  [optional] |
|**eucConfig** | [**GoogleCloudAiplatformV1NotebookEucConfig**](GoogleCloudAiplatformV1NotebookEucConfig.md) | EUC configuration of the NotebookRuntimeTemplate. |  [optional] |
|**createTime** | **String** | Output only. Timestamp when this NotebookRuntimeTemplate was created. |  [optional] [readonly] |



## Enum: NotebookRuntimeTypeEnum

| Name | Value |
|---- | -----|
| NOTEBOOK_RUNTIME_TYPE_UNSPECIFIED | &quot;NOTEBOOK_RUNTIME_TYPE_UNSPECIFIED&quot; |
| USER_DEFINED | &quot;USER_DEFINED&quot; |
| ONE_CLICK | &quot;ONE_CLICK&quot; |



