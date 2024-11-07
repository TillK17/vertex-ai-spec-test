

# CloudAiLargeModelsVisionRaiInfo

Next ID: 6

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockedEntities** | **List&lt;String&gt;** | List of blocked entities from the blocklist if it is detected. |  [optional] |
|**modelName** | **String** | The model name used to indexing into the RaiFilterConfig map. Would either be one of imagegeneration@002-006, imagen-3.0-... api endpoint names, or internal names used for mapping to different filter configs (genselfie, ai_watermark) than its api endpoint. |  [optional] |
|**scores** | **List&lt;Float&gt;** | List of rai scores mapping to the rai categories. Rounded to 1 decimal place. |  [optional] |
|**raiCategories** | **List&lt;String&gt;** | List of rai categories&#39; information to return |  [optional] |
|**detectedLabels** | [**List&lt;CloudAiLargeModelsVisionRaiInfoDetectedLabels&gt;**](CloudAiLargeModelsVisionRaiInfoDetectedLabels.md) | The list of detected labels for different rai categories. |  [optional] |



