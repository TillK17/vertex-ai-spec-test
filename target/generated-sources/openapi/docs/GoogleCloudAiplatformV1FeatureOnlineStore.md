

# GoogleCloudAiplatformV1FeatureOnlineStore

Vertex AI Feature Online Store provides a centralized repository for serving ML features and embedding indexes at low latency. The Feature Online Store is a top-level container.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Identifier. Name of the FeatureOnlineStore. Format: &#x60;projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}&#x60; |  [optional] |
|**updateTime** | **String** | Output only. Timestamp when this FeatureOnlineStore was last updated. |  [optional] [readonly] |
|**etag** | **String** | Optional. Used to perform consistent read-modify-write updates. If not set, a blind \&quot;overwrite\&quot; update happens. |  [optional] |
|**dedicatedServingEndpoint** | [**GoogleCloudAiplatformV1FeatureOnlineStoreDedicatedServingEndpoint**](GoogleCloudAiplatformV1FeatureOnlineStoreDedicatedServingEndpoint.md) | Optional. The dedicated serving endpoint for this FeatureOnlineStore, which is different from common Vertex service endpoint. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Output only. State of the featureOnlineStore. |  [optional] [readonly] |
|**encryptionSpec** | [**GoogleCloudAiplatformV1EncryptionSpec**](GoogleCloudAiplatformV1EncryptionSpec.md) | Optional. Customer-managed encryption key spec for data storage. If set, online store will be secured by this key. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Optional. The labels with user-defined metadata to organize your FeatureOnlineStore. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information on and examples of labels. No more than 64 user labels can be associated with one FeatureOnlineStore(System labels are excluded).\&quot; System reserved label keys are prefixed with \&quot;aiplatform.googleapis.com/\&quot; and are immutable. |  [optional] |
|**satisfiesPzi** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**createTime** | **String** | Output only. Timestamp when this FeatureOnlineStore was created. |  [optional] [readonly] |
|**bigtable** | [**GoogleCloudAiplatformV1FeatureOnlineStoreBigtable**](GoogleCloudAiplatformV1FeatureOnlineStoreBigtable.md) | Contains settings for the Cloud Bigtable instance that will be created to serve featureValues for all FeatureViews under this FeatureOnlineStore. |  [optional] |
|**satisfiesPzs** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**optimized** | **Object** | Optimized storage type |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| STABLE | &quot;STABLE&quot; |
| UPDATING | &quot;UPDATING&quot; |



