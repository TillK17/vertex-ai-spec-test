

# GoogleCloudAiplatformV1PersistentResource

Represents long-lasting resources that are dedicated to users to runs custom workloads. A PersistentResource can have multiple node pools and each node pool can have its own machine spec.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | [**StateEnum**](#StateEnum) | Output only. The detailed state of a Study. |  [optional] [readonly] |
|**encryptionSpec** | [**GoogleCloudAiplatformV1EncryptionSpec**](GoogleCloudAiplatformV1EncryptionSpec.md) | Optional. Customer-managed encryption key spec for a PersistentResource. If set, this PersistentResource and all sub-resources of this PersistentResource will be secured by this key. |  [optional] |
|**satisfiesPzs** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**error** | [**GoogleRpcStatus**](GoogleRpcStatus.md) | Output only. Only populated when persistent resource&#39;s state is &#x60;STOPPING&#x60; or &#x60;ERROR&#x60;. |  [optional] [readonly] |
|**satisfiesPzi** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**createTime** | **String** | Output only. Time when the PersistentResource was created. |  [optional] [readonly] |
|**labels** | **Map&lt;String, String&gt;** | Optional. The labels with user-defined metadata to organize PersistentResource. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels. |  [optional] |
|**startTime** | **String** | Output only. Time when the PersistentResource for the first time entered the &#x60;RUNNING&#x60; state. |  [optional] [readonly] |
|**resourceRuntimeSpec** | [**GoogleCloudAiplatformV1ResourceRuntimeSpec**](GoogleCloudAiplatformV1ResourceRuntimeSpec.md) | Optional. Persistent Resource runtime spec. For example, used for Ray cluster configuration. |  [optional] |
|**name** | **String** | Immutable. Resource name of a PersistentResource. |  [optional] |
|**reservedIpRanges** | **List&lt;String&gt;** | Optional. A list of names for the reserved IP ranges under the VPC network that can be used for this persistent resource. If set, we will deploy the persistent resource within the provided IP ranges. Otherwise, the persistent resource is deployed to any IP ranges under the provided VPC network. Example: [&#39;vertex-ai-ip-range&#39;]. |  [optional] |
|**network** | **String** | Optional. The full name of the Compute Engine [network](/compute/docs/networks-and-firewalls#networks) to peered with Vertex AI to host the persistent resources. For example, &#x60;projects/12345/global/networks/myVPC&#x60;. [Format](/compute/docs/reference/rest/v1/networks/insert) is of the form &#x60;projects/{project}/global/networks/{network}&#x60;. Where {project} is a project number, as in &#x60;12345&#x60;, and {network} is a network name. To specify this field, you must have already [configured VPC Network Peering for Vertex AI](https://cloud.google.com/vertex-ai/docs/general/vpc-peering). If this field is left unspecified, the resources aren&#39;t peered with any network. |  [optional] |
|**resourcePools** | [**List&lt;GoogleCloudAiplatformV1ResourcePool&gt;**](GoogleCloudAiplatformV1ResourcePool.md) | Required. The spec of the pools of different resources. |  [optional] |
|**displayName** | **String** | Optional. The display name of the PersistentResource. The name can be up to 128 characters long and can consist of any UTF-8 characters. |  [optional] |
|**resourceRuntime** | [**GoogleCloudAiplatformV1ResourceRuntime**](GoogleCloudAiplatformV1ResourceRuntime.md) | Output only. Runtime information of the Persistent Resource. |  [optional] [readonly] |
|**updateTime** | **String** | Output only. Time when the PersistentResource was most recently updated. |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| PROVISIONING | &quot;PROVISIONING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| STOPPING | &quot;STOPPING&quot; |
| ERROR | &quot;ERROR&quot; |
| REBOOTING | &quot;REBOOTING&quot; |
| UPDATING | &quot;UPDATING&quot; |



