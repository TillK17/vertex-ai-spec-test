

# GoogleCloudAiplatformV1DeployModelRequest

Request message for EndpointService.DeployModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deployedModel** | [**GoogleCloudAiplatformV1DeployedModel**](GoogleCloudAiplatformV1DeployedModel.md) | Required. The DeployedModel to be created within the Endpoint. Note that Endpoint.traffic_split must be updated for the DeployedModel to start receiving traffic, either as part of this call, or via EndpointService.UpdateEndpoint. |  [optional] |
|**trafficSplit** | **Map&lt;String, Integer&gt;** | A map from a DeployedModel&#39;s ID to the percentage of this Endpoint&#39;s traffic that should be forwarded to that DeployedModel. If this field is non-empty, then the Endpoint&#39;s traffic_split will be overwritten with it. To refer to the ID of the just being deployed Model, a \&quot;0\&quot; should be used, and the actual ID of the new DeployedModel will be filled in its place by this method. The traffic percentage values must add up to 100. If this field is empty, then the Endpoint&#39;s traffic_split is not updated. |  [optional] |



