

# GoogleCloudAiplatformV1SuggestTrialsResponse

Response message for VizierService.SuggestTrials.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**trials** | [**List&lt;GoogleCloudAiplatformV1Trial&gt;**](GoogleCloudAiplatformV1Trial.md) | A list of Trials. |  [optional] |
|**studyState** | [**StudyStateEnum**](#StudyStateEnum) | The state of the Study. |  [optional] |
|**endTime** | **String** | The time at which operation processing completed. |  [optional] |
|**startTime** | **String** | The time at which the operation was started. |  [optional] |



## Enum: StudyStateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| COMPLETED | &quot;COMPLETED&quot; |



