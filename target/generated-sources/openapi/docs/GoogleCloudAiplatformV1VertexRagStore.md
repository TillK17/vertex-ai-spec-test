

# GoogleCloudAiplatformV1VertexRagStore

Retrieve from Vertex RAG Store for grounding.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**similarityTopK** | **Integer** | Optional. Number of top k results to return from the selected corpora. |  [optional] |
|**ragResources** | [**List&lt;GoogleCloudAiplatformV1VertexRagStoreRagResource&gt;**](GoogleCloudAiplatformV1VertexRagStoreRagResource.md) | Optional. The representation of the rag source. It can be used to specify corpus only or ragfiles. Currently only support one corpus or multiple files from one corpus. In the future we may open up multiple corpora support. |  [optional] |
|**vectorDistanceThreshold** | **Double** | Optional. Only return results with vector distance smaller than the threshold. |  [optional] |
|**ragCorpora** | **List&lt;String&gt;** | Optional. Deprecated. Please use rag_resources instead. |  [optional] |



