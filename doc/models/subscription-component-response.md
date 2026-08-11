
# Subscription Component Response

## Structure

`SubscriptionComponentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Component` | [`SubscriptionComponent`](../../doc/models/subscription-component.md) | Optional | - | SubscriptionComponent getComponent() | setComponent(SubscriptionComponent component) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentKind;
import com.maxio.advancedbilling.models.SubscriptionComponent;
import com.maxio.advancedbilling.models.SubscriptionComponentResponse;

SubscriptionComponentResponse subscriptionComponentResponse = new SubscriptionComponentResponse.Builder()
    .component(new SubscriptionComponent.Builder()
        .id(80)
        .name("name8")
        .kind(ComponentKind.QUANTITY_BASED_COMPONENT)
        .unitName("unit_name0")
        .enabled(false)
        .build())
    .build();
```

