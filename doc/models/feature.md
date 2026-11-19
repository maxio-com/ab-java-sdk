
# Feature

## Structure

`Feature`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | `String` | Required | A unique, lowercase, underscore-separated identifier for the feature. Immutable once set. | String getKey() | setKey(String key) |
| `Name` | `String` | Required | The display name of the feature. | String getName() | setName(String name) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Kind` | [`FeatureKind`](../../doc/models/feature-kind.md) | Required | The behavior of a feature:<br><br>- `access_right`: a boolean entitlement. A subscriber either has access or does not.<br>- `usage_limit`: a quantified allowance measured over a recurring period (for example, "10,000 API calls per month").<br>- `service_right`: a free-form value (text, boolean, or number) that isn't a simple access flag or a metered limit. | FeatureKind getKind() | setKind(FeatureKind kind) |
| `Unit` | `String` | Optional | Required when `kind` is `usage_limit`. | String getUnit() | setUnit(String unit) |
| `ValueType` | [`FeatureValueType`](../../doc/models/feature-value-type.md) | Optional | Required when `kind` is `service_right`. Ignored for other kinds, where it is inferred automatically. | FeatureValueType getValueType() | setValueType(FeatureValueType valueType) |
| `DefaultValue` | `String` | Optional | - | String getDefaultValue() | setDefaultValue(String defaultValue) |
| `DefaultPeriodicityInterval` | `Integer` | Optional | Only valid when `kind` is `usage_limit`. | Integer getDefaultPeriodicityInterval() | setDefaultPeriodicityInterval(Integer defaultPeriodicityInterval) |
| `DefaultPeriodicityUnit` | [`EntitlementPeriodicityUnit`](../../doc/models/entitlement-periodicity-unit.md) | Optional | Only valid when `kind` is `usage_limit`. Must be set together with `default_periodicity_interval`. | EntitlementPeriodicityUnit getDefaultPeriodicityUnit() | setDefaultPeriodicityUnit(EntitlementPeriodicityUnit defaultPeriodicityUnit) |

## Example

```java
import com.maxio.advancedbilling.models.Feature;
import com.maxio.advancedbilling.models.FeatureKind;
import com.maxio.advancedbilling.models.FeatureValueType;

Feature feature = new Feature.Builder(
    "sso",
    "name4",
    FeatureKind.USAGE_LIMIT
)
.description("description4")
.unit("unit2")
.valueType(FeatureValueType.ENUM_BOOLEAN)
.defaultValue("default_value4")
.defaultPeriodicityInterval(150)
.build();
```

