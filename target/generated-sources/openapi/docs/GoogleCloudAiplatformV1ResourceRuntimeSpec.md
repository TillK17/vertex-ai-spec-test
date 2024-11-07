

# GoogleCloudAiplatformV1ResourceRuntimeSpec

Configuration for the runtime on a PersistentResource instance, including but not limited to: * Service accounts used to run the workloads. * Whether to make it a dedicated Ray Cluster.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**raySpec** | [**GoogleCloudAiplatformV1RaySpec**](GoogleCloudAiplatformV1RaySpec.md) | Optional. Ray cluster configuration. Required when creating a dedicated RayCluster on the PersistentResource. |  [optional] |
|**serviceAccountSpec** | [**GoogleCloudAiplatformV1ServiceAccountSpec**](GoogleCloudAiplatformV1ServiceAccountSpec.md) | Optional. Configure the use of workload identity on the PersistentResource |  [optional] |



