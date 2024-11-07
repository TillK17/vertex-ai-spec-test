

# GoogleCloudAiplatformV1ExplanationParameters

Parameters to configure explaining for Model's predictions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**integratedGradientsAttribution** | [**GoogleCloudAiplatformV1IntegratedGradientsAttribution**](GoogleCloudAiplatformV1IntegratedGradientsAttribution.md) | An attribution method that computes Aumann-Shapley values taking advantage of the model&#39;s fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1703.01365 |  [optional] |
|**topK** | **Integer** | If populated, returns attributions for top K indices of outputs (defaults to 1). Only applies to Models that predicts more than one outputs (e,g, multi-class Models). When set to -1, returns explanations for all outputs. |  [optional] |
|**outputIndices** | **List&lt;Any&gt;** | If populated, only returns attributions that have output_index contained in output_indices. It must be an ndarray of integers, with the same shape of the output it&#39;s explaining. If not populated, returns attributions for top_k indices of outputs. If neither top_k nor output_indices is populated, returns the argmax index of the outputs. Only applicable to Models that predict multiple outputs (e,g, multi-class Models that predict multiple classes). |  [optional] |
|**sampledShapleyAttribution** | [**GoogleCloudAiplatformV1SampledShapleyAttribution**](GoogleCloudAiplatformV1SampledShapleyAttribution.md) | An attribution method that approximates Shapley values for features that contribute to the label being predicted. A sampling strategy is used to approximate the value rather than considering all subsets of features. Refer to this paper for model details: https://arxiv.org/abs/1306.4265. |  [optional] |
|**xraiAttribution** | [**GoogleCloudAiplatformV1XraiAttribution**](GoogleCloudAiplatformV1XraiAttribution.md) | An attribution method that redistributes Integrated Gradients attribution to segmented regions, taking advantage of the model&#39;s fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1906.02825 XRAI currently performs better on natural images, like a picture of a house or an animal. If the images are taken in artificial environments, like a lab or manufacturing line, or from diagnostic equipment, like x-rays or quality-control cameras, use Integrated Gradients instead. |  [optional] |
|**examples** | [**GoogleCloudAiplatformV1Examples**](GoogleCloudAiplatformV1Examples.md) | Example-based explanations that returns the nearest neighbors from the provided dataset. |  [optional] |



