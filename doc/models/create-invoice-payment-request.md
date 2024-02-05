
# Create Invoice Payment Request

## Structure

`CreateInvoicePaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payment` | [`CreateInvoicePayment`](../../doc/models/create-invoice-payment.md) | Required | - | CreateInvoicePayment getPayment() | setPayment(CreateInvoicePayment payment) |
| `Type` | [`InvoicePaymentType`](../../doc/models/invoice-payment-type.md) | Optional | The type of payment to be applied to an Invoice. Defaults to external. | InvoicePaymentType getType() | setType(InvoicePaymentType type) |

## Example (as JSON)

```json
{
  "payment": {
    "amount": "String9",
    "memo": "memo0",
    "method": "ach",
    "details": "details6"
  },
  "type": "external"
}
```

