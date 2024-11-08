

# GoogleCloudAiplatformV1Attribution

Attribution that explains a particular prediction output.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**outputDisplayName** | **String** | Output only. The display name of the output identified by output_index. For example, the predicted class name by a multi-classification Model. This field is only populated iff the Model predicts display names as a separate field along with the explained output. The predicted display name must has the same shape of the explained output, and can be located using output_index. |  [optional] [readonly] |
|**featureAttributions** | **Any** | Output only. Attributions of each explained feature. Features are extracted from the prediction instances according to explanation metadata for inputs. The value is a struct, whose keys are the name of the feature. The values are how much the feature in the instance contributed to the predicted result. The format of the value is determined by the feature&#39;s input format: * If the feature is a scalar value, the attribution value is a floating number. * If the feature is an array of scalar values, the attribution value is an array. * If the feature is a struct, the attribution value is a struct. The keys in the attribution value struct are the same as the keys in the feature struct. The formats of the values in the attribution struct are determined by the formats of the values in the feature struct. The ExplanationMetadata.feature_attributions_schema_uri field, pointed to by the ExplanationSpec field of the Endpoint.deployed_models object, points to the schema file that describes the features and their attribution values (if it is populated). |  [optional] [readonly] |
|**outputName** | **String** | Output only. Name of the explain output. Specified as the key in ExplanationMetadata.outputs. |  [optional] [readonly] |
|**instanceOutputValue** | **Double** | Output only. Model predicted output on the corresponding explanation instance. The field name of the output is determined by the key in ExplanationMetadata.outputs. If the Model predicted output has multiple dimensions, this is the value in the output located by output_index. |  [optional] [readonly] |
|**approximationError** | **Double** | Output only. Error of feature_attributions caused by approximation used in the explanation method. Lower value means more precise attributions. * For Sampled Shapley attribution, increasing path_count might reduce the error. * For Integrated Gradients attribution, increasing step_count might reduce the error. * For XRAI attribution, increasing step_count might reduce the error. See [this introduction](/vertex-ai/docs/explainable-ai/overview) for more information. |  [optional] [readonly] |
|**outputIndex** | **List&lt;Integer&gt;** | Output only. The index that locates the explained prediction output. If the prediction output is a scalar value, output_index is not populated. If the prediction output has multiple dimensions, the length of the output_index list is the same as the number of dimensions of the output. The i-th element in output_index is the element index of the i-th dimension of the output vector. Indices start from 0. |  [optional] |
|**baselineOutputValue** | **Double** | Output only. Model predicted output if the input instance is constructed from the baselines of all the features defined in ExplanationMetadata.inputs. The field name of the output is determined by the key in ExplanationMetadata.outputs. If the Model&#39;s predicted output has multiple dimensions (rank &gt; 1), this is the value in the output located by output_index. If there are multiple baselines, their output values are averaged. |  [optional] [readonly] |



