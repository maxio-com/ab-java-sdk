
# Create Metafield

## Structure

`CreateMetafield`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Scope` | [`MetafieldScope`](../../doc/models/metafield-scope.md) | Optional | Warning: When updating a metafield's scope attribute, all scope attributes must be passed. Partially complete scope attributes will override the existing settings. | MetafieldScope getScope() | setScope(MetafieldScope scope) |
| `InputType` | [`MetafieldInput`](../../doc/models/metafield-input.md) | Optional | Indicates the type of metafield. A text metafield allows any string value. Dropdown and radio metafields have a set of values that can be selected. Defaults to 'text'. | MetafieldInput getInputType() | setInputType(MetafieldInput inputType) |
| `Enum` | `List<String>` | Optional | Only applicable when input_type is radio or dropdown. Empty strings will not be submitted. | List<String> getEnum() | setEnum(List<String> mEnum) |

## Example

```java
import com.maxio.advancedbilling.models.CreateMetafield;
import com.maxio.advancedbilling.models.IncludeOption;
import com.maxio.advancedbilling.models.MetafieldInput;
import com.maxio.advancedbilling.models.MetafieldScope;
import java.util.Arrays;

CreateMetafield createMetafield = new CreateMetafield.Builder()
    .name("my_field")
    .scope(new MetafieldScope.Builder()
        .csv(IncludeOption.EXCLUDE)
        .invoices(IncludeOption.EXCLUDE)
        .statements(IncludeOption.EXCLUDE)
        .portal(IncludeOption.EXCLUDE)
        .publicShow(IncludeOption.EXCLUDE)
        .publicEdit(IncludeOption.EXCLUDE)
        .build())
    .inputType(MetafieldInput.TEXT)
    .mEnum(Arrays.asList(
        "string"
    ))
    .build();
```

