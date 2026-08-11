
# Component Allocation Error Item

## Structure

`ComponentAllocationErrorItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `Message` | `String` | Optional | - | String getMessage() | setMessage(String message) |
| `Kind` | `String` | Optional | - | String getKind() | setKind(String kind) |
| `On` | `String` | Optional | - | String getOn() | setOn(String on) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentAllocationErrorItem;

ComponentAllocationErrorItem componentAllocationErrorItem = new ComponentAllocationErrorItem.Builder()
    .componentId(122)
    .message("message8")
    .kind("kind6")
    .on("on8")
    .build();
```

