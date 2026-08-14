
# Event Based Billing Segment Exception

## Structure

`EventBasedBillingSegmentException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`EventBasedBillingSegmentError`](../../doc/models/event-based-billing-segment-error.md) | Required | - | EventBasedBillingSegmentError getErrors() | setErrors(EventBasedBillingSegmentError errors) |

## Example

```java
try {
    // make the API call
} catch (EventBasedBillingSegmentException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

