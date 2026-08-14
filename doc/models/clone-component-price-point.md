
# Clone Component Price Point

## Structure

`CloneComponentPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |

## Example

```java
import com.maxio.advancedbilling.models.CloneComponentPricePoint;

CloneComponentPricePoint cloneComponentPricePoint = new CloneComponentPricePoint.Builder(
    "name4"
)
.handle("handle0")
.build();
```

