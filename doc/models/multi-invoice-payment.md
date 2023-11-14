
# Multi Invoice Payment

## Structure

`MultiInvoicePayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionId` | `Integer` | Optional | The numeric ID of the transaction. | Integer getTransactionId() | setTransactionId(Integer transactionId) |
| `TotalAmount` | `String` | Optional | Dollar amount of the sum of the paid invoices. | String getTotalAmount() | setTotalAmount(String totalAmount) |
| `CurrencyCode` | `String` | Optional | The ISO 4217 currency code (3 character string) representing the currency of invoice transaction. | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `Applications` | [`List<InvoicePaymentApplication>`](../../doc/models/invoice-payment-application.md) | Optional | - | List<InvoicePaymentApplication> getApplications() | setApplications(List<InvoicePaymentApplication> applications) |

## Example (as JSON)

```json
{
  "transaction_id": 144,
  "total_amount": "total_amount2",
  "currency_code": "currency_code2",
  "applications": [
    {
      "invoice_uid": "invoice_uid8",
      "application_uid": "application_uid8",
      "applied_amount": "applied_amount0"
    }
  ]
}
```

