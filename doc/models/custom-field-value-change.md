
# Custom Field Value Change

## Structure

`CustomFieldValueChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EventType` | `String` | Required | - | String getEventType() | setEventType(String eventType) |
| `MetafieldName` | `String` | Required | - | String getMetafieldName() | setMetafieldName(String metafieldName) |
| `MetafieldId` | `int` | Required | - | int getMetafieldId() | setMetafieldId(int metafieldId) |
| `OldValue` | `String` | Required | - | String getOldValue() | setOldValue(String oldValue) |
| `NewValue` | `String` | Required | - | String getNewValue() | setNewValue(String newValue) |
| `ResourceType` | `String` | Required | - | String getResourceType() | setResourceType(String resourceType) |
| `ResourceId` | `int` | Required | - | int getResourceId() | setResourceId(int resourceId) |

## Example (as JSON)

```json
{
  "event_type": "event_type2",
  "metafield_name": "metafield_name6",
  "metafield_id": 78,
  "old_value": "old_value2",
  "new_value": "new_value8",
  "resource_type": "resource_type2",
  "resource_id": 74
}
```

