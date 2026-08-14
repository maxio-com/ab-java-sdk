
# Update Allocation Expiration Date

## Structure

`UpdateAllocationExpirationDate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Allocation` | [`AllocationExpirationDate`](../../doc/models/allocation-expiration-date.md) | Optional | - | AllocationExpirationDate getAllocation() | setAllocation(AllocationExpirationDate allocation) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.AllocationExpirationDate;
import com.maxio.advancedbilling.models.UpdateAllocationExpirationDate;

UpdateAllocationExpirationDate updateAllocationExpirationDate = new UpdateAllocationExpirationDate.Builder()
    .allocation(new AllocationExpirationDate.Builder()
        .expiresAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .build())
    .build();
```

