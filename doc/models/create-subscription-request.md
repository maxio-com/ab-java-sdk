
# Create Subscription Request

## Structure

`CreateSubscriptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscription` | [`CreateSubscription`](../../doc/models/create-subscription.md) | Required | - | CreateSubscription getSubscription() | setSubscription(CreateSubscription subscription) |

## Example

```java
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.SubscriptionCustomPrice;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceInterval;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPricePriceInCents;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceTrialInterval;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceTrialPriceInCents;
import java.util.LinkedHashMap;

CreateSubscriptionRequest createSubscriptionRequest = new CreateSubscriptionRequest.Builder(
    new CreateSubscription.Builder()
        .productHandle("product_handle6")
        .productId(206)
        .productPricePointHandle("product_price_point_handle2")
        .productPricePointId(130)
        .customPrice(new SubscriptionCustomPrice.Builder(
            SubscriptionCustomPricePriceInCents.fromString(
                "String3"
            ),
            SubscriptionCustomPriceInterval.fromString(
                "String3"
            ),
            IntervalUnit.DAY
        )
        .name("name4")
        .handle("handle0")
        .trialPriceInCents(SubscriptionCustomPriceTrialPriceInCents.fromString(
                "String3"
            ))
        .trialInterval(SubscriptionCustomPriceTrialInterval.fromString(
                "String5"
            ))
        .trialIntervalUnit(IntervalUnit.DAY)
        .build())
        .deferSignup(false)
        .metafields(new LinkedHashMap<String, String>() {{
            put("custom_field_name_1", "custom_field_value_1");
            put("custom_field_name_2", "custom_field_value_2");
        }})
        .dunningCommunicationDelayEnabled(false)
        .dunningCommunicationDelayTimeZone("\"Eastern Time (US & Canada)\"")
        .build()
)
.build();
```

