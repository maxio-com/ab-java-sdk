
# Payment Method Bank Account

## Structure

`PaymentMethodBankAccount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MaskedAccountNumber` | `String` | Required | - | String getMaskedAccountNumber() | setMaskedAccountNumber(String maskedAccountNumber) |
| `MaskedRoutingNumber` | `String` | Required | - | String getMaskedRoutingNumber() | setMaskedRoutingNumber(String maskedRoutingNumber) |
| `Type` | [`InvoiceEventPaymentMethod`](../../doc/models/invoice-event-payment-method.md) | Required | - | InvoiceEventPaymentMethod getType() | setType(InvoiceEventPaymentMethod type) |

## Example (as JSON)

```json
{
  "masked_account_number": "masked_account_number2",
  "masked_routing_number": "masked_routing_number2",
  "type": "bank_account"
}
```

