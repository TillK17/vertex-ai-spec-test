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
import java.util.Arrays;
import org.openapitools.client.model.GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpec;

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
 * Definition of a slice.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ModelEvaluationSliceSlice {
  public static final String SERIALIZED_NAME_SLICE_SPEC = "sliceSpec";
  @SerializedName(SERIALIZED_NAME_SLICE_SPEC)
  private GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpec sliceSpec;

  public static final String SERIALIZED_NAME_DIMENSION = "dimension";
  @SerializedName(SERIALIZED_NAME_DIMENSION)
  private String dimension;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public GoogleCloudAiplatformV1ModelEvaluationSliceSlice() {
  }

  public GoogleCloudAiplatformV1ModelEvaluationSliceSlice(
     GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpec sliceSpec, 
     String dimension, 
     String value
  ) {
    this();
    this.sliceSpec = sliceSpec;
    this.dimension = dimension;
    this.value = value;
  }

  /**
   * Output only. Specification for how the data was sliced.
   * @return sliceSpec
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpec getSliceSpec() {
    return sliceSpec;
  }



  /**
   * Output only. The dimension of the slice. Well-known dimensions are: * &#x60;annotationSpec&#x60;: This slice is on the test data that has either ground truth or prediction with AnnotationSpec.display_name equals to value. * &#x60;slice&#x60;: This slice is a user customized slice defined by its SliceSpec.
   * @return dimension
   */
  @javax.annotation.Nullable
  public String getDimension() {
    return dimension;
  }



  /**
   * Output only. The value of the dimension in this slice.
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ModelEvaluationSliceSlice googleCloudAiplatformV1ModelEvaluationSliceSlice = (GoogleCloudAiplatformV1ModelEvaluationSliceSlice) o;
    return Objects.equals(this.sliceSpec, googleCloudAiplatformV1ModelEvaluationSliceSlice.sliceSpec) &&
        Objects.equals(this.dimension, googleCloudAiplatformV1ModelEvaluationSliceSlice.dimension) &&
        Objects.equals(this.value, googleCloudAiplatformV1ModelEvaluationSliceSlice.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sliceSpec, dimension, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ModelEvaluationSliceSlice {\n");
    sb.append("    sliceSpec: ").append(toIndentedString(sliceSpec)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("sliceSpec");
    openapiFields.add("dimension");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ModelEvaluationSliceSlice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ModelEvaluationSliceSlice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ModelEvaluationSliceSlice is not found in the empty JSON string", GoogleCloudAiplatformV1ModelEvaluationSliceSlice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ModelEvaluationSliceSlice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ModelEvaluationSliceSlice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `sliceSpec`
      if (jsonObj.get("sliceSpec") != null && !jsonObj.get("sliceSpec").isJsonNull()) {
        GoogleCloudAiplatformV1ModelEvaluationSliceSliceSliceSpec.validateJsonElement(jsonObj.get("sliceSpec"));
      }
      if ((jsonObj.get("dimension") != null && !jsonObj.get("dimension").isJsonNull()) && !jsonObj.get("dimension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dimension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dimension").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ModelEvaluationSliceSlice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ModelEvaluationSliceSlice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ModelEvaluationSliceSlice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ModelEvaluationSliceSlice.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ModelEvaluationSliceSlice>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ModelEvaluationSliceSlice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ModelEvaluationSliceSlice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ModelEvaluationSliceSlice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ModelEvaluationSliceSlice
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ModelEvaluationSliceSlice
   */
  public static GoogleCloudAiplatformV1ModelEvaluationSliceSlice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ModelEvaluationSliceSlice.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ModelEvaluationSliceSlice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

