
# Refund

## Structure

`Refund`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `String` | Optional | The amount to be refunded in decimal format as a string. Example: "10.50". Must not exceed the remaining refundable balance of the payment. | String getAmount() | setAmount(String amount) |
| `Memo` | `String` | Optional | A description that will be attached to the refund | String getMemo() | setMemo(String memo) |
| `PaymentId` | `Integer` | Optional | The ID of the payment to be refunded | Integer getPaymentId() | setPaymentId(Integer paymentId) |
| `External` | `Boolean` | Optional | Flag that marks refund as external (no money is returned to the customer). Defaults to `false`. | Boolean getExternal() | setExternal(Boolean external) |
| `ApplyCredit` | `Boolean` | Optional | If set to true, creates credit and applies it to an invoice. Defaults to `false`. | Boolean getApplyCredit() | setApplyCredit(Boolean applyCredit) |
| `VoidInvoice` | `Boolean` | Optional | If `apply_credit` set to false and refunding full amount, if `void_invoice` set to true, invoice will be voided after refund. Defaults to `false`. | Boolean getVoidInvoice() | setVoidInvoice(Boolean voidInvoice) |
| `SegmentUids` | [`RefundSegmentUids`](../../doc/models/containers/refund-segment-uids.md) | Optional | This is a container for one-of cases. | RefundSegmentUids getSegmentUids() | setSegmentUids(RefundSegmentUids segmentUids) |

## Example (as JSON)

```json
{
  "amount": "amount8",
  "memo": "memo0",
  "payment_id": 130,
  "external": false,
  "apply_credit": false
}
```

