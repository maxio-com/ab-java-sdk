
# Subscription Group Response

## Structure

`SubscriptionGroupResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionGroup` | [`SubscriptionGroup`](../../doc/models/subscription-group.md) | Required | - | SubscriptionGroup getSubscriptionGroup() | setSubscriptionGroup(SubscriptionGroup subscriptionGroup) |

## Example

```java
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.SubscriptionGroup;
import com.maxio.advancedbilling.models.SubscriptionGroupPaymentProfile;
import com.maxio.advancedbilling.models.SubscriptionGroupResponse;
import java.util.Arrays;

SubscriptionGroupResponse subscriptionGroupResponse = new SubscriptionGroupResponse.Builder(
    new SubscriptionGroup.Builder()
        .uid("uid8")
        .customerId(220)
        .paymentProfile(new SubscriptionGroupPaymentProfile.Builder()
            .id(44)
            .firstName("first_name4")
            .lastName("last_name2")
            .maskedCardNumber("masked_card_number2")
            .build())
        .paymentCollectionMethod(CollectionMethod.PREPAID)
        .subscriptionIds(Arrays.asList(
            74,
            75
        ))
        .build()
)
.build();
```

