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
 * Visualization configurations for image explanation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization {
  public static final String SERIALIZED_NAME_CLIP_PERCENT_LOWERBOUND = "clipPercentLowerbound";
  @SerializedName(SERIALIZED_NAME_CLIP_PERCENT_LOWERBOUND)
  private Float clipPercentLowerbound;

  /**
   * How the original image is displayed in the visualization. Adjusting the overlay can help increase visual clarity if the original image makes it difficult to view the visualization. Defaults to NONE.
   */
  @JsonAdapter(OverlayTypeEnum.Adapter.class)
  public enum OverlayTypeEnum {
    OVERLAY_TYPE_UNSPECIFIED("OVERLAY_TYPE_UNSPECIFIED"),
    
    NONE("NONE"),
    
    ORIGINAL("ORIGINAL"),
    
    GRAYSCALE("GRAYSCALE"),
    
    MASK_BLACK("MASK_BLACK");

    private String value;

    OverlayTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OverlayTypeEnum fromValue(String value) {
      for (OverlayTypeEnum b : OverlayTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OverlayTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OverlayTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OverlayTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OverlayTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OverlayTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OVERLAY_TYPE = "overlayType";
  @SerializedName(SERIALIZED_NAME_OVERLAY_TYPE)
  private OverlayTypeEnum overlayType;

  /**
   * Whether to only highlight pixels with positive contributions, negative or both. Defaults to POSITIVE.
   */
  @JsonAdapter(PolarityEnum.Adapter.class)
  public enum PolarityEnum {
    POLARITY_UNSPECIFIED("POLARITY_UNSPECIFIED"),
    
    POSITIVE("POSITIVE"),
    
    NEGATIVE("NEGATIVE"),
    
    BOTH("BOTH");

    private String value;

    PolarityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PolarityEnum fromValue(String value) {
      for (PolarityEnum b : PolarityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PolarityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PolarityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PolarityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PolarityEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PolarityEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_POLARITY = "polarity";
  @SerializedName(SERIALIZED_NAME_POLARITY)
  private PolarityEnum polarity;

  public static final String SERIALIZED_NAME_CLIP_PERCENT_UPPERBOUND = "clipPercentUpperbound";
  @SerializedName(SERIALIZED_NAME_CLIP_PERCENT_UPPERBOUND)
  private Float clipPercentUpperbound;

  /**
   * Type of the image visualization. Only applicable to Integrated Gradients attribution. OUTLINES shows regions of attribution, while PIXELS shows per-pixel attribution. Defaults to OUTLINES.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TYPE_UNSPECIFIED("TYPE_UNSPECIFIED"),
    
    PIXELS("PIXELS"),
    
    OUTLINES("OUTLINES");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * The color scheme used for the highlighted areas. Defaults to PINK_GREEN for Integrated Gradients attribution, which shows positive attributions in green and negative in pink. Defaults to VIRIDIS for XRAI attribution, which highlights the most influential regions in yellow and the least influential in blue.
   */
  @JsonAdapter(ColorMapEnum.Adapter.class)
  public enum ColorMapEnum {
    COLOR_MAP_UNSPECIFIED("COLOR_MAP_UNSPECIFIED"),
    
    PINK_GREEN("PINK_GREEN"),
    
    VIRIDIS("VIRIDIS"),
    
    RED("RED"),
    
    GREEN("GREEN"),
    
    RED_GREEN("RED_GREEN"),
    
    PINK_WHITE_GREEN("PINK_WHITE_GREEN");

    private String value;

    ColorMapEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ColorMapEnum fromValue(String value) {
      for (ColorMapEnum b : ColorMapEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ColorMapEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColorMapEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColorMapEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ColorMapEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ColorMapEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_COLOR_MAP = "colorMap";
  @SerializedName(SERIALIZED_NAME_COLOR_MAP)
  private ColorMapEnum colorMap;

  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization() {
  }

  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization clipPercentLowerbound(Float clipPercentLowerbound) {
    this.clipPercentLowerbound = clipPercentLowerbound;
    return this;
  }

  /**
   * Excludes attributions below the specified percentile, from the highlighted areas. Defaults to 62.
   * @return clipPercentLowerbound
   */
  @javax.annotation.Nullable
  public Float getClipPercentLowerbound() {
    return clipPercentLowerbound;
  }

  public void setClipPercentLowerbound(Float clipPercentLowerbound) {
    this.clipPercentLowerbound = clipPercentLowerbound;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization overlayType(OverlayTypeEnum overlayType) {
    this.overlayType = overlayType;
    return this;
  }

  /**
   * How the original image is displayed in the visualization. Adjusting the overlay can help increase visual clarity if the original image makes it difficult to view the visualization. Defaults to NONE.
   * @return overlayType
   */
  @javax.annotation.Nullable
  public OverlayTypeEnum getOverlayType() {
    return overlayType;
  }

  public void setOverlayType(OverlayTypeEnum overlayType) {
    this.overlayType = overlayType;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization polarity(PolarityEnum polarity) {
    this.polarity = polarity;
    return this;
  }

  /**
   * Whether to only highlight pixels with positive contributions, negative or both. Defaults to POSITIVE.
   * @return polarity
   */
  @javax.annotation.Nullable
  public PolarityEnum getPolarity() {
    return polarity;
  }

  public void setPolarity(PolarityEnum polarity) {
    this.polarity = polarity;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization clipPercentUpperbound(Float clipPercentUpperbound) {
    this.clipPercentUpperbound = clipPercentUpperbound;
    return this;
  }

  /**
   * Excludes attributions above the specified percentile from the highlighted areas. Using the clip_percent_upperbound and clip_percent_lowerbound together can be useful for filtering out noise and making it easier to see areas of strong attribution. Defaults to 99.9.
   * @return clipPercentUpperbound
   */
  @javax.annotation.Nullable
  public Float getClipPercentUpperbound() {
    return clipPercentUpperbound;
  }

  public void setClipPercentUpperbound(Float clipPercentUpperbound) {
    this.clipPercentUpperbound = clipPercentUpperbound;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the image visualization. Only applicable to Integrated Gradients attribution. OUTLINES shows regions of attribution, while PIXELS shows per-pixel attribution. Defaults to OUTLINES.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization colorMap(ColorMapEnum colorMap) {
    this.colorMap = colorMap;
    return this;
  }

  /**
   * The color scheme used for the highlighted areas. Defaults to PINK_GREEN for Integrated Gradients attribution, which shows positive attributions in green and negative in pink. Defaults to VIRIDIS for XRAI attribution, which highlights the most influential regions in yellow and the least influential in blue.
   * @return colorMap
   */
  @javax.annotation.Nullable
  public ColorMapEnum getColorMap() {
    return colorMap;
  }

  public void setColorMap(ColorMapEnum colorMap) {
    this.colorMap = colorMap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization googleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization = (GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization) o;
    return Objects.equals(this.clipPercentLowerbound, googleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization.clipPercentLowerbound) &&
        Objects.equals(this.overlayType, googleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization.overlayType) &&
        Objects.equals(this.polarity, googleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization.polarity) &&
        Objects.equals(this.clipPercentUpperbound, googleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization.clipPercentUpperbound) &&
        Objects.equals(this.type, googleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization.type) &&
        Objects.equals(this.colorMap, googleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization.colorMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clipPercentLowerbound, overlayType, polarity, clipPercentUpperbound, type, colorMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization {\n");
    sb.append("    clipPercentLowerbound: ").append(toIndentedString(clipPercentLowerbound)).append("\n");
    sb.append("    overlayType: ").append(toIndentedString(overlayType)).append("\n");
    sb.append("    polarity: ").append(toIndentedString(polarity)).append("\n");
    sb.append("    clipPercentUpperbound: ").append(toIndentedString(clipPercentUpperbound)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    colorMap: ").append(toIndentedString(colorMap)).append("\n");
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
    openapiFields.add("clipPercentLowerbound");
    openapiFields.add("overlayType");
    openapiFields.add("polarity");
    openapiFields.add("clipPercentUpperbound");
    openapiFields.add("type");
    openapiFields.add("colorMap");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization is not found in the empty JSON string", GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("overlayType") != null && !jsonObj.get("overlayType").isJsonNull()) && !jsonObj.get("overlayType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `overlayType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("overlayType").toString()));
      }
      // validate the optional field `overlayType`
      if (jsonObj.get("overlayType") != null && !jsonObj.get("overlayType").isJsonNull()) {
        OverlayTypeEnum.validateJsonElement(jsonObj.get("overlayType"));
      }
      if ((jsonObj.get("polarity") != null && !jsonObj.get("polarity").isJsonNull()) && !jsonObj.get("polarity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `polarity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("polarity").toString()));
      }
      // validate the optional field `polarity`
      if (jsonObj.get("polarity") != null && !jsonObj.get("polarity").isJsonNull()) {
        PolarityEnum.validateJsonElement(jsonObj.get("polarity"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("colorMap") != null && !jsonObj.get("colorMap").isJsonNull()) && !jsonObj.get("colorMap").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `colorMap` to be a primitive type in the JSON string but got `%s`", jsonObj.get("colorMap").toString()));
      }
      // validate the optional field `colorMap`
      if (jsonObj.get("colorMap") != null && !jsonObj.get("colorMap").isJsonNull()) {
        ColorMapEnum.validateJsonElement(jsonObj.get("colorMap"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization
   */
  public static GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1ExplanationMetadataInputMetadataVisualization to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
