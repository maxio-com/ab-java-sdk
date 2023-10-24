
# Event Based Billing Segment Exception

## Structure

`EventBasedBillingSegmentException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`EventBasedBillingSegmentError`](../../doc/models/event-based-billing-segment-error.md) | Required | - | EventBasedBillingSegmentError getErrors() | setErrors(EventBasedBillingSegmentError errors) |

## Example (as JSON)

```json
{
  "errors": {
    "segments": {
      "key0": {
        "key1": "val1",
        "key2": "val2"
      }
    }
  }
}
```

