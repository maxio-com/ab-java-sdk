
# Update Product Price Point Request

## Structure

`UpdateProductPricePointRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoint` | [`UpdateProductPricePoint`](../../doc/models/update-product-price-point.md) | Required | - | UpdateProductPricePoint getPricePoint() | setPricePoint(UpdateProductPricePoint pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateProductPricePoint;
import com.maxio.advancedbilling.models.UpdateProductPricePointRequest;

UpdateProductPricePointRequest updateProductPricePointRequest = new UpdateProductPricePointRequest.Builder(
    new UpdateProductPricePoint.Builder()
        .handle("handle6")
        .priceInCents(196L)
        .build()
)
.build();
```

