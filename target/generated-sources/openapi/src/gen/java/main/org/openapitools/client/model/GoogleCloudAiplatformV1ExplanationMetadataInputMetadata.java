/*
 * Vertex AI API
 * Train high-quality custom machine learning models with minimal machine learning expertise and effort.
 *
 * The version of the OpenAPI document: v1
 * Contact: info@stackql.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Any;
import org.openapitools.client.model.GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain;
import org.openapitools.client.model.GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Metadata of the input of a feature. Fields other than InputMetadata.input_baselines are applicable only for Models that are using Vertex AI-provided images for Tensorflow.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ExplanationMetadataInputMetadata {
  public static final String SERIALIZED_NAME_ENCODED_TENSOR_NAME = "encodedTensorName";
  @SerializedName(SERIALIZED_NAME_ENCODED_TENSOR_NAME)
  private String encodedTensorName;

  public static final String SERIALIZED_NAME_DENSE_SHAPE_TENSOR_NAME = "denseShapeTensorName";
  @SerializedName(SERIALIZED_NAME_DENSE_SHAPE_TENSOR_NAME)
  private String denseShapeTensorName;

  /**
   * Defines how the feature is encoded into the input tensor. Defaults to IDENTITY.
   */
  @JsonAdapter(EncodingEnum.Adapter.class)
  public enum EncodingEnum {
    ENCODING_UNSPECIFIED("ENCODING_UNSPECIFIED"),
    
    IDENTITY("IDENTITY"),
    
    BAG_OF_FEATURES("BAG_OF_FEATURES"),
    
    BAG_OF_FEATURES_SPARSE("BAG_OF_FEATURES_SPARSE"),
    
    INDICATOR("INDICATOR"),
    
    COMBINED_EMBEDDING("COMBINED_EMBEDDING"),
    
    CONCAT_EMBEDDING("CONCAT_EMBEDDING");

    private String value;

    EncodingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EncodingEnum fromValue(String value) {
      for (EncodingEnum b : EncodingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EncodingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncodingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EncodingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EncodingEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EncodingEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ENCODING = "encoding";
  @SerializedName(SERIALIZED_NAME_ENCODING)
  private EncodingEnum encoding;

  public static final String SERIALIZED_NAME_MODALITY = "modality";
  @SerializedName(SERIALIZED_NAME_MODALITY)
  private String modality;

  public static final String SERIALIZED_NAME_INDICES_TENSOR_NAME = "indicesTensorName";
  @SerializedName(SERIALIZED_NAME_INDICES_TENSOR_NAME)
  private String indicesTensorName;

  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_INPUT_TENSOR_NAME = "inputTensorName";
  @SerializedName(SERIALIZED_NAME_INPUT_TENSOR_NAME)
  private String inputTensorName;

  public static final String SERIALIZED_NAME_FEATURE_VALUE_DOMAIN = "featureValueDomain";
  @SerializedName(SERIALIZED_NAME_FEATURE_VALUE_DOMAIN)
  private GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain featureValueDomain;

  public static final String SERIALIZED_NAME_INPUT_BASELINES = "inputBaselines";
  @SerializedName(SERIALIZED_NAME_INPUT_BASELINES)
  private List<Any> inputBaselines = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENCODED_BASELINES = "encodedBaselines";
  @SerializedName(SERIALIZED_NAME_ENCODED_BASELINES)
  private List<Any> encodedBaselines = new ArrayList<>();

  public static final String SERIALIZED_NAME_VISUALIZATION = "visualization";
  @SerializedName(SERIALIZED_NAME_VISUALIZATION)
  private GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization visualization;

  public static final String SERIALIZED_NAME_INDEX_FEATURE_MAPPING = "indexFeatureMapping";
  @SerializedName(SERIALIZED_NAME_INDEX_FEATURE_MAPPING)
  private List<String> indexFeatureMapping = new ArrayList<>();

  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata() {
  }

  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata encodedTensorName(String encodedTensorName) {
    this.encodedTensorName = encodedTensorName;
    return this;
  }

  /**
   * Encoded tensor is a transformation of the input tensor. Must be provided if choosing Integrated Gradients attribution or XRAI attribution and the input tensor is not differentiable. An encoded tensor is generated if the input tensor is encoded by a lookup table.
   * @return encodedTensorName
   */
  @javax.annotation.Nullable
  public String getEncodedTensorName() {
    return encodedTensorName;
  }

  public void setEncodedTensorName(String encodedTensorName) {
    this.encodedTensorName = encodedTensorName;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata denseShapeTensorName(String denseShapeTensorName) {
    this.denseShapeTensorName = denseShapeTensorName;
    return this;
  }

  /**
   * Specifies the shape of the values of the input if the input is a sparse representation. Refer to Tensorflow documentation for more details: https://www.tensorflow.org/api_docs/python/tf/sparse/SparseTensor.
   * @return denseShapeTensorName
   */
  @javax.annotation.Nullable
  public String getDenseShapeTensorName() {
    return denseShapeTensorName;
  }

  public void setDenseShapeTensorName(String denseShapeTensorName) {
    this.denseShapeTensorName = denseShapeTensorName;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata encoding(EncodingEnum encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * Defines how the feature is encoded into the input tensor. Defaults to IDENTITY.
   * @return encoding
   */
  @javax.annotation.Nullable
  public EncodingEnum getEncoding() {
    return encoding;
  }

  public void setEncoding(EncodingEnum encoding) {
    this.encoding = encoding;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata modality(String modality) {
    this.modality = modality;
    return this;
  }

  /**
   * Modality of the feature. Valid values are: numeric, image. Defaults to numeric.
   * @return modality
   */
  @javax.annotation.Nullable
  public String getModality() {
    return modality;
  }

  public void setModality(String modality) {
    this.modality = modality;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata indicesTensorName(String indicesTensorName) {
    this.indicesTensorName = indicesTensorName;
    return this;
  }

  /**
   * Specifies the index of the values of the input tensor. Required when the input tensor is a sparse representation. Refer to Tensorflow documentation for more details: https://www.tensorflow.org/api_docs/python/tf/sparse/SparseTensor.
   * @return indicesTensorName
   */
  @javax.annotation.Nullable
  public String getIndicesTensorName() {
    return indicesTensorName;
  }

  public void setIndicesTensorName(String indicesTensorName) {
    this.indicesTensorName = indicesTensorName;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Name of the group that the input belongs to. Features with the same group name will be treated as one feature when computing attributions. Features grouped together can have different shapes in value. If provided, there will be one single attribution generated in Attribution.feature_attributions, keyed by the group name.
   * @return groupName
   */
  @javax.annotation.Nullable
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata inputTensorName(String inputTensorName) {
    this.inputTensorName = inputTensorName;
    return this;
  }

  /**
   * Name of the input tensor for this feature. Required and is only applicable to Vertex AI-provided images for Tensorflow.
   * @return inputTensorName
   */
  @javax.annotation.Nullable
  public String getInputTensorName() {
    return inputTensorName;
  }

  public void setInputTensorName(String inputTensorName) {
    this.inputTensorName = inputTensorName;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata featureValueDomain(GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain featureValueDomain) {
    this.featureValueDomain = featureValueDomain;
    return this;
  }

  /**
   * The domain details of the input feature value. Like min/max, original mean or standard deviation if normalized.
   * @return featureValueDomain
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain getFeatureValueDomain() {
    return featureValueDomain;
  }

  public void setFeatureValueDomain(GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain featureValueDomain) {
    this.featureValueDomain = featureValueDomain;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata inputBaselines(List<Any> inputBaselines) {
    this.inputBaselines = inputBaselines;
    return this;
  }

  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata addInputBaselinesItem(Any inputBaselinesItem) {
    if (this.inputBaselines == null) {
      this.inputBaselines = new ArrayList<>();
    }
    this.inputBaselines.add(inputBaselinesItem);
    return this;
  }

  /**
   * Baseline inputs for this feature. If no baseline is specified, Vertex AI chooses the baseline for this feature. If multiple baselines are specified, Vertex AI returns the average attributions across them in Attribution.feature_attributions. For Vertex AI-provided Tensorflow images (both 1.x and 2.x), the shape of each baseline must match the shape of the input tensor. If a scalar is provided, we broadcast to the same shape as the input tensor. For custom images, the element of the baselines must be in the same format as the feature&#39;s input in the instance[]. The schema of any single instance may be specified via Endpoint&#39;s DeployedModels&#39; Model&#39;s PredictSchemata&#39;s instance_schema_uri.
   * @return inputBaselines
   */
  @javax.annotation.Nullable
  public List<Any> getInputBaselines() {
    return inputBaselines;
  }

  public void setInputBaselines(List<Any> inputBaselines) {
    this.inputBaselines = inputBaselines;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata encodedBaselines(List<Any> encodedBaselines) {
    this.encodedBaselines = encodedBaselines;
    return this;
  }

  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata addEncodedBaselinesItem(Any encodedBaselinesItem) {
    if (this.encodedBaselines == null) {
      this.encodedBaselines = new ArrayList<>();
    }
    this.encodedBaselines.add(encodedBaselinesItem);
    return this;
  }

  /**
   * A list of baselines for the encoded tensor. The shape of each baseline should match the shape of the encoded tensor. If a scalar is provided, Vertex AI broadcasts to the same shape as the encoded tensor.
   * @return encodedBaselines
   */
  @javax.annotation.Nullable
  public List<Any> getEncodedBaselines() {
    return encodedBaselines;
  }

  public void setEncodedBaselines(List<Any> encodedBaselines) {
    this.encodedBaselines = encodedBaselines;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata visualization(GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization visualization) {
    this.visualization = visualization;
    return this;
  }

  /**
   * Visualization configurations for image explanation.
   * @return visualization
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization getVisualization() {
    return visualization;
  }

  public void setVisualization(GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization visualization) {
    this.visualization = visualization;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata indexFeatureMapping(List<String> indexFeatureMapping) {
    this.indexFeatureMapping = indexFeatureMapping;
    return this;
  }

  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata addIndexFeatureMappingItem(String indexFeatureMappingItem) {
    if (this.indexFeatureMapping == null) {
      this.indexFeatureMapping = new ArrayList<>();
    }
    this.indexFeatureMapping.add(indexFeatureMappingItem);
    return this;
  }

  /**
   * A list of feature names for each index in the input tensor. Required when the input InputMetadata.encoding is BAG_OF_FEATURES, BAG_OF_FEATURES_SPARSE, INDICATOR.
   * @return indexFeatureMapping
   */
  @javax.annotation.Nullable
  public List<String> getIndexFeatureMapping() {
    return indexFeatureMapping;
  }

  public void setIndexFeatureMapping(List<String> indexFeatureMapping) {
    this.indexFeatureMapping = indexFeatureMapping;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ExplanationMetadataInputMetadata googleCloudAiplatformV1ExplanationMetadataInputMetadata = (GoogleCloudAiplatformV1ExplanationMetadataInputMetadata) o;
    return Objects.equals(this.encodedTensorName, googleCloudAiplatformV1ExplanationMetadataInputMetadata.encodedTensorName) &&
        Objects.equals(this.denseShapeTensorName, googleCloudAiplatformV1ExplanationMetadataInputMetadata.denseShapeTensorName) &&
        Objects.equals(this.encoding, googleCloudAiplatformV1ExplanationMetadataInputMetadata.encoding) &&
        Objects.equals(this.modality, googleCloudAiplatformV1ExplanationMetadataInputMetadata.modality) &&
        Objects.equals(this.indicesTensorName, googleCloudAiplatformV1ExplanationMetadataInputMetadata.indicesTensorName) &&
        Objects.equals(this.groupName, googleCloudAiplatformV1ExplanationMetadataInputMetadata.groupName) &&
        Objects.equals(this.inputTensorName, googleCloudAiplatformV1ExplanationMetadataInputMetadata.inputTensorName) &&
        Objects.equals(this.featureValueDomain, googleCloudAiplatformV1ExplanationMetadataInputMetadata.featureValueDomain) &&
        Objects.equals(this.inputBaselines, googleCloudAiplatformV1ExplanationMetadataInputMetadata.inputBaselines) &&
        Objects.equals(this.encodedBaselines, googleCloudAiplatformV1ExplanationMetadataInputMetadata.encodedBaselines) &&
        Objects.equals(this.visualization, googleCloudAiplatformV1ExplanationMetadataInputMetadata.visualization) &&
        Objects.equals(this.indexFeatureMapping, googleCloudAiplatformV1ExplanationMetadataInputMetadata.indexFeatureMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodedTensorName, denseShapeTensorName, encoding, modality, indicesTensorName, groupName, inputTensorName, featureValueDomain, inputBaselines, encodedBaselines, visualization, indexFeatureMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ExplanationMetadataInputMetadata {\n");
    sb.append("    encodedTensorName: ").append(toIndentedString(encodedTensorName)).append("\n");
    sb.append("    denseShapeTensorName: ").append(toIndentedString(denseShapeTensorName)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    modality: ").append(toIndentedString(modality)).append("\n");
    sb.append("    indicesTensorName: ").append(toIndentedString(indicesTensorName)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    inputTensorName: ").append(toIndentedString(inputTensorName)).append("\n");
    sb.append("    featureValueDomain: ").append(toIndentedString(featureValueDomain)).append("\n");
    sb.append("    inputBaselines: ").append(toIndentedString(inputBaselines)).append("\n");
    sb.append("    encodedBaselines: ").append(toIndentedString(encodedBaselines)).append("\n");
    sb.append("    visualization: ").append(toIndentedString(visualization)).append("\n");
    sb.append("    indexFeatureMapping: ").append(toIndentedString(indexFeatureMapping)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("encodedTensorName");
    openapiFields.add("denseShapeTensorName");
    openapiFields.add("encoding");
    openapiFields.add("modality");
    openapiFields.add("indicesTensorName");
    openapiFields.add("groupName");
    openapiFields.add("inputTensorName");
    openapiFields.add("featureValueDomain");
    openapiFields.add("inputBaselines");
    openapiFields.add("encodedBaselines");
    openapiFields.add("visualization");
    openapiFields.add("indexFeatureMapping");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ExplanationMetadataInputMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ExplanationMetadataInputMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ExplanationMetadataInputMetadata is not found in the empty JSON string", GoogleCloudAiplatformV1ExplanationMetadataInputMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ExplanationMetadataInputMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ExplanationMetadataInputMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("encodedTensorName") != null && !jsonObj.get("encodedTensorName").isJsonNull()) && !jsonObj.get("encodedTensorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encodedTensorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encodedTensorName").toString()));
      }
      if ((jsonObj.get("denseShapeTensorName") != null && !jsonObj.get("denseShapeTensorName").isJsonNull()) && !jsonObj.get("denseShapeTensorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `denseShapeTensorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("denseShapeTensorName").toString()));
      }
      if ((jsonObj.get("encoding") != null && !jsonObj.get("encoding").isJsonNull()) && !jsonObj.get("encoding").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encoding` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encoding").toString()));
      }
      // validate the optional field `encoding`
      if (jsonObj.get("encoding") != null && !jsonObj.get("encoding").isJsonNull()) {
        EncodingEnum.validateJsonElement(jsonObj.get("encoding"));
      }
      if ((jsonObj.get("modality") != null && !jsonObj.get("modality").isJsonNull()) && !jsonObj.get("modality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modality").toString()));
      }
      if ((jsonObj.get("indicesTensorName") != null && !jsonObj.get("indicesTensorName").isJsonNull()) && !jsonObj.get("indicesTensorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `indicesTensorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("indicesTensorName").toString()));
      }
      if ((jsonObj.get("groupName") != null && !jsonObj.get("groupName").isJsonNull()) && !jsonObj.get("groupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupName").toString()));
      }
      if ((jsonObj.get("inputTensorName") != null && !jsonObj.get("inputTensorName").isJsonNull()) && !jsonObj.get("inputTensorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inputTensorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inputTensorName").toString()));
      }
      // validate the optional field `featureValueDomain`
      if (jsonObj.get("featureValueDomain") != null && !jsonObj.get("featureValueDomain").isJsonNull()) {
        GoogleCloudAiplatformV1ExplanationMetadataInputMetadataFeatureValueDomain.validateJsonElement(jsonObj.get("featureValueDomain"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("inputBaselines") != null && !jsonObj.get("inputBaselines").isJsonNull() && !jsonObj.get("inputBaselines").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `inputBaselines` to be an array in the JSON string but got `%s`", jsonObj.get("inputBaselines").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("encodedBaselines") != null && !jsonObj.get("encodedBaselines").isJsonNull() && !jsonObj.get("encodedBaselines").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `encodedBaselines` to be an array in the JSON string but got `%s`", jsonObj.get("encodedBaselines").toString()));
      }
      // validate the optional field `visualization`
      if (jsonObj.get("visualization") != null && !jsonObj.get("visualization").isJsonNull()) {
        GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization.validateJsonElement(jsonObj.get("visualization"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("indexFeatureMapping") != null && !jsonObj.get("indexFeatureMapping").isJsonNull() && !jsonObj.get("indexFeatureMapping").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `indexFeatureMapping` to be an array in the JSON string but got `%s`", jsonObj.get("indexFeatureMapping").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ExplanationMetadataInputMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ExplanationMetadataInputMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ExplanationMetadataInputMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ExplanationMetadataInputMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ExplanationMetadataInputMetadata>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ExplanationMetadataInputMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ExplanationMetadataInputMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ExplanationMetadataInputMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ExplanationMetadataInputMetadata
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ExplanationMetadataInputMetadata
   */
  public static GoogleCloudAiplatformV1ExplanationMetadataInputMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ExplanationMetadataInputMetadata.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ExplanationMetadataInputMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

