

# GoogleCloudAiplatformV1PublisherModel

A Model Garden Publisher Model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**publisherModelTemplate** | **String** | Optional. Output only. Immutable. Used to indicate this model has a publisher model and provide the template of the publisher model resource name. |  [optional] [readonly] |
|**launchStage** | [**LaunchStageEnum**](#LaunchStageEnum) | Optional. Indicates the launch stage of the model. |  [optional] |
|**versionState** | [**VersionStateEnum**](#VersionStateEnum) | Optional. Indicates the state of the model version. |  [optional] |
|**name** | **String** | Output only. The resource name of the PublisherModel. |  [optional] [readonly] |
|**supportedActions** | [**GoogleCloudAiplatformV1PublisherModelCallToAction**](GoogleCloudAiplatformV1PublisherModelCallToAction.md) | Optional. Supported call-to-action options. |  [optional] |
|**predictSchemata** | [**GoogleCloudAiplatformV1PredictSchemata**](GoogleCloudAiplatformV1PredictSchemata.md) | Optional. The schemata that describes formats of the PublisherModel&#39;s predictions and explanations as given and returned via PredictionService.Predict. |  [optional] |
|**frameworks** | **List&lt;String&gt;** | Optional. Additional information about the model&#39;s Frameworks. |  [optional] |
|**openSourceCategory** | [**OpenSourceCategoryEnum**](#OpenSourceCategoryEnum) | Required. Indicates the open source category of the publisher model. |  [optional] |
|**versionId** | **String** | Output only. Immutable. The version ID of the PublisherModel. A new version is committed when a new model version is uploaded under an existing model id. It is an auto-incrementing decimal number in string representation. |  [optional] [readonly] |



## Enum: LaunchStageEnum

| Name | Value |
|---- | -----|
| LAUNCH_STAGE_UNSPECIFIED | &quot;LAUNCH_STAGE_UNSPECIFIED&quot; |
| EXPERIMENTAL | &quot;EXPERIMENTAL&quot; |
| PRIVATE_PREVIEW | &quot;PRIVATE_PREVIEW&quot; |
| PUBLIC_PREVIEW | &quot;PUBLIC_PREVIEW&quot; |
| GA | &quot;GA&quot; |



## Enum: VersionStateEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;VERSION_STATE_UNSPECIFIED&quot; |
| STABLE | &quot;VERSION_STATE_STABLE&quot; |
| UNSTABLE | &quot;VERSION_STATE_UNSTABLE&quot; |



## Enum: OpenSourceCategoryEnum

| Name | Value |
|---- | -----|
| OPEN_SOURCE_CATEGORY_UNSPECIFIED | &quot;OPEN_SOURCE_CATEGORY_UNSPECIFIED&quot; |
| PROPRIETARY | &quot;PROPRIETARY&quot; |
| GOOGLE_OWNED_OSS_WITH_GOOGLE_CHECKPOINT | &quot;GOOGLE_OWNED_OSS_WITH_GOOGLE_CHECKPOINT&quot; |
| THIRD_PARTY_OWNED_OSS_WITH_GOOGLE_CHECKPOINT | &quot;THIRD_PARTY_OWNED_OSS_WITH_GOOGLE_CHECKPOINT&quot; |
| GOOGLE_OWNED_OSS | &quot;GOOGLE_OWNED_OSS&quot; |
| THIRD_PARTY_OWNED_OSS | &quot;THIRD_PARTY_OWNED_OSS&quot; |



