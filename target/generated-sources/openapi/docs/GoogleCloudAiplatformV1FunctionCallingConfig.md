

# GoogleCloudAiplatformV1FunctionCallingConfig

Function calling config.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedFunctionNames** | **List&lt;String&gt;** | Optional. Function names to call. Only set when the Mode is ANY. Function names should match [FunctionDeclaration.name]. With mode set to ANY, model will predict a function call from the set of function names provided. |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) | Optional. Function calling mode. |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| MODE_UNSPECIFIED | &quot;MODE_UNSPECIFIED&quot; |
| AUTO | &quot;AUTO&quot; |
| ANY | &quot;ANY&quot; |
| NONE | &quot;NONE&quot; |



