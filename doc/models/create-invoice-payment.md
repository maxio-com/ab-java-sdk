
# Create Invoice Payment

## Structure

`CreateInvoicePayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | [`CreateInvoicePaymentAmount`](../../doc/models/containers/create-invoice-payment-amount.md) | Optional | This is a container for one-of cases. | CreateInvoicePaymentAmount getAmount() | setAmount(CreateInvoicePaymentAmount amount) |
| `Memo` | `String` | Optional | A description to be attached to the payment. | String getMemo() | setMemo(String memo) |
| `Method` | [`InvoicePaymentMethodType`](../../doc/models/invoice-payment-method-type.md) | Optional | The type of payment method used.<br>**Default**: `InvoicePaymentMethodType.OTHER` | InvoicePaymentMethodType getMethod() | setMethod(InvoicePaymentMethodType method) |
| `Details` | `String` | Optional | Additional information related to the payment method (eg. Check #) | String getDetails() | setDetails(String details) |

## Example (as JSON)

```json
{
  "method": "other",
  "amount": "String9",
  "memo": "memo0",
  "details": "details6"
}
```

