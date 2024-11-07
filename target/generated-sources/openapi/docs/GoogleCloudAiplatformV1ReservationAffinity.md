

# GoogleCloudAiplatformV1ReservationAffinity

A ReservationAffinity can be used to configure a Vertex AI resource (e.g., a DeployedModel) to draw its Compute Engine resources from a Shared Reservation, or exclusively from on-demand capacity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reservationAffinityType** | [**ReservationAffinityTypeEnum**](#ReservationAffinityTypeEnum) | Required. Specifies the reservation affinity type. |  [optional] |
|**values** | **List&lt;String&gt;** | Optional. Corresponds to the label values of a reservation resource. This must be the full resource name of the reservation. |  [optional] |
|**key** | **String** | Optional. Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, use &#x60;compute.googleapis.com/reservation-name&#x60; as the key and specify the name of your reservation as its value. |  [optional] |



## Enum: ReservationAffinityTypeEnum

| Name | Value |
|---- | -----|
| TYPE_UNSPECIFIED | &quot;TYPE_UNSPECIFIED&quot; |
| NO_RESERVATION | &quot;NO_RESERVATION&quot; |
| ANY_RESERVATION | &quot;ANY_RESERVATION&quot; |
| SPECIFIC_RESERVATION | &quot;SPECIFIC_RESERVATION&quot; |



