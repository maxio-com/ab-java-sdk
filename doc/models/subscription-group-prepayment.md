
# Subscription Group Prepayment

## Structure

`SubscriptionGroupPrepayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | - | int getAmount() | setAmount(int amount) |
| `Details` | `String` | Required | - | String getDetails() | setDetails(String details) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |
| `Method` | [`SubscriptionGroupPrepaymentMethodEnum`](../../doc/models/subscription-group-prepayment-method-enum.md) | Required | - | SubscriptionGroupPrepaymentMethodEnum getMethod() | setMethod(SubscriptionGroupPrepaymentMethodEnum method) |

## Example (as JSON)

```json
{
  "amount": 96,
  "details": "details2",
  "memo": "memo6",
  "method": "money_order"
}
```

