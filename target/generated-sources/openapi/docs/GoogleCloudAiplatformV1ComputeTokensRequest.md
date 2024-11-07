

# GoogleCloudAiplatformV1ComputeTokensRequest

Request message for ComputeTokens RPC call.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | **String** | Optional. The name of the publisher model requested to serve the prediction. Format: projects/{project}/locations/{location}/publishers/_*_/models/_* |  [optional] |
|**instances** | **List&lt;Any&gt;** | Optional. The instances that are the input to token computing API call. Schema is identical to the prediction schema of the text model, even for the non-text models, like chat models, or Codey models. |  [optional] |
|**contents** | [**List&lt;GoogleCloudAiplatformV1Content&gt;**](GoogleCloudAiplatformV1Content.md) | Optional. Input content. |  [optional] |



