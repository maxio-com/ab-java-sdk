
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

## Example

```java
import com.maxio.advancedbilling.models.CustomFieldValueChange;

CustomFieldValueChange customFieldValueChange = new CustomFieldValueChange.Builder(
    "event_type8",
    "metafield_name2",
    138,
    "old_value6",
    "new_value2",
    "resource_type6",
    14
)
.build();
```

