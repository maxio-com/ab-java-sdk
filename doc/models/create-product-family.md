
# Create Product Family

## Structure

`CreateProductFamily`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Surcharging` | `Boolean` | Optional | Whether surcharging applies to this product family. Defaults to `true` when omitted. Only applied on sites where surcharging is enabled. | Boolean getSurcharging() | setSurcharging(Boolean surcharging) |

## Example

```java
import com.maxio.advancedbilling.models.CreateProductFamily;

CreateProductFamily createProductFamily = new CreateProductFamily.Builder(
    "name0"
)
.handle("handle6")
.description("description0")
.surcharging(false)
.build();
```

