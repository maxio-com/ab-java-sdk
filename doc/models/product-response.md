
# Product Response

## Structure

`ProductResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Product` | [`Product`](../../doc/models/product.md) | Required | - | Product getProduct() | setProduct(Product product) |

## Example

```java
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductResponse;

ProductResponse productResponse = new ProductResponse.Builder(
    new Product.Builder()
        .id(134)
        .name("name0")
        .handle("handle6")
        .description("description0")
        .accountingCode("accounting_code6")
        .build()
)
.build();
```

