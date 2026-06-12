
# Chjs Tokenization Failure

## Structure

`ChjsTokenizationFailure`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | `String` | Required | - | String getErrors() | setErrors(String errors) |
| `PaymentProfileParams` | [`PaymentProfileParams`](../../doc/models/payment-profile-params.md) | Optional | PCI-safe cardholder fields only. Full card numbers, CVV, and billing address are never included. | PaymentProfileParams getPaymentProfileParams() | setPaymentProfileParams(PaymentProfileParams paymentProfileParams) |

## Example (as JSON)

```json
{
  "errors": "errors2",
  "payment_profile_params": {
    "first_name": "first_name2",
    "last_name": "last_name0",
    "card_type": "card_type2"
  }
}
```

