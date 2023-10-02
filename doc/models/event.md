
# Event

## Structure

`Event`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `double` | Required | - | double getId() | setId(double id) |
| `Key` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getKey() | setKey(String key) |
| `Message` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getMessage() | setMessage(String message) |
| `SubscriptionId` | `double` | Required | - | double getSubscriptionId() | setSubscriptionId(double subscriptionId) |
| `CreatedAt` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getCreatedAt() | setCreatedAt(String createdAt) |
| `EventSpecificData` | [`EventEventSpecificData`](../../doc/models/containers/event-event-specific-data.md) | Required | This is a container for one-of cases. | EventEventSpecificData getEventSpecificData() | setEventSpecificData(EventEventSpecificData eventSpecificData) |

## Example (as JSON)

```json
{
  "id": 159.12,
  "key": "key2",
  "message": "message8",
  "subscription_id": 185.82,
  "created_at": "created_at0",
  "event_specific_data": {
    "previous_subscription_state": "previous_subscription_state4",
    "new_subscription_state": "new_subscription_state8"
  }
}
```

