

# GoogleCloudAiplatformV1MetadataStore

Instance of a metadata store. Contains a set of metadata that can be queried.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataplexConfig** | [**GoogleCloudAiplatformV1MetadataStoreDataplexConfig**](GoogleCloudAiplatformV1MetadataStoreDataplexConfig.md) | Optional. Dataplex integration settings. |  [optional] |
|**name** | **String** | Output only. The resource name of the MetadataStore instance. |  [optional] [readonly] |
|**encryptionSpec** | [**GoogleCloudAiplatformV1EncryptionSpec**](GoogleCloudAiplatformV1EncryptionSpec.md) | Customer-managed encryption key spec for a Metadata Store. If set, this Metadata Store and all sub-resources of this Metadata Store are secured using this key. |  [optional] |
|**updateTime** | **String** | Output only. Timestamp when this MetadataStore was last updated. |  [optional] [readonly] |
|**state** | [**GoogleCloudAiplatformV1MetadataStoreMetadataStoreState**](GoogleCloudAiplatformV1MetadataStoreMetadataStoreState.md) | Output only. State information of the MetadataStore. |  [optional] [readonly] |
|**createTime** | **String** | Output only. Timestamp when this MetadataStore was created. |  [optional] [readonly] |
|**description** | **String** | Description of the MetadataStore. |  [optional] |



