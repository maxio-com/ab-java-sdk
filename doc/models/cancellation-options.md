
# Cancellation Options

## Structure

`CancellationOptions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CancellationMessage` | `String` | Optional | For your internal use. An indication as to why the subscription is being canceled. | String getCancellationMessage() | setCancellationMessage(String cancellationMessage) |
| `ReasonCode` | `String` | Optional | The reason code associated with the cancellation. See the list of reason codes associated with your site. | String getReasonCode() | setReasonCode(String reasonCode) |

## Example (as JSON)

```json
{
  "cancellation_message": "cancellation_message0",
  "reason_code": "reason_code6"
}
```

