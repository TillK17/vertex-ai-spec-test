

# GoogleCloudAiplatformV1UserActionReference

References an API call. It contains more information about long running operation and Jobs that are triggered by the API call.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**method** | **String** | The method name of the API RPC call. For example, \&quot;/google.cloud.aiplatform.{apiVersion}.DatasetService.CreateDataset\&quot; |  [optional] |
|**dataLabelingJob** | **String** | For API calls that start a LabelingJob. Resource name of the LabelingJob. Format: &#x60;projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}&#x60; |  [optional] |
|**operation** | **String** | For API calls that return a long running operation. Resource name of the long running operation. Format: &#x60;projects/{project}/locations/{location}/operations/{operation}&#x60; |  [optional] |



