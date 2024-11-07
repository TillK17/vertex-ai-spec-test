

# GoogleCloudAiplatformV1SchemaTextPromptDatasetMetadata

The metadata of Datasets that contain Text Prompt data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hasPromptVariable** | **Boolean** | Whether the prompt dataset has prompt variable. |  [optional] |
|**stopSequences** | **List&lt;String&gt;** | Customized stop sequences. |  [optional] |
|**temperature** | **Float** | Temperature value used for sampling set when the dataset was saved. This value is used to tune the degree of randomness. |  [optional] |
|**systemInstructionGcsUri** | **String** | The Google Cloud Storage URI that stores the system instruction, starting with gs://. |  [optional] |
|**systemInstruction** | **String** | The content of the prompt dataset system instruction. |  [optional] |
|**groundingConfig** | [**GoogleCloudAiplatformV1SchemaPredictParamsGroundingConfig**](GoogleCloudAiplatformV1SchemaPredictParamsGroundingConfig.md) | Grounding checking configuration. |  [optional] |
|**maxOutputTokens** | **String** | Value of the maximum number of tokens generated set when the dataset was saved. |  [optional] |
|**topK** | **String** | Top K value set when the dataset was saved. This value determines how many candidates with highest probability from the vocab would be selected for each decoding step. |  [optional] |
|**note** | **String** | User-created prompt note. Note size limit is 2KB. |  [optional] |
|**candidateCount** | **String** | Number of candidates. |  [optional] |
|**text** | **String** | The content of the prompt dataset. |  [optional] |
|**promptType** | **String** | Type of the prompt dataset. |  [optional] |
|**gcsUri** | **String** | The Google Cloud Storage URI that stores the prompt data. |  [optional] |
|**topP** | **Float** | Top P value set when the dataset was saved. Given topK tokens for decoding, top candidates will be selected until the sum of their probabilities is topP. |  [optional] |



