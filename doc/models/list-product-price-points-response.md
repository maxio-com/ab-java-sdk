
# List Product Price Points Response

## Structure

`ListProductPricePointsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoints` | [`List<ProductPricePoint>`](../../doc/models/product-price-point.md) | Required | - | List<ProductPricePoint> getPricePoints() | setPricePoints(List<ProductPricePoint> pricePoints) |

## Example

```java
import com.maxio.advancedbilling.models.ListProductPricePointsResponse;
import com.maxio.advancedbilling.models.ProductPricePoint;
import java.util.Arrays;

ListProductPricePointsResponse listProductPricePointsResponse = new ListProductPricePointsResponse.Builder(
    Arrays.asList(
        new ProductPricePoint.Builder()
            .id(40)
            .name("name2")
            .handle("handle8")
            .priceInCents(108L)
            .interval(92)
            .build()
    )
)
.build();
```

