

# GoogleCloudAiplatformV1GroundingSupport

Grounding support.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**confidenceScores** | **List&lt;Float&gt;** | Confidence score of the support references. Ranges from 0 to 1. 1 is the most confident. This list must have the same size as the grounding_chunk_indices. |  [optional] |
|**groundingChunkIndices** | **List&lt;Integer&gt;** | A list of indices (into &#39;grounding_chunk&#39;) specifying the citations associated with the claim. For instance [1,3,4] means that grounding_chunk[1], grounding_chunk[3], grounding_chunk[4] are the retrieved content attributed to the claim. |  [optional] |
|**segment** | [**GoogleCloudAiplatformV1Segment**](GoogleCloudAiplatformV1Segment.md) | Segment of the content this support belongs to. |  [optional] |



