
# Multi Invoice Payment Response

## Structure

`MultiInvoicePaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payment` | [`MultiInvoicePayment`](../../doc/models/multi-invoice-payment.md) | Required | - | MultiInvoicePayment getPayment() | setPayment(MultiInvoicePayment payment) |

## Example (as JSON)

```json
{
  "payment": {
    "transaction_id": 168.64,
    "total_amount": "total_amount2",
    "currency_code": "currency_code2",
    "applications": [
      {
        "invoice_uid": "invoice_uid8",
        "application_uid": "application_uid8",
        "applied_amount": "applied_amount0"
      },
      {
        "invoice_uid": "invoice_uid8",
        "application_uid": "application_uid8",
        "applied_amount": "applied_amount0"
      },
      {
        "invoice_uid": "invoice_uid8",
        "application_uid": "application_uid8",
        "applied_amount": "applied_amount0"
      }
    ]
  }
}
```

