

# GoogleCloudAiplatformV1ExplainRequest

Request message for PredictionService.Explain.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parameters** | **Any** | The parameters that govern the prediction. The schema of the parameters may be specified via Endpoint&#39;s DeployedModels&#39; Model&#39;s PredictSchemata&#39;s parameters_schema_uri. |  [optional] |
|**instances** | **List&lt;Any&gt;** | Required. The instances that are the input to the explanation call. A DeployedModel may have an upper limit on the number of instances it supports per request, and when it is exceeded the explanation call errors in case of AutoML Models, or, in case of customer created Models, the behaviour is as documented by that Model. The schema of any single instance may be specified via Endpoint&#39;s DeployedModels&#39; Model&#39;s PredictSchemata&#39;s instance_schema_uri. |  [optional] |
|**deployedModelId** | **String** | If specified, this ExplainRequest will be served by the chosen DeployedModel, overriding Endpoint.traffic_split. |  [optional] |
|**explanationSpecOverride** | [**GoogleCloudAiplatformV1ExplanationSpecOverride**](GoogleCloudAiplatformV1ExplanationSpecOverride.md) | If specified, overrides the explanation_spec of the DeployedModel. Can be used for explaining prediction results with different configurations, such as: - Explaining top-5 predictions results as opposed to top-1; - Increasing path count or step count of the attribution methods to reduce approximate errors; - Using different baselines for explaining the prediction results. |  [optional] |



