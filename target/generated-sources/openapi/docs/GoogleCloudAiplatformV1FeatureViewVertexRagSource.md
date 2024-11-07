

# GoogleCloudAiplatformV1FeatureViewVertexRagSource

A Vertex Rag source for features that need to be synced to Online Store.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uri** | **String** | Required. The BigQuery view/table URI that will be materialized on each manual sync trigger. The table/view is expected to have the following columns and types at least: - &#x60;corpus_id&#x60; (STRING, NULLABLE/REQUIRED) - &#x60;file_id&#x60; (STRING, NULLABLE/REQUIRED) - &#x60;chunk_id&#x60; (STRING, NULLABLE/REQUIRED) - &#x60;chunk_data_type&#x60; (STRING, NULLABLE/REQUIRED) - &#x60;chunk_data&#x60; (STRING, NULLABLE/REQUIRED) - &#x60;embeddings&#x60; (FLOAT, REPEATED) - &#x60;file_original_uri&#x60; (STRING, NULLABLE/REQUIRED) |  [optional] |
|**ragCorpusId** | **String** | Optional. The RAG corpus id corresponding to this FeatureView. |  [optional] |



