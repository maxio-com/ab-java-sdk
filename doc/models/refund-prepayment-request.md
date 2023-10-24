
# Refund Prepayment Request

## Structure

`RefundPrepaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Refund` | [`RefundPrepayment`](../../doc/models/refund-prepayment.md) | Required | - | RefundPrepayment getRefund() | setRefund(RefundPrepayment refund) |

## Example (as JSON)

```json
{
  "refund": {
    "amount_in_cents": 101.16,
    "amount": "String1",
    "memo": "memo2",
    "external": false
  }
}
```

