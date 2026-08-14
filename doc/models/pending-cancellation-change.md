
# Pending Cancellation Change

## Structure

`PendingCancellationChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CancellationState` | `String` | Required | - | String getCancellationState() | setCancellationState(String cancellationState) |
| `CancelsAt` | `ZonedDateTime` | Required | - | ZonedDateTime getCancelsAt() | setCancelsAt(ZonedDateTime cancelsAt) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.PendingCancellationChange;

PendingCancellationChange pendingCancellationChange = new PendingCancellationChange.Builder(
    "cancellation_state0",
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();
```

