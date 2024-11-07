

# CloudAiLargeModelsVisionImage

Image.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uri** | **String** | Path to another storage (typically Google Cloud Storage). |  [optional] |
|**raiInfo** | [**CloudAiLargeModelsVisionRaiInfo**](CloudAiLargeModelsVisionRaiInfo.md) | RAI info for image. |  [optional] |
|**text** | **String** | Text/Expanded text input for imagen. |  [optional] |
|**image** | **byte[]** | Raw bytes. |  [optional] |
|**generationSeed** | **Integer** | Generation seed for the sampled image. This parameter is exposed to the user only if one of the following is true: 1. The user specified per-example seeds in the request. 2. The user doesn&#39;t specify the generation seed in the request. |  [optional] |
|**imageRaiScores** | [**CloudAiLargeModelsVisionImageRAIScores**](CloudAiLargeModelsVisionImageRAIScores.md) | RAI scores for generated image. |  [optional] |
|**encoding** | **String** | Image encoding, encoded as \&quot;image/png\&quot; or \&quot;image/jpg\&quot;. |  [optional] |
|**semanticFilterResponse** | [**CloudAiLargeModelsVisionSemanticFilterResponse**](CloudAiLargeModelsVisionSemanticFilterResponse.md) | Semantic filter info for image. |  [optional] |



