
# Update Component Request

## Structure

`UpdateComponentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Component` | [`UpdateComponent`](../../doc/models/update-component.md) | Required | - | UpdateComponent getComponent() | setComponent(UpdateComponent component) |

## Example

```java
import com.maxio.advancedbilling.models.ItemCategory;
import com.maxio.advancedbilling.models.UpdateComponent;
import com.maxio.advancedbilling.models.UpdateComponentRequest;

UpdateComponentRequest updateComponentRequest = new UpdateComponentRequest.Builder(
    new UpdateComponent.Builder()
        .handle("handle4")
        .name("name8")
        .description("description2")
        .accountingCode("accounting_code4")
        .taxable(false)
        .itemCategory(ItemCategory.ENUM_BUSINESS_SOFTWARE)
        .build()
)
.build();
```

