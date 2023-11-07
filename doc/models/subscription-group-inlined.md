
# Subscription Group Inlined

## Structure

`SubscriptionGroupInlined`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | The UID for the group | String getUid() | setUid(String uid) |
| `Scheme` | `String` | Optional | Whether the group is configured to rely on a primary subscription for billing. At this time, it will always be 1. | String getScheme() | setScheme(String scheme) |
| `PrimarySubscriptionId` | `String` | Optional | The subscription ID of the primary within the group. Applicable to scheme 1. | String getPrimarySubscriptionId() | setPrimarySubscriptionId(String primarySubscriptionId) |
| `Primary` | `Boolean` | Optional | A boolean indicating whether the subscription is the primary in the group. Applicable to scheme 1. | Boolean getPrimary() | setPrimary(Boolean primary) |

## Example (as JSON)

```json
{
  "uid": "uid2",
  "scheme": "scheme2",
  "primary_subscription_id": "primary_subscription_id8",
  "primary": false
}
```

