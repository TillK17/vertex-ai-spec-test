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
import org.openapitools.client.model.GoogleCloudAiplatformV1ReservationAffinity;

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
 * Specification of a single machine.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T10:15:10.793031100+01:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GoogleCloudAiplatformV1MachineSpec {
  public static final String SERIALIZED_NAME_ACCELERATOR_COUNT = "acceleratorCount";
  @SerializedName(SERIALIZED_NAME_ACCELERATOR_COUNT)
  private Integer acceleratorCount;

  public static final String SERIALIZED_NAME_TPU_TOPOLOGY = "tpuTopology";
  @SerializedName(SERIALIZED_NAME_TPU_TOPOLOGY)
  private String tpuTopology;

  public static final String SERIALIZED_NAME_MACHINE_TYPE = "machineType";
  @SerializedName(SERIALIZED_NAME_MACHINE_TYPE)
  private String machineType;

  /**
   * Immutable. The type of accelerator(s) that may be attached to the machine as per accelerator_count.
   */
  @JsonAdapter(AcceleratorTypeEnum.Adapter.class)
  public enum AcceleratorTypeEnum {
    ACCELERATOR_TYPE_UNSPECIFIED("ACCELERATOR_TYPE_UNSPECIFIED"),
    
    NVIDIA_TESLA_K80("NVIDIA_TESLA_K80"),
    
    NVIDIA_TESLA_P100("NVIDIA_TESLA_P100"),
    
    NVIDIA_TESLA_V100("NVIDIA_TESLA_V100"),
    
    NVIDIA_TESLA_P4("NVIDIA_TESLA_P4"),
    
    NVIDIA_TESLA_T4("NVIDIA_TESLA_T4"),
    
    NVIDIA_TESLA_A100("NVIDIA_TESLA_A100"),
    
    NVIDIA_A100_80_GB("NVIDIA_A100_80GB"),
    
    NVIDIA_L4("NVIDIA_L4"),
    
    NVIDIA_H100_80_GB("NVIDIA_H100_80GB"),
    
    TPU_V2("TPU_V2"),
    
    TPU_V3("TPU_V3"),
    
    TPU_V4_POD("TPU_V4_POD"),
    
    TPU_V5_LITEPOD("TPU_V5_LITEPOD");

    private String value;

    AcceleratorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AcceleratorTypeEnum fromValue(String value) {
      for (AcceleratorTypeEnum b : AcceleratorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AcceleratorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AcceleratorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AcceleratorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AcceleratorTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AcceleratorTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ACCELERATOR_TYPE = "acceleratorType";
  @SerializedName(SERIALIZED_NAME_ACCELERATOR_TYPE)
  private AcceleratorTypeEnum acceleratorType;

  public static final String SERIALIZED_NAME_RESERVATION_AFFINITY = "reservationAffinity";
  @SerializedName(SERIALIZED_NAME_RESERVATION_AFFINITY)
  private GoogleCloudAiplatformV1ReservationAffinity reservationAffinity;

  public GoogleCloudAiplatformV1MachineSpec() {
  }

  public GoogleCloudAiplatformV1MachineSpec acceleratorCount(Integer acceleratorCount) {
    this.acceleratorCount = acceleratorCount;
    return this;
  }

  /**
   * The number of accelerators to attach to the machine.
   * @return acceleratorCount
   */
  @javax.annotation.Nullable
  public Integer getAcceleratorCount() {
    return acceleratorCount;
  }

  public void setAcceleratorCount(Integer acceleratorCount) {
    this.acceleratorCount = acceleratorCount;
  }


  public GoogleCloudAiplatformV1MachineSpec tpuTopology(String tpuTopology) {
    this.tpuTopology = tpuTopology;
    return this;
  }

  /**
   * Immutable. The topology of the TPUs. Corresponds to the TPU topologies available from GKE. (Example: tpu_topology: \&quot;2x2x1\&quot;).
   * @return tpuTopology
   */
  @javax.annotation.Nullable
  public String getTpuTopology() {
    return tpuTopology;
  }

  public void setTpuTopology(String tpuTopology) {
    this.tpuTopology = tpuTopology;
  }


  public GoogleCloudAiplatformV1MachineSpec machineType(String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * Immutable. The type of the machine. See the [list of machine types supported for prediction](https://cloud.google.com/vertex-ai/docs/predictions/configure-compute#machine-types) See the [list of machine types supported for custom training](https://cloud.google.com/vertex-ai/docs/training/configure-compute#machine-types). For DeployedModel this field is optional, and the default value is &#x60;n1-standard-2&#x60;. For BatchPredictionJob or as part of WorkerPoolSpec this field is required.
   * @return machineType
   */
  @javax.annotation.Nullable
  public String getMachineType() {
    return machineType;
  }

  public void setMachineType(String machineType) {
    this.machineType = machineType;
  }


  public GoogleCloudAiplatformV1MachineSpec acceleratorType(AcceleratorTypeEnum acceleratorType) {
    this.acceleratorType = acceleratorType;
    return this;
  }

  /**
   * Immutable. The type of accelerator(s) that may be attached to the machine as per accelerator_count.
   * @return acceleratorType
   */
  @javax.annotation.Nullable
  public AcceleratorTypeEnum getAcceleratorType() {
    return acceleratorType;
  }

  public void setAcceleratorType(AcceleratorTypeEnum acceleratorType) {
    this.acceleratorType = acceleratorType;
  }


  public GoogleCloudAiplatformV1MachineSpec reservationAffinity(GoogleCloudAiplatformV1ReservationAffinity reservationAffinity) {
    this.reservationAffinity = reservationAffinity;
    return this;
  }

  /**
   * Optional. Immutable. Configuration controlling how this resource pool consumes reservation.
   * @return reservationAffinity
   */
  @javax.annotation.Nullable
  public GoogleCloudAiplatformV1ReservationAffinity getReservationAffinity() {
    return reservationAffinity;
  }

  public void setReservationAffinity(GoogleCloudAiplatformV1ReservationAffinity reservationAffinity) {
    this.reservationAffinity = reservationAffinity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudAiplatformV1MachineSpec googleCloudAiplatformV1MachineSpec = (GoogleCloudAiplatformV1MachineSpec) o;
    return Objects.equals(this.acceleratorCount, googleCloudAiplatformV1MachineSpec.acceleratorCount) &&
        Objects.equals(this.tpuTopology, googleCloudAiplatformV1MachineSpec.tpuTopology) &&
        Objects.equals(this.machineType, googleCloudAiplatformV1MachineSpec.machineType) &&
        Objects.equals(this.acceleratorType, googleCloudAiplatformV1MachineSpec.acceleratorType) &&
        Objects.equals(this.reservationAffinity, googleCloudAiplatformV1MachineSpec.reservationAffinity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceleratorCount, tpuTopology, machineType, acceleratorType, reservationAffinity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudAiplatformV1MachineSpec {\n");
    sb.append("    acceleratorCount: ").append(toIndentedString(acceleratorCount)).append("\n");
    sb.append("    tpuTopology: ").append(toIndentedString(tpuTopology)).append("\n");
    sb.append("    machineType: ").append(toIndentedString(machineType)).append("\n");
    sb.append("    acceleratorType: ").append(toIndentedString(acceleratorType)).append("\n");
    sb.append("    reservationAffinity: ").append(toIndentedString(reservationAffinity)).append("\n");
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
    openapiFields.add("acceleratorCount");
    openapiFields.add("tpuTopology");
    openapiFields.add("machineType");
    openapiFields.add("acceleratorType");
    openapiFields.add("reservationAffinity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudAiplatformV1MachineSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudAiplatformV1MachineSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudAiplatformV1MachineSpec is not found in the empty JSON string", GoogleCloudAiplatformV1MachineSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudAiplatformV1MachineSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudAiplatformV1MachineSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tpuTopology") != null && !jsonObj.get("tpuTopology").isJsonNull()) && !jsonObj.get("tpuTopology").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tpuTopology` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tpuTopology").toString()));
      }
      if ((jsonObj.get("machineType") != null && !jsonObj.get("machineType").isJsonNull()) && !jsonObj.get("machineType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `machineType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("machineType").toString()));
      }
      if ((jsonObj.get("acceleratorType") != null && !jsonObj.get("acceleratorType").isJsonNull()) && !jsonObj.get("acceleratorType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acceleratorType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acceleratorType").toString()));
      }
      // validate the optional field `acceleratorType`
      if (jsonObj.get("acceleratorType") != null && !jsonObj.get("acceleratorType").isJsonNull()) {
        AcceleratorTypeEnum.validateJsonElement(jsonObj.get("acceleratorType"));
      }
      // validate the optional field `reservationAffinity`
      if (jsonObj.get("reservationAffinity") != null && !jsonObj.get("reservationAffinity").isJsonNull()) {
        GoogleCloudAiplatformV1ReservationAffinity.validateJsonElement(jsonObj.get("reservationAffinity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudAiplatformV1MachineSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudAiplatformV1MachineSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudAiplatformV1MachineSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudAiplatformV1MachineSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudAiplatformV1MachineSpec>() {
           @Override
           public void write(JsonWriter out, GoogleCloudAiplatformV1MachineSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudAiplatformV1MachineSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudAiplatformV1MachineSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudAiplatformV1MachineSpec
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudAiplatformV1MachineSpec
   */
  public static GoogleCloudAiplatformV1MachineSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudAiplatformV1MachineSpec.class);
  }

  /**
   * Convert an instance of GoogleCloudAiplatformV1MachineSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

