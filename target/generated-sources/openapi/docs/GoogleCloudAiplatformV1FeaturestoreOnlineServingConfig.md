

# GoogleCloudAiplatformV1FeaturestoreOnlineServingConfig

OnlineServingConfig specifies the details for provisioning online serving resources.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fixedNodeCount** | **Integer** | The number of nodes for the online store. The number of nodes doesn&#39;t scale automatically, but you can manually update the number of nodes. If set to 0, the featurestore will not have an online store and cannot be used for online serving. |  [optional] |
|**scaling** | [**GoogleCloudAiplatformV1FeaturestoreOnlineServingConfigScaling**](GoogleCloudAiplatformV1FeaturestoreOnlineServingConfigScaling.md) | Online serving scaling configuration. Only one of &#x60;fixed_node_count&#x60; and &#x60;scaling&#x60; can be set. Setting one will reset the other. |  [optional] |



