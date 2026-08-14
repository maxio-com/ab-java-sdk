
# Bulk Create Product Price Points Response

## Structure

`BulkCreateProductPricePointsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoints` | [`List<ProductPricePoint>`](../../doc/models/product-price-point.md) | Optional | - | List<ProductPricePoint> getPricePoints() | setPricePoints(List<ProductPricePoint> pricePoints) |

## Example

```java
import com.maxio.advancedbilling.models.BulkCreateProductPricePointsResponse;
import com.maxio.advancedbilling.models.ProductPricePoint;
import java.util.Arrays;

BulkCreateProductPricePointsResponse bulkCreateProductPricePointsResponse = new BulkCreateProductPricePointsResponse.Builder()
    .pricePoints(Arrays.asList(
        new ProductPricePoint.Builder()
            .id(40)
            .name("name2")
            .handle("handle8")
            .priceInCents(108L)
            .interval(92)
            .build(),
        new ProductPricePoint.Builder()
            .id(40)
            .name("name2")
            .handle("handle8")
            .priceInCents(108L)
            .interval(92)
            .build(),
        new ProductPricePoint.Builder()
            .id(40)
            .name("name2")
            .handle("handle8")
            .priceInCents(108L)
            .interval(92)
            .build()
    ))
    .build();
```

