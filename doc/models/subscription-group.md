
# Subscription Group

## Structure

`SubscriptionGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomerId` | `Integer` | Optional | - | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `PaymentProfile` | [`SubscriptionGroupPaymentProfile`](../../doc/models/subscription-group-payment-profile.md) | Optional | - | SubscriptionGroupPaymentProfile getPaymentProfile() | setPaymentProfile(SubscriptionGroupPaymentProfile paymentProfile) |
| `PaymentCollectionMethod` | `String` | Optional | - | String getPaymentCollectionMethod() | setPaymentCollectionMethod(String paymentCollectionMethod) |
| `SubscriptionIds` | `List<Integer>` | Optional | - | List<Integer> getSubscriptionIds() | setSubscriptionIds(List<Integer> subscriptionIds) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |

## Example (as JSON)

```json
{
  "customer_id": 36,
  "payment_profile": {
    "id": 44,
    "first_name": "first_name4",
    "last_name": "last_name2",
    "masked_card_number": "masked_card_number2"
  },
  "payment_collection_method": "payment_collection_method8",
  "subscription_ids": [
    146,
    147,
    148
  ],
  "created_at": "created_at2"
}
```

