
# Subscription Group Signup Event Data

## Structure

`SubscriptionGroupSignupEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionGroup` | [`SubscriptionGroupSignupFailureData`](../../doc/models/subscription-group-signup-failure-data.md) | Required | - | SubscriptionGroupSignupFailureData getSubscriptionGroup() | setSubscriptionGroup(SubscriptionGroupSignupFailureData subscriptionGroup) |
| `Customer` | [`Customer`](../../doc/models/customer.md) | Required | - | Customer getCustomer() | setCustomer(Customer customer) |

## Example

```java
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.PayerAttributes;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupEventData;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupFailureData;

SubscriptionGroupSignupEventData subscriptionGroupSignupEventData = new SubscriptionGroupSignupEventData.Builder(
    new SubscriptionGroupSignupFailureData.Builder()
        .payerId(150)
        .payerReference("payer_reference6")
        .paymentProfileId(128)
        .paymentCollectionMethod("payment_collection_method8")
        .payerAttributes(new PayerAttributes.Builder()
            .firstName("first_name2")
            .lastName("last_name0")
            .email("email4")
            .ccEmails("cc_emails2")
            .organization("organization6")
            .build())
        .build(),
    new Customer.Builder()
        .firstName("first_name0")
        .lastName("last_name8")
        .email("email6")
        .ccEmails("cc_emails0")
        .organization("organization6")
        .build()
)
.build();
```

