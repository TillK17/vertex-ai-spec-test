

# GoogleCloudAiplatformV1ResourcePoolAutoscalingSpec

The min/max number of replicas allowed if enabling autoscaling

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxReplicaCount** | **String** | Optional. max replicas in the node pool, must be ≥ replica_count and &gt; min_replica_count or will throw error |  [optional] |
|**minReplicaCount** | **String** | Optional. min replicas in the node pool, must be ≤ replica_count and &lt; max_replica_count or will throw error. For autoscaling enabled Ray-on-Vertex, we allow min_replica_count of a resource_pool to be 0 to match the OSS Ray behavior(https://docs.ray.io/en/latest/cluster/vms/user-guides/configuring-autoscaling.html#cluster-config-parameters). As for Persistent Resource, the min_replica_count must be &gt; 0, we added a corresponding validation inside CreatePersistentResourceRequestValidator.java. |  [optional] |



