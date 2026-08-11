
# Usage Response

## Structure

`UsageResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Usage` | [`Usage`](../../doc/models/usage.md) | Required | - | Usage getUsage() | setUsage(Usage usage) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.Usage;
import com.maxio.advancedbilling.models.UsageResponse;
import com.maxio.advancedbilling.models.containers.UsageQuantity;

UsageResponse usageResponse = new UsageResponse.Builder(
    new Usage.Builder()
        .id(150L)
        .memo("memo2")
        .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .pricePointId(28)
        .quantity(UsageQuantity.fromNumber(
            28
        ))
        .build()
)
.build();
```

