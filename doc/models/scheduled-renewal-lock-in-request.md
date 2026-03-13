
# Scheduled Renewal Lock in Request

## Structure

`ScheduledRenewalLockInRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LockInAt` | `LocalDate` | Required | Date to lock in the renewal. | LocalDate getLockInAt() | setLockInAt(LocalDate lockInAt) |

## Example (as JSON)

```json
{
  "lock_in_at": "2016-03-13"
}
```

