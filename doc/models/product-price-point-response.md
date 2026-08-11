
# Product Price Point Response

## Structure

`ProductPricePointResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoint` | [`ProductPricePoint`](../../doc/models/product-price-point.md) | Required | - | ProductPricePoint getPricePoint() | setPricePoint(ProductPricePoint pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.ProductPricePointResponse;

ProductPricePointResponse productPricePointResponse = new ProductPricePointResponse.Builder(
    new ProductPricePoint.Builder()
        .id(248)
        .name("name0")
        .handle("handle6")
        .priceInCents(196L)
        .interval(44)
        .build()
)
.build();
```

