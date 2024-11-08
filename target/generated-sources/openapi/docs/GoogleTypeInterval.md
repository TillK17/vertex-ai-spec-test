

# GoogleTypeInterval

Represents a time interval, encoded as a Timestamp start (inclusive) and a Timestamp end (exclusive). The start must be less than or equal to the end. When the start equals the end, the interval is empty (matches no time). When both start and end are unspecified, the interval matches any time.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endTime** | **String** | Optional. Exclusive end of the interval. If specified, a Timestamp matching this interval will have to be before the end. |  [optional] |
|**startTime** | **String** | Optional. Inclusive start of the interval. If specified, a Timestamp matching this interval will have to be the same or after the start. |  [optional] |



