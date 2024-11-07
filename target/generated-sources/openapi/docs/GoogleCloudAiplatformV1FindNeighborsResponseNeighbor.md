

# GoogleCloudAiplatformV1FindNeighborsResponseNeighbor

A neighbor of the query vector.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**distance** | **Double** | The distance between the neighbor and the dense embedding query. |  [optional] |
|**sparseDistance** | **Double** | The distance between the neighbor and the query sparse_embedding. |  [optional] |
|**datapoint** | [**GoogleCloudAiplatformV1IndexDatapoint**](GoogleCloudAiplatformV1IndexDatapoint.md) | The datapoint of the neighbor. Note that full datapoints are returned only when \&quot;return_full_datapoint\&quot; is set to true. Otherwise, only the \&quot;datapoint_id\&quot; and \&quot;crowding_tag\&quot; fields are populated. |  [optional] |



