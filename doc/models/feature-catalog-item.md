
# Feature Catalog Item

A feature template attached to a specific product or component (or one of their price points), with a concrete value. When a subscriber signs up for or is assigned this product/component, the feature catalog item is provisioned as an entitlement on their subscription.

## Structure

`FeatureCatalogItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `FeatureTemplateId` | `Integer` | Optional | The id of the feature template this item was created from. | Integer getFeatureTemplateId() | setFeatureTemplateId(Integer featureTemplateId) |
| `FeatureKey` | `String` | Optional | The `key` of the parent feature template. | String getFeatureKey() | setFeatureKey(String featureKey) |
| `FeatureName` | `String` | Optional | The `name` of the parent feature template. | String getFeatureName() | setFeatureName(String featureName) |
| `FeatureKind` | [`FeatureKind`](../../doc/models/feature-kind.md) | Optional | The behavior of a feature:<br><br>- `access_right`: a boolean entitlement. A subscriber either has access or does not.<br>- `usage_limit`: a quantified allowance measured over a recurring period (for example, "10,000 API calls per month").<br>- `service_right`: a free-form value (text, boolean, or number) that isn't a simple access flag or a metered limit. | FeatureKind getFeatureKind() | setFeatureKind(FeatureKind featureKind) |
| `Value` | `String` | Optional | The value granted by this feature catalog item. Interpreted according to `feature_kind`: `"true"`/`"false"` for `access_right`, a numeric string for `usage_limit`, or any string for `service_right` (shaped by the feature template's `value_type`). | String getValue() | setValue(String value) |
| `PeriodicityInterval` | `Integer` | Optional | Set when `feature_kind` is `usage_limit`; `null` otherwise. | Integer getPeriodicityInterval() | setPeriodicityInterval(Integer periodicityInterval) |
| `PeriodicityUnit` | [`EntitlementPeriodicityUnit`](../../doc/models/entitlement-periodicity-unit.md) | Optional | Set when `feature_kind` is `usage_limit`; `null` otherwise. | EntitlementPeriodicityUnit getPeriodicityUnit() | setPeriodicityUnit(EntitlementPeriodicityUnit periodicityUnit) |
| `PricePointType` | [`FeatureOwnerPricePointType`](../../doc/models/feature-owner-price-point-type.md) | Optional | `null` when this feature catalog item applies to every price point of its owning product/component. Set when the feature catalog item is an override for one specific price point. | FeatureOwnerPricePointType getPricePointType() | setPricePointType(FeatureOwnerPricePointType pricePointType) |
| `PricePointId` | `Integer` | Optional | Set together with `price_point_type` for price-point-specific overrides. | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `ArchivedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getArchivedAt() | setArchivedAt(ZonedDateTime archivedAt) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |

## Example

```java
import com.maxio.advancedbilling.models.FeatureCatalogItem;
import com.maxio.advancedbilling.models.FeatureKind;

FeatureCatalogItem featureCatalogItem = new FeatureCatalogItem.Builder()
    .id(52)
    .featureTemplateId(42)
    .featureKey("feature_key6")
    .featureName("feature_name0")
    .featureKind(FeatureKind.USAGE_LIMIT)
    .build();
```

