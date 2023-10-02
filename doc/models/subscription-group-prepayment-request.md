
# Subscription Group Prepayment Request

## Structure

`SubscriptionGroupPrepaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayment` | [`SubscriptionGroupPrepayment`](../../doc/models/subscription-group-prepayment.md) | Required | - | SubscriptionGroupPrepayment getPrepayment() | setPrepayment(SubscriptionGroupPrepayment prepayment) |

## Example (as JSON)

```json
{
  "prepayment": {
    "amount": 136,
    "details": "details8",
    "memo": "memo2",
    "method": "paypal_account"
  }
}
```

