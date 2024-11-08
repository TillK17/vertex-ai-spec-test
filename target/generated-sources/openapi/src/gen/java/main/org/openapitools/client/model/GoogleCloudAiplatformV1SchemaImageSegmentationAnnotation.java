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
import org.openapitools.client.model.GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationMaskAnnotation;
import org.openapitools.client.model.GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolygonAnnotation;
import org.openapitools.client.model.GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolylineAnnotation;

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
 * Annotation details specific to image segmentation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation {
  public static final String SERIALIZED_NAME_POLYLINE_ANNOTATION = "polylineAnnotation";
  @SerializedName(SERIALIZED_NAME_POLYLINE_ANNOTATION)
  private GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolylineAnnotation polylineAnnotation;

  public static final String SERIALIZED_NAME_POLYGON_ANNOTATION = "polygonAnnotation";
  @SerializedName(SERIALIZED_NAME_POLYGON_ANNOTATION)
  private GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolygonAnnotation polygonAnnotation;

  public static final String SERIALIZED_NAME_MASK_ANNOTATION = "maskAnnotation";
  @SerializedName(SERIALIZED_NAME_MASK_ANNOTATION)
  private GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationMaskAnnotation maskAnnotation;

  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation() {
  }

  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation polylineAnnotation(GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolylineAnnotation polylineAnnotation) {
    this.polylineAnnotation = polylineAnnotation;
    return this;
  }

  /**
   * Polyline annotation.
   * @return polylineAnnotation
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolylineAnnotation getPolylineAnnotation() {
    return polylineAnnotation;
  }

  public void setPolylineAnnotation(GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolylineAnnotation polylineAnnotation) {
    this.polylineAnnotation = polylineAnnotation;
  }


  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation polygonAnnotation(GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolygonAnnotation polygonAnnotation) {
    this.polygonAnnotation = polygonAnnotation;
    return this;
  }

  /**
   * Polygon annotation.
   * @return polygonAnnotation
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolygonAnnotation getPolygonAnnotation() {
    return polygonAnnotation;
  }

  public void setPolygonAnnotation(GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolygonAnnotation polygonAnnotation) {
    this.polygonAnnotation = polygonAnnotation;
  }


  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation maskAnnotation(GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationMaskAnnotation maskAnnotation) {
    this.maskAnnotation = maskAnnotation;
    return this;
  }

  /**
   * Mask based segmentation annotation. Only one mask annotation can exist for one image.
   * @return maskAnnotation
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationMaskAnnotation getMaskAnnotation() {
    return maskAnnotation;
  }

  public void setMaskAnnotation(GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationMaskAnnotation maskAnnotation) {
    this.maskAnnotation = maskAnnotation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation googleCloudAiplatformV1SchemaImageSegmentationAnnotation = (GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation) o;
    return Objects.equals(this.polylineAnnotation, googleCloudAiplatformV1SchemaImageSegmentationAnnotation.polylineAnnotation) &&
        Objects.equals(this.polygonAnnotation, googleCloudAiplatformV1SchemaImageSegmentationAnnotation.polygonAnnotation) &&
        Objects.equals(this.maskAnnotation, googleCloudAiplatformV1SchemaImageSegmentationAnnotation.maskAnnotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(polylineAnnotation, polygonAnnotation, maskAnnotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation {\n");
    sb.append("    polylineAnnotation: ").append(toIndentedString(polylineAnnotation)).append("\n");
    sb.append("    polygonAnnotation: ").append(toIndentedString(polygonAnnotation)).append("\n");
    sb.append("    maskAnnotation: ").append(toIndentedString(maskAnnotation)).append("\n");
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
    openapiFields.add("polylineAnnotation");
    openapiFields.add("polygonAnnotation");
    openapiFields.add("maskAnnotation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation is not found in the empty JSON string", GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `polylineAnnotation`
      if (jsonObj.get("polylineAnnotation") != null && !jsonObj.get("polylineAnnotation").isJsonNull()) {
        GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolylineAnnotation.validateJsonElement(jsonObj.get("polylineAnnotation"));
      }
      // validate the optional field `polygonAnnotation`
      if (jsonObj.get("polygonAnnotation") != null && !jsonObj.get("polygonAnnotation").isJsonNull()) {
        GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolygonAnnotation.validateJsonElement(jsonObj.get("polygonAnnotation"));
      }
      // validate the optional field `maskAnnotation`
      if (jsonObj.get("maskAnnotation") != null && !jsonObj.get("maskAnnotation").isJsonNull()) {
        GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationMaskAnnotation.validateJsonElement(jsonObj.get("maskAnnotation"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation
   */
  public static GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

