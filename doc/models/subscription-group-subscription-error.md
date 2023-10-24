
# Subscription Group Subscription Error

Object which contains subscription errors.

## Structure

`SubscriptionGroupSubscriptionError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Product` | `List<String>` | Optional | - | List<String> getProduct() | setProduct(List<String> product) |
| `ProductPricePointId` | `List<String>` | Optional | - | List<String> getProductPricePointId() | setProductPricePointId(List<String> productPricePointId) |
| `PaymentProfile` | `List<String>` | Optional | - | List<String> getPaymentProfile() | setPaymentProfile(List<String> paymentProfile) |
| `PaymentProfileChargifyToken` | `List<String>` | Optional | - | List<String> getPaymentProfileChargifyToken() | setPaymentProfileChargifyToken(List<String> paymentProfileChargifyToken) |

## Example (as JSON)

```json
{
  "product": [
    "product7",
    "product6"
  ],
  "product_price_point_id": [
    "product_price_point_id9",
    "product_price_point_id0"
  ],
  "payment_profile": [
    "payment_profile4",
    "payment_profile5"
  ],
  "payment_profile.chargify_token": [
    "payment_profile.chargify_token8",
    "payment_profile.chargify_token9"
  ]
}
```

