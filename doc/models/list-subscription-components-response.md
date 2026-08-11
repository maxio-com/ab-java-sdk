
# List Subscription Components Response

## Structure

`ListSubscriptionComponentsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionsComponents` | [`List<SubscriptionComponent>`](../../doc/models/subscription-component.md) | Required | - | List<SubscriptionComponent> getSubscriptionsComponents() | setSubscriptionsComponents(List<SubscriptionComponent> subscriptionsComponents) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentKind;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsResponse;
import com.maxio.advancedbilling.models.SubscriptionComponent;
import java.util.Arrays;

ListSubscriptionComponentsResponse listSubscriptionComponentsResponse = new ListSubscriptionComponentsResponse.Builder(
    Arrays.asList(
        new SubscriptionComponent.Builder()
            .id(138)
            .name("name2")
            .kind(ComponentKind.METERED_COMPONENT)
            .unitName("unit_name4")
            .enabled(false)
            .build()
    )
)
.build();
```

