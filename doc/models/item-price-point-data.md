
# Item Price Point Data

## Structure

`ItemPricePointData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |

## Example

```java
import com.maxio.advancedbilling.models.ItemPricePointData;

ItemPricePointData itemPricePointData = new ItemPricePointData.Builder()
    .id(80)
    .handle("handle8")
    .name("name2")
    .build();
```

