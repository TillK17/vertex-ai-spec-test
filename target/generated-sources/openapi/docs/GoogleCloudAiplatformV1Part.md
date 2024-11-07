

# GoogleCloudAiplatformV1Part

A datatype containing media that is part of a multi-part `Content` message. A `Part` consists of data which has an associated datatype. A `Part` can only contain one of the accepted types in `Part.data`. A `Part` must have a fixed IANA MIME type identifying the type and subtype of the media if `inline_data` or `file_data` field is filled with raw bytes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileData** | [**GoogleCloudAiplatformV1FileData**](GoogleCloudAiplatformV1FileData.md) | Optional. URI based data. |  [optional] |
|**functionCall** | [**GoogleCloudAiplatformV1FunctionCall**](GoogleCloudAiplatformV1FunctionCall.md) | Optional. A predicted [FunctionCall] returned from the model that contains a string representing the [FunctionDeclaration.name] with the parameters and their values. |  [optional] |
|**videoMetadata** | [**GoogleCloudAiplatformV1VideoMetadata**](GoogleCloudAiplatformV1VideoMetadata.md) | Optional. Video metadata. The metadata should only be specified while the video data is presented in inline_data or file_data. |  [optional] |
|**text** | **String** | Optional. Text part (can be code). |  [optional] |
|**inlineData** | [**GoogleCloudAiplatformV1Blob**](GoogleCloudAiplatformV1Blob.md) | Optional. Inlined bytes data. |  [optional] |
|**functionResponse** | [**GoogleCloudAiplatformV1FunctionResponse**](GoogleCloudAiplatformV1FunctionResponse.md) | Optional. The result output of a [FunctionCall] that contains a string representing the [FunctionDeclaration.name] and a structured JSON object containing any output from the function call. It is used as context to the model. |  [optional] |



