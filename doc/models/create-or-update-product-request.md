
# Create or Update Product Request

## Structure

`CreateOrUpdateProductRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Product` | [`CreateOrUpdateProduct`](../../doc/models/create-or-update-product.md) | Required | - | CreateOrUpdateProduct getProduct() | setProduct(CreateOrUpdateProduct product) |

## Example

```java
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.IntervalUnit;

CreateOrUpdateProductRequest createOrUpdateProductRequest = new CreateOrUpdateProductRequest.Builder(
    new CreateOrUpdateProduct.Builder(
        "name0",
        "description0",
        54L,
        186,
        IntervalUnit.DAY
    )
    .handle("handle6")
    .accountingCode("accounting_code6")
    .requireCreditCard(false)
    .trialPriceInCents(34L)
    .trialInterval(88)
    .build()
)
.build();
```

