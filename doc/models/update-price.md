
# Update Price

## Structure

`UpdatePrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `EndingQuantity` | [`UpdatePriceEndingQuantity`](../../doc/models/containers/update-price-ending-quantity.md) | Optional | This is a container for one-of cases. | UpdatePriceEndingQuantity getEndingQuantity() | setEndingQuantity(UpdatePriceEndingQuantity endingQuantity) |
| `UnitPrice` | [`UpdatePriceUnitPrice`](../../doc/models/containers/update-price-unit-price.md) | Optional | This is a container for one-of cases. | UpdatePriceUnitPrice getUnitPrice() | setUnitPrice(UpdatePriceUnitPrice unitPrice) |
| `Destroy` | `Boolean` | Optional | - | Boolean getDestroy() | setDestroy(Boolean destroy) |
| `StartingQuantity` | [`UpdatePriceStartingQuantity`](../../doc/models/containers/update-price-starting-quantity.md) | Optional | This is a container for one-of cases. | UpdatePriceStartingQuantity getStartingQuantity() | setStartingQuantity(UpdatePriceStartingQuantity startingQuantity) |

## Example

```java
import com.maxio.advancedbilling.models.UpdatePrice;
import com.maxio.advancedbilling.models.containers.UpdatePriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.UpdatePriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.UpdatePriceUnitPrice;

UpdatePrice updatePrice = new UpdatePrice.Builder()
    .id(206)
    .endingQuantity(UpdatePriceEndingQuantity.fromNumber(
        28
    ))
    .unitPrice(UpdatePriceUnitPrice.fromPrecision(
        181.3D
    ))
    .destroy(false)
    .startingQuantity(UpdatePriceStartingQuantity.fromNumber(
        54
    ))
    .build();
```

