

# GoogleCloudAiplatformV1FeatureOnlineStoreDedicatedServingEndpoint

The dedicated serving endpoint for this FeatureOnlineStore. Only need to set when you choose Optimized storage type. Public endpoint is provisioned by default.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**publicEndpointDomainName** | **String** | Output only. This field will be populated with the domain name to use for this FeatureOnlineStore |  [optional] [readonly] |
|**serviceAttachment** | **String** | Output only. The name of the service attachment resource. Populated if private service connect is enabled and after FeatureViewSync is created. |  [optional] [readonly] |
|**privateServiceConnectConfig** | [**GoogleCloudAiplatformV1PrivateServiceConnectConfig**](GoogleCloudAiplatformV1PrivateServiceConnectConfig.md) | Optional. Private service connect config. The private service connection is available only for Optimized storage type, not for embedding management now. If PrivateServiceConnectConfig.enable_private_service_connect set to true, customers will use private service connection to send request. Otherwise, the connection will set to public endpoint. |  [optional] |



