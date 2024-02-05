
# Create Multi Invoice Payment

## Structure

`CreateMultiInvoicePayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Memo` | `String` | Optional | A description to be attached to the payment. | String getMemo() | setMemo(String memo) |
| `Details` | `String` | Optional | Additional information related to the payment method (eg. Check #). | String getDetails() | setDetails(String details) |
| `Method` | [`InvoicePaymentMethodType`](../../doc/models/invoice-payment-method-type.md) | Optional | The type of payment method used. Defaults to other. | InvoicePaymentMethodType getMethod() | setMethod(InvoicePaymentMethodType method) |
| `Amount` | [`CreateMultiInvoicePaymentAmount`](../../doc/models/containers/create-multi-invoice-payment-amount.md) | Required | This is a container for one-of cases. | CreateMultiInvoicePaymentAmount getAmount() | setAmount(CreateMultiInvoicePaymentAmount amount) |
| `ReceivedOn` | `String` | Optional | Date reflecting when the payment was received from a customer. Must be in the past. | String getReceivedOn() | setReceivedOn(String receivedOn) |
| `Applications` | [`List<CreateInvoicePaymentApplication>`](../../doc/models/create-invoice-payment-application.md) | Required | - | List<CreateInvoicePaymentApplication> getApplications() | setApplications(List<CreateInvoicePaymentApplication> applications) |

## Example (as JSON)

```json
{
  "amount": "String7",
  "applications": [
    {
      "invoice_uid": "invoice_uid8",
      "amount": "amount0"
    }
  ],
  "memo": "memo8",
  "details": "details4",
  "method": "credit_card",
  "received_on": "received_on6"
}
```

