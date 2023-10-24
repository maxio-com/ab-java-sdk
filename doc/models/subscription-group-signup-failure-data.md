
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

## Example (as JSON)

```json
{
  "payer_id": 16,
  "payer_reference": "payer_reference8",
  "payment_profile_id": 6,
  "payment_collection_method": "payment_collection_method0",
  "payer_attributes": {
    "first_name": "first_name2",
    "last_name": "last_name0",
    "email": "email4",
    "cc_emails": "cc_emails2",
    "organization": "organization6"
  }
}
```

