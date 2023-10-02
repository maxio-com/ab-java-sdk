
# Group Settings

## Structure

`GroupSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Target` | [`GroupTarget`](../../doc/models/group-target.md) | Required | Attributes of the target customer who will be the responsible payer of the created subscription. Required. | GroupTarget getTarget() | setTarget(GroupTarget target) |
| `Billing` | [`GroupBilling`](../../doc/models/group-billing.md) | Optional | Optional attributes related to billing date and accrual. Note: Only applicable for new subscriptions. | GroupBilling getBilling() | setBilling(GroupBilling billing) |

## Example (as JSON)

```json
{
  "target": {
    "type": "parent",
    "id": 236
  },
  "billing": {
    "accrue": false,
    "align_date": false,
    "prorate": false
  }
}
```

