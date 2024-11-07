

# GoogleCloudAiplatformV1PrivateServiceConnectConfig

Represents configuration for private service connect.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serviceAttachment** | **String** | Output only. The name of the generated service attachment resource. This is only populated if the endpoint is deployed with PrivateServiceConnect. |  [optional] [readonly] |
|**projectAllowlist** | **List&lt;String&gt;** | A list of Projects from which the forwarding rule will target the service attachment. |  [optional] |
|**enablePrivateServiceConnect** | **Boolean** | Required. If true, expose the IndexEndpoint via private service connect. |  [optional] |



