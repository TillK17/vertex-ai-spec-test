

# GoogleCloudAiplatformV1UndeployModelRequest

Request message for EndpointService.UndeployModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deployedModelId** | **String** | Required. The ID of the DeployedModel to be undeployed from the Endpoint. |  [optional] |
|**trafficSplit** | **Map&lt;String, Integer&gt;** | If this field is provided, then the Endpoint&#39;s traffic_split will be overwritten with it. If last DeployedModel is being undeployed from the Endpoint, the [Endpoint.traffic_split] will always end up empty when this call returns. A DeployedModel will be successfully undeployed only if it doesn&#39;t have any traffic assigned to it when this method executes, or if this field unassigns any traffic to it. |  [optional] |



