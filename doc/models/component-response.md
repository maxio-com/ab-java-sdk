
# Component Response

## Structure

`ComponentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Component` | [`Component`](../../doc/models/component.md) | Required | - | Component getComponent() | setComponent(Component component) |

## Example

```java
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentResponse;
import com.maxio.advancedbilling.models.ItemCategory;
import com.maxio.advancedbilling.models.PricingScheme;

ComponentResponse componentResponse = new ComponentResponse.Builder(
    new Component.Builder()
        .id(80)
        .name("name8")
        .handle("handle4")
        .pricingScheme(PricingScheme.PER_UNIT)
        .unitName("unit_name0")
        .itemCategory(ItemCategory.ENUM_BUSINESS_SOFTWARE)
        .build()
)
.build();
```

