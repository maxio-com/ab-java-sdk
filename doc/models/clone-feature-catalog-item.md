
# Clone Feature Catalog Item

A feature to put on the cloned price point. Requires Entitlements to be enabled for the site; ignored otherwise.

Unlike Create Feature Catalog Item, nothing falls back to the feature template's defaults: send `value`, and for a `usage_limit` feature its periodicity (and any grant expiration) explicitly. If any item can't be applied, for example a missing `value`, a `usage_limit` item without periodicity, or an archived or unknown feature template, the whole clone fails with `422` and nothing is created.

## Structure

`CloneFeatureCatalogItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FeatureTemplateId` | `int` | Required | - | int getFeatureTemplateId() | setFeatureTemplateId(int featureTemplateId) |
| `Value` | `String` | Required | - | String getValue() | setValue(String value) |
| `PeriodicityInterval` | `Integer` | Optional | Required for `usage_limit` features; must be omitted for other kinds. | Integer getPeriodicityInterval() | setPeriodicityInterval(Integer periodicityInterval) |
| `PeriodicityUnit` | [`EntitlementPeriodicityUnit`](../../doc/models/entitlement-periodicity-unit.md) | Optional | Required for `usage_limit` features; must be omitted for other kinds. | EntitlementPeriodicityUnit getPeriodicityUnit() | setPeriodicityUnit(EntitlementPeriodicityUnit periodicityUnit) |
| `GrantExpirationInterval` | `Integer` | Optional | `usage_limit` features only. A positive number of `grant_expiration_unit`s; required with `day` or `month`, and must be omitted with `until_next_refill`. | Integer getGrantExpirationInterval() | setGrantExpirationInterval(Integer grantExpirationInterval) |
| `GrantExpirationUnit` | [`GrantExpirationUnit`](../../doc/models/grant-expiration-unit.md) | Optional | `usage_limit` features only. | GrantExpirationUnit getGrantExpirationUnit() | setGrantExpirationUnit(GrantExpirationUnit grantExpirationUnit) |

## Example

```java
import com.maxio.advancedbilling.models.CloneFeatureCatalogItem;
import com.maxio.advancedbilling.models.EntitlementPeriodicityUnit;
import com.maxio.advancedbilling.models.GrantExpirationUnit;

CloneFeatureCatalogItem cloneFeatureCatalogItem = new CloneFeatureCatalogItem.Builder(
    212,
    "value6"
)
.periodicityInterval(84)
.periodicityUnit(EntitlementPeriodicityUnit.WEEK)
.grantExpirationInterval(8)
.grantExpirationUnit(GrantExpirationUnit.UNTIL_NEXT_REFILL)
.build();
```

