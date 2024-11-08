

# GoogleCloudAiplatformV1Execution

Instance of a general execution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | **String** | The version of the schema in &#x60;schema_title&#x60; to use. Schema title and version is expected to be registered in earlier Create Schema calls. And both are used together as unique identifiers to identify schemas within the local metadata store. |  [optional] |
|**metadata** | **Map&lt;String, Any&gt;** | Properties of the Execution. Top level metadata keys&#39; heading and trailing spaces will be trimmed. The size of this field should not exceed 200KB. |  [optional] |
|**createTime** | **String** | Output only. Timestamp when this Execution was created. |  [optional] [readonly] |
|**labels** | **Map&lt;String, String&gt;** | The labels with user-defined metadata to organize your Executions. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one Execution (System labels are excluded). |  [optional] |
|**name** | **String** | Output only. The resource name of the Execution. |  [optional] [readonly] |
|**updateTime** | **String** | Output only. Timestamp when this Execution was last updated. |  [optional] [readonly] |
|**displayName** | **String** | User provided display name of the Execution. May be up to 128 Unicode characters. |  [optional] |
|**description** | **String** | Description of the Execution |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The state of this Execution. This is a property of the Execution, and does not imply or capture any ongoing process. This property is managed by clients (such as Vertex AI Pipelines) and the system does not prescribe or check the validity of state transitions. |  [optional] |
|**schemaTitle** | **String** | The title of the schema describing the metadata. Schema title and version is expected to be registered in earlier Create Schema calls. And both are used together as unique identifiers to identify schemas within the local metadata store. |  [optional] |
|**etag** | **String** | An eTag used to perform consistent read-modify-write updates. If not set, a blind \&quot;overwrite\&quot; update happens. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| NEW | &quot;NEW&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| FAILED | &quot;FAILED&quot; |
| CACHED | &quot;CACHED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |



