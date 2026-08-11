
# Subscription Group Signup Error

## Structure

`SubscriptionGroupSignupError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscriptions` | [`Map<String, SubscriptionGroupSubscriptionError>`](../../doc/models/subscription-group-subscription-error.md) | Optional | Object that as key have subscription position in request subscriptions array and as value subscription errors object. | Map<String, SubscriptionGroupSubscriptionError> getSubscriptions() | setSubscriptions(Map<String, SubscriptionGroupSubscriptionError> subscriptions) |
| `PayerReference` | `String` | Optional | - | String getPayerReference() | setPayerReference(String payerReference) |
| `Payer` | [`PayerError`](../../doc/models/payer-error.md) | Optional | - | PayerError getPayer() | setPayer(PayerError payer) |
| `SubscriptionGroup` | `List<String>` | Optional | - | List<String> getSubscriptionGroup() | setSubscriptionGroup(List<String> subscriptionGroup) |
| `PaymentProfileId` | `String` | Optional | - | String getPaymentProfileId() | setPaymentProfileId(String paymentProfileId) |
| `PayerId` | `String` | Optional | - | String getPayerId() | setPayerId(String payerId) |

## Example

```java
import com.maxio.advancedbilling.models.PayerError;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupError;
import com.maxio.advancedbilling.models.SubscriptionGroupSubscriptionError;
import java.util.Arrays;
import java.util.LinkedHashMap;

SubscriptionGroupSignupError subscriptionGroupSignupError = new SubscriptionGroupSignupError.Builder()
    .subscriptions(new LinkedHashMap<String, SubscriptionGroupSubscriptionError>() {{
        put("key0", new SubscriptionGroupSubscriptionError.Builder()
            .product(Arrays.asList(
                "product9"
            ))
            .productPricePointId(Arrays.asList(
                "product_price_point_id7"
            ))
            .paymentProfile(Arrays.asList(
                "payment_profile2"
            ))
            .paymentProfileChargifyToken(Arrays.asList(
                "payment_profile.chargify_token6"
            ))
            .base(Arrays.asList(
                "base5",
                "base6"
            ))
            .build());
        put("key1", new SubscriptionGroupSubscriptionError.Builder()
            .product(Arrays.asList(
                "product9"
            ))
            .productPricePointId(Arrays.asList(
                "product_price_point_id7"
            ))
            .paymentProfile(Arrays.asList(
                "payment_profile2"
            ))
            .paymentProfileChargifyToken(Arrays.asList(
                "payment_profile.chargify_token6"
            ))
            .base(Arrays.asList(
                "base5",
                "base6"
            ))
            .build());
        put("key2", new SubscriptionGroupSubscriptionError.Builder()
            .product(Arrays.asList(
                "product9"
            ))
            .productPricePointId(Arrays.asList(
                "product_price_point_id7"
            ))
            .paymentProfile(Arrays.asList(
                "payment_profile2"
            ))
            .paymentProfileChargifyToken(Arrays.asList(
                "payment_profile.chargify_token6"
            ))
            .base(Arrays.asList(
                "base5",
                "base6"
            ))
            .build());
    }})
    .payerReference("payer_reference8")
    .payer(new PayerError.Builder()
        .lastName(Arrays.asList(
            "last_name5",
            "last_name6"
        ))
        .firstName(Arrays.asList(
            "first_name8"
        ))
        .email(Arrays.asList(
            "email0",
            "email9"
        ))
        .build())
    .subscriptionGroup(Arrays.asList(
        "subscription_group3",
        "subscription_group4",
        "subscription_group5"
    ))
    .paymentProfileId("payment_profile_id4")
    .build();
```

