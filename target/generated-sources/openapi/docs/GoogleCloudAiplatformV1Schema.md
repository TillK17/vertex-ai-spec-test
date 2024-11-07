

# GoogleCloudAiplatformV1Schema

Schema is used to define the format of input/output data. Represents a select subset of an [OpenAPI 3.0 schema object](https://spec.openapis.org/oas/v3.0.3#schema-object). More fields may be added in the future as needed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_default** | **Any** | Optional. Default value of the data. |  [optional] |
|**_enum** | **List&lt;String&gt;** | Optional. Possible values of the element of Type.STRING with enum format. For example we can define an Enum Direction as : {type:STRING, format:enum, enum:[\&quot;EAST\&quot;, NORTH\&quot;, \&quot;SOUTH\&quot;, \&quot;WEST\&quot;]} |  [optional] |
|**propertyOrdering** | **List&lt;String&gt;** | Optional. The order of the properties. Not a standard field in open api spec. Only used to support the order of the properties. |  [optional] |
|**maximum** | **Double** | Optional. Maximum value of the Type.INTEGER and Type.NUMBER |  [optional] |
|**minProperties** | **String** | Optional. Minimum number of the properties for Type.OBJECT. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Optional. The type of the data. |  [optional] |
|**nullable** | **Boolean** | Optional. Indicates if the value may be null. |  [optional] |
|**maxItems** | **String** | Optional. Maximum number of the elements for Type.ARRAY. |  [optional] |
|**example** | **Any** | Optional. Example of the object. Will only populated when the object is the root. |  [optional] |
|**minLength** | **String** | Optional. SCHEMA FIELDS FOR TYPE STRING Minimum length of the Type.STRING |  [optional] |
|**required** | **List&lt;String&gt;** | Optional. Required properties of Type.OBJECT. |  [optional] |
|**properties** | [**Map&lt;String, GoogleCloudAiplatformV1Schema&gt;**](GoogleCloudAiplatformV1Schema.md) | Optional. SCHEMA FIELDS FOR TYPE OBJECT Properties of Type.OBJECT. |  [optional] |
|**minimum** | **Double** | Optional. SCHEMA FIELDS FOR TYPE INTEGER and NUMBER Minimum value of the Type.INTEGER and Type.NUMBER |  [optional] |
|**maxLength** | **String** | Optional. Maximum length of the Type.STRING |  [optional] |
|**title** | **String** | Optional. The title of the Schema. |  [optional] |
|**items** | [**GoogleCloudAiplatformV1Schema**](GoogleCloudAiplatformV1Schema.md) | Optional. SCHEMA FIELDS FOR TYPE ARRAY Schema of the elements of Type.ARRAY. |  [optional] |
|**minItems** | **String** | Optional. Minimum number of the elements for Type.ARRAY. |  [optional] |
|**format** | **String** | Optional. The format of the data. Supported formats: for NUMBER type: \&quot;float\&quot;, \&quot;double\&quot; for INTEGER type: \&quot;int32\&quot;, \&quot;int64\&quot; for STRING type: \&quot;email\&quot;, \&quot;byte\&quot;, etc |  [optional] |
|**maxProperties** | **String** | Optional. Maximum number of the properties for Type.OBJECT. |  [optional] |
|**pattern** | **String** | Optional. Pattern of the Type.STRING to restrict a string to a regular expression. |  [optional] |
|**description** | **String** | Optional. The description of the data. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TYPE_UNSPECIFIED | &quot;TYPE_UNSPECIFIED&quot; |
| STRING | &quot;STRING&quot; |
| NUMBER | &quot;NUMBER&quot; |
| INTEGER | &quot;INTEGER&quot; |
| BOOLEAN | &quot;BOOLEAN&quot; |
| ARRAY | &quot;ARRAY&quot; |
| OBJECT | &quot;OBJECT&quot; |



