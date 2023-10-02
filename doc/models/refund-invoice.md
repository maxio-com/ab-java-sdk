
# Refund Invoice

Refund an invoice or a segment of a consolidated invoice.

## Structure

`RefundInvoice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `String` | Required | The amount to be refunded in decimal format as a string. Example: "10.50". Must not exceed the remaining refundable balance of the payment. | String getAmount() | setAmount(String amount) |
| `Memo` | `String` | Required | A description that will be attached to the refund | String getMemo() | setMemo(String memo) |
| `PaymentId` | `int` | Required | The ID of the payment to be refunded | int getPaymentId() | setPaymentId(int paymentId) |
| `External` | `Boolean` | Optional | Flag that marks refund as external (no money is returned to the customer). Defaults to `false`. | Boolean getExternal() | setExternal(Boolean external) |
| `ApplyCredit` | `Boolean` | Optional | If set to true, creates credit and applies it to an invoice. Defaults to `false`. | Boolean getApplyCredit() | setApplyCredit(Boolean applyCredit) |
| `VoidInvoice` | `Boolean` | Optional | If `apply_credit` set to false and refunding full amount, if `void_invoice` set to true, invoice will be voided after refund. Defaults to `false`. | Boolean getVoidInvoice() | setVoidInvoice(Boolean voidInvoice) |

## Example (as JSON)

```json
{
  "amount": "amount8",
  "memo": "memo0",
  "payment_id": 0,
  "external": false,
  "apply_credit": false,
  "void_invoice": false
}
```

