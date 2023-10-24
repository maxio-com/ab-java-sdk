
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

## Example (as JSON)

```json
{
  "subscriptions": {
    "key0": {
      "product": [
        "product9"
      ],
      "product_price_point_id": [
        "product_price_point_id7"
      ],
      "payment_profile": [
        "payment_profile2"
      ],
      "payment_profile.chargify_token": [
        "payment_profile.chargify_token6"
      ]
    },
    "key1": {
      "product": [
        "product9"
      ],
      "product_price_point_id": [
        "product_price_point_id7"
      ],
      "payment_profile": [
        "payment_profile2"
      ],
      "payment_profile.chargify_token": [
        "payment_profile.chargify_token6"
      ]
    }
  },
  "payer_reference": "payer_reference0",
  "payer": {
    "last_name": [
      "last_name5",
      "last_name6"
    ],
    "first_name": [
      "first_name8"
    ],
    "email": [
      "email0",
      "email9"
    ]
  },
  "subscription_group": [
    "subscription_group1",
    "subscription_group2"
  ],
  "payment_profile_id": "payment_profile_id2"
}
```

