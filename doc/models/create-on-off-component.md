
# Create On Off Component

## Structure

`CreateOnOffComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OnOffComponent` | [`OnOffComponent`](../../doc/models/on-off-component.md) | Required | - | OnOffComponent getOnOffComponent() | setOnOffComponent(OnOffComponent onOffComponent) |

## Example

```java
import com.maxio.advancedbilling.models.CreateOnOffComponent;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.OnOffComponent;
import com.maxio.advancedbilling.models.containers.OnOffComponentUnitPrice;

CreateOnOffComponent createOnOffComponent = new CreateOnOffComponent.Builder(
    new OnOffComponent.Builder(
        "name6",
        OnOffComponentUnitPrice.fromString(
            "String5"
        )
    )
    .description("description6")
    .handle("handle2")
    .taxable(false)
    .upgradeCharge(CreditType.FULL)
    .downgradeCredit(CreditType.FULL)
    .build()
)
.build();
```

