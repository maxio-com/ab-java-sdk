
# Create Payment Profile Response

## Structure

`CreatePaymentProfileResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentProfile` | [`CreatedPaymentProfile`](../../doc/models/created-payment-profile.md) | Required | - | CreatedPaymentProfile getPaymentProfile() | setPaymentProfile(CreatedPaymentProfile paymentProfile) |

## Example (as JSON)

```json
{
  "payment_profile": {
    "id": 44,
    "first_name": "first_name4",
    "last_name": "last_name2",
    "masked_card_number": "masked_card_number2",
    "card_type": "card_type0"
  }
}
```

