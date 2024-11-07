

# GoogleCloudAiplatformV1Dataset

A collection of DataItems and Annotations on them.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataItemCount** | **String** | Output only. The number of DataItems in this Dataset. Only apply for non-structured Dataset. |  [optional] [readonly] |
|**displayName** | **String** | Required. The user-defined name of the Dataset. The name can be up to 128 characters long and can consist of any UTF-8 characters. |  [optional] |
|**updateTime** | **String** | Output only. Timestamp when this Dataset was last updated. |  [optional] [readonly] |
|**metadataSchemaUri** | **String** | Required. Points to a YAML file stored on Google Cloud Storage describing additional information about the Dataset. The schema is defined as an OpenAPI 3.0.2 Schema Object. The schema files that can be used here are found in gs://google-cloud-aiplatform/schema/dataset/metadata/. |  [optional] |
|**encryptionSpec** | [**GoogleCloudAiplatformV1EncryptionSpec**](GoogleCloudAiplatformV1EncryptionSpec.md) | Customer-managed encryption key spec for a Dataset. If set, this Dataset and all sub-resources of this Dataset will be secured by this key. |  [optional] |
|**description** | **String** | The description of the Dataset. |  [optional] |
|**name** | **String** | Output only. Identifier. The resource name of the Dataset. |  [optional] [readonly] |
|**metadata** | **Any** | Required. Additional information about the Dataset. |  [optional] |
|**modelReference** | **String** | Optional. Reference to the public base model last used by the dataset. Only set for prompt datasets. |  [optional] |
|**savedQueries** | [**List&lt;GoogleCloudAiplatformV1SavedQuery&gt;**](GoogleCloudAiplatformV1SavedQuery.md) | All SavedQueries belong to the Dataset will be returned in List/Get Dataset response. The annotation_specs field will not be populated except for UI cases which will only use annotation_spec_count. In CreateDataset request, a SavedQuery is created together if this field is set, up to one SavedQuery can be set in CreateDatasetRequest. The SavedQuery should not contain any AnnotationSpec. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | The labels with user-defined metadata to organize your Datasets. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one Dataset (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with \&quot;aiplatform.googleapis.com/\&quot; and are immutable. Following system labels exist for each Dataset: * \&quot;aiplatform.googleapis.com/dataset_metadata_schema\&quot;: output only, its value is the metadata_schema&#39;s title. |  [optional] |
|**createTime** | **String** | Output only. Timestamp when this Dataset was created. |  [optional] [readonly] |
|**satisfiesPzi** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**etag** | **String** | Used to perform consistent read-modify-write updates. If not set, a blind \&quot;overwrite\&quot; update happens. |  [optional] |
|**metadataArtifact** | **String** | Output only. The resource name of the Artifact that was created in MetadataStore when creating the Dataset. The Artifact resource name pattern is &#x60;projects/{project}/locations/{location}/metadataStores/{metadata_store}/artifacts/{artifact}&#x60;. |  [optional] [readonly] |
|**satisfiesPzs** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |



