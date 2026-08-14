
# Create Product Family Request

## Structure

`CreateProductFamilyRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductFamily` | [`CreateProductFamily`](../../doc/models/create-product-family.md) | Required | - | CreateProductFamily getProductFamily() | setProductFamily(CreateProductFamily productFamily) |

## Example

```java
import com.maxio.advancedbilling.models.CreateProductFamily;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;

CreateProductFamilyRequest createProductFamilyRequest = new CreateProductFamilyRequest.Builder(
    new CreateProductFamily.Builder(
        "name0"
    )
    .handle("handle6")
    .description("description0")
    .surcharging(false)
    .build()
)
.build();
```

