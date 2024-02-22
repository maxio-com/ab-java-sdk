
# Event

## Structure

`Event`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Key` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getKey() | setKey(String key) |
| `Message` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getMessage() | setMessage(String message) |
| `SubscriptionId` | `Integer` | Required | - | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `CustomerId` | `Integer` | Required | - | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `CreatedAt` | `ZonedDateTime` | Required | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `EventSpecificData` | [`EventEventSpecificData`](../../doc/models/containers/event-event-specific-data.md) | Required | This is a container for one-of cases. | EventEventSpecificData getEventSpecificData() | setEventSpecificData(EventEventSpecificData eventSpecificData) |

## Example (as JSON)

```json
{
  "id": 40,
  "key": "key2",
  "message": "message8",
  "subscription_id": 150,
  "customer_id": 78,
  "created_at": "2016-03-13T12:52:32.123Z",
  "event_specific_data": {
    "previous_unit_balance": null,
    "previous_overage_unit_balance": null,
    "new_unit_balance": null,
    "new_overage_unit_balance": null,
    "usage_quantity": null,
    "overage_usage_quantity": null,
    "component_id": null,
    "component_handle": null,
    "memo": null,
    "allocation_details": [
      null
    ],
    "previous_product_id": 126,
    "new_product_id": 12
  }
}
```

