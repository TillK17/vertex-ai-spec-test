

# GoogleCloudAiplatformV1WorkerPoolSpec

Represents the spec of a worker pool in a job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pythonPackageSpec** | [**GoogleCloudAiplatformV1PythonPackageSpec**](GoogleCloudAiplatformV1PythonPackageSpec.md) | The Python packaged task. |  [optional] |
|**diskSpec** | [**GoogleCloudAiplatformV1DiskSpec**](GoogleCloudAiplatformV1DiskSpec.md) | Disk spec. |  [optional] |
|**machineSpec** | [**GoogleCloudAiplatformV1MachineSpec**](GoogleCloudAiplatformV1MachineSpec.md) | Optional. Immutable. The specification of a single machine. |  [optional] |
|**containerSpec** | [**GoogleCloudAiplatformV1ContainerSpec**](GoogleCloudAiplatformV1ContainerSpec.md) | The custom container task. |  [optional] |
|**nfsMounts** | [**List&lt;GoogleCloudAiplatformV1NfsMount&gt;**](GoogleCloudAiplatformV1NfsMount.md) | Optional. List of NFS mount spec. |  [optional] |
|**replicaCount** | **String** | Optional. The number of worker replicas to use for this worker pool. |  [optional] |



