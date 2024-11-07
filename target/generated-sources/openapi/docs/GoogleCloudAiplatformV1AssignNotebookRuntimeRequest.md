

# GoogleCloudAiplatformV1AssignNotebookRuntimeRequest

Request message for NotebookService.AssignNotebookRuntime.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**notebookRuntime** | [**GoogleCloudAiplatformV1NotebookRuntime**](GoogleCloudAiplatformV1NotebookRuntime.md) | Required. Provide runtime specific information (e.g. runtime owner, notebook id) used for NotebookRuntime assignment. |  [optional] |
|**notebookRuntimeTemplate** | **String** | Required. The resource name of the NotebookRuntimeTemplate based on which a NotebookRuntime will be assigned (reuse or create a new one). |  [optional] |
|**notebookRuntimeId** | **String** | Optional. User specified ID for the notebook runtime. |  [optional] |



