
# List Subscription Group Prepayment

## Structure

`ListSubscriptionGroupPrepayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayment` | [`ListSubcriptionGroupPrepaymentItem`](../../doc/models/list-subcription-group-prepayment-item.md) | Required | - | ListSubcriptionGroupPrepaymentItem getPrepayment() | setPrepayment(ListSubcriptionGroupPrepaymentItem prepayment) |

## Example (as JSON)

```json
{
  "prepayment": {
    "id": 38,
    "subscription_group_uid": "subscription_group_uid2",
    "amount_in_cents": 124,
    "remaining_amount_in_cents": 182,
    "details": "details8"
  }
}
```

