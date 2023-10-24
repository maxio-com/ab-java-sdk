
# Create Payment Profile Request

## Structure

`CreatePaymentProfileRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentProfile` | [`CreatePaymentProfile`](../../doc/models/create-payment-profile.md) | Required | - | CreatePaymentProfile getPaymentProfile() | setPaymentProfile(CreatePaymentProfile paymentProfile) |

## Example (as JSON)

```json
{
  "payment_profile": {
    "chargify_token": "tok_9g6hw85pnpt6knmskpwp4ttt",
    "payment_type": "credit_card",
    "full_number": "5424000000000015",
    "id": 44,
    "first_name": "first_name4",
    "last_name": "last_name2"
  }
}
```

