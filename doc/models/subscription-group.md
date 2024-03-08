
# Subscription Group

## Structure

`SubscriptionGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomerId` | `Integer` | Optional | - | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `PaymentProfile` | [`SubscriptionGroupPaymentProfile`](../../doc/models/subscription-group-payment-profile.md) | Optional | - | SubscriptionGroupPaymentProfile getPaymentProfile() | setPaymentProfile(SubscriptionGroupPaymentProfile paymentProfile) |
| `PaymentCollectionMethod` | [`CollectionMethod`](../../doc/models/collection-method.md) | Optional | The type of payment collection to be used in the subscription. For legacy Statements Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing Architecture valid options are - `remittance`, `automatic`, `prepaid`.<br>**Default**: `CollectionMethod.AUTOMATIC` | CollectionMethod getPaymentCollectionMethod() | setPaymentCollectionMethod(CollectionMethod paymentCollectionMethod) |
| `SubscriptionIds` | `List<Integer>` | Optional | - | List<Integer> getSubscriptionIds() | setSubscriptionIds(List<Integer> subscriptionIds) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |

## Example (as JSON)

```json
{
  "payment_collection_method": "automatic",
  "customer_id": 36,
  "payment_profile": {
    "id": 44,
    "first_name": "first_name4",
    "last_name": "last_name2",
    "masked_card_number": "masked_card_number2"
  },
  "subscription_ids": [
    146,
    147,
    148
  ],
  "created_at": "2016-03-13T12:52:32.123Z"
}
```

