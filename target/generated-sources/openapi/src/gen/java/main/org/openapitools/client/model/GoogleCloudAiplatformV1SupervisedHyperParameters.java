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
 * Hyperparameters for SFT.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:54:52.538010900+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1SupervisedHyperParameters {
  /**
   * Optional. Adapter size for tuning.
   */
  @JsonAdapter(AdapterSizeEnum.Adapter.class)
  public enum AdapterSizeEnum {
    UNSPECIFIED("ADAPTER_SIZE_UNSPECIFIED"),
    
    ONE("ADAPTER_SIZE_ONE"),
    
    FOUR("ADAPTER_SIZE_FOUR"),
    
    EIGHT("ADAPTER_SIZE_EIGHT"),
    
    SIXTEEN("ADAPTER_SIZE_SIXTEEN"),
    
    THIRTY_TWO("ADAPTER_SIZE_THIRTY_TWO");

    private String value;

    AdapterSizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AdapterSizeEnum fromValue(String value) {
      for (AdapterSizeEnum b : AdapterSizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AdapterSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AdapterSizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AdapterSizeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AdapterSizeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AdapterSizeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ADAPTER_SIZE = "adapterSize";
  @SerializedName(SERIALIZED_NAME_ADAPTER_SIZE)
  private AdapterSizeEnum adapterSize;

  public static final String SERIALIZED_NAME_LEARNING_RATE_MULTIPLIER = "learningRateMultiplier";
  @SerializedName(SERIALIZED_NAME_LEARNING_RATE_MULTIPLIER)
  private Double learningRateMultiplier;

  public static final String SERIALIZED_NAME_EPOCH_COUNT = "epochCount";
  @SerializedName(SERIALIZED_NAME_EPOCH_COUNT)
  private String epochCount;

  public GoogleCloudAiplatformV1SupervisedHyperParameters() {
  }

  public GoogleCloudAiplatformV1SupervisedHyperParameters adapterSize(AdapterSizeEnum adapterSize) {
    this.adapterSize = adapterSize;
    return this;
  }

  /**
   * Optional. Adapter size for tuning.
   * @return adapterSize
   */
  @javax.annotation.Nullable
  public AdapterSizeEnum getAdapterSize() {
    return adapterSize;
  }

  public void setAdapterSize(AdapterSizeEnum adapterSize) {
    this.adapterSize = adapterSize;
  }


  public GoogleCloudAiplatformV1SupervisedHyperParameters learningRateMultiplier(Double learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
    return this;
  }

  /**
   * Optional. Multiplier for adjusting the default learning rate.
   * @return learningRateMultiplier
   */
  @javax.annotation.Nullable
  public Double getLearningRateMultiplier() {
    return learningRateMultiplier;
  }

  public void setLearningRateMultiplier(Double learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }


  public GoogleCloudAiplatformV1SupervisedHyperParameters epochCount(String epochCount) {
    this.epochCount = epochCount;
    return this;
  }

  /**
   * Optional. Number of complete passes the model makes over the entire training dataset during training.
   * @return epochCount
   */
  @javax.annotation.Nullable
  public String getEpochCount() {
    return epochCount;
  }

  public void setEpochCount(String epochCount) {
    this.epochCount = epochCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1SupervisedHyperParameters googleCloudAiplatformV1SupervisedHyperParameters = (GoogleCloudAiplatformV1SupervisedHyperParameters) o;
    return Objects.equals(this.adapterSize, googleCloudAiplatformV1SupervisedHyperParameters.adapterSize) &&
        Objects.equals(this.learningRateMultiplier, googleCloudAiplatformV1SupervisedHyperParameters.learningRateMultiplier) &&
        Objects.equals(this.epochCount, googleCloudAiplatformV1SupervisedHyperParameters.epochCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adapterSize, learningRateMultiplier, epochCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1SupervisedHyperParameters {\n");
    sb.append("    adapterSize: ").append(toIndentedString(adapterSize)).append("\n");
    sb.append("    learningRateMultiplier: ").append(toIndentedString(learningRateMultiplier)).append("\n");
    sb.append("    epochCount: ").append(toIndentedString(epochCount)).append("\n");
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
    openapiFields.add("adapterSize");
    openapiFields.add("learningRateMultiplier");
    openapiFields.add("epochCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1SupervisedHyperParameters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1SupervisedHyperParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1SupervisedHyperParameters is not found in the empty JSON string", GoogleCloudAiplatformV1SupervisedHyperParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1SupervisedHyperParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1SupervisedHyperParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("adapterSize") != null && !jsonObj.get("adapterSize").isJsonNull()) && !jsonObj.get("adapterSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adapterSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adapterSize").toString()));
      }
      // validate the optional field `adapterSize`
      if (jsonObj.get("adapterSize") != null && !jsonObj.get("adapterSize").isJsonNull()) {
        AdapterSizeEnum.validateJsonElement(jsonObj.get("adapterSize"));
      }
      if ((jsonObj.get("epochCount") != null && !jsonObj.get("epochCount").isJsonNull()) && !jsonObj.get("epochCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `epochCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("epochCount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1SupervisedHyperParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1SupervisedHyperParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1SupervisedHyperParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1SupervisedHyperParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1SupervisedHyperParameters>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1SupervisedHyperParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1SupervisedHyperParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1SupervisedHyperParameters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1SupervisedHyperParameters
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1SupervisedHyperParameters
   */
  public static GoogleCloudAiplatformV1SupervisedHyperParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1SupervisedHyperParameters.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1SupervisedHyperParameters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
