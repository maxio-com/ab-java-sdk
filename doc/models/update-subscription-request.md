
# Update Subscription Request

## Structure

`UpdateSubscriptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscription` | [`UpdateSubscription`](../../doc/models/update-subscription.md) | Required | - | UpdateSubscription getSubscription() | setSubscription(UpdateSubscription subscription) |

## Example

```java
import com.maxio.advancedbilling.models.CreditCardAttributes;
import com.maxio.advancedbilling.models.UpdateSubscription;
import com.maxio.advancedbilling.models.UpdateSubscriptionRequest;

UpdateSubscriptionRequest updateSubscriptionRequest = new UpdateSubscriptionRequest.Builder(
    new UpdateSubscription.Builder()
        .creditCardAttributes(new CreditCardAttributes.Builder()
            .fullNumber("full_number2")
            .expirationMonth("expiration_month6")
            .expirationYear("expiration_year2")
            .build())
        .productHandle("product_handle6")
        .productId(206)
        .productChangeDelayed(false)
        .nextProductId("next_product_id6")
        .deferSignup(false)
        .dunningCommunicationDelayTimeZone("\"Eastern Time (US & Canada)\"")
        .build()
)
.build();
```

