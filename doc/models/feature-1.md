
# Feature 1

`key` cannot be changed once set. `kind` cannot be changed once any feature catalog item has been created from this template.

## Structure

`Feature1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Unit` | `String` | Optional | - | String getUnit() | setUnit(String unit) |
| `ValueType` | [`FeatureValueType`](../../doc/models/feature-value-type.md) | Optional | The data type of a feature's value. For `access_right` features this is always `boolean`, and for `usage_limit` features this is always `numeric`. For `service_right` features, you choose the value type explicitly. | FeatureValueType getValueType() | setValueType(FeatureValueType valueType) |
| `DefaultValue` | `String` | Optional | - | String getDefaultValue() | setDefaultValue(String defaultValue) |
| `DefaultPeriodicityInterval` | `Integer` | Optional | - | Integer getDefaultPeriodicityInterval() | setDefaultPeriodicityInterval(Integer defaultPeriodicityInterval) |
| `DefaultPeriodicityUnit` | [`EntitlementPeriodicityUnit`](../../doc/models/entitlement-periodicity-unit.md) | Optional | - | EntitlementPeriodicityUnit getDefaultPeriodicityUnit() | setDefaultPeriodicityUnit(EntitlementPeriodicityUnit defaultPeriodicityUnit) |

## Example

```java
import com.maxio.advancedbilling.models.Feature1;
import com.maxio.advancedbilling.models.FeatureValueType;

Feature1 feature1 = new Feature1.Builder()
    .name("name8")
    .description("description8")
    .unit("unit6")
    .valueType(FeatureValueType.TEXT)
    .defaultValue("default_value8")
    .build();
```

