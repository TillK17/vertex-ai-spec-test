

# GoogleCloudAiplatformV1ModelDataStats

Stats of data used for train or evaluate the Model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**validationDataItemsCount** | **String** | Number of DataItems that were used for validating this Model during training. |  [optional] |
|**testDataItemsCount** | **String** | Number of DataItems that were used for evaluating this Model. If the Model is evaluated multiple times, this will be the number of test DataItems used by the first evaluation. If the Model is not evaluated, the number is 0. |  [optional] |
|**validationAnnotationsCount** | **String** | Number of Annotations that are used for validating this Model during training. |  [optional] |
|**testAnnotationsCount** | **String** | Number of Annotations that are used for evaluating this Model. If the Model is evaluated multiple times, this will be the number of test Annotations used by the first evaluation. If the Model is not evaluated, the number is 0. |  [optional] |
|**trainingDataItemsCount** | **String** | Number of DataItems that were used for training this Model. |  [optional] |
|**trainingAnnotationsCount** | **String** | Number of Annotations that are used for training this Model. |  [optional] |



