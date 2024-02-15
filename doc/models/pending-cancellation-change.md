
# Pending Cancellation Change

## Structure

`PendingCancellationChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CancellationState` | `String` | Required | - | String getCancellationState() | setCancellationState(String cancellationState) |
| `CancelsAt` | `ZonedDateTime` | Required | - | ZonedDateTime getCancelsAt() | setCancelsAt(ZonedDateTime cancelsAt) |

## Example (as JSON)

```json
{
  "cancellation_state": "cancellation_state8",
  "cancels_at": "2016-03-13T12:52:32.123Z"
}
```

