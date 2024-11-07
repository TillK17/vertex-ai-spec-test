

# GoogleCloudAiplatformV1ExportDataConfig

Describes what part of the Dataset is to be exported, the destination of the export and how to export.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fractionSplit** | [**GoogleCloudAiplatformV1ExportFractionSplit**](GoogleCloudAiplatformV1ExportFractionSplit.md) | Split based on fractions defining the size of each set. |  [optional] |
|**annotationSchemaUri** | **String** | The Cloud Storage URI that points to a YAML file describing the annotation schema. The schema is defined as an OpenAPI 3.0.2 [Schema Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject). The schema files that can be used here are found in gs://google-cloud-aiplatform/schema/dataset/annotation/, note that the chosen schema must be consistent with metadata of the Dataset specified by dataset_id. Only used for custom training data export use cases. Only applicable to Datasets that have DataItems and Annotations. Only Annotations that both match this schema and belong to DataItems not ignored by the split method are used in respectively training, validation or test role, depending on the role of the DataItem they are on. When used in conjunction with annotations_filter, the Annotations used for training are filtered by both annotations_filter and annotation_schema_uri. |  [optional] |
|**savedQueryId** | **String** | The ID of a SavedQuery (annotation set) under the Dataset specified by dataset_id used for filtering Annotations for training. Only used for custom training data export use cases. Only applicable to Datasets that have SavedQueries. Only Annotations that are associated with this SavedQuery are used in respectively training. When used in conjunction with annotations_filter, the Annotations used for training are filtered by both saved_query_id and annotations_filter. Only one of saved_query_id and annotation_schema_uri should be specified as both of them represent the same thing: problem type. |  [optional] |
|**annotationsFilter** | **String** | An expression for filtering what part of the Dataset is to be exported. Only Annotations that match this filter will be exported. The filter syntax is the same as in ListAnnotations. |  [optional] |
|**filterSplit** | [**GoogleCloudAiplatformV1ExportFilterSplit**](GoogleCloudAiplatformV1ExportFilterSplit.md) | Split based on the provided filters for each set. |  [optional] |
|**gcsDestination** | [**GoogleCloudAiplatformV1GcsDestination**](GoogleCloudAiplatformV1GcsDestination.md) | The Google Cloud Storage location where the output is to be written to. In the given directory a new directory will be created with name: &#x60;export-data--&#x60; where timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format. All export output will be written into that directory. Inside that directory, annotations with the same schema will be grouped into sub directories which are named with the corresponding annotations&#39; schema title. Inside these sub directories, a schema.yaml will be created to describe the output format. |  [optional] |
|**exportUse** | [**ExportUseEnum**](#ExportUseEnum) | Indicates the usage of the exported files. |  [optional] |



## Enum: ExportUseEnum

| Name | Value |
|---- | -----|
| EXPORT_USE_UNSPECIFIED | &quot;EXPORT_USE_UNSPECIFIED&quot; |
| CUSTOM_CODE_TRAINING | &quot;CUSTOM_CODE_TRAINING&quot; |



