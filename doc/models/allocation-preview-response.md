
# Allocation Preview Response

## Structure

`AllocationPreviewResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AllocationPreview` | [`AllocationPreview`](../../doc/models/allocation-preview.md) | Required | - | AllocationPreview getAllocationPreview() | setAllocationPreview(AllocationPreview allocationPreview) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.AllocationPreview;
import com.maxio.advancedbilling.models.AllocationPreviewResponse;

AllocationPreviewResponse allocationPreviewResponse = new AllocationPreviewResponse.Builder(
    new AllocationPreview.Builder()
        .startDate(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .endDate(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .subtotalInCents(240L)
        .totalTaxInCents(108L)
        .totalDiscountInCents(142L)
        .build()
)
.build();
```

