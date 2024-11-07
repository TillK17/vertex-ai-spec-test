

# GoogleCloudAiplatformV1Featurestore

Vertex AI Feature Store provides a centralized repository for organizing, storing, and serving ML features. The Featurestore is a top-level container for your features and their values.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**onlineStorageTtlDays** | **Integer** | Optional. TTL in days for feature values that will be stored in online serving storage. The Feature Store online storage periodically removes obsolete feature values older than &#x60;online_storage_ttl_days&#x60; since the feature generation time. Note that &#x60;online_storage_ttl_days&#x60; should be less than or equal to &#x60;offline_storage_ttl_days&#x60; for each EntityType under a featurestore. If not set, default to 4000 days |  [optional] |
|**updateTime** | **String** | Output only. Timestamp when this Featurestore was last updated. |  [optional] [readonly] |
|**satisfiesPzs** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**labels** | **Map&lt;String, String&gt;** | Optional. The labels with user-defined metadata to organize your Featurestore. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information on and examples of labels. No more than 64 user labels can be associated with one Featurestore(System labels are excluded).\&quot; System reserved label keys are prefixed with \&quot;aiplatform.googleapis.com/\&quot; and are immutable. |  [optional] |
|**encryptionSpec** | [**GoogleCloudAiplatformV1EncryptionSpec**](GoogleCloudAiplatformV1EncryptionSpec.md) | Optional. Customer-managed encryption key spec for data storage. If set, both of the online and offline data storage will be secured by this key. |  [optional] |
|**etag** | **String** | Optional. Used to perform consistent read-modify-write updates. If not set, a blind \&quot;overwrite\&quot; update happens. |  [optional] |
|**satisfiesPzi** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**state** | [**StateEnum**](#StateEnum) | Output only. State of the featurestore. |  [optional] [readonly] |
|**name** | **String** | Output only. Name of the Featurestore. Format: &#x60;projects/{project}/locations/{location}/featurestores/{featurestore}&#x60; |  [optional] [readonly] |
|**onlineServingConfig** | [**GoogleCloudAiplatformV1FeaturestoreOnlineServingConfig**](GoogleCloudAiplatformV1FeaturestoreOnlineServingConfig.md) | Optional. Config for online storage resources. The field should not co-exist with the field of &#x60;OnlineStoreReplicationConfig&#x60;. If both of it and OnlineStoreReplicationConfig are unset, the feature store will not have an online store and cannot be used for online serving. |  [optional] |
|**createTime** | **String** | Output only. Timestamp when this Featurestore was created. |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| STABLE | &quot;STABLE&quot; |
| UPDATING | &quot;UPDATING&quot; |



