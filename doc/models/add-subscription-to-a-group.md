
# Add Subscription to a Group

## Structure

`AddSubscriptionToAGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Group` | [`GroupSettings`](../../doc/models/group-settings.md) | Optional | - | GroupSettings getGroup() | setGroup(GroupSettings group) |

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

