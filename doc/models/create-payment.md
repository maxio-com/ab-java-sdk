
# Create Payment

## Structure

`CreatePayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `String` | Required | - | String getAmount() | setAmount(String amount) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |
| `PaymentDetails` | `String` | Required | - | String getPaymentDetails() | setPaymentDetails(String paymentDetails) |
| `PaymentMethod` | [`InvoicePaymentMethodType`](../../doc/models/invoice-payment-method-type.md) | Required | The type of payment method used. Defaults to other. | InvoicePaymentMethodType getPaymentMethod() | setPaymentMethod(InvoicePaymentMethodType paymentMethod) |

## Example (as JSON)

```json
{
  "amount": "amount6",
  "memo": "memo8",
  "payment_details": "payment_details4",
  "payment_method": "cash"
}
```

