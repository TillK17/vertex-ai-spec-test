

# GoogleCloudAiplatformV1BatchDedicatedResources

A description of resources that are used for performing batch operations, are dedicated to a Model, and need manual configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startingReplicaCount** | **Integer** | Immutable. The number of machine replicas used at the start of the batch operation. If not set, Vertex AI decides starting number, not greater than max_replica_count |  [optional] |
|**maxReplicaCount** | **Integer** | Immutable. The maximum number of machine replicas the batch operation may be scaled to. The default value is 10. |  [optional] |
|**machineSpec** | [**GoogleCloudAiplatformV1MachineSpec**](GoogleCloudAiplatformV1MachineSpec.md) | Required. Immutable. The specification of a single machine. |  [optional] |



