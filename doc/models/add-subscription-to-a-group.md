
# Add Subscription to a Group

## Structure

`AddSubscriptionToAGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Group` | [`AddSubscriptionToAGroupGroup`](../../doc/models/containers/add-subscription-to-a-group-group.md) | Optional | This is a container for one-of cases. | AddSubscriptionToAGroupGroup getGroup() | setGroup(AddSubscriptionToAGroupGroup group) |

## Example (as JSON)

```json
{
  "group": {
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
}
```

