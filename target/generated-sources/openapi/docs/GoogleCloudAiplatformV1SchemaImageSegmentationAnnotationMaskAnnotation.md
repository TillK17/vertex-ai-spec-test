

# GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationMaskAnnotation

The mask based segmentation annotation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maskGcsUri** | **String** | Google Cloud Storage URI that points to the mask image. The image must be in PNG format. It must have the same size as the DataItem&#39;s image. Each pixel in the image mask represents the AnnotationSpec which the pixel in the image DataItem belong to. Each color is mapped to one AnnotationSpec based on annotation_spec_colors. |  [optional] |
|**annotationSpecColors** | [**List&lt;GoogleCloudAiplatformV1SchemaAnnotationSpecColor&gt;**](GoogleCloudAiplatformV1SchemaAnnotationSpecColor.md) | The mapping between color and AnnotationSpec for this Annotation. |  [optional] |



