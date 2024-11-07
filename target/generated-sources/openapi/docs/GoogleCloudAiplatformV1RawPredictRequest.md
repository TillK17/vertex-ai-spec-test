

# GoogleCloudAiplatformV1RawPredictRequest

Request message for PredictionService.RawPredict.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**httpBody** | [**GoogleApiHttpBody**](GoogleApiHttpBody.md) | The prediction input. Supports HTTP headers and arbitrary data payload. A DeployedModel may have an upper limit on the number of instances it supports per request. When this limit it is exceeded for an AutoML model, the RawPredict method returns an error. When this limit is exceeded for a custom-trained model, the behavior varies depending on the model. You can specify the schema for each instance in the predict_schemata.instance_schema_uri field when you create a Model. This schema applies when you deploy the &#x60;Model&#x60; as a &#x60;DeployedModel&#x60; to an Endpoint and use the &#x60;RawPredict&#x60; method. |  [optional] |



