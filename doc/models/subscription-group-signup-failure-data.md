
# Subscription Group Signup Failure Data

## Structure

`SubscriptionGroupSignupFailureData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PayerId` | `Integer` | Optional | - | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerReference` | `String` | Optional | - | String getPayerReference() | setPayerReference(String payerReference) |
| `PaymentProfileId` | `Integer` | Optional | - | Integer getPaymentProfileId() | setPaymentProfileId(Integer paymentProfileId) |
| `PaymentCollectionMethod` | `String` | Optional | - | String getPaymentCollectionMethod() | setPaymentCollectionMethod(String paymentCollectionMethod) |
| `PayerAttributes` | [`PayerAttributes`](../../doc/models/payer-attributes.md) | Optional | - | PayerAttributes getPayerAttributes() | setPayerAttributes(PayerAttributes payerAttributes) |
| `CreditCardAttributes` | [`SubscriptionGroupCreditCard`](../../doc/models/subscription-group-credit-card.md) | Optional | - | SubscriptionGroupCreditCard getCreditCardAttributes() | setCreditCardAttributes(SubscriptionGroupCreditCard creditCardAttributes) |
| `BankAccountAttributes` | [`SubscriptionGroupBankAccount`](../../doc/models/subscription-group-bank-account.md) | Optional | - | SubscriptionGroupBankAccount getBankAccountAttributes() | setBankAccountAttributes(SubscriptionGroupBankAccount bankAccountAttributes) |
| `Subscriptions` | [`List<SubscriptionGroupSignupItem>`](../../doc/models/subscription-group-signup-item.md) | Optional | - | List<SubscriptionGroupSignupItem> getSubscriptions() | setSubscriptions(List<SubscriptionGroupSignupItem> subscriptions) |

## Example

```java
import com.maxio.advancedbilling.models.PayerAttributes;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupFailureData;

SubscriptionGroupSignupFailureData subscriptionGroupSignupFailureData = new SubscriptionGroupSignupFailureData.Builder()
    .payerId(236)
    .payerReference("payer_reference2")
    .paymentProfileId(42)
    .paymentCollectionMethod("payment_collection_method4")
    .payerAttributes(new PayerAttributes.Builder()
        .firstName("first_name2")
        .lastName("last_name0")
        .email("email4")
        .ccEmails("cc_emails2")
        .organization("organization6")
        .build())
    .build();
```

