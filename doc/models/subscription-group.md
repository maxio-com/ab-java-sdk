
# Subscription Group

## Structure

`SubscriptionGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `CustomerId` | `Integer` | Optional | - | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `PaymentProfile` | [`SubscriptionGroupPaymentProfile`](../../doc/models/subscription-group-payment-profile.md) | Optional | - | SubscriptionGroupPaymentProfile getPaymentProfile() | setPaymentProfile(SubscriptionGroupPaymentProfile paymentProfile) |
| `PaymentCollectionMethod` | [`CollectionMethod`](../../doc/models/collection-method.md) | Optional | The type of payment collection to be used in the subscription. For legacy Statements Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing Architecture valid options are - `remittance`, `automatic`, `prepaid`. | CollectionMethod getPaymentCollectionMethod() | setPaymentCollectionMethod(CollectionMethod paymentCollectionMethod) |
| `SubscriptionIds` | `List<Integer>` | Optional | - | List<Integer> getSubscriptionIds() | setSubscriptionIds(List<Integer> subscriptionIds) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |

## Example

```java
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.SubscriptionGroup;
import com.maxio.advancedbilling.models.SubscriptionGroupPaymentProfile;
import java.util.Arrays;

SubscriptionGroup subscriptionGroup = new SubscriptionGroup.Builder()
    .uid("uid8")
    .customerId(78)
    .paymentProfile(new SubscriptionGroupPaymentProfile.Builder()
        .id(44)
        .firstName("first_name4")
        .lastName("last_name2")
        .maskedCardNumber("masked_card_number2")
        .build())
    .paymentCollectionMethod(CollectionMethod.AUTOMATIC)
    .subscriptionIds(Arrays.asList(
        188,
        189,
        190
    ))
    .build();
```

