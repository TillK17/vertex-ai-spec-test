

# GoogleCloudAiplatformV1ImportFeatureValuesRequestFeatureSpec

Defines the Feature value(s) to import.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceField** | **String** | Source column to get the Feature values from. If not set, uses the column with the same name as the Feature ID. |  [optional] |
|**id** | **String** | Required. ID of the Feature to import values of. This Feature must exist in the target EntityType, or the request will fail. |  [optional] |


