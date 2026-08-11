
# Product Family Response

## Structure

`ProductFamilyResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductFamily` | [`ProductFamily`](../../doc/models/product-family.md) | Optional | - | ProductFamily getProductFamily() | setProductFamily(ProductFamily productFamily) |

## Example

```java
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ProductFamilyResponse;

ProductFamilyResponse productFamilyResponse = new ProductFamilyResponse.Builder()
    .productFamily(new ProductFamily.Builder()
        .id(14)
        .name("name0")
        .handle("handle6")
        .accountingCode("accounting_code6")
        .description("description0")
        .build())
    .build();
```

