
# Price

## Structure

`Price`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartingQuantity` | [`PriceStartingQuantity`](../../doc/models/containers/price-starting-quantity.md) | Required | This is a container for one-of cases. | PriceStartingQuantity getStartingQuantity() | setStartingQuantity(PriceStartingQuantity startingQuantity) |
| `EndingQuantity` | [`PriceEndingQuantity`](../../doc/models/containers/price-ending-quantity.md) | Optional | This is a container for one-of cases. | PriceEndingQuantity getEndingQuantity() | setEndingQuantity(PriceEndingQuantity endingQuantity) |
| `UnitPrice` | [`PriceUnitPrice`](../../doc/models/containers/price-unit-price.md) | Required | This is a container for one-of cases. | PriceUnitPrice getUnitPrice() | setUnitPrice(PriceUnitPrice unitPrice) |

## Example

```java
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;

Price price = new Price.Builder(
    PriceStartingQuantity.fromNumber(
        132
    ),
    PriceUnitPrice.fromPrecision(
        70.44D
    )
)
.endingQuantity(PriceEndingQuantity.fromNumber(
        6
    ))
.build();
```

