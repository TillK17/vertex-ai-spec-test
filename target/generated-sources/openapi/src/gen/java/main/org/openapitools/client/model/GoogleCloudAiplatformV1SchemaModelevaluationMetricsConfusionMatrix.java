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
import org.openapitools.client.model.GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrixAnnotationSpecRef;

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
 * GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix {
  public static final String SERIALIZED_NAME_ANNOTATION_SPECS = "annotationSpecs";
  @SerializedName(SERIALIZED_NAME_ANNOTATION_SPECS)
  private List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrixAnnotationSpecRef> annotationSpecs = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<List<Any>> rows = new ArrayList<>();

  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix() {
  }

  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix annotationSpecs(List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrixAnnotationSpecRef> annotationSpecs) {
    this.annotationSpecs = annotationSpecs;
    return this;
  }

  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix addAnnotationSpecsItem(GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrixAnnotationSpecRef annotationSpecsItem) {
    if (this.annotationSpecs == null) {
      this.annotationSpecs = new ArrayList<>();
    }
    this.annotationSpecs.add(annotationSpecsItem);
    return this;
  }

  /**
   * AnnotationSpecs used in the confusion matrix. For AutoML Text Extraction, a special negative AnnotationSpec with empty &#x60;id&#x60; and &#x60;displayName&#x60; of \&quot;NULL\&quot; will be added as the last element.
   * @return annotationSpecs
   */
  @javax.annotation.Nullable
  public List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrixAnnotationSpecRef> getAnnotationSpecs() {
    return annotationSpecs;
  }

  public void setAnnotationSpecs(List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrixAnnotationSpecRef> annotationSpecs) {
    this.annotationSpecs = annotationSpecs;
  }


  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix rows(List<List<Any>> rows) {
    this.rows = rows;
    return this;
  }

  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix addRowsItem(List<Any> rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * Rows in the confusion matrix. The number of rows is equal to the size of &#x60;annotationSpecs&#x60;. &#x60;rowsi&#x60; is the number of DataItems that have ground truth of the &#x60;annotationSpecs[i]&#x60; and are predicted as &#x60;annotationSpecs[j]&#x60; by the Model being evaluated. For Text Extraction, when &#x60;annotationSpecs[i]&#x60; is the last element in &#x60;annotationSpecs&#x60;, i.e. the special negative AnnotationSpec, &#x60;rowsi&#x60; is the number of predicted entities of &#x60;annoatationSpec[j]&#x60; that are not labeled as any of the ground truth AnnotationSpec. When annotationSpecs[j] is the special negative AnnotationSpec, &#x60;rowsi&#x60; is the number of entities have ground truth of &#x60;annotationSpec[i]&#x60; that are not predicted as an entity by the Model. The value of the last cell, i.e. &#x60;rowi&#x60; where i &#x3D;&#x3D; j and &#x60;annotationSpec[i]&#x60; is the special negative AnnotationSpec, is always 0.
   * @return rows
   */
  @javax.annotation.Nullable
  public List<List<Any>> getRows() {
    return rows;
  }

  public void setRows(List<List<Any>> rows) {
    this.rows = rows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix googleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix = (GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix) o;
    return Objects.equals(this.annotationSpecs, googleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix.annotationSpecs) &&
        Objects.equals(this.rows, googleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationSpecs, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix {\n");
    sb.append("    annotationSpecs: ").append(toIndentedString(annotationSpecs)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
    openapiFields.add("annotationSpecs");
    openapiFields.add("rows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("annotationSpecs") != null && !jsonObj.get("annotationSpecs").isJsonNull()) {
        JsonArray jsonArrayannotationSpecs = jsonObj.getAsJsonArray("annotationSpecs");
        if (jsonArrayannotationSpecs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("annotationSpecs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `annotationSpecs` to be an array in the JSON string but got `%s`", jsonObj.get("annotationSpecs").toString()));
          }

          // validate the optional field `annotationSpecs` (array)
          for (int i = 0; i < jsonArrayannotationSpecs.size(); i++) {
            GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrixAnnotationSpecRef.validateJsonElement(jsonArrayannotationSpecs.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rows") != null && !jsonObj.get("rows").isJsonNull() && !jsonObj.get("rows").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rows` to be an array in the JSON string but got `%s`", jsonObj.get("rows").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix
   */
  public static GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaModelevaluationMetricsConfusionMatrix to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

