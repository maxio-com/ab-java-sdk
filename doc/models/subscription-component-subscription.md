
# Subscription Component Subscription

An optional object, will be returned if provided `include=subscription` query param.

## Structure

`SubscriptionComponentSubscription`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | `Object` | Optional | - | Object getState() | setState(Object state) |
| `UpdatedAt` | `String` | Optional | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |

## Example (as JSON)

```json
{
  "state": {
    "key1": "val1",
    "key2": "val2"
  },
  "updated_at": "updated_at0"
}
```

