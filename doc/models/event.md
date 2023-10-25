
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
| `CustomerId` | `double` | Required | - | double getCustomerId() | setCustomerId(double customerId) |
| `CreatedAt` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getCreatedAt() | setCreatedAt(String createdAt) |
| `EventSpecificData` | [`EventEventSpecificData`](../../doc/models/containers/event-event-specific-data.md) | Required | This is a container for one-of cases. | EventEventSpecificData getEventSpecificData() | setEventSpecificData(EventEventSpecificData eventSpecificData) |

## Example (as JSON)

```json
{
  "id": 159.12,
  "key": "key2",
  "message": "message8",
  "subscription_id": 185.82,
  "customer_id": 31.5,
  "created_at": "created_at0",
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

