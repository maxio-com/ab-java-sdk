
# Cancellation Request

## Structure

`CancellationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscription` | [`CancellationOptions`](../../doc/models/cancellation-options.md) | Required | - | CancellationOptions getSubscription() | setSubscription(CancellationOptions subscription) |

## Example (as JSON)

```json
{
  "subscription": {
    "cancellation_message": "cancellation_message2",
    "reason_code": "reason_code8"
  }
}
```

