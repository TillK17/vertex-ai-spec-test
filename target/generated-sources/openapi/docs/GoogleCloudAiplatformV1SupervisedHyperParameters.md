

# GoogleCloudAiplatformV1SupervisedHyperParameters

Hyperparameters for SFT.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adapterSize** | [**AdapterSizeEnum**](#AdapterSizeEnum) | Optional. Adapter size for tuning. |  [optional] |
|**learningRateMultiplier** | **Double** | Optional. Multiplier for adjusting the default learning rate. |  [optional] |
|**epochCount** | **String** | Optional. Number of complete passes the model makes over the entire training dataset during training. |  [optional] |



## Enum: AdapterSizeEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;ADAPTER_SIZE_UNSPECIFIED&quot; |
| ONE | &quot;ADAPTER_SIZE_ONE&quot; |
| FOUR | &quot;ADAPTER_SIZE_FOUR&quot; |
| EIGHT | &quot;ADAPTER_SIZE_EIGHT&quot; |
| SIXTEEN | &quot;ADAPTER_SIZE_SIXTEEN&quot; |
| THIRTY_TWO | &quot;ADAPTER_SIZE_THIRTY_TWO&quot; |



