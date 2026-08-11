
# Metafield

## Structure

`Metafield`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Scope` | [`MetafieldScope`](../../doc/models/metafield-scope.md) | Optional | Warning: When updating a metafield's scope attribute, all scope attributes must be passed. Partially complete scope attributes will override the existing settings. | MetafieldScope getScope() | setScope(MetafieldScope scope) |
| `DataCount` | `Integer` | Optional | The amount of subscriptions this metafield has been applied to in Advanced Billing. | Integer getDataCount() | setDataCount(Integer dataCount) |
| `InputType` | [`MetafieldInput`](../../doc/models/metafield-input.md) | Optional | Indicates the type of metafield. A text metafield allows any string value. Dropdown and radio metafields have a set of values that can be selected. Defaults to 'text'. | MetafieldInput getInputType() | setInputType(MetafieldInput inputType) |
| `Enum` | [`MetafieldEnum`](../../doc/models/containers/metafield-enum.md) | Optional | This is a container for one-of cases. | MetafieldEnum getEnum() | setEnum(MetafieldEnum mEnum) |

## Example

```java
import com.maxio.advancedbilling.models.IncludeOption;
import com.maxio.advancedbilling.models.Metafield;
import com.maxio.advancedbilling.models.MetafieldInput;
import com.maxio.advancedbilling.models.MetafieldScope;

Metafield metafield = new Metafield.Builder()
    .id(242)
    .name("name4")
    .scope(new MetafieldScope.Builder()
        .csv(IncludeOption.EXCLUDE)
        .invoices(IncludeOption.EXCLUDE)
        .statements(IncludeOption.EXCLUDE)
        .portal(IncludeOption.EXCLUDE)
        .publicShow(IncludeOption.EXCLUDE)
        .build())
    .dataCount(26)
    .inputType(MetafieldInput.BALANCE_TRACKER)
    .build();
```

