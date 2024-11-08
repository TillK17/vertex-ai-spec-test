

# GoogleCloudAiplatformV1EnvVar

Represents an environment variable present in a Container or Python Module.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **String** | Required. Variables that reference a $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. |  [optional] |
|**name** | **String** | Required. Name of the environment variable. Must be a valid C identifier. |  [optional] |



