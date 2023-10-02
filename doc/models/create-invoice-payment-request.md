
# Create Invoice Payment Request

## Structure

`CreateInvoicePaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payment` | [`CreateInvoicePayment`](../../doc/models/create-invoice-payment.md) | Required | - | CreateInvoicePayment getPayment() | setPayment(CreateInvoicePayment payment) |
| `Type` | [`InvoicePaymentTypeEnum`](../../doc/models/invoice-payment-type-enum.md) | Optional | The type of payment to be applied to an Invoice.<br>**Default**: `InvoicePaymentTypeEnum.EXTERNAL` | InvoicePaymentTypeEnum getType() | setType(InvoicePaymentTypeEnum type) |

## Example (as JSON)

```json
{
  "payment": {
    "method": "other",
    "amount": "String9",
    "memo": "memo0",
    "details": "details6"
  },
  "type": "external"
}
```

