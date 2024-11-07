

# GoogleCloudAiplatformV1NearestNeighborQueryNumericFilter

Numeric filter is used to search a subset of the entities by using boolean rules on numeric columns. For example: Database Point 0: {name: \"a\" value_int: 42} {name: \"b\" value_float: 1.0} Database Point 1: {name: \"a\" value_int: 10} {name: \"b\" value_float: 2.0} Database Point 2: {name: \"a\" value_int: -1} {name: \"b\" value_float: 3.0} Query: {name: \"a\" value_int: 12 operator: LESS} // Matches Point 1, 2 {name: \"b\" value_float: 2.0 operator: EQUAL} // Matches Point 1

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**valueInt** | **String** | int value type. |  [optional] |
|**valueDouble** | **Double** | double value type. |  [optional] |
|**valueFloat** | **Float** | float value type. |  [optional] |
|**op** | [**OpEnum**](#OpEnum) | Optional. This MUST be specified for queries and must NOT be specified for database points. |  [optional] |
|**name** | **String** | Required. Column name in BigQuery that used as filters. |  [optional] |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| OPERATOR_UNSPECIFIED | &quot;OPERATOR_UNSPECIFIED&quot; |
| LESS | &quot;LESS&quot; |
| LESS_EQUAL | &quot;LESS_EQUAL&quot; |
| EQUAL | &quot;EQUAL&quot; |
| GREATER_EQUAL | &quot;GREATER_EQUAL&quot; |
| GREATER | &quot;GREATER&quot; |
| NOT_EQUAL | &quot;NOT_EQUAL&quot; |



