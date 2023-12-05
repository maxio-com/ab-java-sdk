
# Nested Subscription Group

## Structure

`NestedSubscriptionGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | The UID for the group | String getUid() | setUid(String uid) |
| `Scheme` | `Integer` | Optional | Whether the group is configured to rely on a primary subscription for billing. At this time, it will always be 1. | Integer getScheme() | setScheme(Integer scheme) |
| `PrimarySubscriptionId` | `Integer` | Optional | The subscription ID of the primary within the group. Applicable to scheme 1. | Integer getPrimarySubscriptionId() | setPrimarySubscriptionId(Integer primarySubscriptionId) |
| `Primary` | `Boolean` | Optional | A boolean indicating whether the subscription is the primary in the group. Applicable to scheme 1. | Boolean getPrimary() | setPrimary(Boolean primary) |

## Example (as JSON)

```json
{
  "uid": "uid2",
  "scheme": 62,
  "primary_subscription_id": 10,
  "primary": false
}
```

