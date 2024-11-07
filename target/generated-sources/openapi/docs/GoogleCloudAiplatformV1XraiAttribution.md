

# GoogleCloudAiplatformV1XraiAttribution

An explanation method that redistributes Integrated Gradients attributions to segmented regions, taking advantage of the model's fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1906.02825 Supported only by image Models.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**smoothGradConfig** | [**GoogleCloudAiplatformV1SmoothGradConfig**](GoogleCloudAiplatformV1SmoothGradConfig.md) | Config for SmoothGrad approximation of gradients. When enabled, the gradients are approximated by averaging the gradients from noisy samples in the vicinity of the inputs. Adding noise can help improve the computed gradients. Refer to this paper for more details: https://arxiv.org/pdf/1706.03825.pdf |  [optional] |
|**blurBaselineConfig** | [**GoogleCloudAiplatformV1BlurBaselineConfig**](GoogleCloudAiplatformV1BlurBaselineConfig.md) | Config for XRAI with blur baseline. When enabled, a linear path from the maximally blurred image to the input image is created. Using a blurred baseline instead of zero (black image) is motivated by the BlurIG approach explained here: https://arxiv.org/abs/2004.03383 |  [optional] |
|**stepCount** | **Integer** | Required. The number of steps for approximating the path integral. A good value to start is 50 and gradually increase until the sum to diff property is met within the desired error range. Valid range of its value is [1, 100], inclusively. |  [optional] |



