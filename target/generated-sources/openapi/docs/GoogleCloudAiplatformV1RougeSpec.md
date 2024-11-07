

# GoogleCloudAiplatformV1RougeSpec

Spec for rouge score metric - calculates the recall of n-grams in prediction as compared to reference - returns a score ranging between 0 and 1.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rougeType** | **String** | Optional. Supported rouge types are rougen[1-9], rougeL, and rougeLsum. |  [optional] |
|**splitSummaries** | **Boolean** | Optional. Whether to split summaries while using rougeLsum. |  [optional] |
|**useStemmer** | **Boolean** | Optional. Whether to use stemmer to compute rouge score. |  [optional] |



