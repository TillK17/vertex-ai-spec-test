

# GoogleCloudAiplatformV1FunctionResponse

The result output from a [FunctionCall] that contains a string representing the [FunctionDeclaration.name] and a structured JSON object containing any output from the function is used as context to the model. This should contain the result of a [FunctionCall] made based on model prediction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Required. The name of the function to call. Matches [FunctionDeclaration.name] and [FunctionCall.name]. |  [optional] |
|**response** | **Map&lt;String, Any&gt;** | Required. The function response in JSON object format. Use \&quot;output\&quot; key to specify function output and \&quot;error\&quot; key to specify error details (if any). If \&quot;output\&quot; and \&quot;error\&quot; keys are not specified, then whole \&quot;response\&quot; is treated as function output. |  [optional] |



