
# Create Multi Invoice Payment Request

## Structure

`CreateMultiInvoicePaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payment` | [`CreateMultiInvoicePayment`](../../doc/models/create-multi-invoice-payment.md) | Required | - | CreateMultiInvoicePayment getPayment() | setPayment(CreateMultiInvoicePayment payment) |

## Example (as JSON)

```json
{
  "payment": {
    "amount": "String9",
    "applications": [
      {
        "invoice_uid": "invoice_uid8",
        "amount": "amount0"
      }
    ],
    "memo": "memo0",
    "details": "details6",
    "method": "ach",
    "received_on": "received_on8"
  }
}
```

