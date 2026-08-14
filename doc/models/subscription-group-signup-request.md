
# Subscription Group Signup Request

## Structure

`SubscriptionGroupSignupRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionGroup` | [`SubscriptionGroupSignup`](../../doc/models/subscription-group-signup.md) | Required | - | SubscriptionGroupSignup getSubscriptionGroup() | setSubscriptionGroup(SubscriptionGroupSignup subscriptionGroup) |

## Example

```java
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.PayerAttributes;
import com.maxio.advancedbilling.models.SubscriptionGroupSignup;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupItem;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupRequest;
import java.util.Arrays;
import java.util.LinkedHashMap;

SubscriptionGroupSignupRequest subscriptionGroupSignupRequest = new SubscriptionGroupSignupRequest.Builder(
    new SubscriptionGroupSignup.Builder(
        Arrays.asList(
            new SubscriptionGroupSignupItem.Builder()
                .productHandle("product_handle8")
                .productId(144)
                .productPricePointId(68)
                .productPricePointHandle("product_price_point_handle4")
                .offerId(40)
                .metafields(new LinkedHashMap<String, String>() {{
                    put("custom_field_name_1", "custom_field_value_1");
                    put("custom_field_name_2", "custom_field_value_2");
                }})
                .build()
        )
    )
    .paymentProfileId(128)
    .payerId(150)
    .payerReference("payer_reference6")
    .paymentCollectionMethod(CollectionMethod.PREPAID)
    .payerAttributes(new PayerAttributes.Builder()
            .firstName("first_name2")
            .lastName("last_name0")
            .email("email4")
            .ccEmails("cc_emails2")
            .organization("organization6")
            .build())
    .build()
)
.build();
```

