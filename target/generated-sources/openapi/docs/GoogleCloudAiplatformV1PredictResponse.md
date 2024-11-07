

# GoogleCloudAiplatformV1PredictResponse

Response message for PredictionService.Predict.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | **String** | Output only. The resource name of the Model which is deployed as the DeployedModel that this prediction hits. |  [optional] [readonly] |
|**modelVersionId** | **String** | Output only. The version ID of the Model which is deployed as the DeployedModel that this prediction hits. |  [optional] [readonly] |
|**metadata** | **Any** | Output only. Request-level metadata returned by the model. The metadata type will be dependent upon the model implementation. |  [optional] [readonly] |
|**modelDisplayName** | **String** | Output only. The display name of the Model which is deployed as the DeployedModel that this prediction hits. |  [optional] [readonly] |
|**predictions** | **List&lt;Any&gt;** | The predictions that are the output of the predictions call. The schema of any single prediction may be specified via Endpoint&#39;s DeployedModels&#39; Model&#39;s PredictSchemata&#39;s prediction_schema_uri. |  [optional] |
|**deployedModelId** | **String** | ID of the Endpoint&#39;s DeployedModel that served this prediction. |  [optional] |



