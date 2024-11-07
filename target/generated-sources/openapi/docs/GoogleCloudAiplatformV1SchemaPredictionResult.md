

# GoogleCloudAiplatformV1SchemaPredictionResult

Represents a line of JSONL in the batch prediction output file.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | Optional user-provided key from the input instance. |  [optional] |
|**error** | [**GoogleCloudAiplatformV1SchemaPredictionResultError**](GoogleCloudAiplatformV1SchemaPredictionResultError.md) | The error result. Do not set prediction if this is set. |  [optional] |
|**prediction** | **Any** | The prediction result. Value is used here instead of Any so that JsonFormat does not append an extra \&quot;@type\&quot; field when we convert the proto to JSON and so we can represent array of objects. Do not set error if this is set. |  [optional] |
|**instance** | **Map&lt;String, Any&gt;** | User&#39;s input instance. Struct is used here instead of Any so that JsonFormat does not append an extra \&quot;@type\&quot; field when we convert the proto to JSON. |  [optional] |



