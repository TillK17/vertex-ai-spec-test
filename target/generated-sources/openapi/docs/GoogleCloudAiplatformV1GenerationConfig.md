

# GoogleCloudAiplatformV1GenerationConfig

Generation config.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**topK** | **Float** | Optional. If specified, top-k sampling will be used. |  [optional] |
|**seed** | **Integer** | Optional. Seed. |  [optional] |
|**topP** | **Float** | Optional. If specified, nucleus sampling will be used. |  [optional] |
|**routingConfig** | [**GoogleCloudAiplatformV1GenerationConfigRoutingConfig**](GoogleCloudAiplatformV1GenerationConfigRoutingConfig.md) | Optional. Routing configuration. |  [optional] |
|**responseSchema** | [**GoogleCloudAiplatformV1Schema**](GoogleCloudAiplatformV1Schema.md) | Optional. The &#x60;Schema&#x60; object allows the definition of input and output data types. These types can be objects, but also primitives and arrays. Represents a select subset of an [OpenAPI 3.0 schema object](https://spec.openapis.org/oas/v3.0.3#schema). If set, a compatible response_mime_type must also be set. Compatible mimetypes: &#x60;application/json&#x60;: Schema for JSON response. |  [optional] |
|**frequencyPenalty** | **Float** | Optional. Frequency penalties. |  [optional] |
|**responseMimeType** | **String** | Optional. Output response mimetype of the generated candidate text. Supported mimetype: - &#x60;text/plain&#x60;: (default) Text output. - &#x60;application/json&#x60;: JSON response in the candidates. The model needs to be prompted to output the appropriate response type, otherwise the behavior is undefined. This is a preview feature. |  [optional] |
|**stopSequences** | **List&lt;String&gt;** | Optional. Stop sequences. |  [optional] |
|**candidateCount** | **Integer** | Optional. Number of candidates to generate. |  [optional] |
|**presencePenalty** | **Float** | Optional. Positive penalties. |  [optional] |
|**maxOutputTokens** | **Integer** | Optional. The maximum number of output tokens to generate per message. |  [optional] |
|**temperature** | **Float** | Optional. Controls the randomness of predictions. |  [optional] |



