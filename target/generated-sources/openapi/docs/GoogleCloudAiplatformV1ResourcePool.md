

# GoogleCloudAiplatformV1ResourcePool

Represents the spec of a group of resources of the same type, for example machine type, disk, and accelerators, in a PersistentResource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**replicaCount** | **String** | Optional. The total number of machines to use for this resource pool. |  [optional] |
|**diskSpec** | [**GoogleCloudAiplatformV1DiskSpec**](GoogleCloudAiplatformV1DiskSpec.md) | Optional. Disk spec for the machine in this node pool. |  [optional] |
|**usedReplicaCount** | **String** | Output only. The number of machines currently in use by training jobs for this resource pool. Will replace idle_replica_count. |  [optional] [readonly] |
|**machineSpec** | [**GoogleCloudAiplatformV1MachineSpec**](GoogleCloudAiplatformV1MachineSpec.md) | Required. Immutable. The specification of a single machine. |  [optional] |
|**id** | **String** | Immutable. The unique ID in a PersistentResource for referring to this resource pool. User can specify it if necessary. Otherwise, it&#39;s generated automatically. |  [optional] |
|**autoscalingSpec** | [**GoogleCloudAiplatformV1ResourcePoolAutoscalingSpec**](GoogleCloudAiplatformV1ResourcePoolAutoscalingSpec.md) | Optional. Optional spec to configure GKE or Ray-on-Vertex autoscaling |  [optional] |



