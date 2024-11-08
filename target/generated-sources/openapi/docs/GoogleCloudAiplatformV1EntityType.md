

# GoogleCloudAiplatformV1EntityType

An entity type is a type of object in a system that needs to be modeled and have stored information about. For example, driver is an entity type, and driver0 is an instance of an entity type driver.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Immutable. Name of the EntityType. Format: &#x60;projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}&#x60; The last part entity_type is assigned by the client. The entity_type can be up to 64 characters long and can consist only of ASCII Latin letters A-Z and a-z and underscore(_), and ASCII digits 0-9 starting with a letter. The value will be unique given a featurestore. |  [optional] |
|**updateTime** | **String** | Output only. Timestamp when this EntityType was most recently updated. |  [optional] [readonly] |
|**etag** | **String** | Optional. Used to perform a consistent read-modify-write updates. If not set, a blind \&quot;overwrite\&quot; update happens. |  [optional] |
|**offlineStorageTtlDays** | **Integer** | Optional. Config for data retention policy in offline storage. TTL in days for feature values that will be stored in offline storage. The Feature Store offline storage periodically removes obsolete feature values older than &#x60;offline_storage_ttl_days&#x60; since the feature generation time. If unset (or explicitly set to 0), default to 4000 days TTL. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Optional. The labels with user-defined metadata to organize your EntityTypes. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information on and examples of labels. No more than 64 user labels can be associated with one EntityType (System labels are excluded).\&quot; System reserved label keys are prefixed with \&quot;aiplatform.googleapis.com/\&quot; and are immutable. |  [optional] |
|**satisfiesPzs** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**createTime** | **String** | Output only. Timestamp when this EntityType was created. |  [optional] [readonly] |
|**satisfiesPzi** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**description** | **String** | Optional. Description of the EntityType. |  [optional] |
|**monitoringConfig** | [**GoogleCloudAiplatformV1FeaturestoreMonitoringConfig**](GoogleCloudAiplatformV1FeaturestoreMonitoringConfig.md) | Optional. The default monitoring configuration for all Features with value type (Feature.ValueType) BOOL, STRING, DOUBLE or INT64 under this EntityType. If this is populated with [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is disabled. |  [optional] |



