
# Allocation Expiration Date

## Structure

`AllocationExpirationDate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExpiresAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getExpiresAt() | setExpiresAt(ZonedDateTime expiresAt) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.AllocationExpirationDate;

AllocationExpirationDate allocationExpirationDate = new AllocationExpirationDate.Builder()
    .expiresAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

