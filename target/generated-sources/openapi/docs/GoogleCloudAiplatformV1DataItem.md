

# GoogleCloudAiplatformV1DataItem

A piece of data in a Dataset. Could be an image, a video, a document or plain text.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Output only. The resource name of the DataItem. |  [optional] [readonly] |
|**updateTime** | **String** | Output only. Timestamp when this DataItem was last updated. |  [optional] [readonly] |
|**satisfiesPzi** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**createTime** | **String** | Output only. Timestamp when this DataItem was created. |  [optional] [readonly] |
|**labels** | **Map&lt;String, String&gt;** | Optional. The labels with user-defined metadata to organize your DataItems. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one DataItem(System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with \&quot;aiplatform.googleapis.com/\&quot; and are immutable. |  [optional] |
|**payload** | **Any** | Required. The data that the DataItem represents (for example, an image or a text snippet). The schema of the payload is stored in the parent Dataset&#39;s metadata schema&#39;s dataItemSchemaUri field. |  [optional] |
|**satisfiesPzs** | **Boolean** | Output only. Reserved for future use. |  [optional] [readonly] |
|**etag** | **String** | Optional. Used to perform consistent read-modify-write updates. If not set, a blind \&quot;overwrite\&quot; update happens. |  [optional] |



