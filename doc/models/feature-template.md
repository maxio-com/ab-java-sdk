
# Feature Template

A feature that can be granted to subscribers, defined once at the site level and then attached to products or components.

## Structure

`FeatureTemplate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The Advanced Billing id of the feature template. | Integer getId() | setId(Integer id) |
| `Key` | `String` | Optional | A unique, lowercase, underscore-separated identifier for the feature. Immutable once set. | String getKey() | setKey(String key) |
| `Name` | `String` | Optional | The display name of the feature. | String getName() | setName(String name) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Kind` | [`FeatureKind`](../../doc/models/feature-kind.md) | Optional | The behavior of a feature:<br><br>- `access_right`: a boolean entitlement. A subscriber either has access or does not.<br>- `usage_limit`: a quantified allowance measured over a recurring period (for example, "10,000 API calls per month").<br>- `service_right`: a free-form value (text, boolean, or number) that isn't a simple access flag or a metered limit. | FeatureKind getKind() | setKind(FeatureKind kind) |
| `Unit` | `String` | Optional | The unit the feature is measured in (for example, `requests` or `GB`). Required when `kind` is `usage_limit`. | String getUnit() | setUnit(String unit) |
| `ValueType` | [`FeatureValueType`](../../doc/models/feature-value-type.md) | Optional | The data type of a feature's value. For `access_right` features this is always `boolean`, and for `usage_limit` features this is always `numeric`. For `service_right` features, you choose the value type explicitly. | FeatureValueType getValueType() | setValueType(FeatureValueType valueType) |
| `DefaultValue` | `String` | Optional | A default value used to pre-populate new feature catalog items created from this template. | String getDefaultValue() | setDefaultValue(String defaultValue) |
| `DefaultPeriodicityInterval` | `Integer` | Optional | For `usage_limit` features, the default periodicity interval used to pre-populate new feature catalog items. Always `null` for other kinds. | Integer getDefaultPeriodicityInterval() | setDefaultPeriodicityInterval(Integer defaultPeriodicityInterval) |
| `DefaultPeriodicityUnit` | [`EntitlementPeriodicityUnit`](../../doc/models/entitlement-periodicity-unit.md) | Optional | For `usage_limit` features, the default periodicity unit used to pre-populate new feature catalog items. Always `null` for other kinds. | EntitlementPeriodicityUnit getDefaultPeriodicityUnit() | setDefaultPeriodicityUnit(EntitlementPeriodicityUnit defaultPeriodicityUnit) |
| `ArchivedAt` | `ZonedDateTime` | Optional | The date and time the feature template was archived, or `null` if it is active. | ZonedDateTime getArchivedAt() | setArchivedAt(ZonedDateTime archivedAt) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |
| `ProductsCount` | `Integer` | Optional | The number of **components** this feature template is currently attached to via an active feature catalog item. Despite the name, this counts components, not products. In the Advanced Billing UI, components are labeled "Products." | Integer getProductsCount() | setProductsCount(Integer productsCount) |
| `PlansCount` | `Integer` | Optional | The number of **products** this feature template is currently attached to via an active feature catalog item. Despite the name, this counts products, not plans. In the Advanced Billing UI, products are labeled "Plans." | Integer getPlansCount() | setPlansCount(Integer plansCount) |

## Example

```java
import com.maxio.advancedbilling.models.FeatureKind;
import com.maxio.advancedbilling.models.FeatureTemplate;

FeatureTemplate featureTemplate = new FeatureTemplate.Builder()
    .id(164)
    .key("sso")
    .name("Single Sign-On")
    .description("description6")
    .kind(FeatureKind.SERVICE_RIGHT)
    .build();
```

