

# GoogleCloudAiplatformV1IndexPrivateEndpoints

IndexPrivateEndpoints proto is used to provide paths for users to send requests via private endpoints (e.g. private service access, private service connect). To send request via private service access, use match_grpc_address. To send request via private service connect, use service_attachment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**matchGrpcAddress** | **String** | Output only. The ip address used to send match gRPC requests. |  [optional] [readonly] |
|**pscAutomatedEndpoints** | [**List&lt;GoogleCloudAiplatformV1PscAutomatedEndpoints&gt;**](GoogleCloudAiplatformV1PscAutomatedEndpoints.md) | Output only. PscAutomatedEndpoints is populated if private service connect is enabled if PscAutomatedConfig is set. |  [optional] |
|**serviceAttachment** | **String** | Output only. The name of the service attachment resource. Populated if private service connect is enabled. |  [optional] [readonly] |



