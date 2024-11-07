

# GoogleCloudAiplatformV1SchemaPredictParamsGroundingConfigSourceEntry

Single source entry for the grounding checking.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inlineContext** | **String** | The grounding text passed inline with the Predict API. It can support up to 1 million bytes. |  [optional] |
|**vertexAiSearchDatastore** | **String** | The uri of the Vertex AI Search data source. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the grounding checking source. |  [optional] |
|**enterpriseDatastore** | **String** | The uri of the Vertex AI Search data source. Deprecated. Use vertex_ai_search_datastore instead. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;UNSPECIFIED&quot; |
| WEB | &quot;WEB&quot; |
| ENTERPRISE | &quot;ENTERPRISE&quot; |
| VERTEX_AI_SEARCH | &quot;VERTEX_AI_SEARCH&quot; |
| INLINE | &quot;INLINE&quot; |



