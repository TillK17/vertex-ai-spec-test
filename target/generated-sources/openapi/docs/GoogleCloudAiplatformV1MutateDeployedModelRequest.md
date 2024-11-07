

# GoogleCloudAiplatformV1MutateDeployedModelRequest

Request message for EndpointService.MutateDeployedModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deployedModel** | [**GoogleCloudAiplatformV1DeployedModel**](GoogleCloudAiplatformV1DeployedModel.md) | Required. The DeployedModel to be mutated within the Endpoint. Only the following fields can be mutated: * &#x60;min_replica_count&#x60; in either DedicatedResources or AutomaticResources * &#x60;max_replica_count&#x60; in either DedicatedResources or AutomaticResources * autoscaling_metric_specs * &#x60;disable_container_logging&#x60; (v1 only) * &#x60;enable_container_logging&#x60; (v1beta1 only) |  [optional] |
|**updateMask** | **String** | Required. The update mask applies to the resource. See google.protobuf.FieldMask. |  [optional] |



