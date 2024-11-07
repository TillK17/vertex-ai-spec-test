

# GoogleCloudAiplatformV1GenerationConfigRoutingConfigAutoRoutingMode

When automated routing is specified, the routing will be determined by the pretrained routing model and customer provided model routing preference.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**modelRoutingPreference** | [**ModelRoutingPreferenceEnum**](#ModelRoutingPreferenceEnum) | The model routing preference. |  [optional] |



## Enum: ModelRoutingPreferenceEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| PRIORITIZE_QUALITY | &quot;PRIORITIZE_QUALITY&quot; |
| BALANCED | &quot;BALANCED&quot; |
| PRIORITIZE_COST | &quot;PRIORITIZE_COST&quot; |



