
# Clone Component Price Point Request

## Structure

`CloneComponentPricePointRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoint` | [`CloneComponentPricePoint`](../../doc/models/clone-component-price-point.md) | Required | - | CloneComponentPricePoint getPricePoint() | setPricePoint(CloneComponentPricePoint pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.CloneComponentPricePoint;
import com.maxio.advancedbilling.models.CloneComponentPricePointRequest;

CloneComponentPricePointRequest cloneComponentPricePointRequest = new CloneComponentPricePointRequest.Builder(
    new CloneComponentPricePoint.Builder(
        "name0"
    )
    .handle("handle6")
    .build()
)
.build();
```

