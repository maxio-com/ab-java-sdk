
# Scheduled Renewal Lock in Request

## Structure

`ScheduledRenewalLockInRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LockInAt` | `LocalDate` | Required | Date to lock in the renewal. | LocalDate getLockInAt() | setLockInAt(LocalDate lockInAt) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ScheduledRenewalLockInRequest;

ScheduledRenewalLockInRequest scheduledRenewalLockInRequest = new ScheduledRenewalLockInRequest.Builder(
    DateTimeHelper.fromSimpleDate("2016-03-13")
)
.build();
```

