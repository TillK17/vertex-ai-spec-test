

# GoogleCloudAiplatformV1ListNasJobsResponse

Response message for JobService.ListNasJobs

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextPageToken** | **String** | A token to retrieve the next page of results. Pass to ListNasJobsRequest.page_token to obtain that page. |  [optional] |
|**nasJobs** | [**List&lt;GoogleCloudAiplatformV1NasJob&gt;**](GoogleCloudAiplatformV1NasJob.md) | List of NasJobs in the requested page. NasJob.nas_job_output of the jobs will not be returned. |  [optional] |


