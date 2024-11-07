

# GoogleCloudAiplatformV1NasTrialDetail

Represents a NasTrial details along with its parameters. If there is a corresponding train NasTrial, the train NasTrial is also returned.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**trainTrial** | [**GoogleCloudAiplatformV1NasTrial**](GoogleCloudAiplatformV1NasTrial.md) | The train NasTrial corresponding to search_trial. Only populated if search_trial is used for training. |  [optional] |
|**searchTrial** | [**GoogleCloudAiplatformV1NasTrial**](GoogleCloudAiplatformV1NasTrial.md) | The requested search NasTrial. |  [optional] |
|**name** | **String** | Output only. Resource name of the NasTrialDetail. |  [optional] [readonly] |
|**parameters** | **String** | The parameters for the NasJob NasTrial. |  [optional] |



