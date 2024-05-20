
# Failed Payment Event Data

Example schema for an `failed_payment` event

## Structure

`FailedPaymentEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AmountInCents` | `int` | Required | The monetary value of the payment, expressed in cents. | int getAmountInCents() | setAmountInCents(int amountInCents) |
| `AppliedAmount` | `int` | Required | The monetary value of the payment, expressed in dollars. | int getAppliedAmount() | setAppliedAmount(int appliedAmount) |
| `Memo` | `String` | Optional | The memo passed when the payment was created. | String getMemo() | setMemo(String memo) |
| `PaymentMethod` | [`InvoicePaymentMethodType`](../../doc/models/invoice-payment-method-type.md) | Required | - | InvoicePaymentMethodType getPaymentMethod() | setPaymentMethod(InvoicePaymentMethodType paymentMethod) |
| `TransactionId` | `int` | Required | The transaction ID of the failed payment. | int getTransactionId() | setTransactionId(int transactionId) |

## Example (as JSON)

```json
{
  "amount_in_cents": 128,
  "applied_amount": 154,
  "memo": "memo2",
  "payment_method": "credit_card",
  "transaction_id": 170
}
```

