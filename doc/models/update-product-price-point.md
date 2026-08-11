
# Update Product Price Point

## Structure

`UpdateProductPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `PriceInCents` | `Long` | Optional | - | Long getPriceInCents() | setPriceInCents(Long priceInCents) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateProductPricePoint;

UpdateProductPricePoint updateProductPricePoint = new UpdateProductPricePoint.Builder()
    .handle("handle2")
    .priceInCents(154L)
    .build();
```

